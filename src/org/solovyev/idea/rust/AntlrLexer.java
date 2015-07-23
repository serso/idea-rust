package org.solovyev.idea.rust;

import com.intellij.lexer.LexerBase;
import com.intellij.psi.tree.IElementType;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class AntlrLexer extends LexerBase {

	private final RustLexer lexer;
	@Nullable
	private Input input;
	@Nullable
	private IElementType tokenType;
	private int state;

	AntlrLexer(@NotNull RustLexer lexer) {
		this.lexer = lexer;
	}

	@Override
	public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState) {
		this.input = new Input(buffer, startOffset, endOffset);
		this.lexer.setInputStream(new ANTLRInputStream(buffer.subSequence(startOffset, endOffset).toString()));
		this.lexer.setState(initialState);
		tokenType = null;
		state = 0;
	}

	@Override
	public int getState() {
		checkToken();
		return state;
	}

	private void locateToken() {
		if (tokenType != null) {
			return;
		}
		final Token prevToken = lexer.getToken();
		if (prevToken != null && prevToken.getType() == RustLexer.EOF) {
			return;
		}

		try {
			state = lexer.getState();
			final Token token = lexer.nextToken();
			final int tokenType = token.getType();
			this.tokenType = tokenType == RustLexer.EOF ? null : RustTypes.get(tokenType);
		} catch (Error e) {
			// add lexer class name to the error
			final Error error = new Error(lexer.getClass().getName() + ": " + e.getMessage());
			error.setStackTrace(e.getStackTrace());
			throw error;
		}
	}

	@Nullable
	@Override
	public IElementType getTokenType() {
		checkToken();
		return tokenType;
	}

	private void checkToken() {
		if (tokenType == null) {
			locateToken();
		}
	}

	@Override
	public int getTokenStart() {
		checkToken();
		return lexer.getToken().getStartIndex();
	}

	@Override
	public int getTokenEnd() {
		checkToken();
		return lexer.getToken().getStopIndex();
	}

	@Override
	public void advance() {
		checkToken();
		tokenType = null;
	}

	@NotNull
	@Override
	public CharSequence getBufferSequence() {
		assert input != null;
		return input.buffer;
	}

	@Override
	public int getBufferEnd() {
		assert input != null;
		return input.end;
	}

	private static class Input {
		@NotNull
		private final CharSequence buffer;
		private final int start;
		private final int end;

		public Input(@NotNull CharSequence buffer, int start, int end) {
			this.buffer = buffer;
			this.start = start;
			this.end = end;
		}
	}
}
