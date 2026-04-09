package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class t9 {

    /* renamed from: a, reason: collision with root package name */
    private final x52 f33487a;

    public /* synthetic */ t9() {
        this(new x52());
    }

    public final vb1 a(j41 nativeAdBlock) {
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        p61 p61VarC = nativeAdBlock.c();
        List<ag<?>> listB = p61VarC.b();
        x52 x52Var = this.f33487a;
        List<tx1> listI = p61VarC.i();
        x52Var.getClass();
        ArrayList arrayListA = x52.a(null, listI);
        x52 x52Var2 = this.f33487a;
        List<String> listG = p61VarC.g();
        x52Var2.getClass();
        return new vb1(listB, arrayListA, x52.a(null, listG), "ad_unit", p61VarC.d());
    }

    public t9(x52 trackingDataCreator) {
        kotlin.jvm.internal.l.f(trackingDataCreator, "trackingDataCreator");
        this.f33487a = trackingDataCreator;
    }
}
