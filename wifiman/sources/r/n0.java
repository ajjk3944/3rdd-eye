package r;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class n0 implements InterfaceC7523d {

    /* renamed from: a, reason: collision with root package name */
    private final v0 f59761a;

    /* renamed from: b, reason: collision with root package name */
    private final s0 f59762b;

    /* renamed from: c, reason: collision with root package name */
    private Object f59763c;

    /* renamed from: d, reason: collision with root package name */
    private Object f59764d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC7542q f59765e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC7542q f59766f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC7542q f59767g;

    /* renamed from: h, reason: collision with root package name */
    private long f59768h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC7542q f59769i;

    public n0(v0 v0Var, s0 s0Var, Object obj, Object obj2, AbstractC7542q abstractC7542q) {
        AbstractC7542q abstractC7542qE;
        this.f59761a = v0Var;
        this.f59762b = s0Var;
        this.f59763c = obj2;
        this.f59764d = obj;
        this.f59765e = (AbstractC7542q) c().a().invoke(obj);
        this.f59766f = (AbstractC7542q) c().a().invoke(obj2);
        this.f59767g = (abstractC7542q == null || (abstractC7542qE = r.e(abstractC7542q)) == null) ? r.g((AbstractC7542q) c().a().invoke(obj)) : abstractC7542qE;
        this.f59768h = -1L;
    }

    private final AbstractC7542q h() {
        AbstractC7542q abstractC7542q = this.f59769i;
        if (abstractC7542q != null) {
            return abstractC7542q;
        }
        AbstractC7542q abstractC7542qD = this.f59761a.d(this.f59765e, this.f59766f, this.f59767g);
        this.f59769i = abstractC7542qD;
        return abstractC7542qD;
    }

    @Override // r.InterfaceC7523d
    public boolean a() {
        return this.f59761a.a();
    }

    @Override // r.InterfaceC7523d
    public long b() {
        if (this.f59768h < 0) {
            this.f59768h = this.f59761a.b(this.f59765e, this.f59766f, this.f59767g);
        }
        return this.f59768h;
    }

    @Override // r.InterfaceC7523d
    public s0 c() {
        return this.f59762b;
    }

    @Override // r.InterfaceC7523d
    public AbstractC7542q d(long j10) {
        return !e(j10) ? this.f59761a.f(j10, this.f59765e, this.f59766f, this.f59767g) : h();
    }

    @Override // r.InterfaceC7523d
    public Object f(long j10) {
        if (e(j10)) {
            return g();
        }
        AbstractC7542q abstractC7542qC = this.f59761a.c(j10, this.f59765e, this.f59766f, this.f59767g);
        int iB = abstractC7542qC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (Float.isNaN(abstractC7542qC.a(i10))) {
                AbstractC7518a0.b("AnimationVector cannot contain a NaN. " + abstractC7542qC + ". Animation: " + this + ", playTimeNanos: " + j10);
            }
        }
        return c().b().invoke(abstractC7542qC);
    }

    @Override // r.InterfaceC7523d
    public Object g() {
        return this.f59763c;
    }

    public final Object i() {
        return this.f59764d;
    }

    public final void j(Object obj) {
        if (AbstractC6492s.d(obj, this.f59764d)) {
            return;
        }
        this.f59764d = obj;
        this.f59765e = (AbstractC7542q) c().a().invoke(obj);
        this.f59769i = null;
        this.f59768h = -1L;
    }

    public final void k(Object obj) {
        if (AbstractC6492s.d(this.f59763c, obj)) {
            return;
        }
        this.f59763c = obj;
        this.f59766f = (AbstractC7542q) c().a().invoke(obj);
        this.f59769i = null;
        this.f59768h = -1L;
    }

    public String toString() {
        return "TargetBasedAnimation: " + i() + " -> " + g() + ",initial velocity: " + this.f59767g + ", duration: " + AbstractC7527f.b(this) + " ms,animationSpec: " + this.f59761a;
    }

    public /* synthetic */ n0(InterfaceC7533i interfaceC7533i, s0 s0Var, Object obj, Object obj2, AbstractC7542q abstractC7542q, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7533i, s0Var, obj, obj2, (i10 & 16) != 0 ? null : abstractC7542q);
    }

    public n0(InterfaceC7533i interfaceC7533i, s0 s0Var, Object obj, Object obj2, AbstractC7542q abstractC7542q) {
        this(interfaceC7533i.a(s0Var), s0Var, obj, obj2, abstractC7542q);
    }
}
