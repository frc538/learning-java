# Learning Java

This repo is intended to host multiple lessons for getting students started with Java programming. These lessons can be used with a teacher or other mentor, but they intended to be detailed enough that a student can follow along self-sufficiently.

The first lessons are meant to introduce students to programming (in general) as well as the Java language. This repo currently focuses on Java 11.

The next set of lessons shifts the focus from general programming to object-oriented programming and getting the student comfortable working with objects.

The next set of lessons is meant to introduce the student to robot programming, focusing on the TimedRobot template for simple robots.

Finally, the last set of lessons shifts focus to the command-based robot paradigm.

## Getting Started

To take full advantage of the repo, you'll need to install Java and WPILib.

1. To install Java, go to the [OpenJDK website](https://openjdk.java.net/install/) and follow the directions for JDK 9 and later, specifically for **Java 11**.
    - Using tar: `tar xvf openjdk-11*_bin.tar.gz`
    - Using unzip: `unzip openjdk-11*_bin.zip`

2. To install WPILib, go to the [WPILib Documentation](https://docs.wpilib.org/en/latest/docs/getting-started/getting-started-frc-control-system/wpilib-setup.html) and follow the instructions for your system.

3. These lessons are written using Visual Studio Code, so make sure you have it installed. If you follow the steps for WPILib, you'll be covered.

## Working a Lesson

Instead of opening the entire repo, you should open the folder for the lesson you want.

For example, if you want to work on Lesson 01, you should open the folder for Lesson 01 in Visual Studio Code rather than the entire repository folder.

Each lesson will have a Java project as well as a README file for that specific lesson.

To run a non-robot project, find its main method and click **Run** in Visual Studio Code. If you do not see this option, you may not have the extensions installed. Check the steps to install Visual Studio Code.

You also have the option of opening the App.java file for the project and clicking the "play" button in Visual Studio Code.

Finally, you have the option to use gradle. In the project directory, you can run `./gradlew run` to run the application.
