package a7;

import Y6.g;
import Y6.h;
import Y6.i;
import Y6.j;
import Y6.k;
import Y6.r;
import Y6.v;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: a7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3770c {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f25735a = Collections.emptySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Type[] f25736b = new Type[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Class f25737c;

    /* renamed from: d, reason: collision with root package name */
    private static final Class f25738d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map f25739e;

    /* renamed from: a7.c$a */
    public static final class a implements GenericArrayType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f25740a;

        public a(Type type) {
            this.f25740a = AbstractC3770c.a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && v.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f25740a;
        }

        public int hashCode() {
            return this.f25740a.hashCode();
        }

        public String toString() {
            return AbstractC3770c.v(this.f25740a) + "[]";
        }
    }

    /* renamed from: a7.c$b */
    public static final class b implements ParameterizedType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f25741a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f25742b;

        /* renamed from: c, reason: collision with root package name */
        public final Type[] f25743c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || v.g(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f25741a = type == null ? null : AbstractC3770c.a(type);
            this.f25742b = AbstractC3770c.a(type2);
            this.f25743c = (Type[]) typeArr.clone();
            int i10 = 0;
            while (true) {
                Type[] typeArr2 = this.f25743c;
                if (i10 >= typeArr2.length) {
                    return;
                }
                typeArr2[i10].getClass();
                AbstractC3770c.b(this.f25743c[i10]);
                Type[] typeArr3 = this.f25743c;
                typeArr3[i10] = AbstractC3770c.a(typeArr3[i10]);
                i10++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && v.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f25743c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f25741a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f25742b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f25743c) ^ this.f25742b.hashCode()) ^ AbstractC3770c.g(this.f25741a);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((this.f25743c.length + 1) * 30);
            sb2.append(AbstractC3770c.v(this.f25742b));
            if (this.f25743c.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(AbstractC3770c.v(this.f25743c[0]));
            for (int i10 = 1; i10 < this.f25743c.length; i10++) {
                sb2.append(", ");
                sb2.append(AbstractC3770c.v(this.f25743c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* renamed from: a7.c$c, reason: collision with other inner class name */
    public static final class C0979c implements WildcardType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f25744a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f25745b;

        public C0979c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                AbstractC3770c.b(typeArr[0]);
                this.f25745b = null;
                this.f25744a = AbstractC3770c.a(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            AbstractC3770c.b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f25745b = AbstractC3770c.a(typeArr2[0]);
            this.f25744a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && v.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f25745b;
            return type != null ? new Type[]{type} : AbstractC3770c.f25736b;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f25744a};
        }

        public int hashCode() {
            Type type = this.f25745b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f25744a.hashCode() + 31);
        }

        public String toString() {
            if (this.f25745b != null) {
                return "? super " + AbstractC3770c.v(this.f25745b);
            }
            if (this.f25744a == Object.class) {
                return "?";
            }
            return "? extends " + AbstractC3770c.v(this.f25744a);
        }
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f25738d = cls;
        f25737c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f25739e = Collections.unmodifiableMap(linkedHashMap);
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof C0979c)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C0979c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    static Class c(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static h d(r rVar, Type type, Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        i iVar = (i) cls.getAnnotation(i.class);
        Class<?> cls2 = null;
        if (iVar == null || !iVar.generateAdapter()) {
            return null;
        }
        try {
            try {
                Class<?> cls3 = Class.forName(v.e(cls.getName()), true, cls.getClassLoader());
                try {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        try {
                            declaredConstructor = cls3.getDeclaredConstructor(r.class, Type[].class);
                            objArr = new Object[]{rVar, actualTypeArguments};
                        } catch (NoSuchMethodException unused) {
                            declaredConstructor = cls3.getDeclaredConstructor(Type[].class);
                            objArr = new Object[]{actualTypeArguments};
                        }
                    } else {
                        try {
                            objArr = new Object[]{rVar};
                            declaredConstructor = cls3.getDeclaredConstructor(r.class);
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = cls3.getDeclaredConstructor(null);
                            objArr = new Object[0];
                        }
                    }
                    declaredConstructor.setAccessible(true);
                    return ((h) declaredConstructor.newInstance(objArr)).g();
                } catch (NoSuchMethodException e10) {
                    e = e10;
                    cls2 = cls3;
                    if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                        throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                    }
                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                }
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e12);
            } catch (InstantiationException e13) {
                throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e13);
            } catch (InvocationTargetException e14) {
                throw t(e14);
            }
        } catch (NoSuchMethodException e15) {
            e = e15;
        }
    }

    public static Type e(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return e(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static boolean f(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    static int g(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    static int h(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean i(Class cls) {
        Class<? extends Annotation> cls2 = f25738d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static boolean j(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set k(AnnotatedElement annotatedElement) {
        return l(annotatedElement.getAnnotations());
    }

    public static Set l(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(j.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f25735a;
    }

    public static String m(String str, g gVar) {
        if (gVar == null) {
            return str;
        }
        String strName = gVar.name();
        return "\u0000".equals(strName) ? str : strName;
    }

    public static String n(String str, AnnotatedElement annotatedElement) {
        return m(str, (g) annotatedElement.getAnnotation(g.class));
    }

    public static JsonDataException o(String str, String str2, k kVar) {
        String path = kVar.getPath();
        return new JsonDataException(str2.equals(str) ? String.format("Required value '%s' missing at %s", str, path) : String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, path));
    }

    public static Type p(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    public static Type q(Type type, Class cls, Type type2) {
        return r(type, cls, type2, new LinkedHashSet());
    }

    private static Type r(Type type, Class cls, Type type2, Collection collection) {
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = s(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeR = r(type, cls, componentType, collection);
                return componentType == typeR ? cls2 : v.b(typeR);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeR2 = r(type, cls, genericComponentType, collection);
            return genericComponentType == typeR2 ? genericArrayType : v.b(typeR2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeR3 = r(type, cls, ownerType, collection);
            boolean z10 = typeR3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i10 = 0; i10 < length; i10++) {
                Type typeR4 = r(type, cls, actualTypeArguments[i10], collection);
                if (typeR4 != actualTypeArguments[i10]) {
                    if (!z10) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z10 = true;
                    }
                    actualTypeArguments[i10] = typeR4;
                }
            }
            return z10 ? new b(typeR3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z11 = type2 instanceof WildcardType;
        Type type3 = type2;
        if (z11) {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeR5 = r(type, cls, lowerBounds[0], collection);
                type3 = wildcardType;
                if (typeR5 != lowerBounds[0]) {
                    return v.l(typeR5);
                }
            } else {
                type3 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeR6 = r(type, cls, upperBounds[0], collection);
                    type3 = wildcardType;
                    if (typeR6 != upperBounds[0]) {
                        return v.k(typeR6);
                    }
                }
            }
        }
        return type3;
    }

    static Type s(Type type, Class cls, TypeVariable typeVariable) {
        Class clsC = c(typeVariable);
        if (clsC == null) {
            return typeVariable;
        }
        Type typeE = e(type, cls, clsC);
        if (!(typeE instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeE).getActualTypeArguments()[h(clsC.getTypeParameters(), typeVariable)];
    }

    public static RuntimeException t(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (targetException instanceof Error) {
            throw ((Error) targetException);
        }
        throw new RuntimeException(targetException);
    }

    public static String u(Type type, Set set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    static String v(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static JsonDataException w(String str, String str2, k kVar) {
        String path = kVar.getPath();
        return new JsonDataException(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", str, path) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, path));
    }
}
