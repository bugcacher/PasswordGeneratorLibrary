# PasswordGeneratorLibrary

[![](https://jitpack.io/v/abhinav0612/PasswordGeneratorLibrary.svg)](https://jitpack.io/#abhinav0612/PasswordGeneratorLibrary) [![Awesome Kotlin Badge](https://kotlin.link/awesome-kotlin.svg)](https://github.com/KotlinBy/awesome-kotlin)

## An easy to use Password Generator Library.

## Features:
- Include Uppercase Letters
- Include Lowercase Letters
- Include Special Symbols
- Inlcude Numbers

<img src="https://user-images.githubusercontent.com/44507909/88842767-a3027600-d1fd-11ea-9f86-290adcda7d58.jpg" width="15%" align="center"></img> 

## How to integrate into your app?
Integrating the project is simple, All you need to do is follow the below steps

## Gradle

Step 1. Add the JitPack repository to your build file. Add it in your root build.gradle at the end of repositories:

```
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
## Maven

Step 1. Add the JitPack repository to your build file
```
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
Step 2. Add the dependency
```
<dependency>
	    <groupId>com.github.abhinav0612</groupId>
	    <artifactId>PasswordGeneratorLibrary</artifactId>
	    <version>v3.0</version>
	</dependency>
```


## How to use the library?
Okay seems like you have integrated the library in your project but **how do you use it**? 

### Koltin
```kotlin
var passwordGenerator = PasswordGenerator(12,                           // To specify password length
                            includeUpperCaseLetters = true,            // To include upper case Letters
                            includeLowerCaseLetters = true,           // To include lower case Letters
                            includeSymbols = true,                   // To include special symbols
                            includeNumbers = true)                  // To include numbers (0-9)
    
    var generatedPassword = passwordGenerator.generatePassword()           
```
### Java
```java
 PasswordGenerator obj = new PasswordGenerator(12,             // To specify password length
                true,                                         // To include upper case Letters
                false,                                       // To include lower case Letters
                true,                                       // To include secial symbols
                false);                                    // To include numbers (0-9)
                
  String generatedPassword = obj.generatePassword();     // Call generatePassword() method te get the password              
```
### To use PasswordGeneratorActivity 

### Kotlin

```
val intent = Intent(this,PasswordGeneratorActivity::class.java)
        startActivity(intent)
```

OR

```
 val intent = Intent(this,PasswordGeneratorActivity::class.java)
        startActivityForResult(intent,PasswordGeneratorActivity.REQUEST_CODE)

override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == PasswordGeneratorActivity.REQUEST_CODE){
            if(resultCode == Activity.RESULT_OK){
                var password = data?.getStringExtra(PasswordGeneratorActivity.PASSWORD_GENERATED)
            }
        }
    }
```

### Java
```
Intent intent = new Intent(getBaseContext(), PasswordGeneratorActivity.class);
                startActivity(intent);
```

OR

```
Intent intent = new Intent(getBaseContext(), PasswordGeneratorActivity.class);
                startActivityForResult(intent,PasswordGeneratorActivity.REQUEST_CODE);
```

```
@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == PasswordGeneratorActivity.REQUEST_CODE){
            if(resultCode == RESULT_OK){
                String password = data.getStringExtra(PasswordGeneratorActivity.PASSWORD_GENERATED);
            }
        }
    }
```

That's all and now you are ready to use it.

## Author
Maintained by [Abhinav Singh](https://www.github.com/abhinav0612)
