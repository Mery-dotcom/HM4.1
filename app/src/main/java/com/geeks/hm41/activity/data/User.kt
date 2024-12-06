package com.geeks.hm41.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val name: String = "Meerim",
    val email: String = "meerim@st.ru",
    val password: String = "Meerim"

) : Parcelable

