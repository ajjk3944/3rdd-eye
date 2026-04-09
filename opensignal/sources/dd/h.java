package dd;

import java.util.Objects;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final r f7294a = new r();

    public h() {
    }

    public final void a(Object obj) {
        this.f7294a.l(obj);
    }

    public final boolean b(Exception exc) {
        r rVar = this.f7294a;
        rVar.getClass();
        cc.s.i(exc, "Exception must not be null");
        synchronized (rVar.f7318a) {
            try {
                if (rVar.f7320c) {
                    return false;
                }
                rVar.f7320c = true;
                rVar.f7323f = exc;
                rVar.f7319b.q(rVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(Object obj) {
        this.f7294a.m(obj);
    }

    public h(b9.e eVar) {
        a2.g gVar = new a2.g(this);
        eVar.getClass();
        a2.g gVar2 = new a2.g();
        gVar2.f31a = gVar;
        Objects.requireNonNull(eVar);
        ((r) eVar.f2481d).d(i.f7295a, gVar2);
    }
}
