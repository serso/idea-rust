package org.solovyev.idea.rust;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.antlr.v4.runtime.CommonTokenStream;
import org.jetbrains.annotations.NotNull;

public class RustParserDefinition implements ParserDefinition {
	@NotNull
	private static final IFileElementType FILE = new IFileElementType(RustLanguage.INSTANCE);

	@NotNull
	private static final RustLexer LEXER = new RustLexer(null);

	@NotNull
	@Override
	public Lexer createLexer(Project project) {
		return new AntlrLexer(LEXER);
	}

	@Override
	public PsiParser createParser(Project project) {
		return new PsiParser() {
			@NotNull
			@Override
			public ASTNode parse(IElementType root, PsiBuilder builder) {
				final RustParser parser = new RustParser(new CommonTokenStream(LEXER));
				return null;
			}
		};
	}

	@Override
	public IFileElementType getFileNodeType() {
		return FILE;
	}

	@NotNull
	@Override
	public TokenSet getWhitespaceTokens() {
		return TokenSet.create(TokenType.WHITE_SPACE);
	}

	@NotNull
	@Override
	public TokenSet getCommentTokens() {
		return TokenSet.create();
	}

	@NotNull
	@Override
	public TokenSet getStringLiteralElements() {
		return TokenSet.EMPTY;
	}

	@NotNull
	@Override
	public PsiElement createElement(ASTNode node) {
		return null;
	}

	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new RustFile(viewProvider);
	}

	@Override
	public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
		return SpaceRequirements.MAY;
	}

}
