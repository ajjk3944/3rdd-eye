package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f1083a;

    /* renamed from: b, reason: collision with root package name */
    public static final f1 f1084b;

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f1085c;

    static {
        Class<?> cls;
        Class<?> cls2;
        u0 u0Var = u0.f1071c;
        f1 f1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f1083a = cls;
        try {
            u0 u0Var2 = u0.f1071c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                f1Var = (f1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f1084b = f1Var;
        f1085c = new f1();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iN = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iN += m.N(((Integer) list.get(i4)).intValue());
        }
        return iN;
    }

    public static int b(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.L(i4) + 4) * size;
    }

    public static int c(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.L(i4) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iN = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iN += m.N(((Integer) list.get(i4)).intValue());
        }
        return iN;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iN = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iN += m.N(((Long) list.get(i4)).longValue());
        }
        return iN;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int iIntValue = ((Integer) list.get(i4)).intValue();
            iM += m.M((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iN = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long jLongValue = ((Long) list.get(i4)).longValue();
            iN += m.N((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iN;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iM += m.M(((Integer) list.get(i4)).intValue());
        }
        return iM;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iN = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iN += m.N(((Long) list.get(i4)).longValue());
        }
        return iN;
    }

    public static void k(f1 f1Var, Object obj, Object obj2) {
        f1Var.getClass();
        w wVar = (w) obj;
        e1 e1Var = wVar.unknownFields;
        e1 e1Var2 = ((w) obj2).unknownFields;
        e1 e1Var3 = e1.f963f;
        if (!e1Var3.equals(e1Var2)) {
            if (e1Var3.equals(e1Var)) {
                int i4 = e1Var.f964a + e1Var2.f964a;
                int[] iArrCopyOf = Arrays.copyOf(e1Var.f965b, i4);
                System.arraycopy(e1Var2.f965b, 0, iArrCopyOf, e1Var.f964a, e1Var2.f964a);
                Object[] objArrCopyOf = Arrays.copyOf(e1Var.f966c, i4);
                System.arraycopy(e1Var2.f966c, 0, objArrCopyOf, e1Var.f964a, e1Var2.f964a);
                e1Var = new e1(i4, iArrCopyOf, objArrCopyOf, true);
            } else {
                e1Var.getClass();
                if (!e1Var2.equals(e1Var3)) {
                    if (!e1Var.f968e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = e1Var.f964a + e1Var2.f964a;
                    e1Var.a(i10);
                    System.arraycopy(e1Var2.f965b, 0, e1Var.f965b, e1Var.f964a, e1Var2.f964a);
                    System.arraycopy(e1Var2.f966c, 0, e1Var.f966c, e1Var.f964a, e1Var2.f964a);
                    e1Var.f964a = i10;
                }
            }
        }
        wVar.unknownFields = e1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i4, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f977a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                mVar.S(i4, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        mVar.e0(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = m.f1013o;
            i11++;
        }
        mVar.g0(i11);
        while (i10 < list.size()) {
            mVar.Q(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void n(int i4, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f977a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                double dDoubleValue = ((Double) list.get(i10)).doubleValue();
                mVar.getClass();
                mVar.X(i4, Double.doubleToRawLongBits(dDoubleValue));
                i10++;
            }
            return;
        }
        mVar.e0(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = m.f1013o;
            i11 += 8;
        }
        mVar.g0(i11);
        while (i10 < list.size()) {
            mVar.Y(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void o(int i4, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f977a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                mVar.Z(i4, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        mVar.e0(i4, 2);
        int iN = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iN += m.N(((Integer) list.get(i11)).intValue());
        }
        mVar.g0(iN);
        while (i10 < list.size()) {
            mVar.a0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void p(int i4, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f977a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                mVar.V(i4, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        mVar.e0(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = m.f1013o;
            i11 += 4;
        }
        mVar.g0(i11);
        while (i10 < list.size()) {
            mVar.W(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void q(int i4, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f977a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                mVar.X(i4, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        mVar.e0(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = m.f1013o;
            i11 += 8;
        }
        mVar.g0(i11);
        while (i10 < list.size()) {
            mVar.Y(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void r(int i4, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f977a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                float fFloatValue = ((Float) list.get(i10)).floatValue();
                mVar.getClass();
                mVar.V(i4, Float.floatToRawIntBits(fFloatValue));
                i10++;
            }
            return;
        }
        mVar.e0(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = m.f1013o;
            i11 += 4;
        }
        mVar.g0(i11);
        while (i10 < list.size()) {
            mVar.W(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void s(int i4, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f977a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                mVar.Z(i4, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        mVar.e0(i4, 2);
        int iN = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iN += m.N(((Integer) list.get(i11)).intValue());
        }
        mVar.g0(iN);
        while (i10 < list.size()) {
            mVar.a0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void t(int i4, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f977a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                mVar.h0(i4, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        mVar.e0(i4, 2);
        int iN = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iN += m.N(((Long) list.get(i11)).longValue());
        }
        mVar.g0(iN);
        while (i10 < list.size()) {
            mVar.i0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void u(int i4, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f977a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                mVar.V(i4, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        mVar.e0(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = m.f1013o;
            i11 += 4;
        }
        mVar.g0(i11);
        while (i10 < list.size()) {
            mVar.W(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void v(int i4, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f977a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                mVar.X(i4, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        mVar.e0(i4, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = m.f1013o;
            i11 += 8;
        }
        mVar.g0(i11);
        while (i10 < list.size()) {
            mVar.Y(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void w(int i4, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f977a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                mVar.f0(i4, (iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
            return;
        }
        mVar.e0(i4, 2);
        int iM = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue2 = ((Integer) list.get(i11)).intValue();
            iM += m.M((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        mVar.g0(iM);
        while (i10 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i10)).intValue();
            mVar.g0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i10++;
        }
    }

    public static void x(int i4, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f977a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                mVar.h0(i4, (jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
            return;
        }
        mVar.e0(i4, 2);
        int iN = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iN += m.N((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        mVar.g0(iN);
        while (i10 < list.size()) {
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            mVar.i0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i10++;
        }
    }

    public static void y(int i4, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f977a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                mVar.f0(i4, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        mVar.e0(i4, 2);
        int iM = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iM += m.M(((Integer) list.get(i11)).intValue());
        }
        mVar.g0(iM);
        while (i10 < list.size()) {
            mVar.g0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void z(int i4, List list, g0 g0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) g0Var.f977a;
        int i10 = 0;
        if (!z3) {
            while (i10 < list.size()) {
                mVar.h0(i4, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        mVar.e0(i4, 2);
        int iN = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iN += m.N(((Long) list.get(i11)).longValue());
        }
        mVar.g0(iN);
        while (i10 < list.size()) {
            mVar.i0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static Object j(Object obj, int i4, x xVar, Object obj2, f1 f1Var) {
        return obj2;
    }
}
