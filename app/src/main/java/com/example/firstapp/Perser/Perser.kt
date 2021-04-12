package com.example.firstapp.Perser

class Perser (str: String): Source(str) {

    init {
    }

    fun number(): Int {
        val sb = StringBuilder();
        var ch = peek();
        while (ch is Char && Character.isDigit(ch)) {
            sb.append((ch));
            next();
            ch = peek();
        }
        return Integer.parseInt(sb.toString())
    }

    fun expr(): Int {
        var x = term();
        var continue_flg = true;
        while (continue_flg) {
            continue_flg = false;
            when (peek()) {
                '+' -> {
                    next();
                    x += term();
                    continue_flg = true;
                }
                '-' -> {
                    next();
                    x -= term();
                    continue_flg = true;
                }
            }
        }
        return x;
    }

    fun term(): Int {
        var x = factor();
        var continue_flg = true;
        while (continue_flg) {
            continue_flg = false;
            when (peek()) {
                '*' -> {
                    next();
                    x *= factor();
                    continue_flg = true;
                }
                '/' -> {
                    next();
                    x /= factor();
                    continue_flg = true;
                }
            }
        }
        return x;
    }

    fun factor(): Int {
        if (peek() == '(') {
            next();
            val ret = expr();
            if (peek() == '(') {
                next()
            }
            return ret;
        }
        return number();
    }
}