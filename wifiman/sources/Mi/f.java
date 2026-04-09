package Mi;

import Ii.H;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Yg.J;
import dh.InterfaceC5380e;
import dh.InterfaceC5381f;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class f extends d {

    /* renamed from: d, reason: collision with root package name */
    protected final InterfaceC3220g f13246d;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f13247a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13248b;

        a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = f.this.new a(interfaceC5380e);
            aVar.f13248b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f13247a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC3221h interfaceC3221h = (InterfaceC3221h) this.f13248b;
                f fVar = f.this;
                this.f13247a = 1;
                if (fVar.s(interfaceC3221h, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            return ((a) create(interfaceC3221h, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public f(InterfaceC3220g interfaceC3220g, InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        super(interfaceC5384i, i10, aVar);
        this.f13246d = interfaceC3220g;
    }

    static /* synthetic */ Object p(f fVar, InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
        if (fVar.f13237b == -3) {
            InterfaceC5384i context = interfaceC5380e.getContext();
            InterfaceC5384i interfaceC5384iK = H.k(context, fVar.f13236a);
            if (AbstractC6492s.d(interfaceC5384iK, context)) {
                Object objS = fVar.s(interfaceC3221h, interfaceC5380e);
                return objS == AbstractC5467b.g() ? objS : J.f24997a;
            }
            InterfaceC5381f.b bVar = InterfaceC5381f.f46086m0;
            if (AbstractC6492s.d(interfaceC5384iK.get(bVar), context.get(bVar))) {
                Object objR = fVar.r(interfaceC3221h, interfaceC5384iK, interfaceC5380e);
                return objR == AbstractC5467b.g() ? objR : J.f24997a;
            }
        }
        Object objB = super.b(interfaceC3221h, interfaceC5380e);
        return objB == AbstractC5467b.g() ? objB : J.f24997a;
    }

    static /* synthetic */ Object q(f fVar, Ki.t tVar, InterfaceC5380e interfaceC5380e) {
        Object objS = fVar.s(new x(tVar), interfaceC5380e);
        return objS == AbstractC5467b.g() ? objS : J.f24997a;
    }

    private final Object r(InterfaceC3221h interfaceC3221h, InterfaceC5384i interfaceC5384i, InterfaceC5380e interfaceC5380e) {
        return e.c(interfaceC5384i, e.d(interfaceC3221h, interfaceC5380e.getContext()), null, new a(null), interfaceC5380e, 4, null);
    }

    @Override // Mi.d, Li.InterfaceC3220g
    public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
        return p(this, interfaceC3221h, interfaceC5380e);
    }

    @Override // Mi.d
    protected Object g(Ki.t tVar, InterfaceC5380e interfaceC5380e) {
        return q(this, tVar, interfaceC5380e);
    }

    protected abstract Object s(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e);

    @Override // Mi.d
    public String toString() {
        return this.f13246d + " -> " + super.toString();
    }
}
