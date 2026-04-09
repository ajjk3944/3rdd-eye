package ma;

import androidx.media3.common.k0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.y0;
import java.util.Collections;

/* loaded from: classes.dex */
public final class t implements i, w6.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16590a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16591b;

    /* renamed from: c, reason: collision with root package name */
    public String f16592c;

    /* renamed from: d, reason: collision with root package name */
    public int f16593d;

    /* renamed from: e, reason: collision with root package name */
    public int f16594e;

    /* renamed from: f, reason: collision with root package name */
    public int f16595f;

    /* renamed from: g, reason: collision with root package name */
    public int f16596g;

    /* renamed from: h, reason: collision with root package name */
    public long f16597h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16598i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f16599l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16600m;

    /* renamed from: n, reason: collision with root package name */
    public long f16601n;

    /* renamed from: o, reason: collision with root package name */
    public int f16602o;

    /* renamed from: p, reason: collision with root package name */
    public long f16603p;

    /* renamed from: q, reason: collision with root package name */
    public int f16604q;

    /* renamed from: r, reason: collision with root package name */
    public String f16605r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f16606s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f16607t;

    /* renamed from: u, reason: collision with root package name */
    public Object f16608u;

    /* renamed from: v, reason: collision with root package name */
    public Object f16609v;

    public t(String str, int i10) {
        this.f16590a = i10;
        switch (i10) {
            case 1:
                this.f16591b = str;
                a5.v vVar = new a5.v(1024);
                this.f16606s = vVar;
                byte[] bArr = vVar.f165a;
                this.f16607t = new a5.u(bArr, bArr.length, 0, (byte) 0);
                this.f16597h = -9223372036854775807L;
                break;
            default:
                this.f16591b = str;
                fb.f fVar = new fb.f(1024);
                this.f16606s = fVar;
                byte[] bArr2 = fVar.f8800a;
                this.f16607t = new a5.u(bArr2, bArr2.length, 3, (byte) 0);
                this.f16597h = -9223372036854775807L;
                break;
        }
    }

    @Override // ma.i
    public final void a() {
        switch (this.f16590a) {
            case 0:
                this.f16593d = 0;
                this.f16597h = -9223372036854775807L;
                this.f16598i = false;
                break;
            default:
                this.f16593d = 0;
                this.f16597h = -9223372036854775807L;
                this.f16598i = false;
                break;
        }
    }

    @Override // w6.f
    public void b(a5.v vVar) throws k0 {
        int i10;
        boolean zH;
        a5.v vVar2 = (a5.v) this.f16606s;
        a5.u uVar = (a5.u) this.f16607t;
        a5.a.j((u5.a0) this.f16608u);
        while (vVar.a() > 0) {
            int i11 = this.f16593d;
            if (i11 != 0) {
                if (i11 == 1) {
                    int iT = vVar.t();
                    if ((iT & 224) == 224) {
                        this.f16596g = iT;
                        this.f16593d = 2;
                    } else if (iT != 86) {
                        this.f16593d = 0;
                    }
                } else if (i11 == 2) {
                    int iT2 = ((this.f16596g & (-225)) << 8) | vVar.t();
                    this.f16595f = iT2;
                    if (iT2 > vVar2.f165a.length) {
                        vVar2.B(iT2);
                        byte[] bArr = vVar2.f165a;
                        uVar.getClass();
                        uVar.n(bArr.length, bArr);
                    }
                    this.f16594e = 0;
                    this.f16593d = 3;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(vVar.a(), this.f16595f - this.f16594e);
                    vVar.e(uVar.f158b, this.f16594e, iMin);
                    int i12 = this.f16594e + iMin;
                    this.f16594e = i12;
                    if (i12 == this.f16595f) {
                        uVar.p(0);
                        if (uVar.h()) {
                            if (this.f16598i) {
                            }
                            this.f16593d = 0;
                        } else {
                            this.f16598i = true;
                            int i13 = uVar.i(1);
                            int i14 = i13 == 1 ? uVar.i(1) : 0;
                            this.j = i14;
                            if (i14 != 0) {
                                throw k0.a(null, null);
                            }
                            if (i13 == 1) {
                                uVar.i((uVar.i(2) + 1) * 8);
                            }
                            if (!uVar.h()) {
                                throw k0.a(null, null);
                            }
                            this.k = uVar.i(6);
                            int i15 = uVar.i(4);
                            int i16 = uVar.i(3);
                            if (i15 != 0 || i16 != 0) {
                                throw k0.a(null, null);
                            }
                            if (i13 == 0) {
                                int iG = uVar.g();
                                int iB = uVar.b();
                                u5.a aVarN = u5.b.n(uVar, true);
                                this.f16605r = aVarN.f23247c;
                                this.f16602o = aVarN.f23245a;
                                this.f16604q = aVarN.f23246b;
                                int iB2 = iB - uVar.b();
                                uVar.p(iG);
                                byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                uVar.j(iB2, bArr2);
                                androidx.media3.common.q qVar = new androidx.media3.common.q();
                                qVar.f1734a = this.f16592c;
                                qVar.k = "audio/mp4a-latm";
                                qVar.f1741h = this.f16605r;
                                qVar.f1755x = this.f16604q;
                                qVar.f1756y = this.f16602o;
                                qVar.f1744m = Collections.singletonList(bArr2);
                                qVar.f1736c = this.f16591b;
                                androidx.media3.common.r rVar = new androidx.media3.common.r(qVar);
                                if (!rVar.equals((androidx.media3.common.r) this.f16609v)) {
                                    this.f16609v = rVar;
                                    this.f16603p = 1024000000 / rVar.V;
                                    ((u5.a0) this.f16608u).c(rVar);
                                }
                            } else {
                                int iB3 = uVar.b();
                                u5.a aVarN2 = u5.b.n(uVar, true);
                                this.f16605r = aVarN2.f23247c;
                                this.f16602o = aVarN2.f23245a;
                                this.f16604q = aVarN2.f23246b;
                                uVar.s(uVar.i((uVar.i(2) + 1) * 8) - (iB3 - uVar.b()));
                            }
                            int i17 = uVar.i(3);
                            this.f16599l = i17;
                            if (i17 == 0) {
                                uVar.s(8);
                            } else if (i17 == 1) {
                                uVar.s(9);
                            } else if (i17 == 3 || i17 == 4 || i17 == 5) {
                                uVar.s(6);
                            } else {
                                if (i17 != 6 && i17 != 7) {
                                    throw new IllegalStateException();
                                }
                                uVar.s(1);
                            }
                            boolean zH2 = uVar.h();
                            this.f16600m = zH2;
                            this.f16601n = 0L;
                            if (zH2) {
                                if (i13 == 1) {
                                    this.f16601n = uVar.i((uVar.i(2) + 1) * 8);
                                } else {
                                    do {
                                        zH = uVar.h();
                                        this.f16601n = (this.f16601n << 8) + uVar.i(8);
                                    } while (zH);
                                }
                            }
                            if (uVar.h()) {
                                uVar.s(8);
                            }
                        }
                        if (this.j != 0) {
                            throw k0.a(null, null);
                        }
                        if (this.k != 0) {
                            throw k0.a(null, null);
                        }
                        if (this.f16599l != 0) {
                            throw k0.a(null, null);
                        }
                        int i18 = 0;
                        do {
                            i10 = uVar.i(8);
                            i18 += i10;
                        } while (i10 == 255);
                        int iG2 = uVar.g();
                        if ((iG2 & 7) == 0) {
                            vVar2.E(iG2 >> 3);
                        } else {
                            uVar.j(i18 * 8, vVar2.f165a);
                            vVar2.E(0);
                        }
                        ((u5.a0) this.f16608u).d(i18, vVar2);
                        long j = this.f16597h;
                        if (j != -9223372036854775807L) {
                            ((u5.a0) this.f16608u).a(j, 1, i18, 0, null);
                            this.f16597h += this.f16603p;
                        }
                        if (this.f16600m) {
                            uVar.s((int) this.f16601n);
                        }
                        this.f16593d = 0;
                    } else {
                        continue;
                    }
                }
            } else if (vVar.t() == 86) {
                this.f16593d = 1;
            }
        }
    }

    @Override // ma.i
    public void c(fb.f fVar) throws y0 {
        int i10;
        boolean zH;
        fb.f fVar2 = (fb.f) this.f16606s;
        a5.u uVar = (a5.u) this.f16607t;
        qb.b.k((ca.x) this.f16608u);
        while (fVar.a() > 0) {
            int i11 = this.f16593d;
            if (i11 != 0) {
                if (i11 == 1) {
                    int iO = fVar.o();
                    if ((iO & 224) == 224) {
                        this.f16596g = iO;
                        this.f16593d = 2;
                    } else if (iO != 86) {
                        this.f16593d = 0;
                    }
                } else if (i11 == 2) {
                    int iO2 = ((this.f16596g & (-225)) << 8) | fVar.o();
                    this.f16595f = iO2;
                    if (iO2 > fVar2.f8800a.length) {
                        fVar2.v(iO2);
                        byte[] bArr = fVar2.f8800a;
                        uVar.n(bArr.length, bArr);
                    }
                    this.f16594e = 0;
                    this.f16593d = 3;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(fVar.a(), this.f16595f - this.f16594e);
                    fVar.c(uVar.f158b, this.f16594e, iMin);
                    int i12 = this.f16594e + iMin;
                    this.f16594e = i12;
                    if (i12 == this.f16595f) {
                        uVar.p(0);
                        if (uVar.h()) {
                            if (this.f16598i) {
                            }
                            this.f16593d = 0;
                        } else {
                            this.f16598i = true;
                            int i13 = uVar.i(1);
                            int i14 = i13 == 1 ? uVar.i(1) : 0;
                            this.j = i14;
                            if (i14 != 0) {
                                throw y0.a(null, null);
                            }
                            if (i13 == 1) {
                                uVar.i((uVar.i(2) + 1) * 8);
                            }
                            if (!uVar.h()) {
                                throw y0.a(null, null);
                            }
                            this.k = uVar.i(6);
                            int i15 = uVar.i(4);
                            int i16 = uVar.i(3);
                            if (i15 != 0 || i16 != 0) {
                                throw y0.a(null, null);
                            }
                            if (i13 == 0) {
                                int i17 = (uVar.f159c * 8) + uVar.f160d;
                                int iB = uVar.b();
                                u5.a aVarG = y9.a.g(uVar, true);
                                this.f16605r = aVarG.f23247c;
                                this.f16602o = aVarG.f23245a;
                                this.f16604q = aVarG.f23246b;
                                int iB2 = iB - uVar.b();
                                uVar.p(i17);
                                byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                uVar.j(iB2, bArr2);
                                com.google.android.exoplayer2.g0 g0Var = new com.google.android.exoplayer2.g0();
                                g0Var.f4142a = this.f16592c;
                                g0Var.k = "audio/mp4a-latm";
                                g0Var.f4149h = this.f16605r;
                                g0Var.f4163x = this.f16604q;
                                g0Var.f4164y = this.f16602o;
                                g0Var.f4152m = Collections.singletonList(bArr2);
                                g0Var.f4144c = this.f16591b;
                                Format format = new Format(g0Var);
                                if (!format.equals((Format) this.f16609v)) {
                                    this.f16609v = format;
                                    this.f16603p = 1024000000 / format.V;
                                    ((ca.x) this.f16608u).e(format);
                                }
                            } else {
                                int iB3 = uVar.b();
                                u5.a aVarG2 = y9.a.g(uVar, true);
                                this.f16605r = aVarG2.f23247c;
                                this.f16602o = aVarG2.f23245a;
                                this.f16604q = aVarG2.f23246b;
                                uVar.s(uVar.i((uVar.i(2) + 1) * 8) - (iB3 - uVar.b()));
                            }
                            int i18 = uVar.i(3);
                            this.f16599l = i18;
                            if (i18 == 0) {
                                uVar.s(8);
                            } else if (i18 == 1) {
                                uVar.s(9);
                            } else if (i18 == 3 || i18 == 4 || i18 == 5) {
                                uVar.s(6);
                            } else {
                                if (i18 != 6 && i18 != 7) {
                                    throw new IllegalStateException();
                                }
                                uVar.s(1);
                            }
                            boolean zH2 = uVar.h();
                            this.f16600m = zH2;
                            this.f16601n = 0L;
                            if (zH2) {
                                if (i13 == 1) {
                                    this.f16601n = uVar.i((uVar.i(2) + 1) * 8);
                                } else {
                                    do {
                                        zH = uVar.h();
                                        this.f16601n = (this.f16601n << 8) + uVar.i(8);
                                    } while (zH);
                                }
                            }
                            if (uVar.h()) {
                                uVar.s(8);
                            }
                        }
                        if (this.j != 0) {
                            throw y0.a(null, null);
                        }
                        if (this.k != 0) {
                            throw y0.a(null, null);
                        }
                        if (this.f16599l != 0) {
                            throw y0.a(null, null);
                        }
                        int i19 = 0;
                        do {
                            i10 = uVar.i(8);
                            i19 += i10;
                        } while (i10 == 255);
                        int i20 = (uVar.f159c * 8) + uVar.f160d;
                        if ((i20 & 7) == 0) {
                            fVar2.y(i20 >> 3);
                        } else {
                            uVar.j(i19 * 8, fVar2.f8800a);
                            fVar2.y(0);
                        }
                        ((ca.x) this.f16608u).a(i19, fVar2);
                        long j = this.f16597h;
                        if (j != -9223372036854775807L) {
                            ((ca.x) this.f16608u).d(j, 1, i19, 0, null);
                            this.f16597h += this.f16603p;
                        }
                        if (this.f16600m) {
                            uVar.s((int) this.f16601n);
                        }
                        this.f16593d = 0;
                    } else {
                        continue;
                    }
                }
            } else if (fVar.o() == 86) {
                this.f16593d = 1;
            }
        }
    }

    @Override // ma.i
    public final void d() {
        int i10 = this.f16590a;
    }

    @Override // ma.i
    public final void e(int i10, long j) {
        switch (this.f16590a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.f16597h = j;
                    break;
                }
                break;
            default:
                if (j != -9223372036854775807L) {
                    this.f16597h = j;
                    break;
                }
                break;
        }
    }

    @Override // ma.i
    public void f(ca.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f16608u = mVar.n(g0Var.f16468e, 1);
        g0Var.b();
        this.f16592c = g0Var.f16469f;
    }

    @Override // w6.f
    public void g(u5.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f16608u = mVar.mo36n(g0Var.f16468e, 1);
        g0Var.b();
        this.f16592c = g0Var.f16469f;
    }

    private final void h() {
    }

    private final void i() {
    }
}
