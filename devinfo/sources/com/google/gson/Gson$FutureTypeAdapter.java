package com.google.gson;

import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
class Gson$FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public w f20728a = null;

    @Override // com.google.gson.w
    public final Object b(yf.b bVar) {
        w wVar = this.f20728a;
        if (wVar != null) {
            return wVar.b(bVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.gson.w
    public final void c(yf.c cVar, Object obj) {
        w wVar = this.f20728a;
        if (wVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        wVar.c(cVar, obj);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final w d() {
        w wVar = this.f20728a;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
