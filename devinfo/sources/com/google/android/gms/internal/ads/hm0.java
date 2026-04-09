package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hm0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11918a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11919b;

    /* renamed from: c, reason: collision with root package name */
    public int f11920c;

    /* renamed from: d, reason: collision with root package name */
    public int f11921d;

    /* renamed from: e, reason: collision with root package name */
    public long f11922e;

    /* renamed from: f, reason: collision with root package name */
    public long f11923f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public long f11924h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.consent_sdk.d f11925i;

    public hm0(com.google.android.gms.internal.consent_sdk.d dVar, int i4) {
        this.f11925i = dVar;
        this.f11918a = i4;
    }

    public final void a() {
        Object obj;
        com.google.android.gms.internal.consent_sdk.d dVar = this.f11925i;
        it1 it1Var = (it1) dVar.f19295a;
        no0 no0Var = (no0) dVar.f19299e;
        if (it1Var.e1() != 2 || !it1Var.h1() || it1Var.f1() != 0) {
            if (this.g) {
                no0Var.d(1);
            }
            this.g = false;
            return;
        }
        uh uhVarL1 = it1Var.l1();
        Object objF = uhVarL1.g() ? null : uhVarL1.f(it1Var.n1());
        int iZ = it1Var.z();
        int iT1 = it1Var.t1();
        long jB2 = it1Var.b2();
        long jMax = Math.max(0L, it1Var.r1() - Math.max(0L, jB2 - it1Var.q1()));
        if (objF != null && iZ == -1) {
            uhVarL1.o(objF, (tg) dVar.f19298d);
            jB2 -= bq0.r(0L);
            iZ = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = this.g;
        int i4 = this.f11918a;
        if (z3 && Objects.equals(objF, this.f11919b) && iZ == this.f11920c && iT1 == this.f11921d) {
            obj = objF;
            if (jB2 == this.f11922e && jMax == this.f11923f) {
                if (jElapsedRealtime - this.f11924h >= i4) {
                    ((bt1) dVar.f19297c).f9804a.L1(new us1(2, new sn0(1, i4), 1003));
                    return;
                }
                return;
            }
        } else {
            obj = objF;
        }
        this.g = true;
        this.f11924h = jElapsedRealtime;
        this.f11919b = obj;
        this.f11920c = iZ;
        this.f11921d = iT1;
        this.f11922e = jB2;
        this.f11923f = jMax;
        no0Var.d(1);
        no0Var.f14385a.sendEmptyMessageDelayed(1, i4);
    }
}
