package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1479lQ extends AbstractC1353j8 {

    /* renamed from: b, reason: collision with root package name */
    public final C1241h2 f15411b;

    public C1479lQ(C1241h2 c1241h2) {
        this.f15411b = c1241h2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final U7 b(int i, U7 u7, long j6) {
        Object obj = U7.f11601m;
        u7.a(this.f15411b, false, true, null, -9223372036854775807L);
        u7.i = true;
        return u7;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final I7 d(int i, I7 i7, boolean z6) {
        Integer num = z6 ? 0 : null;
        Object obj = z6 ? C1425kQ.f15163e : null;
        C2023ve c2023ve = C2023ve.f17312b;
        i7.a(num, obj, 0, -9223372036854775807L, true);
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final int e(Object obj) {
        return obj == C1425kQ.f15163e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1353j8
    public final Object f(int i) {
        return C1425kQ.f15163e;
    }
}
