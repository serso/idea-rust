package org.solovyev.idea.rust;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RustFileType extends LanguageFileType {

	@NotNull
	public static final RustFileType INSTANCE = new RustFileType();

	private RustFileType() {
		super(RustLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "Rust file";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "Rust language file";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return "rs";
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return RustIcons.FILE_16;
	}
}
