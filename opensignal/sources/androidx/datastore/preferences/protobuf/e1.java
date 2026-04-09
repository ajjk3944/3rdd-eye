package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f1265a;

    /* renamed from: b, reason: collision with root package name */
    public static final l1 f1266b;

    /* renamed from: c, reason: collision with root package name */
    public static final l1 f1267c;

    static {
        Class<?> cls;
        Class<?> cls2;
        a1 a1Var = a1.f1244c;
        l1 l1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f1265a = cls;
        try {
            a1 a1Var2 = a1.f1244c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                l1Var = (l1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f1266b = l1Var;
        f1267c = new l1();
    }

    public static void A(int i10, List list, l0 l0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1316a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                nVar.r0(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return;
        }
        nVar.o0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iX += n.X((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        nVar.q0(iX);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            nVar.s0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    public static void B(int i10, List list, l0 l0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((n) l0Var.f1316a).m0(i10, (String) list.get(i11));
        }
    }

    public static void C(int i10, List list, l0 l0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1316a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                nVar.p0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        nVar.o0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += n.W(((Integer) list.get(i12)).intValue());
        }
        nVar.q0(iW);
        while (i11 < list.size()) {
            nVar.q0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void D(int i10, List list, l0 l0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1316a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                nVar.r0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        nVar.o0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += n.X(((Long) list.get(i12)).longValue());
        }
        nVar.q0(iX);
        while (i11 < list.size()) {
            nVar.s0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += n.X(((Integer) list.get(i10)).intValue());
        }
        return iX;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n.V(i10) + 4) * size;
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (n.V(i10) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += n.X(((Integer) list.get(i10)).intValue());
        }
        return iX;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += n.X(((Long) list.get(i10)).longValue());
        }
        return iX;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iW += n.W((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iW;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iX += n.X((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iX;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iW += n.W(((Integer) list.get(i10)).intValue());
        }
        return iW;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += n.X(((Long) list.get(i10)).longValue());
        }
        return iX;
    }

    public static void k(l1 l1Var, Object obj, Object obj2) {
        l1Var.getClass();
        a0 a0Var = (a0) obj;
        k1 k1Var = a0Var.unknownFields;
        k1 k1Var2 = ((a0) obj2).unknownFields;
        k1 k1Var3 = k1.f1305f;
        if (!k1Var3.equals(k1Var2)) {
            if (k1Var3.equals(k1Var)) {
                int i10 = k1Var.f1306a + k1Var2.f1306a;
                int[] iArrCopyOf = Arrays.copyOf(k1Var.f1307b, i10);
                System.arraycopy(k1Var2.f1307b, 0, iArrCopyOf, k1Var.f1306a, k1Var2.f1306a);
                Object[] objArrCopyOf = Arrays.copyOf(k1Var.f1308c, i10);
                System.arraycopy(k1Var2.f1308c, 0, objArrCopyOf, k1Var.f1306a, k1Var2.f1306a);
                k1Var = new k1(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                k1Var.getClass();
                if (!k1Var2.equals(k1Var3)) {
                    if (!k1Var.f1310e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = k1Var.f1306a + k1Var2.f1306a;
                    k1Var.a(i11);
                    System.arraycopy(k1Var2.f1307b, 0, k1Var.f1307b, k1Var.f1306a, k1Var2.f1306a);
                    System.arraycopy(k1Var2.f1308c, 0, k1Var.f1308c, k1Var.f1306a, k1Var2.f1306a);
                    k1Var.f1306a = i11;
                }
            }
        }
        a0Var.unknownFields = k1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i10, List list, l0 l0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1316a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                nVar.c0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        nVar.o0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = n.f1320f;
            i12++;
        }
        nVar.q0(i12);
        while (i11 < list.size()) {
            nVar.a0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void n(int i10, List list, l0 l0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((n) l0Var.f1316a).d0(i10, (g) list.get(i11));
        }
    }

    public static void o(int i10, List list, l0 l0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1316a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                nVar.getClass();
                nVar.h0(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        nVar.o0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = n.f1320f;
            i12 += 8;
        }
        nVar.q0(i12);
        while (i11 < list.size()) {
            nVar.i0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void p(int i10, List list, l0 l0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1316a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                nVar.j0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        nVar.o0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += n.X(((Integer) list.get(i12)).intValue());
        }
        nVar.q0(iX);
        while (i11 < list.size()) {
            nVar.k0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void q(int i10, List list, l0 l0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1316a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                nVar.f0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        nVar.o0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = n.f1320f;
            i12 += 4;
        }
        nVar.q0(i12);
        while (i11 < list.size()) {
            nVar.g0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void r(int i10, List list, l0 l0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1316a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                nVar.h0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        nVar.o0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = n.f1320f;
            i12 += 8;
        }
        nVar.q0(i12);
        while (i11 < list.size()) {
            nVar.i0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void s(int i10, List list, l0 l0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1316a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                nVar.getClass();
                nVar.f0(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        nVar.o0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = n.f1320f;
            i12 += 4;
        }
        nVar.q0(i12);
        while (i11 < list.size()) {
            nVar.g0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void t(int i10, List list, l0 l0Var, d1 d1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            l0Var.b(i10, list.get(i11), d1Var);
        }
    }

    public static void u(int i10, List list, l0 l0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1316a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                nVar.j0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        nVar.o0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += n.X(((Integer) list.get(i12)).intValue());
        }
        nVar.q0(iX);
        while (i11 < list.size()) {
            nVar.k0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void v(int i10, List list, l0 l0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1316a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                nVar.r0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        nVar.o0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += n.X(((Long) list.get(i12)).longValue());
        }
        nVar.q0(iX);
        while (i11 < list.size()) {
            nVar.s0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void w(int i10, List list, l0 l0Var, d1 d1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((n) l0Var.f1316a).l0(i10, (a) list.get(i11), d1Var);
        }
    }

    public static void x(int i10, List list, l0 l0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1316a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                nVar.f0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        nVar.o0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = n.f1320f;
            i12 += 4;
        }
        nVar.q0(i12);
        while (i11 < list.size()) {
            nVar.g0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void y(int i10, List list, l0 l0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1316a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                nVar.h0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        nVar.o0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = n.f1320f;
            i12 += 8;
        }
        nVar.q0(i12);
        while (i11 < list.size()) {
            nVar.i0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void z(int i10, List list, l0 l0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        n nVar = (n) l0Var.f1316a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                nVar.p0(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                i11++;
            }
            return;
        }
        nVar.o0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iW += n.W((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        nVar.q0(iW);
        while (i11 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            nVar.q0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i11++;
        }
    }

    public static Object j(Object obj, int i10, b0 b0Var, Object obj2, l1 l1Var) {
        return obj2;
    }
}
