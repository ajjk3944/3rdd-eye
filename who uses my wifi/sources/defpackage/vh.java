package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vh implements hu0 {
    public final AtomicReference a;

    public vh(hu0 hu0Var) {
        this.a = new AtomicReference(hu0Var);
    }

    @Override // defpackage.hu0
    public final Iterator iterator() {
        hu0 hu0Var = (hu0) this.a.getAndSet(null);
        if (hu0Var != null) {
            return hu0Var.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
