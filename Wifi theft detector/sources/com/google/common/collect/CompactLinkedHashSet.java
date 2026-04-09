package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
class CompactLinkedHashSet<E> extends CompactHashSet<E> {

    /* renamed from: f, reason: collision with root package name */
    public transient int[] f11716f;

    /* renamed from: g, reason: collision with root package name */
    public transient int[] f11717g;

    /* renamed from: h, reason: collision with root package name */
    public transient int f11718h;

    /* renamed from: i, reason: collision with root package name */
    public transient int f11719i;

    public CompactLinkedHashSet(int i10) {
        super(i10);
    }

    public static CompactLinkedHashSet N(int i10) {
        return new CompactLinkedHashSet(i10);
    }

    @Override // com.google.common.collect.CompactHashSet
    public void A(int i10) {
        super.A(i10);
        this.f11718h = -2;
        this.f11719i = -2;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void B(int i10, Object obj, int i11, int i12) {
        super.B(i10, obj, i11, i12);
        S(this.f11719i, i10);
        S(i10, -2);
    }

    @Override // com.google.common.collect.CompactHashSet
    public void C(int i10, int i11) {
        int size = size() - 1;
        super.C(i10, i11);
        S(O(i10), x(i10));
        if (i10 < size) {
            S(O(size), i10);
            S(i10, x(size));
        }
        P()[size] = 0;
        Q()[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void H(int i10) {
        super.H(i10);
        this.f11716f = Arrays.copyOf(P(), i10);
        this.f11717g = Arrays.copyOf(Q(), i10);
    }

    public final int O(int i10) {
        return P()[i10] - 1;
    }

    public final int[] P() {
        int[] iArr = this.f11716f;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int[] Q() {
        int[] iArr = this.f11717g;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final void R(int i10, int i11) {
        P()[i10] = i11 + 1;
    }

    public final void S(int i10, int i11) {
        if (i10 == -2) {
            this.f11718h = i11;
        } else {
            T(i10, i11);
        }
        if (i11 == -2) {
            this.f11719i = i10;
        } else {
            R(i11, i10);
        }
    }

    public final void T(int i10, int i11) {
        Q()[i10] = i11 + 1;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (D()) {
            return;
        }
        this.f11718h = -2;
        this.f11719i = -2;
        int[] iArr = this.f11716f;
        if (iArr != null && this.f11717g != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f11717g, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashSet
    public int d(int i10, int i11) {
        return i10 >= size() ? i11 : i10;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int g() {
        int iG = super.g();
        this.f11716f = new int[iG];
        this.f11717g = new int[iG];
        return iG;
    }

    @Override // com.google.common.collect.CompactHashSet
    public Set h() {
        Set setH = super.h();
        this.f11716f = null;
        this.f11717g = null;
        return setH;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return g0.f(this);
    }

    @Override // com.google.common.collect.CompactHashSet
    public int w() {
        return this.f11718h;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int x(int i10) {
        return Q()[i10] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        return g0.g(this, objArr);
    }
}
