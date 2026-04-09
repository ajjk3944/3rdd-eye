package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class in0 implements d81, st1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12385a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12386b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12387c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12388d;

    /* renamed from: e, reason: collision with root package name */
    public Object f12389e;

    /* renamed from: f, reason: collision with root package name */
    public Object f12390f;

    public /* synthetic */ in0(kn0 kn0Var, String str, List list, Bundle bundle, boolean z3, boolean z10) {
        this.f12387c = kn0Var;
        this.f12388d = str;
        this.f12389e = list;
        this.f12390f = bundle;
        this.f12385a = z3;
        this.f12386b = z10;
    }

    @Override // com.google.android.gms.internal.ads.st1
    public fc A1() {
        st1 st1Var = (st1) this.f12390f;
        return st1Var != null ? st1Var.A1() : (fc) ((pu1) this.f12387c).f15116e;
    }

    @Override // com.google.android.gms.internal.ads.st1
    public void a(fc fcVar) {
        st1 st1Var = (st1) this.f12390f;
        if (st1Var != null) {
            st1Var.a(fcVar);
            fcVar = ((st1) this.f12390f).A1();
        }
        ((pu1) this.f12387c).a(fcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.d81
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vd.b mo166b() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.in0.mo166b():vd.b");
    }

    public void c(pr1 pr1Var) {
        st1 st1Var;
        st1 st1VarX = pr1Var.x();
        if (st1VarX == null || st1VarX == (st1Var = (st1) this.f12390f)) {
            return;
        }
        if (st1Var != null) {
            throw new us1(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f12390f = st1VarX;
        this.f12389e = pr1Var;
        ((mw1) st1VarX).a((fc) ((pu1) this.f12387c).f15116e);
    }

    @Override // com.google.android.gms.internal.ads.st1
    public long e() {
        if (this.f12385a) {
            return ((pu1) this.f12387c).e();
        }
        st1 st1Var = (st1) this.f12390f;
        st1Var.getClass();
        return st1Var.e();
    }

    @Override // com.google.android.gms.internal.ads.st1
    public boolean z1() {
        if (this.f12385a) {
            return false;
        }
        st1 st1Var = (st1) this.f12390f;
        st1Var.getClass();
        return st1Var.z1();
    }

    public in0(nt1 nt1Var) {
        this.f12388d = nt1Var;
        pu1 pu1Var = new pu1();
        pu1Var.f15116e = fc.f11093d;
        this.f12387c = pu1Var;
        this.f12385a = true;
    }
}
