package org.example.composite

class ExecutorComposite {

    fun run(){
        println("TEST COMPOSITE")

        val componentEmail = Composite()
        val valueEmail = "fred@gmail.com"
        componentEmail.add(EmailLeaf())
        val emailIsValid = componentEmail.validate(valueEmail)

        println("a string $valueEmail is a valid email? $emailIsValid")

        val componentNumber = Composite()
        val valueNumber = "99"
        componentNumber.add(NumberLeaf())
        componentNumber.add(NumberInRangeLeaf())
        val numberIsValid = componentNumber.validate(valueNumber)

        println("a string $valueNumber is a valid number in 0 and 100? $numberIsValid")
    }
}