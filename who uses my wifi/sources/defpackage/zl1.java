package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zl1 implements gm1 {
    public final /* synthetic */ int a;
    public final lg1 b;
    public final kz2 c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public jg1 h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public ph4 m;
    public int n;
    public long o;

    public zl1(int i, int i2, String str, String str2) {
        this.a = i2;
        switch (i2) {
            case 1:
                lg1 lg1Var = new lg1(16, new byte[16]);
                this.b = lg1Var;
                this.c = new kz2(lg1Var.a);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                lg1 lg1Var2 = new lg1(128, new byte[128]);
                this.b = lg1Var2;
                this.c = new kz2(lg1Var2.a);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    @Override // defpackage.gm1
    public final void a() {
        switch (this.a) {
            case 0:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03d4  */
    @Override // defpackage.gm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.kz2 r25) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zl1.b(kz2):void");
    }

    @Override // defpackage.gm1
    public final void c(boolean z) {
        int i = this.a;
    }

    @Override // defpackage.gm1
    public final void d(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    @Override // defpackage.gm1
    public final void e(nf1 nf1Var, in1 in1Var) {
        switch (this.a) {
            case 0:
                in1Var.a();
                in1Var.b();
                this.g = in1Var.e;
                in1Var.b();
                this.h = nf1Var.z(in1Var.d, 1);
                break;
            default:
                in1Var.a();
                in1Var.b();
                this.g = in1Var.e;
                in1Var.b();
                this.h = nf1Var.z(in1Var.d, 1);
                break;
        }
    }

    private final void f(boolean z) {
    }

    private final void g(boolean z) {
    }
}
