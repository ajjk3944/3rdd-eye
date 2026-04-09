package oe;

import java.util.Objects;

/* loaded from: classes.dex */
public final class y0 extends h0 {

    /* renamed from: g, reason: collision with root package name */
    public final transient Object[] f19402g;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f19403r;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f19404x;

    public y0(Object[] objArr, int i10, int i11) {
        this.f19402g = objArr;
        this.f19403r = i10;
        this.f19404x = i11;
    }

    @Override // oe.c0
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ba.m.j(i10, this.f19404x);
        Object obj = this.f19402g[(i10 * 2) + this.f19403r];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19404x;
    }
}
