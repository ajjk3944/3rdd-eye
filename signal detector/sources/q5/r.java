package q5;

import c5.InterfaceC0404a;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import o4.AbstractC2763b;

/* loaded from: classes3.dex */
public abstract class r {
    public static Collection a(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof r5.a) || (abstractCollection instanceof r5.b)) {
            return abstractCollection;
        }
        e(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static Map b(LinkedHashMap linkedHashMap) {
        if (!(linkedHashMap instanceof r5.a) || (linkedHashMap instanceof r5.c)) {
            return linkedHashMap;
        }
        e(linkedHashMap, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void c(int i, Object obj) {
        if (d(i, obj)) {
            return;
        }
        e(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean d(int i, Object obj) {
        if (obj instanceof InterfaceC0404a) {
            if ((obj instanceof g ? ((g) obj).c() : obj instanceof p5.a ? 0 : obj instanceof p5.l ? 1 : obj instanceof p5.p ? 2 : obj instanceof p5.q ? 3 : obj instanceof H0.b ? 4 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static void e(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC2763b.f(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        i.f(classCastException, r.class.getName());
        throw classCastException;
    }
}
