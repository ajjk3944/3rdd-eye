package oc;

import ir.f0;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: g, reason: collision with root package name */
    public final transient int f19279g;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f19280r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f19281x;

    public d(e eVar, int i10, int i11) {
        this.f19281x = eVar;
        this.f19279g = i10;
        this.f19280r = i11;
    }

    @Override // oc.a
    public final Object[] a() {
        return this.f19281x.a();
    }

    @Override // oc.a
    public final int b() {
        return this.f19281x.b() + this.f19279g;
    }

    @Override // oc.a
    public final int c() {
        return this.f19281x.b() + this.f19279g + this.f19280r;
    }

    @Override // oc.e, java.util.List
    /* renamed from: g */
    public final e subList(int i10, int i11) {
        f0.c0(i10, i11, this.f19280r);
        int i12 = this.f19279g;
        return this.f19281x.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        f0.b0(i10, this.f19280r);
        return this.f19281x.get(i10 + this.f19279g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19280r;
    }
}
