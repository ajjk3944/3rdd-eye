package R0;

import java.util.concurrent.atomic.AtomicReference;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public class T {

    /* renamed from: a, reason: collision with root package name */
    private final L f19422a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f19423b = new AtomicReference(null);

    public T(L l10) {
        this.f19422a = l10;
    }

    public final Z a() {
        return (Z) this.f19423b.get();
    }

    public final void b() {
        this.f19422a.g();
    }

    public final void c() {
        if (a() != null) {
            this.f19422a.c();
        }
    }

    public Z d(Q q10, C3465s c3465s, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        this.f19422a.a(q10, c3465s, interfaceC6835l, interfaceC6835l2);
        Z z10 = new Z(this, this.f19422a);
        this.f19423b.set(z10);
        return z10;
    }

    public final void e() {
        this.f19422a.b();
        this.f19423b.set(new Z(this, this.f19422a));
    }

    public final void f() {
        this.f19422a.d();
    }

    public void g(Z z10) {
        if (r.Y.a(this.f19423b, z10, null)) {
            this.f19422a.d();
        }
    }
}
