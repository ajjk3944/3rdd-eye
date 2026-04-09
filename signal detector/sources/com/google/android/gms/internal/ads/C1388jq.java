package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;
import q2.C2841s;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.jq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1388jq implements InterfaceC0956bq {

    /* renamed from: a, reason: collision with root package name */
    public final C0761Uh f14996a;

    /* renamed from: b, reason: collision with root package name */
    public final C0427An f14997b;

    /* renamed from: c, reason: collision with root package name */
    public final C0960bu f14998c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f14999d;

    /* renamed from: e, reason: collision with root package name */
    public final C2951a f15000e;

    /* renamed from: f, reason: collision with root package name */
    public final C0500Fb f15001f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15002g = ((Boolean) C2841s.f23267e.f23270c.a(H9.ea)).booleanValue();

    /* renamed from: h, reason: collision with root package name */
    public final BinderC0718Rp f15003h;
    public final C0750Tn i;

    /* renamed from: j, reason: collision with root package name */
    public final C0784Vn f15004j;

    public C1388jq(C0761Uh c0761Uh, Executor executor, C0427An c0427An, C0960bu c0960bu, C2951a c2951a, C0500Fb c0500Fb, BinderC0718Rp binderC0718Rp, C0750Tn c0750Tn, C0784Vn c0784Vn) {
        this.f14996a = c0761Uh;
        this.f14999d = executor;
        this.f14997b = c0427An;
        this.f14998c = c0960bu;
        this.f15000e = c2951a;
        this.f15001f = c0500Fb;
        this.f15003h = binderC0718Rp;
        this.i = c0750Tn;
        this.f15004j = c0784Vn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final boolean a(Xt xt, Qt qt) {
        Ut ut = qt.f10791s;
        return (ut == null || ut.f11811a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final InterfaceFutureC2326a b(Xt xt, Qt qt) {
        C1437kl c1437kl = new C1437kl(18);
        ED ed = ED.f7928b;
        C2028vj c2028vj = new C2028vj(this, qt, xt, c1437kl, 3);
        Executor executor = this.f14999d;
        C1306iD c1306iDF = AbstractC1984ut.F(ed, c2028vj, executor);
        c1306iDF.a(new RunnableC1944u6(4), executor);
        return c1306iDF;
    }
}
