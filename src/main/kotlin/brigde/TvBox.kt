package org.example.brigde

class TvBox (
    private var isPowerOn: Boolean = false,
    private var volume: Int = 0,
) : Device {
    private val name = "Tv Box"

    override fun getName(): String = name

    override fun setVolume(volume: Int) {
        this.volume = volume
    }

    override fun getVolume() : Int = this.volume


    override fun setPower(power: Boolean) {
         this.isPowerOn = power
    }

    override fun getPower() : Boolean = this.isPowerOn


}