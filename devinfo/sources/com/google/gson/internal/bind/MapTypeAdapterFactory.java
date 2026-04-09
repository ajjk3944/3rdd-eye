package com.google.gson.internal.bind;

import bf.f;
import com.google.gson.internal.g;
import com.google.gson.internal.n;
import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.w;
import com.google.gson.x;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class MapTypeAdapterFactory implements x {

    /* renamed from: a, reason: collision with root package name */
    public final f f20765a;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public final class Adapter<K, V> extends w {

        /* renamed from: a, reason: collision with root package name */
        public final w f20766a;

        /* renamed from: b, reason: collision with root package name */
        public final w f20767b;

        /* renamed from: c, reason: collision with root package name */
        public final n f20768c;

        public Adapter(MapTypeAdapterFactory mapTypeAdapterFactory, w wVar, w wVar2, n nVar) {
            this.f20766a = wVar;
            this.f20767b = wVar2;
            this.f20768c = nVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.w
        public final Object b(yf.b bVar) throws IOException {
            int iZ = bVar.Z();
            if (iZ == 9) {
                bVar.V();
                return null;
            }
            Map map = (Map) this.f20768c.b();
            if (iZ == 1) {
                bVar.c();
                while (bVar.A()) {
                    bVar.c();
                    Object objB = ((TypeAdapterRuntimeTypeWrapper) this.f20766a).f20787b.b(bVar);
                    if (map.put(objB, ((TypeAdapterRuntimeTypeWrapper) this.f20767b).f20787b.b(bVar)) != null) {
                        throw new q("duplicate key: " + objB);
                    }
                    bVar.p();
                }
                bVar.p();
                return map;
            }
            bVar.e();
            while (bVar.A()) {
                yf.a.f37587a.getClass();
                int iM = bVar.g;
                if (iM == 0) {
                    iM = bVar.m();
                }
                if (iM == 13) {
                    bVar.g = 9;
                } else if (iM == 12) {
                    bVar.g = 8;
                } else {
                    if (iM != 14) {
                        throw bVar.h0("a name");
                    }
                    bVar.g = 10;
                }
                Object objB2 = ((TypeAdapterRuntimeTypeWrapper) this.f20766a).f20787b.b(bVar);
                if (map.put(objB2, ((TypeAdapterRuntimeTypeWrapper) this.f20767b).f20787b.b(bVar)) != null) {
                    throw new q("duplicate key: " + objB2);
                }
            }
            bVar.v();
            return map;
        }

        @Override // com.google.gson.w
        public final void c(yf.c cVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                cVar.A();
                return;
            }
            cVar.g();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                cVar.w(String.valueOf(entry.getKey()));
                this.f20767b.c(cVar, entry.getValue());
            }
            cVar.v();
        }
    }

    public MapTypeAdapterFactory(f fVar) {
        this.f20765a = fVar;
    }

    @Override // com.google.gson.x
    public final w a(j jVar, xf.a aVar) {
        Type[] actualTypeArguments;
        Type type = aVar.f37088b;
        Class cls = aVar.f37087a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (Properties.class.isAssignableFrom(cls)) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type typeH = g.h(type, cls, Map.class);
            actualTypeArguments = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        Type type3 = actualTypeArguments[1];
        return new Adapter(this, new TypeAdapterRuntimeTypeWrapper(jVar, (type2 == Boolean.TYPE || type2 == Boolean.class) ? e.f20812c : jVar.d(new xf.a(type2)), type2), new TypeAdapterRuntimeTypeWrapper(jVar, jVar.d(new xf.a(type3)), type3), this.f20765a.f(aVar, false));
    }
}
