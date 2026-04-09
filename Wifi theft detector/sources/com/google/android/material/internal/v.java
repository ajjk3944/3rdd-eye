package com.google.android.material.internal;

import android.animation.TimeInterpolator;

/* loaded from: classes2.dex */
public class v implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f10758a;

    public v(TimeInterpolator timeInterpolator) {
        this.f10758a = timeInterpolator;
    }

    public static TimeInterpolator a(boolean z10, TimeInterpolator timeInterpolator) {
        return z10 ? timeInterpolator : new v(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return 1.0f - this.f10758a.getInterpolation(f10);
    }
}
