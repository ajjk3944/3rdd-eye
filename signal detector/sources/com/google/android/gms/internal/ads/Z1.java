package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.List;

/* loaded from: classes.dex */
public final class Z1 implements InterfaceC1992v0 {

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2100x0 f12764e;

    /* renamed from: f, reason: collision with root package name */
    public T0 f12765f;

    /* renamed from: h, reason: collision with root package name */
    public int f12767h;
    public U3 i;

    /* renamed from: k, reason: collision with root package name */
    public long f12769k;

    /* renamed from: l, reason: collision with root package name */
    public long f12770l;

    /* renamed from: n, reason: collision with root package name */
    public int f12772n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0914b2 f12773o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12774p;

    /* renamed from: a, reason: collision with root package name */
    public final C2036vr f12760a = new C2036vr(10);

    /* renamed from: b, reason: collision with root package name */
    public final J0 f12761b = new J0();

    /* renamed from: c, reason: collision with root package name */
    public final F0 f12762c = new F0();

    /* renamed from: j, reason: collision with root package name */
    public long f12768j = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public final H0 f12763d = new H0(0);

    /* renamed from: g, reason: collision with root package name */
    public T0 f12766g = new C1938u0();

    /* renamed from: m, reason: collision with root package name */
    public long f12771m = -1;

    public final boolean a(InterfaceC2046w0 interfaceC2046w0, boolean z6) throws NumberFormatException, EOFException {
        int iN;
        int i;
        int iA;
        interfaceC2046w0.i();
        if (interfaceC2046w0.o() == 0) {
            U3 u3A = this.f12763d.a(interfaceC2046w0, null, 131072);
            this.i = u3A;
            if (u3A != null) {
                this.f12762c.a(u3A);
            }
            iN = (int) interfaceC2046w0.n();
            if (!z6) {
                interfaceC2046w0.t(iN);
            }
            i = 0;
        } else {
            iN = 0;
            i = 0;
        }
        int i3 = i;
        int i6 = i3;
        while (true) {
            if (!h(interfaceC2046w0)) {
                C2036vr c2036vr = this.f12760a;
                c2036vr.E(0);
                int iB = c2036vr.b();
                if ((i == 0 || ((-128000) & iB) == (i & (-128000))) && (iA = AbstractC2022vd.a(iB)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.f12761b.a(iB);
                        i = iB;
                    }
                    interfaceC2046w0.r(iA - 4);
                } else {
                    int i7 = i6 + 1;
                    if (i6 == 131072) {
                        if (z6) {
                            return false;
                        }
                        i();
                        throw new EOFException();
                    }
                    if (z6) {
                        interfaceC2046w0.i();
                        interfaceC2046w0.r(iN + i7);
                    } else {
                        interfaceC2046w0.t(1);
                    }
                    i3 = 0;
                    i6 = i7;
                    i = 0;
                }
            } else if (i3 <= 0) {
                i();
                throw new EOFException();
            }
        }
        if (z6) {
            interfaceC2046w0.t(iN + i6);
        } else {
            interfaceC2046w0.i();
        }
        this.f12767h = i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) {
        return a(interfaceC2046w0, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final List c() {
        JB jb = LB.f9635b;
        return C1197gC.f14227e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void e(InterfaceC2100x0 interfaceC2100x0) {
        this.f12764e = interfaceC2100x0;
        T0 t0X = interfaceC2100x0.x(0, 1);
        this.f12765f = t0X;
        this.f12766g = t0X;
        this.f12764e.u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void f(long j6, long j7) {
        this.f12767h = 0;
        this.f12768j = -9223372036854775807L;
        this.f12769k = 0L;
        this.f12772n = 0;
        this.f12771m = -1L;
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
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC2046w0 r47, com.google.android.gms.internal.ads.A0 r48) throws java.lang.NumberFormatException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Z1.g(com.google.android.gms.internal.ads.w0, com.google.android.gms.internal.ads.A0):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(com.google.android.gms.internal.ads.InterfaceC2046w0 r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.b2 r0 = r8.f12773o
            r1 = 1
            if (r0 == 0) goto L1a
            long r2 = r0.d()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1a
            long r4 = r9.n()
            r6 = -4
            long r2 = r2 + r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L28
        L1a:
            com.google.android.gms.internal.ads.vr r0 = r8.f12760a     // Catch: java.io.EOFException -> L28
            byte[] r0 = r0.f17354a     // Catch: java.io.EOFException -> L28
            r2 = 4
            r3 = 0
            boolean r9 = r9.y(r0, r3, r2, r1)     // Catch: java.io.EOFException -> L28
            if (r9 != 0) goto L27
            goto L28
        L27:
            return r3
        L28:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Z1.h(com.google.android.gms.internal.ads.w0):boolean");
    }

    public final void i() {
        InterfaceC0914b2 interfaceC0914b2 = this.f12773o;
        if ((interfaceC0914b2 instanceof X1) && ((X1) interfaceC0914b2).c()) {
            long j6 = this.f12771m;
            if (j6 == -1 || j6 == this.f12773o.d()) {
                return;
            }
            X1 x1 = (X1) this.f12773o;
            this.f12773o = new X1(x1.f12359h, x1.i, this.f12771m, x1.f12358g);
            InterfaceC2100x0 interfaceC2100x0 = this.f12764e;
            interfaceC2100x0.getClass();
            interfaceC2100x0.A(this.f12773o);
            this.f12765f.getClass();
            this.f12773o.a();
        }
    }
}
