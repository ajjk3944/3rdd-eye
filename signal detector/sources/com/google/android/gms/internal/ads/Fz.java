package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Fz {

    /* renamed from: a, reason: collision with root package name */
    public static final Fz f8243a;

    /* renamed from: b, reason: collision with root package name */
    public static final Fz f8244b;

    /* renamed from: c, reason: collision with root package name */
    public static final Fz f8245c;

    /* renamed from: d, reason: collision with root package name */
    public static final Fz f8246d;

    /* renamed from: e, reason: collision with root package name */
    public static final Fz f8247e;

    /* renamed from: f, reason: collision with root package name */
    public static final Fz f8248f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Fz[] f8249g;

    static {
        Fz fz = new Fz("RESULT_UNKNOWN", 0);
        f8243a = fz;
        Fz fz2 = new Fz("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        f8244b = fz2;
        Fz fz3 = new Fz("RESULT_UPDATED", 2);
        f8245c = fz3;
        Fz fz4 = new Fz("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        f8246d = fz4;
        Fz fz5 = new Fz("RESULT_FAILURE_INVALID_RESPONSE", 4);
        f8247e = fz5;
        Fz fz6 = new Fz("RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION", 5);
        f8248f = fz6;
        f8249g = new Fz[]{fz, fz2, fz3, fz4, fz5, fz6};
    }

    public static Fz[] values() {
        return (Fz[]) f8249g.clone();
    }
}
