package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rl3 implements Iterator {
    public final Iterator f;
    public Collection g = null;
    public Iterator h = in3.f;
    public final /* synthetic */ pn3 i;

    public rl3(pn3 pn3Var) {
        this.i = pn3Var;
        this.f = pn3Var.i.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f.hasNext() || this.h.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.h.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.g = collection;
            this.h = collection.iterator();
        }
        return this.h.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.h.remove();
        Collection collection = this.g;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f.remove();
        }
        pn3 pn3Var = this.i;
        pn3Var.j--;
    }
}
