package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v implements Runnable {
    public final ou0 f;
    public final n70 g;

    public v(ou0 ou0Var, n70 n70Var) {
        this.f = ou0Var;
        this.g = n70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f.f != this) {
            return;
        }
        if (y.k.e(this.f, this, y.f(this.g))) {
            y.b(this.f);
        }
    }
}
