package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o8 implements n8 {

    /* renamed from: a, reason: collision with root package name */
    public static final n4 f19854a;

    /* renamed from: b, reason: collision with root package name */
    public static final n4 f19855b;

    /* renamed from: c, reason: collision with root package name */
    public static final n4 f19856c;

    /* renamed from: d, reason: collision with root package name */
    public static final n4 f19857d;

    /* renamed from: e, reason: collision with root package name */
    public static final n4 f19858e;

    /* renamed from: f, reason: collision with root package name */
    public static final n4 f19859f;

    static {
        a4.d dVar = new a4.d(m4.a(), true, true);
        f19854a = dVar.A("measurement.test.boolean_flag", false);
        f19855b = dVar.x(-1L, "measurement.test.cached_long_flag");
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = n4.g;
        f19856c = new n4(dVar, "measurement.test.double_flag", dValueOf, 2);
        f19857d = dVar.x(-2L, "measurement.test.int_flag");
        f19858e = dVar.x(-1L, "measurement.test.long_flag");
        f19859f = dVar.C("measurement.test.string_flag", "---");
    }
}
