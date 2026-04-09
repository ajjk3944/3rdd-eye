package com.google.common.reflect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final b f12144a;

    public static final class a extends g {

        /* renamed from: b, reason: collision with root package name */
        public final Map f12145b = Maps.i();

        public static ImmutableMap g(Type type) {
            com.google.common.base.g.m(type);
            a aVar = new a();
            aVar.a(type);
            return ImmutableMap.f(aVar.f12145b);
        }

        @Override // com.google.common.reflect.g
        public void b(Class cls) {
            a(cls.getGenericSuperclass());
            a(cls.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.g
        public void d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            com.google.common.base.g.r(typeParameters.length == actualTypeArguments.length);
            for (int i10 = 0; i10 < typeParameters.length; i10++) {
                h(new c(typeParameters[i10]), actualTypeArguments[i10]);
            }
            a(cls);
            a(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.g
        public void e(TypeVariable typeVariable) {
            a(typeVariable.getBounds());
        }

        @Override // com.google.common.reflect.g
        public void f(WildcardType wildcardType) {
            a(wildcardType.getUpperBounds());
        }

        public final void h(c cVar, Type type) {
            if (this.f12145b.containsKey(cVar)) {
                return;
            }
            Type type2 = type;
            while (type2 != null) {
                if (cVar.a(type2)) {
                    while (type != null) {
                        type = (Type) this.f12145b.remove(c.c(type));
                    }
                    return;
                }
                type2 = (Type) this.f12145b.get(c.c(type2));
            }
            this.f12145b.put(cVar, type);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final TypeVariable f12149a;

        public c(TypeVariable typeVariable) {
            this.f12149a = (TypeVariable) com.google.common.base.g.m(typeVariable);
        }

        public static c c(Type type) {
            if (type instanceof TypeVariable) {
                return new c((TypeVariable) type);
            }
            return null;
        }

        public boolean a(Type type) {
            if (type instanceof TypeVariable) {
                return b((TypeVariable) type);
            }
            return false;
        }

        public final boolean b(TypeVariable typeVariable) {
            return this.f12149a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f12149a.getName().equals(typeVariable.getName());
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return b(((c) obj).f12149a);
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.base.f.b(this.f12149a.getGenericDeclaration(), this.f12149a.getName());
        }

        public String toString() {
            return this.f12149a.toString();
        }
    }

    public /* synthetic */ e(b bVar, d dVar) {
        this(bVar);
    }

    public static e b(Type type) {
        return new e().h(a.g(type));
    }

    public final Type c(GenericArrayType genericArrayType) {
        return Types.h(e(genericArrayType.getGenericComponentType()));
    }

    public final ParameterizedType d(ParameterizedType parameterizedType) {
        Type ownerType = parameterizedType.getOwnerType();
        return Types.k(ownerType == null ? null : e(ownerType), (Class) e(parameterizedType.getRawType()), f(parameterizedType.getActualTypeArguments()));
    }

    public Type e(Type type) {
        com.google.common.base.g.m(type);
        return type instanceof TypeVariable ? this.f12144a.a((TypeVariable) type) : type instanceof ParameterizedType ? d((ParameterizedType) type) : type instanceof GenericArrayType ? c((GenericArrayType) type) : type instanceof WildcardType ? g((WildcardType) type) : type;
    }

    public final Type[] f(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i10 = 0; i10 < typeArr.length; i10++) {
            typeArr2[i10] = e(typeArr[i10]);
        }
        return typeArr2;
    }

    public final WildcardType g(WildcardType wildcardType) {
        return new Types.WildcardTypeImpl(f(wildcardType.getLowerBounds()), f(wildcardType.getUpperBounds()));
    }

    public e h(Map map) {
        return new e(this.f12144a.c(map));
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableMap f12146a;

        public class a extends b {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TypeVariable f12147b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f12148c;

            public a(b bVar, TypeVariable typeVariable, b bVar2) {
                this.f12147b = typeVariable;
                this.f12148c = bVar2;
            }

            @Override // com.google.common.reflect.e.b
            public Type b(TypeVariable typeVariable, b bVar) {
                return typeVariable.getGenericDeclaration().equals(this.f12147b.getGenericDeclaration()) ? typeVariable : this.f12148c.b(typeVariable, bVar);
            }
        }

        public b() {
            this.f12146a = ImmutableMap.o();
        }

        public final Type a(TypeVariable typeVariable) {
            return b(typeVariable, new a(this, typeVariable, this));
        }

        public Type b(TypeVariable typeVariable, b bVar) {
            Type type = (Type) this.f12146a.get(new c(typeVariable));
            d dVar = null;
            if (type != null) {
                return new e(bVar, dVar).e(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length != 0) {
                Type[] typeArrF = new e(bVar, dVar).f(bounds);
                if (!Types.a.f12138a || !Arrays.equals(bounds, typeArrF)) {
                    return Types.i(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrF);
                }
            }
            return typeVariable;
        }

        public final b c(Map map) {
            ImmutableMap.a aVarD = ImmutableMap.d();
            aVarD.j(this.f12146a);
            for (Map.Entry entry : map.entrySet()) {
                c cVar = (c) entry.getKey();
                Type type = (Type) entry.getValue();
                com.google.common.base.g.i(!cVar.a(type), "Type variable %s bound to itself", cVar);
                aVarD.g(cVar, type);
            }
            return new b(aVarD.d());
        }

        public b(ImmutableMap immutableMap) {
            this.f12146a = immutableMap;
        }
    }

    public e() {
        this.f12144a = new b();
    }

    public e(b bVar) {
        this.f12144a = bVar;
    }
}
