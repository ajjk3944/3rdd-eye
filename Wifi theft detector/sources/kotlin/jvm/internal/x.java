package kotlin.jvm.internal;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class x {
    public static List a(Object obj) {
        if ((obj instanceof m9.a) && !(obj instanceof m9.b)) {
            h(obj, "kotlin.collections.MutableList");
        }
        return c(obj);
    }

    public static Object b(Object obj, int i10) {
        if (obj != null && !e(obj, i10)) {
            h(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static List c(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw g(e10);
        }
    }

    public static int d(Object obj) {
        if (obj instanceof m) {
            return ((m) obj).getArity();
        }
        if (obj instanceof l9.a) {
            return 0;
        }
        if (obj instanceof l9.l) {
            return 1;
        }
        if (obj instanceof l9.p) {
            return 2;
        }
        if (obj instanceof l9.q) {
            return 3;
        }
        if (obj instanceof l9.r) {
            return 4;
        }
        if (obj instanceof l9.s) {
            return 5;
        }
        if (obj instanceof l9.t) {
            return 6;
        }
        if (obj instanceof l9.u) {
            return 7;
        }
        if (obj instanceof l9.v) {
            return 8;
        }
        if (obj instanceof l9.w) {
            return 9;
        }
        if (obj instanceof l9.b) {
            return 10;
        }
        if (obj instanceof l9.c) {
            return 11;
        }
        if (obj instanceof l9.d) {
            return 12;
        }
        if (obj instanceof l9.e) {
            return 13;
        }
        if (obj instanceof l9.f) {
            return 14;
        }
        if (obj instanceof l9.g) {
            return 15;
        }
        if (obj instanceof l9.h) {
            return 16;
        }
        if (obj instanceof l9.i) {
            return 17;
        }
        if (obj instanceof l9.j) {
            return 18;
        }
        if (obj instanceof l9.k) {
            return 19;
        }
        if (obj instanceof l9.m) {
            return 20;
        }
        if (obj instanceof l9.n) {
            return 21;
        }
        return obj instanceof l9.o ? 22 : -1;
    }

    public static boolean e(Object obj, int i10) {
        return (obj instanceof y8.e) && d(obj) == i10;
    }

    public static Throwable f(Throwable th) {
        return p.l(th, x.class.getName());
    }

    public static ClassCastException g(ClassCastException classCastException) {
        throw ((ClassCastException) f(classCastException));
    }

    public static void h(Object obj, String str) {
        i((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void i(String str) {
        throw g(new ClassCastException(str));
    }
}
