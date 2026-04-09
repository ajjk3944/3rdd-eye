package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class w64 {
    public static final pz a;

    static {
        int i = u44.a;
        a = new pz(10);
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (g54.D(i << 3) + 4) * size;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (g54.D(i << 3) + 8) * size;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void d(Object obj, Object obj2) {
        p54 p54Var = (p54) obj;
        b74 b74Var = p54Var.zzt;
        b74 b74Var2 = ((p54) obj2).zzt;
        b74 b74Var3 = b74.f;
        if (!b74Var3.equals(b74Var2)) {
            if (b74Var3.equals(b74Var)) {
                int i = b74Var.a + b74Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(b74Var.b, i);
                System.arraycopy(b74Var2.b, 0, iArrCopyOf, b74Var.a, b74Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(b74Var.c, i);
                System.arraycopy(b74Var2.c, 0, objArrCopyOf, b74Var.a, b74Var2.a);
                b74Var = new b74(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                b74Var.getClass();
                if (!b74Var2.equals(b74Var3)) {
                    if (!b74Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = b74Var.a + b74Var2.a;
                    b74Var.e(i2);
                    System.arraycopy(b74Var2.b, 0, b74Var.b, b74Var.a, b74Var2.a);
                    System.arraycopy(b74Var2.c, 0, b74Var.c, b74Var.a, b74Var2.a);
                    b74Var.a = i2;
                }
            }
        }
        p54Var.zzt = b74Var;
    }

    public static Object e(Object obj, int i, x54 x54Var, s54 s54Var, Object obj2, pz pzVar) {
        if (s54Var == null) {
            return obj2;
        }
        if (x54Var == null) {
            Iterator it = x54Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!s54Var.a(iIntValue)) {
                    if (obj2 == null) {
                        pzVar.getClass();
                        obj2 = pz.q(obj);
                    }
                    pzVar.getClass();
                    ((b74) obj2).d(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = x54Var.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) x54Var.get(i3);
            int iIntValue2 = num.intValue();
            if (s54Var.a(iIntValue2)) {
                if (i3 != i2) {
                    x54Var.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    pzVar.getClass();
                    obj2 = pz.q(obj);
                }
                pzVar.getClass();
                ((b74) obj2).d(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            x54Var.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void f(int i, List list, it3 it3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g54 g54Var = (g54) it3Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g54Var.O(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        g54Var.I(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        g54Var.X(i3);
        while (i2 < list.size()) {
            g54Var.a0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void g(int i, List list, it3 it3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g54 g54Var = (g54) it3Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g54Var.L(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        g54Var.I(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        g54Var.X(i3);
        while (i2 < list.size()) {
            g54Var.Y(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void h(int i, List list, it3 it3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g54 g54Var = (g54) it3Var.g;
        int i2 = 0;
        if (!(list instanceof e64)) {
            if (!z) {
                while (i2 < list.size()) {
                    g54Var.M(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            g54Var.I(i, 2);
            int iE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iE += g54.E(((Long) list.get(i3)).longValue());
            }
            g54Var.X(iE);
            while (i2 < list.size()) {
                g54Var.Z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        e64 e64Var = (e64) list;
        if (!z) {
            while (i2 < e64Var.h) {
                g54Var.M(i, e64Var.b(i2));
                i2++;
            }
            return;
        }
        g54Var.I(i, 2);
        int iE2 = 0;
        for (int i4 = 0; i4 < e64Var.h; i4++) {
            iE2 += g54.E(e64Var.b(i4));
        }
        g54Var.X(iE2);
        while (i2 < e64Var.h) {
            g54Var.Z(e64Var.b(i2));
            i2++;
        }
    }

    public static void i(int i, List list, it3 it3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g54 g54Var = (g54) it3Var.g;
        int i2 = 0;
        if (!(list instanceof e64)) {
            if (!z) {
                while (i2 < list.size()) {
                    g54Var.M(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            g54Var.I(i, 2);
            int iE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iE += g54.E(((Long) list.get(i3)).longValue());
            }
            g54Var.X(iE);
            while (i2 < list.size()) {
                g54Var.Z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        e64 e64Var = (e64) list;
        if (!z) {
            while (i2 < e64Var.h) {
                g54Var.M(i, e64Var.b(i2));
                i2++;
            }
            return;
        }
        g54Var.I(i, 2);
        int iE2 = 0;
        for (int i4 = 0; i4 < e64Var.h; i4++) {
            iE2 += g54.E(e64Var.b(i4));
        }
        g54Var.X(iE2);
        while (i2 < e64Var.h) {
            g54Var.Z(e64Var.b(i2));
            i2++;
        }
    }

    public static void j(int i, List list, it3 it3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g54 g54Var = (g54) it3Var.g;
        int i2 = 0;
        if (!(list instanceof e64)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    g54Var.M(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            g54Var.I(i, 2);
            int iE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iE += g54.E((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            g54Var.X(iE);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                g54Var.Z((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        e64 e64Var = (e64) list;
        if (!z) {
            while (i2 < e64Var.h) {
                long jB = e64Var.b(i2);
                g54Var.M(i, (jB >> 63) ^ (jB + jB));
                i2++;
            }
            return;
        }
        g54Var.I(i, 2);
        int iE2 = 0;
        for (int i4 = 0; i4 < e64Var.h; i4++) {
            long jB2 = e64Var.b(i4);
            iE2 += g54.E((jB2 >> 63) ^ (jB2 + jB2));
        }
        g54Var.X(iE2);
        while (i2 < e64Var.h) {
            long jB3 = e64Var.b(i2);
            g54Var.Z((jB3 >> 63) ^ (jB3 + jB3));
            i2++;
        }
    }

    public static void k(int i, List list, it3 it3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g54 g54Var = (g54) it3Var.g;
        int i2 = 0;
        if (!(list instanceof e64)) {
            if (!z) {
                while (i2 < list.size()) {
                    g54Var.O(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            g54Var.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            g54Var.X(i3);
            while (i2 < list.size()) {
                g54Var.a0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        e64 e64Var = (e64) list;
        if (!z) {
            while (i2 < e64Var.h) {
                g54Var.O(i, e64Var.b(i2));
                i2++;
            }
            return;
        }
        g54Var.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < e64Var.h; i6++) {
            e64Var.b(i6);
            i5 += 8;
        }
        g54Var.X(i5);
        while (i2 < e64Var.h) {
            g54Var.a0(e64Var.b(i2));
            i2++;
        }
    }

    public static void l(int i, List list, it3 it3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g54 g54Var = (g54) it3Var.g;
        int i2 = 0;
        if (!(list instanceof e64)) {
            if (!z) {
                while (i2 < list.size()) {
                    g54Var.O(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            g54Var.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            g54Var.X(i3);
            while (i2 < list.size()) {
                g54Var.a0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        e64 e64Var = (e64) list;
        if (!z) {
            while (i2 < e64Var.h) {
                g54Var.O(i, e64Var.b(i2));
                i2++;
            }
            return;
        }
        g54Var.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < e64Var.h; i6++) {
            e64Var.b(i6);
            i5 += 8;
        }
        g54Var.X(i5);
        while (i2 < e64Var.h) {
            g54Var.a0(e64Var.b(i2));
            i2++;
        }
    }

    public static void m(int i, List list, it3 it3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g54 g54Var = (g54) it3Var.g;
        int i2 = 0;
        if (!(list instanceof q54)) {
            if (!z) {
                while (i2 < list.size()) {
                    g54Var.J(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            g54Var.I(i, 2);
            int iE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iE += g54.E(((Integer) list.get(i3)).intValue());
            }
            g54Var.X(iE);
            while (i2 < list.size()) {
                g54Var.W(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        q54 q54Var = (q54) list;
        if (!z) {
            while (i2 < q54Var.h) {
                g54Var.J(i, q54Var.c(i2));
                i2++;
            }
            return;
        }
        g54Var.I(i, 2);
        int iE2 = 0;
        for (int i4 = 0; i4 < q54Var.h; i4++) {
            iE2 += g54.E(q54Var.c(i4));
        }
        g54Var.X(iE2);
        while (i2 < q54Var.h) {
            g54Var.W(q54Var.c(i2));
            i2++;
        }
    }

    public static void n(int i, List list, it3 it3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g54 g54Var = (g54) it3Var.g;
        int i2 = 0;
        if (!(list instanceof q54)) {
            if (!z) {
                while (i2 < list.size()) {
                    g54Var.K(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            g54Var.I(i, 2);
            int iD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iD += g54.D(((Integer) list.get(i3)).intValue());
            }
            g54Var.X(iD);
            while (i2 < list.size()) {
                g54Var.X(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        q54 q54Var = (q54) list;
        if (!z) {
            while (i2 < q54Var.h) {
                g54Var.K(i, q54Var.c(i2));
                i2++;
            }
            return;
        }
        g54Var.I(i, 2);
        int iD2 = 0;
        for (int i4 = 0; i4 < q54Var.h; i4++) {
            iD2 += g54.D(q54Var.c(i4));
        }
        g54Var.X(iD2);
        while (i2 < q54Var.h) {
            g54Var.X(q54Var.c(i2));
            i2++;
        }
    }

    public static void o(int i, List list, it3 it3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g54 g54Var = (g54) it3Var.g;
        int i2 = 0;
        if (!(list instanceof q54)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    g54Var.K(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            g54Var.I(i, 2);
            int iD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iD += g54.D((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            g54Var.X(iD);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                g54Var.X((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        q54 q54Var = (q54) list;
        if (!z) {
            while (i2 < q54Var.h) {
                int iC = q54Var.c(i2);
                g54Var.K(i, (iC >> 31) ^ (iC + iC));
                i2++;
            }
            return;
        }
        g54Var.I(i, 2);
        int iD2 = 0;
        for (int i4 = 0; i4 < q54Var.h; i4++) {
            int iC2 = q54Var.c(i4);
            iD2 += g54.D((iC2 >> 31) ^ (iC2 + iC2));
        }
        g54Var.X(iD2);
        while (i2 < q54Var.h) {
            int iC3 = q54Var.c(i2);
            g54Var.X((iC3 >> 31) ^ (iC3 + iC3));
            i2++;
        }
    }

    public static void p(int i, List list, it3 it3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g54 g54Var = (g54) it3Var.g;
        int i2 = 0;
        if (!(list instanceof q54)) {
            if (!z) {
                while (i2 < list.size()) {
                    g54Var.L(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            g54Var.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            g54Var.X(i3);
            while (i2 < list.size()) {
                g54Var.Y(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        q54 q54Var = (q54) list;
        if (!z) {
            while (i2 < q54Var.h) {
                g54Var.L(i, q54Var.c(i2));
                i2++;
            }
            return;
        }
        g54Var.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < q54Var.h; i6++) {
            q54Var.c(i6);
            i5 += 4;
        }
        g54Var.X(i5);
        while (i2 < q54Var.h) {
            g54Var.Y(q54Var.c(i2));
            i2++;
        }
    }

    public static void q(int i, List list, it3 it3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g54 g54Var = (g54) it3Var.g;
        int i2 = 0;
        if (!(list instanceof q54)) {
            if (!z) {
                while (i2 < list.size()) {
                    g54Var.L(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            g54Var.I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            g54Var.X(i3);
            while (i2 < list.size()) {
                g54Var.Y(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        q54 q54Var = (q54) list;
        if (!z) {
            while (i2 < q54Var.h) {
                g54Var.L(i, q54Var.c(i2));
                i2++;
            }
            return;
        }
        g54Var.I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < q54Var.h; i6++) {
            q54Var.c(i6);
            i5 += 4;
        }
        g54Var.X(i5);
        while (i2 < q54Var.h) {
            g54Var.Y(q54Var.c(i2));
            i2++;
        }
    }

    public static void r(int i, List list, it3 it3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g54 g54Var = (g54) it3Var.g;
        int i2 = 0;
        if (!(list instanceof q54)) {
            if (!z) {
                while (i2 < list.size()) {
                    g54Var.J(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            g54Var.I(i, 2);
            int iE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iE += g54.E(((Integer) list.get(i3)).intValue());
            }
            g54Var.X(iE);
            while (i2 < list.size()) {
                g54Var.W(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        q54 q54Var = (q54) list;
        if (!z) {
            while (i2 < q54Var.h) {
                g54Var.J(i, q54Var.c(i2));
                i2++;
            }
            return;
        }
        g54Var.I(i, 2);
        int iE2 = 0;
        for (int i4 = 0; i4 < q54Var.h; i4++) {
            iE2 += g54.E(q54Var.c(i4));
        }
        g54Var.X(iE2);
        while (i2 < q54Var.h) {
            g54Var.W(q54Var.c(i2));
            i2++;
        }
    }

    public static void s(int i, List list, it3 it3Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g54 g54Var = (g54) it3Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                g54Var.P(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        g54Var.I(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        g54Var.X(i3);
        while (i2 < list.size()) {
            g54Var.V(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e64)) {
            int iE = 0;
            while (i < size) {
                iE += g54.E(((Long) list.get(i)).longValue());
                i++;
            }
            return iE;
        }
        e64 e64Var = (e64) list;
        int iE2 = 0;
        while (i < size) {
            iE2 += g54.E(e64Var.b(i));
            i++;
        }
        return iE2;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e64)) {
            int iE = 0;
            while (i < size) {
                iE += g54.E(((Long) list.get(i)).longValue());
                i++;
            }
            return iE;
        }
        e64 e64Var = (e64) list;
        int iE2 = 0;
        while (i < size) {
            iE2 += g54.E(e64Var.b(i));
            i++;
        }
        return iE2;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e64)) {
            int iE = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iE += g54.E((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iE;
        }
        e64 e64Var = (e64) list;
        int iE2 = 0;
        while (i < size) {
            long jB = e64Var.b(i);
            iE2 += g54.E((jB >> 63) ^ (jB + jB));
            i++;
        }
        return iE2;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof q54)) {
            int iE = 0;
            while (i < size) {
                iE += g54.E(((Integer) list.get(i)).intValue());
                i++;
            }
            return iE;
        }
        q54 q54Var = (q54) list;
        int iE2 = 0;
        while (i < size) {
            iE2 += g54.E(q54Var.c(i));
            i++;
        }
        return iE2;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof q54)) {
            int iE = 0;
            while (i < size) {
                iE += g54.E(((Integer) list.get(i)).intValue());
                i++;
            }
            return iE;
        }
        q54 q54Var = (q54) list;
        int iE2 = 0;
        while (i < size) {
            iE2 += g54.E(q54Var.c(i));
            i++;
        }
        return iE2;
    }

    public static int y(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof q54)) {
            int iD = 0;
            while (i < size) {
                iD += g54.D(((Integer) list.get(i)).intValue());
                i++;
            }
            return iD;
        }
        q54 q54Var = (q54) list;
        int iD2 = 0;
        while (i < size) {
            iD2 += g54.D(q54Var.c(i));
            i++;
        }
        return iD2;
    }

    public static int z(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof q54)) {
            int iD = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iD += g54.D((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iD;
        }
        q54 q54Var = (q54) list;
        int iD2 = 0;
        while (i < size) {
            int iC = q54Var.c(i);
            iD2 += g54.D((iC >> 31) ^ (iC + iC));
            i++;
        }
        return iD2;
    }
}
