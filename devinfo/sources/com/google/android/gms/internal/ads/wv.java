package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wv implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18205a;

    /* renamed from: b, reason: collision with root package name */
    public final gs1 f18206b;

    /* renamed from: c, reason: collision with root package name */
    public final gs1 f18207c;

    public /* synthetic */ wv(gs1 gs1Var, gs1 gs1Var2, int i4) {
        this.f18205a = i4;
        this.f18206b = gs1Var;
        this.f18207c = gs1Var2;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f18205a) {
            case 0:
                return new vv((Context) this.f18206b.f11600a, (ya.c0) this.f18207c.f11600a);
            case 1:
                ExecutorService executorService = (ExecutorService) this.f18206b.f11600a;
                sx0 sx0Var = (sx0) this.f18207c.f11600a;
                String str = Build.VERSION.RELEASE;
                String str2 = Build.MODEL;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
                je.u.B(sb2, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
                sb2.append(")");
                return new cy0(executorService, sb2.toString(), sx0Var.P());
            case 2:
                return new z11((Context) this.f18206b.f11600a, (ExecutorService) this.f18207c.f11600a);
            default:
                return new c21((Context) this.f18206b.f11600a, (ExecutorService) this.f18207c.f11600a);
        }
    }
}
