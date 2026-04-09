package E0;

import C0.AbstractC2521a;
import C0.C2533m;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public abstract class D {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(P p10, AbstractC2521a abstractC2521a) {
        P pZ0 = p10.Z0();
        if (!(pZ0 != null)) {
            B0.a.b("Child of " + p10 + " cannot be null when calculating alignment line");
        }
        if (p10.h1().p().containsKey(abstractC2521a)) {
            Integer num = (Integer) p10.h1().p().get(abstractC2521a);
            return num != null ? num.intValue() : PduHandle.NONE;
        }
        int iX = pZ0.X(abstractC2521a);
        if (iX == Integer.MIN_VALUE) {
            return PduHandle.NONE;
        }
        pZ0.U1(true);
        p10.S1(true);
        p10.R1();
        pZ0.U1(false);
        p10.S1(false);
        return iX + (abstractC2521a instanceof C2533m ? Y0.n.i(pZ0.r1()) : Y0.n.h(pZ0.r1()));
    }
}
