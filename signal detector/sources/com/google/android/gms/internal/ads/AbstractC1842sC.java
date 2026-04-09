package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.sC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1842sC implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f16691a;

    public AbstractC1842sC(Iterator it) {
        it.getClass();
        this.f16691a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16691a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f16691a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f16691a.remove();
    }
}
