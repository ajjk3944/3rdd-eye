package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ap3 implements Runnable {
    public final gp3 f;
    public final n70 g;

    public ap3(gp3 gp3Var, n70 n70Var) {
        this.f = gp3Var;
        this.g = n70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f.f != this) {
            return;
        }
        n70 n70Var = this.g;
        if (op3.l.L(this.f, this, gp3.h(n70Var))) {
            gp3.o(this.f, false);
        }
    }
}
