package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class gg2 {

    /* renamed from: a, reason: collision with root package name */
    private final fg2 f27685a;

    public gg2(fg2 videoViewProvider) {
        kotlin.jvm.internal.l.f(videoViewProvider, "videoViewProvider");
        this.f27685a = videoViewProvider;
    }

    public final boolean a() {
        View view = this.f27685a.getView();
        return (view == null || jh2.d(view) || jh2.b(view) < 1) ? false : true;
    }
}
