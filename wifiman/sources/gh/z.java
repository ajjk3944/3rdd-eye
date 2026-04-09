package Gh;

import Gh.E;
import Qh.InterfaceC3445b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class z extends y implements Qh.r {

    /* renamed from: a, reason: collision with root package name */
    private final Method f7502a;

    public z(Method member) {
        AbstractC6492s.i(member, "member");
        this.f7502a = member;
    }

    @Override // Qh.r
    public boolean L() {
        return o() != null;
    }

    @Override // Gh.y
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public Method S() {
        return this.f7502a;
    }

    @Override // Qh.r
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public E getReturnType() {
        E.a aVar = E.f7448a;
        Type genericReturnType = S().getGenericReturnType();
        AbstractC6492s.h(genericReturnType, "getGenericReturnType(...)");
        return aVar.a(genericReturnType);
    }

    @Override // Qh.z
    public List getTypeParameters() {
        TypeVariable<Method>[] typeParameters = S().getTypeParameters();
        AbstractC6492s.h(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new F(typeVariable));
        }
        return arrayList;
    }

    @Override // Qh.r
    public List i() {
        Type[] genericParameterTypes = S().getGenericParameterTypes();
        AbstractC6492s.h(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = S().getParameterAnnotations();
        AbstractC6492s.h(parameterAnnotations, "getParameterAnnotations(...)");
        return T(genericParameterTypes, parameterAnnotations, S().isVarArgs());
    }

    @Override // Qh.r
    public InterfaceC3445b o() {
        Object defaultValue = S().getDefaultValue();
        if (defaultValue != null) {
            return AbstractC2916h.f7478b.a(defaultValue, null);
        }
        return null;
    }
}
