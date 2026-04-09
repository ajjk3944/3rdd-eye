package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class u0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f12071a;

    public u0(Iterator it) {
        this.f12071a = (Iterator) com.google.common.base.g.m(it);
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12071a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f12071a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12071a.remove();
    }
}
