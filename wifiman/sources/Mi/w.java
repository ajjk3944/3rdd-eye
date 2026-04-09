package Mi;

import Ii.InterfaceC3091y0;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
public abstract class w {
    public static final void b(final t tVar, InterfaceC5384i interfaceC5384i) {
        if (((Number) interfaceC5384i.fold(0, new InterfaceC6839p() { // from class: Mi.v
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(w.c(tVar, ((Integer) obj).intValue(), (InterfaceC5384i.b) obj2));
            }
        })).intValue() == tVar.f13303c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + tVar.f13302b + ",\n\t\tbut emission happened in " + interfaceC5384i + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(t tVar, int i10, InterfaceC5384i.b bVar) {
        InterfaceC5384i.c key = bVar.getKey();
        InterfaceC5384i.b bVar2 = tVar.f13302b.get(key);
        if (key != InterfaceC3091y0.f9363O) {
            return bVar != bVar2 ? PduHandle.NONE : i10 + 1;
        }
        InterfaceC3091y0 interfaceC3091y0 = (InterfaceC3091y0) bVar2;
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        InterfaceC3091y0 interfaceC3091y0D = d((InterfaceC3091y0) bVar, interfaceC3091y0);
        if (interfaceC3091y0D == interfaceC3091y0) {
            return interfaceC3091y0 == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC3091y0D + ", expected child of " + interfaceC3091y0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final InterfaceC3091y0 d(InterfaceC3091y0 interfaceC3091y0, InterfaceC3091y0 interfaceC3091y02) {
        while (interfaceC3091y0 != null) {
            if (interfaceC3091y0 == interfaceC3091y02 || !(interfaceC3091y0 instanceof Ni.y)) {
                return interfaceC3091y0;
            }
            interfaceC3091y0 = ((Ni.y) interfaceC3091y0).getParent();
        }
        return null;
    }
}
