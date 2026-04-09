package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ProgressBar;

/* loaded from: classes3.dex */
public final class oe2 {

    /* renamed from: a, reason: collision with root package name */
    private final jl1 f31356a;

    /* renamed from: b, reason: collision with root package name */
    private final cf2 f31357b;

    public /* synthetic */ oe2() {
        this(new jl1(), new cf2());
    }

    public final ne2 a(Context context, ya2 ya2Var) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f31357b.getClass();
        ImageView imageView = null;
        if ((ya2Var != null ? ya2Var.a() : null) != null) {
            imageView = new ImageView(context);
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ProgressBar progressBarA = this.f31356a.a(context);
        progressBarA.setVisibility(8);
        progressBarA.setTag(hh2.a("video_placeholder_spinner"));
        ne2 ne2Var = new ne2(context, progressBarA, imageView);
        ne2Var.addView(progressBarA);
        if (imageView != null) {
            ne2Var.addView(imageView);
        }
        ne2Var.setBackgroundColor(-16777216);
        return ne2Var;
    }

    public oe2(jl1 progressBarCreator, cf2 videoPreviewCreator) {
        kotlin.jvm.internal.l.f(progressBarCreator, "progressBarCreator");
        kotlin.jvm.internal.l.f(videoPreviewCreator, "videoPreviewCreator");
        this.f31356a = progressBarCreator;
        this.f31357b = videoPreviewCreator;
    }
}
