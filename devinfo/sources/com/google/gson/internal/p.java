package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p extends t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f20866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20867c;

    public p(Method method, Object obj) {
        this.f20866b = method;
        this.f20867c = obj;
    }

    @Override // com.google.gson.internal.t
    public final Object a(Class cls) {
        String strA = bf.f.a(cls);
        if (strA == null) {
            return this.f20866b.invoke(this.f20867c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
    }
}
