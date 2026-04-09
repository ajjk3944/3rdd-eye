package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5097y;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f38494a = A();

    /* renamed from: b, reason: collision with root package name */
    private static final h0 f38495b = B(false);

    /* renamed from: c, reason: collision with root package name */
    private static final h0 f38496c = B(true);

    /* renamed from: d, reason: collision with root package name */
    private static final h0 f38497d = new j0();

    private static Class A() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static h0 B(boolean z10) {
        try {
            Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (h0) clsC.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(AbstractC5089p abstractC5089p, Object obj, Object obj2) {
        AbstractC5091s abstractC5091sC = abstractC5089p.c(obj2);
        if (abstractC5091sC.d()) {
            return;
        }
        abstractC5089p.d(obj).h(abstractC5091sC);
    }

    static void E(H h10, Object obj, Object obj2, long j10) {
        l0.R(obj, j10, h10.a(l0.C(obj, j10), l0.C(obj2, j10)));
    }

    static void F(h0 h0Var, Object obj, Object obj2) {
        h0Var.p(obj, h0Var.k(h0Var.g(obj), h0Var.g(obj2)));
    }

    public static h0 G() {
        return f38495b;
    }

    public static h0 H() {
        return f38496c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC5095w.class.isAssignableFrom(cls) && (cls2 = f38494a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean J(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static Object K(Object obj, int i10, int i11, Object obj2, h0 h0Var) {
        if (obj2 == null) {
            obj2 = h0Var.f(obj);
        }
        h0Var.e(obj2, i10, i11);
        return obj2;
    }

    public static h0 L() {
        return f38497d;
    }

    public static void M(int i10, List list, o0 o0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.w(i10, list, z10);
    }

    public static void N(int i10, List list, o0 o0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.I(i10, list);
    }

    public static void O(int i10, List list, o0 o0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.G(i10, list, z10);
    }

    public static void P(int i10, List list, o0 o0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.F(i10, list, z10);
    }

    public static void Q(int i10, List list, o0 o0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.v(i10, list, z10);
    }

    public static void R(int i10, List list, o0 o0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.s(i10, list, z10);
    }

    public static void S(int i10, List list, o0 o0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.a(i10, list, z10);
    }

    public static void T(int i10, List list, o0 o0Var, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.M(i10, list, c0Var);
    }

    public static void U(int i10, List list, o0 o0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.m(i10, list, z10);
    }

    public static void V(int i10, List list, o0 o0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.E(i10, list, z10);
    }

    public static void W(int i10, List list, o0 o0Var, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.N(i10, list, c0Var);
    }

    public static void X(int i10, List list, o0 o0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.t(i10, list, z10);
    }

    public static void Y(int i10, List list, o0 o0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.f(i10, list, z10);
    }

    public static void Z(int i10, List list, o0 o0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.C(i10, list, z10);
    }

    static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.L(i10) + CodedOutputStream.x(size) : size * CodedOutputStream.d(i10, true);
    }

    public static void a0(int i10, List list, o0 o0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.y(i10, list, z10);
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, o0 o0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.j(i10, list);
    }

    static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = size * CodedOutputStream.L(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iL += CodedOutputStream.g((AbstractC5081h) list.get(i11));
        }
        return iL;
    }

    public static void c0(int i10, List list, o0 o0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.x(i10, list, z10);
    }

    static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z10 ? CodedOutputStream.L(i10) + CodedOutputStream.x(iE) : iE + (size * CodedOutputStream.L(i10));
    }

    public static void d0(int i10, List list, o0 o0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0Var.g(i10, list, z10);
    }

    static int e(List list) {
        int iK;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5096x) {
            AbstractC5096x abstractC5096x = (AbstractC5096x) list;
            iK = 0;
            while (i10 < size) {
                iK += CodedOutputStream.k(abstractC5096x.f(i10));
                i10++;
            }
        } else {
            iK = 0;
            while (i10 < size) {
                iK += CodedOutputStream.k(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iK;
    }

    static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.L(i10) + CodedOutputStream.x(size * 4) : size * CodedOutputStream.l(i10, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.L(i10) + CodedOutputStream.x(size * 8) : size * CodedOutputStream.n(i10, 0L);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i10, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iR += CodedOutputStream.r(i10, (M) list.get(i11), c0Var);
        }
        return iR;
    }

    static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z10 ? CodedOutputStream.L(i10) + CodedOutputStream.x(iL) : iL + (size * CodedOutputStream.L(i10));
    }

    static int l(List list) {
        int iU;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5096x) {
            AbstractC5096x abstractC5096x = (AbstractC5096x) list;
            iU = 0;
            while (i10 < size) {
                iU += CodedOutputStream.u(abstractC5096x.f(i10));
                i10++;
            }
        } else {
            iU = 0;
            while (i10 < size) {
                iU += CodedOutputStream.u(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iU;
    }

    static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? CodedOutputStream.L(i10) + CodedOutputStream.x(iN) : iN + (list.size() * CodedOutputStream.L(i10));
    }

    static int n(List list) {
        int iW;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof D) {
            D d10 = (D) list;
            iW = 0;
            while (i10 < size) {
                iW += CodedOutputStream.w(d10.f(i10));
                i10++;
            }
        } else {
            iW = 0;
            while (i10 < size) {
                iW += CodedOutputStream.w(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iW;
    }

    static int o(int i10, Object obj, c0 c0Var) {
        return CodedOutputStream.y(i10, (M) obj, c0Var);
    }

    static int p(int i10, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = CodedOutputStream.L(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            iL += CodedOutputStream.z((M) list.get(i11), c0Var);
        }
        return iL;
    }

    static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z10 ? CodedOutputStream.L(i10) + CodedOutputStream.x(iR) : iR + (size * CodedOutputStream.L(i10));
    }

    static int r(List list) {
        int iG;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5096x) {
            AbstractC5096x abstractC5096x = (AbstractC5096x) list;
            iG = 0;
            while (i10 < size) {
                iG += CodedOutputStream.G(abstractC5096x.f(i10));
                i10++;
            }
        } else {
            iG = 0;
            while (i10 < size) {
                iG += CodedOutputStream.G(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iG;
    }

    static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? CodedOutputStream.L(i10) + CodedOutputStream.x(iT) : iT + (size * CodedOutputStream.L(i10));
    }

    static int t(List list) {
        int I10;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof D) {
            D d10 = (D) list;
            I10 = 0;
            while (i10 < size) {
                I10 += CodedOutputStream.I(d10.f(i10));
                i10++;
            }
        } else {
            I10 = 0;
            while (i10 < size) {
                I10 += CodedOutputStream.I(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return I10;
    }

    static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iL = CodedOutputStream.L(i10) * size;
        if (list instanceof B) {
            B b10 = (B) list;
            while (i11 < size) {
                Object objB = b10.B(i11);
                iL += objB instanceof AbstractC5081h ? CodedOutputStream.g((AbstractC5081h) objB) : CodedOutputStream.K((String) objB);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iL += obj instanceof AbstractC5081h ? CodedOutputStream.g((AbstractC5081h) obj) : CodedOutputStream.K((String) obj);
                i11++;
            }
        }
        return iL;
    }

    static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z10 ? CodedOutputStream.L(i10) + CodedOutputStream.x(iW) : iW + (size * CodedOutputStream.L(i10));
    }

    static int w(List list) {
        int iN;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5096x) {
            AbstractC5096x abstractC5096x = (AbstractC5096x) list;
            iN = 0;
            while (i10 < size) {
                iN += CodedOutputStream.N(abstractC5096x.f(i10));
                i10++;
            }
        } else {
            iN = 0;
            while (i10 < size) {
                iN += CodedOutputStream.N(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iN;
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? CodedOutputStream.L(i10) + CodedOutputStream.x(iY) : iY + (size * CodedOutputStream.L(i10));
    }

    static int y(List list) {
        int iP;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof D) {
            D d10 = (D) list;
            iP = 0;
            while (i10 < size) {
                iP += CodedOutputStream.P(d10.f(i10));
                i10++;
            }
        } else {
            iP = 0;
            while (i10 < size) {
                iP += CodedOutputStream.P(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iP;
    }

    static Object z(Object obj, int i10, List list, AbstractC5097y.c cVar, Object obj2, h0 h0Var) {
        if (cVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = (Integer) list.get(i12);
                int iIntValue = num.intValue();
                if (cVar.a(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    obj2 = K(obj, i10, iIntValue, obj2, h0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!cVar.a(iIntValue2)) {
                    obj2 = K(obj, i10, iIntValue2, obj2, h0Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }
}
