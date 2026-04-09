package z;

import C0.InterfaceC2534n;
import java.util.List;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public static final I f66803a = new I();

    private I() {
    }

    public final int a(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC2534n interfaceC2534n = (InterfaceC2534n) list.get(i12);
            float fE = S.e(S.c(interfaceC2534n));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC2534n.S(MPv3.MAX_MESSAGE_ID), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2534n.s(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC2534n interfaceC2534n2 = (InterfaceC2534n) list.get(i13);
            float fE2 = S.e(S.c(interfaceC2534n2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC2534n2.s(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int b(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC2534n interfaceC2534n = (InterfaceC2534n) list.get(i13);
            float fE = S.e(S.c(interfaceC2534n));
            int iS = interfaceC2534n.S(i10);
            if (fE == 0.0f) {
                i12 += iS;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iS / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int c(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC2534n interfaceC2534n = (InterfaceC2534n) list.get(i12);
            float fE = S.e(S.c(interfaceC2534n));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC2534n.S(MPv3.MAX_MESSAGE_ID), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2534n.s0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC2534n interfaceC2534n2 = (InterfaceC2534n) list.get(i13);
            float fE2 = S.e(S.c(interfaceC2534n2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC2534n2.s0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int d(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC2534n interfaceC2534n = (InterfaceC2534n) list.get(i13);
            float fE = S.e(S.c(interfaceC2534n));
            int iR = interfaceC2534n.R(i10);
            if (fE == 0.0f) {
                i12 += iR;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iR / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int e(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC2534n interfaceC2534n = (InterfaceC2534n) list.get(i13);
            float fE = S.e(S.c(interfaceC2534n));
            int iS = interfaceC2534n.s(i10);
            if (fE == 0.0f) {
                i12 += iS;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iS / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int f(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC2534n interfaceC2534n = (InterfaceC2534n) list.get(i12);
            float fE = S.e(S.c(interfaceC2534n));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC2534n.s(MPv3.MAX_MESSAGE_ID), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2534n.S(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC2534n interfaceC2534n2 = (InterfaceC2534n) list.get(i13);
            float fE2 = S.e(S.c(interfaceC2534n2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC2534n2.S(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int g(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC2534n interfaceC2534n = (InterfaceC2534n) list.get(i13);
            float fE = S.e(S.c(interfaceC2534n));
            int iS0 = interfaceC2534n.s0(i10);
            if (fE == 0.0f) {
                i12 += iS0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iS0 / fE));
            }
        }
        return Math.round(iMax * f10) + i12 + ((list.size() - 1) * i11);
    }

    public final int h(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC2534n interfaceC2534n = (InterfaceC2534n) list.get(i12);
            float fE = S.e(S.c(interfaceC2534n));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC2534n.s(MPv3.MAX_MESSAGE_ID), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2534n.R(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC2534n interfaceC2534n2 = (InterfaceC2534n) list.get(i13);
            float fE2 = S.e(S.c(interfaceC2534n2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC2534n2.R(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}
