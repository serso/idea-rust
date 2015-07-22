package org.solovyev.idea.rust;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class RustFile extends PsiFileBase {
	protected RustFile(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, RustLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType() {
		return RustFileType.INSTANCE;
	}
}
