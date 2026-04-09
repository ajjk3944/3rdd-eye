package com.google.android.gms.internal.ads;

import android.content.Context;
import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;
import q2.C2841s;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Cq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0464Cq implements InterfaceC0956bq {

    /* renamed from: b, reason: collision with root package name */
    public final Context f7667b;

    /* renamed from: c, reason: collision with root package name */
    public final C0427An f7668c;

    /* renamed from: d, reason: collision with root package name */
    public final C0960bu f7669d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f7670e;

    /* renamed from: f, reason: collision with root package name */
    public final C2951a f7671f;

    /* renamed from: g, reason: collision with root package name */
    public final C0500Fb f7672g;
    public final BinderC0718Rp i;

    /* renamed from: j, reason: collision with root package name */
    public final C0750Tn f7674j;

    /* renamed from: k, reason: collision with root package name */
    public final C0784Vn f7675k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7676l;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7666a = 0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7673h = ((Boolean) C2841s.f23267e.f23270c.a(H9.ea)).booleanValue();

    public C0464Cq(Context context, C2951a c2951a, C0960bu c0960bu, Executor executor, C0893ai c0893ai, C0427An c0427An, C0500Fb c0500Fb, BinderC0718Rp binderC0718Rp, C0750Tn c0750Tn, C0784Vn c0784Vn) {
        this.f7667b = context;
        this.f7669d = c0960bu;
        this.f7676l = c0893ai;
        this.f7670e = executor;
        this.f7671f = c2951a;
        this.f7668c = c0427An;
        this.f7672g = c0500Fb;
        this.i = binderC0718Rp;
        this.f7674j = c0750Tn;
        this.f7675k = c0784Vn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final boolean a(Xt xt, Qt qt) {
        switch (this.f7666a) {
            case 0:
                Ut ut = qt.f10791s;
                if (ut == null || ut.f11811a == null) {
                }
                break;
            default:
                Ut ut2 = qt.f10791s;
                if (ut2 == null || ut2.f11811a == null) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final InterfaceFutureC2326a b(Xt xt, Qt qt) {
        switch (this.f7666a) {
            case 0:
                C1437kl c1437kl = new C1437kl(18);
                ED ed = ED.f7928b;
                C2028vj c2028vj = new C2028vj(this, qt, xt, c1437kl, 7);
                Executor executor = this.f7670e;
                C1306iD c1306iDF = AbstractC1984ut.F(ed, c2028vj, executor);
                c1306iDF.a(new RunnableC1944u6(5), executor);
                return c1306iDF;
            default:
                C1437kl c1437kl2 = new C1437kl(18);
                ED ed2 = ED.f7928b;
                C2028vj c2028vj2 = new C2028vj(this, qt, xt, c1437kl2, 9);
                Executor executor2 = this.f7670e;
                C1306iD c1306iDF2 = AbstractC1984ut.F(ed2, c2028vj2, executor2);
                c1306iDF2.a(new RunnableC1944u6(6), executor2);
                return c1306iDF2;
        }
    }

    public C0464Cq(Context context, C2951a c2951a, C0960bu c0960bu, Executor executor, C1002ci c1002ci, C0427An c0427An, C0500Fb c0500Fb, BinderC0718Rp binderC0718Rp, C0750Tn c0750Tn, C0784Vn c0784Vn) {
        this.f7667b = context;
        this.f7669d = c0960bu;
        this.f7676l = c1002ci;
        this.f7670e = executor;
        this.f7671f = c2951a;
        this.f7668c = c0427An;
        this.f7672g = c0500Fb;
        this.i = binderC0718Rp;
        this.f7674j = c0750Tn;
        this.f7675k = c0784Vn;
    }
}
