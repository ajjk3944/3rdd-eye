package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class KB extends LB {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f9468c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f9469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LB f9470e;

    public KB(LB lb, int i, int i3) {
        this.f9470e = lb;
        this.f9468c = i;
        this.f9469d = i3;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final Object[] b() {
        return this.f9470e.b();
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final int c() {
        return this.f9470e.c() + this.f9468c;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final int d() {
        return this.f9470e.c() + this.f9468c + this.f9469d;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0582Jp.k0(i, this.f9469d);
        return this.f9470e.get(i + this.f9468c);
    }

    @Override // com.google.android.gms.internal.ads.LB, java.util.List
    /* renamed from: h */
    public final LB subList(int i, int i3) {
        AbstractC0582Jp.m0(i, i3, this.f9469d);
        int i6 = this.f9468c;
        return this.f9470e.subList(i + i6, i3 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9469d;
    }
}
