package org.example.composite

class EmailLeaf : Component {
    override fun validate(value: String): Boolean {
        val emailRegex = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})"
        return emailRegex.toRegex().matches(value)
    }
}