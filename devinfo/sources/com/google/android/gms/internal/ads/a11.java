package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a11 implements y01 {

    /* renamed from: a, reason: collision with root package name */
    public final dw0 f9183a;

    /* renamed from: b, reason: collision with root package name */
    public final j11 f9184b;

    /* renamed from: c, reason: collision with root package name */
    public final s11 f9185c;

    /* renamed from: d, reason: collision with root package name */
    public final g21 f9186d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f9187e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f9188f = new AtomicReference("2.825731049.-1");

    public a11(dw0 dw0Var, j11 j11Var, s11 s11Var, g21 g21Var, ExecutorService executorService) {
        this.f9183a = dw0Var;
        this.f9184b = j11Var;
        this.f9185c = s11Var;
        this.f9186d = g21Var;
        this.f9187e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final n81 a() {
        n81 n81VarS = n81.s(this.f9184b.a());
        o5 o5Var = o5.C;
        k81 k81Var = k81.f13081a;
        final int i4 = 0;
        w71 w71VarF = yo0.F(yo0.G(yo0.C(n81VarS, Throwable.class, o5Var, k81Var), new z21(this) { // from class: com.google.android.gms.internal.ads.z01

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a11 f18953b;

            {
                this.f18953b = this;
            }

            @Override // com.google.android.gms.internal.ads.z21
            public final Object apply(Object obj) {
                switch (i4) {
                    case 0:
                        zy0 zy0Var = (zy0) obj;
                        a11 a11Var = this.f18953b;
                        if (a11Var.f9185c.a(zy0Var) && zy0Var != null) {
                            return new Boolean(true);
                        }
                        a11Var.f9186d.b(15003);
                        throw new ac.m(1);
                    default:
                        xv0 xv0Var = (xv0) obj;
                        if (xv0Var == null) {
                            throw new ac.m(3);
                        }
                        File file = xv0Var.f18516b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        a11 a11Var2 = this.f18953b;
                        a11Var2.f9186d.f(15002, new uh0(15, a11Var2, xv0Var));
                        return new Boolean(true);
                }
            }
        }, k81Var), new fp(16, this), k81Var);
        final int i10 = 1;
        return yo0.G(yo0.G(w71VarF, new z21(this) { // from class: com.google.android.gms.internal.ads.z01

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a11 f18953b;

            {
                this.f18953b = this;
            }

            @Override // com.google.android.gms.internal.ads.z21
            public final Object apply(Object obj) {
                switch (i10) {
                    case 0:
                        zy0 zy0Var = (zy0) obj;
                        a11 a11Var = this.f18953b;
                        if (a11Var.f9185c.a(zy0Var) && zy0Var != null) {
                            return new Boolean(true);
                        }
                        a11Var.f9186d.b(15003);
                        throw new ac.m(1);
                    default:
                        xv0 xv0Var = (xv0) obj;
                        if (xv0Var == null) {
                            throw new ac.m(3);
                        }
                        File file = xv0Var.f18516b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        a11 a11Var2 = this.f18953b;
                        a11Var2.f9186d.f(15002, new uh0(15, a11Var2, xv0Var));
                        return new Boolean(true);
                }
            }
        }, k81Var), o5.B, k81Var);
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final String b() {
        return (String) this.f9188f.get();
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final h91 c(Context context, View view, Activity activity) {
        return yo0.z(this.f9187e, new ib0(this, context, view, activity, 2));
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final void d(InputEvent inputEvent) {
        aw0 aw0VarB = this.f9183a.b();
        g21 g21Var = this.f9186d;
        if (aw0VarB == null) {
            g21Var.b(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                aw0VarB.h((MotionEvent) inputEvent);
            } catch (bw0 e2) {
                g21Var.d(15005, e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final int e() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final h91 f(Context context) {
        return yo0.z(this.f9187e, new ae(12, this, context));
    }

    @Override // com.google.android.gms.internal.ads.y01
    public final h91 g(Context context, String str, View view) {
        return yo0.z(this.f9187e, new ib0(this, context, str, view, 3));
    }
}
