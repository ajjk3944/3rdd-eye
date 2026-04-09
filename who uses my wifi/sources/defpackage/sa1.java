package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sa1 implements Runnable {
    public final ta1 f;
    public final String g;

    public sa1(ta1 ta1Var, String str) {
        this.f = ta1Var;
        this.g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f.d) {
            try {
                if (((sa1) this.f.b.remove(this.g)) != null) {
                    ra1 ra1Var = (ra1) this.f.c.remove(this.g);
                    if (ra1Var != null) {
                        h80 h80VarD = h80.d();
                        int i = ao.o;
                        h80VarD.a(new Throwable[0]);
                        ((ao) ra1Var).f();
                    }
                } else {
                    h80.d().a(new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
