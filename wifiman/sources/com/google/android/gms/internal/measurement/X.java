package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class X extends A {
    protected X() {
        this.f34919a.add(Z.ASSIGN);
        this.f34919a.add(Z.CONST);
        this.f34919a.add(Z.CREATE_ARRAY);
        this.f34919a.add(Z.CREATE_OBJECT);
        this.f34919a.add(Z.EXPRESSION_LIST);
        this.f34919a.add(Z.GET);
        this.f34919a.add(Z.GET_INDEX);
        this.f34919a.add(Z.GET_PROPERTY);
        this.f34919a.add(Z.NULL);
        this.f34919a.add(Z.SET_PROPERTY);
        this.f34919a.add(Z.TYPEOF);
        this.f34919a.add(Z.UNDEFINED);
        this.f34919a.add(Z.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC4449s b(String str, Z2 z22, List list) {
        String str2;
        int i10 = 0;
        switch (W.f35139a[AbstractC4354g2.c(str).ordinal()]) {
            case 1:
                AbstractC4354g2.f(Z.ASSIGN, 2, list);
                InterfaceC4449s interfaceC4449sB = z22.b((InterfaceC4449s) list.get(0));
                if (!(interfaceC4449sB instanceof C4465u)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", interfaceC4449sB.getClass().getCanonicalName()));
                }
                if (!z22.g(interfaceC4449sB.zzf())) {
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", interfaceC4449sB.zzf()));
                }
                InterfaceC4449s interfaceC4449sB2 = z22.b((InterfaceC4449s) list.get(1));
                z22.h(interfaceC4449sB.zzf(), interfaceC4449sB2);
                return interfaceC4449sB2;
            case 2:
                AbstractC4354g2.j(Z.CONST, 2, list);
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                while (i10 < list.size() - 1) {
                    InterfaceC4449s interfaceC4449sB3 = z22.b((InterfaceC4449s) list.get(i10));
                    if (!(interfaceC4449sB3 instanceof C4465u)) {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", interfaceC4449sB3.getClass().getCanonicalName()));
                    }
                    z22.f(interfaceC4449sB3.zzf(), z22.b((InterfaceC4449s) list.get(i10 + 1)));
                    i10 += 2;
                }
                return InterfaceC4449s.f35450e0;
            case 3:
                if (list.isEmpty()) {
                    return new C4351g();
                }
                C4351g c4351g = new C4351g();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC4449s interfaceC4449sB4 = z22.b((InterfaceC4449s) it.next());
                    if (interfaceC4449sB4 instanceof C4394l) {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                    c4351g.s(i10, interfaceC4449sB4);
                    i10++;
                }
                return c4351g;
            case 4:
                if (list.isEmpty()) {
                    return new r();
                }
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                r rVar = new r();
                while (i10 < list.size() - 1) {
                    InterfaceC4449s interfaceC4449sB5 = z22.b((InterfaceC4449s) list.get(i10));
                    InterfaceC4449s interfaceC4449sB6 = z22.b((InterfaceC4449s) list.get(i10 + 1));
                    if ((interfaceC4449sB5 instanceof C4394l) || (interfaceC4449sB6 instanceof C4394l)) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    rVar.f(interfaceC4449sB5.zzf(), interfaceC4449sB6);
                    i10 += 2;
                }
                return rVar;
            case 5:
                AbstractC4354g2.j(Z.EXPRESSION_LIST, 1, list);
                InterfaceC4449s interfaceC4449sB7 = InterfaceC4449s.f35450e0;
                while (i10 < list.size()) {
                    interfaceC4449sB7 = z22.b((InterfaceC4449s) list.get(i10));
                    if (interfaceC4449sB7 instanceof C4394l) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i10++;
                }
                return interfaceC4449sB7;
            case 6:
                AbstractC4354g2.f(Z.GET, 1, list);
                InterfaceC4449s interfaceC4449sB8 = z22.b((InterfaceC4449s) list.get(0));
                if (interfaceC4449sB8 instanceof C4465u) {
                    return z22.c(interfaceC4449sB8.zzf());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", interfaceC4449sB8.getClass().getCanonicalName()));
            case 7:
            case 8:
                AbstractC4354g2.f(Z.GET_PROPERTY, 2, list);
                InterfaceC4449s interfaceC4449sB9 = z22.b((InterfaceC4449s) list.get(0));
                InterfaceC4449s interfaceC4449sB10 = z22.b((InterfaceC4449s) list.get(1));
                if ((interfaceC4449sB9 instanceof C4351g) && AbstractC4354g2.l(interfaceC4449sB10)) {
                    return ((C4351g) interfaceC4449sB9).i(interfaceC4449sB10.zze().intValue());
                }
                if (interfaceC4449sB9 instanceof InterfaceC4402m) {
                    return ((InterfaceC4402m) interfaceC4449sB9).zza(interfaceC4449sB10.zzf());
                }
                if (interfaceC4449sB9 instanceof C4465u) {
                    if ("length".equals(interfaceC4449sB10.zzf())) {
                        return new C4386k(Double.valueOf(interfaceC4449sB9.zzf().length()));
                    }
                    if (AbstractC4354g2.l(interfaceC4449sB10) && interfaceC4449sB10.zze().doubleValue() < interfaceC4449sB9.zzf().length()) {
                        return new C4465u(String.valueOf(interfaceC4449sB9.zzf().charAt(interfaceC4449sB10.zze().intValue())));
                    }
                }
                return InterfaceC4449s.f35450e0;
            case 9:
                AbstractC4354g2.f(Z.NULL, 0, list);
                return InterfaceC4449s.f35451f0;
            case 10:
                AbstractC4354g2.f(Z.SET_PROPERTY, 3, list);
                InterfaceC4449s interfaceC4449sB11 = z22.b((InterfaceC4449s) list.get(0));
                InterfaceC4449s interfaceC4449sB12 = z22.b((InterfaceC4449s) list.get(1));
                InterfaceC4449s interfaceC4449sB13 = z22.b((InterfaceC4449s) list.get(2));
                if (interfaceC4449sB11 == InterfaceC4449s.f35450e0 || interfaceC4449sB11 == InterfaceC4449s.f35451f0) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", interfaceC4449sB12.zzf(), interfaceC4449sB11.zzf()));
                }
                if ((interfaceC4449sB11 instanceof C4351g) && (interfaceC4449sB12 instanceof C4386k)) {
                    ((C4351g) interfaceC4449sB11).s(interfaceC4449sB12.zze().intValue(), interfaceC4449sB13);
                } else if (interfaceC4449sB11 instanceof InterfaceC4402m) {
                    ((InterfaceC4402m) interfaceC4449sB11).f(interfaceC4449sB12.zzf(), interfaceC4449sB13);
                }
                return interfaceC4449sB13;
            case 11:
                AbstractC4354g2.f(Z.TYPEOF, 1, list);
                InterfaceC4449s interfaceC4449sB14 = z22.b((InterfaceC4449s) list.get(0));
                if (interfaceC4449sB14 instanceof C4505z) {
                    str2 = "undefined";
                } else if (interfaceC4449sB14 instanceof C4360h) {
                    str2 = "boolean";
                } else if (interfaceC4449sB14 instanceof C4386k) {
                    str2 = "number";
                } else if (interfaceC4449sB14 instanceof C4465u) {
                    str2 = "string";
                } else if (interfaceC4449sB14 instanceof C4457t) {
                    str2 = "function";
                } else {
                    if ((interfaceC4449sB14 instanceof C4473v) || (interfaceC4449sB14 instanceof C4394l)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", interfaceC4449sB14));
                    }
                    str2 = "object";
                }
                return new C4465u(str2);
            case 12:
                AbstractC4354g2.f(Z.UNDEFINED, 0, list);
                return InterfaceC4449s.f35450e0;
            case 13:
                AbstractC4354g2.j(Z.VAR, 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC4449s interfaceC4449sB15 = z22.b((InterfaceC4449s) it2.next());
                    if (!(interfaceC4449sB15 instanceof C4465u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", interfaceC4449sB15.getClass().getCanonicalName()));
                    }
                    z22.e(interfaceC4449sB15.zzf(), InterfaceC4449s.f35450e0);
                }
                return InterfaceC4449s.f35450e0;
            default:
                return super.a(str);
        }
    }
}
