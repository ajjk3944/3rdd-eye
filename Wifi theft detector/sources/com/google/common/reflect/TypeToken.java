package com.google.common.reflect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.j0;
import com.google.common.collect.p;
import com.google.common.collect.x;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class TypeToken<T> extends c implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    /* renamed from: a, reason: collision with root package name */
    public transient e f12116a;

    /* renamed from: b, reason: collision with root package name */
    public transient e f12117b;
    private final Type runtimeType;

    public static final class SimpleTypeToken<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;

        public SimpleTypeToken(Type type) {
            super(type, null);
        }
    }

    public enum TypeFilter implements com.google.common.base.h {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
            @Override // com.google.common.base.h
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public boolean apply(TypeToken typeToken) {
                return ((typeToken.runtimeType instanceof TypeVariable) || (typeToken.runtimeType instanceof WildcardType)) ? false : true;
            }
        },
        INTERFACE_ONLY { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
            @Override // com.google.common.base.h
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public boolean apply(TypeToken typeToken) {
                return typeToken.k().isInterface();
            }
        };

        /* synthetic */ TypeFilter(f fVar) {
            this();
        }
    }

    public class TypeSet extends x implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public transient ImmutableSet f12121a;
        final /* synthetic */ TypeToken this$0;

        @Override // com.google.common.collect.q
        public Set x() {
            ImmutableSet immutableSet = this.f12121a;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet immutableSetE = p.c(b.f12123a.c(this.this$0)).b(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).e();
            this.f12121a = immutableSetE;
            return immutableSetE;
        }
    }

    public class a extends g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImmutableSet.a f12122b;

        public a(TypeToken typeToken, ImmutableSet.a aVar) {
            this.f12122b = aVar;
        }

        @Override // com.google.common.reflect.g
        public void b(Class cls) {
            this.f12122b.f(cls);
        }

        @Override // com.google.common.reflect.g
        public void c(GenericArrayType genericArrayType) {
            this.f12122b.f(Types.g(TypeToken.m(genericArrayType.getGenericComponentType()).k()));
        }

        @Override // com.google.common.reflect.g
        public void d(ParameterizedType parameterizedType) {
            this.f12122b.f((Class) parameterizedType.getRawType());
        }

        @Override // com.google.common.reflect.g
        public void e(TypeVariable typeVariable) {
            a(typeVariable.getBounds());
        }

        @Override // com.google.common.reflect.g
        public void f(WildcardType wildcardType) {
            a(wildcardType.getUpperBounds());
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f12123a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final b f12124b = new C0221b();

        public class a extends b {
            public a() {
                super(null);
            }

            @Override // com.google.common.reflect.TypeToken.b
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public Iterable d(TypeToken typeToken) {
                return typeToken.i();
            }

            @Override // com.google.common.reflect.TypeToken.b
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public Class e(TypeToken typeToken) {
                return typeToken.k();
            }

            @Override // com.google.common.reflect.TypeToken.b
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public TypeToken f(TypeToken typeToken) {
                return typeToken.j();
            }
        }

        /* renamed from: com.google.common.reflect.TypeToken$b$b, reason: collision with other inner class name */
        public class C0221b extends b {
            public C0221b() {
                super(null);
            }

            @Override // com.google.common.reflect.TypeToken.b
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public Iterable d(Class cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            @Override // com.google.common.reflect.TypeToken.b
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public Class e(Class cls) {
                return cls;
            }

            @Override // com.google.common.reflect.TypeToken.b
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class f(Class cls) {
                return cls.getSuperclass();
            }
        }

        public class c extends j0 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Comparator f12125a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map f12126b;

            public c(Comparator comparator, Map map) {
                this.f12125a = comparator;
                this.f12126b = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.j0, java.util.Comparator
            public int compare(Object obj, Object obj2) {
                Comparator comparator = this.f12125a;
                Object obj3 = this.f12126b.get(obj);
                Objects.requireNonNull(obj3);
                Object obj4 = this.f12126b.get(obj2);
                Objects.requireNonNull(obj4);
                return comparator.compare(obj3, obj4);
            }
        }

        public b() {
        }

        public static ImmutableList g(Map map, Comparator comparator) {
            return new c(comparator, map).b(map.keySet());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int a(Object obj, Map map) {
            Integer num = (Integer) map.get(obj);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = e(obj).isInterface();
            Iterator<T> it = d(obj).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, a(it.next(), map));
            }
            Object objF = f(obj);
            int iMax2 = iMax;
            if (objF != null) {
                iMax2 = Math.max(iMax, a(objF, map));
            }
            int i10 = iMax2 + 1;
            map.put(obj, Integer.valueOf(i10));
            return i10;
        }

        public ImmutableList b(Iterable iterable) {
            HashMap mapI = Maps.i();
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), mapI);
            }
            return g(mapI, j0.d().i());
        }

        public final ImmutableList c(Object obj) {
            return b(ImmutableList.B(obj));
        }

        public abstract Iterable d(Object obj);

        public abstract Class e(Object obj);

        public abstract Object f(Object obj);

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    public /* synthetic */ TypeToken(Type type, f fVar) {
        this(type);
    }

    public static TypeToken m(Type type) {
        return new SimpleTypeToken(type);
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            return this.runtimeType.equals(((TypeToken) obj).runtimeType);
        }
        return false;
    }

    public final TypeToken f(Type type) {
        TypeToken typeTokenM = m(type);
        if (typeTokenM.k().isInterface()) {
            return null;
        }
        return typeTokenM;
    }

    public final ImmutableList g(Type[] typeArr) {
        ImmutableList.a aVarV = ImmutableList.v();
        for (Type type : typeArr) {
            TypeToken typeTokenM = m(type);
            if (typeTokenM.k().isInterface()) {
                aVarV.f(typeTokenM);
            }
        }
        return aVarV.g();
    }

    public final e h() {
        e eVar = this.f12117b;
        if (eVar != null) {
            return eVar;
        }
        e eVarB = e.b(this.runtimeType);
        this.f12117b = eVarB;
        return eVarB;
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public final ImmutableList i() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return g(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return g(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.a aVarV = ImmutableList.v();
        for (Type type2 : k().getGenericInterfaces()) {
            aVarV.f(n(type2));
        }
        return aVarV.g();
    }

    public final TypeToken j() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return f(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return f(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = k().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return n(genericSuperclass);
    }

    public final Class k() {
        return (Class) l().iterator().next();
    }

    public final ImmutableSet l() {
        ImmutableSet.a aVarW = ImmutableSet.w();
        new a(this, aVarW).a(this.runtimeType);
        return aVarW.j();
    }

    public final TypeToken n(Type type) {
        TypeToken typeTokenM = m(h().e(type));
        typeTokenM.f12117b = this.f12117b;
        typeTokenM.f12116a = this.f12116a;
        return typeTokenM;
    }

    public String toString() {
        return Types.p(this.runtimeType);
    }

    public Object writeReplace() {
        return m(new e().e(this.runtimeType));
    }

    public TypeToken() {
        Type typeD = d();
        this.runtimeType = typeD;
        com.google.common.base.g.t(!(typeD instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeD);
    }

    public TypeToken(Type type) {
        this.runtimeType = (Type) com.google.common.base.g.m(type);
    }
}
