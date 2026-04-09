package ma;

import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16378a;

    /* renamed from: b, reason: collision with root package name */
    public final a5.u f16379b;

    /* renamed from: c, reason: collision with root package name */
    public final fb.f f16380c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16381d;

    /* renamed from: e, reason: collision with root package name */
    public String f16382e;

    /* renamed from: f, reason: collision with root package name */
    public ca.x f16383f;

    /* renamed from: g, reason: collision with root package name */
    public int f16384g;

    /* renamed from: h, reason: collision with root package name */
    public int f16385h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16386i;
    public long j;
    public Format k;

    /* renamed from: l, reason: collision with root package name */
    public int f16387l;

    /* renamed from: m, reason: collision with root package name */
    public long f16388m;

    public b(String str, int i10) {
        this.f16378a = i10;
        switch (i10) {
            case 1:
                byte[] bArr = new byte[16];
                this.f16379b = new a5.u(bArr, 16, 3, (byte) 0);
                this.f16380c = new fb.f(bArr);
                this.f16384g = 0;
                this.f16385h = 0;
                this.f16386i = false;
                this.f16388m = -9223372036854775807L;
                this.f16381d = str;
                break;
            default:
                byte[] bArr2 = new byte[128];
                this.f16379b = new a5.u(bArr2, 128, 3, (byte) 0);
                this.f16380c = new fb.f(bArr2);
                this.f16384g = 0;
                this.f16388m = -9223372036854775807L;
                this.f16381d = str;
                break;
        }
    }

    @Override // ma.i
    public final void a() {
        switch (this.f16378a) {
            case 0:
                this.f16384g = 0;
                this.f16385h = 0;
                this.f16386i = false;
                this.f16388m = -9223372036854775807L;
                break;
            default:
                this.f16384g = 0;
                this.f16385h = 0;
                this.f16386i = false;
                this.f16388m = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03b8  */
    @Override // ma.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(fb.f r21) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.b.c(fb.f):void");
    }

    @Override // ma.i
    public final void d() {
        int i10 = this.f16378a;
    }

    @Override // ma.i
    public final void e(int i10, long j) {
        switch (this.f16378a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.f16388m = j;
                    break;
                }
                break;
            default:
                if (j != -9223372036854775807L) {
                    this.f16388m = j;
                    break;
                }
                break;
        }
    }

    @Override // ma.i
    public final void f(ca.m mVar, g0 g0Var) {
        switch (this.f16378a) {
            case 0:
                g0Var.a();
                g0Var.b();
                this.f16382e = g0Var.f16469f;
                g0Var.b();
                this.f16383f = mVar.n(g0Var.f16468e, 1);
                break;
            default:
                g0Var.a();
                g0Var.b();
                this.f16382e = g0Var.f16469f;
                g0Var.b();
                this.f16383f = mVar.n(g0Var.f16468e, 1);
                break;
        }
    }

    private final void b() {
    }

    private final void g() {
    }
}
