# kata-bootstraps

# Kata: Sing a song (refactoring)

A [Java](https://www.java.com/) version can be found in the [java/src/main/java](java/src/main/java) folder; produce the song with:

	javac Song.java && java Song

Gradle:

	gradle run

Maven:

	mvn exec:java

Tests can be configured in [java/src/test/java](java/src/test/java). You can start them via gradle

	gradle test

or Maven:

	mvn test


## Objective

Code to produce a popular children's nursary rhyme was produced by a web agency for the customer last year. The customer now desires to produce multiple different versions of the song using the same structure but based on different themes, for example a current popular children's movie featuring a cast of animals. The customer asks that you make the song configurable for different lists of animals. The customer cannot guarentee that there will be the same number of animals in each different version.

No documentation or tests were provided by the previous developer.

Refactor the code to allow for the customer's needs.
_Remember: refactoring can only be done in the presence of tests that are passing, and after refactoring the tests still pass!_

# License
The code samples are licensed under the CC-SA-NC-4.0 license, as shown in the [LICENSE](/LICENSE) file.
