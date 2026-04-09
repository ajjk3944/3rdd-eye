package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class im1 implements gm1 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public jg1 b;
    public final xb4 c;
    public final String d;
    public final kz2 e;
    public final r60 f;
    public final boolean[] g = new boolean[4];
    public final hm1 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public im1(xb4 xb4Var, String str) {
        kz2 kz2Var;
        this.c = xb4Var;
        this.d = str;
        hm1 hm1Var = new hm1();
        hm1Var.d = new byte[128];
        this.h = hm1Var;
        if (xb4Var != null) {
            this.f = new r60(178);
            kz2Var = new kz2();
        } else {
            kz2Var = null;
            this.f = null;
        }
        this.e = kz2Var;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.gm1
    public final void a() {
        wl2.Z(this.g);
        hm1 hm1Var = this.h;
        hm1Var.a = false;
        hm1Var.b = 0;
        hm1Var.c = 0;
        r60 r60Var = this.f;
        if (r60Var != null) {
            r60Var.e();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    @Override // defpackage.gm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.kz2 r28) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im1.b(kz2):void");
    }

    @Override // defpackage.gm1
    public final void c(boolean z) {
        jg1 jg1Var = this.b;
        jg1Var.getClass();
        if (z) {
            boolean z2 = this.p;
            long j = this.i - this.n;
            jg1Var.c(this.o, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // defpackage.gm1
    public final void d(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.gm1
    public final void e(nf1 nf1Var, in1 in1Var) {
        in1Var.a();
        in1Var.b();
        this.a = in1Var.e;
        in1Var.b();
        this.b = nf1Var.z(in1Var.d, 2);
        xb4 xb4Var = this.c;
        if (xb4Var != null) {
            xb4Var.B(nf1Var, in1Var);
        }
    }
}
