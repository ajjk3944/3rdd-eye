package w6;

import java.util.Arrays;
import ma.g0;
import u5.a0;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f24258v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24259a;

    /* renamed from: d, reason: collision with root package name */
    public final String f24262d;

    /* renamed from: e, reason: collision with root package name */
    public String f24263e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f24264f;

    /* renamed from: g, reason: collision with root package name */
    public a0 f24265g;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24268l;

    /* renamed from: o, reason: collision with root package name */
    public int f24271o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f24272p;

    /* renamed from: r, reason: collision with root package name */
    public int f24274r;

    /* renamed from: t, reason: collision with root package name */
    public a0 f24276t;

    /* renamed from: u, reason: collision with root package name */
    public long f24277u;

    /* renamed from: b, reason: collision with root package name */
    public final a5.u f24260b = new a5.u(new byte[7], 7, 0, (byte) 0);

    /* renamed from: c, reason: collision with root package name */
    public final a5.v f24261c = new a5.v(Arrays.copyOf(f24258v, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f24266h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f24267i = 0;
    public int j = 256;

    /* renamed from: m, reason: collision with root package name */
    public int f24269m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f24270n = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f24273q = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f24275s = -9223372036854775807L;

    public e(boolean z10, String str) {
        this.f24259a = z10;
        this.f24262d = str;
    }

    @Override // w6.f
    public final void a() {
        this.f24275s = -9223372036854775807L;
        this.f24268l = false;
        this.f24266h = 0;
        this.f24267i = 0;
        this.j = 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01e8  */
    @Override // w6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(a5.v r20) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.e.b(a5.v):void");
    }

    @Override // w6.f
    public final void e(int i10, long j) {
        if (j != -9223372036854775807L) {
            this.f24275s = j;
        }
    }

    @Override // w6.f
    public final void g(u5.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f24263e = g0Var.f16469f;
        g0Var.b();
        a0 a0VarMo36n = mVar.mo36n(g0Var.f16468e, 1);
        this.f24264f = a0VarMo36n;
        this.f24276t = a0VarMo36n;
        if (!this.f24259a) {
            this.f24265g = new u5.j();
            return;
        }
        g0Var.a();
        g0Var.b();
        a0 a0VarMo36n2 = mVar.mo36n(g0Var.f16468e, 5);
        this.f24265g = a0VarMo36n2;
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        g0Var.b();
        qVar.f1734a = g0Var.f16469f;
        qVar.k = "application/id3";
        a0VarMo36n2.c(new androidx.media3.common.r(qVar));
    }

    @Override // w6.f
    public final void d() {
    }
}
