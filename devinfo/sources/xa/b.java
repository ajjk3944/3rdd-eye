package xa;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.eh;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.rk;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.t80;
import p.o1;
import va.s;
import ya.a0;
import ya.f0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends et implements eh {

    /* renamed from: b, reason: collision with root package name */
    public final AdOverlayInfoParcel f37023b;

    /* renamed from: c, reason: collision with root package name */
    public final Activity f37024c;
    public final boolean g;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37025d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37026e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f37027f = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f37028h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f37029i = false;

    public b(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        e eVar;
        boolean z3 = false;
        this.f37023b = adOverlayInfoParcel;
        this.f37024c = activity;
        pk pkVar = sk.f16399x5;
        s sVar = s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if ((((Boolean) rkVar.a(pkVar)).booleanValue() || ((Boolean) rkVar2.a(sk.f16416y5)).booleanValue() || ((Boolean) rkVar2.a(sk.C5)).booleanValue()) && (eVar = adOverlayInfoParcel.f9019a) != null && eVar.j && Build.MANUFACTURER.matches((String) rkVar2.a(sk.A5)) && Build.MODEL.matches((String) rkVar2.a(sk.B5))) {
            z3 = true;
        }
        this.g = z3;
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void B1() {
        this.f37028h = false;
        l lVar = this.f37023b.f9021c;
        if (lVar != null) {
            lVar.u1();
        }
        if (this.f37024c.isFinishing()) {
            h4();
        }
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void D(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f37025d);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void D1() {
        if (this.f37025d) {
            a0.m("LauncherOverlay finishing activity");
            this.f37024c.finish();
            return;
        }
        this.f37025d = true;
        this.f37028h = true;
        l lVar = this.f37023b.f9021c;
        if (lVar != null) {
            lVar.k2();
        }
        if (this.g) {
            if (((Boolean) s.f36163e.f36166c.a(sk.f16399x5)).booleanValue()) {
                f0.f37440l.postDelayed(new o1(18, this), ((Integer) r1.f36166c.a(sk.f16432z5)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void J1() {
        this.f37027f = true;
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void P3(Bundle bundle) {
        l lVar;
        pk pkVar = sk.f16126fa;
        s sVar = s.f36163e;
        boolean zBooleanValue = ((Boolean) sVar.f36166c.a(pkVar)).booleanValue();
        Activity activity = this.f37024c;
        if (zBooleanValue && !this.f37027f) {
            activity.requestWindowFeature(1);
        }
        boolean z3 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z3 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f37023b;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z3) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            va.a aVar = adOverlayInfoParcel.f9020b;
            if (aVar != null) {
                aVar.onAdClicked();
            }
            t80 t80Var = adOverlayInfoParcel.f9037u;
            if (t80Var != null) {
                t80Var.x();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (lVar = adOverlayInfoParcel.f9021c) != null) {
                lVar.z1();
            }
        }
        if (this.g) {
            if (((Boolean) sVar.f36166c.a(sk.C5)).booleanValue()) {
                ua.j.C.g.f(this);
            }
        }
        e eVar = adOverlayInfoParcel.f9019a;
        c cVar = adOverlayInfoParcel.f9026i;
        ja.c cVar2 = ua.j.C.f35259a;
        a aVar2 = eVar.f37038i;
        Activity activity2 = this.f37024c;
        if (ja.c.H(activity2, eVar, cVar, aVar2, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void R() {
        if (this.f37024c.isFinishing()) {
            h4();
        }
    }

    @Override // com.google.android.gms.internal.ads.eh
    public final void S(boolean z3) {
        if (!z3) {
            this.f37029i = true;
        } else if (this.f37029i) {
            za.i.c("Foregrounded: finishing activity from LauncherOverlay");
            this.f37024c.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void d() {
        l lVar = this.f37023b.f9021c;
        if (lVar != null) {
            lVar.h3();
        }
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final boolean e() {
        return ((Boolean) s.f36163e.f36166c.a(sk.f16416y5)).booleanValue() && this.g && this.f37028h;
    }

    public final synchronized void h4() {
        try {
            if (!this.f37026e) {
                l lVar = this.f37023b.f9021c;
                if (lVar != null) {
                    lVar.e0(4);
                }
                this.f37026e = true;
                if (this.g) {
                    if (((Boolean) s.f36163e.f36166c.a(sk.C5)).booleanValue()) {
                        ua.j.C.g.g(this);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void l() {
        if (this.f37024c.isFinishing()) {
            h4();
        }
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void A1() {
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void C1() {
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void v(vb.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void P0(int i4, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void Z0(int i4, int i10, Intent intent) {
    }
}
