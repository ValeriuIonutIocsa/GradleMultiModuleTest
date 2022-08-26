@echo off

echo(
call ./gradlew.bat clean --console=plain

echo(
call ./gradlew.bat :ModuleLow:test --console=plain ^
--tests com.personal.gradle.ModuleLowTest.testAppendModuleLowOther

echo(
call ./gradlew.bat :ModuleMid:test --console=plain ^
--tests com.personal.gradle.ModuleMidTest.testAppendModuleMid ^
--tests com.personal.gradle.ModuleMidTest.testAppendModuleMidOther  

echo(
call ./gradlew.bat :ModuleHigh:test --console=plain ^
--tests com.personal.gradle.ModuleHighTest.testAppendModuleHigh

echo(
call ./gradlew.bat :testAggregateTestReport -Dskip.tests=true --console=plain
