package com.google.gson.internal;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes2.dex */
public final class j extends m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f23509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23510c;

    public j(int i, Method method) {
        this.f23509b = method;
        this.f23510c = i;
    }

    @Override // com.google.gson.internal.m
    public final <T> T b(Class<T> cls) throws Exception {
        m.a(cls);
        return (T) this.f23509b.invoke(null, cls, Integer.valueOf(this.f23510c));
    }
}
