package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import j$.util.Optional;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c11 implements y01 {

    /* renamed from: a, reason: collision with root package name */
    public final s11 f9915a;

    /* renamed from: b, reason: collision with root package name */
    public final r11 f9916b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f9917c;

    /* renamed from: d, reason: collision with root package name */
    public final v11 f9918d;

    /* renamed from: e, reason: collision with root package name */
    public final g21 f9919e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9920f = new Object();
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9921h;

    /* renamed from: i, reason: collision with root package name */
    public final long f9922i;
    public g5 j;

    public c11(s11 s11Var, r11 r11Var, v11 v11Var, g21 g21Var, sx0 sx0Var, ExecutorService executorService) {
        this.f9915a = s11Var;
        this.f9916b = r11Var;
        this.f9917c = executorService;
        this.f9918d = v11Var;
        this.f9919e = g21Var;
        this.g = sx0Var.G();
        this.f9921h = sx0Var.O();
        this.f9922i = sx0Var.N();
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final n81 a() {
        n81 n81VarS = n81.s(this.f9916b.a());
        b11 b11Var = b11.f9544b;
        ExecutorService executorService = this.f9917c;
        return yo0.F(yo0.C(n81VarS, Throwable.class, b11Var, executorService), new fp(17, this), executorService);
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final String b() {
        synchronized (this.f9920f) {
            try {
                g5 g5Var = this.j;
                if (g5Var == null) {
                    return "3.825731049.-1";
                }
                return (String) g5Var.f11375c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final h91 c(Context context, View view, Activity activity) {
        return yo0.z(this.f9917c, new ib0(this, context, view, activity, 4));
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final void d(InputEvent inputEvent) {
        try {
            synchronized (this.f9920f) {
                try {
                    g5 g5Var = this.j;
                    if (g5Var != null) {
                        HashMap map = new HashMap();
                        map.put("evt", inputEvent);
                        ((a4.d) g5Var.f11376d).B(g5Var.f11374b, Optional.of(map));
                    } else {
                        this.f9919e.b(20105);
                    }
                } finally {
                }
            }
        } catch (fb | ib e2) {
            this.f9919e.d(20104, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final int e() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final h91 f(Context context) {
        return yo0.z(this.f9917c, new ae(13, this, context));
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final h91 g(Context context, String str, View view) {
        return yo0.z(this.f9917c, new ib0(this, context, str, view, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.util.HashMap r13) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c11.h(java.util.HashMap):void");
    }

    public final String i(HashMap map) {
        String strG;
        g21 g21Var = this.f9919e;
        try {
            g21Var.a(20110).a();
            synchronized (this.f9920f) {
                try {
                    g5 g5Var = this.j;
                    if (g5Var == null) {
                        g21Var.b(20109);
                        strG = "";
                    } else {
                        byte[] bArr = (byte[]) ((a4.d) g5Var.f11376d).B(g5Var.f11373a, Optional.of(map));
                        k61 k61Var = m61.f13778e;
                        if (k61Var.f13781b != null) {
                            k61Var = new k61(k61Var.f13780a, (Character) null);
                        }
                        strG = k61Var.g(bArr.length, bArr);
                    }
                } finally {
                }
            }
            return strG;
        } finally {
        }
    }
}
