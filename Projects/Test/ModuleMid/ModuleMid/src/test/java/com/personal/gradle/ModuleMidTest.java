package com.personal.gradle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

class ModuleMidTest {

	@Test
	void testAppendModuleMid() {

		final String initialString = GradleMultiModuleTestUtils.createInitialString();
		final String output = ModuleMid.appendModuleMid(initialString);

		System.out.println();
		System.out.println(output);

		Assertions.assertFalse(StringUtils.isBlank(output));
	}

	@Test
	void testAppendModuleMidOther() {

		final String otherInitialString = GradleMultiModuleTestUtils.createOtherInitialString();
		final String output = ModuleMid.appendModuleMid(otherInitialString);

		System.out.println();
		System.out.println(output);

		Assertions.assertFalse(StringUtils.isBlank(output));
	}
}
