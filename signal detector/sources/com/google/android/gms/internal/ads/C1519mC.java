package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.mC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1519mC extends RB {
    public static final Object[] i;

    /* renamed from: j, reason: collision with root package name */
    public static final C1519mC f15594j;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f15595d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f15596e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f15597f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f15598g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f15599h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        f15594j = new C1519mC(0, 0, 0, objArr, objArr);
    }

    public C1519mC(int i3, int i6, int i7, Object[] objArr, Object[] objArr2) {
        this.f15595d = objArr;
        this.f15596e = i3;
        this.f15597f = objArr2;
        this.f15598g = i6;
        this.f15599h = i7;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final AbstractC1896tC a() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final Object[] b() {
        return this.f15595d;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.HB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f15597f;
            if (objArr.length != 0) {
                int iR = AbstractC1984ut.r(obj);
                while (true) {
                    int i3 = iR & this.f15598g;
                    Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iR = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final int d() {
        return this.f15599h;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final int g(Object[] objArr, int i3) {
        Object[] objArr2 = this.f15595d;
        int i6 = this.f15599h;
        System.arraycopy(objArr2, 0, objArr, i3, i6);
        return i3 + i6;
    }

    @Override // com.google.android.gms.internal.ads.RB, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15596e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.RB
    public final LB l() {
        return LB.o(this.f15599h, this.f15595d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15599h;
    }
}
