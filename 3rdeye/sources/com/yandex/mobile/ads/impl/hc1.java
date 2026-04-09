package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class hc1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f28177a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f28178b;

    /* renamed from: c, reason: collision with root package name */
    private final List<ag<?>> f28179c;

    /* renamed from: d, reason: collision with root package name */
    private final ir0 f28180d;

    /* renamed from: e, reason: collision with root package name */
    private final qj0 f28181e;

    public /* synthetic */ hc1(C4072a3 c4072a3, a8 a8Var, List list, ir0 ir0Var) {
        this(c4072a3, a8Var, list, ir0Var, new qj0());
    }

    public final boolean a() {
        if (!this.f28177a.u()) {
            return false;
        }
        if (!this.f28178b.Q()) {
            return true;
        }
        Set<jj0> setA = this.f28181e.a(this.f28179c, this.f28180d);
        if (setA.isEmpty()) {
            return false;
        }
        Iterator<T> it = setA.iterator();
        while (it.hasNext()) {
            if (!((jj0) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hc1(C4072a3 adConfiguration, a8<?> adResponse, List<? extends ag<?>> assets, ir0 ir0Var, qj0 imageValuesProvider) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(assets, "assets");
        kotlin.jvm.internal.l.f(imageValuesProvider, "imageValuesProvider");
        this.f28177a = adConfiguration;
        this.f28178b = adResponse;
        this.f28179c = assets;
        this.f28180d = ir0Var;
        this.f28181e = imageValuesProvider;
    }
}
