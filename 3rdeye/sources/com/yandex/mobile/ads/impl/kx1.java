package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lx1;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
final class kx1 extends lx1.d<Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set f29807b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Set f29808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx1(zj0 zj0Var, zj0 zj0Var2) {
        super(0);
        this.f29807b = zj0Var;
        this.f29808c = zj0Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f29807b.contains(obj) && this.f29808c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.f29807b.containsAll(collection) && this.f29808c.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f29808c, this.f29807b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new jx1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f29807b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f29808c.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
