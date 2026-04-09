package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes2.dex */
public final class k extends m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f23511b;

    public k(Method method) {
        this.f23511b = method;
    }

    @Override // com.google.gson.internal.m
    public final <T> T b(Class<T> cls) throws Exception {
        m.a(cls);
        return (T) this.f23511b.invoke(null, cls, Object.class);
    }
}
