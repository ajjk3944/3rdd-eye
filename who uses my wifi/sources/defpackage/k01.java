package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k01 {
    public final gi4 a = new gi4();

    public final void a(Exception exc) {
        gi4 gi4Var = this.a;
        gi4Var.getClass();
        ou1.k(exc, "Exception must not be null");
        synchronized (gi4Var.a) {
            try {
                if (gi4Var.c) {
                    return;
                }
                gi4Var.c = true;
                gi4Var.f = exc;
                gi4Var.b.g(gi4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
