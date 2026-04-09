package r;

import T.InterfaceC3551q0;
import T.t1;
import mh.InterfaceC6824a;

/* renamed from: r.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7531h {

    /* renamed from: a, reason: collision with root package name */
    private final s0 f59705a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f59706b;

    /* renamed from: c, reason: collision with root package name */
    private final long f59707c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6824a f59708d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3551q0 f59709e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC7542q f59710f;

    /* renamed from: g, reason: collision with root package name */
    private long f59711g;

    /* renamed from: h, reason: collision with root package name */
    private long f59712h = Long.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3551q0 f59713i;

    public C7531h(Object obj, s0 s0Var, AbstractC7542q abstractC7542q, long j10, Object obj2, long j11, boolean z10, InterfaceC6824a interfaceC6824a) {
        this.f59705a = s0Var;
        this.f59706b = obj2;
        this.f59707c = j11;
        this.f59708d = interfaceC6824a;
        this.f59709e = t1.d(obj, null, 2, null);
        this.f59710f = r.e(abstractC7542q);
        this.f59711g = j10;
        this.f59713i = t1.d(Boolean.valueOf(z10), null, 2, null);
    }

    public final void a() {
        k(false);
        this.f59708d.invoke();
    }

    public final long b() {
        return this.f59712h;
    }

    public final long c() {
        return this.f59711g;
    }

    public final long d() {
        return this.f59707c;
    }

    public final Object e() {
        return this.f59709e.getValue();
    }

    public final Object f() {
        return this.f59705a.b().invoke(this.f59710f);
    }

    public final AbstractC7542q g() {
        return this.f59710f;
    }

    public final boolean h() {
        return ((Boolean) this.f59713i.getValue()).booleanValue();
    }

    public final void i(long j10) {
        this.f59712h = j10;
    }

    public final void j(long j10) {
        this.f59711g = j10;
    }

    public final void k(boolean z10) {
        this.f59713i.setValue(Boolean.valueOf(z10));
    }

    public final void l(Object obj) {
        this.f59709e.setValue(obj);
    }

    public final void m(AbstractC7542q abstractC7542q) {
        this.f59710f = abstractC7542q;
    }
}
