package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w94 implements Iterator {
    public int f = 0;
    public final /* synthetic */ x94 g;

    public w94(x94 x94Var) {
        this.g = x94Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f;
        x94 x94Var = this.g;
        return i < x94Var.f.size() || x94Var.g.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        x94 x94Var = this.g;
        List list = x94Var.f;
        if (i >= list.size()) {
            list.add(x94Var.g.next());
            return next();
        }
        int i2 = this.f;
        this.f = i2 + 1;
        return list.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
