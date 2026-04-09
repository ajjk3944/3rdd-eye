package com.google.gson.internal.bind;

import com.google.gson.internal.g;
import com.google.gson.j;
import com.google.gson.w;
import com.google.gson.x;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ArrayTypeAdapter<E> extends w {

    /* renamed from: c, reason: collision with root package name */
    public static final x f20748c = new x() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.x
        public final w a(j jVar, xf.a aVar) {
            Type type = aVar.f37088b;
            boolean z3 = type instanceof GenericArrayType;
            if (!z3 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z3 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(jVar, jVar.d(new xf.a(genericComponentType)), g.g(genericComponentType));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Class f20749a;

    /* renamed from: b, reason: collision with root package name */
    public final w f20750b;

    public ArrayTypeAdapter(j jVar, w wVar, Class cls) {
        this.f20750b = new TypeAdapterRuntimeTypeWrapper(jVar, wVar, cls);
        this.f20749a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.w
    public final Object b(yf.b bVar) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (bVar.Z() == 9) {
            bVar.V();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        bVar.c();
        while (bVar.A()) {
            arrayList.add(((TypeAdapterRuntimeTypeWrapper) this.f20750b).f20787b.b(bVar));
        }
        bVar.p();
        int size = arrayList.size();
        Class cls = this.f20749a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i4 = 0; i4 < size; i4++) {
            Array.set(objNewInstance, i4, arrayList.get(i4));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.w
    public final void c(yf.c cVar, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            cVar.A();
            return;
        }
        cVar.e();
        int length = Array.getLength(obj);
        for (int i4 = 0; i4 < length; i4++) {
            this.f20750b.c(cVar, Array.get(obj, i4));
        }
        cVar.p();
    }
}
