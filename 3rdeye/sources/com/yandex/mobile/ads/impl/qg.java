package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class qg implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final ze1 f32172a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32173b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32174c;

    /* renamed from: d, reason: collision with root package name */
    private final zf2 f32175d;

    public qg(ze1 adClickHandler, String url, String assetName, zf2 videoTracker) {
        kotlin.jvm.internal.l.f(adClickHandler, "adClickHandler");
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(assetName, "assetName");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        this.f32172a = adClickHandler;
        this.f32173b = url;
        this.f32174c = assetName;
        this.f32175d = videoTracker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        kotlin.jvm.internal.l.f(v10, "v");
        this.f32175d.a(this.f32174c);
        this.f32172a.a(this.f32173b);
    }
}
