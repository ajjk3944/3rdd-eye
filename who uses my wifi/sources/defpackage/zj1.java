package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zj1 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final kz2 g = new kz2(255);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r11 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r10.o() >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r10.l() != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(defpackage.mf1 r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.o()
            long r2 = r10.n()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            defpackage.zt0.D(r0)
            kz2 r0 = r9.g
            r3 = 4
            r0.y(r3)
        L1a:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L2c
            long r5 = r10.o()
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 < 0) goto L2c
            goto L4c
        L2c:
            byte[] r5 = r0.a
            boolean r5 = r10.B(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L33
            goto L34
        L33:
            r5 = r1
        L34:
            if (r5 == 0) goto L4c
            r0.E(r1)
            long r4 = r0.P()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L48
            r10.i()
            return r2
        L48:
            r10.t(r2)
            goto L1a
        L4c:
            if (r4 == 0) goto L56
            long r2 = r10.o()
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5d
        L56:
            int r0 = r10.l()
            r2 = -1
            if (r0 != r2) goto L4c
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj1.a(mf1, long):boolean");
    }

    public final boolean b(mf1 mf1Var, boolean z) throws lq1, EOFException {
        boolean zB;
        boolean zB2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        kz2 kz2Var = this.g;
        kz2Var.y(27);
        try {
            zB = mf1Var.B(kz2Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zB = false;
        }
        if (zB && kz2Var.P() == 1332176723) {
            if (kz2Var.K() == 0) {
                this.a = kz2Var.K();
                this.b = kz2Var.e();
                kz2Var.a();
                kz2Var.a();
                kz2Var.a();
                int iK = kz2Var.K();
                this.c = iK;
                this.d = iK + 27;
                kz2Var.y(iK);
                try {
                    zB2 = mf1Var.B(kz2Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zB2 = false;
                }
                if (zB2) {
                    for (int i = 0; i < this.c; i++) {
                        int iK2 = kz2Var.K();
                        this.f[i] = iK2;
                        this.e += iK2;
                    }
                    return true;
                }
            } else if (!z) {
                throw lq1.b("unsupported bit stream revision");
            }
        }
        return false;
    }
}
