package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;

/* loaded from: classes3.dex */
public final class rd {
    public static void a(ProgressBar progressBar, long j4, long j10) {
        kotlin.jvm.internal.l.f(progressBar, "progressBar");
        progressBar.clearAnimation();
        if (j4 > 0) {
            progressBar.setMax((int) j4);
            gl1 gl1Var = new gl1(progressBar, progressBar.getProgress(), (int) j10);
            gl1Var.setDuration(200L);
            progressBar.startAnimation(gl1Var);
        }
    }
}
