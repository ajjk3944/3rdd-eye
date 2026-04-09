package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vm0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17650a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17651b;

    /* renamed from: c, reason: collision with root package name */
    public int f17652c;

    /* renamed from: d, reason: collision with root package name */
    public int f17653d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17654e;

    /* renamed from: f, reason: collision with root package name */
    public long f17655f;
    public final /* synthetic */ com.google.android.gms.internal.consent_sdk.d g;

    public vm0(com.google.android.gms.internal.consent_sdk.d dVar, int i4) {
        this.g = dVar;
        this.f17650a = i4;
    }

    public final void a() {
        long jZ1;
        com.google.android.gms.internal.consent_sdk.d dVar = this.g;
        it1 it1Var = (it1) dVar.f19295a;
        tg tgVar = (tg) dVar.f19298d;
        no0 no0Var = (no0) dVar.f19299e;
        uh uhVarL1 = it1Var.l1();
        Object objF = uhVarL1.g() ? null : uhVarL1.f(it1Var.n1());
        int iZ = it1Var.z();
        int iT1 = it1Var.t1();
        long jQ1 = it1Var.q1();
        if (objF == null || iZ != -1) {
            jZ1 = iZ != -1 ? it1Var.Z1() : -9223372036854775807L;
        } else {
            uhVarL1.o(objF, tgVar);
            jQ1 -= bq0.r(0L);
            jZ1 = bq0.r(tgVar.f16812d);
            iZ = -1;
        }
        boolean z3 = it1Var.e1() == 3 && it1Var.h1() && it1Var.f1() == 0;
        if (!z3 || jZ1 == -9223372036854775807L || jQ1 < jZ1) {
            no0Var.d(3);
            if (z3 && jZ1 != -9223372036854775807L) {
                it1Var.o0();
                no0Var.f14385a.sendEmptyMessageDelayed(3, (int) Math.ceil((jZ1 - jQ1) / it1Var.f12447a0.f10884o.f11094a));
            }
            this.f17654e = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f17654e;
        int i4 = this.f17650a;
        if (z10 && Objects.equals(objF, this.f17651b) && iZ == this.f17652c && iT1 == this.f17653d) {
            if (jElapsedRealtime - this.f17655f >= i4) {
                ((bt1) dVar.f19297c).f9804a.L1(new us1(2, new sn0(3, i4), 1003));
                return;
            }
            return;
        }
        this.f17654e = true;
        this.f17655f = jElapsedRealtime;
        this.f17651b = objF;
        this.f17652c = iZ;
        this.f17653d = iT1;
        no0Var.d(3);
        no0Var.f14385a.sendEmptyMessageDelayed(3, i4);
    }
}
