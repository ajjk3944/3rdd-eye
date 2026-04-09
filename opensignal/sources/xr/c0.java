package xr;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* loaded from: classes.dex */
public final class c0 extends s implements hs.b {

    /* renamed from: a, reason: collision with root package name */
    public final TypeVariable f25492a;

    public c0(TypeVariable typeVariable) {
        br.l.e(typeVariable, "typeVariable");
        this.f25492a = typeVariable;
    }

    @Override // hs.b
    public final e a(qs.c cVar) {
        Annotation[] declaredAnnotations;
        br.l.e(cVar, "fqName");
        TypeVariable typeVariable = this.f25492a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ba.m.w(declaredAnnotations, cVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return br.l.a(this.f25492a, ((c0) obj).f25492a);
        }
        return false;
    }

    @Override // hs.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f25492a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? mq.w.f16945a : ba.m.x(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f25492a.hashCode();
    }

    public final String toString() {
        return c0.class.getName() + ": " + this.f25492a;
    }
}
