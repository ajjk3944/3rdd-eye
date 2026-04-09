package Li;

import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6839p;

/* renamed from: Li.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC3225l {

    /* renamed from: Li.l$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f11924a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f11925b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3220g interfaceC3220g, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f11925b = interfaceC3220g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f11925b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f11924a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC3220g interfaceC3220g = this.f11925b;
                this.f11924a = 1;
                if (AbstractC3222i.h(interfaceC3220g, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final Object a(InterfaceC3220g interfaceC3220g, InterfaceC5380e interfaceC5380e) {
        Object objB = interfaceC3220g.b(Mi.q.f13297a, interfaceC5380e);
        return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
    }

    public static final Object b(InterfaceC3220g interfaceC3220g, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objH = AbstractC3222i.h(AbstractC3226m.b(AbstractC3222i.E(interfaceC3220g, interfaceC6839p), 0, null, 2, null), interfaceC5380e);
        return objH == AbstractC5467b.g() ? objH : Yg.J.f24997a;
    }

    public static final Object c(InterfaceC3221h interfaceC3221h, InterfaceC3220g interfaceC3220g, InterfaceC5380e interfaceC5380e) {
        AbstractC3222i.v(interfaceC3221h);
        Object objB = interfaceC3220g.b(interfaceC3221h, interfaceC5380e);
        return objB == AbstractC5467b.g() ? objB : Yg.J.f24997a;
    }

    public static final InterfaceC3091y0 d(InterfaceC3220g interfaceC3220g, Ii.N n10) {
        return AbstractC3063k.d(n10, null, null, new a(interfaceC3220g, null), 3, null);
    }
}
