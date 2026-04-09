package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v90 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17565a;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f17566b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f17567c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f17568d;

    /* renamed from: e, reason: collision with root package name */
    public final js1 f17569e;

    public /* synthetic */ v90(es1 es1Var, es1 es1Var2, es1 es1Var3, Object obj, int i4) {
        this.f17565a = i4;
        this.f17566b = es1Var;
        this.f17567c = es1Var2;
        this.f17568d = es1Var3;
        this.f17569e = (js1) obj;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f17565a) {
            case 0:
                vg vgVar = (vg) this.f17566b.a();
                Executor executor = (Executor) this.f17567c.a();
                Context context = (Context) this.f17568d.a();
                return new m30(executor, new f30(context, vgVar), (tb.a) this.f17569e.a());
            default:
                cs1 cs1VarC = es1.c(this.f17566b);
                g21 g21Var = (g21) this.f17567c.a();
                return new t11(cs1VarC, g21Var, ((sx0) this.f17569e.a()).M().B());
        }
    }
}
