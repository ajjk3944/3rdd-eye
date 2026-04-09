package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f11 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10957a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10958b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f10959c;

    /* renamed from: d, reason: collision with root package name */
    public final g21 f10960d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10961e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f10962f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f10963h;

    public f11(Context context, cs1 cs1Var, i11 i11Var, g21 g21Var, ExecutorService executorService, x01 x01Var, gv0 gv0Var) {
        this.f10958b = context;
        this.f10961e = cs1Var;
        this.f10962f = i11Var;
        this.f10960d = g21Var;
        this.f10959c = executorService;
        this.g = x01Var;
        this.f10963h = gv0Var;
    }

    public static xy0 a(int i4) {
        wy0 wy0VarD = xy0.D();
        wy0VarD.b();
        ((xy0) wy0VarD.f14755b).I(i4);
        return (xy0) wy0VarD.e();
    }

    public static xy0 b(int i4) {
        wy0 wy0VarD = xy0.D();
        wy0VarD.b();
        ((xy0) wy0VarD.f14755b).I(i4);
        return (xy0) wy0VarD.e();
    }

    public f11(Context context, ExecutorService executorService, sx0 sx0Var, cy0 cy0Var, g21 g21Var, h11 h11Var) {
        this.f10958b = context;
        this.f10959c = executorService;
        this.f10961e = cy0Var;
        this.f10960d = g21Var;
        this.f10963h = h11Var;
        this.f10962f = sx0Var.G();
        this.g = sx0Var.M().C();
    }
}
