package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import java.util.List;

/* loaded from: classes3.dex */
public final class nx0<T extends com.monetization.ads.mediation.base.a> {

    /* renamed from: a, reason: collision with root package name */
    private final List<zy0> f31045a;

    /* renamed from: b, reason: collision with root package name */
    private final z70 f31046b;

    /* renamed from: c, reason: collision with root package name */
    private final qx0<T> f31047c;

    /* renamed from: d, reason: collision with root package name */
    private final ix0 f31048d;

    /* renamed from: e, reason: collision with root package name */
    private int f31049e;

    public /* synthetic */ nx0(List list, zx0 zx0Var, ux0 ux0Var) {
        this(list, zx0Var, ux0Var, new qx0(ux0Var), new ix0());
    }

    public final ex0<T> a(Context context, Class<T> clazz) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(clazz, "clazz");
        while (this.f31049e < this.f31045a.size()) {
            List<zy0> list = this.f31045a;
            int i = this.f31049e;
            this.f31049e = i + 1;
            zy0 zy0Var = list.get(i);
            com.monetization.ads.mediation.base.a aVarA = this.f31047c.a(context, zy0Var, clazz);
            if (aVarA != null) {
                this.f31048d.getClass();
                return new ex0<>(aVarA, zy0Var, new hx0(aVarA), this.f31046b);
            }
        }
        return null;
    }

    public nx0(List mediationNetworks, zx0 extrasCreator, ux0 mediatedAdapterReporter, qx0 mediatedAdapterCreator, ix0 mediatedAdDataFactory) {
        kotlin.jvm.internal.l.f(mediationNetworks, "mediationNetworks");
        kotlin.jvm.internal.l.f(extrasCreator, "extrasCreator");
        kotlin.jvm.internal.l.f(mediatedAdapterReporter, "mediatedAdapterReporter");
        kotlin.jvm.internal.l.f(mediatedAdapterCreator, "mediatedAdapterCreator");
        kotlin.jvm.internal.l.f(mediatedAdDataFactory, "mediatedAdDataFactory");
        this.f31045a = mediationNetworks;
        this.f31046b = extrasCreator;
        this.f31047c = mediatedAdapterCreator;
        this.f31048d = mediatedAdDataFactory;
    }
}
