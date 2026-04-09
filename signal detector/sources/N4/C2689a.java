package n4;

import i4.i;
import j$.util.Objects;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2689a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class f22327a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f22328b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22329c;

    public C2689a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == C2689a.class) {
                Type typeA = i.a(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    a(typeA);
                }
                this.f22328b = typeA;
                this.f22327a = i.g(typeA);
                this.f22329c = typeA.hashCode();
                return;
            }
        } else if (genericSuperclass == C2689a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static void a(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            a(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                a(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                a(actualTypeArguments[i]);
                i++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            a(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            a(upperBounds[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2689a) {
            return i.d(this.f22328b, ((C2689a) obj).f22328b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22329c;
    }

    public final String toString() {
        return i.k(this.f22328b);
    }

    public C2689a(Type type) {
        Objects.requireNonNull(type);
        Type typeA = i.a(type);
        this.f22328b = typeA;
        this.f22327a = i.g(typeA);
        this.f22329c = typeA.hashCode();
    }
}
