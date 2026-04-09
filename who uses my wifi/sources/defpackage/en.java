package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class en extends ht implements Executor {
    public static final en h = new en();
    public static final lk i;

    static {
        lk g60Var = a41.h;
        int i2 = wz0.a;
        if (64 >= i2) {
            i2 = 64;
        }
        int iW = zt0.w("kotlinx.coroutines.io.parallelism", i2, 12);
        g60Var.getClass();
        if (iW < 1) {
            throw new IllegalArgumentException(ex0.f("Expected positive parallelism level, but got ", iW).toString());
        }
        if (iW < o01.d) {
            if (iW < 1) {
                throw new IllegalArgumentException(ex0.f("Expected positive parallelism level, but got ", iW).toString());
            }
            g60Var = new g60(g60Var, iW);
        }
        i = g60Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        k(ls.f, runnable);
    }

    @Override // defpackage.lk
    public final void k(hk hkVar, Runnable runnable) {
        i.k(hkVar, runnable);
    }

    @Override // defpackage.lk
    public final String toString() {
        return "Dispatchers.IO";
    }
}
