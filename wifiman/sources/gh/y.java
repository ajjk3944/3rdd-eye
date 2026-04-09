package Gh;

import Bh.v0;
import Bh.w0;
import Qh.InterfaceC3444a;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class y extends u implements j, A, Qh.q {
    @Override // Gh.A
    public int D() {
        return S().getModifiers();
    }

    @Override // Qh.s
    public boolean Q() {
        return Modifier.isStatic(D());
    }

    @Override // Qh.q
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public q P() {
        Class<?> declaringClass = S().getDeclaringClass();
        AbstractC6492s.h(declaringClass, "getDeclaringClass(...)");
        return new q(declaringClass);
    }

    public abstract Member S();

    protected final List T(Type[] parameterTypes, Annotation[][] parameterAnnotations, boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        AbstractC6492s.i(parameterTypes, "parameterTypes");
        AbstractC6492s.i(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List listB = C2911c.f7467a.b(S());
        int size = listB != null ? listB.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        int i10 = 0;
        while (i10 < length) {
            E eA = E.f7448a.a(parameterTypes[i10]);
            if (listB != null) {
                str = (String) AbstractC3689v.t0(listB, i10 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + getName() + " type=" + eA + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new G(eA, parameterAnnotations[i10], str, z10 && i10 == AbstractC3682n.g0(parameterTypes)));
            i10++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && AbstractC6492s.d(S(), ((y) obj).S());
    }

    @Override // Qh.InterfaceC3447d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // Qh.t
    public Zh.f getName() {
        Zh.f fVarH;
        String name = S().getName();
        return (name == null || (fVarH = Zh.f.h(name)) == null) ? Zh.h.f25422b : fVarH;
    }

    @Override // Qh.s
    public w0 getVisibility() {
        int iD = D();
        return Modifier.isPublic(iD) ? v0.h.f1820c : Modifier.isPrivate(iD) ? v0.e.f1817c : Modifier.isProtected(iD) ? Modifier.isStatic(iD) ? Eh.c.f4760c : Eh.b.f4759c : Eh.a.f4758c;
    }

    @Override // Qh.InterfaceC3447d
    public boolean h() {
        return false;
    }

    public int hashCode() {
        return S().hashCode();
    }

    @Override // Qh.s
    public boolean isAbstract() {
        return Modifier.isAbstract(D());
    }

    @Override // Qh.s
    public boolean isFinal() {
        return Modifier.isFinal(D());
    }

    @Override // Qh.InterfaceC3447d
    public /* bridge */ /* synthetic */ InterfaceC3444a l(Zh.c cVar) {
        return l(cVar);
    }

    public String toString() {
        return getClass().getName() + ": " + S();
    }

    @Override // Gh.j
    public AnnotatedElement v() {
        Member memberS = S();
        AbstractC6492s.g(memberS, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) memberS;
    }

    @Override // Gh.j, Qh.InterfaceC3447d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listB;
        AnnotatedElement annotatedElementV = v();
        return (annotatedElementV == null || (declaredAnnotations = annotatedElementV.getDeclaredAnnotations()) == null || (listB = k.b(declaredAnnotations)) == null) ? AbstractC3689v.l() : listB;
    }

    @Override // Gh.j, Qh.InterfaceC3447d
    public C2915g l(Zh.c fqName) {
        Annotation[] declaredAnnotations;
        AbstractC6492s.i(fqName, "fqName");
        AnnotatedElement annotatedElementV = v();
        if (annotatedElementV == null || (declaredAnnotations = annotatedElementV.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, fqName);
    }
}
