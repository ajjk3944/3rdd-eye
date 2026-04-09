package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ex0<T extends com.monetization.ads.mediation.base.a> {

    /* renamed from: a, reason: collision with root package name */
    private final T f27079a;

    /* renamed from: b, reason: collision with root package name */
    private final zy0 f27080b;

    /* renamed from: c, reason: collision with root package name */
    private final hx0 f27081c;

    /* renamed from: d, reason: collision with root package name */
    private final z70 f27082d;

    public ex0(T mediatedAdapter, zy0 mediationNetwork, hx0 mediatedAdData, z70 extrasCreator) {
        kotlin.jvm.internal.l.f(mediatedAdapter, "mediatedAdapter");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        kotlin.jvm.internal.l.f(mediatedAdData, "mediatedAdData");
        kotlin.jvm.internal.l.f(extrasCreator, "extrasCreator");
        this.f27079a = mediatedAdapter;
        this.f27080b = mediationNetwork;
        this.f27081c = mediatedAdData;
        this.f27082d = extrasCreator;
    }

    public final Map<String, Object> a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return this.f27082d.a(context);
    }

    public final T b() {
        return this.f27079a;
    }

    public final zy0 c() {
        return this.f27080b;
    }

    public final Map<String, String> d() {
        return this.f27082d.a(this.f27080b);
    }

    public final hx0 a() {
        return this.f27081c;
    }
}
