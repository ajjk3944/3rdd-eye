package com.google.gson.internal;

import E.u;
import T1.B;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import t4.C5606d;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Type, com.google.gson.d<?>> f23388a;

    /* renamed from: b, reason: collision with root package name */
    public final C5.b f23389b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    public class a<T> implements g<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.d f23390b;

        public a(com.google.gson.d dVar, Type type) {
            this.f23390b = dVar;
        }

        @Override // com.google.gson.internal.g
        public final T n() {
            return (T) this.f23390b.a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.b$b, reason: collision with other inner class name */
    public class C0352b<T> implements g<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.d f23391b;

        public C0352b(com.google.gson.d dVar, Type type) {
            this.f23391b = dVar;
        }

        @Override // com.google.gson.internal.g
        public final T n() {
            return (T) this.f23391b.a();
        }
    }

    public b() {
        Map<Type, com.google.gson.d<?>> map = Collections.EMPTY_MAP;
        this.f23389b = C5.b.f922a;
        this.f23388a = map;
    }

    public final <T> g<T> a(D5.a<T> aVar) throws NoSuchMethodException, SecurityException {
        B7.e eVar;
        Type type = aVar.f1062b;
        Map<Type, com.google.gson.d<?>> map = this.f23388a;
        com.google.gson.d<?> dVar = map.get(type);
        if (dVar != null) {
            return new a(dVar, type);
        }
        Class<? super T> cls = aVar.f1061a;
        com.google.gson.d<?> dVar2 = map.get(cls);
        if (dVar2 != null) {
            return new C0352b(dVar2, type);
        }
        g<T> cVar = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f23389b.a(declaredConstructor);
            }
            eVar = new B7.e(declaredConstructor, 5);
        } catch (NoSuchMethodException unused) {
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            cVar = SortedSet.class.isAssignableFrom(cls) ? new A2.l(29) : EnumSet.class.isAssignableFrom(cls) ? new F3.f(type) : Set.class.isAssignableFrom(cls) ? new u(21) : Queue.class.isAssignableFrom(cls) ? new B7.d(20) : new C5606d(26);
        } else if (Map.class.isAssignableFrom(cls)) {
            cVar = ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new c() : ConcurrentMap.class.isAssignableFrom(cls) ? new C5606d(25) : SortedMap.class.isAssignableFrom(cls) ? new A2.l(28) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new D5.a(((ParameterizedType) type).getActualTypeArguments()[0]).f1061a)) ? new u(20) : new B();
        }
        return cVar != null ? cVar : new N2.g(cls, type);
    }

    public final String toString() {
        return this.f23388a.toString();
    }
}
