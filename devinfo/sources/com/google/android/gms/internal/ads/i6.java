package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i6 {

    /* renamed from: a, reason: collision with root package name */
    public int f12144a;

    /* renamed from: b, reason: collision with root package name */
    public long f12145b;

    /* renamed from: c, reason: collision with root package name */
    public int f12146c;

    /* renamed from: d, reason: collision with root package name */
    public int f12147d;

    /* renamed from: e, reason: collision with root package name */
    public int f12148e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f12149f = new int[255];
    public final sk0 g = new sk0(255);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r11 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r10.G1() >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r10.f() != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.google.android.gms.internal.ads.y1 r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.G1()
            long r2 = r10.F1()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            com.google.android.gms.internal.ads.mq0.m(r0)
            com.google.android.gms.internal.ads.sk0 r0 = r9.g
            r3 = 4
            r0.y(r3)
        L1a:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L2c
            long r5 = r10.G1()
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 < 0) goto L2c
            goto L4c
        L2c:
            byte[] r5 = r0.f16446a
            boolean r5 = r10.O1(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L33
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
            r10.B1()
            return r2
        L48:
            r10.K1(r2)
            goto L1a
        L4c:
            if (r4 == 0) goto L56
            long r2 = r10.G1()
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5d
        L56:
            int r0 = r10.f()
            r2 = -1
            if (r0 != r2) goto L4c
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i6.a(com.google.android.gms.internal.ads.y1, long):boolean");
    }

    public final boolean b(y1 y1Var, boolean z3) throws ua, EOFException {
        boolean zO1;
        boolean zO12;
        this.f12144a = 0;
        this.f12145b = 0L;
        this.f12146c = 0;
        this.f12147d = 0;
        this.f12148e = 0;
        sk0 sk0Var = this.g;
        sk0Var.y(27);
        try {
            zO1 = y1Var.O1(sk0Var.f16446a, 0, 27, z3);
        } catch (EOFException e2) {
            if (!z3) {
                throw e2;
            }
            zO1 = false;
        }
        if (zO1 && sk0Var.P() == 1332176723) {
            if (sk0Var.K() == 0) {
                this.f12144a = sk0Var.K();
                this.f12145b = sk0Var.e();
                sk0Var.a();
                sk0Var.a();
                sk0Var.a();
                int iK = sk0Var.K();
                this.f12146c = iK;
                this.f12147d = iK + 27;
                sk0Var.y(iK);
                try {
                    zO12 = y1Var.O1(sk0Var.f16446a, 0, this.f12146c, z3);
                } catch (EOFException e10) {
                    if (!z3) {
                        throw e10;
                    }
                    zO12 = false;
                }
                if (zO12) {
                    for (int i4 = 0; i4 < this.f12146c; i4++) {
                        int iK2 = sk0Var.K();
                        this.f12149f[i4] = iK2;
                        this.f12148e += iK2;
                    }
                    return true;
                }
            } else if (!z3) {
                throw ua.b("unsupported bit stream revision");
            }
        }
        return false;
    }
}
