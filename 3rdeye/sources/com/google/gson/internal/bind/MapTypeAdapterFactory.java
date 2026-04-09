package com.google.gson.internal.bind;

import B7.d;
import E5.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.g;
import com.google.gson.internal.m;
import com.google.gson.o;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements o {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.internal.b f23401b;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final TypeAdapter<K> f23402a;

        /* renamed from: b, reason: collision with root package name */
        public final TypeAdapter<V> f23403b;

        /* renamed from: c, reason: collision with root package name */
        public final g<? extends Map<K, V>> f23404c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, g<? extends Map<K, V>> gVar) {
            this.f23402a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f23403b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f23404c = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final Object b(E5.a aVar) throws IOException {
            E5.b bVarC0 = aVar.C0();
            if (bVarC0 == E5.b.NULL) {
                aVar.v0();
                return null;
            }
            Map<K, V> mapN = this.f23404c.n();
            E5.b bVar = E5.b.BEGIN_ARRAY;
            TypeAdapter<V> typeAdapter = this.f23403b;
            TypeAdapter<K> typeAdapter2 = this.f23402a;
            if (bVarC0 != bVar) {
                aVar.c();
                while (aVar.B()) {
                    m.f23512a.c(aVar);
                    Object objB = ((TypeAdapterRuntimeTypeWrapper) typeAdapter2).f23429b.b(aVar);
                    if (mapN.put(objB, ((TypeAdapterRuntimeTypeWrapper) typeAdapter).f23429b.b(aVar)) != null) {
                        throw new com.google.gson.m("duplicate key: " + objB);
                    }
                }
                aVar.l();
                return mapN;
            }
            aVar.a();
            while (aVar.B()) {
                aVar.a();
                Object objB2 = ((TypeAdapterRuntimeTypeWrapper) typeAdapter2).f23429b.b(aVar);
                if (mapN.put(objB2, ((TypeAdapterRuntimeTypeWrapper) typeAdapter).f23429b.b(aVar)) != null) {
                    throw new com.google.gson.m("duplicate key: " + objB2);
                }
                aVar.k();
            }
            aVar.k();
            return mapN;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(c cVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                cVar.B();
                return;
            }
            MapTypeAdapterFactory.this.getClass();
            TypeAdapter<V> typeAdapter = this.f23403b;
            cVar.d();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                cVar.n(String.valueOf(entry.getKey()));
                typeAdapter.c(cVar, entry.getValue());
            }
            cVar.l();
        }
    }

    public MapTypeAdapterFactory(com.google.gson.internal.b bVar) {
        this.f23401b = bVar;
    }

    @Override // com.google.gson.o
    public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
        Type[] actualTypeArguments;
        Type type = aVar.f1062b;
        if (!Map.class.isAssignableFrom(aVar.f1061a)) {
            return null;
        }
        Class<?> clsE = com.google.gson.internal.a.e(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            d.e(Map.class.isAssignableFrom(clsE));
            Type typeF = com.google.gson.internal.a.f(type, clsE, com.google.gson.internal.a.d(type, clsE, Map.class), new HashSet());
            actualTypeArguments = typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new Adapter(gson, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.f23436c : gson.d(new D5.a<>(type2)), actualTypeArguments[1], gson.d(new D5.a<>(actualTypeArguments[1])), this.f23401b.a(aVar));
    }
}
