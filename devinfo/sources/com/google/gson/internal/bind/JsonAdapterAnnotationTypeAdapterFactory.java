package com.google.gson.internal.bind;

import bf.f;
import com.google.gson.internal.g;
import com.google.gson.j;
import com.google.gson.w;
import com.google.gson.x;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements x {

    /* renamed from: c, reason: collision with root package name */
    public static final x f20761c;

    /* renamed from: a, reason: collision with root package name */
    public final f f20762a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f20763b = new ConcurrentHashMap();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class DummyTypeAdapterFactory implements x {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.x
        public final w a(j jVar, xf.a aVar) {
            throw new AssertionError("Factory should not be used");
        }

        public /* synthetic */ DummyTypeAdapterFactory(int i4) {
            this();
        }
    }

    static {
        int i4 = 0;
        f20761c = new DummyTypeAdapterFactory(i4);
        new DummyTypeAdapterFactory(i4);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(f fVar) {
        this.f20762a = fVar;
    }

    @Override // com.google.gson.x
    public final w a(j jVar, xf.a aVar) {
        uf.a aVar2 = (uf.a) aVar.f37087a.getAnnotation(uf.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f20762a, jVar, aVar, aVar2, true);
    }

    public final w b(f fVar, j jVar, xf.a aVar, uf.a aVar2, boolean z3) {
        w wVarA;
        Object objB = fVar.f(new xf.a(aVar2.value()), true).b();
        boolean zNullSafe = aVar2.nullSafe();
        if (objB instanceof w) {
            wVarA = (w) objB;
        } else {
            if (!(objB instanceof x)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objB.getClass().getName() + " as a @JsonAdapter for " + g.k(aVar.f37088b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            x xVar = (x) objB;
            if (z3) {
                x xVar2 = (x) this.f20763b.putIfAbsent(aVar.f37087a, xVar);
                if (xVar2 != null) {
                    xVar = xVar2;
                }
            }
            wVarA = xVar.a(jVar, aVar);
        }
        return (wVarA == null || !zNullSafe) ? wVarA : wVarA.a();
    }
}
