package ma;

/* loaded from: classes.dex */
public final class s implements i, w6.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16577a;

    /* renamed from: b, reason: collision with root package name */
    public String f16578b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16579c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f16580d;

    /* renamed from: e, reason: collision with root package name */
    public long f16581e;

    /* renamed from: f, reason: collision with root package name */
    public long f16582f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f16583g;

    /* renamed from: h, reason: collision with root package name */
    public Object f16584h;

    /* renamed from: i, reason: collision with root package name */
    public Object f16585i;
    public final Object j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f16586l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f16587m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f16588n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f16589o;

    public s(c0 c0Var) {
        this.f16577a = 0;
        this.f16583g = c0Var;
        this.f16580d = new boolean[3];
        this.j = new v(32, 0);
        this.k = new v(33, 0);
        this.f16586l = new v(34, 0);
        this.f16587m = new v(39, 0);
        this.f16588n = new v(40, 0);
        this.f16582f = -9223372036854775807L;
        this.f16589o = new fb.f();
    }

    @Override // ma.i
    public final void a() {
        switch (this.f16577a) {
            case 0:
                this.f16581e = 0L;
                this.f16582f = -9223372036854775807L;
                qb.b.n(this.f16580d);
                ((v) this.j).f();
                ((v) this.k).f();
                ((v) this.f16586l).f();
                ((v) this.f16587m).f();
                ((v) this.f16588n).f();
                r rVar = (r) this.f16585i;
                if (rVar != null) {
                    rVar.f16570e = false;
                    rVar.f16571f = false;
                    rVar.f16572g = false;
                    rVar.f16573h = false;
                    rVar.f16574i = false;
                    break;
                }
                break;
            default:
                this.f16581e = 0L;
                this.f16582f = -9223372036854775807L;
                u5.b.d(this.f16580d);
                ((v) this.j).f();
                ((v) this.k).f();
                ((v) this.f16586l).f();
                ((v) this.f16587m).f();
                ((v) this.f16588n).f();
                r rVar2 = (r) this.f16585i;
                if (rVar2 != null) {
                    rVar2.f16570e = false;
                    rVar2.f16571f = false;
                    rVar2.f16572g = false;
                    rVar2.f16573h = false;
                    rVar2.f16574i = false;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x025e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0255  */
    @Override // w6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(a5.v r36) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.s.b(a5.v):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    @Override // ma.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(fb.f r41) {
        /*
            Method dump skipped, instructions count: 1181
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.s.c(fb.f):void");
    }

    @Override // ma.i
    public final void d() {
        int i10 = this.f16577a;
    }

    @Override // ma.i
    public final void e(int i10, long j) {
        switch (this.f16577a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.f16582f = j;
                    break;
                }
                break;
            default:
                if (j != -9223372036854775807L) {
                    this.f16582f = j;
                    break;
                }
                break;
        }
    }

    @Override // ma.i
    public void f(ca.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f16578b = g0Var.f16469f;
        g0Var.b();
        ca.x xVarN = mVar.n(g0Var.f16468e, 2);
        this.f16584h = xVarN;
        this.f16585i = new r(xVarN);
        ((c0) this.f16583g).b(mVar, g0Var);
    }

    @Override // w6.f
    public void g(u5.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f16578b = g0Var.f16469f;
        g0Var.b();
        u5.a0 a0VarMo36n = mVar.mo36n(g0Var.f16468e, 2);
        this.f16584h = a0VarMo36n;
        this.f16585i = new r(a0VarMo36n);
        ((w6.s) this.f16583g).b(mVar, g0Var);
    }

    public final void h(byte[] bArr, int i10, int i11) {
        switch (this.f16577a) {
            case 0:
                r rVar = (r) this.f16585i;
                if (rVar.f16570e) {
                    int i12 = rVar.f16568c;
                    int i13 = (i10 + 2) - i12;
                    if (i13 < i11) {
                        rVar.f16571f = (bArr[i13] & 128) != 0;
                        rVar.f16570e = false;
                    } else {
                        rVar.f16568c = (i11 - i10) + i12;
                    }
                }
                if (!this.f16579c) {
                    ((v) this.j).a(bArr, i10, i11);
                    ((v) this.k).a(bArr, i10, i11);
                    ((v) this.f16586l).a(bArr, i10, i11);
                }
                ((v) this.f16587m).a(bArr, i10, i11);
                ((v) this.f16588n).a(bArr, i10, i11);
                break;
            default:
                r rVar2 = (r) this.f16585i;
                if (rVar2.f16570e) {
                    int i14 = rVar2.f16568c;
                    int i15 = (i10 + 2) - i14;
                    if (i15 < i11) {
                        rVar2.f16571f = (bArr[i15] & 128) != 0;
                        rVar2.f16570e = false;
                    } else {
                        rVar2.f16568c = (i11 - i10) + i14;
                    }
                }
                if (!this.f16579c) {
                    ((v) this.j).a(bArr, i10, i11);
                    ((v) this.k).a(bArr, i10, i11);
                    ((v) this.f16586l).a(bArr, i10, i11);
                }
                ((v) this.f16587m).a(bArr, i10, i11);
                ((v) this.f16588n).a(bArr, i10, i11);
                break;
        }
    }

    public s(w6.s sVar) {
        this.f16577a = 1;
        this.f16583g = sVar;
        this.f16580d = new boolean[3];
        this.j = new v(32, 1);
        this.k = new v(33, 1);
        this.f16586l = new v(34, 1);
        this.f16587m = new v(39, 1);
        this.f16588n = new v(40, 1);
        this.f16582f = -9223372036854775807L;
        this.f16589o = new a5.v();
    }

    private final void i() {
    }

    private final void j() {
    }
}
