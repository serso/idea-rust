package org.solovyev.idea.rust;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public final class RustLanguage extends Language {

	@NotNull
	public static final String ID = "rust";

	@NotNull
	public static final RustLanguage INSTANCE = new RustLanguage();

	private RustLanguage() {
		super(ID);
	}
}
