package w6;

import ma.g0;
import u5.a0;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24235a;

    /* renamed from: b, reason: collision with root package name */
    public final a5.u f24236b;

    /* renamed from: c, reason: collision with root package name */
    public final a5.v f24237c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24238d;

    /* renamed from: e, reason: collision with root package name */
    public String f24239e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f24240f;

    /* renamed from: g, reason: collision with root package name */
    public int f24241g;

    /* renamed from: h, reason: collision with root package name */
    public int f24242h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24243i;
    public long j;
    public androidx.media3.common.r k;

    /* renamed from: l, reason: collision with root package name */
    public int f24244l;

    /* renamed from: m, reason: collision with root package name */
    public long f24245m;

    public b(String str, int i10) {
        this.f24235a = i10;
        switch (i10) {
            case 1:
                a5.u uVar = new a5.u(new byte[16], 16, 0, (byte) 0);
                this.f24236b = uVar;
                this.f24237c = new a5.v(uVar.f158b);
                this.f24241g = 0;
                this.f24242h = 0;
                this.f24243i = false;
                this.f24245m = -9223372036854775807L;
                this.f24238d = str;
                break;
            default:
                a5.u uVar2 = new a5.u(new byte[128], 128, 0, (byte) 0);
                this.f24236b = uVar2;
                this.f24237c = new a5.v(uVar2.f158b);
                this.f24241g = 0;
                this.f24245m = -9223372036854775807L;
                this.f24238d = str;
                break;
        }
    }

    @Override // w6.f
    public final void a() {
        switch (this.f24235a) {
            case 0:
                this.f24241g = 0;
                this.f24242h = 0;
                this.f24243i = false;
                this.f24245m = -9223372036854775807L;
                break;
            default:
                this.f24241g = 0;
                this.f24242h = 0;
                this.f24243i = false;
                this.f24245m = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03ca  */
    @Override // w6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(a5.v r23) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.b.b(a5.v):void");
    }

    @Override // w6.f
    public final void d() {
        int i10 = this.f24235a;
    }

    @Override // w6.f
    public final void e(int i10, long j) {
        switch (this.f24235a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.f24245m = j;
                    break;
                }
                break;
            default:
                if (j != -9223372036854775807L) {
                    this.f24245m = j;
                    break;
                }
                break;
        }
    }

    @Override // w6.f
    public final void g(u5.m mVar, g0 g0Var) {
        switch (this.f24235a) {
            case 0:
                g0Var.a();
                g0Var.b();
                this.f24239e = g0Var.f16469f;
                g0Var.b();
                this.f24240f = mVar.mo36n(g0Var.f16468e, 1);
                break;
            default:
                g0Var.a();
                g0Var.b();
                this.f24239e = g0Var.f16469f;
                g0Var.b();
                this.f24240f = mVar.mo36n(g0Var.f16468e, 1);
                break;
        }
    }

    private final void c() {
    }

    private final void f() {
    }
}
