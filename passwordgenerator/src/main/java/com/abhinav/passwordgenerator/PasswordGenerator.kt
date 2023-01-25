package com.abhinav.passwordgenerator

/**
 * Created by Abhinav Singh on 17,July,2020
 */
class PasswordGenerator {
    companion object {
    	fun generatePassword(length: Int, includeUpperCaseLetters : Boolean, includeLowerCaseLetters : Boolean, includeSymbols : Boolean, includeNumbers: Boolean) : String {
            if (length <= 0) return "Password must be at least one character"
            if (!includeUpperCaseLetters && !includeLowerCaseLetters && !includeSymbols && !includeNumbers) return "Select at least one option"
            
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
                val choice = list.random()
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
}