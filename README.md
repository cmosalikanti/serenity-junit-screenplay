# Sample Serenity BDD project using JUnit 5 and Screenplay

## What does it have ?

1. Serenity BDD version - 4.2.13
2. Serenity JUnit 5, which includes JUnit 5 as well
3. AssertJ for assertions
4. Serenity BDD Screenplay dependencies i.e., serenity-screenplay and serenity-screenplay-webdriver
4. Plugin - 'maven-failsafe-plugin' - for running the acceptance tests
5. Plugin - 'serenity-maven-plugin' - for generating the reports
6. Maven wrapper so prior maven set-up is not needed

## Serenity Screenplay Pattern

The goal of the Screenplay pattern is to help you write cleaner, more readable, more maintainable test automation code
for any domain. Screenplay uses a user-centric model.

### Actor
It represents actual users of the application. In Serenity, everything starts with an actor who interacts with
the System Under Test (SUT) or an application to achieve their goals. An actor can:

An actor performs a list of actions. These actions are called 'Performables'. Performables can be:
1. **Interactions** - actor directly interacts with the application
2. **Tasks** - Groups of interactions to achieve some goal (e.g., purchasing a book on an eCommerce website)

Actor can also ask about the state of the system. In Screenplay, we do this by **Questions**

