package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zm3 extends yq2 {
    public final vm3 g;
    public Object h;
    public yq2 i;

    public zm3(fn3 fn3Var) {
        super(1);
        Objects.requireNonNull(fn3Var);
        this.g = fn3Var.i.entrySet().e().listIterator(0);
        this.h = null;
        this.i = hn3.j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i.hasNext() || this.g.hasNext();
    }

    @Override // defpackage.yq2, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.i.hasNext()) {
            Map.Entry entry = (Map.Entry) this.g.next();
            this.h = entry.getKey();
            this.i = ((tm3) entry.getValue()).a();
        }
        Object obj = this.h;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.i.next());
    }
}
