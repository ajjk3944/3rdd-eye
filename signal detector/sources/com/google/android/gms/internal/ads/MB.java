package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class MB {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9813a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9814b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9815c;

    public MB(Object obj, Object obj2, Object obj3) {
        this.f9813a = obj;
        this.f9814b = obj2;
        this.f9815c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f9813a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f9814b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f9815c);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 5 + strValueOf3.length() + 1 + strValueOf4.length());
        A.f.w(sb, "Multiple entries with same key: ", strValueOf, "=", strValueOf2);
        return new IllegalArgumentException(AbstractC1135f5.o(sb, " and ", strValueOf3, "=", strValueOf4));
    }
}
