package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p extends q {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f20202c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f20203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f20204e;

    public p(q qVar, int i4, int i10) {
        this.f20204e = qVar;
        this.f20202c = i4;
        this.f20203d = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.n
    public final int c() {
        return this.f20204e.d() + this.f20202c + this.f20203d;
    }

    @Override // com.google.android.gms.internal.play_billing.n
    public final int d() {
        return this.f20204e.d() + this.f20202c;
    }

    @Override // com.google.android.gms.internal.play_billing.n
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        ii.a.H(i4, this.f20203d);
        return this.f20204e.get(i4 + this.f20202c);
    }

    @Override // com.google.android.gms.internal.play_billing.n
    public final Object[] i() {
        return this.f20204e.i();
    }

    @Override // com.google.android.gms.internal.play_billing.q, java.util.List
    /* renamed from: j */
    public final q subList(int i4, int i10) {
        ii.a.K(i4, i10, this.f20203d);
        int i11 = this.f20202c;
        return this.f20204e.subList(i4 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20203d;
    }
}
