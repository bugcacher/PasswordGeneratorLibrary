# PasswordGeneratorLibrary

[![](https://jitpack.io/v/abhinav0612/PasswordGeneratorLibrary.svg)](https://jitpack.io/#abhinav0612/PasswordGeneratorLibrary) [![Awesome Kotlin Badge](https://kotlin.link/awesome-kotlin.svg)](https://github.com/KotlinBy/awesome-kotlin)

## An easy to use Password Generator Library.

## Features:
- Include Uppercase Letters
- Include Lowercase Letters
- Include Special Symbols
- Inlcude Numbers

## How to integrate into your app?
Integrating the project is simple, All you need to do is follow the below steps

Step 1. Add the JitPack repository to your build file. Add it in your root build.gradle at the end of repositories:

```java
allprojects {
  repositories {
    ...
    maven { url "https://jitpack.io" }
  }
}
```
Step 2. Add the dependency
```java
dependencies {
    	implementation 'com.github.abhinav0612:PasswordGeneratorLibrary:Tag'
}
```

## How to use the library?
Okay seems like you have integrated the library in your project but **how do you use it**? 

### Koltin
```kotlin
var passwordGenerator = PasswordGenerator(12,
                            includeUpperCaseLetters = true,            // To include upper case Letters
                            includeLowerCaseLetters = true,           // To include lower case Letters
                            includeSymbols = true,                   // To include special symbols
                            includeNumbers = true)                  // To include numbers (0-9)
    
    var generatedPassword = passwordGenerator.generatePassword()           
```
### Java
```java
 PasswordGenerator obj = new PasswordGenerator(12,
                true,                                         // To include upper case Letters
                false,                                       // To include lower case Letters
                true,                                       // To include secial symbols
                false);                                    // To include numbers (0-9)
                
  String generatedPassword = obj.generatePassword();     // Call generatePassword() method te get the password              
```

That's pretty much it and you're all wrapped up.

## Author
Maintained by [Abhinav Singh](https://www.github.com/abhinav0612)
