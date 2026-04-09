package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ku0 implements Iterable, p40 {
    public final /* synthetic */ fo f;

    public ku0(fo foVar) {
        this.f = foVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new eo(this.f);
    }
}
