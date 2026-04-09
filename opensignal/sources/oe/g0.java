package oe;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class g0 extends h0 {

    /* renamed from: g, reason: collision with root package name */
    public final transient int f19332g;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f19333r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h0 f19334x;

    public g0(h0 h0Var, int i10, int i11) {
        this.f19334x = h0Var;
        this.f19332g = i10;
        this.f19333r = i11;
    }

    @Override // oe.c0
    public final Object[] c() {
        return this.f19334x.c();
    }

    @Override // oe.c0
    public final int d() {
        return this.f19334x.e() + this.f19332g + this.f19333r;
    }

    @Override // oe.c0
    public final int e() {
        return this.f19334x.e() + this.f19332g;
    }

    @Override // oe.c0
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ba.m.j(i10, this.f19333r);
        return this.f19334x.get(i10 + this.f19332g);
    }

    @Override // oe.h0, oe.c0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // oe.h0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // oe.h0, java.util.List
    /* renamed from: s */
    public final h0 subList(int i10, int i11) {
        ba.m.m(i10, i11, this.f19333r);
        int i12 = this.f19332g;
        return this.f19334x.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19333r;
    }

    @Override // oe.h0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
