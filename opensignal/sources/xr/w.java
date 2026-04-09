package xr;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
import rr.c1;
import rr.z0;

/* loaded from: classes.dex */
public abstract class w extends s implements hs.b, hs.c {
    @Override // hs.b
    public final e a(qs.c cVar) {
        br.l.e(cVar, "fqName");
        Member memberB = b();
        br.l.c(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return ba.m.w(declaredAnnotations, cVar);
        }
        return null;
    }

    public abstract Member b();

    public final qs.g c() {
        String name = b().getName();
        qs.g gVarE = name != null ? qs.g.e(name) : null;
        return gVarE == null ? qs.i.f21038a : gVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList d(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.w.d(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.ArrayList");
    }

    public final n.a e() {
        int modifiers = b().getModifiers();
        return Modifier.isPublic(modifiers) ? c1.f21680r : Modifier.isPrivate(modifiers) ? z0.f21726r : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? vr.c.f23951r : vr.b.f23950r : vr.a.f23949r;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && br.l.a(b(), ((w) obj).b());
    }

    @Override // hs.b
    public final Collection getAnnotations() {
        Member memberB = b();
        br.l.c(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        return declaredAnnotations != null ? ba.m.x(declaredAnnotations) : mq.w.f16945a;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
