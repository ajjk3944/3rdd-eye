package ou;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public a0 f19869a;

    /* renamed from: b, reason: collision with root package name */
    public z f19870b;

    /* renamed from: d, reason: collision with root package name */
    public String f19872d;

    /* renamed from: e, reason: collision with root package name */
    public r f19873e;

    /* renamed from: g, reason: collision with root package name */
    public e0 f19875g;

    /* renamed from: h, reason: collision with root package name */
    public c0 f19876h;

    /* renamed from: i, reason: collision with root package name */
    public c0 f19877i;
    public c0 j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f19878l;

    /* renamed from: m, reason: collision with root package name */
    public bc.p f19879m;

    /* renamed from: c, reason: collision with root package name */
    public int f19871c = -1;

    /* renamed from: f, reason: collision with root package name */
    public fh.f f19874f = new fh.f(2);

    public static void b(String str, c0 c0Var) {
        if (c0Var != null) {
            if (c0Var.B != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (c0Var.D != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c0Var.E != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c0Var.F != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final c0 a() {
        int i10 = this.f19871c;
        if (i10 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f19871c).toString());
        }
        a0 a0Var = this.f19869a;
        if (a0Var == null) {
            throw new IllegalStateException("request == null");
        }
        z zVar = this.f19870b;
        if (zVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f19872d;
        if (str != null) {
            return new c0(a0Var, zVar, str, i10, this.f19873e, this.f19874f.f(), this.f19875g, this.f19876h, this.f19877i, this.j, this.k, this.f19878l, this.f19879m);
        }
        throw new IllegalStateException("message == null");
    }

    public final void c(s sVar) {
        br.l.e(sVar, "headers");
        this.f19874f = sVar.c();
    }
}
