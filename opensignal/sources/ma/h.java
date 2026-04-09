package ma;

import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements i, w6.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16470a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16471b;

    /* renamed from: c, reason: collision with root package name */
    public long f16472c;

    /* renamed from: d, reason: collision with root package name */
    public int f16473d;

    /* renamed from: e, reason: collision with root package name */
    public int f16474e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16475f;

    /* renamed from: g, reason: collision with root package name */
    public Object f16476g;

    public h(int i10, List list) {
        this.f16470a = i10;
        switch (i10) {
            case 2:
                this.f16475f = list;
                this.f16476g = new u5.a0[list.size()];
                this.f16472c = -9223372036854775807L;
                break;
            default:
                this.f16475f = list;
                this.f16476g = new ca.x[list.size()];
                this.f16472c = -9223372036854775807L;
                break;
        }
    }

    @Override // ma.i
    public final void a() {
        switch (this.f16470a) {
            case 0:
                this.f16471b = false;
                this.f16472c = -9223372036854775807L;
                break;
            case 1:
                this.f16471b = false;
                this.f16472c = -9223372036854775807L;
                break;
            case 2:
                this.f16471b = false;
                this.f16472c = -9223372036854775807L;
                break;
            default:
                this.f16471b = false;
                this.f16472c = -9223372036854775807L;
                break;
        }
    }

    @Override // w6.f
    public void b(a5.v vVar) {
        boolean z10;
        boolean z11;
        switch (this.f16470a) {
            case 2:
                if (this.f16471b) {
                    if (this.f16473d == 2) {
                        if (vVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (vVar.t() != 32) {
                                this.f16471b = false;
                            }
                            this.f16473d--;
                            z11 = this.f16471b;
                        }
                        if (!z11) {
                        }
                    }
                    if (this.f16473d == 1) {
                        if (vVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (vVar.t() != 0) {
                                this.f16471b = false;
                            }
                            this.f16473d--;
                            z10 = this.f16471b;
                        }
                        if (!z10) {
                        }
                    }
                    int i10 = vVar.f166b;
                    int iA = vVar.a();
                    for (u5.a0 a0Var : (u5.a0[]) this.f16476g) {
                        vVar.E(i10);
                        a0Var.d(iA, vVar);
                    }
                    this.f16474e += iA;
                    break;
                }
                break;
            default:
                a5.v vVar2 = (a5.v) this.f16475f;
                a5.a.j((u5.a0) this.f16476g);
                if (this.f16471b) {
                    int iA2 = vVar.a();
                    int i11 = this.f16474e;
                    if (i11 < 10) {
                        int iMin = Math.min(iA2, 10 - i11);
                        System.arraycopy(vVar.f165a, vVar.f166b, vVar2.f165a, this.f16474e, iMin);
                        if (this.f16474e + iMin == 10) {
                            vVar2.E(0);
                            if (73 != vVar2.t() || 68 != vVar2.t() || 51 != vVar2.t()) {
                                a5.a.B("Id3Reader", "Discarding invalid ID3 tag");
                                this.f16471b = false;
                                break;
                            } else {
                                vVar2.F(3);
                                this.f16473d = vVar2.s() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.f16473d - this.f16474e);
                    ((u5.a0) this.f16476g).d(iMin2, vVar);
                    this.f16474e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // ma.i
    public void c(fb.f fVar) {
        boolean z10;
        boolean z11;
        switch (this.f16470a) {
            case 0:
                if (this.f16471b) {
                    if (this.f16473d == 2) {
                        if (fVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (fVar.o() != 32) {
                                this.f16471b = false;
                            }
                            this.f16473d--;
                            z11 = this.f16471b;
                        }
                        if (!z11) {
                        }
                    }
                    if (this.f16473d == 1) {
                        if (fVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (fVar.o() != 0) {
                                this.f16471b = false;
                            }
                            this.f16473d--;
                            z10 = this.f16471b;
                        }
                        if (!z10) {
                        }
                    }
                    int i10 = fVar.f8801b;
                    int iA = fVar.a();
                    for (ca.x xVar : (ca.x[]) this.f16476g) {
                        fVar.y(i10);
                        xVar.a(iA, fVar);
                    }
                    this.f16474e += iA;
                    break;
                }
                break;
            default:
                fb.f fVar2 = (fb.f) this.f16475f;
                qb.b.k((ca.x) this.f16476g);
                if (this.f16471b) {
                    int iA2 = fVar.a();
                    int i11 = this.f16474e;
                    if (i11 < 10) {
                        int iMin = Math.min(iA2, 10 - i11);
                        System.arraycopy(fVar.f8800a, fVar.f8801b, fVar2.f8800a, this.f16474e, iMin);
                        if (this.f16474e + iMin == 10) {
                            fVar2.y(0);
                            if (73 != fVar2.o() || 68 != fVar2.o() || 51 != fVar2.o()) {
                                io.sentry.android.core.e0.p("Id3Reader", "Discarding invalid ID3 tag");
                                this.f16471b = false;
                                break;
                            } else {
                                fVar2.z(3);
                                this.f16473d = fVar2.n() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.f16473d - this.f16474e);
                    ((ca.x) this.f16476g).a(iMin2, fVar);
                    this.f16474e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // ma.i
    public final void d() {
        int i10;
        int i11;
        switch (this.f16470a) {
            case 0:
                if (this.f16471b) {
                    if (this.f16472c != -9223372036854775807L) {
                        for (ca.x xVar : (ca.x[]) this.f16476g) {
                            xVar.d(this.f16472c, 1, this.f16474e, 0, null);
                        }
                    }
                    this.f16471b = false;
                    break;
                }
                break;
            case 1:
                qb.b.k((ca.x) this.f16476g);
                if (this.f16471b && (i10 = this.f16473d) != 0 && this.f16474e == i10) {
                    long j = this.f16472c;
                    if (j != -9223372036854775807L) {
                        ((ca.x) this.f16476g).d(j, 1, i10, 0, null);
                    }
                    this.f16471b = false;
                    break;
                }
                break;
            case 2:
                if (this.f16471b) {
                    if (this.f16472c != -9223372036854775807L) {
                        for (u5.a0 a0Var : (u5.a0[]) this.f16476g) {
                            a0Var.a(this.f16472c, 1, this.f16474e, 0, null);
                        }
                    }
                    this.f16471b = false;
                    break;
                }
                break;
            default:
                a5.a.j((u5.a0) this.f16476g);
                if (this.f16471b && (i11 = this.f16473d) != 0 && this.f16474e == i11) {
                    long j7 = this.f16472c;
                    if (j7 != -9223372036854775807L) {
                        ((u5.a0) this.f16476g).a(j7, 1, i11, 0, null);
                    }
                    this.f16471b = false;
                    break;
                }
                break;
        }
    }

    @Override // ma.i
    public final void e(int i10, long j) {
        switch (this.f16470a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f16471b = true;
                    if (j != -9223372036854775807L) {
                        this.f16472c = j;
                    }
                    this.f16474e = 0;
                    this.f16473d = 2;
                    break;
                }
                break;
            case 1:
                if ((i10 & 4) != 0) {
                    this.f16471b = true;
                    if (j != -9223372036854775807L) {
                        this.f16472c = j;
                    }
                    this.f16473d = 0;
                    this.f16474e = 0;
                    break;
                }
                break;
            case 2:
                if ((i10 & 4) != 0) {
                    this.f16471b = true;
                    if (j != -9223372036854775807L) {
                        this.f16472c = j;
                    }
                    this.f16474e = 0;
                    this.f16473d = 2;
                    break;
                }
                break;
            default:
                if ((i10 & 4) != 0) {
                    this.f16471b = true;
                    if (j != -9223372036854775807L) {
                        this.f16472c = j;
                    }
                    this.f16473d = 0;
                    this.f16474e = 0;
                    break;
                }
                break;
        }
    }

    @Override // ma.i
    public void f(ca.m mVar, g0 g0Var) {
        switch (this.f16470a) {
            case 0:
                ca.x[] xVarArr = (ca.x[]) this.f16476g;
                for (int i10 = 0; i10 < xVarArr.length; i10++) {
                    e0 e0Var = (e0) ((List) this.f16475f).get(i10);
                    g0Var.a();
                    g0Var.b();
                    ca.x xVarN = mVar.n(g0Var.f16468e, 3);
                    com.google.android.exoplayer2.g0 g0Var2 = new com.google.android.exoplayer2.g0();
                    g0Var.b();
                    g0Var2.f4142a = g0Var.f16469f;
                    g0Var2.k = "application/dvbsubs";
                    g0Var2.f4152m = Collections.singletonList(e0Var.f16447b);
                    g0Var2.f4144c = e0Var.f16446a;
                    xVarN.e(new Format(g0Var2));
                    xVarArr[i10] = xVarN;
                }
                break;
            default:
                g0Var.a();
                g0Var.b();
                ca.x xVarN2 = mVar.n(g0Var.f16468e, 5);
                this.f16476g = xVarN2;
                com.google.android.exoplayer2.g0 g0Var3 = new com.google.android.exoplayer2.g0();
                g0Var.b();
                g0Var3.f4142a = g0Var.f16469f;
                g0Var3.k = "application/id3";
                xVarN2.e(new Format(g0Var3));
                break;
        }
    }

    @Override // w6.f
    public void g(u5.m mVar, g0 g0Var) {
        switch (this.f16470a) {
            case 2:
                u5.a0[] a0VarArr = (u5.a0[]) this.f16476g;
                for (int i10 = 0; i10 < a0VarArr.length; i10++) {
                    w6.v vVar = (w6.v) ((List) this.f16475f).get(i10);
                    g0Var.a();
                    g0Var.b();
                    u5.a0 a0VarMo36n = mVar.mo36n(g0Var.f16468e, 3);
                    androidx.media3.common.q qVar = new androidx.media3.common.q();
                    g0Var.b();
                    qVar.f1734a = g0Var.f16469f;
                    qVar.k = "application/dvbsubs";
                    qVar.f1744m = Collections.singletonList(vVar.f24380b);
                    qVar.f1736c = vVar.f24379a;
                    a0VarMo36n.c(new androidx.media3.common.r(qVar));
                    a0VarArr[i10] = a0VarMo36n;
                }
                break;
            default:
                g0Var.a();
                g0Var.b();
                u5.a0 a0VarMo36n2 = mVar.mo36n(g0Var.f16468e, 5);
                this.f16476g = a0VarMo36n2;
                androidx.media3.common.q qVar2 = new androidx.media3.common.q();
                g0Var.b();
                qVar2.f1734a = g0Var.f16469f;
                qVar2.k = "application/id3";
                a0VarMo36n2.c(new androidx.media3.common.r(qVar2));
                break;
        }
    }

    public h(int i10) {
        this.f16470a = i10;
        switch (i10) {
            case 3:
                this.f16475f = new a5.v(10);
                this.f16472c = -9223372036854775807L;
                break;
            default:
                this.f16475f = new fb.f(10);
                this.f16472c = -9223372036854775807L;
                break;
        }
    }
}
