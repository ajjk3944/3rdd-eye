package com.google.android.gms.internal.ads;

import com.lefan.signal.MyApplication;
import com.lefan.signal.activity.SplashActivity;
import j$.util.Objects;
import j2.C2556l;

/* renamed from: com.google.android.gms.internal.ads.Mo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632Mo extends E2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9906d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9908f;

    public C0632Mo(Z3.c cVar, MyApplication myApplication) {
        this.f9907e = cVar;
        this.f9908f = myApplication;
    }

    @Override // j2.u
    public final void c(C2556l c2556l) {
        switch (this.f9906d) {
            case 0:
                ((BinderC0751To) this.f9908f).M3(BinderC0751To.P3(c2556l));
                break;
            default:
                ((MyApplication) this.f9908f).f18820c = false;
                ((Z3.c) this.f9907e).f4530a = 0L;
                SplashActivity splashActivity = MyApplication.f18813e;
                if (splashActivity != null) {
                    splashActivity.E();
                    break;
                }
                break;
        }
    }

    @Override // j2.u
    public final void f(Object obj) {
        switch (this.f9906d) {
            case 0:
                ((BinderC0751To) this.f9908f).L3((C1029d8) obj, (String) this.f9907e);
                break;
            default:
                C1029d8 c1029d8 = (C1029d8) obj;
                q5.i.e(c1029d8, "ad");
                Z3.c cVar = (Z3.c) this.f9907e;
                cVar.f4531b = c1029d8;
                ((MyApplication) this.f9908f).f18820c = false;
                cVar.f4530a = System.currentTimeMillis();
                SplashActivity splashActivity = MyApplication.f18813e;
                if (splashActivity != null) {
                    splashActivity.D();
                    break;
                }
                break;
        }
    }

    public C0632Mo(BinderC0751To binderC0751To, String str) {
        this.f9907e = str;
        Objects.requireNonNull(binderC0751To);
        this.f9908f = binderC0751To;
    }
}
