package com.abhinav.passwordgenerator

/**
 * Created by Abhinav Singh on 17,July,2020
 */
class PasswordGenerator(private var length: Int, private var includeUpperCaseLetters : Boolean, private var includeLowerCaseLetters : Boolean,
                        private var includeSymbols : Boolean, private var includeNumbers: Boolean) {

    public fun generatePassword() : String {
        var password = ""
        var list  = ArrayList<Int>()
        if(includeUpperCaseLetters)
            list.add(0)
        if(includeLowerCaseLetters)
            list.add(1)
        if(includeNumbers)
            list.add(2)
        if(includeSymbols)
            list.add(3)

        for(i in 1..length){
            var choice = list.random()
            when(choice){
                0-> password += ('A'..'Z').random().toString()
                1-> password += ('a'..'z').random().toString()
                2-> password += ('0'..'9').random().toString()
                3-> password += listOf('!','@','#','$','%','&','*','+','=','-','~','?','/','_').random().toString()
            }
        }
        return password
    }
}