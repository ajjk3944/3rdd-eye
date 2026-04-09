package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class l9 {

    /* renamed from: a, reason: collision with root package name */
    private final x52 f29924a;

    public /* synthetic */ l9() {
        this(new x52());
    }

    public final vb1 a(w31 nativeAd) {
        kotlin.jvm.internal.l.f(nativeAd, "nativeAd");
        x52 x52Var = this.f29924a;
        List<tx1> listH = nativeAd.h();
        x52Var.getClass();
        ArrayList arrayListA = x52.a(listH, null);
        x52 x52Var2 = this.f29924a;
        List<String> listF = nativeAd.f();
        x52Var2.getClass();
        return new vb1(nativeAd.b(), arrayListA, x52.a(listF, null), nativeAd.a(), nativeAd.c());
    }

    public l9(x52 trackingDataCreator) {
        kotlin.jvm.internal.l.f(trackingDataCreator, "trackingDataCreator");
        this.f29924a = trackingDataCreator;
    }
}
