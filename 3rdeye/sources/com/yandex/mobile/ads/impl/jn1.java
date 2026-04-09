package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RatingBar;

/* loaded from: classes3.dex */
public class jn1 extends RatingBar implements gn1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn1(Context context) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
    }

    @Override // android.widget.RatingBar
    public final float getRating() {
        return super.getRating();
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent event) {
        kotlin.jvm.internal.l.f(event, "event");
        return isClickable() && event.getAction() == 0;
    }

    @Override // android.widget.RatingBar, com.yandex.mobile.ads.impl.gn1
    public void setRating(float f10) {
        super.setRating(f10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.l.f(context, "context");
    }
}
