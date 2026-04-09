package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class eg {

    /* renamed from: a, reason: collision with root package name */
    private final mb2<tn0> f26831a;

    /* renamed from: b, reason: collision with root package name */
    private final ze1 f26832b;

    /* renamed from: c, reason: collision with root package name */
    private final zf2 f26833c;

    /* renamed from: d, reason: collision with root package name */
    private final ao0 f26834d;

    public eg(mb2<tn0> videoAdInfo, ze1 adClickHandler, zf2 videoTracker) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(adClickHandler, "adClickHandler");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        this.f26831a = videoAdInfo;
        this.f26832b = adClickHandler;
        this.f26833c = videoTracker;
        this.f26834d = new ao0(new ou());
    }

    public final void a(View view, ag<?> agVar) {
        String strA;
        kotlin.jvm.internal.l.f(view, "view");
        if (agVar == null || !agVar.e() || (strA = this.f26834d.a(this.f26831a.b(), agVar.b()).a()) == null) {
            return;
        }
        view.setOnClickListener(new qg(this.f26832b, strA, agVar.b(), this.f26833c));
    }
}
