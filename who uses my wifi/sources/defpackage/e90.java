package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class e90 implements h90 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i90 b;
    public final /* synthetic */ float c;

    public /* synthetic */ e90(i90 i90Var, float f, int i) {
        this.a = i;
        this.b = i90Var;
        this.c = f;
    }

    @Override // defpackage.h90
    public final void run() {
        switch (this.a) {
            case 0:
                i90 i90Var = this.b;
                u80 u80Var = i90Var.f;
                float f = this.c;
                if (u80Var != null) {
                    s90 s90Var = i90Var.g;
                    s90Var.i(s90Var.o, te0.f(u80Var.l, u80Var.m, f));
                    break;
                } else {
                    i90Var.k.add(new e90(i90Var, f, 0));
                    break;
                }
            case 1:
                i90 i90Var2 = this.b;
                u80 u80Var2 = i90Var2.f;
                float f2 = this.c;
                if (u80Var2 != null) {
                    i90Var2.r((int) te0.f(u80Var2.l, u80Var2.m, f2));
                    break;
                } else {
                    i90Var2.k.add(new e90(i90Var2, f2, 1));
                    break;
                }
            default:
                this.b.t(this.c);
                break;
        }
    }
}
