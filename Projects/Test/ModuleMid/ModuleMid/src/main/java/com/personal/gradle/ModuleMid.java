package com.personal.gradle;

final class ModuleMid {

	private ModuleMid() {
	}

	public static String appendModuleMid(
			final String input) {
		return ModuleLow.appendModuleLow(input) + "_ModuleMid";
	}
}
