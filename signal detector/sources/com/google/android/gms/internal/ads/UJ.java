package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class UJ {

    /* renamed from: a, reason: collision with root package name */
    public static final UJ f11636a;

    /* renamed from: b, reason: collision with root package name */
    public static final UJ f11637b;

    /* renamed from: c, reason: collision with root package name */
    public static final UJ f11638c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ UJ[] f11639d;

    static {
        UJ uj = new UJ("NIST_P256", 0);
        f11636a = uj;
        UJ uj2 = new UJ("NIST_P384", 1);
        f11637b = uj2;
        UJ uj3 = new UJ("NIST_P521", 2);
        f11638c = uj3;
        f11639d = new UJ[]{uj, uj2, uj3};
    }

    public static UJ[] values() {
        return (UJ[]) f11639d.clone();
    }
}
