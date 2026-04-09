package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.jC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1357jC extends RB {

    /* renamed from: d, reason: collision with root package name */
    public final transient C1465lC f14916d;

    /* renamed from: e, reason: collision with root package name */
    public final transient C1411kC f14917e;

    public C1357jC(C1465lC c1465lC, C1411kC c1411kC) {
        this.f14916d = c1465lC;
        this.f14917e = c1411kC;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final AbstractC1896tC a() {
        return this.f14917e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.HB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14916d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.RB, com.google.android.gms.internal.ads.HB
    public final LB e() {
        return this.f14917e;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final int g(Object[] objArr, int i) {
        return this.f14917e.g(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f14917e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14916d.f15367f;
    }
}
