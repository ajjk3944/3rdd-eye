package j$.util;

import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public class p extends n implements java.util.List, List {
    private static final long serialVersionUID = -283967356065247728L;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f26437b;

    public p(java.util.List list) {
        super(list);
        this.f26437b = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || this.f26437b.equals(obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f26437b.hashCode();
    }

    @Override // java.util.List
    public final Object get(int i4) {
        return this.f26437b.get(i4);
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f26437b.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f26437b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i4, java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new o(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        return new o(this, i4);
    }

    @Override // java.util.List
    public java.util.List subList(int i4, int i10) {
        return new p(this.f26437b.subList(i4, i10));
    }

    private Object readResolve() {
        java.util.List list = this.f26437b;
        return list instanceof RandomAccess ? new v(list) : this;
    }
}
