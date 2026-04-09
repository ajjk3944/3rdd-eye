package Mi;

import Li.E;
import Li.N;
import org.snmp4j.mp.MPv3;

/* loaded from: classes4.dex */
final class z extends E implements N {
    public z(int i10) {
        super(1, MPv3.MAX_MESSAGE_ID, Ki.a.DROP_OLDEST);
        j(Integer.valueOf(i10));
    }

    @Override // Li.N
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) N()).intValue());
        }
        return numValueOf;
    }

    public final boolean b0(int i10) {
        boolean zJ;
        synchronized (this) {
            zJ = j(Integer.valueOf(((Number) N()).intValue() + i10));
        }
        return zJ;
    }
}
