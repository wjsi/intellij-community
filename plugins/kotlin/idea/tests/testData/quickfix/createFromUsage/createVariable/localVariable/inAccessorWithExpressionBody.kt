// "Create local variable 'foo'" "true"

class A {
    val t: Int get() = <caret>foo
}
// FUS_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateLocalVariableActionFactory$CreateLocalFromUsageAction