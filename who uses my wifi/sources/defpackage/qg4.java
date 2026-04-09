package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qg4 implements li4 {
    public final li4 a;
    public boolean b;
    public final /* synthetic */ rg4 c;

    public qg4(rg4 rg4Var, li4 li4Var) {
        this.c = rg4Var;
        this.a = li4Var;
    }

    @Override // defpackage.li4
    public final int a(mr2 mr2Var, vw3 vw3Var, int i) {
        rg4 rg4Var = this.c;
        if (rg4Var.n()) {
            return -3;
        }
        if (this.b) {
            vw3Var.b = 4;
            return -4;
        }
        long j = rg4Var.j();
        int iA = this.a.a(mr2Var, vw3Var, i);
        if (iA != -5) {
            long j2 = rg4Var.j;
            if (j2 == Long.MIN_VALUE || ((iA != -4 || vw3Var.g < j2) && !(iA == -3 && j == Long.MIN_VALUE && !vw3Var.f))) {
                return iA;
            }
            vw3Var.i();
            vw3Var.b = 4;
            this.b = true;
            return -4;
        }
        ph4 ph4Var = (ph4) mr2Var.h;
        ph4Var.getClass();
        int i2 = ph4Var.I;
        int i3 = ph4Var.H;
        if (i3 == 0) {
            if (i2 == 0) {
                return -5;
            }
            i3 = 0;
        }
        if (rg4Var.j != Long.MIN_VALUE) {
            i2 = 0;
        }
        gg4 gg4Var = new gg4(ph4Var);
        gg4Var.G = i3;
        gg4Var.H = i2;
        mr2Var.h = new ph4(gg4Var);
        return -5;
    }

    @Override // defpackage.li4
    public final boolean d() {
        return !this.c.n() && this.a.d();
    }

    @Override // defpackage.li4
    public final int f(long j) {
        if (this.c.n()) {
            return -3;
        }
        return this.a.f(j);
    }

    @Override // defpackage.li4
    public final void h() {
        this.a.h();
    }
}
