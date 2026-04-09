package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class r6 {

    /* renamed from: a, reason: collision with root package name */
    public static final w6 f19504a;

    static {
        int i4 = n5.f19444a;
        f19504a = new w6();
    }

    public static void a(int i4, List list, e6 e6Var, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q5 q5Var = (q5) e6Var.f19335b;
        int i10 = 0;
        if (!(list instanceof x5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    int iIntValue = ((Integer) list.get(i10)).intValue();
                    q5Var.z(i4, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i10++;
                }
                return;
            }
            q5Var.y(i4, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                i11 += q5.i((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            q5Var.A(i11);
            while (i10 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i10)).intValue();
                q5Var.A((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i10++;
            }
            return;
        }
        x5 x5Var = (x5) list;
        if (!z3) {
            while (i10 < x5Var.f19567c) {
                int iC = x5Var.c(i10);
                q5Var.z(i4, (iC >> 31) ^ (iC + iC));
                i10++;
            }
            return;
        }
        q5Var.y(i4, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < x5Var.f19567c; i14++) {
            int iC2 = x5Var.c(i14);
            i13 += q5.i((iC2 >> 31) ^ (iC2 + iC2));
        }
        q5Var.A(i13);
        while (i10 < x5Var.f19567c) {
            int iC3 = x5Var.c(i10);
            q5Var.A((iC3 >> 31) ^ (iC3 + iC3));
            i10++;
        }
    }

    public static void b(int i4, List list, e6 e6Var, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q5 q5Var = (q5) e6Var.f19335b;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                q5Var.B(i4, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return;
        }
        q5Var.y(i4, 2);
        int iJ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iJ += q5.j((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        q5Var.A(iJ);
        while (i10 < list.size()) {
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            q5Var.C((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i10++;
        }
    }

    public static void c(int i4, List list, e6 e6Var, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q5 q5Var = (q5) e6Var.f19335b;
        int i10 = 0;
        if (!(list instanceof x5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    q5Var.z(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            q5Var.y(i4, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                i11 += q5.i(((Integer) list.get(i12)).intValue());
            }
            q5Var.A(i11);
            while (i10 < list.size()) {
                q5Var.A(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        x5 x5Var = (x5) list;
        if (!z3) {
            while (i10 < x5Var.f19567c) {
                q5Var.z(i4, x5Var.c(i10));
                i10++;
            }
            return;
        }
        q5Var.y(i4, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < x5Var.f19567c; i14++) {
            i13 += q5.i(x5Var.c(i14));
        }
        q5Var.A(i13);
        while (i10 < x5Var.f19567c) {
            q5Var.A(x5Var.c(i10));
            i10++;
        }
    }

    public static void d(int i4, List list, e6 e6Var, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q5 q5Var = (q5) e6Var.f19335b;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                q5Var.B(i4, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        q5Var.y(i4, 2);
        int iJ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iJ += q5.j(((Long) list.get(i11)).longValue());
        }
        q5Var.A(iJ);
        while (i10 < list.size()) {
            q5Var.C(((Long) list.get(i10)).longValue());
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
        if (!(list instanceof x5)) {
            int iJ = 0;
            while (i4 < size) {
                iJ += q5.j(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return iJ;
        }
        x5 x5Var = (x5) list;
        int iJ2 = 0;
        while (i4 < size) {
            iJ2 += q5.j(x5Var.c(i4));
            i4++;
        }
        return iJ2;
    }

    public static int g(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q5.i(i4 << 3) + 4) * size;
    }

    public static int h(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (q5.i(i4 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x5)) {
            int iJ = 0;
            while (i4 < size) {
                iJ += q5.j(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return iJ;
        }
        x5 x5Var = (x5) list;
        int iJ2 = 0;
        while (i4 < size) {
            iJ2 += q5.j(x5Var.c(i4));
            i4++;
        }
        return iJ2;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iJ += q5.j(((Long) list.get(i4)).longValue());
        }
        return iJ;
    }

    public static int k(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x5)) {
            int i10 = 0;
            while (i4 < size) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                i10 += q5.i((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i4++;
            }
            return i10;
        }
        x5 x5Var = (x5) list;
        int i11 = 0;
        while (i4 < size) {
            int iC = x5Var.c(i4);
            i11 += q5.i((iC >> 31) ^ (iC + iC));
            i4++;
        }
        return i11;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long jLongValue = ((Long) list.get(i4)).longValue();
            iJ += q5.j((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iJ;
    }

    public static int m(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof x5)) {
            int i10 = 0;
            while (i4 < size) {
                i10 += q5.i(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i10;
        }
        x5 x5Var = (x5) list;
        int i11 = 0;
        while (i4 < size) {
            i11 += q5.i(x5Var.c(i4));
            i4++;
        }
        return i11;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iJ += q5.j(((Long) list.get(i4)).longValue());
        }
        return iJ;
    }

    public static void o(Object obj, Object obj2) {
        w5 w5Var = (w5) obj;
        v6 v6Var = w5Var.zzc;
        v6 v6Var2 = ((w5) obj2).zzc;
        v6 v6Var3 = v6.f19547e;
        if (!v6Var3.equals(v6Var2)) {
            if (v6Var3.equals(v6Var)) {
                v6Var.getClass();
                v6Var2.getClass();
                int[] iArrCopyOf = Arrays.copyOf(v6Var.f19548a, 0);
                System.arraycopy(v6Var2.f19548a, 0, iArrCopyOf, 0, 0);
                Object[] objArrCopyOf = Arrays.copyOf(v6Var.f19549b, 0);
                System.arraycopy(v6Var2.f19549b, 0, objArrCopyOf, 0, 0);
                v6Var = new v6(iArrCopyOf, objArrCopyOf, true);
            } else {
                v6Var.getClass();
                if (!v6Var2.equals(v6Var3)) {
                    if (!v6Var.f19551d) {
                        throw new UnsupportedOperationException();
                    }
                    int[] iArr = v6Var.f19548a;
                    int length = iArr.length;
                    System.arraycopy(v6Var2.f19548a, 0, iArr, 0, 0);
                    System.arraycopy(v6Var2.f19549b, 0, v6Var.f19549b, 0, 0);
                }
            }
        }
        w5Var.zzc = v6Var;
    }

    public static void p(int i4, List list, e6 e6Var, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q5 q5Var = (q5) e6Var.f19335b;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                byte bBooleanValue = ((Boolean) list.get(i10)).booleanValue();
                q5Var.l(11);
                q5Var.o(i4 << 3);
                byte[] bArr = q5Var.f19496c;
                int i11 = q5Var.f19498e;
                bArr[i11] = bBooleanValue;
                q5Var.f19498e = i11 + 1;
                i10++;
            }
            return;
        }
        q5Var.y(i4, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        q5Var.A(i12);
        while (i10 < list.size()) {
            byte bBooleanValue2 = ((Boolean) list.get(i10)).booleanValue();
            if (q5Var.f19498e == q5Var.f19497d) {
                q5Var.k();
            }
            byte[] bArr2 = q5Var.f19496c;
            int i14 = q5Var.f19498e;
            bArr2[i14] = bBooleanValue2;
            q5Var.f19498e = i14 + 1;
            i10++;
        }
    }

    public static void q(int i4, List list, e6 e6Var, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q5 q5Var = (q5) e6Var.f19335b;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                q5Var.t(i4, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        q5Var.y(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            i11 += 8;
        }
        q5Var.A(i11);
        while (i10 < list.size()) {
            q5Var.u(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void r(int i4, List list, e6 e6Var, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q5 q5Var = (q5) e6Var.f19335b;
        int i10 = 0;
        if (!(list instanceof x5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    q5Var.v(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            q5Var.y(i4, 2);
            int iJ = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iJ += q5.j(((Integer) list.get(i11)).intValue());
            }
            q5Var.A(iJ);
            while (i10 < list.size()) {
                q5Var.w(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        x5 x5Var = (x5) list;
        if (!z3) {
            while (i10 < x5Var.f19567c) {
                q5Var.v(i4, x5Var.c(i10));
                i10++;
            }
            return;
        }
        q5Var.y(i4, 2);
        int iJ2 = 0;
        for (int i12 = 0; i12 < x5Var.f19567c; i12++) {
            iJ2 += q5.j(x5Var.c(i12));
        }
        q5Var.A(iJ2);
        while (i10 < x5Var.f19567c) {
            q5Var.w(x5Var.c(i10));
            i10++;
        }
    }

    public static void s(int i4, List list, e6 e6Var, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q5 q5Var = (q5) e6Var.f19335b;
        int i10 = 0;
        if (!(list instanceof x5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    q5Var.r(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            q5Var.y(i4, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            q5Var.A(i11);
            while (i10 < list.size()) {
                q5Var.s(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        x5 x5Var = (x5) list;
        if (!z3) {
            while (i10 < x5Var.f19567c) {
                q5Var.r(i4, x5Var.c(i10));
                i10++;
            }
            return;
        }
        q5Var.y(i4, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < x5Var.f19567c; i14++) {
            x5Var.c(i14);
            i13 += 4;
        }
        q5Var.A(i13);
        while (i10 < x5Var.f19567c) {
            q5Var.s(x5Var.c(i10));
            i10++;
        }
    }

    public static void t(int i4, List list, e6 e6Var, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q5 q5Var = (q5) e6Var.f19335b;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                q5Var.t(i4, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        q5Var.y(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        q5Var.A(i11);
        while (i10 < list.size()) {
            q5Var.u(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void u(int i4, List list, e6 e6Var, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q5 q5Var = (q5) e6Var.f19335b;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                q5Var.r(i4, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        q5Var.y(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            i11 += 4;
        }
        q5Var.A(i11);
        while (i10 < list.size()) {
            q5Var.s(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void v(int i4, List list, e6 e6Var, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q5 q5Var = (q5) e6Var.f19335b;
        int i10 = 0;
        if (!(list instanceof x5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    q5Var.v(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            q5Var.y(i4, 2);
            int iJ = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                iJ += q5.j(((Integer) list.get(i11)).intValue());
            }
            q5Var.A(iJ);
            while (i10 < list.size()) {
                q5Var.w(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        x5 x5Var = (x5) list;
        if (!z3) {
            while (i10 < x5Var.f19567c) {
                q5Var.v(i4, x5Var.c(i10));
                i10++;
            }
            return;
        }
        q5Var.y(i4, 2);
        int iJ2 = 0;
        for (int i12 = 0; i12 < x5Var.f19567c; i12++) {
            iJ2 += q5.j(x5Var.c(i12));
        }
        q5Var.A(iJ2);
        while (i10 < x5Var.f19567c) {
            q5Var.w(x5Var.c(i10));
            i10++;
        }
    }

    public static void w(int i4, List list, e6 e6Var, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q5 q5Var = (q5) e6Var.f19335b;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                q5Var.B(i4, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        q5Var.y(i4, 2);
        int iJ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iJ += q5.j(((Long) list.get(i11)).longValue());
        }
        q5Var.A(iJ);
        while (i10 < list.size()) {
            q5Var.C(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void x(int i4, List list, e6 e6Var, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q5 q5Var = (q5) e6Var.f19335b;
        int i10 = 0;
        if (!(list instanceof x5)) {
            if (!z3) {
                while (i10 < list.size()) {
                    q5Var.r(i4, ((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            q5Var.y(i4, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((Integer) list.get(i12)).getClass();
                i11 += 4;
            }
            q5Var.A(i11);
            while (i10 < list.size()) {
                q5Var.s(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        x5 x5Var = (x5) list;
        if (!z3) {
            while (i10 < x5Var.f19567c) {
                q5Var.r(i4, x5Var.c(i10));
                i10++;
            }
            return;
        }
        q5Var.y(i4, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < x5Var.f19567c; i14++) {
            x5Var.c(i14);
            i13 += 4;
        }
        q5Var.A(i13);
        while (i10 < x5Var.f19567c) {
            q5Var.s(x5Var.c(i10));
            i10++;
        }
    }

    public static void y(int i4, List list, e6 e6Var, boolean z3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        q5 q5Var = (q5) e6Var.f19335b;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                q5Var.t(i4, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        q5Var.y(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            i11 += 8;
        }
        q5Var.A(i11);
        while (i10 < list.size()) {
            q5Var.u(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
