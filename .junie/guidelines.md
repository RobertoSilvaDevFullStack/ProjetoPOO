Project Guidelines for ProjetoPOO

Scope and Audience
- Audience: Advanced Java developers maintaining a small, IDE-centric Java console project without a build tool.
- Purpose: Capture exact, project-specific build/run/test practices verified on Windows/PowerShell, and note pitfalls observed in this repo.

Repository Layout
- src\: Java sources. Multiple independent console entry points (each class has its own main).
- out\production\ProjetoPOO\: IntelliJ IDEA default output directory (already contains compiled classes).
- ProjetoPOO.iml: IntelliJ module file; project was likely created in IDEA without Maven/Gradle.

Java Version and Encoding Notes
- Verified javac/java execution with a standard JDK on Windows. No explicit toolchain defined.
- Console output includes Portuguese strings with diacritics. Windows console may show mojibake unless UTF-8 is enforced.
  - Prefer launching java with: java -Dfile.encoding=UTF-8 -cp ... MainClass
  - Or set terminal to UTF-8 in PowerShell before running: chcp 65001 | Out-Null
  - Alternatively, avoid accents in console output during debugging to reduce noise.

Build/Run Instructions (without build tool)
Option A — Compile a single class and run
- Compile to a temporary/bin directory:
  - javac -d .junie\tmpbin -cp src src\PE.Aritmetico.java
  - java -cp .junie\tmpbin PE.Aritmetico
- Use this pattern for any class with a main method.

Option B — Compile everything (caveat)
- WARNING: src\PE.CalculadoraSwitchCase.java contains an import that does not resolve in standard JDKs:
  - import java.lang.classfile.instruction.SwitchCase; // not used and not part of Java SE
  - This will cause javac to fail if compiling all sources. Solutions:
    1) Remove the import line from PE.CalculadoraSwitchCase.java, or
    2) Compile selectively (exclude that file), or
    3) Use the IDE (which may have compiled earlier state) and run other classes.
- If the import is removed, you can compile all sources to the IDEA output folder:
  - javac -d out\production\ProjetoPOO -cp src src\*.java

Running classes that read from stdin
- Many classes (e.g., PE.Calculadora, PE.NotaAluno) prompt for input via Scanner(System.in).
- In PowerShell you can pipe prepared input including newlines using the backtick escape (`n):
  - $in = "10`n20`n1"  # num1=10, num2=20, operacao=1 (adição)
  - $in | java -cp out\production\ProjetoPOO PE.Calculadora
- For UTF-8 output, prefer:
  - $in | java -Dfile.encoding=UTF-8 -cp out\production\ProjetoPOO PE.Calculadora

Testing Information
There is no testing framework configured. Two pragmatic approaches are suggested:

1) Ad-hoc executable tests (no dependencies)
- Create a small class with a main that performs computations and exits non-zero on failure. Pattern used and verified locally:

  // File: src\TesteAritmetico.java
  public class TesteAritmetico {
      public static void main(String[] args) {
          float a = 20f, b = 70f;
          int failures = 0;
          failures += assertClose("soma", a + b, 90.0, 1e-6);
          failures += assertClose("subtracao", a - b, -50.0, 1e-6);
          failures += assertClose("multiplicacao", a * b, 1400.0, 1e-6);
          failures += assertClose("divisao", a / b, 20.0/70.0, 1e-6);
          if (failures > 0) System.exit(1);
          System.out.println("[TEST] All assertions passed.");
      }
      static int assertClose(String label, double actual, double expected, double tol) {
          if (Math.abs(actual - expected) > tol) {
              System.err.println("Assertion failed for " + label + ": expected " + expected + ", got " + actual);
              return 1;
          }
          return 0;
      }
  }

- Compile and run (commands verified):
  - javac -d .junie\tmpbin -cp src src\TesteAritmetico.java
  - java -cp .junie\tmpbin TesteAritmetico
- Expected output: [TEST] All assertions passed.
- Cleanup: remove src\TesteAritmetico.java and delete the temporary bin directory after running.

2) Adding JUnit (optional, if you decide to introduce a test framework)
- Since there is no build tool, you would need to manually download JUnit (e.g., junit-jupiter-api and engine jars) or migrate to Gradle/Maven.
- Recommended: If tests will grow, add Gradle with JUnit 5 for reproducible builds. Sample minimal Gradle init:
  - gradle init --type java-application
  - Move src under standard src/main/java, tests under src/test/java, and update package names accordingly.
- This change is intrusive; coordinate with maintainers before converting the layout.

Style and Development Notes
- Language/UX: Console messages are in Portuguese; retain tone and accenting. Mind Windows console encoding issues.
- Numeric output formatting:
  - For human-readable output, the code uses String.format("%.2f", value). Prefer formatting at presentation boundaries, not for logic.
  - When comparing doubles in tests, use tolerances (see assertClose above) rather than direct equality.
- Input handling with Scanner:
  - Always validate inputs when evolving code (handle non-numeric input gracefully, guard division by zero as seen in PE.Calculadora and PE.CalculadoraSwitchCase).
  - Close scanners or rely on one process-wide Scanner if you start sharing it across classes.
- Class design:
  - Each class is a standalone program. If you start sharing logic, consider extracting pure functions into utility classes without I/O for better testability.
- Known source issue:
  - PE.CalculadoraSwitchCase.java has an extraneous import (java.lang.classfile.instruction.SwitchCase) not needed and not available in Java SE; remove it if you need to compile that source.

Reproducible Example Commands (validated on Windows/PowerShell)
- Compile and run a simple class:
  - javac -d .junie\tmpbin -cp src src\PE.Aritmetico.java
  - java -cp .junie\tmpbin PE.Aritmetico
- Run a class that requires stdin (addition: 10 + 20):
  - $in = "10`n20`n1"; $in | java -Dfile.encoding=UTF-8 -cp out\production\ProjetoPOO PE.Calculadora
- Ad-hoc test (create file as above), then:
  - javac -d .junie\tmpbin -cp src src\TesteAritmetico.java
  - java -cp .junie\tmpbin TesteAritmetico  # should print: [TEST] All assertions passed.

Maintenance Checklist
- If compiling everything fails, review recent changes for JDK-incompatible imports or IDE-added references.
- Keep output directories consistent (prefer a dedicated bin or the existing out\production\ProjetoPOO used by IDEA).
- Consider introducing a proper build tool (Gradle/Maven) if the project grows or needs CI.
