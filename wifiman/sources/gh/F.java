package Gh;

import Qh.InterfaceC3444a;
import Zg.AbstractC3689v;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class F extends u implements j, Qh.y {

    /* renamed from: a, reason: collision with root package name */
    private final TypeVariable f7449a;

    public F(TypeVariable typeVariable) {
        AbstractC6492s.i(typeVariable, "typeVariable");
        this.f7449a = typeVariable;
    }

    @Override // Qh.y
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public List getUpperBounds() {
        Type[] bounds = this.f7449a.getBounds();
        AbstractC6492s.h(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new s(type));
        }
        s sVar = (s) AbstractC3689v.T0(arrayList);
        return AbstractC6492s.d(sVar != null ? sVar.R() : null, Object.class) ? AbstractC3689v.l() : arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof F) && AbstractC6492s.d(this.f7449a, ((F) obj).f7449a);
    }

    @Override // Qh.InterfaceC3447d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // Qh.t
    public Zh.f getName() {
        Zh.f fVarH = Zh.f.h(this.f7449a.getName());
        AbstractC6492s.h(fVarH, "identifier(...)");
        return fVarH;
    }

    @Override // Qh.InterfaceC3447d
    public boolean h() {
        return false;
    }

    public int hashCode() {
        return this.f7449a.hashCode();
    }

    @Override // Qh.InterfaceC3447d
    public /* bridge */ /* synthetic */ InterfaceC3444a l(Zh.c cVar) {
        return l(cVar);
    }

    public String toString() {
        return F.class.getName() + ": " + this.f7449a;
    }

    @Override // Gh.j
    public AnnotatedElement v() {
        TypeVariable typeVariable = this.f7449a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
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
