package xr;

import ir.f0;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends s {

    /* renamed from: a, reason: collision with root package name */
    public final Annotation f25501a;

    public e(Annotation annotation) {
        br.l.e(annotation, "annotation");
        this.f25501a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Annotation annotation = this.f25501a;
        Method[] declaredMethods = f0.D(f0.z(annotation)).getDeclaredMethods();
        br.l.d(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            br.l.d(objInvoke, "method.invoke(annotation)");
            qs.g gVarE = qs.g.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = d.f25493a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new t(gVarE, (Enum) objInvoke) : objInvoke instanceof Annotation ? new g(gVarE, (Annotation) objInvoke) : objInvoke instanceof Object[] ? new h(gVarE, (Object[]) objInvoke) : objInvoke instanceof Class ? new p(gVarE, (Class) objInvoke) : new v(gVarE, objInvoke));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f25501a == ((e) obj).f25501a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f25501a);
    }

    public final String toString() {
        return e.class.getName() + ": " + this.f25501a;
    }
}
