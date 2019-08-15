package com.example.submission.model.Parcelable

import android.os.Parcel
import android.os.Parcelable

class ProductParcel(val img: String, val title: String, val tag: String, val count_Seen: String, val count_sold: String): Parcelable {
    constructor(parcel: Parcel) : this(
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
        parcel.writeString(tag)
        parcel.writeString(count_Seen)
        parcel.writeString(count_sold)
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