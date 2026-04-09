package Ki;

import Ki.k;
import Yg.AbstractC3663g;
import Yg.J;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.O;
import kotlinx.coroutines.internal.UndeliveredElementException;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public class q extends e {

    /* renamed from: m, reason: collision with root package name */
    private final int f10883m;

    /* renamed from: n, reason: collision with root package name */
    private final a f10884n;

    public q(int i10, a aVar, InterfaceC6835l interfaceC6835l) {
        super(i10, interfaceC6835l);
        this.f10883m = i10;
        this.f10884n = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + O.b(e.class).v() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    static /* synthetic */ Object n1(q qVar, Object obj, InterfaceC5380e interfaceC5380e) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionC;
        Object objP1 = qVar.p1(obj, true);
        if (!(objP1 instanceof k.a)) {
            return J.f24997a;
        }
        k.e(objP1);
        InterfaceC6835l interfaceC6835l = qVar.f10834b;
        if (interfaceC6835l == null || (undeliveredElementExceptionC = Ni.v.c(interfaceC6835l, obj, null, 2, null)) == null) {
            throw qVar.i0();
        }
        AbstractC3663g.a(undeliveredElementExceptionC, qVar.i0());
        throw undeliveredElementExceptionC;
    }

    private final Object o1(Object obj, boolean z10) {
        InterfaceC6835l interfaceC6835l;
        UndeliveredElementException undeliveredElementExceptionC;
        Object objK = super.k(obj);
        if (k.j(objK) || k.h(objK)) {
            return objK;
        }
        if (!z10 || (interfaceC6835l = this.f10834b) == null || (undeliveredElementExceptionC = Ni.v.c(interfaceC6835l, obj, null, 2, null)) == null) {
            return k.f10873b.c(J.f24997a);
        }
        throw undeliveredElementExceptionC;
    }

    private final Object p1(Object obj, boolean z10) {
        return this.f10884n == a.DROP_LATEST ? o1(obj, z10) : d1(obj);
    }

    @Override // Ki.e, Ki.w
    public Object b(Object obj, InterfaceC5380e interfaceC5380e) {
        return n1(this, obj, interfaceC5380e);
    }

    @Override // Ki.e, Ki.w
    public Object k(Object obj) {
        return p1(obj, false);
    }

    @Override // Ki.e
    protected boolean w0() {
        return this.f10884n == a.DROP_OLDEST;
    }
}
