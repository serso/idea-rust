package org.solovyev.idea.rust;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;

public final class RustFileTypeFactory extends FileTypeFactory {
	@Override
	public void createFileTypes(FileTypeConsumer consumer) {
		consumer.consume(RustFileType.INSTANCE);
	}
}
