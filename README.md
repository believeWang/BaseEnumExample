# BaseEnumExample
Spring boot + Mapstruct  + Enum field 
# Enum Handling in Spring Boot Application

This is a sample Spring Boot application that demonstrates an approach to handling enums in entity classes for ease of maintenance and flexibility.

## Table of Contents

- [Introduction](#introduction)
- [Approach](#approach)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Running the Application](#running-the-application)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

In many software development projects, it's common to use enums to represent various fields in the system for better maintainability and clarity. However, mapping enums to database fields can be complex, especially when dealing with different databases or NoSQL data stores.

This project demonstrates an approach where enums are not used directly in entity classes. Instead, simple numeric or string fields are used in the entity classes. The actual enum usage is centralized in logic classes such as Request, Response, or UseCase. A shared MapStruct mapper is used to convert between enums and database entities. All enums extend a common base enum (CommonTypeEnum), and a shared mapper is used by various classes to automate the conversion of all enums.

## Approach

The approach used in this demo project includes the following steps:

1. Define your enums and ensure they all extend a common base enum (CommonTypeEnum).

2. Create a shared MapStruct mapper (CommonMapper) to handle the conversion between enums and database fields.

3. In your entity classes, use simple numeric or string fields instead of enums.

4. In your logic classes (e.g., Request, Response, UseCase), use enums to represent fields and use the CommonMapper for conversion.

## Getting Started

### Prerequisites

Before running this project, you need to have the following prerequisites:

- Java JDK 
- Gradle 
- Your favorite Integrated Development Environment (IDE)

## Contributing

Contributions to this project are welcome. Feel free to open issues, create pull requests, or provide feedback.

## Article

[my medium](https://believe67.medium.com/%E4%BD%BF%E7%94%A8mapstruct%E4%BE%86%E9%81%94%E6%88%90%E5%85%B1%E7%94%A8%E7%9A%84common-enum-mapper-18c7e031fc54)
