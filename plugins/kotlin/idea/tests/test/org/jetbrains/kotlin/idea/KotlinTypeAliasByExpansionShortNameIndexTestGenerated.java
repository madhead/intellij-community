/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/typealiasExpansionIndex")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinTypeAliasByExpansionShortNameIndexTestGenerated extends AbstractKotlinTypeAliasByExpansionShortNameIndexTest {
    public void testAllFilesPresentInTypealiasExpansionIndex() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/typealiasExpansionIndex"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("functionalTypes.kt")
    public void testFunctionalTypes() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/typealiasExpansionIndex/functionalTypes.kt");
        doTest(fileName);
    }

    @TestMetadata("generics.kt")
    public void testGenerics() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/typealiasExpansionIndex/generics.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleType.kt")
    public void testSimpleType() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/testData/typealiasExpansionIndex/simpleType.kt");
        doTest(fileName);
    }
}
