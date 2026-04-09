package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lb2 extends eb2 {
    public final /* synthetic */ int f;
    public final um g;
    public final Object h;

    public /* synthetic */ lb2(um umVar, Object obj, int i) {
        this.f = i;
        this.g = umVar;
        this.h = obj;
    }

    @Override // defpackage.fb2
    public final void a(nx2 nx2Var) {
        switch (this.f) {
            case 0:
                bx2 bx2Var = (bx2) this.g;
                if (bx2Var != null) {
                    bx2Var.q(nx2Var.b());
                    break;
                }
                break;
            default:
                bx2 bx2Var2 = (bx2) this.g;
                if (bx2Var2 != null) {
                    bx2Var2.q(nx2Var.b());
                    break;
                }
                break;
        }
    }

    @Override // defpackage.fb2
    public final void b() {
        pb2 pb2Var;
        switch (this.f) {
            case 0:
                bx2 bx2Var = (bx2) this.g;
                if (bx2Var != null) {
                    bx2Var.r((hb2) this.h);
                    break;
                }
                break;
            default:
                bx2 bx2Var2 = (bx2) this.g;
                if (bx2Var2 != null && (pb2Var = (pb2) this.h) != null) {
                    bx2Var2.r(pb2Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.fb2
    public final void t(int i) {
        int i2 = this.f;
    }

    private final void B3(int i) {
    }

    private final void C3(int i) {
    }
}
