package com.yandex.mobile.ads.impl;

import c9.C2092m;
import com.singular.sdk.internal.Constants;
import java.util.List;

/* loaded from: classes3.dex */
public final class oq {

    /* renamed from: a, reason: collision with root package name */
    private j50 f31479a;

    /* renamed from: b, reason: collision with root package name */
    private cc f31480b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f31481c;

    public /* synthetic */ oq() {
        this(new cc(), new j50());
    }

    public final cc a() {
        return this.f31480b;
    }

    public final j50 b() {
        return this.f31479a;
    }

    public final List<String> c() {
        return this.f31481c;
    }

    public final void a(cc ccVar) {
        kotlin.jvm.internal.l.f(ccVar, "<set-?>");
        this.f31480b = ccVar;
    }

    public oq(cc advertisingConfiguration, j50 environmentConfiguration) {
        kotlin.jvm.internal.l.f(environmentConfiguration, "environmentConfiguration");
        kotlin.jvm.internal.l.f(advertisingConfiguration, "advertisingConfiguration");
        this.f31479a = environmentConfiguration;
        this.f31480b = advertisingConfiguration;
        this.f31481c = C2092m.W(Constants.SMALL, Constants.MEDIUM, Constants.LARGE);
    }

    public final void a(j50 j50Var) {
        kotlin.jvm.internal.l.f(j50Var, "<set-?>");
        this.f31479a = j50Var;
    }
}
