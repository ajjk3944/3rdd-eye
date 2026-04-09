package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512Fn {

    /* renamed from: a, reason: collision with root package name */
    public final C0784Vn f8184a;

    public C0512Fn(C0784Vn c0784Vn) {
        this.f8184a = c0784Vn;
    }

    public final boolean a(C1449kx c1449kx) {
        boolean zL = c1449kx.L();
        u2.m mVar = u2.m.f23816a;
        C0784Vn c0784Vn = this.f8184a;
        if (zL) {
            C0697Ql c0697QlA = c0784Vn.a();
            c0697QlA.r("action", "aq_ad_closed");
            c0697QlA.r("gqi", c1449kx.D());
            c0697QlA.r("aq_ad_duration", String.valueOf(c1449kx.E()));
            c0697QlA.r("aq_ad_bounce_cnt", String.valueOf(c1449kx.F()));
            c0697QlA.r("aq_time_away", String.valueOf(c1449kx.I()));
            return c0697QlA.v().equals(mVar);
        }
        C0697Ql c0697QlA2 = c0784Vn.a();
        c0697QlA2.r("action", "aq_ad_kill");
        c0697QlA2.r("gqi", c1449kx.D());
        c0697QlA2.r("aq_ad_duration", String.valueOf(c1449kx.E()));
        c0697QlA2.r("aq_ad_bounce_cnt", String.valueOf(c1449kx.F()));
        c0697QlA2.r("aq_time_away", String.valueOf(c1449kx.I()));
        c0697QlA2.r("aq_is_os_kill", String.valueOf(c1449kx.H()));
        return c0697QlA2.v().equals(mVar);
    }
}
