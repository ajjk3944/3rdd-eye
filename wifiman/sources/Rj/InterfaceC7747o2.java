package rj;

import mh.InterfaceC6835l;
import org.kodein.di.DI;

/* renamed from: rj.o2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7747o2 extends InterfaceC7740n2 {

    /* renamed from: rj.o2$a */
    public static final class a {
        public static DI a(InterfaceC7747o2 interfaceC7747o2) {
            return interfaceC7747o2.f();
        }
    }

    Object b(org.kodein.type.q qVar, org.kodein.type.q qVar2, Object obj, Object obj2);

    InterfaceC6835l c(org.kodein.type.q qVar, org.kodein.type.q qVar2, Object obj);

    DI d();

    Object e(org.kodein.type.q qVar, Object obj);

    DI f();

    InterfaceC7733m2 h(org.kodein.di.f fVar);
}
