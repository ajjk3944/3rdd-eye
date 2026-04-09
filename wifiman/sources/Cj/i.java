package cj;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public interface i {
    /* JADX INFO: Access modifiers changed from: private */
    static Vi.b f(Vi.b bVar, List it) {
        AbstractC6492s.i(it, "it");
        return bVar;
    }

    default void b(th.d kClass, final Vi.b serializer) {
        AbstractC6492s.i(kClass, "kClass");
        AbstractC6492s.i(serializer, "serializer");
        c(kClass, new InterfaceC6835l() { // from class: cj.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.f(serializer, (List) obj);
            }
        });
    }

    void c(th.d dVar, InterfaceC6835l interfaceC6835l);

    void d(th.d dVar, InterfaceC6835l interfaceC6835l);

    void e(th.d dVar, th.d dVar2, Vi.b bVar);

    void g(th.d dVar, InterfaceC6835l interfaceC6835l);
}
