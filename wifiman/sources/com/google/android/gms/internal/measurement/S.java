package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class S extends A {
    protected S() {
        this.f34919a.add(Z.ADD);
        this.f34919a.add(Z.DIVIDE);
        this.f34919a.add(Z.MODULUS);
        this.f34919a.add(Z.MULTIPLY);
        this.f34919a.add(Z.NEGATE);
        this.f34919a.add(Z.POST_DECREMENT);
        this.f34919a.add(Z.POST_INCREMENT);
        this.f34919a.add(Z.PRE_DECREMENT);
        this.f34919a.add(Z.PRE_INCREMENT);
        this.f34919a.add(Z.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC4449s b(String str, Z2 z22, List list) {
        switch (V.f35125a[AbstractC4354g2.c(str).ordinal()]) {
            case 1:
                AbstractC4354g2.f(Z.ADD, 2, list);
                InterfaceC4449s interfaceC4449sB = z22.b((InterfaceC4449s) list.get(0));
                InterfaceC4449s interfaceC4449sB2 = z22.b((InterfaceC4449s) list.get(1));
                if (!(interfaceC4449sB instanceof InterfaceC4402m) && !(interfaceC4449sB instanceof C4465u) && !(interfaceC4449sB2 instanceof InterfaceC4402m) && !(interfaceC4449sB2 instanceof C4465u)) {
                    return new C4386k(Double.valueOf(interfaceC4449sB.zze().doubleValue() + interfaceC4449sB2.zze().doubleValue()));
                }
                return new C4465u(interfaceC4449sB.zzf() + interfaceC4449sB2.zzf());
            case 2:
                AbstractC4354g2.f(Z.DIVIDE, 2, list);
                return new C4386k(Double.valueOf(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue() / z22.b((InterfaceC4449s) list.get(1)).zze().doubleValue()));
            case 3:
                AbstractC4354g2.f(Z.MODULUS, 2, list);
                return new C4386k(Double.valueOf(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue() % z22.b((InterfaceC4449s) list.get(1)).zze().doubleValue()));
            case 4:
                AbstractC4354g2.f(Z.MULTIPLY, 2, list);
                return new C4386k(Double.valueOf(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue() * z22.b((InterfaceC4449s) list.get(1)).zze().doubleValue()));
            case 5:
                AbstractC4354g2.f(Z.NEGATE, 1, list);
                return new C4386k(Double.valueOf(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                AbstractC4354g2.g(str, 2, list);
                InterfaceC4449s interfaceC4449sB3 = z22.b((InterfaceC4449s) list.get(0));
                z22.b((InterfaceC4449s) list.get(1));
                return interfaceC4449sB3;
            case 8:
            case 9:
                AbstractC4354g2.g(str, 1, list);
                return z22.b((InterfaceC4449s) list.get(0));
            case 10:
                AbstractC4354g2.f(Z.SUBTRACT, 2, list);
                return new C4386k(Double.valueOf(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue() + new C4386k(Double.valueOf(z22.b((InterfaceC4449s) list.get(1)).zze().doubleValue() * (-1.0d))).zze().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
