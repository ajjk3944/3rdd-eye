package br;

import com.google.android.gms.internal.measurement.e5;
import ir.f0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements ir.d, e {

    /* renamed from: d, reason: collision with root package name */
    public static final Map f2909d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f2910a;

    static {
        List listI = e5.I(ar.a.class, ar.k.class, ar.n.class, ar.o.class, ar.p.class, ar.q.class, ar.r.class, ar.s.class, ar.t.class, ar.u.class, ar.b.class, ar.c.class, lr.e.class, ar.d.class, ar.e.class, ar.f.class, ar.g.class, ar.h.class, ar.i.class, ar.j.class, ar.l.class, ar.m.class, lr.e.class);
        ArrayList arrayList = new ArrayList(mq.p.a0(listI, 10));
        int i10 = 0;
        for (Object obj : listI) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                e5.Q();
                throw null;
            }
            arrayList.add(new lq.l((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f2909d = mq.b0.V(arrayList);
    }

    public f(Class cls) {
        l.e(cls, "jClass");
        this.f2910a = cls;
    }

    public static void c() {
        throw new zq.a();
    }

    @Override // br.e
    public final Class a() {
        return this.f2910a;
    }

    @Override // ir.b
    public final List e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && f0.E(this).equals(f0.E((ir.d) obj));
    }

    @Override // ir.d
    public final int hashCode() {
        return f0.E(this).hashCode();
    }

    @Override // ir.d
    public final boolean k() {
        c();
        throw null;
    }

    @Override // ir.d
    public final boolean m() {
        c();
        throw null;
    }

    @Override // ir.d
    public final String n() {
        String strF;
        Class cls = this.f2910a;
        l.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strF2 = l.f(cls.getName());
            return strF2 == null ? cls.getCanonicalName() : strF2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strF = l.f(componentType.getName())) != null) {
            strConcat = strF.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // ir.d
    public final String p() {
        String strJ;
        Class cls = this.f2910a;
        l.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strJ2 = l.j(cls.getName());
                return strJ2 == null ? cls.getSimpleName() : strJ2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strJ = l.j(componentType.getName())) != null) {
                strConcat = strJ.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return tt.l.S0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return tt.l.R0('$', simpleName, simpleName);
        }
        return tt.l.S0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // ir.d
    public final Object q() {
        c();
        throw null;
    }

    public final String toString() {
        return this.f2910a.toString() + " (Kotlin reflection is not available)";
    }

    @Override // ir.d
    public final boolean v() {
        c();
        throw null;
    }

    @Override // ir.d
    public final boolean x(Object obj) {
        Class clsE = this.f2910a;
        l.e(clsE, "jClass");
        Map map = f2909d;
        l.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(clsE);
        if (num != null) {
            return b0.d(num.intValue(), obj);
        }
        if (clsE.isPrimitive()) {
            clsE = f0.E(f0.H(clsE));
        }
        return clsE.isInstance(obj);
    }

    @Override // ir.d
    public final boolean y() {
        c();
        throw null;
    }
}
