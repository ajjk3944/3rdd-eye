package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y41 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18637a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18638b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18639c;

    public y41(Object obj, Object obj2, Object obj3) {
        this.f18637a = obj;
        this.f18638b = obj2;
        this.f18639c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f18637a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f18638b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f18639c);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 33 + length2 + 5 + strValueOf3.length() + 1 + strValueOf4.length());
        je.u.B(sb2, "Multiple entries with same key: ", strValueOf, "=", strValueOf2);
        return new IllegalArgumentException(a0.g.p(sb2, " and ", strValueOf3, "=", strValueOf4));
    }
}
