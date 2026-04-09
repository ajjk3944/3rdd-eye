package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tz1 extends b02 implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f17019e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17020f;

    public tz1(int i4, ii iiVar, int i10, wz1 wz1Var, int i11) {
        int i12;
        super(i4, iiVar, i10);
        this.f17019e = d7.B(i11, wz1Var.B) ? 1 : 0;
        mx1 mx1Var = this.f9532d;
        int i13 = mx1Var.f14059t;
        int i14 = -1;
        if (i13 != -1 && (i12 = mx1Var.f14060u) != -1) {
            i14 = i13 * i12;
        }
        this.f17020f = i14;
    }

    @Override // com.google.android.gms.internal.ads.b02
    public final int a() {
        return this.f17019e;
    }

    @Override // com.google.android.gms.internal.ads.b02
    public final /* bridge */ /* synthetic */ boolean b(b02 b02Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f17020f, ((tz1) obj).f17020f);
    }
}
