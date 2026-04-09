package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zh4 implements li4 {
    public final int a;
    public final /* synthetic */ bi4 b;

    public zh4(bi4 bi4Var, int i) {
        this.b = bi4Var;
        this.a = i;
    }

    @Override // defpackage.li4
    public final int a(mr2 mr2Var, vw3 vw3Var, int i) {
        int i2;
        boolean z;
        int i3;
        bi4 bi4Var = this.b;
        int i4 = this.a;
        if (bi4Var.q()) {
            return -3;
        }
        bi4Var.n(i4);
        ki4 ki4Var = bi4Var.w[i4];
        boolean z2 = bi4Var.Q;
        ki4Var.getClass();
        boolean z3 = (i & 2) != 0;
        lk1 lk1Var = ki4Var.b;
        synchronized (ki4Var) {
            try {
                vw3Var.f = false;
                int i5 = ki4Var.r;
                i2 = -4;
                if (i5 != ki4Var.o) {
                    ph4 ph4Var = ((ji4) ki4Var.c.n(ki4Var.p + i5)).a;
                    if (!z3 && ph4Var == ki4Var.f) {
                        int iH = ki4Var.h(ki4Var.r);
                        if (ki4Var.g != null) {
                            int i6 = ki4Var.l[iH];
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            int i7 = ki4Var.l[iH];
                            vw3Var.b = i7;
                            if (ki4Var.r == ki4Var.o - 1 && (z2 || ki4Var.v)) {
                                vw3Var.b = 536870912 | i7;
                            }
                            vw3Var.g = ki4Var.m[iH];
                            lk1Var.g = ki4Var.k[iH];
                            lk1Var.h = ki4Var.j[iH];
                            lk1Var.i = ki4Var.n[iH];
                            i3 = -4;
                        } else {
                            vw3Var.f = true;
                            i3 = -3;
                        }
                    }
                    ki4Var.e(ph4Var, mr2Var);
                    i3 = -5;
                } else {
                    if (!z2 && !ki4Var.v) {
                        ph4 ph4Var2 = ki4Var.y;
                        if (ph4Var2 == null || (!z3 && ph4Var2 == ki4Var.f)) {
                            i3 = -3;
                        }
                        ki4Var.e(ph4Var2, mr2Var);
                        i3 = -5;
                    }
                    vw3Var.b = 4;
                    vw3Var.g = Long.MIN_VALUE;
                    i3 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i3 != -4) {
            i2 = i3;
        } else if (!vw3Var.h(4)) {
            int i8 = i & 1;
            if ((i & 4) == 0) {
                if (i8 != 0) {
                    ii4 ii4Var = ki4Var.a;
                    ii4.c(ii4Var.d, vw3Var, lk1Var, ii4Var.b);
                } else {
                    ii4 ii4Var2 = ki4Var.a;
                    ii4Var2.d = ii4.c(ii4Var2.d, vw3Var, lk1Var, ii4Var2.b);
                    ki4Var.r++;
                }
            } else if (i8 == 0) {
                ki4Var.r++;
            }
        }
        if (i2 == -3) {
            bi4Var.p(i4);
        }
        return i2;
    }

    @Override // defpackage.li4
    public final boolean d() {
        bi4 bi4Var = this.b;
        return !bi4Var.q() && bi4Var.w[this.a].j(bi4Var.Q);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    @Override // defpackage.li4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(long r14) {
        /*
            r13 = this;
            bi4 r0 = r13.b
            int r1 = r13.a
            boolean r2 = r0.q()
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            r0.n(r1)
            ki4[] r2 = r0.w
            r4 = r2[r1]
            boolean r2 = r0.Q
            monitor-enter(r4)
            int r5 = r4.r     // Catch: java.lang.Throwable -> L4c
            r6 = r5
            int r5 = r4.h(r6)     // Catch: java.lang.Throwable -> L4c
            int r7 = r4.r     // Catch: java.lang.Throwable -> L4c
            int r8 = r4.o     // Catch: java.lang.Throwable -> L4c
            r10 = 1
            if (r7 == r8) goto L26
            r7 = r10
            goto L27
        L26:
            r7 = r3
        L27:
            if (r7 == 0) goto L4f
            long[] r7 = r4.m     // Catch: java.lang.Throwable -> L4c
            r11 = r7[r5]     // Catch: java.lang.Throwable -> L4c
            int r7 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r7 >= 0) goto L32
            goto L4f
        L32:
            long r11 = r4.u     // Catch: java.lang.Throwable -> L4c
            int r7 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r7 <= 0) goto L3e
            if (r2 != 0) goto L3b
            goto L3e
        L3b:
            int r8 = r8 - r6
            monitor-exit(r4)
            goto L51
        L3e:
            int r6 = r8 - r6
            r9 = 1
            r7 = r14
            int r8 = r4.f(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4c
            r14 = -1
            monitor-exit(r4)
            if (r8 != r14) goto L51
        L4a:
            r8 = r3
            goto L51
        L4c:
            r0 = move-exception
            r14 = r0
            goto L73
        L4f:
            monitor-exit(r4)
            goto L4a
        L51:
            monitor-enter(r4)
            if (r8 < 0) goto L5c
            int r14 = r4.r     // Catch: java.lang.Throwable -> L5e
            int r14 = r14 + r8
            int r15 = r4.o     // Catch: java.lang.Throwable -> L5e
            if (r14 > r15) goto L5c
            goto L61
        L5c:
            r10 = r3
            goto L61
        L5e:
            r0 = move-exception
            r14 = r0
            goto L71
        L61:
            defpackage.zt0.D(r10)     // Catch: java.lang.Throwable -> L5e
            int r14 = r4.r     // Catch: java.lang.Throwable -> L5e
            int r14 = r14 + r8
            r4.r = r14     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r4)
            if (r8 != 0) goto L70
            r0.p(r1)
            return r3
        L70:
            return r8
        L71:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5e
            throw r14
        L73:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4c
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh4.f(long):int");
    }

    @Override // defpackage.li4
    public final void h() throws IOException {
        IOException iOException;
        int i = this.a;
        bi4 bi4Var = this.b;
        ci3 ci3Var = bi4Var.w[i].g;
        if (ci3Var != null) {
            throw ((if4) ci3Var.g);
        }
        int i2 = bi4Var.G == 7 ? 6 : 3;
        t83 t83Var = bi4Var.o;
        IOException iOException2 = (IOException) t83Var.i;
        if (iOException2 != null) {
            throw iOException2;
        }
        yj4 yj4Var = (yj4) t83Var.h;
        if (yj4Var != null && (iOException = yj4Var.h) != null && yj4Var.i > i2) {
            throw iOException;
        }
    }
}
