package xr;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends s implements hs.b, hs.e {

    /* renamed from: a, reason: collision with root package name */
    public final Class f25509a;

    public o(Class cls) {
        br.l.e(cls, "klass");
        this.f25509a = cls;
    }

    @Override // hs.b
    public final e a(qs.c cVar) {
        Annotation[] declaredAnnotations;
        br.l.e(cVar, "fqName");
        Class cls = this.f25509a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ba.m.w(declaredAnnotations, cVar);
    }

    public final List b() {
        Field[] declaredFields = this.f25509a.getDeclaredFields();
        br.l.d(declaredFields, "klass.declaredFields");
        return st.l.d0(st.l.b0(new st.f(mq.l.Y(declaredFields), false, l.E), m.E));
    }

    public final qs.c c() {
        return d.a(this.f25509a).b();
    }

    public final List d() throws SecurityException {
        Method[] declaredMethods = this.f25509a.getDeclaredMethods();
        br.l.d(declaredMethods, "klass.declaredMethods");
        return st.l.d0(st.l.b0(new st.f(mq.l.Y(declaredMethods), true, new j1.a(22, this)), n.E));
    }

    public final ArrayList e() {
        Class cls = this.f25509a;
        br.l.e(cls, "clazz");
        js.e eVar = a.a.f4e;
        if (eVar == null) {
            try {
                eVar = new js.e(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 24);
            } catch (NoSuchMethodException unused) {
                eVar = new js.e(objArr, objArr, objArr, objArr, 24);
            }
            a.a.f4e = eVar;
        }
        Method method = (Method) eVar.f13797d;
        objArr = method != null ? (Object[]) method.invoke(cls, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new a0(obj));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return br.l.a(this.f25509a, ((o) obj).f25509a);
        }
        return false;
    }

    public final boolean f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.f25509a;
        br.l.e(cls, "clazz");
        js.e eVar = a.a.f4e;
        Boolean bool = null;
        if (eVar == null) {
            try {
                eVar = new js.e(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 24);
            } catch (NoSuchMethodException unused) {
                eVar = new js.e(bool, bool, bool, bool, 24);
            }
            a.a.f4e = eVar;
        }
        Method method = (Method) eVar.f13800x;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            br.l.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.f25509a;
        br.l.e(cls, "clazz");
        js.e eVar = a.a.f4e;
        Boolean bool = null;
        if (eVar == null) {
            try {
                eVar = new js.e(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 24);
            } catch (NoSuchMethodException unused) {
                eVar = new js.e(bool, bool, bool, bool, 24);
            }
            a.a.f4e = eVar;
        }
        Method method = (Method) eVar.f13798g;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            br.l.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // hs.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f25509a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? mq.w.f16945a : ba.m.x(declaredAnnotations);
    }

    @Override // hs.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f25509a.getTypeParameters();
        br.l.d(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f25509a.hashCode();
    }

    public final String toString() {
        return o.class.getName() + ": " + this.f25509a;
    }
}
