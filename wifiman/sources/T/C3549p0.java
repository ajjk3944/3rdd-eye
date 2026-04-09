package T;

import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import o.C7009H;

/* renamed from: T.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3549p0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7009H f21184a;

    private /* synthetic */ C3549p0(C7009H c7009h) {
        this.f21184a = c7009h;
    }

    public static final /* synthetic */ C3549p0 a(C7009H c7009h) {
        return new C3549p0(c7009h);
    }

    public static C7009H b(C7009H c7009h) {
        return c7009h;
    }

    public static boolean c(C7009H c7009h, Object obj) {
        return (obj instanceof C3549p0) && AbstractC6492s.d(c7009h, ((C3549p0) obj).h());
    }

    public static int d(C7009H c7009h) {
        return c7009h.hashCode();
    }

    public static final Object e(C7009H c7009h, Object obj) {
        Object objC = c7009h.c(obj);
        if (objC == null) {
            return null;
        }
        if (kotlin.jvm.internal.V.n(objC)) {
            List listC = kotlin.jvm.internal.V.c(objC);
            Object objRemove = listC.remove(0);
            if (listC.isEmpty()) {
                c7009h.p(obj);
            }
            objC = objRemove;
        } else {
            c7009h.p(obj);
        }
        AbstractC6492s.g(objC, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
        return objC;
    }

    public static final void f(C7009H c7009h, Object obj, Object obj2) {
        int iL = c7009h.l(obj);
        boolean z10 = iL < 0;
        Object obj3 = z10 ? null : c7009h.f54923c[iL];
        if (obj3 != null) {
            if (kotlin.jvm.internal.V.n(obj3)) {
                AbstractC6492s.g(obj3, "null cannot be cast to non-null type kotlin.collections.MutableList<V of androidx.compose.runtime.MutableScatterMultiMap.put_impl$lambda$0>");
                List listC = kotlin.jvm.internal.V.c(obj3);
                listC.add(obj2);
                obj2 = listC;
            } else {
                obj2 = AbstractC3689v.r(obj3, obj2);
            }
        }
        if (!z10) {
            c7009h.f54923c[iL] = obj2;
            return;
        }
        int i10 = ~iL;
        c7009h.f54922b[i10] = obj;
        c7009h.f54923c[i10] = obj2;
    }

    public static String g(C7009H c7009h) {
        return "MutableScatterMultiMap(map=" + c7009h + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f21184a, obj);
    }

    public final /* synthetic */ C7009H h() {
        return this.f21184a;
    }

    public int hashCode() {
        return d(this.f21184a);
    }

    public String toString() {
        return g(this.f21184a);
    }
}
