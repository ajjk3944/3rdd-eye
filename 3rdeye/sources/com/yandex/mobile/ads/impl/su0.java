package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class su0 implements x00 {

    /* renamed from: a, reason: collision with root package name */
    private final int f33244a;

    /* renamed from: b, reason: collision with root package name */
    private final mu0 f33245b;

    public su0(kt nativeAdAssets, int i, mu0 mediaAspectRatioProvider) {
        kotlin.jvm.internal.l.f(nativeAdAssets, "nativeAdAssets");
        kotlin.jvm.internal.l.f(mediaAspectRatioProvider, "mediaAspectRatioProvider");
        this.f33244a = i;
        this.f33245b = mediaAspectRatioProvider;
    }

    @Override // com.yandex.mobile.ads.impl.x00
    public final boolean a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        int iC = jh2.c(context);
        int i = context.getResources().getDisplayMetrics().widthPixels;
        Float fA = this.f33245b.a();
        return i - (fA != null ? com.google.gson.internal.c.y(fA.floatValue() * ((float) iC)) : 0) >= this.f33244a;
    }
}
