package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gk3 {
    public final pg3 a;

    public gk3(rf3 rf3Var, pg3 pg3Var) {
        this.a = pg3Var;
    }

    public final fk3 a(int i) {
        return new fk3(i, this.a);
    }

    public final void b(int i) {
        ((wg3) this.a).b(i - 1, -1L, null, null);
    }

    public final void c(int i, Throwable th) {
        ((wg3) this.a).b(i - 1, -1L, th, null);
    }

    public final void d(int i, n70 n70Var) {
        fk3 fk3VarA = a(i);
        fk3VarA.a();
        n70Var.c(new jq3(n70Var, new vg0(this, fk3VarA), 0), dq3.f);
    }

    public final void e(int i, Runnable runnable) {
        try {
            a(i).a();
            runnable.run();
        } finally {
        }
    }
}
