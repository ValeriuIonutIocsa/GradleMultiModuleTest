package com.personal.gradle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

class ModuleHighTest {

	@Test
	void testAppendModuleHigh() {

		final String initialString = GradleMultiModuleTestUtils.createInitialString();
		final String output = ModuleHigh.appendModuleHigh(initialString);

		System.out.println();
		System.out.println(output);

		Assertions.assertFalse(StringUtils.isBlank(output));
	}

	@Test
	void testAppendModuleHighOther() {

		final String otherInitialString = GradleMultiModuleTestUtils.createOtherInitialString();
		final String output = ModuleHigh.appendModuleHigh(otherInitialString);

		System.out.println();
		System.out.println(output);

		Assertions.assertFalse(StringUtils.isBlank(output));
	}
}
