package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f20187a;

    static {
        i2 i2Var = i2.f20149c;
        f20187a = new n1(6);
    }

    public static void a(int i4, List list, a2 a2Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1 h1Var = (h1) a2Var.f20082a;
        int i10 = 0;
        if (!(list instanceof q1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    h1Var.i0(i4, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            h1Var.h0(i4, 2);
            int iW = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                iW += h1.W((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            h1Var.j0(iW);
            while (i10 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                h1Var.j0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        q1 q1Var = (q1) list;
        if (!z3) {
            while (i10 < q1Var.f20219c) {
                int iC = q1Var.c(i10);
                h1Var.i0(i4, (iC >> 31) ^ (iC + iC));
                i10++;
            }
            return;
        }
        h1Var.h0(i4, 2);
        int iW2 = 0;
        for (int i12 = 0; i12 < q1Var.f20219c; i12++) {
            int iC2 = q1Var.c(i12);
            iW2 += h1.W((iC2 >> 31) ^ (iC2 + iC2));
        }
        h1Var.j0(iW2);
        while (i10 < q1Var.f20219c) {
            int iC3 = q1Var.c(i10);
            h1Var.j0((iC3 >> 31) ^ (iC3 + iC3));
            i10++;
        }
    }

    public static void b(int i4, List list, a2 a2Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1 h1Var = (h1) a2Var.f20082a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                h1Var.k0(i4, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return;
        }
        h1Var.h0(i4, 2);
        int iX = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iX += h1.X((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        h1Var.j0(iX);
        while (i10 < list.size()) {
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            h1Var.l0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i10++;
        }
    }

    public static void c(int i4, List list, a2 a2Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1 h1Var = (h1) a2Var.f20082a;
        int i10 = 0;
        if (!(list instanceof q1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    h1Var.i0(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            h1Var.h0(i4, 2);
            int iW = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iW += h1.W(((Integer) list.get(i11)).intValue());
            }
            h1Var.j0(iW);
            while (i10 < list.size()) {
                h1Var.j0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        q1 q1Var = (q1) list;
        if (!z3) {
            while (i10 < q1Var.f20219c) {
                h1Var.i0(i4, q1Var.c(i10));
                i10++;
            }
            return;
        }
        h1Var.h0(i4, 2);
        int iW2 = 0;
        for (int i12 = 0; i12 < q1Var.f20219c; i12++) {
            iW2 += h1.W(q1Var.c(i12));
        }
        h1Var.j0(iW2);
        while (i10 < q1Var.f20219c) {
            h1Var.j0(q1Var.c(i10));
            i10++;
        }
    }

    public static void d(int i4, List list, a2 a2Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1 h1Var = (h1) a2Var.f20082a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                h1Var.k0(i4, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        h1Var.h0(i4, 2);
        int iX = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iX += h1.X(((Long) list.get(i11)).longValue());
        }
        h1Var.j0(iX);
        while (i10 < list.size()) {
            h1Var.l0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof q1)) {
            int iX = 0;
            while (i4 < size) {
                iX += h1.X(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return iX;
        }
        q1 q1Var = (q1) list;
        int iX2 = 0;
        while (i4 < size) {
            iX2 += h1.X(q1Var.c(i4));
            i4++;
        }
        return iX2;
    }

    public static int g(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (h1.W(i4 << 3) + 4) * size;
    }

    public static int h(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (h1.W(i4 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof q1)) {
            int iX = 0;
            while (i4 < size) {
                iX += h1.X(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return iX;
        }
        q1 q1Var = (q1) list;
        int iX2 = 0;
        while (i4 < size) {
            iX2 += h1.X(q1Var.c(i4));
            i4++;
        }
        return iX2;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iX += h1.X(((Long) list.get(i4)).longValue());
        }
        return iX;
    }

    public static int k(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof q1)) {
            int iW = 0;
            while (i4 < size) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                iW += h1.W((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i4++;
            }
            return iW;
        }
        q1 q1Var = (q1) list;
        int iW2 = 0;
        while (i4 < size) {
            int iC = q1Var.c(i4);
            iW2 += h1.W((iC >> 31) ^ (iC + iC));
            i4++;
        }
        return iW2;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long jLongValue = ((Long) list.get(i4)).longValue();
            iX += h1.X((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iX;
    }

    public static int m(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof q1)) {
            int iW = 0;
            while (i4 < size) {
                iW += h1.W(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return iW;
        }
        q1 q1Var = (q1) list;
        int iW2 = 0;
        while (i4 < size) {
            iW2 += h1.W(q1Var.c(i4));
            i4++;
        }
        return iW2;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iX += h1.X(((Long) list.get(i4)).longValue());
        }
        return iX;
    }

    public static Object o(Object obj, int i4, int i10, Object obj2, n1 n1Var) {
        Object obj3 = obj2;
        if (obj2 == null) {
            n1Var.getClass();
            p1 p1Var = (p1) obj;
            p2 p2Var = p1Var.zzc;
            obj3 = p2Var;
            if (p2Var == p2.f20207f) {
                p2 p2VarB = p2.b();
                p1Var.zzc = p2VarB;
                obj3 = p2VarB;
            }
        }
        ((p2) obj3).c(i4 << 3, Long.valueOf(i10));
        return obj3;
    }

    public static void p(Object obj, Object obj2) {
        p1 p1Var = (p1) obj;
        p2 p2Var = p1Var.zzc;
        p2 p2Var2 = ((p1) obj2).zzc;
        p2 p2Var3 = p2.f20207f;
        if (!p2Var3.equals(p2Var2)) {
            if (p2Var3.equals(p2Var)) {
                int i4 = p2Var.f20208a + p2Var2.f20208a;
                int[] iArrCopyOf = Arrays.copyOf(p2Var.f20209b, i4);
                System.arraycopy(p2Var2.f20209b, 0, iArrCopyOf, p2Var.f20208a, p2Var2.f20208a);
                Object[] objArrCopyOf = Arrays.copyOf(p2Var.f20210c, i4);
                System.arraycopy(p2Var2.f20210c, 0, objArrCopyOf, p2Var.f20208a, p2Var2.f20208a);
                p2Var = new p2(i4, iArrCopyOf, objArrCopyOf, true);
            } else {
                p2Var.getClass();
                if (!p2Var2.equals(p2Var3)) {
                    if (!p2Var.f20212e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = p2Var.f20208a + p2Var2.f20208a;
                    p2Var.e(i10);
                    System.arraycopy(p2Var2.f20209b, 0, p2Var.f20209b, p2Var.f20208a, p2Var2.f20208a);
                    System.arraycopy(p2Var2.f20210c, 0, p2Var.f20210c, p2Var.f20208a, p2Var2.f20208a);
                    p2Var.f20208a = i10;
                }
            }
        }
        p1Var.zzc = p2Var;
    }

    public static void q(int i4, List list, a2 a2Var, boolean z3) {
        int i10;
        int i11;
        if (list == null || list.isEmpty()) {
            return;
        }
        h1 h1Var = (h1) a2Var.f20082a;
        int i12 = 0;
        if (!z3) {
            while (i12 < list.size()) {
                byte bBooleanValue = ((Boolean) list.get(i12)).booleanValue();
                h1Var.j0(i4 << 3);
                int i13 = h1Var.f20141e;
                try {
                    i10 = i13 + 1;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                }
                try {
                    h1Var.f20139c[i13] = bBooleanValue;
                    h1Var.f20141e = i10;
                    i12++;
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    i13 = i10;
                    throw new androidx.datastore.preferences.protobuf.l(i13, h1Var.f20140d, 1, e, 6);
                }
            }
            return;
        }
        h1Var.h0(i4, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            ((Boolean) list.get(i15)).getClass();
            i14++;
        }
        h1Var.j0(i14);
        while (i12 < list.size()) {
            byte bBooleanValue2 = ((Boolean) list.get(i12)).booleanValue();
            int i16 = h1Var.f20141e;
            try {
                i11 = i16 + 1;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
            }
            try {
                h1Var.f20139c[i16] = bBooleanValue2;
                h1Var.f20141e = i11;
                i12++;
            } catch (IndexOutOfBoundsException e12) {
                e = e12;
                i16 = i11;
                throw new androidx.datastore.preferences.protobuf.l(i16, h1Var.f20140d, 1, e, 6);
            }
        }
    }

    public static void r(int i4, List list, a2 a2Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1 h1Var = (h1) a2Var.f20082a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                h1Var.c0(i4, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        h1Var.h0(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        h1Var.j0(i11);
        while (i10 < list.size()) {
            h1Var.d0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void s(int i4, List list, a2 a2Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1 h1Var = (h1) a2Var.f20082a;
        int i10 = 0;
        if (!(list instanceof q1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    h1Var.e0(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            h1Var.h0(i4, 2);
            int iX = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iX += h1.X(((Integer) list.get(i11)).intValue());
            }
            h1Var.j0(iX);
            while (i10 < list.size()) {
                h1Var.f0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        q1 q1Var = (q1) list;
        if (!z3) {
            while (i10 < q1Var.f20219c) {
                h1Var.e0(i4, q1Var.c(i10));
                i10++;
            }
            return;
        }
        h1Var.h0(i4, 2);
        int iX2 = 0;
        for (int i12 = 0; i12 < q1Var.f20219c; i12++) {
            iX2 += h1.X(q1Var.c(i12));
        }
        h1Var.j0(iX2);
        while (i10 < q1Var.f20219c) {
            h1Var.f0(q1Var.c(i10));
            i10++;
        }
    }

    public static void t(int i4, List list, a2 a2Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1 h1Var = (h1) a2Var.f20082a;
        int i10 = 0;
        if (!(list instanceof q1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    h1Var.a0(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            h1Var.h0(i4, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            h1Var.j0(i11);
            while (i10 < list.size()) {
                h1Var.b0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        q1 q1Var = (q1) list;
        if (!z3) {
            while (i10 < q1Var.f20219c) {
                h1Var.a0(i4, q1Var.c(i10));
                i10++;
            }
            return;
        }
        h1Var.h0(i4, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < q1Var.f20219c; i14++) {
            q1Var.c(i14);
            i13 += 4;
        }
        h1Var.j0(i13);
        while (i10 < q1Var.f20219c) {
            h1Var.b0(q1Var.c(i10));
            i10++;
        }
    }

    public static void u(int i4, List list, a2 a2Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1 h1Var = (h1) a2Var.f20082a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                h1Var.c0(i4, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        h1Var.h0(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        h1Var.j0(i11);
        while (i10 < list.size()) {
            h1Var.d0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void v(int i4, List list, a2 a2Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1 h1Var = (h1) a2Var.f20082a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                h1Var.a0(i4, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        h1Var.h0(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        h1Var.j0(i11);
        while (i10 < list.size()) {
            h1Var.b0(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void w(int i4, List list, a2 a2Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1 h1Var = (h1) a2Var.f20082a;
        int i10 = 0;
        if (!(list instanceof q1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    h1Var.e0(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            h1Var.h0(i4, 2);
            int iX = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iX += h1.X(((Integer) list.get(i11)).intValue());
            }
            h1Var.j0(iX);
            while (i10 < list.size()) {
                h1Var.f0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        q1 q1Var = (q1) list;
        if (!z3) {
            while (i10 < q1Var.f20219c) {
                h1Var.e0(i4, q1Var.c(i10));
                i10++;
            }
            return;
        }
        h1Var.h0(i4, 2);
        int iX2 = 0;
        for (int i12 = 0; i12 < q1Var.f20219c; i12++) {
            iX2 += h1.X(q1Var.c(i12));
        }
        h1Var.j0(iX2);
        while (i10 < q1Var.f20219c) {
            h1Var.f0(q1Var.c(i10));
            i10++;
        }
    }

    public static void x(int i4, List list, a2 a2Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1 h1Var = (h1) a2Var.f20082a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                h1Var.k0(i4, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        h1Var.h0(i4, 2);
        int iX = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iX += h1.X(((Long) list.get(i11)).longValue());
        }
        h1Var.j0(iX);
        while (i10 < list.size()) {
            h1Var.l0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void y(int i4, List list, a2 a2Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1 h1Var = (h1) a2Var.f20082a;
        int i10 = 0;
        if (!(list instanceof q1)) {
            if (!z3) {
                while (i10 < list.size()) {
                    h1Var.a0(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            h1Var.h0(i4, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            h1Var.j0(i11);
            while (i10 < list.size()) {
                h1Var.b0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        q1 q1Var = (q1) list;
        if (!z3) {
            while (i10 < q1Var.f20219c) {
                h1Var.a0(i4, q1Var.c(i10));
                i10++;
            }
            return;
        }
        h1Var.h0(i4, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < q1Var.f20219c; i14++) {
            q1Var.c(i14);
            i13 += 4;
        }
        h1Var.j0(i13);
        while (i10 < q1Var.f20219c) {
            h1Var.b0(q1Var.c(i10));
            i10++;
        }
    }

    public static void z(int i4, List list, a2 a2Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h1 h1Var = (h1) a2Var.f20082a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                h1Var.c0(i4, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        h1Var.h0(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        h1Var.j0(i11);
        while (i10 < list.size()) {
            h1Var.d0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
