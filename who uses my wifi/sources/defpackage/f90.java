package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class f90 implements h90 {
    public final /* synthetic */ i90 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ f90(i90 i90Var, int i, int i2) {
        this.a = i90Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.h90
    public final void run() {
        i90 i90Var = this.a;
        u80 u80Var = i90Var.f;
        int i = this.b;
        int i2 = this.c;
        if (u80Var == null) {
            i90Var.k.add(new f90(i90Var, i, i2));
        } else {
            i90Var.g.i(i, i2 + 0.99f);
        }
    }
}
