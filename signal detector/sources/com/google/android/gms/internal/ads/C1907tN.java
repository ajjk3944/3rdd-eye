package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1907tN implements InterfaceC1853sN, InterfaceC1692pN {

    /* renamed from: b, reason: collision with root package name */
    public static final C1907tN f16901b = new C1907tN(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f16902a;

    public C1907tN(Object obj) {
        this.f16902a = obj;
    }

    public static C1907tN a(Object obj) {
        Cr.l(obj, "instance cannot be null");
        return new C1907tN(obj);
    }

    public static C1907tN b(Object obj) {
        return obj == null ? f16901b : new C1907tN(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        return this.f16902a;
    }
}
