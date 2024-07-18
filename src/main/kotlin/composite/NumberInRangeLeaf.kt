package org.example.composite

class NumberInRangeLeaf : Component {
    private val min: Int = 1
    private val max:Int = 100
    override fun validate(value: String): Boolean {
        return value.toInt() in min..max
    }
}