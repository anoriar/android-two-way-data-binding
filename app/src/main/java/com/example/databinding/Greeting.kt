package com.example.databinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class Greeting : BaseObservable {
    var senderName: String
    var greetingText: String
        @Bindable
        get() = field
        set(value) {
            field = value
            notifyPropertyChanged(BR.greetingText)
        }

    constructor(senderName: String, greetingText: String = "Hello") {
        this.senderName = senderName
        this.greetingText = greetingText
    }
}
