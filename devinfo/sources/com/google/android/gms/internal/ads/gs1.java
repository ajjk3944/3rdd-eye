package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gs1 implements fs1, cs1 {

    /* renamed from: b, reason: collision with root package name */
    public static final gs1 f11599b = new gs1(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f11600a;

    public gs1(Object obj) {
        this.f11600a = obj;
    }

    public static gs1 b(Object obj) {
        if (obj != null) {
            return new gs1(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public static gs1 c(Object obj) {
        return obj == null ? f11599b : new gs1(obj);
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        return this.f11600a;
    }
}
