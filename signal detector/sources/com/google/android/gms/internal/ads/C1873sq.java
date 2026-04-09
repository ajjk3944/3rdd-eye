package com.google.android.gms.internal.ads;

import android.content.Context;
import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.sq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1873sq implements InterfaceC0956bq {

    /* renamed from: a, reason: collision with root package name */
    public final C0795Wh f16799a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16800b;

    /* renamed from: c, reason: collision with root package name */
    public final C0427An f16801c;

    /* renamed from: d, reason: collision with root package name */
    public final C0960bu f16802d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f16803e;

    /* renamed from: f, reason: collision with root package name */
    public final NA f16804f;

    /* renamed from: g, reason: collision with root package name */
    public final C0750Tn f16805g;

    public C1873sq(C0795Wh c0795Wh, Context context, Executor executor, C0427An c0427An, C0960bu c0960bu, NA na, C0750Tn c0750Tn) {
        this.f16800b = context;
        this.f16799a = c0795Wh;
        this.f16803e = executor;
        this.f16801c = c0427An;
        this.f16802d = c0960bu;
        this.f16804f = na;
        this.f16805g = c0750Tn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final boolean a(Xt xt, Qt qt) {
        Ut ut = qt.f10791s;
        return (ut == null || ut.f11811a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0956bq
    public final InterfaceFutureC2326a b(Xt xt, Qt qt) {
        return AbstractC1984ut.F(ED.f7928b, new C2028vj(this, xt, qt, 4), this.f16803e);
    }
}
