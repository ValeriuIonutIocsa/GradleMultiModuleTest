package com.personal.gradle;

import java.util.Arrays;

final class AppStartGradleMultiModuleTest {

    private AppStartGradleMultiModuleTest() {
    }

    public static void main(
            final String[] args) {

        System.out.println();
        
        System.out.println("args: " + Arrays.toString(args));

        String initialString = "AppStartInitialString";
        String outputString = ModuleHigh.appendModuleHigh(initialString);        
        System.out.println(outputString);

        System.out.println();
    }
}