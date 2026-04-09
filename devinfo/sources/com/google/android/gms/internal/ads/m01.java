package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m01 implements az0 {

    /* renamed from: a, reason: collision with root package name */
    public final cs1 f13701a;

    /* renamed from: b, reason: collision with root package name */
    public final cs1 f13702b;

    /* renamed from: c, reason: collision with root package name */
    public final cs1 f13703c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13704d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13705e;

    public m01(cs1 cs1Var, cs1 cs1Var2, cs1 cs1Var3, boolean z3, long j) {
        this.f13701a = cs1Var;
        this.f13702b = cs1Var2;
        this.f13703c = cs1Var3;
        this.f13704d = z3;
        this.f13705e = j;
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final vd.b a() {
        boolean z3 = this.f13704d;
        k81 k81Var = k81.f13081a;
        if (z3) {
            final int i4 = 1;
            w71 w71VarF = yo0.F(yo0.C(n81.s(((t01) this.f13701a.a()).a()), Throwable.class, o5.f14559v, k81Var), new e81(this) { // from class: com.google.android.gms.internal.ads.l01

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m01 f13316b;

                {
                    this.f13316b = this;
                }

                @Override // com.google.android.gms.internal.ads.e81
                public final /* synthetic */ vd.b c(Object obj) {
                    switch (i4) {
                        case 0:
                            return ((y01) this.f13316b.f13702b.a()).a();
                        case 1:
                            return ((i11) this.f13316b.f13703c.a()).b();
                        default:
                            return ((y01) this.f13316b.f13702b.a()).a();
                    }
                }
            }, k81Var);
            final int i10 = 2;
            return yo0.F(w71VarF, new e81(this) { // from class: com.google.android.gms.internal.ads.l01

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m01 f13316b;

                {
                    this.f13316b = this;
                }

                @Override // com.google.android.gms.internal.ads.e81
                public final /* synthetic */ vd.b c(Object obj) {
                    switch (i10) {
                        case 0:
                            return ((y01) this.f13316b.f13702b.a()).a();
                        case 1:
                            return ((i11) this.f13316b.f13703c.a()).b();
                        default:
                            return ((y01) this.f13316b.f13702b.a()).a();
                    }
                }
            }, k81Var);
        }
        final int i11 = 0;
        w71 w71VarF2 = yo0.F(yo0.C(n81.s(((i11) this.f13703c.a()).b()), Throwable.class, o5.f14560w, k81Var), new e81(this) { // from class: com.google.android.gms.internal.ads.l01

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m01 f13316b;

            {
                this.f13316b = this;
            }

            @Override // com.google.android.gms.internal.ads.e81
            public final /* synthetic */ vd.b c(Object obj) {
                switch (i11) {
                    case 0:
                        return ((y01) this.f13316b.f13702b.a()).a();
                    case 1:
                        return ((i11) this.f13316b.f13703c.a()).b();
                    default:
                        return ((y01) this.f13316b.f13702b.a()).a();
                }
            }
        }, k81Var);
        w71VarF2.a(new du0(5, this), k81Var);
        return w71VarF2;
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final String b() {
        return ((y01) this.f13702b.a()).b();
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final vd.b c(Context context, View view, Activity activity) {
        return ((y01) this.f13702b.a()).c(context, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final void d(InputEvent inputEvent) {
        ((y01) this.f13702b.a()).d(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final int e() {
        return ((y01) this.f13702b.a()).e();
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final vd.b f(Context context) {
        return ((y01) this.f13702b.a()).f(context);
    }

    @Override // com.google.android.gms.internal.ads.az0
    public final vd.b g(Context context, String str, View view) {
        return ((y01) this.f13702b.a()).g(context, str, view);
    }
}
