package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class p8 implements o8 {

    /* renamed from: a, reason: collision with root package name */
    public static final m4 f5160a;

    /* renamed from: b, reason: collision with root package name */
    public static final m4 f5161b;

    /* renamed from: c, reason: collision with root package name */
    public static final m4 f5162c;

    /* renamed from: d, reason: collision with root package name */
    public static final m4 f5163d;

    /* renamed from: e, reason: collision with root package name */
    public static final m4 f5164e;

    /* renamed from: f, reason: collision with root package name */
    public static final m4 f5165f;

    static {
        ab.g gVar = new ab.g(l4.a(), true, true);
        f5160a = gVar.z("measurement.test.boolean_flag", false);
        f5161b = gVar.y(-1L, "measurement.test.cached_long_flag");
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = m4.f5114g;
        f5162c = new m4(gVar, "measurement.test.double_flag", dValueOf, 2);
        f5163d = gVar.y(-2L, "measurement.test.int_flag");
        f5164e = gVar.y(-1L, "measurement.test.long_flag");
        f5165f = gVar.A("measurement.test.string_flag", "---");
    }
}
