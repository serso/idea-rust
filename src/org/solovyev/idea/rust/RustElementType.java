package org.solovyev.idea.rust;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RustElementType extends IElementType {
	public RustElementType(@NotNull @NonNls String debugName, @Nullable Language language) {
		super(debugName, language);
	}
}
