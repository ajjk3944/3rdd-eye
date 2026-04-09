package kotlin.jvm.internal;

import b9.InterfaceC1997d;
import java.util.LinkedHashMap;
import java.util.Map;
import p9.InterfaceC5480a;
import p9.InterfaceC5481b;
import p9.InterfaceC5482c;
import p9.InterfaceC5483d;
import p9.InterfaceC5484e;
import q9.InterfaceC5499a;
import q9.InterfaceC5502d;

/* compiled from: TypeIntrinsics.java */
/* loaded from: classes3.dex */
public final class z {
    public static Map a(LinkedHashMap linkedHashMap) {
        if (!(linkedHashMap instanceof InterfaceC5499a) || (linkedHashMap instanceof InterfaceC5502d)) {
            return linkedHashMap;
        }
        d(linkedHashMap, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void b(int i, Object obj) {
        if (obj == null || c(i, obj)) {
            return;
        }
        d(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean c(int i, Object obj) {
        if (obj instanceof InterfaceC1997d) {
            if ((obj instanceof i ? ((i) obj).getArity() : obj instanceof InterfaceC5480a ? 0 : obj instanceof p9.l ? 1 : obj instanceof p9.p ? 2 : obj instanceof p9.q ? 3 : obj instanceof p9.r ? 4 : obj instanceof p9.s ? 5 : obj instanceof p9.t ? 6 : obj instanceof p9.u ? 7 : obj instanceof p9.v ? 8 : obj instanceof p9.w ? 9 : obj instanceof InterfaceC5481b ? 10 : obj instanceof InterfaceC5482c ? 11 : obj instanceof InterfaceC5483d ? 12 : obj instanceof InterfaceC5484e ? 13 : obj instanceof p9.f ? 14 : obj instanceof p9.g ? 15 : obj instanceof p9.h ? 16 : obj instanceof p9.i ? 17 : obj instanceof p9.j ? 18 : obj instanceof p9.k ? 19 : obj instanceof p9.m ? 20 : obj instanceof p9.n ? 21 : obj instanceof p9.o ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(B4.g.o(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        l.j(classCastException, z.class.getName());
        throw classCastException;
    }
}
