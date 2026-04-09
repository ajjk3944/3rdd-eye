package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q extends t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f20868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20869c;

    public q(int i4, Method method) {
        this.f20868b = method;
        this.f20869c = i4;
    }

    @Override // com.google.gson.internal.t
    public final Object a(Class cls) {
        String strA = bf.f.a(cls);
        if (strA == null) {
            return this.f20868b.invoke(null, cls, Integer.valueOf(this.f20869c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
    }
}
