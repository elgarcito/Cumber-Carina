# Cucumber using Carina Framework #

In this repository you are going to find the examples given in 
the test automation course given in TAU university course [Cucumber with Java](https://testautomationu.applitools.com/cucumber-java-tutorial/).
The main difference is that we are going to use carina framework.

The main reason to use cucumber is to add the Behavior Driven Development (BDD) approach
and use the Gherkin language.
## Basic configuration for using with carina ##

### Steps ###
1. You should use the configuration file as usual in carina framework for web testing and also start selenium standalone
2. You must create a new directory in main folder called [Cucumber](src/main/java/com/solvd/carina_cucumber_example/cucumber)
3. You must create a new directory called in test/resources [feature](src/test/resources/features)
4. In [feature](src/test/resources/features) folder you will create the .feature document using Gherkin, as example: 
`Login.feature`.This names **should NOT CONTAIN "_"** for example `login_outline.feature` this should be
`LoginOutline.feature`
5. Then you sould run this and copy the structure of the failed test
6. You must create in [Cucumber](src/main/java/com/solvd/carina_cucumber_example/cucumber) a file
called `Steps.java` or other this is going to be a normal java class, to work with
carina you should implement the `implements IDriverPool, IAbstractTest` it is necessary only `IDriverPool`. In 
this class you should paste the structure copied
7. In each method of the class you should write the test as usual in selenium and carina but
without making asserts.
8. In order to make it work you must create a class in the test folder, for example: `CucumberMyTest.java extends CucumberBaseTest` 
this class should add the following annotation:
```
@CucumberOptions(features = "src/test/resources/features/Login.feature",
        glue = "src/main/java/com/solvd/carina_cucumber_example/cucumber/Steps.java",
        plugin = {"pretty",
                "html:target/cucumber-core-test-report",
                "pretty:target/cucumber-core-test-report.txt",
                "json:target/cucumber-core-test-report.json",
                "junit:target/cucumber-core-test-report.xml"}
)
public class CucumberMyTest extends CucumberBaseTest {}

```
In the first path you should add the address to feature file and in the second 
to the step file
