package mq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class d0 extends f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16931a;

    public d0(ArrayList arrayList) {
        this.f16931a = arrayList;
    }

    @Override // mq.f
    public final int a() {
        return this.f16931a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f16931a.add(o.i0(i10, this), obj);
    }

    @Override // mq.f
    public final Object b(int i10) {
        return this.f16931a.remove(o.h0(i10, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f16931a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f16931a.get(o.h0(i10, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new c0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new c0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return this.f16931a.set(o.h0(i10, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new c0(this, i10);
    }
}
