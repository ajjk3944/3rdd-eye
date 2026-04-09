package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class g21 extends zt0 {
    public final /* synthetic */ int p;
    public boolean q;
    public int r;
    public final /* synthetic */ Object s;

    public g21(h21 h21Var, int i) {
        this.p = 0;
        this.s = h21Var;
        this.r = i;
        this.q = false;
    }

    @Override // defpackage.y61
    public final void b() {
        switch (this.p) {
            case 0:
                if (!this.q) {
                    ((h21) this.s).a.setVisibility(this.r);
                    break;
                }
                break;
            default:
                int i = this.r + 1;
                this.r = i;
                x61 x61Var = (x61) this.s;
                if (i == x61Var.a.size()) {
                    y61 y61Var = x61Var.d;
                    if (y61Var != null) {
                        y61Var.b();
                    }
                    this.r = 0;
                    this.q = false;
                    x61Var.e = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.zt0, defpackage.y61
    public void c() {
        switch (this.p) {
            case 0:
                this.q = true;
                break;
        }
    }

    @Override // defpackage.zt0, defpackage.y61
    public final void e() {
        switch (this.p) {
            case 0:
                ((h21) this.s).a.setVisibility(0);
                break;
            default:
                if (!this.q) {
                    this.q = true;
                    y61 y61Var = ((x61) this.s).d;
                    if (y61Var != null) {
                        y61Var.e();
                        break;
                    }
                }
                break;
        }
    }

    public g21(x61 x61Var) {
        this.p = 1;
        this.s = x61Var;
        this.q = false;
        this.r = 0;
    }
}
