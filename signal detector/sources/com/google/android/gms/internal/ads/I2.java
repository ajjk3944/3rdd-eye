package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class I2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9061a;

    /* renamed from: b, reason: collision with root package name */
    public long f9062b;

    /* renamed from: c, reason: collision with root package name */
    public int f9063c;

    /* renamed from: d, reason: collision with root package name */
    public int f9064d;

    /* renamed from: e, reason: collision with root package name */
    public int f9065e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f9066f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final C2036vr f9067g = new C2036vr(255);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r11 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r10.o() >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r10.m() != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.google.android.gms.internal.ads.InterfaceC2046w0 r10, long r11) {
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
            com.google.android.gms.internal.ads.AbstractC0582Jp.m(r0)
            com.google.android.gms.internal.ads.vr r0 = r9.f9067g
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
            byte[] r5 = r0.f17354a
            boolean r5 = r10.y(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L33
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
            int r0 = r10.m()
            r2 = -1
            if (r0 != r2) goto L4c
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.I2.a(com.google.android.gms.internal.ads.w0, long):boolean");
    }

    public final boolean b(InterfaceC2046w0 interfaceC2046w0, boolean z6) throws P4, EOFException {
        boolean zY;
        boolean zY2;
        this.f9061a = 0;
        this.f9062b = 0L;
        this.f9063c = 0;
        this.f9064d = 0;
        this.f9065e = 0;
        C2036vr c2036vr = this.f9067g;
        c2036vr.y(27);
        try {
            zY = interfaceC2046w0.y(c2036vr.f17354a, 0, 27, z6);
        } catch (EOFException e6) {
            if (!z6) {
                throw e6;
            }
            zY = false;
        }
        if (zY && c2036vr.P() == 1332176723) {
            if (c2036vr.K() == 0) {
                this.f9061a = c2036vr.K();
                this.f9062b = c2036vr.e();
                c2036vr.a();
                c2036vr.a();
                c2036vr.a();
                int iK = c2036vr.K();
                this.f9063c = iK;
                this.f9064d = iK + 27;
                c2036vr.y(iK);
                try {
                    zY2 = interfaceC2046w0.y(c2036vr.f17354a, 0, this.f9063c, z6);
                } catch (EOFException e7) {
                    if (!z6) {
                        throw e7;
                    }
                    zY2 = false;
                }
                if (zY2) {
                    for (int i = 0; i < this.f9063c; i++) {
                        int iK2 = c2036vr.K();
                        this.f9066f[i] = iK2;
                        this.f9065e += iK2;
                    }
                    return true;
                }
            } else if (!z6) {
                throw P4.b("unsupported bit stream revision");
            }
        }
        return false;
    }
}
