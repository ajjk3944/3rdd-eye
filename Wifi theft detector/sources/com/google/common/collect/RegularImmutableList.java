package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Objects;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
class RegularImmutableList<E> extends ImmutableList<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final ImmutableList f11936e = new RegularImmutableList(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f11937c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f11938d;

    public RegularImmutableList(Object[] objArr, int i10) {
        this.f11937c = objArr;
        this.f11938d = i10;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public int b(Object[] objArr, int i10) {
        System.arraycopy(this.f11937c, 0, objArr, i10, this.f11938d);
        return i10 + this.f11938d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] d() {
        return this.f11937c;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int g() {
        return this.f11938d;
    }

    @Override // java.util.List
    public Object get(int i10) {
        com.google.common.base.g.k(i10, this.f11938d);
        Object obj = this.f11937c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int h() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11938d;
    }
}
