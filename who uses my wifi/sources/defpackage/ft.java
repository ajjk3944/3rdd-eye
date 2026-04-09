package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ft extends lk {
    public long h;
    public boolean i;
    public l8 j;

    public final void m() {
        long j = this.h - 4294967296L;
        this.h = j;
        if (j <= 0 && this.i) {
            shutdown();
        }
    }

    public abstract Thread n();

    public final void o(boolean z) {
        this.h = (z ? 4294967296L : 1L) + this.h;
        if (z) {
            return;
        }
        this.i = true;
    }

    public final boolean p() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        l8 l8Var = this.j;
        if (l8Var == null) {
            return false;
        }
        ep epVar = (ep) (l8Var.isEmpty() ? null : l8Var.removeFirst());
        if (epVar == null) {
            return false;
        }
        epVar.run();
        return true;
    }

    public void q(long j, ct ctVar) {
        an.n.v(j, ctVar);
    }

    public abstract void shutdown();
}
