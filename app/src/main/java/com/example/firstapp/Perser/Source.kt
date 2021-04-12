package com.example.firstapp.Perser

open class Source (str: String) {

    val str: String;
    var pos: Int;

    init {
        this.str = str;
        this.pos = 0;
    }

    fun peek(): Char? {
        if (this.pos < this.str.length) {
            return this.str[this.pos];
        }
        return null;
    }

    fun next(): Unit {
        ++this.pos;
    }
}