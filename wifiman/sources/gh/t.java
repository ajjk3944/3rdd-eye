package Gh;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class t extends y implements Qh.k {

    /* renamed from: a, reason: collision with root package name */
    private final Constructor f7498a;

    public t(Constructor member) {
        AbstractC6492s.i(member, "member");
        this.f7498a = member;
    }

    @Override // Gh.y
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public Constructor S() {
        return this.f7498a;
    }

    @Override // Qh.z
    public List getTypeParameters() {
        TypeVariable[] typeParameters = S().getTypeParameters();
        AbstractC6492s.h(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new F(typeVariable));
        }
        return arrayList;
    }

    @Override // Qh.k
    public List i() {
        Type[] genericParameterTypes = S().getGenericParameterTypes();
        AbstractC6492s.f(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return AbstractC3689v.l();
        }
        Class declaringClass = S().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) AbstractC3682n.s(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = S().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + S());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            AbstractC6492s.f(parameterAnnotations);
            parameterAnnotations = (Annotation[][]) AbstractC3682n.s(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        AbstractC6492s.f(genericParameterTypes);
        AbstractC6492s.f(parameterAnnotations);
        return T(genericParameterTypes, parameterAnnotations, S().isVarArgs());
    }
}
