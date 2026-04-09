package Vi;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zi.A0;
import Zi.O0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import lh.AbstractC6596a;

/* loaded from: classes4.dex */
abstract /* synthetic */ class x {
    private static final b a(cj.e eVar, GenericArrayType genericArrayType, boolean z10) {
        b bVarF;
        th.d dVarE;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            AbstractC6492s.h(upperBounds, "getUpperBounds(...)");
            genericComponentType = (Type) AbstractC3682n.Z(upperBounds);
        }
        AbstractC6492s.f(genericComponentType);
        if (z10) {
            bVarF = w.b(eVar, genericComponentType);
        } else {
            bVarF = w.f(eVar, genericComponentType);
            if (bVarF == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            AbstractC6492s.g(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            dVarE = AbstractC6596a.e((Class) rawType);
        } else {
            if (!(genericComponentType instanceof th.d)) {
                throw new IllegalStateException("unsupported type in GenericArray: " + O.b(genericComponentType.getClass()));
            }
            dVarE = (th.d) genericComponentType;
        }
        AbstractC6492s.g(dVarE, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        b bVarA = Wi.a.a(dVarE, bVarF);
        AbstractC6492s.g(bVarA, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return bVarA;
    }

    private static final Class b(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            AbstractC6492s.h(rawType, "getRawType(...)");
            return b(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            AbstractC6492s.h(upperBounds, "getUpperBounds(...)");
            Object objZ = AbstractC3682n.Z(upperBounds);
            AbstractC6492s.h(objZ, "first(...)");
            return b((Type) objZ);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            AbstractC6492s.h(genericComponentType, "getGenericComponentType(...)");
            return b(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + O.b(type.getClass()));
    }

    private static final b c(cj.e eVar, Class cls, List list) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b[] bVarArr = (b[]) list.toArray(new b[0]);
        b bVarC = A0.c(cls, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (bVarC != null) {
            return bVarC;
        }
        th.d dVarE = AbstractC6596a.e(cls);
        b bVarB = O0.b(dVarE);
        if (bVarB != null) {
            return bVarB;
        }
        b bVarB2 = eVar.b(dVarE, list);
        if (bVarB2 != null) {
            return bVarB2;
        }
        if (cls.isInterface()) {
            return new f(AbstractC6596a.e(cls));
        }
        return null;
    }

    public static final b d(cj.e eVar, Type type) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(type, "type");
        b bVarE = e(eVar, type, true);
        if (bVarE != null) {
            return bVarE;
        }
        A0.q(b(type));
        throw new KotlinNothingValueException();
    }

    private static final b e(cj.e eVar, Type type, boolean z10) {
        ArrayList<b> arrayList;
        if (type instanceof GenericArrayType) {
            return a(eVar, (GenericArrayType) type, z10);
        }
        if (type instanceof Class) {
            return h(eVar, (Class) type, z10);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                AbstractC6492s.h(upperBounds, "getUpperBounds(...)");
                Object objZ = AbstractC3682n.Z(upperBounds);
                AbstractC6492s.h(objZ, "first(...)");
                return f(eVar, (Type) objZ, false, 2, null);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + O.b(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        AbstractC6492s.g(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls = (Class) rawType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC6492s.f(actualTypeArguments);
        if (z10) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                AbstractC6492s.f(type2);
                arrayList.add(w.b(eVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                AbstractC6492s.f(type3);
                b bVarF = w.f(eVar, type3);
                if (bVarF == null) {
                    return null;
                }
                arrayList.add(bVarF);
            }
        }
        if (Set.class.isAssignableFrom(cls)) {
            b bVarN = Wi.a.n((b) arrayList.get(0));
            AbstractC6492s.g(bVarN, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return bVarN;
        }
        if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
            b bVarH = Wi.a.h((b) arrayList.get(0));
            AbstractC6492s.g(bVarH, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return bVarH;
        }
        if (Map.class.isAssignableFrom(cls)) {
            b bVarK = Wi.a.k((b) arrayList.get(0), (b) arrayList.get(1));
            AbstractC6492s.g(bVarK, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return bVarK;
        }
        if (Map.Entry.class.isAssignableFrom(cls)) {
            b bVarJ = Wi.a.j((b) arrayList.get(0), (b) arrayList.get(1));
            AbstractC6492s.g(bVarJ, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return bVarJ;
        }
        if (Yg.s.class.isAssignableFrom(cls)) {
            b bVarM = Wi.a.m((b) arrayList.get(0), (b) arrayList.get(1));
            AbstractC6492s.g(bVarM, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return bVarM;
        }
        if (Yg.y.class.isAssignableFrom(cls)) {
            b bVarP = Wi.a.p((b) arrayList.get(0), (b) arrayList.get(1), (b) arrayList.get(2));
            AbstractC6492s.g(bVarP, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return bVarP;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(arrayList, 10));
        for (b bVar : arrayList) {
            AbstractC6492s.g(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(bVar);
        }
        return c(eVar, cls, arrayList2);
    }

    static /* synthetic */ b f(cj.e eVar, Type type, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return e(eVar, type, z10);
    }

    public static final b g(cj.e eVar, Type type) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(type, "type");
        return e(eVar, type, false);
    }

    private static final b h(cj.e eVar, Class cls, boolean z10) {
        b bVarF;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            AbstractC6492s.g(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return c(eVar, cls, AbstractC3689v.l());
        }
        Class<?> componentType = cls.getComponentType();
        AbstractC6492s.h(componentType, "getComponentType(...)");
        if (z10) {
            bVarF = w.b(eVar, componentType);
        } else {
            bVarF = w.f(eVar, componentType);
            if (bVarF == null) {
                return null;
            }
        }
        th.d dVarE = AbstractC6596a.e(componentType);
        AbstractC6492s.g(dVarE, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        b bVarA = Wi.a.a(dVarE, bVarF);
        AbstractC6492s.g(bVarA, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return bVarA;
    }
}
