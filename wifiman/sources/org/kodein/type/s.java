package org.kodein.type;

import Yg.z;
import Zg.U;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import lh.AbstractC6596a;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f56970a = U.k(z.a(Boolean.TYPE, Boolean.class), z.a(Byte.TYPE, Byte.class), z.a(Character.TYPE, Character.class), z.a(Short.TYPE, Short.class), z.a(Integer.TYPE, Integer.class), z.a(Long.TYPE, Long.class), z.a(Float.TYPE, Float.class), z.a(Double.TYPE, Double.class));

    public static final q a(Class jCls) {
        AbstractC6492s.i(jCls, "jCls");
        return new f(jCls);
    }

    public static final q b(th.d cls) {
        AbstractC6492s.i(cls, "cls");
        return new f(AbstractC6596a.c(cls));
    }

    public static final q c(Object obj) {
        AbstractC6492s.i(obj, "obj");
        return new f(obj.getClass());
    }

    private static final boolean d(Type type) {
        if (type instanceof Class) {
            return true;
        }
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            AbstractC6492s.h(actualTypeArguments, "actualTypeArguments");
            for (Type it : actualTypeArguments) {
                AbstractC6492s.h(it, "it");
                if (d(it)) {
                }
            }
            return true;
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            AbstractC6492s.h(genericComponentType, "genericComponentType");
            return d(genericComponentType);
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            AbstractC6492s.h(lowerBounds, "lowerBounds");
            int length = lowerBounds.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    AbstractC6492s.h(upperBounds, "upperBounds");
                    for (Type it2 : upperBounds) {
                        AbstractC6492s.h(it2, "it");
                        if (d(it2)) {
                        }
                    }
                    return true;
                }
                Type it3 = lowerBounds[i10];
                AbstractC6492s.h(it3, "it");
                if (!d(it3)) {
                    break;
                }
                i10++;
            }
        } else if (!(type instanceof TypeVariable)) {
            throw new IllegalArgumentException("Unknown type " + type);
        }
        return false;
    }

    public static final i e(Type type) {
        i fVar;
        AbstractC6492s.i(type, "type");
        Type typeH = j.h(type);
        if (typeH instanceof Class) {
            return new f((Class) typeH);
        }
        if (typeH instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) typeH;
            if (!d(parameterizedType)) {
                throw new IllegalArgumentException(("Cannot create TypeToken for non fully reified type " + typeH).toString());
            }
            fVar = new h(parameterizedType);
        } else {
            if (!(typeH instanceof GenericArrayType)) {
                if (typeH instanceof WildcardType) {
                    Type type2 = ((WildcardType) typeH).getUpperBounds()[0];
                    AbstractC6492s.h(type2, "k.upperBounds[0]");
                    return e(type2);
                }
                if (typeH instanceof TypeVariable) {
                    return e(j.d((TypeVariable) typeH));
                }
                throw new UnsupportedOperationException("Unsupported type " + typeH.getClass().getName() + ": " + typeH);
            }
            GenericArrayType genericArrayType = (GenericArrayType) typeH;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            AbstractC6492s.h(genericComponentType, "k.genericComponentType");
            i iVarE = e(genericComponentType);
            Type typeE = j.e(iVarE.c());
            AbstractC6492s.g(typeE, "null cannot be cast to non-null type java.lang.Class<*>");
            Class cls = (Class) typeE;
            if (cls.isPrimitive() || !iVarE.a()) {
                fVar = new f(j.g(cls));
            } else {
                if (!iVarE.a() || !iVarE.f()) {
                    return new g(genericArrayType);
                }
                Type typeE2 = j.e(iVarE.c());
                AbstractC6492s.g(typeE2, "null cannot be cast to non-null type java.lang.Class<*>");
                fVar = new f(j.g((Class) typeE2));
            }
        }
        return fVar;
    }
}
