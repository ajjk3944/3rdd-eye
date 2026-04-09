package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class te extends y30 implements se {
    public final g40 j;

    public te(g40 g40Var) {
        this.j = g40Var;
    }

    @Override // defpackage.se
    public final boolean c(Throwable th) {
        return k().r(th);
    }

    @Override // defpackage.f30
    public final void d(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.j.o(k());
    }
}
