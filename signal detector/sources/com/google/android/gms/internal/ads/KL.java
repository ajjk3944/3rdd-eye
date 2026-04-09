package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class KL {

    /* renamed from: a, reason: collision with root package name */
    public static final C1994v2 f9483a;

    static {
        int i = JK.f9277a;
        f9483a = new C1994v2(6);
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (VK.J(i << 3) + 4) * size;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (VK.J(i << 3) + 8) * size;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void d(Object obj, Object obj2) {
        AbstractC1096eL abstractC1096eL = (AbstractC1096eL) obj;
        RL rl = abstractC1096eL.zzt;
        RL rl2 = ((AbstractC1096eL) obj2).zzt;
        RL rl3 = RL.f10898f;
        if (!rl3.equals(rl2)) {
            if (rl3.equals(rl)) {
                int i = rl.f10899a + rl2.f10899a;
                int[] iArrCopyOf = Arrays.copyOf(rl.f10900b, i);
                System.arraycopy(rl2.f10900b, 0, iArrCopyOf, rl.f10899a, rl2.f10899a);
                Object[] objArrCopyOf = Arrays.copyOf(rl.f10901c, i);
                System.arraycopy(rl2.f10901c, 0, objArrCopyOf, rl.f10899a, rl2.f10899a);
                rl = new RL(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                rl.getClass();
                if (!rl2.equals(rl3)) {
                    if (!rl.f10903e) {
                        throw new UnsupportedOperationException();
                    }
                    int i3 = rl.f10899a + rl2.f10899a;
                    rl.e(i3);
                    System.arraycopy(rl2.f10900b, 0, rl.f10900b, rl.f10899a, rl2.f10899a);
                    System.arraycopy(rl2.f10901c, 0, rl.f10901c, rl.f10899a, rl2.f10899a);
                    rl.f10899a = i3;
                }
            }
        }
        abstractC1096eL.zzt = rl;
    }

    public static Object e(Object obj, int i, InterfaceC1474lL interfaceC1474lL, InterfaceC1260hL interfaceC1260hL, Object obj2, C1994v2 c1994v2) {
        if (interfaceC1260hL == null) {
            return obj2;
        }
        if (!A.f.y(interfaceC1474lL)) {
            Iterator it = interfaceC1474lL.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!interfaceC1260hL.a(iIntValue)) {
                    if (obj2 == null) {
                        c1994v2.getClass();
                        obj2 = C1994v2.C(obj);
                    }
                    c1994v2.getClass();
                    ((RL) obj2).d(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = interfaceC1474lL.size();
        int i3 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Integer num = (Integer) interfaceC1474lL.get(i6);
            int iIntValue2 = num.intValue();
            if (interfaceC1260hL.a(iIntValue2)) {
                if (i6 != i3) {
                    interfaceC1474lL.set(i3, num);
                }
                i3++;
            } else {
                if (obj2 == null) {
                    c1994v2.getClass();
                    obj2 = C1994v2.C(obj);
                }
                c1994v2.getClass();
                ((RL) obj2).d(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i3 != size) {
            interfaceC1474lL.subList(i3, size).clear();
        }
        return obj2;
    }

    public static void f(int i, List list, C1014cu c1014cu, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        VK vk = (VK) c1014cu.f13695b;
        int i3 = 0;
        if (!z6) {
            while (i3 < list.size()) {
                vk.S(i, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        vk.M(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            i6 += 8;
        }
        vk.b0(i6);
        while (i3 < list.size()) {
            vk.e0(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    public static void g(int i, List list, C1014cu c1014cu, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        VK vk = (VK) c1014cu.f13695b;
        int i3 = 0;
        if (!z6) {
            while (i3 < list.size()) {
                vk.P(i, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        vk.M(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            i6 += 4;
        }
        vk.b0(i6);
        while (i3 < list.size()) {
            vk.c0(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    public static void h(int i, List list, C1014cu c1014cu, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        VK vk = (VK) c1014cu.f13695b;
        int i3 = 0;
        if (!(list instanceof C1851sL)) {
            if (!z6) {
                while (i3 < list.size()) {
                    vk.Q(i, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            vk.M(i, 2);
            int iK = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iK += VK.K(((Long) list.get(i6)).longValue());
            }
            vk.b0(iK);
            while (i3 < list.size()) {
                vk.d0(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        C1851sL c1851sL = (C1851sL) list;
        if (!z6) {
            while (i3 < c1851sL.f16710c) {
                vk.Q(i, c1851sL.b(i3));
                i3++;
            }
            return;
        }
        vk.M(i, 2);
        int iK2 = 0;
        for (int i7 = 0; i7 < c1851sL.f16710c; i7++) {
            iK2 += VK.K(c1851sL.b(i7));
        }
        vk.b0(iK2);
        while (i3 < c1851sL.f16710c) {
            vk.d0(c1851sL.b(i3));
            i3++;
        }
    }

    public static void i(int i, List list, C1014cu c1014cu, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        VK vk = (VK) c1014cu.f13695b;
        int i3 = 0;
        if (!(list instanceof C1851sL)) {
            if (!z6) {
                while (i3 < list.size()) {
                    vk.Q(i, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            vk.M(i, 2);
            int iK = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iK += VK.K(((Long) list.get(i6)).longValue());
            }
            vk.b0(iK);
            while (i3 < list.size()) {
                vk.d0(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        C1851sL c1851sL = (C1851sL) list;
        if (!z6) {
            while (i3 < c1851sL.f16710c) {
                vk.Q(i, c1851sL.b(i3));
                i3++;
            }
            return;
        }
        vk.M(i, 2);
        int iK2 = 0;
        for (int i7 = 0; i7 < c1851sL.f16710c; i7++) {
            iK2 += VK.K(c1851sL.b(i7));
        }
        vk.b0(iK2);
        while (i3 < c1851sL.f16710c) {
            vk.d0(c1851sL.b(i3));
            i3++;
        }
    }

    public static void j(int i, List list, C1014cu c1014cu, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        VK vk = (VK) c1014cu.f13695b;
        int i3 = 0;
        if (!(list instanceof C1851sL)) {
            if (!z6) {
                while (i3 < list.size()) {
                    long jLongValue = ((Long) list.get(i3)).longValue();
                    vk.Q(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i3++;
                }
                return;
            }
            vk.M(i, 2);
            int iK = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                long jLongValue2 = ((Long) list.get(i6)).longValue();
                iK += VK.K((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            vk.b0(iK);
            while (i3 < list.size()) {
                long jLongValue3 = ((Long) list.get(i3)).longValue();
                vk.d0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i3++;
            }
            return;
        }
        C1851sL c1851sL = (C1851sL) list;
        if (!z6) {
            while (i3 < c1851sL.f16710c) {
                long jB = c1851sL.b(i3);
                vk.Q(i, (jB >> 63) ^ (jB + jB));
                i3++;
            }
            return;
        }
        vk.M(i, 2);
        int iK2 = 0;
        for (int i7 = 0; i7 < c1851sL.f16710c; i7++) {
            long jB2 = c1851sL.b(i7);
            iK2 += VK.K((jB2 >> 63) ^ (jB2 + jB2));
        }
        vk.b0(iK2);
        while (i3 < c1851sL.f16710c) {
            long jB3 = c1851sL.b(i3);
            vk.d0((jB3 >> 63) ^ (jB3 + jB3));
            i3++;
        }
    }

    public static void k(int i, List list, C1014cu c1014cu, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        VK vk = (VK) c1014cu.f13695b;
        int i3 = 0;
        if (!(list instanceof C1851sL)) {
            if (!z6) {
                while (i3 < list.size()) {
                    vk.S(i, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            vk.M(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i6 += 8;
            }
            vk.b0(i6);
            while (i3 < list.size()) {
                vk.e0(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        C1851sL c1851sL = (C1851sL) list;
        if (!z6) {
            while (i3 < c1851sL.f16710c) {
                vk.S(i, c1851sL.b(i3));
                i3++;
            }
            return;
        }
        vk.M(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c1851sL.f16710c; i9++) {
            c1851sL.b(i9);
            i8 += 8;
        }
        vk.b0(i8);
        while (i3 < c1851sL.f16710c) {
            vk.e0(c1851sL.b(i3));
            i3++;
        }
    }

    public static void l(int i, List list, C1014cu c1014cu, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        VK vk = (VK) c1014cu.f13695b;
        int i3 = 0;
        if (!(list instanceof C1851sL)) {
            if (!z6) {
                while (i3 < list.size()) {
                    vk.S(i, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            vk.M(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i6 += 8;
            }
            vk.b0(i6);
            while (i3 < list.size()) {
                vk.e0(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        C1851sL c1851sL = (C1851sL) list;
        if (!z6) {
            while (i3 < c1851sL.f16710c) {
                vk.S(i, c1851sL.b(i3));
                i3++;
            }
            return;
        }
        vk.M(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c1851sL.f16710c; i9++) {
            c1851sL.b(i9);
            i8 += 8;
        }
        vk.b0(i8);
        while (i3 < c1851sL.f16710c) {
            vk.e0(c1851sL.b(i3));
            i3++;
        }
    }

    public static void m(int i, List list, C1014cu c1014cu, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        VK vk = (VK) c1014cu.f13695b;
        int i3 = 0;
        if (!(list instanceof C1151fL)) {
            if (!z6) {
                while (i3 < list.size()) {
                    vk.N(i, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            vk.M(i, 2);
            int iK = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iK += VK.K(((Integer) list.get(i6)).intValue());
            }
            vk.b0(iK);
            while (i3 < list.size()) {
                vk.a0(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C1151fL c1151fL = (C1151fL) list;
        if (!z6) {
            while (i3 < c1151fL.f14064c) {
                vk.N(i, c1151fL.c(i3));
                i3++;
            }
            return;
        }
        vk.M(i, 2);
        int iK2 = 0;
        for (int i7 = 0; i7 < c1151fL.f14064c; i7++) {
            iK2 += VK.K(c1151fL.c(i7));
        }
        vk.b0(iK2);
        while (i3 < c1151fL.f14064c) {
            vk.a0(c1151fL.c(i3));
            i3++;
        }
    }

    public static void n(int i, List list, C1014cu c1014cu, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        VK vk = (VK) c1014cu.f13695b;
        int i3 = 0;
        if (!(list instanceof C1151fL)) {
            if (!z6) {
                while (i3 < list.size()) {
                    vk.O(i, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            vk.M(i, 2);
            int iJ = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iJ += VK.J(((Integer) list.get(i6)).intValue());
            }
            vk.b0(iJ);
            while (i3 < list.size()) {
                vk.b0(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C1151fL c1151fL = (C1151fL) list;
        if (!z6) {
            while (i3 < c1151fL.f14064c) {
                vk.O(i, c1151fL.c(i3));
                i3++;
            }
            return;
        }
        vk.M(i, 2);
        int iJ2 = 0;
        for (int i7 = 0; i7 < c1151fL.f14064c; i7++) {
            iJ2 += VK.J(c1151fL.c(i7));
        }
        vk.b0(iJ2);
        while (i3 < c1151fL.f14064c) {
            vk.b0(c1151fL.c(i3));
            i3++;
        }
    }

    public static void o(int i, List list, C1014cu c1014cu, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        VK vk = (VK) c1014cu.f13695b;
        int i3 = 0;
        if (!(list instanceof C1151fL)) {
            if (!z6) {
                while (i3 < list.size()) {
                    int iIntValue = ((Integer) list.get(i3)).intValue();
                    vk.O(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i3++;
                }
                return;
            }
            vk.M(i, 2);
            int iJ = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                int iIntValue2 = ((Integer) list.get(i6)).intValue();
                iJ += VK.J((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            vk.b0(iJ);
            while (i3 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i3)).intValue();
                vk.b0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i3++;
            }
            return;
        }
        C1151fL c1151fL = (C1151fL) list;
        if (!z6) {
            while (i3 < c1151fL.f14064c) {
                int iC = c1151fL.c(i3);
                vk.O(i, (iC >> 31) ^ (iC + iC));
                i3++;
            }
            return;
        }
        vk.M(i, 2);
        int iJ2 = 0;
        for (int i7 = 0; i7 < c1151fL.f14064c; i7++) {
            int iC2 = c1151fL.c(i7);
            iJ2 += VK.J((iC2 >> 31) ^ (iC2 + iC2));
        }
        vk.b0(iJ2);
        while (i3 < c1151fL.f14064c) {
            int iC3 = c1151fL.c(i3);
            vk.b0((iC3 >> 31) ^ (iC3 + iC3));
            i3++;
        }
    }

    public static void p(int i, List list, C1014cu c1014cu, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        VK vk = (VK) c1014cu.f13695b;
        int i3 = 0;
        if (!(list instanceof C1151fL)) {
            if (!z6) {
                while (i3 < list.size()) {
                    vk.P(i, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            vk.M(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            vk.b0(i6);
            while (i3 < list.size()) {
                vk.c0(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C1151fL c1151fL = (C1151fL) list;
        if (!z6) {
            while (i3 < c1151fL.f14064c) {
                vk.P(i, c1151fL.c(i3));
                i3++;
            }
            return;
        }
        vk.M(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c1151fL.f14064c; i9++) {
            c1151fL.c(i9);
            i8 += 4;
        }
        vk.b0(i8);
        while (i3 < c1151fL.f14064c) {
            vk.c0(c1151fL.c(i3));
            i3++;
        }
    }

    public static void q(int i, List list, C1014cu c1014cu, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        VK vk = (VK) c1014cu.f13695b;
        int i3 = 0;
        if (!(list instanceof C1151fL)) {
            if (!z6) {
                while (i3 < list.size()) {
                    vk.P(i, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            vk.M(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            vk.b0(i6);
            while (i3 < list.size()) {
                vk.c0(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C1151fL c1151fL = (C1151fL) list;
        if (!z6) {
            while (i3 < c1151fL.f14064c) {
                vk.P(i, c1151fL.c(i3));
                i3++;
            }
            return;
        }
        vk.M(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c1151fL.f14064c; i9++) {
            c1151fL.c(i9);
            i8 += 4;
        }
        vk.b0(i8);
        while (i3 < c1151fL.f14064c) {
            vk.c0(c1151fL.c(i3));
            i3++;
        }
    }

    public static void r(int i, List list, C1014cu c1014cu, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        VK vk = (VK) c1014cu.f13695b;
        int i3 = 0;
        if (!(list instanceof C1151fL)) {
            if (!z6) {
                while (i3 < list.size()) {
                    vk.N(i, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            vk.M(i, 2);
            int iK = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iK += VK.K(((Integer) list.get(i6)).intValue());
            }
            vk.b0(iK);
            while (i3 < list.size()) {
                vk.a0(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C1151fL c1151fL = (C1151fL) list;
        if (!z6) {
            while (i3 < c1151fL.f14064c) {
                vk.N(i, c1151fL.c(i3));
                i3++;
            }
            return;
        }
        vk.M(i, 2);
        int iK2 = 0;
        for (int i7 = 0; i7 < c1151fL.f14064c; i7++) {
            iK2 += VK.K(c1151fL.c(i7));
        }
        vk.b0(iK2);
        while (i3 < c1151fL.f14064c) {
            vk.a0(c1151fL.c(i3));
            i3++;
        }
    }

    public static void s(int i, List list, C1014cu c1014cu, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        VK vk = (VK) c1014cu.f13695b;
        int i3 = 0;
        if (!z6) {
            while (i3 < list.size()) {
                vk.T(i, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        vk.M(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            i6++;
        }
        vk.b0(i6);
        while (i3 < list.size()) {
            vk.Z(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1851sL)) {
            int iK = 0;
            while (i < size) {
                iK += VK.K(((Long) list.get(i)).longValue());
                i++;
            }
            return iK;
        }
        C1851sL c1851sL = (C1851sL) list;
        int iK2 = 0;
        while (i < size) {
            iK2 += VK.K(c1851sL.b(i));
            i++;
        }
        return iK2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1851sL)) {
            int iK = 0;
            while (i < size) {
                iK += VK.K(((Long) list.get(i)).longValue());
                i++;
            }
            return iK;
        }
        C1851sL c1851sL = (C1851sL) list;
        int iK2 = 0;
        while (i < size) {
            iK2 += VK.K(c1851sL.b(i));
            i++;
        }
        return iK2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1851sL)) {
            int iK = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iK += VK.K((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iK;
        }
        C1851sL c1851sL = (C1851sL) list;
        int iK2 = 0;
        while (i < size) {
            long jB = c1851sL.b(i);
            iK2 += VK.K((jB >> 63) ^ (jB + jB));
            i++;
        }
        return iK2;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1151fL)) {
            int iK = 0;
            while (i < size) {
                iK += VK.K(((Integer) list.get(i)).intValue());
                i++;
            }
            return iK;
        }
        C1151fL c1151fL = (C1151fL) list;
        int iK2 = 0;
        while (i < size) {
            iK2 += VK.K(c1151fL.c(i));
            i++;
        }
        return iK2;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1151fL)) {
            int iK = 0;
            while (i < size) {
                iK += VK.K(((Integer) list.get(i)).intValue());
                i++;
            }
            return iK;
        }
        C1151fL c1151fL = (C1151fL) list;
        int iK2 = 0;
        while (i < size) {
            iK2 += VK.K(c1151fL.c(i));
            i++;
        }
        return iK2;
    }

    public static int y(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1151fL)) {
            int iJ = 0;
            while (i < size) {
                iJ += VK.J(((Integer) list.get(i)).intValue());
                i++;
            }
            return iJ;
        }
        C1151fL c1151fL = (C1151fL) list;
        int iJ2 = 0;
        while (i < size) {
            iJ2 += VK.J(c1151fL.c(i));
            i++;
        }
        return iJ2;
    }

    public static int z(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1151fL)) {
            int iJ = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iJ += VK.J((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iJ;
        }
        C1151fL c1151fL = (C1151fL) list;
        int iJ2 = 0;
        while (i < size) {
            int iC = c1151fL.c(i);
            iJ2 += VK.J((iC >> 31) ^ (iC + iC));
            i++;
        }
        return iJ2;
    }
}
