package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class dr {

    /* renamed from: a, reason: collision with root package name */
    private final if1 f26296a;

    public /* synthetic */ dr() {
        this(new if1());
    }

    public final jp1 a(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        if1 if1Var = this.f26296a;
        int iO = adConfiguration.o();
        if1Var.getClass();
        jp1Var.b(iO != 1 ? iO != 2 ? "undefined" : "landscape" : "portrait", "orientation");
        return jp1Var;
    }

    public dr(if1 orientationNameProvider) {
        kotlin.jvm.internal.l.f(orientationNameProvider, "orientationNameProvider");
        this.f26296a = orientationNameProvider;
    }
}
