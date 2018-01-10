/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.folding;

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
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinFoldingTestGenerated extends AbstractKotlinFoldingTest {
    @TestMetadata("idea/testData/folding/noCollapse")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class NoCollapse extends AbstractKotlinFoldingTest {
        public void testAllFilesPresentInNoCollapse() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/folding/noCollapse"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("class.kt")
        public void testClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/noCollapse/class.kt");
            doTest(fileName);
        }

        @TestMetadata("function.kt")
        public void testFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/noCollapse/function.kt");
            doTest(fileName);
        }

        @TestMetadata("imports.kt")
        public void testImports() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/noCollapse/imports.kt");
            doTest(fileName);
        }

        @TestMetadata("kdocComments.kt")
        public void testKdocComments() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/noCollapse/kdocComments.kt");
            doTest(fileName);
        }

        @TestMetadata("multilineComments.kt")
        public void testMultilineComments() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/noCollapse/multilineComments.kt");
            doTest(fileName);
        }

        @TestMetadata("object.kt")
        public void testObject() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/noCollapse/object.kt");
            doTest(fileName);
        }

        @TestMetadata("oneImport.kt")
        public void testOneImport() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/noCollapse/oneImport.kt");
            doTest(fileName);
        }

        @TestMetadata("singleLineString.kt")
        public void testSingleLineString() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/noCollapse/singleLineString.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/folding/checkCollapse")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CheckCollapse extends AbstractKotlinFoldingTest {
        public void testAllFilesPresentInCheckCollapse() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/folding/checkCollapse"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("customRegions.kt")
        public void testCustomRegions() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/checkCollapse/customRegions.kt");
            doSettingsFoldingTest(fileName);
        }

        @TestMetadata("customRegionsNotFullBlock.kt")
        public void testCustomRegionsNotFullBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/checkCollapse/customRegionsNotFullBlock.kt");
            doSettingsFoldingTest(fileName);
        }

        @TestMetadata("functionLiteral.kt")
        public void testFunctionLiteral() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/checkCollapse/functionLiteral.kt");
            doSettingsFoldingTest(fileName);
        }

        @TestMetadata("headerKDoc.kt")
        public void testHeaderKDoc() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/checkCollapse/headerKDoc.kt");
            doSettingsFoldingTest(fileName);
        }

        @TestMetadata("headerMultilineComment.kt")
        public void testHeaderMultilineComment() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/checkCollapse/headerMultilineComment.kt");
            doSettingsFoldingTest(fileName);
        }

        @TestMetadata("imports.kt")
        public void testImports() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/checkCollapse/imports.kt");
            doSettingsFoldingTest(fileName);
        }

        @TestMetadata("multilineStrings.kt")
        public void testMultilineStrings() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/checkCollapse/multilineStrings.kt");
            doSettingsFoldingTest(fileName);
        }

        @TestMetadata("primaryConstructor.kt")
        public void testPrimaryConstructor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/folding/checkCollapse/primaryConstructor.kt");
            doSettingsFoldingTest(fileName);
        }
    }
}
