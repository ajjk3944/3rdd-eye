package com.yandex.mobile.ads.impl;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class gl1 extends Animation {

    /* renamed from: a, reason: collision with root package name */
    private final int f27810a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27811b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<ProgressBar> f27812c;

    public gl1(ProgressBar progressBar, int i, int i10) {
        kotlin.jvm.internal.l.f(progressBar, "progressBar");
        this.f27810a = i;
        this.f27811b = i10;
        this.f27812c = new WeakReference<>(progressBar);
        setInterpolator(new LinearInterpolator());
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        ProgressBar progressBar = this.f27812c.get();
        if (progressBar != null) {
            super.applyTransformation(f10, transformation);
            progressBar.setProgress(Math.round(((this.f27811b - r5) * f10) + this.f27810a));
        }
    }
}
