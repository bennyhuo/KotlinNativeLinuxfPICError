# KotlinNativeLinuxfPICError

To reproduce issue here: https://youtrack.jetbrains.com/issue/KT-43502. I use 1.4.10 here, but same error with Kotlin 1.4.20. 

Simply run: 

```
./gradlew :linkTestDebugSharedLinuxX64
```

Then we will get a build error: 

```
16:56:58: Executing task 'linkTestLinuxX64'...


> Configure project :
Kotlin Multiplatform Projects are an Alpha feature. See: https://kotlinlang.org/docs/reference/evolution/components-stability.html. To hide this message, add 'kotlin.mpp.stability.nowarn=true' to the Gradle properties.


> Task :compileKotlinLinuxX64 UP-TO-DATE

> Task :linkTestDebugSharedLinuxX64
Produced library API in libtest_api.h
e: /Users/benny/.konan/dependencies/clang-llvm-apple-8.0.0-darwin-macos/bin/ld.lld invocation reported errors

The /Users/benny/.konan/dependencies/clang-llvm-apple-8.0.0-darwin-macos/bin/ld.lld command returned non-zero exit code: 1.
output:
ld.lld: error: relocation R_X86_64_PC32 cannot be used against symbol std::ios_base::Init::~Init(); recompile with -fPIC
>>> defined in /Users/benny/.konan/dependencies/target-gcc-toolchain-3-linux-x86-64/x86_64-unknown-linux-gnu/sysroot/../lib64/libstdc++.a(ios_init.o)
>>> referenced by out
>>>               /var/folders/6v/mxhh7j156wg_prysyt_pz26h0000gq/T/konan_temp8387924798478546294/result.o:(__cxx_global_var_init)

> Task :linkTestDebugSharedLinuxX64 FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':linkTestDebugSharedLinuxX64'.
> Compilation finished with errors

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 7s
2 actionable tasks: 1 executed, 1 up-to-date
16:57:07: Task execution finished 'linkTestLinuxX64'.
```


