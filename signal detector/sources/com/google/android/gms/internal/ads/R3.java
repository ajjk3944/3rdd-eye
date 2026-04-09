package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.C0305b;
import java.util.Collections;

/* loaded from: classes.dex */
public final class R3 implements I3 {

    /* renamed from: a, reason: collision with root package name */
    public final C1025d4 f10829a;

    /* renamed from: b, reason: collision with root package name */
    public String f10830b;

    /* renamed from: c, reason: collision with root package name */
    public T0 f10831c;

    /* renamed from: d, reason: collision with root package name */
    public Q3 f10832d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10833e;

    /* renamed from: l, reason: collision with root package name */
    public long f10839l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f10834f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final W3 f10835g = new W3(32);

    /* renamed from: h, reason: collision with root package name */
    public final W3 f10836h = new W3(33);
    public final W3 i = new W3(34);

    /* renamed from: j, reason: collision with root package name */
    public final W3 f10837j = new W3(39);

    /* renamed from: k, reason: collision with root package name */
    public final W3 f10838k = new W3(40);

    /* renamed from: m, reason: collision with root package name */
    public long f10840m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final C2036vr f10841n = new C2036vr();

    public R3(C1025d4 c1025d4) {
        this.f10829a = c1025d4;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void a() {
        this.f10839l = 0L;
        this.f10840m = -9223372036854775807L;
        AbstractC2022vd.R(this.f10834f);
        this.f10835g.a();
        this.f10836h.a();
        this.i.a();
        this.f10837j.a();
        this.f10838k.a();
        this.f10829a.f13725d.x(0);
        Q3 q3 = this.f10832d;
        if (q3 != null) {
            q3.f10562f = false;
            q3.f10563g = false;
            q3.f10564h = false;
            q3.i = false;
            q3.f10565j = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void b(boolean z6) {
        this.f10831c.getClass();
        String str = Vt.f12096a;
        if (z6) {
            this.f10829a.f13725d.x(0);
            h(0, 0, this.f10839l, this.f10840m);
            f(0, 48, this.f10839l, this.f10840m);
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void c(int i, long j6) {
        this.f10840m = j6;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void d(C2036vr c2036vr) {
        this.f10831c.getClass();
        String str = Vt.f12096a;
        while (c2036vr.B() > 0) {
            int i = c2036vr.f17355b;
            int i3 = c2036vr.f17356c;
            byte[] bArr = c2036vr.f17354a;
            this.f10839l += c2036vr.B();
            this.f10831c.a(c2036vr.B(), c2036vr);
            while (i < i3) {
                int iQ = AbstractC2022vd.Q(bArr, i, i3, this.f10834f);
                if (iQ == i3) {
                    g(i, i3, bArr);
                    return;
                }
                int i6 = bArr[iQ + 3] & 126;
                int i7 = 3;
                if (iQ > 0) {
                    int i8 = iQ - 1;
                    if (bArr[i8] == 0) {
                        i7 = 4;
                        iQ = i8;
                    }
                }
                int i9 = iQ - i;
                if (i9 > 0) {
                    g(i, iQ, bArr);
                }
                int i10 = i3 - iQ;
                long j6 = this.f10839l - i10;
                h(i10, i9 < 0 ? -i9 : 0, j6, this.f10840m);
                f(i10, i6 >> 1, j6, this.f10840m);
                i = iQ + i7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void e(InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        c1189g4.a();
        c1189g4.b();
        this.f10830b = c1189g4.f14198e;
        c1189g4.b();
        T0 t0X = interfaceC2100x0.x(c1189g4.f14197d, 2);
        this.f10831c = t0X;
        this.f10832d = new Q3(t0X);
        this.f10829a.a(interfaceC2100x0, c1189g4);
    }

    public final void f(int i, int i3, long j6, long j7) {
        Q3 q3 = this.f10832d;
        boolean z6 = this.f10833e;
        q3.f10563g = false;
        q3.f10564h = false;
        q3.f10561e = j7;
        q3.f10560d = 0;
        q3.f10558b = j6;
        if (i3 >= 32 && i3 != 40) {
            if (q3.i && !q3.f10565j) {
                if (z6) {
                    q3.a(i);
                }
                q3.i = false;
            }
            if (i3 <= 35 || i3 == 39) {
                q3.f10564h = !q3.f10565j;
                q3.f10565j = true;
            }
        }
        boolean z7 = i3 >= 16 && i3 <= 21;
        q3.f10559c = z7;
        q3.f10562f = z7 || i3 <= 9;
        if (!this.f10833e) {
            this.f10835g.c(i3);
            this.f10836h.c(i3);
            this.i.c(i3);
        }
        this.f10837j.c(i3);
        this.f10838k.c(i3);
    }

    public final void g(int i, int i3, byte[] bArr) {
        Q3 q3 = this.f10832d;
        if (q3.f10562f) {
            int i6 = q3.f10560d;
            int i7 = (i + 2) - i6;
            if (i7 < i3) {
                q3.f10563g = (bArr[i7] & 128) != 0;
                q3.f10562f = false;
            } else {
                q3.f10560d = (i3 - i) + i6;
            }
        }
        if (!this.f10833e) {
            this.f10835g.d(i, i3, bArr);
            this.f10836h.d(i, i3, bArr);
            this.i.d(i, i3, bArr);
        }
        this.f10837j.d(i, i3, bArr);
        this.f10838k.d(i, i3, bArr);
    }

    public final void h(int i, int i3, long j6, long j7) {
        C0305b c0305b = this.f10829a.f13725d;
        Q3 q3 = this.f10832d;
        boolean z6 = this.f10833e;
        if (q3.f10565j && q3.f10563g) {
            q3.f10568m = q3.f10559c;
            q3.f10565j = false;
        } else if (q3.f10564h || q3.f10563g) {
            if (z6 && q3.i) {
                q3.a(i + ((int) (j6 - q3.f10558b)));
            }
            q3.f10566k = q3.f10558b;
            q3.f10567l = q3.f10561e;
            q3.f10568m = q3.f10559c;
            q3.i = true;
        }
        if (!this.f10833e) {
            W3 w32 = this.f10835g;
            w32.e(i3);
            W3 w33 = this.f10836h;
            w33.e(i3);
            W3 w34 = this.i;
            w34.e(i3);
            if (w32.f12152c && w33.f12152c && w34.f12152c) {
                String str = this.f10830b;
                int i6 = w32.f12153d;
                byte[] bArr = new byte[w33.f12153d + i6 + w34.f12153d];
                System.arraycopy((byte[]) w32.f12154e, 0, bArr, 0, i6);
                System.arraycopy((byte[]) w33.f12154e, 0, bArr, w32.f12153d, w33.f12153d);
                System.arraycopy((byte[]) w34.f12154e, 0, bArr, w32.f12153d + w33.f12153d, w34.f12153d);
                String strA = null;
                C1343iz c1343izM = AbstractC2022vd.M((byte[]) w33.f12154e, 3, w33.f12153d, null);
                Vx vx = c1343izM.f14832b;
                if (vx != null) {
                    int i7 = vx.f12120f;
                    int[] iArr = vx.f12119e;
                    int i8 = vx.f12118d;
                    strA = AbstractC1224gm.a(vx.f12115a, vx.f12116b, vx.f12117c, i8, iArr, i7);
                }
                C1855sP c1855sP = new C1855sP();
                c1855sP.f16722a = str;
                c1855sP.d("video/mp2t");
                c1855sP.e("video/hevc");
                c1855sP.i = strA;
                c1855sP.f16739s = c1343izM.f14835e;
                c1855sP.f16740t = c1343izM.f14836f;
                c1855sP.f16741u = c1343izM.f14837g;
                c1855sP.f16742v = c1343izM.f14838h;
                c1855sP.f16712B = new HK(c1343izM.f14840k, c1343izM.f14841l, c1343izM.f14842m, null, c1343izM.f14833c + 8, c1343izM.f14834d + 8);
                c1855sP.f16745y = c1343izM.i;
                c1855sP.f16734n = c1343izM.f14839j;
                c1855sP.f16713C = c1343izM.f14831a + 1;
                c1855sP.f16735o = Collections.singletonList(bArr);
                TP tp = new TP(c1855sP);
                this.f10831c.e(tp);
                int i9 = tp.f11399o;
                AbstractC0582Jp.h0(i9 != -1);
                c0305b.v(i9);
                this.f10833e = true;
            }
        }
        W3 w35 = this.f10837j;
        boolean zE = w35.e(i3);
        C2036vr c2036vr = this.f10841n;
        if (zE) {
            c2036vr.z(AbstractC2022vd.b(w35.f12153d, (byte[]) w35.f12154e), (byte[]) w35.f12154e);
            c2036vr.G(5);
            c0305b.w(j7, c2036vr);
        }
        W3 w36 = this.f10838k;
        if (w36.e(i3)) {
            c2036vr.z(AbstractC2022vd.b(w36.f12153d, (byte[]) w36.f12154e), (byte[]) w36.f12154e);
            c2036vr.G(5);
            c0305b.w(j7, c2036vr);
        }
    }
}
