package br;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class b0 {
    public static Map a(Object obj) {
        if ((obj instanceof cr.a) && !(obj instanceof cr.c)) {
            f(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e4) {
            l.i(e4, b0.class.getName());
            throw e4;
        }
    }

    public static Set b(Object obj) {
        if ((obj instanceof cr.a) && !(obj instanceof cr.d)) {
            f(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e4) {
            l.i(e4, b0.class.getName());
            throw e4;
        }
    }

    public static void c(int i10, Object obj) {
        if (obj == null || d(i10, obj)) {
            return;
        }
        f(obj, "kotlin.jvm.functions.Function" + i10);
        throw null;
    }

    public static boolean d(int i10, Object obj) {
        int iF;
        if (obj instanceof lq.e) {
            if (obj instanceof i) {
                iF = ((i) obj).f();
            } else if (obj instanceof ar.a) {
                iF = 0;
            } else if (obj instanceof ar.k) {
                iF = 1;
            } else if (obj instanceof ar.n) {
                iF = 2;
            } else if (obj instanceof ar.o) {
                iF = 3;
            } else if (obj instanceof ar.p) {
                iF = 4;
            } else if (obj instanceof ar.q) {
                iF = 5;
            } else if (obj instanceof ar.r) {
                iF = 6;
            } else if (obj instanceof ar.s) {
                iF = 7;
            } else if (obj instanceof ar.t) {
                iF = 8;
            } else if (obj instanceof ar.u) {
                iF = 9;
            } else if (obj instanceof ar.b) {
                iF = 10;
            } else if (obj instanceof ar.c) {
                iF = 11;
            } else {
                boolean z10 = obj instanceof lr.e;
                iF = z10 ? 12 : obj instanceof ar.d ? 13 : obj instanceof ar.e ? 14 : obj instanceof ar.f ? 15 : obj instanceof ar.g ? 16 : obj instanceof ar.h ? 17 : obj instanceof ar.i ? 18 : obj instanceof ar.j ? 19 : obj instanceof ar.l ? 20 : obj instanceof ar.m ? 21 : z10 ? 22 : -1;
            }
            if (iF == i10) {
                return true;
            }
        }
        return false;
    }

    public static final b e(Object[] objArr) {
        l.e(objArr, "array");
        return new b(objArr);
    }

    public static void f(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(w.g.g(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        l.i(classCastException, b0.class.getName());
        throw classCastException;
    }
}
