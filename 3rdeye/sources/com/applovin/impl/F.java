package com.applovin.impl;

import C.C0626m;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import o0.b;
import v.C5658m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18799c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18801e;

    public /* synthetic */ F(Object obj, boolean z10, Object obj2, int i) {
        this.f18798b = i;
        this.f18800d = obj;
        this.f18799c = z10;
        this.f18801e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [v.g0, v.m$c] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18798b) {
            case 0:
                ((C2112c0) this.f18800d).a(this.f18799c, (Runnable) this.f18801e);
                break;
            case 1:
                l2.a(this.f18799c, (MaxAdListener) this.f18800d, (MaxAd) this.f18801e);
                break;
            case 2:
                l2.d(this.f18799c, (MaxAdViewAdListener) this.f18800d, (MaxAd) this.f18801e);
                break;
            default:
                final v.i0 i0Var = (v.i0) this.f18800d;
                boolean z10 = this.f18799c;
                final b.a aVar = (b.a) this.f18801e;
                C5658m c5658m = i0Var.f46711a;
                c5658m.f46752b.f46778a.remove(i0Var.i);
                i0Var.f46718h = z10;
                if (!i0Var.f46713c) {
                    aVar.d(new C0626m("Camera is not active."));
                    break;
                } else {
                    final long jV = i0Var.f46711a.v();
                    ?? r12 = new C5658m.c() { // from class: v.g0
                        @Override // v.C5658m.c
                        public final boolean a(TotalCaptureResult totalCaptureResult) {
                            i0 i0Var2 = i0Var;
                            i0Var2.getClass();
                            boolean z11 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
                            C.S.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z11);
                            if (z11 != i0Var2.f46718h || !C5658m.s(totalCaptureResult, jV)) {
                                return false;
                            }
                            C.S.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z11);
                            aVar.b(null);
                            return true;
                        }
                    };
                    i0Var.i = r12;
                    i0Var.f46711a.l(r12);
                    break;
                }
        }
    }

    public /* synthetic */ F(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd, int i) {
        this.f18798b = i;
        this.f18799c = z10;
        this.f18800d = maxAdListener;
        this.f18801e = maxAd;
    }
}
