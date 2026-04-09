package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s01 {

    /* renamed from: a, reason: collision with root package name */
    public static final s01 f15822a;

    /* renamed from: b, reason: collision with root package name */
    public static final s01 f15823b;

    /* renamed from: c, reason: collision with root package name */
    public static final s01 f15824c;

    /* renamed from: d, reason: collision with root package name */
    public static final s01 f15825d;

    /* renamed from: e, reason: collision with root package name */
    public static final s01 f15826e;

    /* renamed from: f, reason: collision with root package name */
    public static final s01 f15827f;
    public static final /* synthetic */ s01[] g;

    static {
        s01 s01Var = new s01("RESULT_UNKNOWN", 0);
        f15822a = s01Var;
        s01 s01Var2 = new s01("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        f15823b = s01Var2;
        s01 s01Var3 = new s01("RESULT_UPDATED", 2);
        f15824c = s01Var3;
        s01 s01Var4 = new s01("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        f15825d = s01Var4;
        s01 s01Var5 = new s01("RESULT_FAILURE_INVALID_RESPONSE", 4);
        f15826e = s01Var5;
        s01 s01Var6 = new s01("RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION", 5);
        f15827f = s01Var6;
        g = new s01[]{s01Var, s01Var2, s01Var3, s01Var4, s01Var5, s01Var6};
    }

    public static s01[] values() {
        return (s01[]) g.clone();
    }
}
