package r;

import sh.AbstractC7978m;

/* renamed from: r.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7549y implements InterfaceC7523d {

    /* renamed from: a, reason: collision with root package name */
    private final x0 f59928a;

    /* renamed from: b, reason: collision with root package name */
    private final s0 f59929b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f59930c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC7542q f59931d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC7542q f59932e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC7542q f59933f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f59934g;

    /* renamed from: h, reason: collision with root package name */
    private final long f59935h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f59936i;

    public C7549y(x0 x0Var, s0 s0Var, Object obj, AbstractC7542q abstractC7542q) {
        this.f59928a = x0Var;
        this.f59929b = s0Var;
        this.f59930c = obj;
        AbstractC7542q abstractC7542q2 = (AbstractC7542q) c().a().invoke(obj);
        this.f59931d = abstractC7542q2;
        this.f59932e = r.e(abstractC7542q);
        this.f59934g = c().b().invoke(x0Var.c(abstractC7542q2, abstractC7542q));
        this.f59935h = x0Var.e(abstractC7542q2, abstractC7542q);
        AbstractC7542q abstractC7542qE = r.e(x0Var.b(b(), abstractC7542q2, abstractC7542q));
        this.f59933f = abstractC7542qE;
        int iB = abstractC7542qE.b();
        for (int i10 = 0; i10 < iB; i10++) {
            AbstractC7542q abstractC7542q3 = this.f59933f;
            abstractC7542q3.e(i10, AbstractC7978m.j(abstractC7542q3.a(i10), -this.f59928a.a(), this.f59928a.a()));
        }
    }

    @Override // r.InterfaceC7523d
    public boolean a() {
        return this.f59936i;
    }

    @Override // r.InterfaceC7523d
    public long b() {
        return this.f59935h;
    }

    @Override // r.InterfaceC7523d
    public s0 c() {
        return this.f59929b;
    }

    @Override // r.InterfaceC7523d
    public AbstractC7542q d(long j10) {
        return !e(j10) ? this.f59928a.b(j10, this.f59931d, this.f59932e) : this.f59933f;
    }

    @Override // r.InterfaceC7523d
    public Object f(long j10) {
        return !e(j10) ? c().b().invoke(this.f59928a.d(j10, this.f59931d, this.f59932e)) : g();
    }

    @Override // r.InterfaceC7523d
    public Object g() {
        return this.f59934g;
    }

    public C7549y(InterfaceC7550z interfaceC7550z, s0 s0Var, Object obj, AbstractC7542q abstractC7542q) {
        this(interfaceC7550z.a(s0Var), s0Var, obj, abstractC7542q);
    }
}
