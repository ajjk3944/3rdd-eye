package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class hg2 implements gd2 {

    /* renamed from: a, reason: collision with root package name */
    private final fg2 f28223a;

    public hg2(fg2 videoViewProvider) {
        kotlin.jvm.internal.l.f(videoViewProvider, "videoViewProvider");
        this.f28223a = videoViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.gd2
    public final boolean a() {
        View view = this.f28223a.getView();
        return (view == null || jh2.d(view) || !jh2.a(view, 50)) ? false : true;
    }
}
