package com.ansgar.calculator.components

import android.content.Context
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat
import android.view.Gravity
import android.view.View
import com.ansgar.calculator.MainActivity
import com.ansgar.calculator.R
import org.jetbrains.anko.*

/**
 * Created by kirill on 30.6.17.
 */
class MainComponent : AnkoComponent<MainActivity> {

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {

        val mContext: Context = ui.ctx

        verticalLayout {

            padding = dip(10)

            val answerTxt = textView(ui.resources.getString(R.string.answer)) {
                id = 101
                textColor = ContextCompat.getColor(mContext, R.color.black)
                maxLines = 1
                padding = dimen(R.dimen.answer_padding)
                this.gravity = Gravity.RIGHT
            }

            view {
                lparams(width = matchParent, height = dip(2))
                backgroundColor = ContextCompat.getColor(mContext, R.color.black)
            }

            linearLayout {

                lparams {
                    weight = 1.0f
                }

                button("7") {
                    id = 201
                    lparams(height = matchParent)
                }.onClick {
                    answerTxt.text = ui.owner.setText(answerTxt.text.toString(), "7")
                }
                button("8") {
                    id = 202
                    lparams(height = matchParent)
                }.onClick {
                    answerTxt.text = ui.owner.setText(answerTxt.text.toString(), "8")
                }
                button("9") {
                    id = 203
                    lparams(height = matchParent)
                }.onClick {
                    answerTxt.text = ui.owner.setText(answerTxt.text.toString(), "9")
                }
                button("/") {
                    id = 204
                    lparams(height = matchParent)
                }.onClick {
                    answerTxt.text = ui.owner.doOperation(answerTxt.text.toString(), "/")
                }
            }

            linearLayout {

                lparams {
                    weight = 1.0f
                }

                button("4") {
                    id = 201
                    lparams(height = matchParent)
                }.onClick {
                    answerTxt.text = ui.owner.setText(answerTxt.text.toString(), "4")
                }
                button("5") {
                    id = 202
                    lparams(height = matchParent)
                }.onClick {
                    answerTxt.text = ui.owner.setText(answerTxt.text.toString(), "5")
                }
                button("6") {
                    id = 203
                    lparams(height = matchParent)
                }.onClick {
                    answerTxt.text = ui.owner.setText(answerTxt.text.toString(), "6")
                }
                button("*") {
                    id = 204
                    lparams(height = matchParent)
                }.onClick {
                    answerTxt.text = ui.owner.doOperation(answerTxt.text.toString(), "*")
                }
            }

            linearLayout {

                lparams {
                    weight = 1.0f
                }

                button("1") {
                    id = 201
                    lparams(height = matchParent)
                }.onClick {
                    answerTxt.text = ui.owner.setText(answerTxt.text.toString(), "1")
                }
                button("2") {
                    id = 202
                    lparams(height = matchParent)
                }.onClick {
                    answerTxt.text = ui.owner.setText(answerTxt.text.toString(), "2")
                }
                button("3") {
                    id = 203
                    lparams(height = matchParent)
                }.onClick {
                    answerTxt.text = ui.owner.setText(answerTxt.text.toString(), "3")
                }
                button("-") {
                    id = 204
                    lparams(height = matchParent)
                }.onClick {
                    answerTxt.text = ui.owner.doOperation(answerTxt.text.toString(), "-")
                }
            }

            linearLayout {

                lparams {
                    weight = 1.0f
                }

                button("0") {
                    id = 201
                    lparams(height = matchParent, weight = 1.0f)
                }.onClick {
                    answerTxt.text = ui.owner.setText(answerTxt.text.toString(), "0")
                }
                button(".") {
                    id = 202
                    lparams(height = matchParent, weight = 1.0f)
                }.onClick {
                    answerTxt.text = ui.owner.setText(answerTxt.text.toString(), ".")
                }
                button("+/-") {
                    id = 203
                    lparams(height = matchParent, weight = 1.0f)
                }.onClick {
                    answerTxt.text = ui.owner.setText(answerTxt.text.toString(), "+/-")
                }
                button("+") {
                    id = 204
                    lparams(height = matchParent, weight = 1.0f)
                }.onClick {
                    answerTxt.text = ui.owner.doOperation(answerTxt.text.toString(), "+")
                }
                button("=") {
                    id = 204
                    lparams(height = matchParent, weight = 1.0f)
                }.onClick {
                    answerTxt.text = ui.owner.doOperation(answerTxt.text.toString(), "=")
                }
            }

        }

    }
}