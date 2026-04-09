package Li;

import Zg.AbstractC3682n;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6839p;
import org.snmp4j.mp.MPv3;

/* loaded from: classes4.dex */
abstract /* synthetic */ class t {

    /* renamed from: a, reason: collision with root package name */
    private static final int f11996a = Ni.D.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, MPv3.MAX_MESSAGE_ID);

    static final class a extends kotlin.coroutines.jvm.internal.l implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        int f11997a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f11998b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f11999c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f12000d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
            this.f12000d = interfaceC6839p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3221h interfaceC3221h;
            Object objG = AbstractC5467b.g();
            int i10 = this.f11997a;
            if (i10 == 0) {
                Yg.v.b(obj);
                interfaceC3221h = (InterfaceC3221h) this.f11998b;
                Object obj2 = this.f11999c;
                InterfaceC6839p interfaceC6839p = this.f12000d;
                this.f11998b = interfaceC3221h;
                this.f11997a = 1;
                obj = interfaceC6839p.invoke(obj2, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                    return Yg.J.f24997a;
                }
                interfaceC3221h = (InterfaceC3221h) this.f11998b;
                Yg.v.b(obj);
            }
            this.f11998b = null;
            this.f11997a = 2;
            if (interfaceC3221h.a(obj, this) == objG) {
                return objG;
            }
            return Yg.J.f24997a;
        }

        @Override // mh.q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object s(InterfaceC3221h interfaceC3221h, Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f12000d, interfaceC5380e);
            aVar.f11998b = interfaceC3221h;
            aVar.f11999c = obj;
            return aVar.invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final InterfaceC3220g a(InterfaceC3220g interfaceC3220g, InterfaceC6839p interfaceC6839p) {
        return AbstractC3222i.O(interfaceC3220g, new a(interfaceC6839p, null));
    }

    public static final InterfaceC3220g b(Iterable iterable) {
        return new Mi.i(iterable, null, 0, null, 14, null);
    }

    public static final InterfaceC3220g c(InterfaceC3220g... interfaceC3220gArr) {
        return AbstractC3222i.F(AbstractC3682n.P(interfaceC3220gArr));
    }

    public static final InterfaceC3220g d(InterfaceC3220g interfaceC3220g, mh.q qVar) {
        return new Mi.h(qVar, interfaceC3220g, null, 0, null, 28, null);
    }
}
