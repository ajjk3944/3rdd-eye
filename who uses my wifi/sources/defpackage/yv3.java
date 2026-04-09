package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yv3 implements Iterator {
    public final Iterator f;
    public final Iterator g;

    public /* synthetic */ yv3(Iterator it, Iterator it2) {
        this.f = it;
        this.g = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f.hasNext() || this.g.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f;
        return it.hasNext() ? it.next() : this.g.next();
    }
}
