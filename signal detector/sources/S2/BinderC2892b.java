package s2;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC0655Od;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.G9;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC2084wl;
import com.google.android.gms.internal.ads.T7;
import n1.RunnableC2683a;
import q2.C2841s;
import q2.InterfaceC2806a;
import t2.AbstractC2907C;
import t2.C2911G;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2892b extends AbstractBinderC0655Od implements T7 {

    /* renamed from: b, reason: collision with root package name */
    public final AdOverlayInfoParcel f23443b;

    /* renamed from: c, reason: collision with root package name */
    public final Activity f23444c;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23448g;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23445d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23446e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23447f = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23449h = false;
    public boolean i = false;

    public BinderC2892b(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        e eVar;
        boolean z6 = false;
        this.f23443b = adOverlayInfoParcel;
        this.f23444c = activity;
        E9 e9 = H9.f8859x5;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if ((((Boolean) g9.a(e9)).booleanValue() || ((Boolean) g92.a(H9.f8864y5)).booleanValue() || ((Boolean) g92.a(H9.f8574C5)).booleanValue()) && (eVar = adOverlayInfoParcel.f6863a) != null && eVar.f23480j && Build.MANUFACTURER.matches((String) g92.a(H9.f8562A5)) && Build.MODEL.matches((String) g92.a(H9.f8568B5))) {
            z6 = true;
        }
        this.f23448g = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void I() {
        if (this.f23444c.isFinishing()) {
            K3();
        }
    }

    public final synchronized void K3() {
        try {
            if (!this.f23446e) {
                k kVar = this.f23443b.f6865c;
                if (kVar != null) {
                    kVar.k0(4);
                }
                this.f23446e = true;
                if (this.f23448g) {
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8574C5)).booleanValue()) {
                        p2.j.f22785C.f22794g.n(this);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void d() {
        k kVar = this.f23443b.f6865c;
        if (kVar != null) {
            kVar.N2();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final boolean e() {
        return ((Boolean) C2841s.f23267e.f23270c.a(H9.f8864y5)).booleanValue() && this.f23448g && this.f23449h;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final void g0(boolean z6) {
        if (!z6) {
            this.i = true;
        } else if (this.i) {
            u2.k.c("Foregrounded: finishing activity from LauncherOverlay");
            this.f23444c.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void g1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f23445d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void i() {
        this.f23449h = false;
        k kVar = this.f23443b.f6865c;
        if (kVar != null) {
            kVar.x1();
        }
        if (this.f23444c.isFinishing()) {
            K3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void k() {
        if (this.f23445d) {
            AbstractC2907C.m("LauncherOverlay finishing activity");
            this.f23444c.finish();
            return;
        }
        this.f23445d = true;
        this.f23449h = true;
        k kVar = this.f23443b.f6865c;
        if (kVar != null) {
            kVar.R1();
        }
        if (this.f23448g) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8859x5)).booleanValue()) {
                C2911G.f23576l.postDelayed(new RunnableC2683a(7, this), ((Integer) r1.f23270c.a(H9.f8871z5)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void r() {
        this.f23447f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void r3(Bundle bundle) {
        k kVar;
        E9 e9 = H9.da;
        C2841s c2841s = C2841s.f23267e;
        boolean zBooleanValue = ((Boolean) c2841s.f23270c.a(e9)).booleanValue();
        Activity activity = this.f23444c;
        if (zBooleanValue && !this.f23447f) {
            activity.requestWindowFeature(1);
        }
        boolean z6 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z6 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23443b;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z6) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            InterfaceC2806a interfaceC2806a = adOverlayInfoParcel.f6864b;
            if (interfaceC2806a != null) {
                interfaceC2806a.onAdClicked();
            }
            InterfaceC2084wl interfaceC2084wl = adOverlayInfoParcel.f6859I;
            if (interfaceC2084wl != null) {
                interfaceC2084wl.L();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (kVar = adOverlayInfoParcel.f6865c) != null) {
                kVar.g();
            }
        }
        if (this.f23448g) {
            if (((Boolean) c2841s.f23270c.a(H9.f8574C5)).booleanValue()) {
                p2.j.f22785C.f22794g.l(this);
            }
        }
        e eVar = adOverlayInfoParcel.f6863a;
        InterfaceC2893c interfaceC2893c = adOverlayInfoParcel.i;
        p1.e eVar2 = p2.j.f22785C.f22788a;
        InterfaceC2891a interfaceC2891a = eVar.i;
        Activity activity2 = this.f23444c;
        if (p1.e.m(activity2, eVar, interfaceC2893c, interfaceC2891a, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void y() {
        if (this.f23444c.isFinishing()) {
            K3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void L(S2.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void b1(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void l1(int i, int i3, Intent intent) {
    }
}
