package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class eo3 implements Iterator {
    public final Iterator f;

    public eo3(Iterator it) {
        it.getClass();
        this.f = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f.remove();
    }
}
