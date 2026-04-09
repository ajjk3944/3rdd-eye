package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bn0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9724a;

    /* renamed from: b, reason: collision with root package name */
    public int f9725b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9726c;

    /* renamed from: d, reason: collision with root package name */
    public long f9727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.consent_sdk.d f9728e;

    public bn0(com.google.android.gms.internal.consent_sdk.d dVar, int i4) {
        this.f9728e = dVar;
        this.f9724a = i4;
    }

    public final void a() {
        com.google.android.gms.internal.consent_sdk.d dVar = this.f9728e;
        it1 it1Var = (it1) dVar.f19295a;
        no0 no0Var = (no0) dVar.f19299e;
        int iF1 = it1Var.f1();
        it1 it1Var2 = (it1) dVar.f19295a;
        if (!it1Var2.h1() || it1Var2.e1() == 1 || it1Var2.e1() == 4 || iF1 == 0 || iF1 == 1) {
            if (this.f9726c) {
                no0Var.d(4);
            }
            this.f9726c = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = this.f9726c;
        int i4 = this.f9724a;
        if (z3 && this.f9725b == iF1) {
            if (jElapsedRealtime - this.f9727d >= i4) {
                ((bt1) dVar.f19297c).f9804a.L1(new us1(2, new sn0(4, i4), 1003));
                return;
            }
            return;
        }
        this.f9726c = true;
        this.f9727d = jElapsedRealtime;
        this.f9725b = iF1;
        no0Var.d(4);
        no0Var.f14385a.sendEmptyMessageDelayed(4, i4);
    }
}
