package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.w;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends w {

    /* renamed from: a, reason: collision with root package name */
    public final j f20786a;

    /* renamed from: b, reason: collision with root package name */
    public final w f20787b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f20788c;

    public TypeAdapterRuntimeTypeWrapper(j jVar, w wVar, Type type) {
        this.f20786a = jVar;
        this.f20787b = wVar;
        this.f20788c = type;
    }

    @Override // com.google.gson.w
    public final Object b(yf.b bVar) {
        return this.f20787b.b(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(yf.c r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.reflect.Type r0 = r4.f20788c
            if (r6 == 0) goto L11
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
        Lc:
            java.lang.Class r1 = r6.getClass()
            goto L12
        L11:
            r1 = r0
        L12:
            com.google.gson.w r2 = r4.f20787b
            if (r1 == r0) goto L3d
            xf.a r0 = new xf.a
            r0.<init>(r1)
            com.google.gson.j r1 = r4.f20786a
            com.google.gson.w r0 = r1.d(r0)
            boolean r1 = r0 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r1 != 0) goto L26
            goto L3c
        L26:
            r1 = r2
        L27:
            boolean r3 = r1 instanceof com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
            if (r3 == 0) goto L37
            r3 = r1
            com.google.gson.internal.bind.SerializationDelegatingTypeAdapter r3 = (com.google.gson.internal.bind.SerializationDelegatingTypeAdapter) r3
            com.google.gson.w r3 = r3.d()
            if (r3 != r1) goto L35
            goto L37
        L35:
            r1 = r3
            goto L27
        L37:
            boolean r1 = r1 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r1 != 0) goto L3c
            goto L3d
        L3c:
            r2 = r0
        L3d:
            r2.c(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper.c(yf.c, java.lang.Object):void");
    }
}
