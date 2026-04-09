package com.google.gson.internal.bind;

import B7.d;
import E5.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.g;
import com.google.gson.o;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements o {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.internal.b f23395b;

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final TypeAdapter<E> f23396a;

        /* renamed from: b, reason: collision with root package name */
        public final g<? extends Collection<E>> f23397b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, g<? extends Collection<E>> gVar) {
            this.f23396a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f23397b = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final Object b(E5.a aVar) throws IOException {
            if (aVar.C0() == E5.b.NULL) {
                aVar.v0();
                return null;
            }
            Collection<E> collectionN = this.f23397b.n();
            aVar.a();
            while (aVar.B()) {
                collectionN.add(((TypeAdapterRuntimeTypeWrapper) this.f23396a).f23429b.b(aVar));
            }
            aVar.k();
            return collectionN;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(c cVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                cVar.B();
                return;
            }
            cVar.c();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f23396a.c(cVar, it.next());
            }
            cVar.k();
        }
    }

    public CollectionTypeAdapterFactory(com.google.gson.internal.b bVar) {
        this.f23395b = bVar;
    }

    @Override // com.google.gson.o
    public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
        Type type = aVar.f1062b;
        Class<? super T> cls = aVar.f1061a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        d.e(Collection.class.isAssignableFrom(cls));
        Type typeF = com.google.gson.internal.a.f(type, cls, com.google.gson.internal.a.d(type, cls, Collection.class), new HashSet());
        if (typeF instanceof WildcardType) {
            typeF = ((WildcardType) typeF).getUpperBounds()[0];
        }
        Class cls2 = typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments()[0] : Object.class;
        return new Adapter(gson, cls2, gson.d(new D5.a<>(cls2)), this.f23395b.a(aVar));
    }
}
