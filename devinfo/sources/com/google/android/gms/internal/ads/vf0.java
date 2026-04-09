package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vf0 implements n70, x80, w60 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17612a;

    /* renamed from: b, reason: collision with root package name */
    public final qd0 f17613b;

    public vf0(Context context, qd0 qd0Var) {
        this.f17612a = context;
        this.f17613b = qd0Var;
    }

    @Override // com.google.android.gms.internal.ads.x80
    public final void a(fb.o oVar) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16336t5)).booleanValue()) {
            b(this.f17612a);
        }
    }

    public final void b(Context context) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16287q5)).booleanValue()) {
            fx.f11274a.execute(new q81(28, this, context));
        }
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void e() {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16350u5)).booleanValue()) {
            b(this.f17612a);
        }
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void t(iu iuVar) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16319s5)).booleanValue()) {
            b(this.f17612a);
        }
    }

    @Override // com.google.android.gms.internal.ads.x80
    public final void k(String str) {
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void l(dq0 dq0Var) {
    }
}
