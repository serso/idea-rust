package org.solovyev.idea.rust;

import com.intellij.lang.Language;
import com.intellij.lexer.Lexer;
import com.intellij.lexer.LexerPosition;
import com.intellij.psi.tree.IElementType;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class AntlrLexer extends Lexer {

	@NotNull
	private final RustLexer lexer;
	private Input input;

	AntlrLexer(@NotNull RustLexer lexer) {
		this.lexer = lexer;
	}

	@Override
	public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState) {
		this.input = new Input(buffer, startOffset, endOffset);
		this.lexer.setInputStream(new ANTLRInputStream(buffer.subSequence(startOffset, endOffset).toString()));
		this.lexer.nextToken();
	}

	@Override
	public int getState() {
		return lexer.getState();
	}

	@Nullable
	@Override
	public IElementType getTokenType() {
		final Token token = lexer.getToken();
		if (token == null) {
			return null;
		}
		return new AntlrTokenType("Rust", RustLanguage.INSTANCE);
	}

	@Override
	public int getTokenStart() {
		return lexer.getToken().getStartIndex();
	}

	@Override
	public int getTokenEnd() {
		return lexer.getToken().getStopIndex();
	}

	@Override
	public void advance() {
		lexer.nextToken();
	}

	@NotNull
	@Override
	public LexerPosition getCurrentPosition() {
		return new AntlrLexerPosition(lexer.getCharIndex(), getState());
	}

	@Override
	public void restore(@NotNull LexerPosition position) {

	}

	@NotNull
	@Override
	public CharSequence getBufferSequence() {
		return input.buffer;
	}

	@Override
	public int getBufferEnd() {
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

	private static class AntlrLexerPosition implements LexerPosition {

		private final int offset;
		private final int state;

		public AntlrLexerPosition(int offset, int state) {
			this.offset = offset;
			this.state = state;
		}

		@Override
		public int getOffset() {
			return offset;
		}

		@Override
		public int getState() {
			return state;
		}
	}

	private static class AntlrTokenType extends IElementType {

		public AntlrTokenType(@NotNull String debugName, @Nullable Language language) {
			super(debugName, language);
		}

		protected AntlrTokenType(@NotNull String debugName, @Nullable Language language, boolean register) {
			super(debugName, language, register);
		}
	}
}
