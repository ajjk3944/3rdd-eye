package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mu0 implements Runnable {
    public final d60 f;
    public final t50 g;
    public boolean h;

    public mu0(d60 d60Var, t50 t50Var) {
        i30.m(d60Var, "registry");
        i30.m(t50Var, "event");
        this.f = d60Var;
        this.g = t50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.h) {
            return;
        }
        this.f.d(this.g);
        this.h = true;
    }
}
