package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s9 implements c80, rd0, p7.d0, wb.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15909a;

    /* renamed from: b, reason: collision with root package name */
    public int f15910b;

    public /* synthetic */ s9(int i4) {
        this.f15909a = i4;
    }

    @Override // wb.b
    public int a(Context context, String str, boolean z3) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    @Override // p7.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(q7.a r21, float r22) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s9.b(q7.a, float):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c */
    public /* synthetic */ void mo162c(Object obj) {
        switch (this.f15909a) {
            case 2:
                ((xa.l) obj).e0(this.f15910b);
                break;
            case 6:
                ((ru1) obj).b(this.f15910b);
                break;
            case 7:
                ((ru1) obj).f(this.f15910b);
                break;
            default:
                ((ru1) obj).a(this.f15910b);
                break;
        }
    }

    public int d() {
        int i4 = this.f15910b;
        if (i4 == 2) {
            return 10;
        }
        if (i4 == 5) {
            return 11;
        }
        if (i4 == 29) {
            return 12;
        }
        if (i4 == 42) {
            return 16;
        }
        if (i4 != 22) {
            return i4 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    @Override // wb.b
    public int e(Context context, String str) {
        return this.f15910b;
    }

    public /* synthetic */ s9(int i4, int i10) {
        this.f15909a = i10;
        this.f15910b = i4;
    }

    public /* synthetic */ s9(s9 s9Var) {
        this.f15909a = 4;
        this.f15910b = s9Var.f15910b;
    }

    public /* synthetic */ s9(qu1 qu1Var, int i4) {
        this.f15909a = 7;
        this.f15910b = i4;
    }

    public /* synthetic */ s9(qu1 qu1Var, int i4, long j) {
        this.f15909a = 6;
        this.f15910b = i4;
    }

    public /* synthetic */ s9(qu1 qu1Var, int i4, ye yeVar, ye yeVar2) {
        this.f15909a = 8;
        this.f15910b = i4;
    }

    public s9() {
        this.f15909a = 11;
        this.f15910b = -1;
    }
}
