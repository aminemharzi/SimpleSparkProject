# SparkExample Project

## Overview
This is a simple Apache Spark application written in Scala using SBT as the build tool. The application reads a local file and counts the number of lines containing the letters `a` and `b`. It demonstrates the basic setup and usage of Spark in a local environment.

## Prerequisites

1. **Java**: Ensure you have Java 8 or higher installed.
   ```bash
   java -version
   ```

2. **Scala**: Install Scala (version 2.12.15 for compatibility with Spark 3.4.0).
   ```bash
   scala -version
   ```

3. **SBT**: Install SBT (Scala Build Tool).
   ```bash
   sbt sbtVersion
   ```

4. **Apache Spark**: Ensure Apache Spark is installed and added to your system's PATH.
   ```bash
   spark-shell --version
   ```

5. **Text Editor/IDE**: Use an IDE like IntelliJ IDEA or a text editor like VS Code for development.

## Project Structure

```
.
├── build.sbt
├── project
│   └── build.properties
├── src
│   └── main
│       └── scala
│           └── SimpleAppLocal.scala
```

## Files Description

1. **`build.sbt`**: The build configuration file for SBT. It includes project settings and dependencies.
2. **`SimpleAppLocal.scala`**: The main application file.

## Dependencies

The project uses the following dependencies:

- Apache Spark Core: `org.apache.spark:spark-core:3.4.0`
- Apache Spark SQL: `org.apache.spark:spark-sql:3.4.0`

## Running the Project

Follow these steps to run the project:

### 1. Clone the Repository

If you have a Git repository, clone it; otherwise, create the project structure manually.

### 2. Build the Project

Navigate to the project directory and run:
```bash
sbt compile
```
This will download all required dependencies and compile the project.

### 3. Run the Application

Run the Spark application using SBT:
```bash
sbt run
```

### 4. Example Output

If the `SimpleApp.scala` file contains the text, the output will look like this:
```
Lines with a: X, Lines with b: Y
```
where `X` and `Y` are the counts of lines containing the letters `a` and `b`, respectively.

## Modifications

- To test with a different file, update the `logFile` variable in `SimpleAppLocal.scala` to point to the desired file.
- Ensure the file exists and is accessible in the specified location.

## Troubleshooting

1. **Dependency Issues**: If dependencies fail to resolve, check your internet connection or update the dependency versions in `build.sbt`.
2. **Java Compatibility**: Ensure Java and Scala versions are compatible with Spark.
3. **File Not Found**: Make sure the `SimpleApp.scala` file exists in the specified path (`./src/main/scala/SimpleApp.scala`).

## License
This project is licensed under the MIT License. Feel free to use and modify it as needed.

---
Happy Coding! 🎉

