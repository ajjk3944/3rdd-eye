package com.github.appintro.internal;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import kotlin.jvm.internal.l;

/* compiled from: ScrollerCustomDuration.kt */
/* loaded from: classes.dex */
public final class ScrollerCustomDuration extends Scroller {
    private double scrollDurationFactor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollerCustomDuration(Context context, Interpolator interpolator) {
        super(context, interpolator);
        l.f(context, "context");
        l.f(interpolator, "interpolator");
        this.scrollDurationFactor = 6.0d;
    }

    public final double getScrollDurationFactor() {
        return this.scrollDurationFactor;
    }

    public final void setScrollDurationFactor(double d10) {
        this.scrollDurationFactor = d10;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i10, int i11, int i12, int i13) {
        super.startScroll(i, i10, i11, i12, (int) (i13 * this.scrollDurationFactor));
    }
}
