package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.kQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1425kQ extends AbstractC1211gQ {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f15163e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f15164c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15165d;

    public C1425kQ(AbstractC1353j8 abstractC1353j8, Object obj, Object obj2) {
        super(abstractC1353j8);
        this.f15164c = obj;
        this.f15165d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1211gQ, com.google.android.gms.internal.ads.AbstractC1353j8
    public final U7 b(int i, U7 u7, long j6) {
        this.f14270b.b(i, u7, j6);
        if (Objects.equals(u7.f11603a, this.f15164c)) {
            u7.f11603a = U7.f11601m;
        }
        return u7;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1211gQ, com.google.android.gms.internal.ads.AbstractC1353j8
    public final I7 d(int i, I7 i7, boolean z6) {
        this.f14270b.d(i, i7, z6);
        if (Objects.equals(i7.f9071b, this.f15165d) && z6) {
            i7.f9071b = f15163e;
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1211gQ, com.google.android.gms.internal.ads.AbstractC1353j8
    public final int e(Object obj) {
        Object obj2;
        if (f15163e.equals(obj) && (obj2 = this.f15165d) != null) {
            obj = obj2;
        }
        return this.f14270b.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1211gQ, com.google.android.gms.internal.ads.AbstractC1353j8
    public final Object f(int i) {
        Object objF = this.f14270b.f(i);
        return Objects.equals(objF, this.f15165d) ? f15163e : objF;
    }
}
