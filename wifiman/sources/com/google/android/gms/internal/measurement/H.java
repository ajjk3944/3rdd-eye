package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class H {
    private static C4351g a(C4351g c4351g, Z2 z22, AbstractC4410n abstractC4410n) {
        return b(c4351g, z22, abstractC4410n, null, null);
    }

    private static C4351g b(C4351g c4351g, Z2 z22, AbstractC4410n abstractC4410n, Boolean bool, Boolean bool2) {
        C4351g c4351g2 = new C4351g();
        Iterator itV = c4351g.v();
        while (itV.hasNext()) {
            int iIntValue = ((Integer) itV.next()).intValue();
            if (c4351g.u(iIntValue)) {
                InterfaceC4449s interfaceC4449sA = abstractC4410n.a(z22, Arrays.asList(c4351g.i(iIntValue), new C4386k(Double.valueOf(iIntValue)), c4351g));
                if (interfaceC4449sA.zzd().equals(bool)) {
                    return c4351g2;
                }
                if (bool2 == null || interfaceC4449sA.zzd().equals(bool2)) {
                    c4351g2.s(iIntValue, interfaceC4449sA);
                }
            }
        }
        return c4351g2;
    }

    private static InterfaceC4449s c(C4351g c4351g, Z2 z22, List list, boolean z10) {
        InterfaceC4449s interfaceC4449sA;
        AbstractC4354g2.k("reduce", 1, list);
        AbstractC4354g2.n("reduce", 2, list);
        InterfaceC4449s interfaceC4449sB = z22.b((InterfaceC4449s) list.get(0));
        if (!(interfaceC4449sB instanceof AbstractC4410n)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            interfaceC4449sA = z22.b((InterfaceC4449s) list.get(1));
            if (interfaceC4449sA instanceof C4394l) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c4351g.m() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC4449sA = null;
        }
        AbstractC4410n abstractC4410n = (AbstractC4410n) interfaceC4449sB;
        int iM = c4351g.m();
        int i10 = z10 ? 0 : iM - 1;
        int i11 = z10 ? iM - 1 : 0;
        int i12 = z10 ? 1 : -1;
        if (interfaceC4449sA == null) {
            interfaceC4449sA = c4351g.i(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (c4351g.u(i10)) {
                interfaceC4449sA = abstractC4410n.a(z22, Arrays.asList(interfaceC4449sA, c4351g.i(i10), new C4386k(Double.valueOf(i10)), c4351g));
                if (interfaceC4449sA instanceof C4394l) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return interfaceC4449sA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static InterfaceC4449s d(String str, C4351g c4351g, Z2 z22, List list) {
        String str2;
        char c10;
        double d10;
        String strZzf;
        AbstractC4410n abstractC4410n;
        int i10;
        Z2 z23;
        Double d11;
        double dA;
        str.hashCode();
        Double dValueOf = Double.valueOf(-1.0d);
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c10 = 0;
                    break;
                } else {
                    c10 = 65535;
                    break;
                }
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c10 = 1;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    c10 = 2;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    str2 = "toString";
                    c10 = 3;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c10 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c10 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c10 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c10 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c10 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c10 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c10 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c10 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c10 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c10 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    c10 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c10 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c10 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c10 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c10 = 18;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c10 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            default:
                str2 = "toString";
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                AbstractC4354g2.g(str2, 0, list);
                return new C4465u(c4351g.toString());
            case 1:
                C4351g c4351g2 = (C4351g) c4351g.zzc();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC4449s interfaceC4449sB = z22.b((InterfaceC4449s) it.next());
                        if (interfaceC4449sB instanceof C4394l) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int iM = c4351g2.m();
                        if (interfaceC4449sB instanceof C4351g) {
                            C4351g c4351g3 = (C4351g) interfaceC4449sB;
                            Iterator itV = c4351g3.v();
                            while (itV.hasNext()) {
                                Integer num = (Integer) itV.next();
                                c4351g2.s(num.intValue() + iM, c4351g3.i(num.intValue()));
                            }
                        } else {
                            c4351g2.s(iM, interfaceC4449sB);
                        }
                    }
                }
                return c4351g2;
            case 2:
                AbstractC4354g2.g("filter", 1, list);
                InterfaceC4449s interfaceC4449sB2 = z22.b((InterfaceC4449s) list.get(0));
                if (!(interfaceC4449sB2 instanceof C4457t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c4351g.g() == 0) {
                    return new C4351g();
                }
                C4351g c4351g4 = (C4351g) c4351g.zzc();
                C4351g c4351gB = b(c4351g, z22, (C4457t) interfaceC4449sB2, null, Boolean.TRUE);
                C4351g c4351g5 = new C4351g();
                Iterator itV2 = c4351gB.v();
                while (itV2.hasNext()) {
                    c4351g5.k(c4351g4.i(((Integer) itV2.next()).intValue()));
                }
                return c4351g5;
            case 3:
                return c(c4351g, z22, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new C4351g();
                }
                int iA = (int) AbstractC4354g2.a(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue());
                if (iA < 0) {
                    iA = Math.max(0, iA + c4351g.m());
                } else if (iA > c4351g.m()) {
                    iA = c4351g.m();
                }
                int iM2 = c4351g.m();
                C4351g c4351g6 = new C4351g();
                if (list.size() <= 1) {
                    while (iA < iM2) {
                        c4351g6.k(c4351g.i(iA));
                        c4351g.s(iA, null);
                        iA++;
                    }
                    return c4351g6;
                }
                int iMax = Math.max(0, (int) AbstractC4354g2.a(z22.b((InterfaceC4449s) list.get(1)).zze().doubleValue()));
                if (iMax > 0) {
                    for (int i11 = iA; i11 < Math.min(iM2, iA + iMax); i11++) {
                        c4351g6.k(c4351g.i(iA));
                        c4351g.q(iA);
                    }
                }
                if (list.size() > 2) {
                    for (int i12 = 2; i12 < list.size(); i12++) {
                        InterfaceC4449s interfaceC4449sB3 = z22.b((InterfaceC4449s) list.get(i12));
                        if (interfaceC4449sB3 instanceof C4394l) {
                            throw new IllegalArgumentException("Failed to parse elements to add");
                        }
                        c4351g.j((iA + i12) - 2, interfaceC4449sB3);
                    }
                }
                return c4351g6;
            case 5:
                AbstractC4354g2.g("forEach", 1, list);
                InterfaceC4449s interfaceC4449sB4 = z22.b((InterfaceC4449s) list.get(0));
                if (!(interfaceC4449sB4 instanceof C4457t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c4351g.g() == 0) {
                    return InterfaceC4449s.f35450e0;
                }
                a(c4351g, z22, (C4457t) interfaceC4449sB4);
                return InterfaceC4449s.f35450e0;
            case 6:
                AbstractC4354g2.n("lastIndexOf", 2, list);
                InterfaceC4449s interfaceC4449sB5 = InterfaceC4449s.f35450e0;
                if (!list.isEmpty()) {
                    interfaceC4449sB5 = z22.b((InterfaceC4449s) list.get(0));
                }
                double dM = c4351g.m() - 1;
                if (list.size() > 1) {
                    InterfaceC4449s interfaceC4449sB6 = z22.b((InterfaceC4449s) list.get(1));
                    dM = Double.isNaN(interfaceC4449sB6.zze().doubleValue()) ? c4351g.m() - 1 : AbstractC4354g2.a(interfaceC4449sB6.zze().doubleValue());
                    d10 = 0.0d;
                    if (dM < 0.0d) {
                        dM += c4351g.m();
                    }
                } else {
                    d10 = 0.0d;
                }
                if (dM < d10) {
                    return new C4386k(dValueOf);
                }
                for (int iMin = (int) Math.min(c4351g.m(), dM); iMin >= 0; iMin--) {
                    if (c4351g.u(iMin) && AbstractC4354g2.h(c4351g.i(iMin), interfaceC4449sB5)) {
                        return new C4386k(Double.valueOf(iMin));
                    }
                }
                return new C4386k(dValueOf);
            case 7:
                if (!list.isEmpty()) {
                    C4351g c4351g7 = new C4351g();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC4449s interfaceC4449sB7 = z22.b((InterfaceC4449s) it2.next());
                        if (interfaceC4449sB7 instanceof C4394l) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        c4351g7.k(interfaceC4449sB7);
                    }
                    int iM3 = c4351g7.m();
                    Iterator itV3 = c4351g.v();
                    while (itV3.hasNext()) {
                        Integer num2 = (Integer) itV3.next();
                        c4351g7.s(num2.intValue() + iM3, c4351g.i(num2.intValue()));
                    }
                    c4351g.x();
                    Iterator itV4 = c4351g7.v();
                    while (itV4.hasNext()) {
                        Integer num3 = (Integer) itV4.next();
                        c4351g.s(num3.intValue(), c4351g7.i(num3.intValue()));
                    }
                }
                return new C4386k(Double.valueOf(c4351g.m()));
            case '\b':
                AbstractC4354g2.g("map", 1, list);
                InterfaceC4449s interfaceC4449sB8 = z22.b((InterfaceC4449s) list.get(0));
                if (interfaceC4449sB8 instanceof C4457t) {
                    return c4351g.m() == 0 ? new C4351g() : a(c4351g, z22, (C4457t) interfaceC4449sB8);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\t':
                AbstractC4354g2.g("pop", 0, list);
                int iM4 = c4351g.m();
                if (iM4 == 0) {
                    return InterfaceC4449s.f35450e0;
                }
                int i13 = iM4 - 1;
                InterfaceC4449s interfaceC4449sI = c4351g.i(i13);
                c4351g.q(i13);
                return interfaceC4449sI;
            case '\n':
                AbstractC4354g2.n("join", 1, list);
                if (c4351g.m() == 0) {
                    return InterfaceC4449s.f35457l0;
                }
                if (list.isEmpty()) {
                    strZzf = ",";
                } else {
                    InterfaceC4449s interfaceC4449sB9 = z22.b((InterfaceC4449s) list.get(0));
                    strZzf = ((interfaceC4449sB9 instanceof C4434q) || (interfaceC4449sB9 instanceof C4505z)) ? "" : interfaceC4449sB9.zzf();
                }
                return new C4465u(c4351g.o(strZzf));
            case 11:
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        c4351g.k(z22.b((InterfaceC4449s) it3.next()));
                    }
                }
                return new C4386k(Double.valueOf(c4351g.m()));
            case '\f':
                AbstractC4354g2.g("some", 1, list);
                InterfaceC4449s interfaceC4449sB10 = z22.b((InterfaceC4449s) list.get(0));
                if (!(interfaceC4449sB10 instanceof AbstractC4410n)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c4351g.m() != 0) {
                    AbstractC4410n abstractC4410n2 = (AbstractC4410n) interfaceC4449sB10;
                    Iterator itV5 = c4351g.v();
                    while (itV5.hasNext()) {
                        int iIntValue = ((Integer) itV5.next()).intValue();
                        if (c4351g.u(iIntValue) && abstractC4410n2.a(z22, Arrays.asList(c4351g.i(iIntValue), new C4386k(Double.valueOf(iIntValue)), c4351g)).zzd().booleanValue()) {
                            return InterfaceC4449s.f35455j0;
                        }
                    }
                }
                return InterfaceC4449s.f35456k0;
            case '\r':
                AbstractC4354g2.n("sort", 1, list);
                if (c4351g.m() >= 2) {
                    List listW = c4351g.w();
                    if (list.isEmpty()) {
                        abstractC4410n = null;
                    } else {
                        InterfaceC4449s interfaceC4449sB11 = z22.b((InterfaceC4449s) list.get(0));
                        if (!(interfaceC4449sB11 instanceof AbstractC4410n)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        abstractC4410n = (AbstractC4410n) interfaceC4449sB11;
                    }
                    Collections.sort(listW, new K(abstractC4410n, z22));
                    c4351g.x();
                    Iterator it4 = listW.iterator();
                    int i14 = 0;
                    while (it4.hasNext()) {
                        c4351g.s(i14, (InterfaceC4449s) it4.next());
                        i14++;
                    }
                }
                return c4351g;
            case 14:
                AbstractC4354g2.g("every", 1, list);
                InterfaceC4449s interfaceC4449sB12 = z22.b((InterfaceC4449s) list.get(0));
                if (interfaceC4449sB12 instanceof C4457t) {
                    return (c4351g.m() == 0 || b(c4351g, z22, (C4457t) interfaceC4449sB12, Boolean.FALSE, Boolean.TRUE).m() == c4351g.m()) ? InterfaceC4449s.f35455j0 : InterfaceC4449s.f35456k0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                AbstractC4354g2.g("shift", 0, list);
                if (c4351g.m() == 0) {
                    return InterfaceC4449s.f35450e0;
                }
                InterfaceC4449s interfaceC4449sI2 = c4351g.i(0);
                c4351g.q(0);
                return interfaceC4449sI2;
            case 16:
                AbstractC4354g2.n("slice", 2, list);
                if (list.isEmpty()) {
                    return c4351g.zzc();
                }
                double dM2 = c4351g.m();
                double dA2 = AbstractC4354g2.a(z22.b((InterfaceC4449s) list.get(0)).zze().doubleValue());
                double dMax = dA2 < 0.0d ? Math.max(dA2 + dM2, 0.0d) : Math.min(dA2, dM2);
                if (list.size() == 2) {
                    double dA3 = AbstractC4354g2.a(z22.b((InterfaceC4449s) list.get(1)).zze().doubleValue());
                    dM2 = dA3 < 0.0d ? Math.max(dM2 + dA3, 0.0d) : Math.min(dM2, dA3);
                }
                C4351g c4351g8 = new C4351g();
                for (int i15 = (int) dMax; i15 < dM2; i15++) {
                    c4351g8.k(c4351g.i(i15));
                }
                return c4351g8;
            case 17:
                return c(c4351g, z22, list, false);
            case 18:
                AbstractC4354g2.g("reverse", 0, list);
                int iM5 = c4351g.m();
                if (iM5 != 0) {
                    int i16 = 0;
                    while (i16 < iM5 / 2) {
                        if (c4351g.u(i16)) {
                            InterfaceC4449s interfaceC4449sI3 = c4351g.i(i16);
                            c4351g.s(i16, null);
                            i10 = 1;
                            int i17 = (iM5 - 1) - i16;
                            if (c4351g.u(i17)) {
                                c4351g.s(i16, c4351g.i(i17));
                            }
                            c4351g.s(i17, interfaceC4449sI3);
                        } else {
                            i10 = 1;
                        }
                        i16 += i10;
                    }
                }
                return c4351g;
            case 19:
                AbstractC4354g2.n("indexOf", 2, list);
                InterfaceC4449s interfaceC4449sB13 = InterfaceC4449s.f35450e0;
                if (list.isEmpty()) {
                    z23 = z22;
                } else {
                    z23 = z22;
                    interfaceC4449sB13 = z23.b((InterfaceC4449s) list.get(0));
                }
                if (list.size() > 1) {
                    dA = AbstractC4354g2.a(z23.b((InterfaceC4449s) list.get(1)).zze().doubleValue());
                    if (dA >= c4351g.m()) {
                        return new C4386k(dValueOf);
                    }
                    d11 = dValueOf;
                    if (dA < 0.0d) {
                        dA += c4351g.m();
                    }
                } else {
                    d11 = dValueOf;
                    dA = 0.0d;
                }
                Iterator itV6 = c4351g.v();
                while (itV6.hasNext()) {
                    int iIntValue2 = ((Integer) itV6.next()).intValue();
                    double d12 = iIntValue2;
                    if (d12 >= dA && AbstractC4354g2.h(c4351g.i(iIntValue2), interfaceC4449sB13)) {
                        return new C4386k(Double.valueOf(d12));
                    }
                }
                return new C4386k(d11);
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
