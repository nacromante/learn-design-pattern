package org.example.composite

class Composite : Component {
    private val components = mutableListOf<Component>()

    fun add(component: Component) {
        components.add(component)
    }

    override fun validate(value: String): Boolean = components.all { it.validate(value) }

}