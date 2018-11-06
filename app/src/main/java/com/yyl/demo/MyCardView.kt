package com.yyl.demo

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Rect
import android.os.Build
import android.support.annotation.ColorInt
import android.support.annotation.Px
import android.support.v7.widget.CardView


import android.util.AttributeSet
import android.widget.FrameLayout

class MyCardView :CardView {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)



}