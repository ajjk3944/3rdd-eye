package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class J extends A {
    protected J() {
        this.f34919a.add(Z.AND);
        this.f34919a.add(Z.NOT);
        this.f34919a.add(Z.OR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC4449s b(String str, Z2 z22, List list) {
        int i10 = M.f35064a[AbstractC4354g2.c(str).ordinal()];
        if (i10 == 1) {
            AbstractC4354g2.f(Z.AND, 2, list);
            InterfaceC4449s interfaceC4449sB = z22.b((InterfaceC4449s) list.get(0));
            return !interfaceC4449sB.zzd().booleanValue() ? interfaceC4449sB : z22.b((InterfaceC4449s) list.get(1));
        }
        if (i10 == 2) {
            AbstractC4354g2.f(Z.NOT, 1, list);
            return new C4360h(Boolean.valueOf(!z22.b((InterfaceC4449s) list.get(0)).zzd().booleanValue()));
        }
        if (i10 != 3) {
            return super.a(str);
        }
        AbstractC4354g2.f(Z.OR, 2, list);
        InterfaceC4449s interfaceC4449sB2 = z22.b((InterfaceC4449s) list.get(0));
        return interfaceC4449sB2.zzd().booleanValue() ? interfaceC4449sB2 : z22.b((InterfaceC4449s) list.get(1));
    }
}
