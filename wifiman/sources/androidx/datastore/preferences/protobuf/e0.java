package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3987x;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f30833a = A();

    /* renamed from: b, reason: collision with root package name */
    private static final i0 f30834b = B(false);

    /* renamed from: c, reason: collision with root package name */
    private static final i0 f30835c = B(true);

    /* renamed from: d, reason: collision with root package name */
    private static final i0 f30836d = new k0();

    private static Class A() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static i0 B(boolean z10) {
        try {
            Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (i0) clsC.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(AbstractC3979o abstractC3979o, Object obj, Object obj2) {
        r rVarC = abstractC3979o.c(obj2);
        if (rVarC.j()) {
            return;
        }
        abstractC3979o.d(obj).p(rVarC);
    }

    static void E(H h10, Object obj, Object obj2, long j10) {
        m0.O(obj, j10, h10.a(m0.A(obj, j10), m0.A(obj2, j10)));
    }

    static void F(i0 i0Var, Object obj, Object obj2) {
        i0Var.p(obj, i0Var.k(i0Var.g(obj), i0Var.g(obj2)));
    }

    public static i0 G() {
        return f30834b;
    }

    public static i0 H() {
        return f30835c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC3985v.class.isAssignableFrom(cls) && (cls2 = f30833a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean J(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static Object K(int i10, int i11, Object obj, i0 i0Var) {
        if (obj == null) {
            obj = i0Var.n();
        }
        i0Var.e(obj, i10, i11);
        return obj;
    }

    public static i0 L() {
        return f30836d;
    }

    public static void M(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.w(i10, list, z10);
    }

    public static void N(int i10, List list, p0 p0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.I(i10, list);
    }

    public static void O(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.G(i10, list, z10);
    }

    public static void P(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.F(i10, list, z10);
    }

    public static void Q(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.v(i10, list, z10);
    }

    public static void R(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.s(i10, list, z10);
    }

    public static void S(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.a(i10, list, z10);
    }

    public static void T(int i10, List list, p0 p0Var, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.K(i10, list, c0Var);
    }

    public static void U(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.m(i10, list, z10);
    }

    public static void V(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.E(i10, list, z10);
    }

    public static void W(int i10, List list, p0 p0Var, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.J(i10, list, c0Var);
    }

    public static void X(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.t(i10, list, z10);
    }

    public static void Y(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.f(i10, list, z10);
    }

    public static void Z(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.C(i10, list, z10);
    }

    static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.P(i10) + CodedOutputStream.y(size) : size * CodedOutputStream.c(i10, true);
    }

    public static void a0(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.y(i10, list, z10);
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, p0 p0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.j(i10, list);
    }

    static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP = size * CodedOutputStream.P(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iP += CodedOutputStream.g((AbstractC3971g) list.get(i11));
        }
        return iP;
    }

    public static void c0(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.x(i10, list, z10);
    }

    static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z10 ? CodedOutputStream.P(i10) + CodedOutputStream.y(iE) : iE + (size * CodedOutputStream.P(i10));
    }

    public static void d0(int i10, List list, p0 p0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        p0Var.g(i10, list, z10);
    }

    static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC3986w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iK = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iK += CodedOutputStream.k(((Integer) list.get(i10)).intValue());
        }
        return iK;
    }

    static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.P(i10) + CodedOutputStream.y(size * 4) : size * CodedOutputStream.l(i10, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? CodedOutputStream.P(i10) + CodedOutputStream.y(size * 8) : size * CodedOutputStream.n(i10, 0L);
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
        return z10 ? CodedOutputStream.P(i10) + CodedOutputStream.y(iL) : iL + (size * CodedOutputStream.P(i10));
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC3986w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iV = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iV += CodedOutputStream.v(((Integer) list.get(i10)).intValue());
        }
        return iV;
    }

    static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? CodedOutputStream.P(i10) + CodedOutputStream.y(iN) : iN + (list.size() * CodedOutputStream.P(i10));
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof D) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += CodedOutputStream.x(((Long) list.get(i10)).longValue());
        }
        return iX;
    }

    static int o(int i10, Object obj, c0 c0Var) {
        return CodedOutputStream.z(i10, (M) obj, c0Var);
    }

    static int p(int i10, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP = CodedOutputStream.P(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            iP += CodedOutputStream.B((M) list.get(i11), c0Var);
        }
        return iP;
    }

    static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z10 ? CodedOutputStream.P(i10) + CodedOutputStream.y(iR) : iR + (size * CodedOutputStream.P(i10));
    }

    static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC3986w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iK = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iK += CodedOutputStream.K(((Integer) list.get(i10)).intValue());
        }
        return iK;
    }

    static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? CodedOutputStream.P(i10) + CodedOutputStream.y(iT) : iT + (size * CodedOutputStream.P(i10));
    }

    static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof D) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iM = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM += CodedOutputStream.M(((Long) list.get(i10)).longValue());
        }
        return iM;
    }

    static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iP = CodedOutputStream.P(i10) * size;
        if (list instanceof B) {
            B b10 = (B) list;
            while (i11 < size) {
                Object objB = b10.B(i11);
                iP += objB instanceof AbstractC3971g ? CodedOutputStream.g((AbstractC3971g) objB) : CodedOutputStream.O((String) objB);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iP += obj instanceof AbstractC3971g ? CodedOutputStream.g((AbstractC3971g) obj) : CodedOutputStream.O((String) obj);
                i11++;
            }
        }
        return iP;
    }

    static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z10 ? CodedOutputStream.P(i10) + CodedOutputStream.y(iW) : iW + (size * CodedOutputStream.P(i10));
    }

    static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC3986w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iR = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iR += CodedOutputStream.R(((Integer) list.get(i10)).intValue());
        }
        return iR;
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? CodedOutputStream.P(i10) + CodedOutputStream.y(iY) : iY + (size * CodedOutputStream.P(i10));
    }

    static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof D) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iT = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iT += CodedOutputStream.T(((Long) list.get(i10)).longValue());
        }
        return iT;
    }

    static Object z(int i10, List list, AbstractC3987x.a aVar, Object obj, i0 i0Var) {
        if (aVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = (Integer) list.get(i12);
                int iIntValue = num.intValue();
                if (aVar.a(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    obj = K(i10, iIntValue, obj, i0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!aVar.a(iIntValue2)) {
                    obj = K(i10, iIntValue2, obj, i0Var);
                    it.remove();
                }
            }
        }
        return obj;
    }
}
