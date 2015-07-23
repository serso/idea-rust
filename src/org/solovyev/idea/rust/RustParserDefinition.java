package org.solovyev.idea.rust;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class RustParserDefinition implements ParserDefinition {
	public static final TokenSet WHITE_SPACES = TokenSet.create(RustTypes.get(RustLexer.WS));
	public static final TokenSet COMMENTS = TokenSet.create(RustTypes.get(RustLexer.INNER_DOC_COMMENT), RustTypes.get(RustLexer.OTHER_BLOCK_COMMENT), RustTypes.get(RustLexer.OTHER_LINE_COMMENT), RustTypes.get(RustLexer.OUTER_DOC_COMMENT));

	@NotNull
	private static final IFileElementType FILE = new IFileElementType(RustLanguage.INSTANCE);

	@NotNull
	@Override
	public Lexer createLexer(Project project) {
		return new AntlrLexer(new RustLexer(null));
	}

	@Override
	public PsiParser createParser(Project project) {
		return new AntlrParser(new RustParser(null));
	}

	@Override
	public IFileElementType getFileNodeType() {
		return FILE;
	}

	@NotNull
	@Override
	public TokenSet getWhitespaceTokens() {
		return WHITE_SPACES;
	}

	@NotNull
	@Override
	public TokenSet getCommentTokens() {
		return COMMENTS;
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
