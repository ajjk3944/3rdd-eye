package com.google.gson.internal.bind;

import bf.f;
import com.google.gson.internal.g;
import com.google.gson.internal.n;
import com.google.gson.j;
import com.google.gson.w;
import com.google.gson.x;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class CollectionTypeAdapterFactory implements x {

    /* renamed from: a, reason: collision with root package name */
    public final f f20751a;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Adapter<E> extends w {

        /* renamed from: a, reason: collision with root package name */
        public final w f20752a;

        /* renamed from: b, reason: collision with root package name */
        public final n f20753b;

        public Adapter(w wVar, n nVar) {
            this.f20752a = wVar;
            this.f20753b = nVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.w
        public final Object b(yf.b bVar) throws IOException {
            if (bVar.Z() == 9) {
                bVar.V();
                return null;
            }
            Collection collection = (Collection) this.f20753b.b();
            bVar.c();
            while (bVar.A()) {
                collection.add(((TypeAdapterRuntimeTypeWrapper) this.f20752a).f20787b.b(bVar));
            }
            bVar.p();
            return collection;
        }

        @Override // com.google.gson.w
        public final void c(yf.c cVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                cVar.A();
                return;
            }
            cVar.e();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f20752a.c(cVar, it.next());
            }
            cVar.p();
        }
    }

    public CollectionTypeAdapterFactory(f fVar) {
        this.f20751a = fVar;
    }

    @Override // com.google.gson.x
    public final w a(j jVar, xf.a aVar) {
        Type type = aVar.f37088b;
        Class cls = aVar.f37087a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type typeH = g.h(type, cls, Collection.class);
        Class cls2 = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments()[0] : Object.class;
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(jVar, jVar.d(new xf.a(cls2)), cls2), this.f20751a.f(aVar, false));
    }
}
