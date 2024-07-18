package org.example.composite

class NumberLeaf : Component {
    override fun validate(value: String): Boolean {
        return value.all { it.isDigit() }
    }
}