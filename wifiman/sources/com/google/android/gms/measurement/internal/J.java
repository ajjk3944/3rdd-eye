package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
final class J implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f35935a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ K f35936b;

    J(K k10) {
        this.f35936b = k10;
        this.f35935a = k10.f35952a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35935a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f35935a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
