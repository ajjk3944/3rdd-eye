package com.google.common.collect;

import java.util.Objects;
import m4.AbstractC6769h;

/* loaded from: classes3.dex */
class I extends AbstractC5069o {

    /* renamed from: e, reason: collision with root package name */
    static final AbstractC5069o f38321e = new I(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f38322c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f38323d;

    I(Object[] objArr, int i10) {
        this.f38322c = objArr;
        this.f38323d = i10;
    }

    @Override // com.google.common.collect.AbstractC5069o, com.google.common.collect.AbstractC5068n
    int g(Object[] objArr, int i10) {
        System.arraycopy(this.f38322c, 0, objArr, i10, this.f38323d);
        return i10 + this.f38323d;
    }

    @Override // java.util.List
    public Object get(int i10) {
        AbstractC6769h.g(i10, this.f38323d);
        Object obj = this.f38322c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.AbstractC5068n
    Object[] j() {
        return this.f38322c;
    }

    @Override // com.google.common.collect.AbstractC5068n
    int m() {
        return this.f38323d;
    }

    @Override // com.google.common.collect.AbstractC5068n
    int o() {
        return 0;
    }

    @Override // com.google.common.collect.AbstractC5068n
    boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f38323d;
    }
}
