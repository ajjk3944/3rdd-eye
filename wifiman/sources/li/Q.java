package Li;

import Ii.C3073p;
import Ni.AbstractC3401c;
import Yg.u;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC6492s;
import r.Y;

/* loaded from: classes4.dex */
final class Q extends Mi.c {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f11892a = new AtomicReference(null);

    @Override // Mi.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(O o10) {
        if (AbstractC3401c.a(this.f11892a) != null) {
            return false;
        }
        AbstractC3401c.b(this.f11892a, P.f11890a);
        return true;
    }

    public final Object e(InterfaceC5380e interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        if (!Y.a(this.f11892a, P.f11890a, c3073p)) {
            u.a aVar = Yg.u.f25017b;
            c3073p.resumeWith(Yg.u.c(Yg.J.f24997a));
        }
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU == AbstractC5467b.g() ? objU : Yg.J.f24997a;
    }

    @Override // Mi.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC5380e[] b(O o10) {
        AbstractC3401c.b(this.f11892a, null);
        return Mi.b.f13235a;
    }

    public final void g() {
        AtomicReference atomicReference = this.f11892a;
        while (true) {
            Object objA = AbstractC3401c.a(atomicReference);
            if (objA == null || objA == P.f11891b) {
                return;
            }
            if (objA == P.f11890a) {
                if (Y.a(this.f11892a, objA, P.f11891b)) {
                    return;
                }
            } else if (Y.a(this.f11892a, objA, P.f11890a)) {
                u.a aVar = Yg.u.f25017b;
                ((C3073p) objA).resumeWith(Yg.u.c(Yg.J.f24997a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f11892a.getAndSet(P.f11890a);
        AbstractC6492s.f(andSet);
        return andSet == P.f11891b;
    }
}
