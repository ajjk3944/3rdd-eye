package kotlin.jvm.internal;

import Yg.InterfaceC3665i;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mh.InterfaceC6824a;
import mh.InterfaceC6825b;
import mh.InterfaceC6826c;
import mh.InterfaceC6827d;
import mh.InterfaceC6828e;
import mh.InterfaceC6829f;
import mh.InterfaceC6830g;
import mh.InterfaceC6831h;
import mh.InterfaceC6832i;
import mh.InterfaceC6833j;
import mh.InterfaceC6834k;
import mh.InterfaceC6835l;
import mh.InterfaceC6836m;
import mh.InterfaceC6837n;
import mh.InterfaceC6838o;
import mh.InterfaceC6839p;
import nh.InterfaceC6944a;
import nh.InterfaceC6945b;
import nh.InterfaceC6946c;
import nh.InterfaceC6947d;
import nh.InterfaceC6948e;
import nh.InterfaceC6949f;

/* loaded from: classes4.dex */
public abstract class V {
    public static Collection a(Object obj) {
        if ((obj instanceof InterfaceC6944a) && !(obj instanceof InterfaceC6945b)) {
            r(obj, "kotlin.collections.MutableCollection");
        }
        return g(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof InterfaceC6944a) && !(obj instanceof InterfaceC6946c)) {
            r(obj, "kotlin.collections.MutableIterable");
        }
        return h(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof InterfaceC6944a) && !(obj instanceof InterfaceC6947d)) {
            r(obj, "kotlin.collections.MutableList");
        }
        return i(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof InterfaceC6944a) && !(obj instanceof InterfaceC6948e)) {
            r(obj, "kotlin.collections.MutableMap");
        }
        return j(obj);
    }

    public static Set e(Object obj) {
        if ((obj instanceof InterfaceC6944a) && !(obj instanceof InterfaceC6949f)) {
            r(obj, "kotlin.collections.MutableSet");
        }
        return k(obj);
    }

    public static Object f(Object obj, int i10) {
        if (obj != null && !m(obj, i10)) {
            r(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection g(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static Iterable h(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static List i(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static Map j(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static Set k(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static int l(Object obj) {
        if (obj instanceof InterfaceC6488n) {
            return ((InterfaceC6488n) obj).getArity();
        }
        if (obj instanceof InterfaceC6824a) {
            return 0;
        }
        if (obj instanceof InterfaceC6835l) {
            return 1;
        }
        if (obj instanceof InterfaceC6839p) {
            return 2;
        }
        if (obj instanceof mh.q) {
            return 3;
        }
        if (obj instanceof mh.r) {
            return 4;
        }
        if (obj instanceof mh.s) {
            return 5;
        }
        if (obj instanceof mh.t) {
            return 6;
        }
        if (obj instanceof mh.u) {
            return 7;
        }
        if (obj instanceof mh.v) {
            return 8;
        }
        if (obj instanceof mh.w) {
            return 9;
        }
        if (obj instanceof InterfaceC6825b) {
            return 10;
        }
        if (obj instanceof InterfaceC6826c) {
            return 11;
        }
        if (obj instanceof InterfaceC6827d) {
            return 12;
        }
        if (obj instanceof InterfaceC6828e) {
            return 13;
        }
        if (obj instanceof InterfaceC6829f) {
            return 14;
        }
        if (obj instanceof InterfaceC6830g) {
            return 15;
        }
        if (obj instanceof InterfaceC6831h) {
            return 16;
        }
        if (obj instanceof InterfaceC6832i) {
            return 17;
        }
        if (obj instanceof InterfaceC6833j) {
            return 18;
        }
        if (obj instanceof InterfaceC6834k) {
            return 19;
        }
        if (obj instanceof InterfaceC6836m) {
            return 20;
        }
        if (obj instanceof InterfaceC6837n) {
            return 21;
        }
        return obj instanceof InterfaceC6838o ? 22 : -1;
    }

    public static boolean m(Object obj, int i10) {
        return (obj instanceof InterfaceC3665i) && l(obj) == i10;
    }

    public static boolean n(Object obj) {
        return (obj instanceof List) && (!(obj instanceof InterfaceC6944a) || (obj instanceof InterfaceC6947d));
    }

    public static boolean o(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof InterfaceC6944a) || (obj instanceof InterfaceC6949f));
    }

    private static Throwable p(Throwable th2) {
        return AbstractC6492s.o(th2, V.class.getName());
    }

    public static ClassCastException q(ClassCastException classCastException) {
        throw ((ClassCastException) p(classCastException));
    }

    public static void r(Object obj, String str) {
        s((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void s(String str) {
        throw q(new ClassCastException(str));
    }
}
