package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dh0 implements w60, i60 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f10481c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int f10482d;

    /* renamed from: a, reason: collision with root package name */
    public final ya.c0 f10483a;

    /* renamed from: b, reason: collision with root package name */
    public final gh0 f10484b;

    public dh0(gh0 gh0Var, ya.c0 c0Var) {
        this.f10484b = gh0Var;
        this.f10483a = c0Var;
    }

    public final void a(boolean z3) {
        int i4;
        int iIntValue;
        pk pkVar = sk.W6;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && !this.f10483a.E()) {
            Object obj = f10481c;
            synchronized (obj) {
                i4 = f10482d;
                iIntValue = ((Integer) sVar.f36166c.a(sk.X6)).intValue();
            }
            if (i4 < iIntValue) {
                gh0 gh0Var = this.f10484b;
                pr0 pr0VarA = gh0Var.f11522d.a(new Bundle());
                pr0VarA.a(new q81(0, pr0VarA, new a4.d(gh0Var, z3)), fx.g);
                synchronized (obj) {
                    f10482d++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void e() {
        a(true);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void o(va.w1 w1Var) {
        a(false);
    }
}
