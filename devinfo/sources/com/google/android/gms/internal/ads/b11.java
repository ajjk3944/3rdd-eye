package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b11 implements z21 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b11 f9544b = new b11(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b11 f9545c = new b11(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b11 f9546d = new b11(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b11 f9547e = new b11(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b11 f9548f = new b11(4);
    public static final /* synthetic */ b11 g = new b11(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9549a;

    public /* synthetic */ b11(int i4) {
        this.f9549a = i4;
    }

    @Override // com.google.android.gms.internal.ads.z21
    public final Object apply(Object obj) {
        switch (this.f9549a) {
            case 0:
                return null;
            case 1:
                return f11.b(5);
            case 2:
                ry1 ry1Var = (ry1) obj;
                int i4 = mx1.N;
                String str = ry1Var.f15790a;
                String str2 = ry1Var.f15791b;
                return r5.c.m(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length()), str, ": ", str2);
            case 3:
                x1 x1Var = (x1) obj;
                x1Var.getClass();
                return x1Var.getClass().getSimpleName();
            case 4:
                return x41.q(mq0.F(((iy1) obj).f().f14821b, g));
            default:
                oz1 oz1Var = oz1.f14819d;
                return Integer.valueOf(((ii) obj).f12339c);
        }
    }
}
