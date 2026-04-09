package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class yp0 extends v72<Object> {

    /* renamed from: b, reason: collision with root package name */
    boolean f35947b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f35948c;

    public yp0(Object obj) {
        this.f35948c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f35947b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f35947b) {
            throw new NoSuchElementException();
        }
        this.f35947b = true;
        return this.f35948c;
    }
}
