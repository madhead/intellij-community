/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.imports;

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
public class JsOptimizeImportsTestGenerated extends AbstractJsOptimizeImportsTest {
    @TestMetadata("idea/testData/editor/optimizeImports/js")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Js extends AbstractJsOptimizeImportsTest {
        public void testAllFilesPresentInJs() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/editor/optimizeImports/js"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("DefaultJsImports.kt")
        public void testDefaultJsImports() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/js/DefaultJsImports.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/editor/optimizeImports/common")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Common extends AbstractJsOptimizeImportsTest {
        public void testAllFilesPresentInCommon() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/editor/optimizeImports/common"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("ArrayAccessExpression.kt")
        public void testArrayAccessExpression() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/ArrayAccessExpression.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassMemberImported.kt")
        public void testClassMemberImported() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/ClassMemberImported.kt");
            doTest(fileName);
        }

        @TestMetadata("ComponentFunction.kt")
        public void testComponentFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/ComponentFunction.kt");
            doTest(fileName);
        }

        @TestMetadata("CurrentPackage.kt")
        public void testCurrentPackage() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/CurrentPackage.kt");
            doTest(fileName);
        }

        @TestMetadata("DefaultObjectReference.kt")
        public void testDefaultObjectReference() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/DefaultObjectReference.kt");
            doTest(fileName);
        }

        @TestMetadata("Enums.kt")
        public void testEnums() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/Enums.kt");
            doTest(fileName);
        }

        @TestMetadata("ExtensionFunctionalTypeValFromCompanionObject.kt")
        public void testExtensionFunctionalTypeValFromCompanionObject() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/ExtensionFunctionalTypeValFromCompanionObject.kt");
            doTest(fileName);
        }

        @TestMetadata("ExtensionFunctionalTypeValFromCompanionObjectCallOnCompanion.kt")
        public void testExtensionFunctionalTypeValFromCompanionObjectCallOnCompanion() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/ExtensionFunctionalTypeValFromCompanionObjectCallOnCompanion.kt");
            doTest(fileName);
        }

        @TestMetadata("ExtensionFunctionalTypeValFromCompanionObjectNonExtCall.kt")
        public void testExtensionFunctionalTypeValFromCompanionObjectNonExtCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/ExtensionFunctionalTypeValFromCompanionObjectNonExtCall.kt");
            doTest(fileName);
        }

        @TestMetadata("InvokeFunction.kt")
        public void testInvokeFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/InvokeFunction.kt");
            doTest(fileName);
        }

        @TestMetadata("IteratorFunction.kt")
        public void testIteratorFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/IteratorFunction.kt");
            doTest(fileName);
        }

        @TestMetadata("KT11640.kt")
        public void testKT11640() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/KT11640.kt");
            doTest(fileName);
        }

        @TestMetadata("KT11640_1.kt")
        public void testKT11640_1() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/KT11640_1.kt");
            doTest(fileName);
        }

        @TestMetadata("KT13689.kt")
        public void testKT13689() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/KT13689.kt");
            doTest(fileName);
        }

        @TestMetadata("KT9875.kt")
        public void testKT9875() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/KT9875.kt");
            doTest(fileName);
        }

        @TestMetadata("KeywordNames.kt")
        public void testKeywordNames() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/KeywordNames.kt");
            doTest(fileName);
        }

        @TestMetadata("Kt2488EnumEntry.kt")
        public void testKt2488EnumEntry() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/Kt2488EnumEntry.kt");
            doTest(fileName);
        }

        @TestMetadata("Kt2709.kt")
        public void testKt2709() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/Kt2709.kt");
            doTest(fileName);
        }

        @TestMetadata("MemberImports.kt")
        public void testMemberImports() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/MemberImports.kt");
            doTest(fileName);
        }

        @TestMetadata("MembersInScope.kt")
        public void testMembersInScope() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/MembersInScope.kt");
            doTest(fileName);
        }

        @TestMetadata("NestedClassReferenceOutsideClassBody.kt")
        public void testNestedClassReferenceOutsideClassBody() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/NestedClassReferenceOutsideClassBody.kt");
            doTest(fileName);
        }

        @TestMetadata("Overloads.kt")
        public void testOverloads() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/Overloads.kt");
            doTest(fileName);
        }

        @TestMetadata("TwoConstructors.kt")
        public void testTwoConstructors() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/TwoConstructors.kt");
            doTest(fileName);
        }

        @TestMetadata("TypeAliasUsage.kt")
        public void testTypeAliasUsage() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/common/TypeAliasUsage.kt");
            doTest(fileName);
        }
    }
}
