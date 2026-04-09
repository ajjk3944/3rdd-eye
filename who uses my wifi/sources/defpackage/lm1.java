package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lm1 implements gm1 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final xb4 a;
    public final kz2 b;
    public final boolean[] c = new boolean[4];
    public final jm1 d;
    public final r60 e;
    public km1 f;
    public long g;
    public String h;
    public jg1 i;
    public boolean j;
    public long k;

    public lm1(xb4 xb4Var) {
        this.a = xb4Var;
        jm1 jm1Var = new jm1();
        jm1Var.e = new byte[128];
        this.d = jm1Var;
        this.k = -9223372036854775807L;
        this.e = new r60(178);
        this.b = new kz2();
    }

    @Override // defpackage.gm1
    public final void a() {
        wl2.Z(this.c);
        jm1 jm1Var = this.d;
        jm1Var.a = false;
        jm1Var.c = 0;
        jm1Var.b = 0;
        km1 km1Var = this.f;
        if (km1Var != null) {
            km1Var.b = false;
            km1Var.c = false;
            km1Var.d = false;
            km1Var.e = -1;
        }
        this.e.e();
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    @Override // defpackage.gm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.kz2 r21) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm1.b(kz2):void");
    }

    @Override // defpackage.gm1
    public final void c(boolean z) {
        km1 km1Var = this.f;
        km1Var.getClass();
        if (z) {
            km1Var.b(0, this.g, this.j);
            km1 km1Var2 = this.f;
            km1Var2.b = false;
            km1Var2.c = false;
            km1Var2.d = false;
            km1Var2.e = -1;
        }
    }

    @Override // defpackage.gm1
    public final void d(int i, long j) {
        this.k = j;
    }

    @Override // defpackage.gm1
    public final void e(nf1 nf1Var, in1 in1Var) {
        in1Var.a();
        in1Var.b();
        this.h = in1Var.e;
        in1Var.b();
        jg1 jg1VarZ = nf1Var.z(in1Var.d, 2);
        this.i = jg1VarZ;
        this.f = new km1(jg1VarZ);
        this.a.B(nf1Var, in1Var);
    }
}
