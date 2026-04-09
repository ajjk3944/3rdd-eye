package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cm1 implements gm1 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public jg1 h;
    public jg1 i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public jg1 v;
    public long w;
    public final lg1 b = new lg1(7, new byte[7]);
    public final kz2 c = new kz2(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public cm1(String str, int i, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    @Override // defpackage.gm1
    public final void a() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x029b, code lost:
    
        r20.q = (r9 & 8) >> 3;
        r5 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a7, code lost:
    
        if (r5 == ((r9 & 1) ^ 1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a9, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ab, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ac, code lost:
    
        r20.m = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b0, code lost:
    
        if (r20.n != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b2, code lost:
    
        r20.j = r5;
        r20.k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b8, code lost:
    
        r20.j = r16;
        r20.k = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02bf, code lost:
    
        r21.E(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x021f, code lost:
    
        r19 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0313 A[SYNTHETIC] */
    @Override // defpackage.gm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.kz2 r21) throws defpackage.lq1 {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm1.b(kz2):void");
    }

    @Override // defpackage.gm1
    public final void d(int i, long j) {
        this.u = j;
    }

    @Override // defpackage.gm1
    public final void e(nf1 nf1Var, in1 in1Var) {
        in1Var.a();
        in1Var.b();
        this.g = in1Var.e;
        in1Var.b();
        jg1 jg1VarZ = nf1Var.z(in1Var.d, 1);
        this.h = jg1VarZ;
        this.v = jg1VarZ;
        if (!this.a) {
            this.i = new gf1();
            return;
        }
        in1Var.a();
        in1Var.b();
        jg1 jg1VarZ2 = nf1Var.z(in1Var.d, 5);
        this.i = jg1VarZ2;
        gg4 gg4Var = new gg4();
        in1Var.b();
        gg4Var.a = in1Var.e;
        gg4Var.d(this.f);
        gg4Var.e("application/id3");
        jg1VarZ2.d(new ph4(gg4Var));
    }

    @Override // defpackage.gm1
    public final void c(boolean z) {
    }
}
