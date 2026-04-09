package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xg1 implements lf1 {
    public final /* synthetic */ int a;
    public final lf1 b;

    public xg1(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new eg1("image/png", 35152, 2);
                break;
            case 2:
                this.b = new gh1();
                break;
            default:
                this.b = new eg1("image/bmp", 16973, 2);
                break;
        }
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) {
        switch (this.a) {
            case 0:
                return ((eg1) this.b).b(mf1Var);
            case 1:
                return ((eg1) this.b).b(mf1Var);
            default:
                return ((gh1) this.b).b(mf1Var);
        }
    }

    @Override // defpackage.lf1
    public final int c(mf1 mf1Var, pf1 pf1Var) {
        switch (this.a) {
            case 0:
                return ((eg1) this.b).c(mf1Var, pf1Var);
            case 1:
                return ((eg1) this.b).c(mf1Var, pf1Var);
            default:
                return ((gh1) this.b).c(mf1Var, pf1Var);
        }
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        switch (this.a) {
            case 0:
                ((eg1) this.b).e(j, j2);
                break;
            case 1:
                ((eg1) this.b).e(j, j2);
                break;
            default:
                ((gh1) this.b).e(j, j2);
                break;
        }
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        switch (this.a) {
            case 0:
                ((eg1) this.b).f(nf1Var);
                break;
            case 1:
                ((eg1) this.b).f(nf1Var);
                break;
            default:
                ((gh1) this.b).b = nf1Var;
                break;
        }
    }
}
