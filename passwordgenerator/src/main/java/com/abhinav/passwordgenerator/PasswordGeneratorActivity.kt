package com.abhinav.passwordgenerator

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.content.ContentProviderCompat.requireContext
import org.w3c.dom.Text

class PasswordGeneratorActivity : AppCompatActivity() {

    public val PASSWORD = "Password"

    private lateinit var passwordTextView : TextView
    private lateinit var seekBarLength : TextView
    private lateinit var upperCaseSwitch : Switch
    private lateinit var lowerCaseSwitch : Switch
    private lateinit var numberSwitch : Switch
    private lateinit var symbolSwitch : Switch
    private lateinit var seekBar: SeekBar
    private lateinit var generatePasswordButton : Button
    private lateinit var copyPassword : Button
    private  var length : Int = 0
    private var pass = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.password_generator)

        passwordTextView = findViewById(R.id.generatedPasswordTextView)
        seekBarLength = findViewById(R.id.generatedPasswordTextView)
        upperCaseSwitch = findViewById(R.id.capitalsSwitch)
        lowerCaseSwitch = findViewById(R.id.smallLetterSwitch)
        symbolSwitch = findViewById(R.id.symbolSwitch)
        numberSwitch = findViewById(R.id.numberSwitch)
        seekBar = findViewById(R.id.lengthSeekBar)
        generatePasswordButton = findViewById(R.id.generatePassword)
        copyPassword = findViewById(R.id.copyPassword)


        generatePasswordButton.setOnClickListener {

            pass = ""
            length = seekBar.progress

            var list  = ArrayList<Int>()
            if(upperCaseSwitch.isChecked)
                list.add(0)
            if(lowerCaseSwitch.isChecked)
                list.add(1)
            if(numberSwitch.isChecked)
                list.add(2)
            if(symbolSwitch.isChecked)
                list.add(3)

            for(i in 1..length){
                var choice = list.random()
                when(choice){
                    0-> pass += ('A'..'Z').random().toString()
                    1-> pass += ('a'..'z').random().toString()
                    2-> pass += ('0'..'9').random().toString()
                    3-> pass += listOf('!','@','#','$','%','&','*','+','=','-','~').random().toString()
                }
            }
            passwordTextView.text = pass
            passwordTextView.text = "Regenerate"
        }
        copyPassword.setOnClickListener {
            var clipboardManager : ClipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            if(clipboardManager.hasPrimaryClip()){
                var data : ClipData = ClipData.newPlainText("copied text",pass)
                clipboardManager.setPrimaryClip(data)
            }
            Toast.makeText(this,"Copied to clipboard", Toast.LENGTH_SHORT).show()
        }

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                seekBarLength.text = "Length: $p1"
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

        if(callingActivity != null){
            val data : Intent
            intent.putExtra(PASSWORD,pass)
            setResult(Activity.RESULT_OK,intent)
            finish();
        }


    }
}
