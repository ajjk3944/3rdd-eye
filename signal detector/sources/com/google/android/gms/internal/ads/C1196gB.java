package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1196gB implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f14223a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f14224b = null;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f14225c = WB.f12185a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0978cC f14226d;

    public C1196gB(C0978cC c0978cC) {
        this.f14226d = c0978cC;
        this.f14223a = c0978cC.f13540d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14223a.hasNext() || this.f14225c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f14225c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f14223a.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f14224b = collection;
            this.f14225c = collection.iterator();
        }
        return this.f14225c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f14225c.remove();
        Collection collection = this.f14224b;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f14223a.remove();
        }
        C0978cC c0978cC = this.f14226d;
        c0978cC.f13541e--;
    }
}
