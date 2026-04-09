package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class an3 extends yq2 {
    public final vm3 g;
    public yq2 h;

    public an3(fn3 fn3Var) {
        super(1);
        Objects.requireNonNull(fn3Var);
        this.g = ((xm3) fn3Var.i.values()).listIterator(0);
        this.h = hn3.j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h.hasNext() || this.g.hasNext();
    }

    @Override // defpackage.yq2, java.util.Iterator
    public final Object next() {
        if (!this.h.hasNext()) {
            this.h = ((tm3) this.g.next()).a();
        }
        return this.h.next();
    }
}
