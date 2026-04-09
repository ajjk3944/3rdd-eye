package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class F extends A {
    protected F() {
        this.f34919a.add(Z.APPLY);
        this.f34919a.add(Z.BLOCK);
        this.f34919a.add(Z.BREAK);
        this.f34919a.add(Z.CASE);
        this.f34919a.add(Z.DEFAULT);
        this.f34919a.add(Z.CONTINUE);
        this.f34919a.add(Z.DEFINE_FUNCTION);
        this.f34919a.add(Z.FN);
        this.f34919a.add(Z.IF);
        this.f34919a.add(Z.QUOTE);
        this.f34919a.add(Z.RETURN);
        this.f34919a.add(Z.SWITCH);
        this.f34919a.add(Z.TERNARY);
    }

    private static InterfaceC4449s c(Z2 z22, List list) {
        AbstractC4354g2.j(Z.FN, 2, list);
        InterfaceC4449s interfaceC4449sB = z22.b((InterfaceC4449s) list.get(0));
        InterfaceC4449s interfaceC4449sB2 = z22.b((InterfaceC4449s) list.get(1));
        if (!(interfaceC4449sB2 instanceof C4351g)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", interfaceC4449sB2.getClass().getCanonicalName()));
        }
        List listW = ((C4351g) interfaceC4449sB2).w();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C4457t(interfaceC4449sB.zzf(), listW, arrayList, z22);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC4449s b(String str, Z2 z22, List list) {
        int i10 = 0;
        switch (I.f35037a[AbstractC4354g2.c(str).ordinal()]) {
            case 1:
                AbstractC4354g2.f(Z.APPLY, 3, list);
                InterfaceC4449s interfaceC4449sB = z22.b((InterfaceC4449s) list.get(0));
                String strZzf = z22.b((InterfaceC4449s) list.get(1)).zzf();
                InterfaceC4449s interfaceC4449sB2 = z22.b((InterfaceC4449s) list.get(2));
                if (!(interfaceC4449sB2 instanceof C4351g)) {
                    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", interfaceC4449sB2.getClass().getCanonicalName()));
                }
                if (strZzf.isEmpty()) {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                return interfaceC4449sB.e(strZzf, z22, ((C4351g) interfaceC4449sB2).w());
            case 2:
                return z22.d().a(new C4351g(list));
            case 3:
                AbstractC4354g2.f(Z.BREAK, 0, list);
                return InterfaceC4449s.f35453h0;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    InterfaceC4449s interfaceC4449sB3 = z22.b((InterfaceC4449s) list.get(0));
                    if (interfaceC4449sB3 instanceof C4351g) {
                        return z22.a((C4351g) interfaceC4449sB3);
                    }
                }
                return InterfaceC4449s.f35450e0;
            case 6:
                AbstractC4354g2.f(Z.BREAK, 0, list);
                return InterfaceC4449s.f35452g0;
            case 7:
                AbstractC4354g2.j(Z.DEFINE_FUNCTION, 2, list);
                C4457t c4457t = (C4457t) c(z22, list);
                if (c4457t.c() == null) {
                    z22.h("", c4457t);
                } else {
                    z22.h(c4457t.c(), c4457t);
                }
                return c4457t;
            case 8:
                return c(z22, list);
            case 9:
                AbstractC4354g2.j(Z.IF, 2, list);
                InterfaceC4449s interfaceC4449sB4 = z22.b((InterfaceC4449s) list.get(0));
                InterfaceC4449s interfaceC4449sB5 = z22.b((InterfaceC4449s) list.get(1));
                InterfaceC4449s interfaceC4449sB6 = list.size() > 2 ? z22.b((InterfaceC4449s) list.get(2)) : null;
                InterfaceC4449s interfaceC4449s = InterfaceC4449s.f35450e0;
                InterfaceC4449s interfaceC4449sA = interfaceC4449sB4.zzd().booleanValue() ? z22.a((C4351g) interfaceC4449sB5) : interfaceC4449sB6 != null ? z22.a((C4351g) interfaceC4449sB6) : interfaceC4449s;
                return interfaceC4449sA instanceof C4394l ? interfaceC4449sA : interfaceC4449s;
            case 10:
                return new C4351g(list);
            case 11:
                if (list.isEmpty()) {
                    return InterfaceC4449s.f35454i0;
                }
                AbstractC4354g2.f(Z.RETURN, 1, list);
                return new C4394l("return", z22.b((InterfaceC4449s) list.get(0)));
            case 12:
                AbstractC4354g2.f(Z.SWITCH, 3, list);
                InterfaceC4449s interfaceC4449sB7 = z22.b((InterfaceC4449s) list.get(0));
                InterfaceC4449s interfaceC4449sB8 = z22.b((InterfaceC4449s) list.get(1));
                InterfaceC4449s interfaceC4449sB9 = z22.b((InterfaceC4449s) list.get(2));
                if (!(interfaceC4449sB8 instanceof C4351g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(interfaceC4449sB9 instanceof C4351g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C4351g c4351g = (C4351g) interfaceC4449sB8;
                C4351g c4351g2 = (C4351g) interfaceC4449sB9;
                boolean z10 = false;
                while (true) {
                    if (i10 < c4351g.m()) {
                        if (z10 || interfaceC4449sB7.equals(z22.b(c4351g.i(i10)))) {
                            InterfaceC4449s interfaceC4449sB10 = z22.b(c4351g2.i(i10));
                            if (!(interfaceC4449sB10 instanceof C4394l)) {
                                z10 = true;
                            } else if (!((C4394l) interfaceC4449sB10).b().equals("break")) {
                                return interfaceC4449sB10;
                            }
                        }
                        i10++;
                    } else if (c4351g.m() + 1 == c4351g2.m()) {
                        InterfaceC4449s interfaceC4449sB11 = z22.b(c4351g2.i(c4351g.m()));
                        if (interfaceC4449sB11 instanceof C4394l) {
                            String strB = ((C4394l) interfaceC4449sB11).b();
                            if (strB.equals("return") || strB.equals("continue")) {
                                return interfaceC4449sB11;
                            }
                        }
                    }
                }
                return InterfaceC4449s.f35450e0;
            case 13:
                AbstractC4354g2.f(Z.TERNARY, 3, list);
                return z22.b((InterfaceC4449s) list.get(0)).zzd().booleanValue() ? z22.b((InterfaceC4449s) list.get(1)) : z22.b((InterfaceC4449s) list.get(2));
            default:
                return super.a(str);
        }
    }
}
