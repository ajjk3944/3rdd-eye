package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.C0305b;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class P3 implements I3 {

    /* renamed from: a, reason: collision with root package name */
    public final C1025d4 f10311a;

    /* renamed from: e, reason: collision with root package name */
    public long f10315e;

    /* renamed from: g, reason: collision with root package name */
    public String f10317g;

    /* renamed from: h, reason: collision with root package name */
    public T0 f10318h;
    public O3 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10319j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10321l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f10316f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    public final W3 f10312b = new W3(7);

    /* renamed from: c, reason: collision with root package name */
    public final W3 f10313c = new W3(8);

    /* renamed from: d, reason: collision with root package name */
    public final W3 f10314d = new W3(6);

    /* renamed from: k, reason: collision with root package name */
    public long f10320k = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public final C2036vr f10322m = new C2036vr();

    public P3(C1025d4 c1025d4) {
        this.f10311a = c1025d4;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void a() {
        this.f10315e = 0L;
        this.f10321l = false;
        this.f10320k = -9223372036854775807L;
        AbstractC2022vd.R(this.f10316f);
        this.f10312b.a();
        this.f10313c.a();
        this.f10314d.a();
        this.f10311a.f13725d.x(0);
        O3 o32 = this.i;
        if (o32 != null) {
            o32.f10157g = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void b(boolean z6) {
        this.f10318h.getClass();
        String str = Vt.f12096a;
        if (z6) {
            this.f10311a.f13725d.x(0);
            g(0, 0, this.f10315e, this.f10320k);
            f(this.f10315e, this.f10320k, 9);
            g(0, 0, this.f10315e, this.f10320k);
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void c(int i, long j6) {
        this.f10320k = j6;
        int i3 = i & 2;
        this.f10321l = (i3 != 0) | this.f10321l;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    @Override // com.google.android.gms.internal.ads.I3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.C2036vr r13) {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.T0 r2 = r12.f10318h
            r2.getClass()
            java.lang.String r2 = com.google.android.gms.internal.ads.Vt.f12096a
            int r2 = r13.f17355b
            int r7 = r13.f17356c
            byte[] r8 = r13.f17354a
            long r3 = r12.f10315e
            int r5 = r13.B()
            long r5 = (long) r5
            long r3 = r3 + r5
            r12.f10315e = r3
            com.google.android.gms.internal.ads.T0 r3 = r12.f10318h
            int r4 = r13.B()
            r3.a(r4, r13)
        L20:
            boolean[] r1 = r12.f10316f
            int r1 = com.google.android.gms.internal.ads.AbstractC2022vd.Q(r8, r2, r7, r1)
            com.google.android.gms.internal.ads.W3 r3 = r12.f10314d
            com.google.android.gms.internal.ads.W3 r4 = r12.f10313c
            com.google.android.gms.internal.ads.W3 r5 = r12.f10312b
            if (r1 == r7) goto L71
            int r6 = r1 + 3
            r6 = r8[r6]
            r9 = r6 & 31
            r6 = 3
            if (r1 <= 0) goto L40
            int r10 = r1 + (-1)
            r11 = r8[r10]
            if (r11 != 0) goto L40
            r6 = 4
        L3e:
            r11 = r6
            goto L42
        L40:
            r10 = r1
            goto L3e
        L42:
            int r1 = r10 - r2
            if (r1 <= 0) goto L53
            boolean r6 = r12.f10319j
            if (r6 != 0) goto L50
            r5.d(r2, r10, r8)
            r4.d(r2, r10, r8)
        L50:
            r3.d(r2, r10, r8)
        L53:
            int r2 = r7 - r10
            long r3 = r12.f10315e
            long r5 = (long) r2
            long r3 = r3 - r5
            if (r1 >= 0) goto L5d
            int r1 = -r1
            goto L5e
        L5d:
            r1 = 0
        L5e:
            long r5 = r12.f10320k
            r0 = r2
            r2 = r1
            r1 = r0
            r0 = r12
            r0.g(r1, r2, r3, r5)
            r1 = r3
            long r3 = r12.f10320k
            r5 = r9
            r0.f(r1, r3, r5)
            int r2 = r10 + r11
            goto L20
        L71:
            boolean r1 = r12.f10319j
            if (r1 != 0) goto L7b
            r5.d(r2, r7, r8)
            r4.d(r2, r7, r8)
        L7b:
            r3.d(r2, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.P3.d(com.google.android.gms.internal.ads.vr):void");
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void e(InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        c1189g4.a();
        c1189g4.b();
        this.f10317g = c1189g4.f14198e;
        c1189g4.b();
        T0 t0X = interfaceC2100x0.x(c1189g4.f14197d, 2);
        this.f10318h = t0X;
        this.i = new O3(t0X);
        this.f10311a.a(interfaceC2100x0, c1189g4);
    }

    public final void f(long j6, long j7, int i) {
        if (!this.f10319j) {
            this.f10312b.c(i);
            this.f10313c.c(i);
        }
        this.f10314d.c(i);
        O3 o32 = this.i;
        boolean z6 = this.f10321l;
        o32.f10154d = i;
        o32.f10156f = j7;
        o32.f10155e = j6;
        o32.f10160k = z6;
    }

    public final void g(int i, int i3, long j6, long j7) {
        C0305b c0305b = this.f10311a.f13725d;
        boolean z6 = true;
        if (!this.f10319j) {
            W3 w32 = this.f10312b;
            w32.e(i3);
            W3 w33 = this.f10313c;
            w33.e(i3);
            if (this.f10319j) {
                if (w32.f12152c) {
                    Xz xzD = AbstractC2022vd.D(4, w32.f12153d, (byte[]) w32.f12154e);
                    c0305b.v(xzD.f12539m);
                    this.i.f10152b.append(xzD.f12531d, xzD);
                    w32.a();
                } else if (w33.f12152c) {
                    V0 v0 = new V0(4, w33.f12153d, (byte[]) w33.f12154e);
                    int iJ = v0.j();
                    v0.j();
                    v0.a();
                    v0.g();
                    this.i.f10153c.append(iJ, new C1285ht(iJ));
                    w33.a();
                }
            } else if (w32.f12152c && w33.f12152c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) w32.f12154e, w32.f12153d));
                arrayList.add(Arrays.copyOf((byte[]) w33.f12154e, w33.f12153d));
                Xz xzD2 = AbstractC2022vd.D(4, w32.f12153d, (byte[]) w32.f12154e);
                V0 v02 = new V0(4, w33.f12153d, (byte[]) w33.f12154e);
                int iJ2 = v02.j();
                v02.j();
                v02.a();
                v02.g();
                C1285ht c1285ht = new C1285ht(iJ2);
                int i6 = xzD2.f12528a;
                int i7 = xzD2.f12529b;
                int i8 = xzD2.f12530c;
                byte[] bArr = AbstractC1224gm.f14369a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
                T0 t02 = this.f10318h;
                C1855sP c1855sP = new C1855sP();
                c1855sP.f16722a = this.f10317g;
                c1855sP.d("video/mp2t");
                c1855sP.e("video/avc");
                c1855sP.i = str;
                c1855sP.f16739s = xzD2.f12532e;
                c1855sP.f16740t = xzD2.f12533f;
                c1855sP.f16712B = new HK(xzD2.f12536j, xzD2.f12537k, xzD2.f12538l, null, xzD2.f12535h + 8, xzD2.i + 8);
                c1855sP.f16745y = xzD2.f12534g;
                c1855sP.f16735o = arrayList;
                int i9 = xzD2.f12539m;
                c1855sP.f16734n = i9;
                t02.e(new TP(c1855sP));
                this.f10319j = true;
                c0305b.v(i9);
                this.i.f10152b.append(xzD2.f12531d, xzD2);
                this.i.f10153c.append(iJ2, c1285ht);
                w32.a();
                w33.a();
            }
        }
        W3 w34 = this.f10314d;
        if (w34.e(i3)) {
            int iB = AbstractC2022vd.b(w34.f12153d, (byte[]) w34.f12154e);
            byte[] bArr2 = (byte[]) w34.f12154e;
            C2036vr c2036vr = this.f10322m;
            c2036vr.z(iB, bArr2);
            c2036vr.E(4);
            c0305b.w(j7, c2036vr);
        }
        O3 o32 = this.i;
        boolean z7 = this.f10319j;
        if (o32.f10154d == 9) {
            if (z7 && o32.f10157g) {
                long j8 = o32.f10155e;
                int i10 = i + ((int) (j6 - j8));
                long j9 = o32.i;
                if (j9 != -9223372036854775807L) {
                    long j10 = o32.f10158h;
                    if (j8 != j10) {
                        o32.f10151a.c(j9, o32.f10159j ? 1 : 0, (int) (j8 - j10), i10, null);
                    }
                }
            }
            o32.f10158h = o32.f10155e;
            o32.i = o32.f10156f;
            o32.f10159j = false;
            o32.f10157g = true;
        }
        boolean z8 = o32.f10160k;
        boolean z9 = o32.f10159j;
        int i11 = o32.f10154d;
        if (i11 != 5 && (!z8 || i11 != 1)) {
            z6 = false;
        }
        boolean z10 = z9 | z6;
        o32.f10159j = z10;
        o32.f10154d = 24;
        if (z10) {
            this.f10321l = false;
        }
    }
}
