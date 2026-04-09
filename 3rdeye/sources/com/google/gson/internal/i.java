package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes2.dex */
public final class i extends m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f23507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23508c;

    public i(Method method, Object obj) {
        this.f23507b = method;
        this.f23508c = obj;
    }

    @Override // com.google.gson.internal.m
    public final <T> T b(Class<T> cls) throws Exception {
        m.a(cls);
        return (T) this.f23507b.invoke(this.f23508c, cls);
    }
}
