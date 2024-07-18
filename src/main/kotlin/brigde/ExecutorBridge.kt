package org.example.brigde

class ExecutorBridge {

    fun run() {
        val projector = Projector()
        val tv = Tv()
        val tvBox = TvBox()

        val projectorRemoteControl = BasicRemoteControl(projector)
        val tvRemoteControl = TouchRemoteControl(tv)
        val tvBoxRemoteControl = TouchRemoteControl(tvBox)

        println("TEST BRIDGE")

        projectorRemoteControl.togglePower()
        projectorRemoteControl.volumePlus()
        projectorRemoteControl.reduceVolume()
        projectorRemoteControl.togglePower()

        tvRemoteControl.togglePower()
        tvRemoteControl.volumePlus()
        tvRemoteControl.reduceVolume()
        tvRemoteControl.togglePower()

        tvBoxRemoteControl.togglePower()
        tvBoxRemoteControl.volumePlus()
        tvBoxRemoteControl.reduceVolume()
        tvBoxRemoteControl.togglePower()
    }
}