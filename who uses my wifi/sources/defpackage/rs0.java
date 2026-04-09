package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rs0 implements y50, AutoCloseable {
    public final String f;
    public final qs0 g;
    public boolean h;

    public rs0(String str, qs0 qs0Var) {
        this.f = str;
        this.g = qs0Var;
    }

    @Override // defpackage.y50
    public final void a(b60 b60Var, t50 t50Var) {
        if (t50Var == t50.ON_DESTROY) {
            this.h = false;
            b60Var.e().f(this);
        }
    }

    public final void c(vq2 vq2Var, d60 d60Var) {
        i30.m(vq2Var, "registry");
        i30.m(d60Var, "lifecycle");
        if (this.h) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.h = true;
        d60Var.a(this);
        vq2Var.q(this.f, (pw) this.g.a.k);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
