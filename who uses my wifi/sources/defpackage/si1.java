package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class si1 implements lf1 {
    public nf1 e;
    public jg1 f;
    public int h;
    public wn1 i;
    public long k;
    public long l;
    public int n;
    public ui1 o;
    public boolean p;
    public final kz2 a = new kz2(10);
    public final xf1 b = new xf1();
    public final uf1 c = new uf1();
    public long j = -9223372036854775807L;
    public final f20 d = new f20(11);
    public jg1 g = new gf1();
    public long m = -1;

    static {
        int i = uk2.o;
    }

    public final boolean a(mf1 mf1Var, boolean z) throws NumberFormatException, EOFException {
        int iN;
        int i;
        int iG;
        mf1Var.i();
        long jO = mf1Var.o();
        int i2 = true != z ? 131072 : 32768;
        if (jO == 0) {
            wn1 wn1VarK = this.d.k(mf1Var, null, i2);
            this.i = wn1VarK;
            if (wn1VarK != null) {
                this.c.a(wn1VarK);
            }
            iN = (int) mf1Var.n();
            if (!z) {
                mf1Var.t(iN);
            }
            i = 0;
        } else {
            iN = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (!g(mf1Var)) {
                kz2 kz2Var = this.a;
                kz2Var.E(0);
                int iB = kz2Var.b();
                if ((i == 0 || ((-128000) & iB) == (i & (-128000))) && (iG = i41.G(iB)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.b.a(iB);
                        i = iB;
                    }
                    mf1Var.A(iG - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == i2) {
                        if (z) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z) {
                        mf1Var.i();
                        mf1Var.A(iN + i5);
                    } else {
                        mf1Var.t(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i = 0;
                }
            } else if (i3 <= 0) {
                h();
                throw new EOFException();
            }
        }
        if (z) {
            mf1Var.t(iN + i4);
        } else {
            mf1Var.i();
        }
        this.h = i;
        return true;
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) {
        return a(mf1Var, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    @Override // defpackage.lf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.mf1 r47, defpackage.pf1 r48) throws java.lang.NumberFormatException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si1.c(mf1, pf1):int");
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        this.h = 0;
        this.j = -9223372036854775807L;
        this.k = 0L;
        this.n = 0;
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        this.e = nf1Var;
        jg1 jg1VarZ = nf1Var.z(0, 1);
        this.f = jg1VarZ;
        this.g = jg1VarZ;
        this.e.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(defpackage.mf1 r9) {
        /*
            r8 = this;
            ui1 r0 = r8.o
            r1 = 1
            if (r0 == 0) goto L1a
            long r2 = r0.c()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1a
            long r4 = r9.n()
            r6 = -4
            long r2 = r2 + r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L28
        L1a:
            kz2 r0 = r8.a     // Catch: java.io.EOFException -> L28
            byte[] r0 = r0.a     // Catch: java.io.EOFException -> L28
            r2 = 4
            r3 = 0
            boolean r9 = r9.B(r0, r3, r2, r1)     // Catch: java.io.EOFException -> L28
            if (r9 != 0) goto L27
            goto L28
        L27:
            return r3
        L28:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si1.g(mf1):boolean");
    }

    public final void h() {
        ui1 ui1Var = this.o;
        if ((ui1Var instanceof qi1) && ((qi1) ui1Var).d()) {
            long j = this.m;
            if (j == -1 || j == this.o.c()) {
                return;
            }
            qi1 qi1Var = (qi1) this.o;
            this.o = new qi1(qi1Var.h, qi1Var.i, this.m, qi1Var.g);
            nf1 nf1Var = this.e;
            nf1Var.getClass();
            nf1Var.v(this.o);
            this.f.getClass();
            this.o.a();
        }
    }
}
