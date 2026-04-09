package T;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class E1 {

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f20845a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6835l interfaceC6835l) {
            super(2);
            this.f20845a = interfaceC6835l;
        }

        public final void a(Object obj, Yg.J j10) {
            this.f20845a.invoke(obj);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(obj, (Yg.J) obj2);
            return Yg.J.f24997a;
        }
    }

    public static InterfaceC3540l a(InterfaceC3540l interfaceC3540l) {
        return interfaceC3540l;
    }

    public static final void b(InterfaceC3540l interfaceC3540l, InterfaceC6835l interfaceC6835l) {
        if (interfaceC3540l.o()) {
            interfaceC3540l.Q(Yg.J.f24997a, new a(interfaceC6835l));
        }
    }

    public static final void c(InterfaceC3540l interfaceC3540l, Object obj, InterfaceC6839p interfaceC6839p) {
        if (interfaceC3540l.o() || !AbstractC6492s.d(interfaceC3540l.f(), obj)) {
            interfaceC3540l.K(obj);
            interfaceC3540l.Q(obj, interfaceC6839p);
        }
    }
}
