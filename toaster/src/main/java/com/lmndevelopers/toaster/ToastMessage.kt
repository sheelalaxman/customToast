package com.lmndevelopers.toaster

import android.content.Context
import android.widget.Toast


class ToastMessage
{
    fun simple( c : Context, message: String) {
        Toast.makeText(c,message,Toast.LENGTH_LONG).show()
    }
}
