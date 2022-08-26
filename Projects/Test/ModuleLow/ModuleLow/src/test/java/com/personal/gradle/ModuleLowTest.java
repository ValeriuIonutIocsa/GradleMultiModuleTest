package com.personal.gradle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

class ModuleLowTest {

	@Test
	void testAppendModuleLow() {

		final String initialString = GradleMultiModuleTestUtils.createInitialString();
		final String output = ModuleLow.appendModuleLow(initialString);

		System.out.println();
		System.out.println(output);

		Assertions.assertFalse(StringUtils.isBlank(output));
	}

	@Test
	void testAppendModuleLowOther() {

		final String otherInitialString = GradleMultiModuleTestUtils.createOtherInitialString();
		final String output = ModuleLow.appendModuleLow(otherInitialString);

		System.out.println();
		System.out.println(output);

		Assertions.assertFalse(StringUtils.isBlank(output));
	}
}
