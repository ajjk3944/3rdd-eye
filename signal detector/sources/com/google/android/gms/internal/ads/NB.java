package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class NB extends AbstractC1896tC {

    /* renamed from: b, reason: collision with root package name */
    public final JB f9973b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9974c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1896tC f9975d;

    public NB(TB tb) {
        super(0);
        Objects.requireNonNull(tb);
        this.f9973b = tb.f11356d.entrySet().e().listIterator(0);
        this.f9974c = null;
        this.f9975d = VB.f11964e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9975d.hasNext() || this.f9973b.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1896tC, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f9975d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f9973b.next();
            this.f9974c = entry.getKey();
            this.f9975d = ((HB) entry.getValue()).a();
        }
        Object obj = this.f9974c;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.f9975d.next());
    }
}
