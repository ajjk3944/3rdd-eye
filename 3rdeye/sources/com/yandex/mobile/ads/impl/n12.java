package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class n12 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30737a;

    /* renamed from: b, reason: collision with root package name */
    private final mb2<tn0> f30738b;

    /* renamed from: c, reason: collision with root package name */
    private final bc f30739c;

    public n12(Context context, mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f30737a = context;
        this.f30738b = videoAdInfo;
        this.f30739c = new bc(videoAdInfo.g());
    }

    public final bz a() {
        int iOrdinal = new r12(this.f30739c).a(this.f30738b).ordinal();
        if (iOrdinal == 0) {
            return new m00(this.f30737a);
        }
        if (iOrdinal == 1) {
            return new l00(this.f30737a);
        }
        if (iOrdinal == 2) {
            return new qz();
        }
        throw new b9.j();
    }
}
