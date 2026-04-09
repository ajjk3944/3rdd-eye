package com.google.common.collect;

import m4.AbstractC6769h;

/* loaded from: classes3.dex */
final class N extends r {

    /* renamed from: c, reason: collision with root package name */
    final transient Object f38352c;

    N(Object obj) {
        this.f38352c = AbstractC6769h.i(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: T */
    public S iterator() {
        return w.c(this.f38352c);
    }

    @Override // com.google.common.collect.AbstractC5068n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f38352c.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC5068n
    int g(Object[] objArr, int i10) {
        objArr[i10] = this.f38352c;
        return i10 + 1;
    }

    @Override // com.google.common.collect.r, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f38352c.hashCode();
    }

    @Override // com.google.common.collect.AbstractC5068n
    boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String string = this.f38352c.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2);
        sb2.append('[');
        sb2.append(string);
        sb2.append(']');
        return sb2.toString();
    }
}
