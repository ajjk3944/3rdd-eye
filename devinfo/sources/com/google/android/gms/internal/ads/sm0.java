package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sm0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16472a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16473b;

    /* renamed from: c, reason: collision with root package name */
    public int f16474c;

    /* renamed from: d, reason: collision with root package name */
    public int f16475d;

    /* renamed from: e, reason: collision with root package name */
    public long f16476e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16477f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.consent_sdk.d f16478h;

    public sm0(com.google.android.gms.internal.consent_sdk.d dVar, int i4) {
        this.f16478h = dVar;
        this.f16472a = i4;
    }

    public final void a() {
        com.google.android.gms.internal.consent_sdk.d dVar = this.f16478h;
        it1 it1Var = (it1) dVar.f19295a;
        no0 no0Var = (no0) dVar.f19299e;
        if (it1Var.e1() != 3 || !it1Var.h1() || it1Var.f1() != 0) {
            if (this.f16477f) {
                no0Var.d(2);
            }
            this.f16477f = false;
            return;
        }
        uh uhVarL1 = it1Var.l1();
        Object objF = uhVarL1.g() ? null : uhVarL1.f(it1Var.n1());
        int iZ = it1Var.z();
        int iT1 = it1Var.t1();
        long jQ1 = it1Var.q1();
        if (objF != null && iZ == -1) {
            uhVarL1.o(objF, (tg) dVar.f19298d);
            jQ1 -= bq0.r(0L);
            iZ = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = this.f16477f;
        int i4 = this.f16472a;
        if (z3 && Objects.equals(objF, this.f16473b) && iZ == this.f16474c && iT1 == this.f16475d && jQ1 == this.f16476e) {
            if (jElapsedRealtime - this.g >= i4) {
                ((bt1) dVar.f19297c).f9804a.L1(new us1(2, new sn0(2, i4), 1003));
                return;
            }
            return;
        }
        this.f16477f = true;
        this.g = jElapsedRealtime;
        this.f16473b = objF;
        this.f16474c = iZ;
        this.f16475d = iT1;
        this.f16476e = jQ1;
        no0Var.d(2);
        no0Var.f14385a.sendEmptyMessageDelayed(2, i4);
    }
}
