package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ij2 implements um2 {
    public final a83 f;
    public final id2 g;

    public ij2(a83 a83Var, id2 id2Var) {
        this.f = a83Var;
        this.g = id2Var;
    }

    @Override // defpackage.um2
    public final void T() {
        if (this.f.r0) {
            id2 id2Var = this.g;
            synchronized (id2Var.f) {
                hd2 hd2Var = id2Var.i;
                synchronized (hd2Var.f) {
                    hd2Var.k++;
                }
            }
        }
    }

    @Override // defpackage.um2
    public final void a() {
    }

    @Override // defpackage.um2
    public final void b() {
    }

    @Override // defpackage.um2
    public final void c() {
    }

    @Override // defpackage.um2
    public final void r() {
    }

    @Override // defpackage.um2
    public final void J(ka2 ka2Var, String str, String str2) {
    }
}
