package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p0 extends q0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f19459c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f19460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q0 f19461e;

    public p0(q0 q0Var, int i4, int i10) {
        this.f19461e = q0Var;
        this.f19459c = i4;
        this.f19460d = i10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0
    public final int c() {
        return this.f19461e.d() + this.f19459c + this.f19460d;
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0
    public final int d() {
        return this.f19461e.d() + this.f19459c;
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0
    public final Object[] f() {
        return this.f19461e.f();
    }

    @Override // com.google.android.gms.internal.consent_sdk.q0, java.util.List
    /* renamed from: g */
    public final q0 subList(int i4, int i10) {
        l0.f(i4, i10, this.f19460d);
        int i11 = this.f19459c;
        return this.f19461e.subList(i4 + i11, i10 + i11);
    }

    @Override // java.util.List
    public final Object get(int i4) {
        l0.b(i4, this.f19460d);
        return this.f19461e.get(i4 + this.f19459c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19460d;
    }
}
