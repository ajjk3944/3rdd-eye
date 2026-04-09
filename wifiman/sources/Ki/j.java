package Ki;

import mh.InterfaceC6835l;
import org.snmp4j.mp.MPv3;

/* loaded from: classes4.dex */
public abstract class j {
    public static final g a(int i10, a aVar, InterfaceC6835l interfaceC6835l) {
        g eVar;
        if (i10 == -2) {
            eVar = aVar == a.SUSPEND ? new e(g.f10869P.a(), interfaceC6835l) : new q(1, aVar, interfaceC6835l);
        } else {
            if (i10 == -1) {
                if (aVar == a.SUSPEND) {
                    return new q(1, a.DROP_OLDEST, interfaceC6835l);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i10 != 0) {
                return i10 != Integer.MAX_VALUE ? aVar == a.SUSPEND ? new e(i10, interfaceC6835l) : new q(i10, aVar, interfaceC6835l) : new e(MPv3.MAX_MESSAGE_ID, interfaceC6835l);
            }
            eVar = aVar == a.SUSPEND ? new e(0, interfaceC6835l) : new q(1, aVar, interfaceC6835l);
        }
        return eVar;
    }

    public static /* synthetic */ g b(int i10, a aVar, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            interfaceC6835l = null;
        }
        return a(i10, aVar, interfaceC6835l);
    }
}
