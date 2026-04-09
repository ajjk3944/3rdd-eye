package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z4 implements x1 {

    /* renamed from: e, reason: collision with root package name */
    public z1 f18992e;

    /* renamed from: f, reason: collision with root package name */
    public u2 f18993f;

    /* renamed from: h, reason: collision with root package name */
    public int f18994h;

    /* renamed from: i, reason: collision with root package name */
    public v8 f18995i;

    /* renamed from: k, reason: collision with root package name */
    public long f18996k;

    /* renamed from: l, reason: collision with root package name */
    public long f18997l;

    /* renamed from: n, reason: collision with root package name */
    public int f18999n;

    /* renamed from: o, reason: collision with root package name */
    public b5 f19000o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f19001p;

    /* renamed from: a, reason: collision with root package name */
    public final sk0 f18988a = new sk0(10);

    /* renamed from: b, reason: collision with root package name */
    public final k2 f18989b = new k2();

    /* renamed from: c, reason: collision with root package name */
    public final h2 f18990c = new h2();
    public long j = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public final ix0 f18991d = new ix0(3);
    public u2 g = new w1();

    /* renamed from: m, reason: collision with root package name */
    public long f18998m = -1;

    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    public final boolean b(y1 y1Var, boolean z3) throws NumberFormatException, EOFException {
        int iF1;
        int i4;
        int iA;
        y1Var.B1();
        if (y1Var.G1() == 0) {
            v8 v8VarA = this.f18991d.a(y1Var, null, 131072);
            this.f18995i = v8VarA;
            if (v8VarA != null) {
                this.f18990c.a(v8VarA);
            }
            iF1 = (int) y1Var.F1();
            if (!z3) {
                y1Var.K1(iF1);
            }
            i4 = 0;
        } else {
            iF1 = 0;
            i4 = 0;
        }
        int i10 = i4;
        int i11 = i10;
        while (true) {
            if (!h(y1Var)) {
                sk0 sk0Var = this.f18988a;
                sk0Var.E(0);
                int iB = sk0Var.b();
                if ((i4 == 0 || ((-128000) & iB) == (i4 & (-128000))) && (iA = ls.a(iB)) != -1) {
                    i10++;
                    if (i10 != 1) {
                        if (i10 == 4) {
                            break;
                        }
                    } else {
                        this.f18989b.a(iB);
                        i4 = iB;
                    }
                    y1Var.J1(iA - 4);
                } else {
                    int i12 = i11 + 1;
                    if (i11 == 131072) {
                        if (z3) {
                            return false;
                        }
                        i();
                        throw new EOFException();
                    }
                    if (z3) {
                        y1Var.B1();
                        y1Var.J1(iF1 + i12);
                    } else {
                        y1Var.K1(1);
                    }
                    i10 = 0;
                    i11 = i12;
                    i4 = 0;
                }
            } else if (i10 <= 0) {
                i();
                throw new EOFException();
            }
        }
        if (z3) {
            y1Var.K1(iF1 + i11);
        } else {
            y1Var.B1();
        }
        this.f18994h = i4;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) {
        return b(y1Var, true);
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        this.f18992e = z1Var;
        u2 u2VarM = z1Var.m(0, 1);
        this.f18993f = u2VarM;
        this.g = u2VarM;
        this.f18992e.i();
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void f(long j, long j8) {
        this.f18994h = 0;
        this.j = -9223372036854775807L;
        this.f18996k = 0L;
        this.f18999n = 0;
        this.f18998m = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.y1 r47, com.google.android.gms.internal.ads.c2 r48) throws java.lang.NumberFormatException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z4.g(com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.c2):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(com.google.android.gms.internal.ads.y1 r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.b5 r0 = r8.f19000o
            r1 = 1
            if (r0 == 0) goto L1a
            long r2 = r0.d()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1a
            long r4 = r9.F1()
            r6 = -4
            long r2 = r2 + r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L28
        L1a:
            com.google.android.gms.internal.ads.sk0 r0 = r8.f18988a     // Catch: java.io.EOFException -> L28
            byte[] r0 = r0.f16446a     // Catch: java.io.EOFException -> L28
            r2 = 4
            r3 = 0
            boolean r9 = r9.O1(r0, r3, r2, r1)     // Catch: java.io.EOFException -> L28
            if (r9 != 0) goto L27
            goto L28
        L27:
            return r3
        L28:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z4.h(com.google.android.gms.internal.ads.y1):boolean");
    }

    public final void i() {
        b5 b5Var = this.f19000o;
        if ((b5Var instanceof x4) && ((x4) b5Var).a()) {
            long j = this.f18998m;
            if (j == -1 || j == this.f19000o.d()) {
                return;
            }
            x4 x4Var = (x4) this.f19000o;
            this.f19000o = new x4(x4Var.f18302h, x4Var.f18303i, this.f18998m, x4Var.g);
            z1 z1Var = this.f18992e;
            z1Var.getClass();
            z1Var.o(this.f19000o);
            this.f18993f.getClass();
            this.f19000o.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
    }
}
