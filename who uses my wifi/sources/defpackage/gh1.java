package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gh1 implements lf1 {
    public nf1 b;
    public int c;
    public int d;
    public int e;
    public ih1 g;
    public mf1 h;
    public ue i;
    public nj1 j;
    public final kz2 a = new kz2(2);
    public long f = -1;

    public final void a() {
        nf1 nf1Var = this.b;
        nf1Var.getClass();
        nf1Var.s();
        this.b.v(new qf1(-9223372036854775807L, 0L));
        this.c = 6;
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) throws EOFException, InterruptedIOException {
        String strM;
        df1 df1Var = (df1) mf1Var;
        kz2 kz2Var = this.a;
        kz2Var.y(2);
        df1Var.B(kz2Var.a, 0, 2, false);
        if (kz2Var.L() == 65496) {
            while (true) {
                kz2Var.y(2);
                df1Var.B(kz2Var.a, 0, 2, false);
                int iL = kz2Var.L();
                this.d = iL;
                if (iL == 65498) {
                    break;
                }
                kz2Var.y(2);
                df1Var.u(kz2Var.a, 0, 2);
                int iL2 = kz2Var.L() - 2;
                if (iL2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    df1Var.e(iL2, false);
                } else {
                    kz2Var.y(iL2);
                    df1Var.B(kz2Var.a, 0, iL2, false);
                    if (Objects.equals(kz2Var.m(), "http://ns.adobe.com/xap/1.0/") && (strM = kz2Var.m()) != null) {
                        String[] strArr = ou1.l;
                        for (int i = 0; i < 4; i++) {
                            if (strM.contains(String.valueOf(strArr[i]).concat("=\"1\""))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0186, code lost:
    
        r16 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026d  */
    @Override // defpackage.lf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.mf1 r34, defpackage.pf1 r35) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh1.c(mf1, pf1):int");
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            nj1 nj1Var = this.j;
            nj1Var.getClass();
            nj1Var.e(j, j2);
        }
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        this.b = nf1Var;
    }
}
