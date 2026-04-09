package com.google.common.reflect;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.a0;
import com.google.common.collect.v0;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* loaded from: classes2.dex */
public abstract class Types {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.common.base.d f12127a = com.google.common.base.d.e(", ").g("null");

    public enum ClassOwnership {
        OWNED_BY_ENCLOSING_CLASS { // from class: com.google.common.reflect.Types.ClassOwnership.1
            @Override // com.google.common.reflect.Types.ClassOwnership
            public Class h(Class cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER { // from class: com.google.common.reflect.Types.ClassOwnership.2
            @Override // com.google.common.reflect.Types.ClassOwnership
            public Class h(Class cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };


        /* renamed from: c, reason: collision with root package name */
        public static final ClassOwnership f12130c = g();

        public class a {
        }

        public class b extends a {
        }

        public static ClassOwnership g() {
            new b();
            ParameterizedType parameterizedType = (ParameterizedType) b.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.h(a.class) == parameterizedType2.getOwnerType()) {
                    return classOwnership;
                }
            }
            throw new AssertionError();
        }

        public abstract Class h(Class cls);

        /* synthetic */ ClassOwnership(h hVar) {
            this();
        }
    }

    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = JavaVersion.f12136e.k(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return com.google.common.base.f.a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return String.valueOf(Types.p(this.componentType)).concat("[]");
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.reflect.Types$JavaVersion, still in use, count: 1, list:
  (r0v0 com.google.common.reflect.Types$JavaVersion) from 0x0063: SPUT (r0v0 com.google.common.reflect.Types$JavaVersion) (LINE:100) com.google.common.reflect.Types.JavaVersion.e com.google.common.reflect.Types$JavaVersion
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static abstract class JavaVersion {
        JAVA6 { // from class: com.google.common.reflect.Types.JavaVersion.1
            @Override // com.google.common.reflect.Types.JavaVersion
            public Type k(Type type) {
                com.google.common.base.g.m(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public GenericArrayType h(Type type) {
                return new GenericArrayTypeImpl(type);
            }
        },
        JAVA7 { // from class: com.google.common.reflect.Types.JavaVersion.2
            @Override // com.google.common.reflect.Types.JavaVersion
            public Type h(Type type) {
                return type instanceof Class ? Types.g((Class) type) : new GenericArrayTypeImpl(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type k(Type type) {
                return (Type) com.google.common.base.g.m(type);
            }
        },
        JAVA8 { // from class: com.google.common.reflect.Types.JavaVersion.3
            @Override // com.google.common.reflect.Types.JavaVersion
            public Type h(Type type) {
                return JavaVersion.JAVA7.h(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public String i(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(e11);
                }
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type k(Type type) {
                return JavaVersion.JAVA7.k(type);
            }
        },
        JAVA9 { // from class: com.google.common.reflect.Types.JavaVersion.4
            @Override // com.google.common.reflect.Types.JavaVersion
            public boolean g() {
                return false;
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type h(Type type) {
                return JavaVersion.JAVA8.h(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public String i(Type type) {
                return JavaVersion.JAVA8.i(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type k(Type type) {
                return JavaVersion.JAVA8.k(type);
            }
        };


        /* renamed from: e, reason: collision with root package name */
        public static final JavaVersion f12136e;

        public class a extends com.google.common.reflect.c {
        }

        public class b extends com.google.common.reflect.c {
        }

        static {
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new a().d().toString().contains("java.util.Map.java.util.Map")) {
                    f12136e = javaVersion;
                    return;
                } else {
                    f12136e = javaVersion;
                    return;
                }
            }
            if (new b().d() instanceof Class) {
                f12136e = javaVersion;
            } else {
                f12136e = javaVersion;
            }
        }

        public JavaVersion() {
        }

        public static JavaVersion valueOf(String str) {
            return (JavaVersion) Enum.valueOf(JavaVersion.class, str);
        }

        public static JavaVersion[] values() {
            return (JavaVersion[]) f12137f.clone();
        }

        public boolean g() {
            return true;
        }

        public abstract Type h(Type type);

        public String i(Type type) {
            return Types.p(type);
        }

        public final ImmutableList j(Type[] typeArr) {
            ImmutableList.a aVarV = ImmutableList.v();
            for (Type type : typeArr) {
                aVarV.f(k(type));
            }
            return aVarV.g();
        }

        public abstract Type k(Type type);

        public /* synthetic */ JavaVersion(h hVar) {
            this(str, i);
        }
    }

    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> argumentsList;

        @CheckForNull
        private final Type ownerType;
        private final Class<?> rawType;

        public ParameterizedTypeImpl(Type type, Class cls, Type[] typeArr) {
            com.google.common.base.g.m(cls);
            com.google.common.base.g.d(typeArr.length == cls.getTypeParameters().length);
            Types.e(typeArr, "type parameter");
            this.ownerType = type;
            this.rawType = cls;
            this.argumentsList = JavaVersion.f12136e.j(typeArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return getRawType().equals(parameterizedType.getRawType()) && com.google.common.base.f.a(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return Types.o(this.argumentsList);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            Type type = this.ownerType;
            return ((type == null ? 0 : type.hashCode()) ^ this.argumentsList.hashCode()) ^ this.rawType.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.ownerType != null) {
                JavaVersion javaVersion = JavaVersion.f12136e;
                if (javaVersion.g()) {
                    sb.append(javaVersion.i(this.ownerType));
                    sb.append('.');
                }
            }
            sb.append(this.rawType.getName());
            sb.append('<');
            com.google.common.base.d dVar = Types.f12127a;
            ImmutableList<Type> immutableList = this.argumentsList;
            final JavaVersion javaVersion2 = JavaVersion.f12136e;
            Objects.requireNonNull(javaVersion2);
            sb.append(dVar.c(a0.h(immutableList, new com.google.common.base.c() { // from class: com.google.common.reflect.i
                @Override // com.google.common.base.c
                public final Object apply(Object obj) {
                    return javaVersion2.i((Type) obj);
                }
            })));
            sb.append('>');
            return sb.toString();
        }
    }

    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> lowerBounds;
        private final ImmutableList<Type> upperBounds;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Types.e(typeArr, "lower bound for wildcard");
            Types.e(typeArr2, "upper bound for wildcard");
            JavaVersion javaVersion = JavaVersion.f12136e;
            this.lowerBounds = javaVersion.j(typeArr);
            this.upperBounds = javaVersion.j(typeArr2);
        }

        public boolean equals(Object obj) {
            if (obj instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) obj;
                if (this.lowerBounds.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.upperBounds.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return Types.o(this.lowerBounds);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return Types.o(this.upperBounds);
        }

        public int hashCode() {
            return this.lowerBounds.hashCode() ^ this.upperBounds.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            v0 it = this.lowerBounds.iterator();
            while (it.hasNext()) {
                Type type = (Type) it.next();
                sb.append(" super ");
                sb.append(JavaVersion.f12136e.i(type));
            }
            for (Type type2 : Types.f(this.upperBounds)) {
                sb.append(" extends ");
                sb.append(JavaVersion.f12136e.i(type2));
            }
            return sb.toString();
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f12138a = !a.class.getTypeParameters()[0].equals(Types.i(a.class, "X", new Type[0]));
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final GenericDeclaration f12139a;

        /* renamed from: b, reason: collision with root package name */
        public final String f12140b;

        /* renamed from: c, reason: collision with root package name */
        public final ImmutableList f12141c;

        public b(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
            Types.e(typeArr, "bound for type variable");
            this.f12139a = (GenericDeclaration) com.google.common.base.g.m(genericDeclaration);
            this.f12140b = (String) com.google.common.base.g.m(str);
            this.f12141c = ImmutableList.x(typeArr);
        }

        public GenericDeclaration a() {
            return this.f12139a;
        }

        public String b() {
            return this.f12140b;
        }

        public boolean equals(Object obj) {
            if (!a.f12138a) {
                if (obj instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) obj;
                    if (this.f12140b.equals(typeVariable.getName()) && this.f12139a.equals(typeVariable.getGenericDeclaration())) {
                        return true;
                    }
                }
                return false;
            }
            if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof c)) {
                b bVar = ((c) Proxy.getInvocationHandler(obj)).f12143a;
                if (this.f12140b.equals(bVar.b()) && this.f12139a.equals(bVar.a()) && this.f12141c.equals(bVar.f12141c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f12139a.hashCode() ^ this.f12140b.hashCode();
        }

        public String toString() {
            return this.f12140b;
        }
    }

    public static final class c implements InvocationHandler {

        /* renamed from: b, reason: collision with root package name */
        public static final ImmutableMap f12142b;

        /* renamed from: a, reason: collision with root package name */
        public final b f12143a;

        static {
            ImmutableMap.a aVarD = ImmutableMap.d();
            for (Method method : b.class.getMethods()) {
                if (method.getDeclaringClass().equals(b.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    aVarD.g(method.getName(), method);
                }
            }
            f12142b = aVarD.c();
        }

        public c(b bVar) {
            this.f12143a = bVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = (Method) f12142b.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f12143a, objArr);
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        }
    }

    public static void e(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                com.google.common.base.g.j(!r2.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }

    public static Iterable f(Iterable iterable) {
        return a0.c(iterable, Predicates.c(Predicates.a(Object.class)));
    }

    public static Class g(Class cls) {
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static Type h(Type type) {
        if (!(type instanceof WildcardType)) {
            return JavaVersion.f12136e.h(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        com.google.common.base.g.e(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return n(h(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        com.google.common.base.g.e(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return m(h(upperBounds[0]));
    }

    public static TypeVariable i(GenericDeclaration genericDeclaration, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return l(genericDeclaration, str, typeArr);
    }

    public static ParameterizedType j(Class cls, Type... typeArr) {
        return new ParameterizedTypeImpl(ClassOwnership.f12130c.h(cls), cls, typeArr);
    }

    public static ParameterizedType k(Type type, Class cls, Type... typeArr) {
        if (type == null) {
            return j(cls, typeArr);
        }
        com.google.common.base.g.m(typeArr);
        com.google.common.base.g.i(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }

    public static TypeVariable l(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
        return (TypeVariable) com.google.common.reflect.b.a(TypeVariable.class, new c(new b(genericDeclaration, str, typeArr)));
    }

    public static WildcardType m(Type type) {
        return new WildcardTypeImpl(new Type[0], new Type[]{type});
    }

    public static WildcardType n(Type type) {
        return new WildcardTypeImpl(new Type[]{type}, new Type[]{Object.class});
    }

    public static Type[] o(Collection collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    public static String p(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
