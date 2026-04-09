package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2169yF extends C2115xF {

    /* renamed from: d, reason: collision with root package name */
    public final long[] f17700d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2169yF(Vu vu) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        super(jArr, jArr2, jArr4);
        this.f17700d = jArr3;
        C2041vw c2041vw = (C2041vw) vu.f12105a;
        AbstractC2022vd.j(jArr, (long[]) c2041vw.f17370c, (long[]) c2041vw.f17369b);
        AbstractC2022vd.q(jArr2, (long[]) c2041vw.f17370c, (long[]) c2041vw.f17369b);
        System.arraycopy((long[]) c2041vw.f17371d, 0, jArr3, 0, 10);
        AbstractC2022vd.G(jArr4, (long[]) vu.f12106b, AbstractC2223zF.f17843b);
    }

    @Override // com.google.android.gms.internal.ads.C2115xF
    public final void a(long[] jArr, long[] jArr2) {
        AbstractC2022vd.G(jArr, jArr2, this.f17700d);
    }
}
