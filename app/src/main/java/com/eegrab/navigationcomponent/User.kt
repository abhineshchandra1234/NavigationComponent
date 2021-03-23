package com.eegrab.navigationcomponent

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(val name: String, val age: Int) : Parcelable {

}
