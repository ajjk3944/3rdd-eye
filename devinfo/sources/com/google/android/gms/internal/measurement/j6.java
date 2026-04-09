package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class j6 {

    /* renamed from: a, reason: collision with root package name */
    public static final e5 f19789a;

    static {
        f6 f6Var = f6.f19741c;
        f19789a = new e5(6);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, Object obj2) {
        g5 g5Var = (g5) obj;
        m6 m6Var = g5Var.zzc;
        m6 m6Var2 = ((g5) obj2).zzc;
        m6 m6Var3 = m6.f19825f;
        if (!m6Var3.equals(m6Var2)) {
            if (m6Var3.equals(m6Var)) {
                int i4 = m6Var.f19826a + m6Var2.f19826a;
                int[] iArrCopyOf = Arrays.copyOf(m6Var.f19827b, i4);
                System.arraycopy(m6Var2.f19827b, 0, iArrCopyOf, m6Var.f19826a, m6Var2.f19826a);
                Object[] objArrCopyOf = Arrays.copyOf(m6Var.f19828c, i4);
                System.arraycopy(m6Var2.f19828c, 0, objArrCopyOf, m6Var.f19826a, m6Var2.f19826a);
                m6Var = new m6(i4, iArrCopyOf, objArrCopyOf, true);
            } else {
                m6Var.getClass();
                if (!m6Var2.equals(m6Var3)) {
                    if (!m6Var.f19830e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = m6Var.f19826a + m6Var2.f19826a;
                    m6Var.e(i10);
                    System.arraycopy(m6Var2.f19827b, 0, m6Var.f19827b, m6Var.f19826a, m6Var2.f19826a);
                    System.arraycopy(m6Var2.f19828c, 0, m6Var.f19828c, m6Var.f19826a, m6Var2.f19826a);
                    m6Var.f19826a = i10;
                }
            }
        }
        g5Var.zzc = m6Var;
    }

    public static void c(int i4, List list, v5 v5Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) v5Var.f19970a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                y4Var.X(i4, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        y4Var.S(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        y4Var.b0(i11);
        while (i10 < list.size()) {
            y4Var.e0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void d(int i4, List list, v5 v5Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) v5Var.f19970a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                y4Var.V(i4, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        y4Var.S(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        y4Var.b0(i11);
        while (i10 < list.size()) {
            y4Var.c0(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void e(int i4, List list, v5 v5Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) v5Var.f19970a;
        int i10 = 0;
        if (!(list instanceof u5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    y4Var.W(i4, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            y4Var.S(i4, 2);
            int iQ = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iQ += y4.Q(((Long) list.get(i11)).longValue());
            }
            y4Var.b0(iQ);
            while (i10 < list.size()) {
                y4Var.d0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z3) {
            while (i10 < u5Var.f19951c) {
                y4Var.W(i4, u5Var.c(i10));
                i10++;
            }
            return;
        }
        y4Var.S(i4, 2);
        int iQ2 = 0;
        for (int i12 = 0; i12 < u5Var.f19951c; i12++) {
            iQ2 += y4.Q(u5Var.c(i12));
        }
        y4Var.b0(iQ2);
        while (i10 < u5Var.f19951c) {
            y4Var.d0(u5Var.c(i10));
            i10++;
        }
    }

    public static void f(int i4, List list, v5 v5Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) v5Var.f19970a;
        int i10 = 0;
        if (!(list instanceof u5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    y4Var.W(i4, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            y4Var.S(i4, 2);
            int iQ = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iQ += y4.Q(((Long) list.get(i11)).longValue());
            }
            y4Var.b0(iQ);
            while (i10 < list.size()) {
                y4Var.d0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z3) {
            while (i10 < u5Var.f19951c) {
                y4Var.W(i4, u5Var.c(i10));
                i10++;
            }
            return;
        }
        y4Var.S(i4, 2);
        int iQ2 = 0;
        for (int i12 = 0; i12 < u5Var.f19951c; i12++) {
            iQ2 += y4.Q(u5Var.c(i12));
        }
        y4Var.b0(iQ2);
        while (i10 < u5Var.f19951c) {
            y4Var.d0(u5Var.c(i10));
            i10++;
        }
    }

    public static void g(int i4, List list, v5 v5Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) v5Var.f19970a;
        int i10 = 0;
        if (!(list instanceof u5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    long jLongValue = ((Long) list.get(i10)).longValue();
                    y4Var.W(i4, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i10++;
                }
                return;
            }
            y4Var.S(i4, 2);
            int iQ = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                iQ += y4.Q((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            y4Var.b0(iQ);
            while (i10 < list.size()) {
                long jLongValue3 = ((Long) list.get(i10)).longValue();
                y4Var.d0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i10++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z3) {
            while (i10 < u5Var.f19951c) {
                long jC = u5Var.c(i10);
                y4Var.W(i4, (jC >> 63) ^ (jC + jC));
                i10++;
            }
            return;
        }
        y4Var.S(i4, 2);
        int iQ2 = 0;
        for (int i12 = 0; i12 < u5Var.f19951c; i12++) {
            long jC2 = u5Var.c(i12);
            iQ2 += y4.Q((jC2 >> 63) ^ (jC2 + jC2));
        }
        y4Var.b0(iQ2);
        while (i10 < u5Var.f19951c) {
            long jC3 = u5Var.c(i10);
            y4Var.d0((jC3 >> 63) ^ (jC3 + jC3));
            i10++;
        }
    }

    public static void h(int i4, List list, v5 v5Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) v5Var.f19970a;
        int i10 = 0;
        if (!(list instanceof u5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    y4Var.X(i4, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            y4Var.S(i4, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            y4Var.b0(i11);
            while (i10 < list.size()) {
                y4Var.e0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z3) {
            while (i10 < u5Var.f19951c) {
                y4Var.X(i4, u5Var.c(i10));
                i10++;
            }
            return;
        }
        y4Var.S(i4, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < u5Var.f19951c; i14++) {
            u5Var.c(i14);
            i13 += 8;
        }
        y4Var.b0(i13);
        while (i10 < u5Var.f19951c) {
            y4Var.e0(u5Var.c(i10));
            i10++;
        }
    }

    public static void i(int i4, List list, v5 v5Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) v5Var.f19970a;
        int i10 = 0;
        if (!(list instanceof u5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    y4Var.X(i4, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            y4Var.S(i4, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Long) list.get(i12)).getClass();
                i11 += 8;
            }
            y4Var.b0(i11);
            while (i10 < list.size()) {
                y4Var.e0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        u5 u5Var = (u5) list;
        if (!z3) {
            while (i10 < u5Var.f19951c) {
                y4Var.X(i4, u5Var.c(i10));
                i10++;
            }
            return;
        }
        y4Var.S(i4, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < u5Var.f19951c; i14++) {
            u5Var.c(i14);
            i13 += 8;
        }
        y4Var.b0(i13);
        while (i10 < u5Var.f19951c) {
            y4Var.e0(u5Var.c(i10));
            i10++;
        }
    }

    public static void j(int i4, List list, v5 v5Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) v5Var.f19970a;
        int i10 = 0;
        if (!(list instanceof h5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    y4Var.T(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            y4Var.S(i4, 2);
            int iQ = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iQ += y4.Q(((Integer) list.get(i11)).intValue());
            }
            y4Var.b0(iQ);
            while (i10 < list.size()) {
                y4Var.a0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z3) {
            while (i10 < h5Var.f19768c) {
                y4Var.T(i4, h5Var.d(i10));
                i10++;
            }
            return;
        }
        y4Var.S(i4, 2);
        int iQ2 = 0;
        for (int i12 = 0; i12 < h5Var.f19768c; i12++) {
            iQ2 += y4.Q(h5Var.d(i12));
        }
        y4Var.b0(iQ2);
        while (i10 < h5Var.f19768c) {
            y4Var.a0(h5Var.d(i10));
            i10++;
        }
    }

    public static void k(int i4, List list, v5 v5Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) v5Var.f19970a;
        int i10 = 0;
        if (!(list instanceof h5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    y4Var.U(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            y4Var.S(i4, 2);
            int iH0 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iH0 += y4.h0(((Integer) list.get(i11)).intValue());
            }
            y4Var.b0(iH0);
            while (i10 < list.size()) {
                y4Var.b0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z3) {
            while (i10 < h5Var.f19768c) {
                y4Var.U(i4, h5Var.d(i10));
                i10++;
            }
            return;
        }
        y4Var.S(i4, 2);
        int iH02 = 0;
        for (int i12 = 0; i12 < h5Var.f19768c; i12++) {
            iH02 += y4.h0(h5Var.d(i12));
        }
        y4Var.b0(iH02);
        while (i10 < h5Var.f19768c) {
            y4Var.b0(h5Var.d(i10));
            i10++;
        }
    }

    public static void l(int i4, List list, v5 v5Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) v5Var.f19970a;
        int i10 = 0;
        if (!(list instanceof h5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    y4Var.U(i4, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            y4Var.S(i4, 2);
            int iH0 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iH0 += y4.h0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            y4Var.b0(iH0);
            while (i10 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                y4Var.b0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z3) {
            while (i10 < h5Var.f19768c) {
                int iD = h5Var.d(i10);
                y4Var.U(i4, (iD >> 31) ^ (iD + iD));
                i10++;
            }
            return;
        }
        y4Var.S(i4, 2);
        int iH02 = 0;
        for (int i12 = 0; i12 < h5Var.f19768c; i12++) {
            int iD2 = h5Var.d(i12);
            iH02 += y4.h0((iD2 >> 31) ^ (iD2 + iD2));
        }
        y4Var.b0(iH02);
        while (i10 < h5Var.f19768c) {
            int iD3 = h5Var.d(i10);
            y4Var.b0((iD3 >> 31) ^ (iD3 + iD3));
            i10++;
        }
    }

    public static void m(int i4, List list, v5 v5Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) v5Var.f19970a;
        int i10 = 0;
        if (!(list instanceof h5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    y4Var.V(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            y4Var.S(i4, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            y4Var.b0(i11);
            while (i10 < list.size()) {
                y4Var.c0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z3) {
            while (i10 < h5Var.f19768c) {
                y4Var.V(i4, h5Var.d(i10));
                i10++;
            }
            return;
        }
        y4Var.S(i4, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h5Var.f19768c; i14++) {
            h5Var.d(i14);
            i13 += 4;
        }
        y4Var.b0(i13);
        while (i10 < h5Var.f19768c) {
            y4Var.c0(h5Var.d(i10));
            i10++;
        }
    }

    public static void n(int i4, List list, v5 v5Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) v5Var.f19970a;
        int i10 = 0;
        if (!(list instanceof h5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    y4Var.V(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            y4Var.S(i4, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            y4Var.b0(i11);
            while (i10 < list.size()) {
                y4Var.c0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z3) {
            while (i10 < h5Var.f19768c) {
                y4Var.V(i4, h5Var.d(i10));
                i10++;
            }
            return;
        }
        y4Var.S(i4, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < h5Var.f19768c; i14++) {
            h5Var.d(i14);
            i13 += 4;
        }
        y4Var.b0(i13);
        while (i10 < h5Var.f19768c) {
            y4Var.c0(h5Var.d(i10));
            i10++;
        }
    }

    public static void o(int i4, List list, v5 v5Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) v5Var.f19970a;
        int i10 = 0;
        if (!(list instanceof h5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    y4Var.T(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            y4Var.S(i4, 2);
            int iQ = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iQ += y4.Q(((Integer) list.get(i11)).intValue());
            }
            y4Var.b0(iQ);
            while (i10 < list.size()) {
                y4Var.a0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        if (!z3) {
            while (i10 < h5Var.f19768c) {
                y4Var.T(i4, h5Var.d(i10));
                i10++;
            }
            return;
        }
        y4Var.S(i4, 2);
        int iQ2 = 0;
        for (int i12 = 0; i12 < h5Var.f19768c; i12++) {
            iQ2 += y4.Q(h5Var.d(i12));
        }
        y4Var.b0(iQ2);
        while (i10 < h5Var.f19768c) {
            y4Var.a0(h5Var.d(i10));
            i10++;
        }
    }

    public static void p(int i4, List list, v5 v5Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y4 y4Var = (y4) v5Var.f19970a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i10)).booleanValue();
                y4Var.b0(i4 << 3);
                y4Var.Z(zBooleanValue ? (byte) 1 : (byte) 0);
                i10++;
            }
            return;
        }
        y4Var.S(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            i11++;
        }
        y4Var.b0(i11);
        while (i10 < list.size()) {
            y4Var.Z(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int iQ = 0;
            while (i4 < size) {
                iQ += y4.Q(((Long) list.get(i4)).longValue());
                i4++;
            }
            return iQ;
        }
        u5 u5Var = (u5) list;
        int iQ2 = 0;
        while (i4 < size) {
            iQ2 += y4.Q(u5Var.c(i4));
            i4++;
        }
        return iQ2;
    }

    public static int r(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int iQ = 0;
            while (i4 < size) {
                iQ += y4.Q(((Long) list.get(i4)).longValue());
                i4++;
            }
            return iQ;
        }
        u5 u5Var = (u5) list;
        int iQ2 = 0;
        while (i4 < size) {
            iQ2 += y4.Q(u5Var.c(i4));
            i4++;
        }
        return iQ2;
    }

    public static int s(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u5)) {
            int iQ = 0;
            while (i4 < size) {
                long jLongValue = ((Long) list.get(i4)).longValue();
                iQ += y4.Q((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i4++;
            }
            return iQ;
        }
        u5 u5Var = (u5) list;
        int iQ2 = 0;
        while (i4 < size) {
            long jC = u5Var.c(i4);
            iQ2 += y4.Q((jC >> 63) ^ (jC + jC));
            i4++;
        }
        return iQ2;
    }

    public static int t(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int iQ = 0;
            while (i4 < size) {
                iQ += y4.Q(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return iQ;
        }
        h5 h5Var = (h5) list;
        int iQ2 = 0;
        while (i4 < size) {
            iQ2 += y4.Q(h5Var.d(i4));
            i4++;
        }
        return iQ2;
    }

    public static int u(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int iQ = 0;
            while (i4 < size) {
                iQ += y4.Q(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return iQ;
        }
        h5 h5Var = (h5) list;
        int iQ2 = 0;
        while (i4 < size) {
            iQ2 += y4.Q(h5Var.d(i4));
            i4++;
        }
        return iQ2;
    }

    public static int v(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int iH0 = 0;
            while (i4 < size) {
                iH0 += y4.h0(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return iH0;
        }
        h5 h5Var = (h5) list;
        int iH02 = 0;
        while (i4 < size) {
            iH02 += y4.h0(h5Var.d(i4));
            i4++;
        }
        return iH02;
    }

    public static int w(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h5)) {
            int iH0 = 0;
            while (i4 < size) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                iH0 += y4.h0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i4++;
            }
            return iH0;
        }
        h5 h5Var = (h5) list;
        int iH02 = 0;
        while (i4 < size) {
            int iD = h5Var.d(i4);
            iH02 += y4.h0((iD >> 31) ^ (iD + iD));
            i4++;
        }
        return iH02;
    }

    public static int x(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.h0(i4 << 3) + 4) * size;
    }

    public static int y(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.h0(i4 << 3) + 8) * size;
    }
}
