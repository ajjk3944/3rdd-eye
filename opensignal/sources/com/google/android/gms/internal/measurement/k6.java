package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k6 {

    /* renamed from: a, reason: collision with root package name */
    public static final f5 f5095a;

    static {
        g6 g6Var = g6.f5043c;
        f5095a = new f5(6);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, Object obj2) {
        h5 h5Var = (h5) obj;
        n6 n6Var = h5Var.zzc;
        n6 n6Var2 = ((h5) obj2).zzc;
        n6 n6Var3 = n6.f5136f;
        if (!n6Var3.equals(n6Var2)) {
            if (n6Var3.equals(n6Var)) {
                int i10 = n6Var.f5137a + n6Var2.f5137a;
                int[] iArrCopyOf = Arrays.copyOf(n6Var.f5138b, i10);
                System.arraycopy(n6Var2.f5138b, 0, iArrCopyOf, n6Var.f5137a, n6Var2.f5137a);
                Object[] objArrCopyOf = Arrays.copyOf(n6Var.f5139c, i10);
                System.arraycopy(n6Var2.f5139c, 0, objArrCopyOf, n6Var.f5137a, n6Var2.f5137a);
                n6Var = new n6(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                n6Var.getClass();
                if (!n6Var2.equals(n6Var3)) {
                    if (!n6Var.f5141e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = n6Var.f5137a + n6Var2.f5137a;
                    n6Var.e(i11);
                    System.arraycopy(n6Var2.f5138b, 0, n6Var.f5138b, n6Var.f5137a, n6Var2.f5137a);
                    System.arraycopy(n6Var2.f5139c, 0, n6Var.f5139c, n6Var.f5137a, n6Var2.f5137a);
                    n6Var.f5137a = i11;
                }
            }
        }
        h5Var.zzc = n6Var;
    }

    public static void c(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z4 z4Var = (z4) w5Var.f5247a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                z4Var.r0(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        z4Var.m0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        z4Var.v0(i12);
        while (i11 < list.size()) {
            z4Var.y0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void d(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z4 z4Var = (z4) w5Var.f5247a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                z4Var.p0(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        z4Var.m0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        z4Var.v0(i12);
        while (i11 < list.size()) {
            z4Var.w0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void e(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z4 z4Var = (z4) w5Var.f5247a;
        int i11 = 0;
        if (!(list instanceof v5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    z4Var.q0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            z4Var.m0(i10, 2);
            int iK0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iK0 += z4.k0(((Long) list.get(i12)).longValue());
            }
            z4Var.v0(iK0);
            while (i11 < list.size()) {
                z4Var.x0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        v5 v5Var = (v5) list;
        if (!z10) {
            while (i11 < v5Var.f5236g) {
                z4Var.q0(i10, v5Var.b(i11));
                i11++;
            }
            return;
        }
        z4Var.m0(i10, 2);
        int iK02 = 0;
        for (int i13 = 0; i13 < v5Var.f5236g; i13++) {
            iK02 += z4.k0(v5Var.b(i13));
        }
        z4Var.v0(iK02);
        while (i11 < v5Var.f5236g) {
            z4Var.x0(v5Var.b(i11));
            i11++;
        }
    }

    public static void f(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z4 z4Var = (z4) w5Var.f5247a;
        int i11 = 0;
        if (!(list instanceof v5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    z4Var.q0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            z4Var.m0(i10, 2);
            int iK0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iK0 += z4.k0(((Long) list.get(i12)).longValue());
            }
            z4Var.v0(iK0);
            while (i11 < list.size()) {
                z4Var.x0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        v5 v5Var = (v5) list;
        if (!z10) {
            while (i11 < v5Var.f5236g) {
                z4Var.q0(i10, v5Var.b(i11));
                i11++;
            }
            return;
        }
        z4Var.m0(i10, 2);
        int iK02 = 0;
        for (int i13 = 0; i13 < v5Var.f5236g; i13++) {
            iK02 += z4.k0(v5Var.b(i13));
        }
        z4Var.v0(iK02);
        while (i11 < v5Var.f5236g) {
            z4Var.x0(v5Var.b(i11));
            i11++;
        }
    }

    public static void g(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z4 z4Var = (z4) w5Var.f5247a;
        int i11 = 0;
        if (!(list instanceof v5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    z4Var.q0(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            z4Var.m0(i10, 2);
            int iK0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iK0 += z4.k0((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            z4Var.v0(iK0);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                z4Var.x0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        v5 v5Var = (v5) list;
        if (!z10) {
            while (i11 < v5Var.f5236g) {
                long jB = v5Var.b(i11);
                z4Var.q0(i10, (jB >> 63) ^ (jB + jB));
                i11++;
            }
            return;
        }
        z4Var.m0(i10, 2);
        int iK02 = 0;
        for (int i13 = 0; i13 < v5Var.f5236g; i13++) {
            long jB2 = v5Var.b(i13);
            iK02 += z4.k0((jB2 >> 63) ^ (jB2 + jB2));
        }
        z4Var.v0(iK02);
        while (i11 < v5Var.f5236g) {
            long jB3 = v5Var.b(i11);
            z4Var.x0((jB3 >> 63) ^ (jB3 + jB3));
            i11++;
        }
    }

    public static void h(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z4 z4Var = (z4) w5Var.f5247a;
        int i11 = 0;
        if (!(list instanceof v5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    z4Var.r0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            z4Var.m0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            z4Var.v0(i12);
            while (i11 < list.size()) {
                z4Var.y0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        v5 v5Var = (v5) list;
        if (!z10) {
            while (i11 < v5Var.f5236g) {
                z4Var.r0(i10, v5Var.b(i11));
                i11++;
            }
            return;
        }
        z4Var.m0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < v5Var.f5236g; i15++) {
            v5Var.b(i15);
            i14 += 8;
        }
        z4Var.v0(i14);
        while (i11 < v5Var.f5236g) {
            z4Var.y0(v5Var.b(i11));
            i11++;
        }
    }

    public static void i(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z4 z4Var = (z4) w5Var.f5247a;
        int i11 = 0;
        if (!(list instanceof v5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    z4Var.r0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            z4Var.m0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            z4Var.v0(i12);
            while (i11 < list.size()) {
                z4Var.y0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        v5 v5Var = (v5) list;
        if (!z10) {
            while (i11 < v5Var.f5236g) {
                z4Var.r0(i10, v5Var.b(i11));
                i11++;
            }
            return;
        }
        z4Var.m0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < v5Var.f5236g; i15++) {
            v5Var.b(i15);
            i14 += 8;
        }
        z4Var.v0(i14);
        while (i11 < v5Var.f5236g) {
            z4Var.y0(v5Var.b(i11));
            i11++;
        }
    }

    public static void j(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z4 z4Var = (z4) w5Var.f5247a;
        int i11 = 0;
        if (!(list instanceof i5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    z4Var.n0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            z4Var.m0(i10, 2);
            int iK0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iK0 += z4.k0(((Integer) list.get(i12)).intValue());
            }
            z4Var.v0(iK0);
            while (i11 < list.size()) {
                z4Var.u0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        i5 i5Var = (i5) list;
        if (!z10) {
            while (i11 < i5Var.f5078g) {
                z4Var.n0(i10, i5Var.c(i11));
                i11++;
            }
            return;
        }
        z4Var.m0(i10, 2);
        int iK02 = 0;
        for (int i13 = 0; i13 < i5Var.f5078g; i13++) {
            iK02 += z4.k0(i5Var.c(i13));
        }
        z4Var.v0(iK02);
        while (i11 < i5Var.f5078g) {
            z4Var.u0(i5Var.c(i11));
            i11++;
        }
    }

    public static void k(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z4 z4Var = (z4) w5Var.f5247a;
        int i11 = 0;
        if (!(list instanceof i5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    z4Var.o0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            z4Var.m0(i10, 2);
            int iB0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iB0 += z4.B0(((Integer) list.get(i12)).intValue());
            }
            z4Var.v0(iB0);
            while (i11 < list.size()) {
                z4Var.v0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        i5 i5Var = (i5) list;
        if (!z10) {
            while (i11 < i5Var.f5078g) {
                z4Var.o0(i10, i5Var.c(i11));
                i11++;
            }
            return;
        }
        z4Var.m0(i10, 2);
        int iB02 = 0;
        for (int i13 = 0; i13 < i5Var.f5078g; i13++) {
            iB02 += z4.B0(i5Var.c(i13));
        }
        z4Var.v0(iB02);
        while (i11 < i5Var.f5078g) {
            z4Var.v0(i5Var.c(i11));
            i11++;
        }
    }

    public static void l(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z4 z4Var = (z4) w5Var.f5247a;
        int i11 = 0;
        if (!(list instanceof i5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    z4Var.o0(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            z4Var.m0(i10, 2);
            int iB0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iB0 += z4.B0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            z4Var.v0(iB0);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                z4Var.v0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        i5 i5Var = (i5) list;
        if (!z10) {
            while (i11 < i5Var.f5078g) {
                int iC = i5Var.c(i11);
                z4Var.o0(i10, (iC >> 31) ^ (iC + iC));
                i11++;
            }
            return;
        }
        z4Var.m0(i10, 2);
        int iB02 = 0;
        for (int i13 = 0; i13 < i5Var.f5078g; i13++) {
            int iC2 = i5Var.c(i13);
            iB02 += z4.B0((iC2 >> 31) ^ (iC2 + iC2));
        }
        z4Var.v0(iB02);
        while (i11 < i5Var.f5078g) {
            int iC3 = i5Var.c(i11);
            z4Var.v0((iC3 >> 31) ^ (iC3 + iC3));
            i11++;
        }
    }

    public static void m(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z4 z4Var = (z4) w5Var.f5247a;
        int i11 = 0;
        if (!(list instanceof i5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    z4Var.p0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            z4Var.m0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            z4Var.v0(i12);
            while (i11 < list.size()) {
                z4Var.w0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        i5 i5Var = (i5) list;
        if (!z10) {
            while (i11 < i5Var.f5078g) {
                z4Var.p0(i10, i5Var.c(i11));
                i11++;
            }
            return;
        }
        z4Var.m0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < i5Var.f5078g; i15++) {
            i5Var.c(i15);
            i14 += 4;
        }
        z4Var.v0(i14);
        while (i11 < i5Var.f5078g) {
            z4Var.w0(i5Var.c(i11));
            i11++;
        }
    }

    public static void n(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z4 z4Var = (z4) w5Var.f5247a;
        int i11 = 0;
        if (!(list instanceof i5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    z4Var.p0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            z4Var.m0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            z4Var.v0(i12);
            while (i11 < list.size()) {
                z4Var.w0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        i5 i5Var = (i5) list;
        if (!z10) {
            while (i11 < i5Var.f5078g) {
                z4Var.p0(i10, i5Var.c(i11));
                i11++;
            }
            return;
        }
        z4Var.m0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < i5Var.f5078g; i15++) {
            i5Var.c(i15);
            i14 += 4;
        }
        z4Var.v0(i14);
        while (i11 < i5Var.f5078g) {
            z4Var.w0(i5Var.c(i11));
            i11++;
        }
    }

    public static void o(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z4 z4Var = (z4) w5Var.f5247a;
        int i11 = 0;
        if (!(list instanceof i5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    z4Var.n0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            z4Var.m0(i10, 2);
            int iK0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iK0 += z4.k0(((Integer) list.get(i12)).intValue());
            }
            z4Var.v0(iK0);
            while (i11 < list.size()) {
                z4Var.u0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        i5 i5Var = (i5) list;
        if (!z10) {
            while (i11 < i5Var.f5078g) {
                z4Var.n0(i10, i5Var.c(i11));
                i11++;
            }
            return;
        }
        z4Var.m0(i10, 2);
        int iK02 = 0;
        for (int i13 = 0; i13 < i5Var.f5078g; i13++) {
            iK02 += z4.k0(i5Var.c(i13));
        }
        z4Var.v0(iK02);
        while (i11 < i5Var.f5078g) {
            z4Var.u0(i5Var.c(i11));
            i11++;
        }
    }

    public static void p(int i10, List list, w5 w5Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        z4 z4Var = (z4) w5Var.f5247a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i11)).booleanValue();
                z4Var.v0(i10 << 3);
                z4Var.t0(zBooleanValue ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        z4Var.m0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        z4Var.v0(i12);
        while (i11 < list.size()) {
            z4Var.t0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v5)) {
            int iK0 = 0;
            while (i10 < size) {
                iK0 += z4.k0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iK0;
        }
        v5 v5Var = (v5) list;
        int iK02 = 0;
        while (i10 < size) {
            iK02 += z4.k0(v5Var.b(i10));
            i10++;
        }
        return iK02;
    }

    public static int r(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v5)) {
            int iK0 = 0;
            while (i10 < size) {
                iK0 += z4.k0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iK0;
        }
        v5 v5Var = (v5) list;
        int iK02 = 0;
        while (i10 < size) {
            iK02 += z4.k0(v5Var.b(i10));
            i10++;
        }
        return iK02;
    }

    public static int s(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v5)) {
            int iK0 = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iK0 += z4.k0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iK0;
        }
        v5 v5Var = (v5) list;
        int iK02 = 0;
        while (i10 < size) {
            long jB = v5Var.b(i10);
            iK02 += z4.k0((jB >> 63) ^ (jB + jB));
            i10++;
        }
        return iK02;
    }

    public static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i5)) {
            int iK0 = 0;
            while (i10 < size) {
                iK0 += z4.k0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iK0;
        }
        i5 i5Var = (i5) list;
        int iK02 = 0;
        while (i10 < size) {
            iK02 += z4.k0(i5Var.c(i10));
            i10++;
        }
        return iK02;
    }

    public static int u(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i5)) {
            int iK0 = 0;
            while (i10 < size) {
                iK0 += z4.k0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iK0;
        }
        i5 i5Var = (i5) list;
        int iK02 = 0;
        while (i10 < size) {
            iK02 += z4.k0(i5Var.c(i10));
            i10++;
        }
        return iK02;
    }

    public static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i5)) {
            int iB0 = 0;
            while (i10 < size) {
                iB0 += z4.B0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iB0;
        }
        i5 i5Var = (i5) list;
        int iB02 = 0;
        while (i10 < size) {
            iB02 += z4.B0(i5Var.c(i10));
            i10++;
        }
        return iB02;
    }

    public static int w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i5)) {
            int iB0 = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iB0 += z4.B0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iB0;
        }
        i5 i5Var = (i5) list;
        int iB02 = 0;
        while (i10 < size) {
            int iC = i5Var.c(i10);
            iB02 += z4.B0((iC >> 31) ^ (iC + iC));
            i10++;
        }
        return iB02;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (z4.B0(i10 << 3) + 4) * size;
    }

    public static int y(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (z4.B0(i10 << 3) + 8) * size;
    }
}
