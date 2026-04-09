package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class L extends A {
    protected L() {
        this.f34919a.add(Z.FOR_IN);
        this.f34919a.add(Z.FOR_IN_CONST);
        this.f34919a.add(Z.FOR_IN_LET);
        this.f34919a.add(Z.FOR_LET);
        this.f34919a.add(Z.FOR_OF);
        this.f34919a.add(Z.FOR_OF_CONST);
        this.f34919a.add(Z.FOR_OF_LET);
        this.f34919a.add(Z.WHILE);
    }

    private static InterfaceC4449s c(P p10, InterfaceC4449s interfaceC4449s, InterfaceC4449s interfaceC4449s2) {
        return d(p10, interfaceC4449s.zzh(), interfaceC4449s2);
    }

    private static InterfaceC4449s d(P p10, Iterator it, InterfaceC4449s interfaceC4449s) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC4449s interfaceC4449sA = p10.a((InterfaceC4449s) it.next()).a((C4351g) interfaceC4449s);
                if (interfaceC4449sA instanceof C4394l) {
                    C4394l c4394l = (C4394l) interfaceC4449sA;
                    if ("break".equals(c4394l.b())) {
                        return InterfaceC4449s.f35450e0;
                    }
                    if ("return".equals(c4394l.b())) {
                        return c4394l;
                    }
                }
            }
        }
        return InterfaceC4449s.f35450e0;
    }

    private static InterfaceC4449s e(P p10, InterfaceC4449s interfaceC4449s, InterfaceC4449s interfaceC4449s2) {
        if (interfaceC4449s instanceof Iterable) {
            return d(p10, ((Iterable) interfaceC4449s).iterator(), interfaceC4449s2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC4449s b(java.lang.String r11, com.google.android.gms.internal.measurement.Z2 r12, java.util.List r13) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.L.b(java.lang.String, com.google.android.gms.internal.measurement.Z2, java.util.List):com.google.android.gms.internal.measurement.s");
    }
}
