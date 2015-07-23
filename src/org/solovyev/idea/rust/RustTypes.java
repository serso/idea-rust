package org.solovyev.idea.rust;

import org.jetbrains.annotations.NotNull;

public class RustTypes {

	private static final RustElementType[] map = new RustElementType[RustLexer.NON_SLASH_OR_WS + 1];

	static {
		for (int tokenType = RustLexer.AS; tokenType < map.length; tokenType++) {
			map[tokenType] = new RustElementType(RustLexer.VOCABULARY.getSymbolicName(tokenType), RustLanguage.INSTANCE);
		}
	}

	@NotNull
	public static RustElementType get(int id) {
		final RustElementType result = map[id];
		assert result != null;
		return result;
	}
}
