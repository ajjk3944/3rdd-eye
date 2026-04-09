package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class OB extends AbstractC1896tC {

    /* renamed from: b, reason: collision with root package name */
    public final JB f10168b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1896tC f10169c;

    public OB(TB tb) {
        super(0);
        Objects.requireNonNull(tb);
        this.f10168b = ((LB) tb.f11356d.values()).listIterator(0);
        this.f10169c = VB.f11964e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10169c.hasNext() || this.f10168b.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1896tC, java.util.Iterator
    public final Object next() {
        if (!this.f10169c.hasNext()) {
            this.f10169c = ((HB) this.f10168b.next()).a();
        }
        return this.f10169c.next();
    }
}
