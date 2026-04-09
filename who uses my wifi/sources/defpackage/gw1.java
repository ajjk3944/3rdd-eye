package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gw1 extends mw1 {
    public final bx2 f;
    public final String g;

    public gw1(bx2 bx2Var, String str) {
        this.f = bx2Var;
        this.g = str;
    }

    @Override // defpackage.nw1
    public final void W(nx2 nx2Var) {
        bx2 bx2Var = this.f;
        if (bx2Var != null) {
            bx2Var.q(nx2Var.b());
        }
    }

    @Override // defpackage.nw1
    public final void d3(kw1 kw1Var) {
        bx2 bx2Var = this.f;
        if (bx2Var != null) {
            bx2Var.r(new hw1(kw1Var, this.g));
        }
    }

    @Override // defpackage.nw1
    public final void I(int i) {
    }
}
