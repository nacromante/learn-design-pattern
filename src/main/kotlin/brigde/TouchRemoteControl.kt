package org.example.brigde



class TouchRemoteControl (private var device: Device) : RemoteControl {
    private val controlType = "touch remote"

    override fun togglePower() {
        val power = device.getPower()
        device.setPower(!power)
        println("$controlType - ${device.getName()} - The device is ${if (power) "off" else "on"}")
    }

    override fun volumePlus() {
        val volume = device.getVolume()
        val newVolume = volume + 10
        device.setVolume(newVolume)
        println("$controlType - ${device.getName()} - The device with volume before $volume  and new volume $newVolume")
    }

    override fun reduceVolume() {
        val volume = device.getVolume()
        val newVolume = volume - 10
        device.setVolume(newVolume)
        println("$controlType - ${device.getName()} - The device with volume before $volume  and new volume $newVolume")
    }


}