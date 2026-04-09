package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class uo {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41821a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f41822b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final C4908qo f41823c;

    /* renamed from: d, reason: collision with root package name */
    public final C4908qo f41824d;

    public uo(Context context) {
        this.f41821a = context;
        C4996ua c4996ua = new C4996ua(context, "appmetrica_vital.dat");
        this.f41823c = new C4908qo(Ga.j().x(), c4996ua);
        this.f41824d = new C4908qo(new C4769lf(C4916r7.a(context).d()), c4996ua);
    }

    public final C4908qo a() {
        return this.f41823c;
    }

    public final C4908qo b() {
        return this.f41824d;
    }
}
