package com.example.submission.model.Parcelable

import android.os.Parcel
import android.os.Parcelable

class ProductParcel(
    val img: String ,
    val title: String ,
    val description: String ,
    val tag: String ,
    val count_seen: String ,
    val cuont_sold: String ,
    val schreen_size: String ,
    val camera: String ,
    val ram: String ,
    val battery: String ,
    val announced_launch: String ,
    val status_launch: String ,
    val type_display: String ,
    val size_display: String ,
    val resolution_display: String ,
    val os_platform: String ,
    val chipset_platform: String ,
    val gpu_platform: String ,
    val cpu_platform: String 
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(img)
        parcel.writeString(title)
        parcel.writeString(description)
        parcel.writeString(tag)
        parcel.writeString(count_seen)
        parcel.writeString(cuont_sold)
        parcel.writeString(schreen_size)
        parcel.writeString(camera)
        parcel.writeString(ram)
        parcel.writeString(battery)
        parcel.writeString(announced_launch)
        parcel.writeString(status_launch)
        parcel.writeString(type_display)
        parcel.writeString(size_display)
        parcel.writeString(resolution_display)
        parcel.writeString(os_platform)
        parcel.writeString(chipset_platform)
        parcel.writeString(gpu_platform)
        parcel.writeString(cpu_platform)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ProductParcel> {
        override fun createFromParcel(parcel: Parcel): ProductParcel {
            return ProductParcel(parcel)
        }

        override fun newArray(size: Int): Array<ProductParcel?> {
            return arrayOfNulls(size)
        }
    }
}