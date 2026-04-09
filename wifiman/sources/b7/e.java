package b7;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f32968a = new Type[0];

    private static final class a implements GenericArrayType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f32969a;

        public a(Type type) {
            this.f32969a = e.a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && e.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f32969a;
        }

        public int hashCode() {
            return this.f32969a.hashCode();
        }

        public String toString() {
            return e.f(this.f32969a) + "[]";
        }
    }

    private static final class b implements ParameterizedType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f32970a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f32971b;

        /* renamed from: c, reason: collision with root package name */
        final Type[] f32972c;

        b(Type type, Type type2, Type... typeArr) {
            int i10 = 0;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z10 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z10) {
                    throw new IllegalArgumentException();
                }
            }
            this.f32970a = type == null ? null : e.a(type);
            this.f32971b = e.a(type2);
            this.f32972c = (Type[]) typeArr.clone();
            while (true) {
                Type[] typeArr2 = this.f32972c;
                if (i10 >= typeArr2.length) {
                    return;
                }
                typeArr2[i10].getClass();
                e.b(this.f32972c[i10]);
                Type[] typeArr3 = this.f32972c;
                typeArr3[i10] = e.a(typeArr3[i10]);
                i10++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && e.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f32972c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f32970a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f32971b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f32972c) ^ this.f32971b.hashCode()) ^ e.e(this.f32970a);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((this.f32972c.length + 1) * 30);
            sb2.append(e.f(this.f32971b));
            if (this.f32972c.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(e.f(this.f32972c[0]));
            for (int i10 = 1; i10 < this.f32972c.length; i10++) {
                sb2.append(", ");
                sb2.append(e.f(this.f32972c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    private static final class c implements WildcardType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f32973a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f32974b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                e.b(typeArr[0]);
                this.f32974b = null;
                this.f32973a = e.a(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            e.b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f32974b = e.a(typeArr2[0]);
            this.f32973a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && e.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f32974b;
            return type != null ? new Type[]{type} : e.f32968a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f32973a};
        }

        public int hashCode() {
            Type type = this.f32974b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f32973a.hashCode() + 31);
        }

        public String toString() {
            if (this.f32974b != null) {
                return "? super " + e.f(this.f32974b);
            }
            if (this.f32973a == Object.class) {
                return "?";
            }
            return "? extends " + e.f(this.f32973a);
        }
    }

    static Type a(Type type) {
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
        if (!(type instanceof WildcardType) || (type instanceof c)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    static boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static boolean d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return c(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof b ? ((b) parameterizedType).f32972c : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof b ? ((b) parameterizedType2).f32972c : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    static int e(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    static String f(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
