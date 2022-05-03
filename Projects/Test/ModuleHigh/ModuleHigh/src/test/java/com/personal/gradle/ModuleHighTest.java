package com.personal.gradle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

class ModuleHighTest {

	@Test
	void appendModuleHigh() {

		final String initialString = GradleMultiModuleTestUtils.createInitialString();
		final String output = ModuleHigh.appendModuleHigh(initialString);
		Assertions.assertFalse(StringUtils.isBlank(output));

		System.out.println();
		System.out.println(output);
	}
}
