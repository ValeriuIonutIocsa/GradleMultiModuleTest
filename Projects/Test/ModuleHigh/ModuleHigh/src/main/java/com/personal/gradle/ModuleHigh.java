package com.personal.gradle;

import org.apache.commons.lang3.StringUtils;

final class ModuleHigh {

	private ModuleHigh() {
	}

	public static String appendModuleHigh(
			final String input) {

		final String output = ModuleMid.appendModuleMid(input) + "_ModuleHigh";
		return StringUtils.capitalize(output);
	}
}
