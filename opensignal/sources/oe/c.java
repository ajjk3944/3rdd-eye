package oe;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f19303a;

    /* renamed from: d, reason: collision with root package name */
    public Object f19304d = null;

    /* renamed from: g, reason: collision with root package name */
    public Collection f19305g = null;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f19306r = n0.INSTANCE;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q0 f19307x;

    public c(q0 q0Var) {
        this.f19307x = q0Var;
        this.f19303a = q0Var.f19369r.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19303a.hasNext() || this.f19306r.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f19306r.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f19303a.next();
            this.f19304d = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f19305g = collection;
            this.f19306r = collection.iterator();
        }
        return this.f19306r.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f19306r.remove();
        Collection collection = this.f19305g;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f19303a.remove();
        }
        q0 q0Var = this.f19307x;
        q0Var.f19370x--;
    }
}
