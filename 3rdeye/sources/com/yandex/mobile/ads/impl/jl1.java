package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.R;
import z0.C5848a;

/* loaded from: classes3.dex */
public final class jl1 {

    /* renamed from: a, reason: collision with root package name */
    private final j10 f29193a;

    public /* synthetic */ jl1() {
        this(new j10());
    }

    public final ProgressBar a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminateDrawable(C5848a.getDrawable(context, R.drawable.monetization_ads_video_progress_bar_background));
        this.f29193a.getClass();
        int iA = j10.a(context, 45.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        return progressBar;
    }

    public jl1(j10 dimensionConverter) {
        kotlin.jvm.internal.l.f(dimensionConverter, "dimensionConverter");
        this.f29193a = dimensionConverter;
    }
}
