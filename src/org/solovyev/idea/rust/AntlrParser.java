package org.solovyev.idea.rust;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

class AntlrParser implements PsiParser {
	@NotNull
	private final RustParser parser;

	public AntlrParser(@NotNull RustParser parser) {
		this.parser = parser;
	}

	@NotNull
	@Override
	public ASTNode parse(IElementType root, PsiBuilder builder) {
		return null;
	}
}
