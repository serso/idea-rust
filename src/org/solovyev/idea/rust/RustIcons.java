package org.solovyev.idea.rust;

import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class RustIcons {
	@NotNull
	public static final Icon FILE_256 = IconLoader.getIcon("/org/solovyev/idea/rust/icon-256.png");
	@NotNull
	public static final Icon FILE_16 = IconLoader.getIcon("/org/solovyev/idea/rust/icon-16.png");

	private RustIcons() {
	}
}
