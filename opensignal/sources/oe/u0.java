package oe;

import java.util.Objects;

/* loaded from: classes.dex */
public final class u0 extends h0 {

    /* renamed from: x, reason: collision with root package name */
    public static final u0 f19383x = new u0(0, new Object[0]);

    /* renamed from: g, reason: collision with root package name */
    public final transient Object[] f19384g;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f19385r;

    public u0(int i10, Object[] objArr) {
        this.f19384g = objArr;
        this.f19385r = i10;
    }

    @Override // oe.h0, oe.c0
    public final int b(int i10, Object[] objArr) {
        Object[] objArr2 = this.f19384g;
        int i11 = this.f19385r;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // oe.c0
    public final Object[] c() {
        return this.f19384g;
    }

    @Override // oe.c0
    public final int d() {
        return this.f19385r;
    }

    @Override // oe.c0
    public final int e() {
        return 0;
    }

    @Override // oe.c0
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ba.m.j(i10, this.f19385r);
        Object obj = this.f19384g[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19385r;
    }
}
