package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.wi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2081wi implements InterfaceC2029vk {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17466a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17467b;

    public /* synthetic */ C2081wi(int i, Object obj) {
        this.f17466a = i;
        this.f17467b = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2029vk
    public final void c(Context context) {
        C1123eu c1123eu;
        switch (this.f17466a) {
            case 0:
                try {
                    try {
                        InterfaceC0637Nc interfaceC0637Nc = ((C1392ju) this.f17467b).f15016a;
                        interfaceC0637Nc.n();
                        if (context != null) {
                            try {
                                interfaceC0637Nc.m0(new S2.b(context));
                                return;
                            } finally {
                            }
                        }
                        return;
                    } finally {
                    }
                } catch (C1123eu e6) {
                    u2.k.i("Cannot invoke onResume for the mediation adapter.", e6);
                    return;
                }
            default:
                InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f17467b;
                if (interfaceC0828Yg != null) {
                    interfaceC0828Yg.onResume();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2029vk
    public final void f(Context context) throws C1123eu {
        switch (this.f17466a) {
            case 0:
                try {
                    try {
                        ((C1392ju) this.f17467b).f15016a.j();
                        return;
                    } catch (Throwable th) {
                        throw new C1123eu(th);
                    }
                } catch (C1123eu e6) {
                    u2.k.i("Cannot invoke onDestroy for the mediation adapter.", e6);
                    return;
                }
            default:
                InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f17467b;
                if (interfaceC0828Yg != null) {
                    interfaceC0828Yg.destroy();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2029vk
    public final void u(Context context) throws C1123eu {
        switch (this.f17466a) {
            case 0:
                try {
                    try {
                        ((C1392ju) this.f17467b).f15016a.i();
                        return;
                    } catch (Throwable th) {
                        throw new C1123eu(th);
                    }
                } catch (C1123eu e6) {
                    u2.k.i("Cannot invoke onPause for the mediation adapter.", e6);
                    return;
                }
            default:
                InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) this.f17467b;
                if (interfaceC0828Yg != null) {
                    interfaceC0828Yg.onPause();
                    return;
                }
                return;
        }
    }
}
