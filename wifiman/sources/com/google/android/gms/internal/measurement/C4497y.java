package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4497y extends A {
    public C4497y() {
        this.f34919a.add(Z.BITWISE_AND);
        this.f34919a.add(Z.BITWISE_LEFT_SHIFT);
        this.f34919a.add(Z.BITWISE_NOT);
        this.f34919a.add(Z.BITWISE_OR);
        this.f34919a.add(Z.BITWISE_RIGHT_SHIFT);
        this.f34919a.add(Z.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f34919a.add(Z.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC4449s b(String str, Z2 z22, List list) {
        switch (B.f34935a[AbstractC4354g2.c(str).ordinal()]) {
            case 1:
                AbstractC4354g2.f(Z.BITWISE_AND, 2, list);
                return new C4386k(Double.valueOf(AbstractC4354g2.i(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue()) & AbstractC4354g2.i(z22.b((InterfaceC4449s) list.get(1)).zze().doubleValue())));
            case 2:
                AbstractC4354g2.f(Z.BITWISE_LEFT_SHIFT, 2, list);
                return new C4386k(Double.valueOf(AbstractC4354g2.i(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue()) << ((int) (AbstractC4354g2.m(z22.b((InterfaceC4449s) list.get(1)).zze().doubleValue()) & 31))));
            case 3:
                AbstractC4354g2.f(Z.BITWISE_NOT, 1, list);
                return new C4386k(Double.valueOf(~AbstractC4354g2.i(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue())));
            case 4:
                AbstractC4354g2.f(Z.BITWISE_OR, 2, list);
                return new C4386k(Double.valueOf(AbstractC4354g2.i(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue()) | AbstractC4354g2.i(z22.b((InterfaceC4449s) list.get(1)).zze().doubleValue())));
            case 5:
                AbstractC4354g2.f(Z.BITWISE_RIGHT_SHIFT, 2, list);
                return new C4386k(Double.valueOf(AbstractC4354g2.i(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue()) >> ((int) (AbstractC4354g2.m(z22.b((InterfaceC4449s) list.get(1)).zze().doubleValue()) & 31))));
            case 6:
                AbstractC4354g2.f(Z.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new C4386k(Double.valueOf(AbstractC4354g2.m(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue()) >>> ((int) (AbstractC4354g2.m(z22.b((InterfaceC4449s) list.get(1)).zze().doubleValue()) & 31))));
            case 7:
                AbstractC4354g2.f(Z.BITWISE_XOR, 2, list);
                return new C4386k(Double.valueOf(AbstractC4354g2.i(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue()) ^ AbstractC4354g2.i(z22.b((InterfaceC4449s) list.get(1)).zze().doubleValue())));
            default:
                return super.a(str);
        }
    }
}
