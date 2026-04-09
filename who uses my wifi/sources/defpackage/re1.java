package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class re1 extends b92 implements wv1 {
    public final AdOverlayInfoParcel g;
    public final Activity h;
    public final boolean l;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean m = false;
    public boolean n = false;

    public re1(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        fc2 fc2Var;
        boolean z = false;
        this.g = adOverlayInfoParcel;
        this.h = activity;
        iz1 iz1Var = mz1.g5;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if ((((Boolean) kz1Var.a(iz1Var)).booleanValue() || ((Boolean) kz1Var2.a(mz1.h5)).booleanValue() || ((Boolean) kz1Var2.a(mz1.l5)).booleanValue()) && (fc2Var = adOverlayInfoParcel.f) != null && fc2Var.o && Build.MANUFACTURER.matches((String) kz1Var2.a(mz1.j5)) && Build.MODEL.matches((String) kz1Var2.a(mz1.k5))) {
            z = true;
        }
        this.l = z;
    }

    public final synchronized void B3() {
        try {
            if (!this.j) {
                ye4 ye4Var = this.g.h;
                if (ye4Var != null) {
                    ye4Var.G1(4);
                }
                this.j = true;
                if (this.l) {
                    if (((Boolean) tw1.e.c.a(mz1.l5)).booleanValue()) {
                        hg4.C.g.h(this);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.c92
    public final void S() {
        if (this.h.isFinishing()) {
            B3();
        }
    }

    @Override // defpackage.wv1
    public final void T(boolean z) {
        if (!z) {
            this.n = true;
        } else if (this.n) {
            gi2.U("Foregrounded: finishing activity from LauncherOverlay");
            this.h.finish();
        }
    }

    @Override // defpackage.c92
    public final void X2(Bundle bundle) {
        ye4 ye4Var;
        iz1 iz1Var = mz1.G9;
        tw1 tw1Var = tw1.e;
        boolean zBooleanValue = ((Boolean) tw1Var.c.a(iz1Var)).booleanValue();
        Activity activity = this.h;
        if (zBooleanValue && !this.k) {
            activity.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.g;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            fd1 fd1Var = adOverlayInfoParcel.g;
            if (fd1Var != null) {
                fd1Var.C();
            }
            xp2 xp2Var = adOverlayInfoParcel.z;
            if (xp2Var != null) {
                xp2Var.s0();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (ye4Var = adOverlayInfoParcel.h) != null) {
                ye4Var.f();
            }
        }
        if (this.l) {
            if (((Boolean) tw1Var.c.a(mz1.l5)).booleanValue()) {
                hg4.C.g.f(this);
            }
        }
        fc2 fc2Var = adOverlayInfoParcel.f;
        kf1 kf1Var = adOverlayInfoParcel.n;
        us0 us0Var = hg4.C.a;
        id1 id1Var = fc2Var.n;
        Activity activity2 = this.h;
        if (us0.t(activity2, fc2Var, kf1Var, id1Var, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // defpackage.c92
    public final void c() {
        ye4 ye4Var = this.g.h;
        if (ye4Var != null) {
            ye4Var.R2();
        }
    }

    @Override // defpackage.c92
    public final void c0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.i);
    }

    @Override // defpackage.c92
    public final boolean e() {
        return ((Boolean) tw1.e.c.a(mz1.h5)).booleanValue() && this.l && this.m;
    }

    @Override // defpackage.c92
    public final void i() {
        this.m = false;
        ye4 ye4Var = this.g.h;
        if (ye4Var != null) {
            ye4Var.U();
        }
        if (this.h.isFinishing()) {
            B3();
        }
    }

    @Override // defpackage.c92
    public final void k() {
        if (this.i) {
            gi2.G("LauncherOverlay finishing activity");
            this.h.finish();
            return;
        }
        this.i = true;
        this.m = true;
        ye4 ye4Var = this.g.h;
        if (ye4Var != null) {
            ye4Var.B1();
        }
        if (this.l) {
            if (((Boolean) tw1.e.c.a(mz1.g5)).booleanValue()) {
                lf4.l.postDelayed(new a9(25, this), ((Integer) r1.c.a(mz1.i5)).intValue());
            }
        }
    }

    @Override // defpackage.c92
    public final void u() {
        this.k = true;
    }

    @Override // defpackage.c92
    public final void x() {
        if (this.h.isFinishing()) {
            B3();
        }
    }

    @Override // defpackage.c92
    public final void b() {
    }

    @Override // defpackage.c92
    public final void g() {
    }

    @Override // defpackage.c92
    public final void j() {
    }

    @Override // defpackage.c92
    public final void D(u10 u10Var) {
    }

    @Override // defpackage.c92
    public final void O1(int i, String[] strArr, int[] iArr) {
    }

    @Override // defpackage.c92
    public final void V1(int i, int i2, Intent intent) {
    }
}
