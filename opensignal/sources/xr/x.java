package xr;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class x extends w implements hs.e {

    /* renamed from: a, reason: collision with root package name */
    public final Method f25517a;

    public x(Method method) {
        br.l.e(method, "member");
        this.f25517a = method;
    }

    @Override // xr.w
    public final Member b() {
        return this.f25517a;
    }

    public final b0 f() {
        Type genericReturnType = this.f25517a.getGenericReturnType();
        br.l.d(genericReturnType, "member.genericReturnType");
        boolean z10 = genericReturnType instanceof Class;
        if (z10) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new z(cls);
            }
        }
        return ((genericReturnType instanceof GenericArrayType) || (z10 && ((Class) genericReturnType).isArray())) ? new i(genericReturnType) : genericReturnType instanceof WildcardType ? new e0((WildcardType) genericReturnType) : new q(genericReturnType);
    }

    public final List g() {
        Method method = this.f25517a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        br.l.d(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        br.l.d(parameterAnnotations, "member.parameterAnnotations");
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // hs.e
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f25517a.getTypeParameters();
        br.l.d(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }
}
