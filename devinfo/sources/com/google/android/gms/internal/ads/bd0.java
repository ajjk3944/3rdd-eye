package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bd0 {

    /* renamed from: a, reason: collision with root package name */
    public final qd0 f9650a;

    public bd0(qd0 qd0Var) {
        this.f9650a = qd0Var;
    }

    public final boolean a(ow0 ow0Var) {
        boolean zL = ow0Var.L();
        za.k kVar = za.k.f38156a;
        qd0 qd0Var = this.f9650a;
        if (zL) {
            rt rtVarA = qd0Var.a();
            rtVarA.u("action", "aq_ad_closed");
            rtVarA.u("gqi", ow0Var.D());
            rtVarA.u("aq_ad_duration", String.valueOf(ow0Var.E()));
            rtVarA.u("aq_ad_bounce_cnt", String.valueOf(ow0Var.F()));
            rtVarA.u("aq_time_away", String.valueOf(ow0Var.I()));
            return rtVarA.w().equals(kVar);
        }
        rt rtVarA2 = qd0Var.a();
        rtVarA2.u("action", "aq_ad_kill");
        rtVarA2.u("gqi", ow0Var.D());
        rtVarA2.u("aq_ad_duration", String.valueOf(ow0Var.E()));
        rtVarA2.u("aq_ad_bounce_cnt", String.valueOf(ow0Var.F()));
        rtVarA2.u("aq_time_away", String.valueOf(ow0Var.I()));
        rtVarA2.u("aq_is_os_kill", String.valueOf(ow0Var.H()));
        return rtVarA2.w().equals(kVar);
    }
}
