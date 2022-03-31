package com.android.hyper.feature.chose_role.transformer

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager2.widget.ViewPager2
import com.android.hyper.R
import com.google.android.material.card.MaterialCardView

class ScaleSaturationTransformer : ViewPager2.PageTransformer {

    override fun transformPage(page: View, position: Float) {
        val resources = page.context.resources
        val pageMarginPx = resources.getDimensionPixelOffset(R.dimen.pageMargin)
        val offsetPx = resources.getDimensionPixelOffset(R.dimen.offset)

        val offset = position * -(2 * offsetPx + pageMarginPx)
        val posit = if (position < 0) position * -1 else position
        val scale = 1 + 0.1f * -posit

        page.apply {
            translationX = offset
            scaleX = scale
            scaleY = scale
        }
        changeSaturation(page, posit)
    }

    private fun changeSaturation(page: View, posit: Float) {
        val cl = (page as MaterialCardView).getChildAt(0)
        val iv = (cl as ConstraintLayout).getChildAt(2)
        if (iv is AppCompatImageView) {
            val matrix = ColorMatrix()
            val saturation = (255 - posit * 255f) / 255
            matrix.setSaturation(saturation)
            iv.colorFilter = ColorMatrixColorFilter(matrix)
        }
    }
}