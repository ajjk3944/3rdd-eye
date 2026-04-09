package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class XB extends AbstractC1896tC {

    /* renamed from: b, reason: collision with root package name */
    public final Object f12403b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12404c;

    public XB(Object obj) {
        super(0);
        this.f12403b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f12404c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1896tC, java.util.Iterator
    public final Object next() {
        if (this.f12404c) {
            throw new NoSuchElementException();
        }
        this.f12404c = true;
        return this.f12403b;
    }
}
