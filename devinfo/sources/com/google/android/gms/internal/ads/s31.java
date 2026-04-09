package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s31 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f15854a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f15855b = null;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f15856c = j51.f12642a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p51 f15857d;

    public s31(p51 p51Var) {
        this.f15857d = p51Var;
        this.f15854a = p51Var.f14901d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15854a.hasNext() || this.f15856c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f15856c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f15854a.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f15855b = collection;
            this.f15856c = collection.iterator();
        }
        return this.f15856c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f15856c.remove();
        Collection collection = this.f15855b;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f15854a.remove();
        }
        p51 p51Var = this.f15857d;
        p51Var.f14902e--;
    }
}
