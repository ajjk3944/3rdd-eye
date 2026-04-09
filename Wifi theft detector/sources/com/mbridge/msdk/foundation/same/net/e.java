package com.mbridge.msdk.foundation.same.net;

/* loaded from: classes3.dex */
public class e<T> {

    /* renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.exception.a f15123a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.toolbox.a f15124b;

    /* renamed from: c, reason: collision with root package name */
    public T f15125c;

    private e(T t10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.f15125c = t10;
        this.f15124b = aVar;
    }

    public static <T> e<T> a(T t10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        return new e<>(t10, aVar);
    }
}
