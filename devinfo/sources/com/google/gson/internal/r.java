package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r extends t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f20870b;

    public r(Method method) {
        this.f20870b = method;
    }

    @Override // com.google.gson.internal.t
    public final Object a(Class cls) {
        String strA = bf.f.a(cls);
        if (strA == null) {
            return this.f20870b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
    }
}
