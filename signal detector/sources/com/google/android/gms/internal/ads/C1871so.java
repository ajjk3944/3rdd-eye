package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.so, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1871so {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16795a;

    /* renamed from: b, reason: collision with root package name */
    public P.g f16796b = new P.g(4);

    /* renamed from: c, reason: collision with root package name */
    public boolean f16797c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16798d;

    public C1871so(Object obj) {
        this.f16795a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1871so.class != obj.getClass()) {
            return false;
        }
        return this.f16795a.equals(((C1871so) obj).f16795a);
    }

    public final int hashCode() {
        return this.f16795a.hashCode();
    }
}
