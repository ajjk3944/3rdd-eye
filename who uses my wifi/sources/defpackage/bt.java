package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bt extends ct {
    public final u11 h;

    public bt(long j, u11 u11Var) {
        this.f = j;
        this.g = -1;
        this.h = u11Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.h.run();
    }

    @Override // defpackage.ct
    public final String toString() {
        return super.toString() + this.h;
    }
}
