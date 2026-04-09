package com.google.gson.internal.bind;

import E5.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes2.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f23428a;

    /* renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f23429b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f23430c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f23428a = gson;
        this.f23429b = typeAdapter;
        this.f23430c = type;
    }

    @Override // com.google.gson.TypeAdapter
    public final T b(E5.a aVar) throws IOException {
        return this.f23429b.b(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.TypeAdapter
    public final void c(c cVar, T t10) throws IOException {
        ?? r02 = this.f23430c;
        Class<?> cls = (t10 == null || !(r02 == Object.class || (r02 instanceof TypeVariable) || (r02 instanceof Class))) ? r02 : t10.getClass();
        TypeAdapter<T> typeAdapter = this.f23429b;
        if (cls != r02) {
            TypeAdapter<T> typeAdapterD = this.f23428a.d(new D5.a<>(cls));
            if (!(typeAdapterD instanceof ReflectiveTypeAdapterFactory.Adapter) || (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                typeAdapter = typeAdapterD;
            }
        }
        typeAdapter.c(cVar, t10);
    }
}
