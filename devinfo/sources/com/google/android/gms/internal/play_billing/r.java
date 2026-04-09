package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20220a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20221b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20222c;

    public r(Object obj, Object obj2, Object obj3) {
        this.f20220a = obj;
        this.f20221b = obj2;
        this.f20222c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f20220a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f20221b);
        return new IllegalArgumentException(r5.c.m(r5.c.o("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f20222c)));
    }
}
