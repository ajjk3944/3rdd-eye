package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class RegularImmutableSet<E> extends ImmutableSet<E> {

    /* renamed from: h, reason: collision with root package name */
    public static final Object[] f11952h;

    /* renamed from: i, reason: collision with root package name */
    public static final RegularImmutableSet f11953i;

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f11954c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f11955d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f11956e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f11957f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f11958g;

    static {
        Object[] objArr = new Object[0];
        f11952h = objArr;
        f11953i = new RegularImmutableSet(objArr, 0, objArr, 0, 0);
    }

    public RegularImmutableSet(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f11954c = objArr;
        this.f11955d = i10;
        this.f11956e = objArr2;
        this.f11957f = i11;
        this.f11958g = i12;
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList D() {
        return ImmutableList.u(this.f11954c, this.f11958g);
    }

    @Override // com.google.common.collect.ImmutableSet
    public boolean E() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f11954c, 0, objArr, i10, this.f11958g);
        return i10 + this.f11958g;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f11956e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iD = z.d(obj);
        while (true) {
            int i10 = iD & this.f11957f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iD = i10 + 1;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] d() {
        return this.f11954c;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int g() {
        return this.f11958g;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int h() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f11955d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: j */
    public v0 iterator() {
        return v().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f11958g;
    }
}
