package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nu0 implements iu0 {

    /* renamed from: d, reason: collision with root package name */
    public static nu0 f14438d;

    /* renamed from: a, reason: collision with root package name */
    public float f14439a;

    /* renamed from: b, reason: collision with root package name */
    public eu0 f14440b;

    /* renamed from: c, reason: collision with root package name */
    public hu0 f14441c;

    public static nu0 a() {
        if (f14438d == null) {
            nu0 nu0Var = new nu0();
            nu0Var.f14439a = 0.0f;
            f14438d = nu0Var;
        }
        return f14438d;
    }

    @Override // com.google.android.gms.internal.ads.iu0
    public final void c(boolean z3) {
        if (z3) {
            yu0.g.getClass();
            yu0.b();
            return;
        }
        yu0.g.getClass();
        Handler handler = yu0.f18867i;
        if (handler != null) {
            handler.removeCallbacks(yu0.f18868k);
            yu0.f18867i = null;
        }
    }
}
