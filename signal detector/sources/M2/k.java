package M2;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class k implements InterfaceC0164d, InterfaceC0162b, InterfaceC0163c {

    /* renamed from: b, reason: collision with root package name */
    public static k f2785b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f2786c = new l(0, 0, 0, false, false);

    /* renamed from: a, reason: collision with root package name */
    public Object f2787a;

    public /* synthetic */ k(Object obj) {
        this.f2787a = obj;
    }

    public static synchronized k b() {
        try {
            if (f2785b == null) {
                f2785b = new k();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2785b;
    }

    @Override // M2.InterfaceC0164d
    public void a(J2.b bVar) {
        AbstractC0165e abstractC0165e = (AbstractC0165e) this.f2787a;
        if (bVar.f2045b == 0) {
            abstractC0165e.b(null, abstractC0165e.s());
            return;
        }
        InterfaceC0163c interfaceC0163c = abstractC0165e.f2747p;
        if (interfaceC0163c != null) {
            interfaceC0163c.k0(bVar);
        }
    }

    @Override // M2.InterfaceC0162b
    public void g0(int i) {
        ((K2.g) this.f2787a).g0(i);
    }

    @Override // M2.InterfaceC0162b
    public void h0() {
        ((K2.g) this.f2787a).h0();
    }

    @Override // M2.InterfaceC0163c
    public void k0(J2.b bVar) {
        ((K2.h) this.f2787a).k0(bVar);
    }

    public k(AbstractC0165e abstractC0165e) {
        Objects.requireNonNull(abstractC0165e);
        this.f2787a = abstractC0165e;
    }
}
