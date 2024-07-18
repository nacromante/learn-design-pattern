package org.example.brigde

interface Device {
    fun getName() : String

    fun setVolume(volume: Int)
    fun getVolume() : Int

    fun setPower(power:Boolean)

    fun getPower() : Boolean
}