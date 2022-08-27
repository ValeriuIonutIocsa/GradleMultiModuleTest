@echo off

echo(
call ./gradlew clean --console=plain

echo(
call ./gradlew :ModuleLow:test --console=plain ^
--tests com.personal.gradle.ModuleLowTest.testAppendModuleLowOther

echo(
call ./gradlew :ModuleMid:test --console=plain ^
--tests com.personal.gradle.ModuleMidTest.testAppendModuleMid ^
--tests com.personal.gradle.ModuleMidTest.testAppendModuleMidOther  

echo(
call ./gradlew :ModuleHigh:test --console=plain ^
--tests com.personal.gradle.ModuleHighTest.testAppendModuleHigh

echo(
call ./gradlew :testAggregateTestReport -Dskip.tests=true --console=plain
