package ma;

import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public final class u implements i, w6.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16611b;

    /* renamed from: c, reason: collision with root package name */
    public String f16612c;

    /* renamed from: d, reason: collision with root package name */
    public int f16613d;

    /* renamed from: e, reason: collision with root package name */
    public int f16614e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16615f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16616g;

    /* renamed from: h, reason: collision with root package name */
    public long f16617h;

    /* renamed from: i, reason: collision with root package name */
    public int f16618i;
    public long j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f16619l;

    /* renamed from: m, reason: collision with root package name */
    public Object f16620m;

    public u(String str, int i10) {
        this.f16610a = i10;
        switch (i10) {
            case 1:
                this.f16613d = 0;
                a5.v vVar = new a5.v(4);
                this.k = vVar;
                vVar.f165a[0] = -1;
                this.f16619l = new u5.s(0);
                this.j = -9223372036854775807L;
                this.f16611b = str;
                break;
            default:
                this.f16613d = 0;
                fb.f fVar = new fb.f(4);
                this.k = fVar;
                fVar.f8800a[0] = -1;
                this.f16619l = new u5.s(1);
                this.j = -9223372036854775807L;
                this.f16611b = str;
                break;
        }
    }

    @Override // ma.i
    public final void a() {
        switch (this.f16610a) {
            case 0:
                this.f16613d = 0;
                this.f16614e = 0;
                this.f16616g = false;
                this.j = -9223372036854775807L;
                break;
            default:
                this.f16613d = 0;
                this.f16614e = 0;
                this.f16616g = false;
                this.j = -9223372036854775807L;
                break;
        }
    }

    @Override // w6.f
    public void b(a5.v vVar) {
        a5.v vVar2 = (a5.v) this.k;
        a5.a.j((u5.a0) this.f16620m);
        while (vVar.a() > 0) {
            int i10 = this.f16613d;
            if (i10 == 0) {
                byte[] bArr = vVar.f165a;
                int i11 = vVar.f166b;
                int i12 = vVar.f167c;
                while (true) {
                    if (i11 >= i12) {
                        vVar.E(i12);
                        break;
                    }
                    byte b2 = bArr[i11];
                    boolean z10 = (b2 & 255) == 255;
                    boolean z11 = this.f16616g && (b2 & 224) == 224;
                    this.f16616g = z10;
                    if (z11) {
                        vVar.E(i11 + 1);
                        this.f16616g = false;
                        vVar2.f165a[1] = bArr[i11];
                        this.f16614e = 2;
                        this.f16613d = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                u5.s sVar = (u5.s) this.f16619l;
                int iMin = Math.min(vVar.a(), 4 - this.f16614e);
                vVar.e(vVar2.f165a, this.f16614e, iMin);
                int i13 = this.f16614e + iMin;
                this.f16614e = i13;
                if (i13 >= 4) {
                    vVar2.E(0);
                    if (sVar.a(vVar2.g())) {
                        this.f16618i = sVar.f23326d;
                        if (!this.f16615f) {
                            int i14 = sVar.f23327e;
                            this.f16617h = (sVar.f23330h * 1000000) / i14;
                            androidx.media3.common.q qVar = new androidx.media3.common.q();
                            qVar.f1734a = this.f16612c;
                            qVar.k = sVar.f23325c;
                            qVar.f1743l = 4096;
                            qVar.f1755x = sVar.f23328f;
                            qVar.f1756y = i14;
                            qVar.f1736c = this.f16611b;
                            ((u5.a0) this.f16620m).c(new androidx.media3.common.r(qVar));
                            this.f16615f = true;
                        }
                        vVar2.E(0);
                        ((u5.a0) this.f16620m).d(4, vVar2);
                        this.f16613d = 2;
                    } else {
                        this.f16614e = 0;
                        this.f16613d = 1;
                    }
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(vVar.a(), this.f16618i - this.f16614e);
                ((u5.a0) this.f16620m).d(iMin2, vVar);
                int i15 = this.f16614e + iMin2;
                this.f16614e = i15;
                int i16 = this.f16618i;
                if (i15 >= i16) {
                    long j = this.j;
                    if (j != -9223372036854775807L) {
                        ((u5.a0) this.f16620m).a(j, 1, i16, 0, null);
                        this.j += this.f16617h;
                    }
                    this.f16614e = 0;
                    this.f16613d = 0;
                }
            }
        }
    }

    @Override // ma.i
    public void c(fb.f fVar) {
        fb.f fVar2 = (fb.f) this.k;
        qb.b.k((ca.x) this.f16620m);
        while (fVar.a() > 0) {
            int i10 = this.f16613d;
            if (i10 == 0) {
                byte[] bArr = fVar.f8800a;
                int i11 = fVar.f8801b;
                int i12 = fVar.f8802c;
                while (true) {
                    if (i11 >= i12) {
                        fVar.y(i12);
                        break;
                    }
                    byte b2 = bArr[i11];
                    boolean z10 = (b2 & 255) == 255;
                    boolean z11 = this.f16616g && (b2 & 224) == 224;
                    this.f16616g = z10;
                    if (z11) {
                        fVar.y(i11 + 1);
                        this.f16616g = false;
                        fVar2.f8800a[1] = bArr[i11];
                        this.f16614e = 2;
                        this.f16613d = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                u5.s sVar = (u5.s) this.f16619l;
                int iMin = Math.min(fVar.a(), 4 - this.f16614e);
                fVar.c(fVar2.f8800a, this.f16614e, iMin);
                int i13 = this.f16614e + iMin;
                this.f16614e = i13;
                if (i13 >= 4) {
                    fVar2.y(0);
                    if (sVar.a(fVar2.d())) {
                        this.f16618i = sVar.f23326d;
                        if (!this.f16615f) {
                            int i14 = sVar.f23327e;
                            this.f16617h = (sVar.f23330h * 1000000) / i14;
                            com.google.android.exoplayer2.g0 g0Var = new com.google.android.exoplayer2.g0();
                            g0Var.f4142a = this.f16612c;
                            g0Var.k = sVar.f23325c;
                            g0Var.f4151l = 4096;
                            g0Var.f4163x = sVar.f23328f;
                            g0Var.f4164y = i14;
                            g0Var.f4144c = this.f16611b;
                            ((ca.x) this.f16620m).e(new Format(g0Var));
                            this.f16615f = true;
                        }
                        fVar2.y(0);
                        ((ca.x) this.f16620m).a(4, fVar2);
                        this.f16613d = 2;
                    } else {
                        this.f16614e = 0;
                        this.f16613d = 1;
                    }
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(fVar.a(), this.f16618i - this.f16614e);
                ((ca.x) this.f16620m).a(iMin2, fVar);
                int i15 = this.f16614e + iMin2;
                this.f16614e = i15;
                int i16 = this.f16618i;
                if (i15 >= i16) {
                    long j = this.j;
                    if (j != -9223372036854775807L) {
                        ((ca.x) this.f16620m).d(j, 1, i16, 0, null);
                        this.j += this.f16617h;
                    }
                    this.f16614e = 0;
                    this.f16613d = 0;
                }
            }
        }
    }

    @Override // ma.i
    public final void d() {
        int i10 = this.f16610a;
    }

    @Override // ma.i
    public final void e(int i10, long j) {
        switch (this.f16610a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.j = j;
                    break;
                }
                break;
            default:
                if (j != -9223372036854775807L) {
                    this.j = j;
                    break;
                }
                break;
        }
    }

    @Override // ma.i
    public void f(ca.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f16612c = g0Var.f16469f;
        g0Var.b();
        this.f16620m = mVar.n(g0Var.f16468e, 1);
    }

    @Override // w6.f
    public void g(u5.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f16612c = g0Var.f16469f;
        g0Var.b();
        this.f16620m = mVar.mo36n(g0Var.f16468e, 1);
    }

    private final void h() {
    }

    private final void i() {
    }
}
