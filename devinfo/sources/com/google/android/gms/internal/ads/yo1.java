package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class yo1 {

    /* renamed from: a, reason: collision with root package name */
    public static final w5 f18815a;

    static {
        int i4 = um1.f17262a;
        f18815a = new w5(6);
    }

    public static int a(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hn1.J(i4 << 3) + 4) * size;
    }

    public static int b(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (hn1.J(i4 << 3) + 8) * size;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void d(Object obj, Object obj2) {
        qn1 qn1Var = (qn1) obj;
        dp1 dp1Var = qn1Var.zzt;
        dp1 dp1Var2 = ((qn1) obj2).zzt;
        dp1 dp1Var3 = dp1.f10535f;
        if (!dp1Var3.equals(dp1Var2)) {
            if (dp1Var3.equals(dp1Var)) {
                int i4 = dp1Var.f10536a + dp1Var2.f10536a;
                int[] iArrCopyOf = Arrays.copyOf(dp1Var.f10537b, i4);
                System.arraycopy(dp1Var2.f10537b, 0, iArrCopyOf, dp1Var.f10536a, dp1Var2.f10536a);
                Object[] objArrCopyOf = Arrays.copyOf(dp1Var.f10538c, i4);
                System.arraycopy(dp1Var2.f10538c, 0, objArrCopyOf, dp1Var.f10536a, dp1Var2.f10536a);
                dp1Var = new dp1(i4, iArrCopyOf, objArrCopyOf, true);
            } else {
                dp1Var.getClass();
                if (!dp1Var2.equals(dp1Var3)) {
                    if (!dp1Var.f10540e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = dp1Var.f10536a + dp1Var2.f10536a;
                    dp1Var.e(i10);
                    System.arraycopy(dp1Var2.f10537b, 0, dp1Var.f10537b, dp1Var.f10536a, dp1Var2.f10536a);
                    System.arraycopy(dp1Var2.f10538c, 0, dp1Var.f10538c, dp1Var.f10536a, dp1Var2.f10536a);
                    dp1Var.f10536a = i10;
                }
            }
        }
        qn1Var.zzt = dp1Var;
    }

    public static Object e(Object obj, int i4, xn1 xn1Var, tn1 tn1Var, Object obj2, w5 w5Var) {
        if (tn1Var == null) {
            return obj2;
        }
        if (!a0.g.C(xn1Var)) {
            Iterator it = xn1Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!tn1Var.a(iIntValue)) {
                    if (obj2 == null) {
                        w5Var.getClass();
                        obj2 = w5.B(obj);
                    }
                    w5Var.getClass();
                    ((dp1) obj2).d(i4 << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = xn1Var.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) xn1Var.get(i11);
            int iIntValue2 = num.intValue();
            if (tn1Var.a(iIntValue2)) {
                if (i11 != i10) {
                    xn1Var.set(i10, num);
                }
                i10++;
            } else {
                if (obj2 == null) {
                    w5Var.getClass();
                    obj2 = w5.B(obj);
                }
                w5Var.getClass();
                ((dp1) obj2).d(i4 << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i10 != size) {
            xn1Var.subList(i10, size).clear();
        }
        return obj2;
    }

    public static void f(int i4, List list, rg0 rg0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                hn1Var.S(i4, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        hn1Var.M(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        hn1Var.b0(i11);
        while (i10 < list.size()) {
            hn1Var.e0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void g(int i4, List list, rg0 rg0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                hn1Var.P(i4, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        hn1Var.M(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        hn1Var.b0(i11);
        while (i10 < list.size()) {
            hn1Var.c0(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void h(int i4, List list, rg0 rg0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        int i10 = 0;
        if (!(list instanceof fo1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    hn1Var.Q(i4, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            hn1Var.M(i4, 2);
            int iK = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iK += hn1.K(((Long) list.get(i11)).longValue());
            }
            hn1Var.b0(iK);
            while (i10 < list.size()) {
                hn1Var.d0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        fo1 fo1Var = (fo1) list;
        if (!z3) {
            while (i10 < fo1Var.f11249c) {
                hn1Var.Q(i4, fo1Var.c(i10));
                i10++;
            }
            return;
        }
        hn1Var.M(i4, 2);
        int iK2 = 0;
        for (int i12 = 0; i12 < fo1Var.f11249c; i12++) {
            iK2 += hn1.K(fo1Var.c(i12));
        }
        hn1Var.b0(iK2);
        while (i10 < fo1Var.f11249c) {
            hn1Var.d0(fo1Var.c(i10));
            i10++;
        }
    }

    public static void i(int i4, List list, rg0 rg0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        int i10 = 0;
        if (!(list instanceof fo1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    hn1Var.Q(i4, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            hn1Var.M(i4, 2);
            int iK = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iK += hn1.K(((Long) list.get(i11)).longValue());
            }
            hn1Var.b0(iK);
            while (i10 < list.size()) {
                hn1Var.d0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        fo1 fo1Var = (fo1) list;
        if (!z3) {
            while (i10 < fo1Var.f11249c) {
                hn1Var.Q(i4, fo1Var.c(i10));
                i10++;
            }
            return;
        }
        hn1Var.M(i4, 2);
        int iK2 = 0;
        for (int i12 = 0; i12 < fo1Var.f11249c; i12++) {
            iK2 += hn1.K(fo1Var.c(i12));
        }
        hn1Var.b0(iK2);
        while (i10 < fo1Var.f11249c) {
            hn1Var.d0(fo1Var.c(i10));
            i10++;
        }
    }

    public static void j(int i4, List list, rg0 rg0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        int i10 = 0;
        if (!(list instanceof fo1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    hn1Var.Q(i4, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10++;
                }
                return;
            }
            hn1Var.M(i4, 2);
            int iK = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                iK += hn1.K((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            hn1Var.b0(iK);
            while (i10 < list.size()) {
                long jLongValue3 = ((Long) list.get(i10)).longValue();
                hn1Var.d0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i10++;
            }
            return;
        }
        fo1 fo1Var = (fo1) list;
        if (!z3) {
            while (i10 < fo1Var.f11249c) {
                long jC = fo1Var.c(i10);
                hn1Var.Q(i4, (jC >> 63) ^ (jC + jC));
                i10++;
            }
            return;
        }
        hn1Var.M(i4, 2);
        int iK2 = 0;
        for (int i12 = 0; i12 < fo1Var.f11249c; i12++) {
            long jC2 = fo1Var.c(i12);
            iK2 += hn1.K((jC2 >> 63) ^ (jC2 + jC2));
        }
        hn1Var.b0(iK2);
        while (i10 < fo1Var.f11249c) {
            long jC3 = fo1Var.c(i10);
            hn1Var.d0((jC3 >> 63) ^ (jC3 + jC3));
            i10++;
        }
    }

    public static void k(int i4, List list, rg0 rg0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        int i10 = 0;
        if (!(list instanceof fo1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    hn1Var.S(i4, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            hn1Var.M(i4, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            hn1Var.b0(i11);
            while (i10 < list.size()) {
                hn1Var.e0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        fo1 fo1Var = (fo1) list;
        if (!z3) {
            while (i10 < fo1Var.f11249c) {
                hn1Var.S(i4, fo1Var.c(i10));
                i10++;
            }
            return;
        }
        hn1Var.M(i4, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < fo1Var.f11249c; i14++) {
            fo1Var.c(i14);
            i13 += 8;
        }
        hn1Var.b0(i13);
        while (i10 < fo1Var.f11249c) {
            hn1Var.e0(fo1Var.c(i10));
            i10++;
        }
    }

    public static void l(int i4, List list, rg0 rg0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        int i10 = 0;
        if (!(list instanceof fo1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    hn1Var.S(i4, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            hn1Var.M(i4, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            hn1Var.b0(i11);
            while (i10 < list.size()) {
                hn1Var.e0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        fo1 fo1Var = (fo1) list;
        if (!z3) {
            while (i10 < fo1Var.f11249c) {
                hn1Var.S(i4, fo1Var.c(i10));
                i10++;
            }
            return;
        }
        hn1Var.M(i4, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < fo1Var.f11249c; i14++) {
            fo1Var.c(i14);
            i13 += 8;
        }
        hn1Var.b0(i13);
        while (i10 < fo1Var.f11249c) {
            hn1Var.e0(fo1Var.c(i10));
            i10++;
        }
    }

    public static void m(int i4, List list, rg0 rg0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        int i10 = 0;
        if (!(list instanceof rn1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    hn1Var.N(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            hn1Var.M(i4, 2);
            int iK = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iK += hn1.K(((Integer) list.get(i11)).intValue());
            }
            hn1Var.b0(iK);
            while (i10 < list.size()) {
                hn1Var.a0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        rn1 rn1Var = (rn1) list;
        if (!z3) {
            while (i10 < rn1Var.f15716c) {
                hn1Var.N(i4, rn1Var.d(i10));
                i10++;
            }
            return;
        }
        hn1Var.M(i4, 2);
        int iK2 = 0;
        for (int i12 = 0; i12 < rn1Var.f15716c; i12++) {
            iK2 += hn1.K(rn1Var.d(i12));
        }
        hn1Var.b0(iK2);
        while (i10 < rn1Var.f15716c) {
            hn1Var.a0(rn1Var.d(i10));
            i10++;
        }
    }

    public static void n(int i4, List list, rg0 rg0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        int i10 = 0;
        if (!(list instanceof rn1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    hn1Var.O(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            hn1Var.M(i4, 2);
            int iJ = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iJ += hn1.J(((Integer) list.get(i11)).intValue());
            }
            hn1Var.b0(iJ);
            while (i10 < list.size()) {
                hn1Var.b0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        rn1 rn1Var = (rn1) list;
        if (!z3) {
            while (i10 < rn1Var.f15716c) {
                hn1Var.O(i4, rn1Var.d(i10));
                i10++;
            }
            return;
        }
        hn1Var.M(i4, 2);
        int iJ2 = 0;
        for (int i12 = 0; i12 < rn1Var.f15716c; i12++) {
            iJ2 += hn1.J(rn1Var.d(i12));
        }
        hn1Var.b0(iJ2);
        while (i10 < rn1Var.f15716c) {
            hn1Var.b0(rn1Var.d(i10));
            i10++;
        }
    }

    public static void o(int i4, List list, rg0 rg0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        int i10 = 0;
        if (!(list instanceof rn1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    hn1Var.O(i4, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            hn1Var.M(i4, 2);
            int iJ = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iJ += hn1.J((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            hn1Var.b0(iJ);
            while (i10 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                hn1Var.b0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        rn1 rn1Var = (rn1) list;
        if (!z3) {
            while (i10 < rn1Var.f15716c) {
                int iD = rn1Var.d(i10);
                hn1Var.O(i4, (iD >> 31) ^ (iD + iD));
                i10++;
            }
            return;
        }
        hn1Var.M(i4, 2);
        int iJ2 = 0;
        for (int i12 = 0; i12 < rn1Var.f15716c; i12++) {
            int iD2 = rn1Var.d(i12);
            iJ2 += hn1.J((iD2 >> 31) ^ (iD2 + iD2));
        }
        hn1Var.b0(iJ2);
        while (i10 < rn1Var.f15716c) {
            int iD3 = rn1Var.d(i10);
            hn1Var.b0((iD3 >> 31) ^ (iD3 + iD3));
            i10++;
        }
    }

    public static void p(int i4, List list, rg0 rg0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        int i10 = 0;
        if (!(list instanceof rn1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    hn1Var.P(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            hn1Var.M(i4, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            hn1Var.b0(i11);
            while (i10 < list.size()) {
                hn1Var.c0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        rn1 rn1Var = (rn1) list;
        if (!z3) {
            while (i10 < rn1Var.f15716c) {
                hn1Var.P(i4, rn1Var.d(i10));
                i10++;
            }
            return;
        }
        hn1Var.M(i4, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < rn1Var.f15716c; i14++) {
            rn1Var.d(i14);
            i13 += 4;
        }
        hn1Var.b0(i13);
        while (i10 < rn1Var.f15716c) {
            hn1Var.c0(rn1Var.d(i10));
            i10++;
        }
    }

    public static void q(int i4, List list, rg0 rg0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        int i10 = 0;
        if (!(list instanceof rn1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    hn1Var.P(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            hn1Var.M(i4, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            hn1Var.b0(i11);
            while (i10 < list.size()) {
                hn1Var.c0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        rn1 rn1Var = (rn1) list;
        if (!z3) {
            while (i10 < rn1Var.f15716c) {
                hn1Var.P(i4, rn1Var.d(i10));
                i10++;
            }
            return;
        }
        hn1Var.M(i4, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < rn1Var.f15716c; i14++) {
            rn1Var.d(i14);
            i13 += 4;
        }
        hn1Var.b0(i13);
        while (i10 < rn1Var.f15716c) {
            hn1Var.c0(rn1Var.d(i10));
            i10++;
        }
    }

    public static void r(int i4, List list, rg0 rg0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        int i10 = 0;
        if (!(list instanceof rn1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    hn1Var.N(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            hn1Var.M(i4, 2);
            int iK = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iK += hn1.K(((Integer) list.get(i11)).intValue());
            }
            hn1Var.b0(iK);
            while (i10 < list.size()) {
                hn1Var.a0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        rn1 rn1Var = (rn1) list;
        if (!z3) {
            while (i10 < rn1Var.f15716c) {
                hn1Var.N(i4, rn1Var.d(i10));
                i10++;
            }
            return;
        }
        hn1Var.M(i4, 2);
        int iK2 = 0;
        for (int i12 = 0; i12 < rn1Var.f15716c; i12++) {
            iK2 += hn1.K(rn1Var.d(i12));
        }
        hn1Var.b0(iK2);
        while (i10 < rn1Var.f15716c) {
            hn1Var.a0(rn1Var.d(i10));
            i10++;
        }
    }

    public static void s(int i4, List list, rg0 rg0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        hn1 hn1Var = (hn1) rg0Var.f15651b;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                hn1Var.T(i4, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        hn1Var.M(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            i11++;
        }
        hn1Var.b0(i11);
        while (i10 < list.size()) {
            hn1Var.Z(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static int t(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fo1)) {
            int iK = 0;
            while (i4 < size) {
                iK += hn1.K(((Long) list.get(i4)).longValue());
                i4++;
            }
            return iK;
        }
        fo1 fo1Var = (fo1) list;
        int iK2 = 0;
        while (i4 < size) {
            iK2 += hn1.K(fo1Var.c(i4));
            i4++;
        }
        return iK2;
    }

    public static int u(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fo1)) {
            int iK = 0;
            while (i4 < size) {
                iK += hn1.K(((Long) list.get(i4)).longValue());
                i4++;
            }
            return iK;
        }
        fo1 fo1Var = (fo1) list;
        int iK2 = 0;
        while (i4 < size) {
            iK2 += hn1.K(fo1Var.c(i4));
            i4++;
        }
        return iK2;
    }

    public static int v(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof fo1)) {
            int iK = 0;
            while (i4 < size) {
                long jLongValue = ((Long) list.get(i4)).longValue();
                iK += hn1.K((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i4++;
            }
            return iK;
        }
        fo1 fo1Var = (fo1) list;
        int iK2 = 0;
        while (i4 < size) {
            long jC = fo1Var.c(i4);
            iK2 += hn1.K((jC >> 63) ^ (jC + jC));
            i4++;
        }
        return iK2;
    }

    public static int w(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof rn1)) {
            int iK = 0;
            while (i4 < size) {
                iK += hn1.K(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return iK;
        }
        rn1 rn1Var = (rn1) list;
        int iK2 = 0;
        while (i4 < size) {
            iK2 += hn1.K(rn1Var.d(i4));
            i4++;
        }
        return iK2;
    }

    public static int x(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof rn1)) {
            int iK = 0;
            while (i4 < size) {
                iK += hn1.K(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return iK;
        }
        rn1 rn1Var = (rn1) list;
        int iK2 = 0;
        while (i4 < size) {
            iK2 += hn1.K(rn1Var.d(i4));
            i4++;
        }
        return iK2;
    }

    public static int y(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof rn1)) {
            int iJ = 0;
            while (i4 < size) {
                iJ += hn1.J(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return iJ;
        }
        rn1 rn1Var = (rn1) list;
        int iJ2 = 0;
        while (i4 < size) {
            iJ2 += hn1.J(rn1Var.d(i4));
            i4++;
        }
        return iJ2;
    }

    public static int z(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof rn1)) {
            int iJ = 0;
            while (i4 < size) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                iJ += hn1.J((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i4++;
            }
            return iJ;
        }
        rn1 rn1Var = (rn1) list;
        int iJ2 = 0;
        while (i4 < size) {
            int iD = rn1Var.d(i4);
            iJ2 += hn1.J((iD >> 31) ^ (iD + iD));
            i4++;
        }
        return iJ2;
    }
}
