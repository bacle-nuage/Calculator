package com.example.firstapp.Validation

/**
 * 入力された式のバリデーションを行うクラス
 */
class Validation(calculationText: String) {

    private val calculationText: String
    private var isValid: Boolean = false

    init {
        this.calculationText = calculationText
        checkBracket()
    }

    fun checkBracket() {
        //
    }

    fun isValid(): Boolean {
        return this.isValid;
    }
}