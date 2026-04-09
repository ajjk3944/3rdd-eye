package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d00 implements ki, rj.d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10280a;

    /* renamed from: b, reason: collision with root package name */
    public int f10281b;

    public /* synthetic */ d00(int i4, boolean z3) {
        this.f10280a = z3;
        this.f10281b = i4;
    }

    @Override // rj.d
    public boolean a(rj.a aVar) {
        nk.k.e(aVar, "child");
        int length = aVar.f32986c.c().length();
        boolean z3 = false;
        if (!this.f10280a ? length < this.f10281b : length > this.f10281b) {
            z3 = true;
        }
        if (z3) {
            this.f10281b = length;
        }
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.ki
    public void l(hk hkVar) {
        int i4 = e00.f10631c0;
        wj wjVarB = xj.B();
        boolean zA = ((xj) wjVarB.f14755b).A();
        boolean z3 = this.f10280a;
        if (zA != z3) {
            wjVarB.b();
            ((xj) wjVarB.f14755b).C(z3);
        }
        int i10 = this.f10281b;
        wjVarB.b();
        ((xj) wjVarB.f14755b).D(i10);
        xj xjVar = (xj) wjVarB.e();
        hkVar.b();
        ((ik) hkVar.f14755b).J(xjVar);
    }

    @Override // rj.d
    public void reset() {
        this.f10281b = this.f10280a ? LinearLayoutManager.INVALID_OFFSET : Integer.MAX_VALUE;
    }

    public d00(boolean z3) {
        this.f10280a = z3;
        this.f10281b = z3 ? LinearLayoutManager.INVALID_OFFSET : Integer.MAX_VALUE;
    }
}
