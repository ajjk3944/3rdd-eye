package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ch1 implements lf1 {
    public final kz2 a = new kz2(4);
    public final kz2 b = new kz2(9);
    public final kz2 c = new kz2(11);
    public final kz2 d = new kz2();
    public final dh1 e;
    public nf1 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public bh1 o;
    public fh1 p;

    static {
        int i = bd2.o;
    }

    public ch1() {
        dh1 dh1Var = new dh1(5, new gf1());
        dh1Var.i = -9223372036854775807L;
        dh1Var.j = new long[0];
        dh1Var.k = new long[0];
        this.e = dh1Var;
        this.g = 1;
    }

    public final kz2 a(mf1 mf1Var) {
        int i = this.l;
        kz2 kz2Var = this.d;
        byte[] bArr = kz2Var.a;
        if (i > bArr.length) {
            int length = bArr.length;
            kz2Var.z(0, new byte[Math.max(length + length, i)]);
        } else {
            kz2Var.E(0);
        }
        kz2Var.C(this.l);
        mf1Var.x(kz2Var.a, 0, this.l);
        return kz2Var;
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) throws EOFException, InterruptedIOException {
        kz2 kz2Var = this.a;
        df1 df1Var = (df1) mf1Var;
        df1Var.B(kz2Var.a, 0, 3, false);
        kz2Var.E(0);
        if (kz2Var.O() == 4607062) {
            df1Var.B(kz2Var.a, 0, 2, false);
            kz2Var.E(0);
            if ((kz2Var.L() & 250) == 0) {
                df1Var.B(kz2Var.a, 0, 4, false);
                kz2Var.E(0);
                int iB = kz2Var.b();
                df1Var.k = 0;
                df1Var.e(iB, false);
                df1Var.B(kz2Var.a, 0, 4, false);
                kz2Var.E(0);
                if (kz2Var.b() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x039f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0290  */
    @Override // defpackage.lf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.mf1 r32, defpackage.pf1 r33) throws java.io.EOFException, java.io.InterruptedIOException, defpackage.lq1 {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch1.c(mf1, pf1):int");
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        this.f = nf1Var;
    }
}
