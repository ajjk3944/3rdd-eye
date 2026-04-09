package ma;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f16426v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16427a;

    /* renamed from: d, reason: collision with root package name */
    public final String f16430d;

    /* renamed from: e, reason: collision with root package name */
    public String f16431e;

    /* renamed from: f, reason: collision with root package name */
    public ca.x f16432f;

    /* renamed from: g, reason: collision with root package name */
    public ca.x f16433g;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16436l;

    /* renamed from: o, reason: collision with root package name */
    public int f16439o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16440p;

    /* renamed from: r, reason: collision with root package name */
    public int f16442r;

    /* renamed from: t, reason: collision with root package name */
    public ca.x f16444t;

    /* renamed from: u, reason: collision with root package name */
    public long f16445u;

    /* renamed from: b, reason: collision with root package name */
    public final a5.u f16428b = new a5.u(new byte[7], 7, 3, (byte) 0);

    /* renamed from: c, reason: collision with root package name */
    public final fb.f f16429c = new fb.f(Arrays.copyOf(f16426v, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f16434h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f16435i = 0;
    public int j = 256;

    /* renamed from: m, reason: collision with root package name */
    public int f16437m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f16438n = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f16441q = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f16443s = -9223372036854775807L;

    public e(boolean z10, String str) {
        this.f16427a = z10;
        this.f16430d = str;
    }

    @Override // ma.i
    public final void a() {
        this.f16443s = -9223372036854775807L;
        this.f16436l = false;
        this.f16434h = 0;
        this.f16435i = 0;
        this.j = 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01ed  */
    @Override // ma.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(fb.f r20) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.e.c(fb.f):void");
    }

    @Override // ma.i
    public final void e(int i10, long j) {
        if (j != -9223372036854775807L) {
            this.f16443s = j;
        }
    }

    @Override // ma.i
    public final void f(ca.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f16431e = g0Var.f16469f;
        g0Var.b();
        ca.x xVarN = mVar.n(g0Var.f16468e, 1);
        this.f16432f = xVarN;
        this.f16444t = xVarN;
        if (!this.f16427a) {
            this.f16433g = new ca.j();
            return;
        }
        g0Var.a();
        g0Var.b();
        ca.x xVarN2 = mVar.n(g0Var.f16468e, 5);
        this.f16433g = xVarN2;
        com.google.android.exoplayer2.g0 g0Var2 = new com.google.android.exoplayer2.g0();
        g0Var.b();
        g0Var2.f4142a = g0Var.f16469f;
        g0Var2.k = "application/id3";
        xVarN2.e(new Format(g0Var2));
    }

    @Override // ma.i
    public final void d() {
    }
}
