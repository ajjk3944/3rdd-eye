package com.google.gson.internal.bind;

import E5.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.o;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final o f23392c = new o() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.o
        public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
            Type type = aVar.f1062b;
            boolean z10 = type instanceof GenericArrayType;
            if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z10 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(gson, gson.d(new D5.a<>(genericComponentType)), com.google.gson.internal.a.e(genericComponentType));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Class<E> f23393a;

    /* renamed from: b, reason: collision with root package name */
    public final TypeAdapter<E> f23394b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f23394b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f23393a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public final Object b(E5.a aVar) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (aVar.C0() == E5.b.NULL) {
            aVar.v0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.B()) {
            arrayList.add(((TypeAdapterRuntimeTypeWrapper) this.f23394b).f23429b.b(aVar));
        }
        aVar.k();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f23393a, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(c cVar, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            cVar.B();
            return;
        }
        cVar.c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f23394b.c(cVar, Array.get(obj, i));
        }
        cVar.k();
    }
}
