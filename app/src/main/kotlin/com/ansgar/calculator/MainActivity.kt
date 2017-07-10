package com.ansgar.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ansgar.calculator.components.MainComponent
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {

    var first: String = ""
    var action: String = ""
    var isNext: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainComponent().setContentView(this)
    }

    fun setText(oldValue: String, newValue: String): String {
        if (oldValue == "0" && newValue != "." || isNext) {
            isNext = false
            return newValue
        }
        if (oldValue.contains(".") && newValue == ".") return oldValue
        if (newValue == "+/-") {
            if (oldValue.contains("-")) return oldValue.replace("-", "")
            else return "-$oldValue"
        }
        return oldValue + newValue
    }

    fun doOperation(value: String, operation: String): String {
        if (operation != "=") first = value
        if (action.isEmpty()) {
            action = operation
            return "0"
        } else {
            if (operation == "=") {
                var answer: String = ""
                isNext = true

                if (action == "/") answer = "${first.toDouble() / value.toDouble()}"
                if (action == "*") answer = "${first.toDouble() * value.toDouble()}"
                if (action == "+") answer = "${first.toDouble() + value.toDouble()}"
                if (action == "-") answer = "${first.toDouble() - value.toDouble()}"
                action = ""
                return answer
            }
        }
        return ""
    }


}
