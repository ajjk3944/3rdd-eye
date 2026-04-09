package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a31 extends w21 {
    public final /* synthetic */ int a = 1;
    public v21 b;

    public /* synthetic */ a31() {
    }

    @Override // defpackage.w21, defpackage.u21
    public void a(v21 v21Var) {
        switch (this.a) {
            case 1:
                b9 b9Var = (b9) this.b;
                if (!b9Var.I) {
                    b9Var.G();
                    b9Var.I = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.u21
    public final void d(v21 v21Var) {
        switch (this.a) {
            case 0:
                this.b.z();
                v21Var.x(this);
                break;
            default:
                b9 b9Var = (b9) this.b;
                int i = b9Var.H - 1;
                b9Var.H = i;
                if (i == 0) {
                    b9Var.I = false;
                    b9Var.m();
                }
                v21Var.x(this);
                break;
        }
    }

    public a31(v21 v21Var) {
        this.b = v21Var;
    }
}
