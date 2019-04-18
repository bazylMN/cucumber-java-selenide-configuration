# Cucumber-java-selenide-configuration template
#### with Cucumber-java, Selenide library and Selenide Configuration to run browsers:
* ##### chrome
* ##### firefox
* ##### iexplorer

### Prerequisites
* gradle
* Cucumber for Java plugin for IntelliJ
* Gherkin for IntelliJ

### Initial
* clone repository
* open build.gradle file in IDE (IntelliJ)
* import dependencies with gradle

### Customise Cucumber tests
* add your .feature files with scenarios
* create custom steps class / steps classes
* generate steps- in .feature file press 'alt+enter' shortcut and choose 'Create step definition' option, choose created steps class / steps classes to paste steps
* create custom page objects classes with methods
* delete example .feature files, steps classes and page objects classes

### How to run tests:
#### With gradle command:
###### To run Cucumber tests with custom runTests task and with chosen browser, type:
```
-Dselenide.browser=chrome runTests
``` 
```
-Dselenide.browser=firefox runTests
```
```
-Dselenide.browser=ie runTests
```

###### To run Cucumber tests with default browser, type:
```
clean test
```

###### To run Cucumber tests with chosen browser, type:
```
clean -Dselenide.browser=chrome test
```
```
clean -Dselenide.browser=firefox test
```
```
clean -Dselenide.browser=ie test
```

###### To run Cucumber tests with headless mode, type:
```
-Dselenide.browser=chrome -Dselenide.headless=true runTests
```

#### With IDE (JUnit):
```
run CucumberRunner class
```
```
or run .feature file / directory with .feature files / scenario in .feature file
```

#### Reports
Reports are placed in 'target' directory.
To run report in browser, open 'target\html\index.html' file and choose browser.

#### Gradle tests reports
Reports are placed in 'build' directory.
To run report in browser, open 'build/reports/tests/runTests/index.html' file and choose browser.

#### Gradle custom tasks
* runTests
* deleteCucumberReports
