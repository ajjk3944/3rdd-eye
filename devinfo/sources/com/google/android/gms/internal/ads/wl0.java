package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wl0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18053a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18054b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18055c;

    public /* synthetic */ wl0(int i4, Object obj, boolean z3) {
        this.f18053a = i4;
        this.f18054b = obj;
        this.f18055c = z3;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) {
        switch (this.f18053a) {
            case 0:
                String str = (String) this.f18054b;
                t50 t50Var = (t50) obj;
                if (str != null) {
                    Bundle bundleA = mq0.a(t50Var.f16705a, "pii");
                    bundleA.putString("afai", str);
                    bundleA.putBoolean("is_afai_lat", this.f18055c);
                    break;
                }
                break;
            case 1:
                Bundle bundle = ((t50) obj).f16705a;
                bundle.putString("gct", (String) this.f18054b);
                if (this.f18055c) {
                    bundle.putString("de", "1");
                    break;
                }
                break;
            default:
                Bundle bundle2 = ((t50) obj).f16705a;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16195k6)).booleanValue()) {
                    bundle2.putBoolean("app_switched", this.f18055c);
                }
                va.f3 f3Var = (va.f3) this.f18054b;
                if (f3Var != null) {
                    int i4 = f3Var.f36093a;
                    if (i4 != 1) {
                        if (i4 == 2) {
                            bundle2.putString("avo", "l");
                            break;
                        }
                    } else {
                        bundle2.putString("avo", "p");
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
        switch (this.f18053a) {
            case 1:
                ((t50) obj).f16706b.putString("gct", (String) this.f18054b);
                break;
        }
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }
}
