package bi;

import Bh.InterfaceC2491a;
import Bh.InterfaceC2495e;

/* loaded from: classes4.dex */
public interface j {

    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum b {
        OVERRIDABLE,
        INCOMPATIBLE,
        UNKNOWN
    }

    a a();

    b b(InterfaceC2491a interfaceC2491a, InterfaceC2491a interfaceC2491a2, InterfaceC2495e interfaceC2495e);
}
