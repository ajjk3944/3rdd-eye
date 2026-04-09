package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xv3 implements Iterable {
    public final /* synthetic */ List f;
    public final /* synthetic */ List g;

    public xv3(zv3 zv3Var, List list, List list2) {
        this.f = list;
        this.g = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new yv3(this.f.iterator(), this.g.iterator());
    }
}
