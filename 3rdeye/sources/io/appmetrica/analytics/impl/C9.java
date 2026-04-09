package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class C9 {

    /* renamed from: a, reason: collision with root package name */
    public final Cif f39233a;

    /* renamed from: b, reason: collision with root package name */
    public final C4933ro f39234b;

    /* renamed from: c, reason: collision with root package name */
    public final Pk f39235c;

    /* renamed from: d, reason: collision with root package name */
    public final C4555d7 f39236d;

    /* renamed from: e, reason: collision with root package name */
    public final X8 f39237e;

    /* renamed from: f, reason: collision with root package name */
    public final Hk f39238f;

    /* renamed from: g, reason: collision with root package name */
    public final C4651h0 f39239g;

    /* renamed from: h, reason: collision with root package name */
    public final C4711j9 f39240h;
    public final C4991u5 i;

    /* renamed from: j, reason: collision with root package name */
    public final TimeProvider f39241j;

    /* renamed from: k, reason: collision with root package name */
    public final int f39242k;

    /* renamed from: l, reason: collision with root package name */
    public long f39243l;

    /* renamed from: m, reason: collision with root package name */
    public int f39244m;

    public C9(Cif cif, C4933ro c4933ro, Pk pk, C4555d7 c4555d7, C4651h0 c4651h0, X8 x82, Hk hk, int i, C4991u5 c4991u5, C4711j9 c4711j9, SystemTimeProvider systemTimeProvider) {
        this.f39233a = cif;
        this.f39234b = c4933ro;
        this.f39235c = pk;
        this.f39236d = c4555d7;
        this.f39239g = c4651h0;
        this.f39237e = x82;
        this.f39238f = hk;
        this.f39242k = i;
        this.f39240h = c4711j9;
        this.f39241j = systemTimeProvider;
        this.i = c4991u5;
        this.f39243l = cif.h();
        this.f39244m = cif.g();
    }

    public final void a(C4683i6 c4683i6, Rk rk) {
        Map map = c4683i6.f41058p;
        Hk hk = this.f39238f;
        hk.getClass();
        map.putAll(new HashMap(hk.f39587b));
        c4683i6.c(this.f39233a.i());
        c4683i6.f41057o = Integer.valueOf(this.f39234b.b());
        C4625g0 c4625g0A = this.f39239g.a();
        X8 x82 = this.f39237e;
        x82.getClass();
        W8 w82 = (W8) x82.f40380b.a(EnumC4997ub.a(c4683i6.f41047d));
        C4555d7 c4555d7 = this.f39236d;
        P8 p8A = w82.a(c4683i6);
        int i = c4683i6.f41047d;
        C4711j9 c4711j9 = this.f39240h;
        A7 a72 = new A7(c4555d7.f40715g, rk, i, c4711j9, p8A, (C5028vh) c4555d7.f40716h.f41608k.a(), c4625g0A);
        Long lValueOf = Long.valueOf(rk.f40071a);
        Tk tk = rk.f40074d;
        Long lValueOf2 = Long.valueOf(rk.f40072b);
        EnumC4997ub enumC4997ubA = EnumC4997ub.a(a72.f39087h.f41047d);
        long jOptLong = 0;
        if (!O9.f39929g.contains(EnumC4997ub.a(i))) {
            C4933ro c4933ro = c4711j9.f41112b;
            synchronized (c4933ro) {
                jOptLong = c4933ro.f41594a.a().optLong("global_number", 0L);
            }
            c4711j9.f41112b.b(1 + jOptLong);
        }
        c4555d7.a(c4555d7.f40719l.fromModel(new C5068x7(lValueOf, tk, lValueOf2, enumC4997ubA, Long.valueOf(jOptLong), Long.valueOf(rk.f40073c), a72.a())));
        this.i.f41707a.h();
    }
}
