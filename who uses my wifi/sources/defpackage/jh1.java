package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jh1 extends b92 {
    public static final int D = Color.argb(0, 0, 0, 0);
    public Toolbar A;
    public final /* synthetic */ int C;
    public final Activity g;
    public AdOverlayInfoParcel h;
    public ag2 i;
    public r2 j;
    public tg4 k;
    public FrameLayout m;
    public WebChromeClient.CustomViewCallback n;
    public m74 q;
    public bs2 u;
    public boolean v;
    public boolean w;
    public boolean l = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = false;
    public int B = 1;
    public final Object s = new Object();
    public final m1 t = new m1(7, this);
    public boolean x = false;
    public boolean y = false;
    public boolean z = true;

    public jh1(Activity activity, int i) {
        this.C = i;
        this.g = activity;
    }

    public static final void F3(View view, xz2 xz2Var) {
        if (xz2Var == null || view == null) {
            return;
        }
        if (((Boolean) tw1.e.c.a(mz1.I5)).booleanValue() && ((wb3) xz2Var.b.l) == wb3.g) {
            return;
        }
        su2 su2Var = hg4.C.x;
        xb3 xb3Var = xz2Var.a;
        su2Var.getClass();
        su2.k(xb3Var, view);
    }

    public final void B3() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        ye4 ye4Var;
        if (!this.g.isFinishing() || this.x) {
            return;
        }
        this.x = true;
        ag2 ag2Var = this.i;
        if (ag2Var != null) {
            ag2Var.h0(this.B - 1);
            synchronized (this.s) {
                try {
                    if (!this.v && this.i.B0()) {
                        iz1 iz1Var = mz1.u5;
                        tw1 tw1Var = tw1.e;
                        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && !this.y && (adOverlayInfoParcel = this.h) != null && (ye4Var = adOverlayInfoParcel.h) != null) {
                            ye4Var.M1();
                        }
                        bs2 bs2Var = new bs2(14, this);
                        this.u = bs2Var;
                        lf4.l.postDelayed(bs2Var, ((Long) tw1Var.c.a(mz1.g1)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        C3();
    }

    public final void C3() {
        ag2 ag2Var;
        ye4 ye4Var;
        if (this.y) {
            return;
        }
        this.y = true;
        ag2 ag2Var2 = this.i;
        if (ag2Var2 != null) {
            this.q.removeView(ag2Var2.p0());
            r2 r2Var = this.j;
            if (r2Var != null) {
                this.i.M0((Context) r2Var.j);
                this.i.P0(false);
                if (((Boolean) tw1.e.c.a(mz1.wd)).booleanValue() && this.i.getParent() != null) {
                    ((ViewGroup) this.i.getParent()).removeView(this.i.p0());
                }
                ViewGroup viewGroup = (ViewGroup) this.j.i;
                View viewP0 = this.i.p0();
                r2 r2Var2 = this.j;
                viewGroup.addView(viewP0, r2Var2.g, (ViewGroup.LayoutParams) r2Var2.h);
                this.j = null;
            } else {
                Activity activity = this.g;
                if (activity.getApplicationContext() != null) {
                    this.i.M0(activity.getApplicationContext());
                }
            }
            this.i = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel != null && (ye4Var = adOverlayInfoParcel.h) != null) {
            ye4Var.G1(this.B);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.h;
        if (adOverlayInfoParcel2 == null || (ag2Var = adOverlayInfoParcel2.i) == null) {
            return;
        }
        F3(this.h.i.p0(), ag2Var.k0());
    }

    @Override // defpackage.c92
    public final void D(u10 u10Var) {
        D3((Configuration) oi0.l1(u10Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D3(android.content.res.Configuration r15) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh1.D3(android.content.res.Configuration):void");
    }

    public final void E3(View view) {
        xz2 xz2VarK0;
        wz2 wz2VarW0;
        ag2 ag2Var = this.i;
        if (ag2Var == null) {
            return;
        }
        iz1 iz1Var = mz1.J5;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && (wz2VarW0 = ag2Var.W0()) != null) {
            synchronized (wz2VarW0) {
                cc3 cc3Var = wz2VarW0.f;
                if (cc3Var != null) {
                    hg4.C.x.getClass();
                    su2.t(new sz2(cc3Var, view, 1));
                    return;
                }
                return;
            }
        }
        if (((Boolean) tw1Var.c.a(mz1.I5)).booleanValue() && (xz2VarK0 = ag2Var.k0()) != null && ((wb3) xz2VarK0.b.l) == wb3.g) {
            su2 su2Var = hg4.C.x;
            xb3 xb3Var = xz2VarK0.a;
            su2Var.getClass();
            su2.t(new rz2(xb3Var, view, 0));
        }
    }

    public final void G3(boolean z) throws JSONException {
        if (this.h.B) {
            return;
        }
        iz1 iz1Var = mz1.z5;
        tw1 tw1Var = tw1.e;
        int iIntValue = ((Integer) tw1Var.c.a(iz1Var)).intValue();
        boolean z2 = ((Boolean) tw1Var.c.a(mz1.j1)).booleanValue() || z;
        e71 e71Var = new e71();
        e71Var.a = 0;
        e71Var.b = 0;
        e71Var.c = 0;
        e71Var.d = 50;
        e71Var.a = true != z2 ? 0 : iIntValue;
        e71Var.b = true != z2 ? iIntValue : 0;
        e71Var.c = iIntValue;
        this.k = new tg4(this.g, e71Var, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        H3(z, this.h.l);
        this.q.addView(this.k, layoutParams);
        E3(this.k);
    }

    public final void H3(boolean z, boolean z2) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zb4 zb4Var;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        zb4 zb4Var2;
        iz1 iz1Var = mz1.h1;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        boolean zBooleanValue = ((Boolean) kz1Var.a(iz1Var)).booleanValue();
        boolean z3 = true;
        boolean z4 = zBooleanValue && (adOverlayInfoParcel2 = this.h) != null && (zb4Var2 = adOverlayInfoParcel2.t) != null && zb4Var2.m;
        boolean z5 = ((Boolean) kz1Var2.a(mz1.i1)).booleanValue() && (adOverlayInfoParcel = this.h) != null && (zb4Var = adOverlayInfoParcel.t) != null && zb4Var.n;
        if (z && z2 && z4 && !z5) {
            ag2 ag2Var = this.i;
            try {
                JSONObject jSONObjectPut = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                if (ag2Var != null) {
                    ag2Var.c("onError", jSONObjectPut);
                }
            } catch (JSONException e) {
                gi2.c0("Error occurred while dispatching error event.", e);
            }
        }
        tg4 tg4Var = this.k;
        if (tg4Var != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            ImageButton imageButton = tg4Var.f;
            if (!z3) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) kz1Var2.a(mz1.l1)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    public final void I3(int i) {
        int i2;
        Activity activity = this.g;
        int i3 = activity.getApplicationInfo().targetSdkVersion;
        iz1 iz1Var = mz1.r6;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (i3 < ((Integer) kz1Var.a(iz1Var)).intValue() || activity.getApplicationInfo().targetSdkVersion > ((Integer) kz1Var2.a(mz1.s6)).intValue() || (i2 = Build.VERSION.SDK_INT) < ((Integer) kz1Var2.a(mz1.t6)).intValue() || i2 > ((Integer) kz1Var2.a(mz1.u6)).intValue()) {
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable th) {
                hg4.C.h.e("AdOverlay.setRequestedOrientation", th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J3(boolean r43) throws org.json.JSONException, defpackage.ht3 {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh1.J3(boolean):void");
    }

    @Override // defpackage.c92
    public final void O1(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.g;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.h;
            try {
                adOverlayInfoParcel.A.U2(strArr, iArr, new oi0(new iz2(activity, adOverlayInfoParcel.p == 5 ? this : null, null, null)));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // defpackage.c92
    public final void S() {
        ye4 ye4Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel != null && (ye4Var = adOverlayInfoParcel.h) != null) {
            ye4Var.m2();
        }
        if (((Boolean) tw1.e.c.a(mz1.w5)).booleanValue() && this.i != null && (!this.g.isFinishing() || this.j == null)) {
            this.i.onPause();
        }
        B3();
    }

    @Override // defpackage.c92
    public final void V1(int i, int i2, Intent intent) {
        mv2 mv2Var;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            iz1 iz1Var = mz1.Ud;
            tw1 tw1Var = tw1.e;
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i2);
                gi2.G(sb.toString());
                ag2 ag2Var = this.i;
                if (ag2Var == null || ag2Var.e0() == null || (mv2Var = ag2Var.e0().E) == null || (adOverlayInfoParcel = this.h) == null || !((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                    return;
                }
                lv2 lv2VarA = mv2Var.a();
                lv2VarA.k("action", "hilca");
                String str = adOverlayInfoParcel.v;
                if (str == null) {
                    str = "";
                }
                lv2VarA.k("gqi", str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length());
                sb2.append(i2);
                lv2VarA.k("hilr", sb2.toString());
                if (i2 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        lv2VarA.k("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        lv2VarA.k("hills", stringExtra2);
                    }
                }
                lv2VarA.o();
            }
        }
    }

    @Override // defpackage.c92
    public void X2(Bundle bundle) throws JSONException, ht3 {
        ye4 ye4Var;
        switch (this.C) {
            case 4:
                gi2.G("AdOverlayParcel is null or does not contain valid overlay type.");
                this.B = 4;
                this.g.finish();
                return;
            default:
                if (!this.w) {
                    this.g.requestWindowFeature(1);
                }
                this.o = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
                try {
                    Activity activity = this.g;
                    AdOverlayInfoParcel adOverlayInfoParcelA = AdOverlayInfoParcel.a(activity.getIntent());
                    this.h = adOverlayInfoParcelA;
                    if (adOverlayInfoParcelA == null) {
                        throw new ht3("Could not get info for ad overlay.");
                    }
                    if (adOverlayInfoParcelA.B) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            activity.setShowWhenLocked(true);
                        } else {
                            activity.getWindow().addFlags(524288);
                        }
                    }
                    if (this.h.r.h > 7500000) {
                        this.B = 4;
                    }
                    if (activity.getIntent() != null) {
                        this.z = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = this.h;
                    zb4 zb4Var = adOverlayInfoParcel.t;
                    if (zb4Var != null) {
                        boolean z = zb4Var.f;
                        this.p = z;
                        if (z) {
                            if (adOverlayInfoParcel.p != 5 && zb4Var.k != -1) {
                                new gc2(this).r1();
                            }
                        }
                    } else if (adOverlayInfoParcel.p == 5) {
                        this.p = true;
                        if (adOverlayInfoParcel.p != 5) {
                            new gc2(this).r1();
                        }
                    } else {
                        this.p = false;
                    }
                    if (bundle == null) {
                        if (this.z) {
                            an2 an2Var = this.h.y;
                            if (an2Var != null) {
                                synchronized (an2Var) {
                                    ScheduledFuture scheduledFuture = an2Var.j;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(true);
                                    }
                                }
                            }
                            ye4 ye4Var2 = this.h.h;
                            if (ye4Var2 != null) {
                                ye4Var2.f();
                            }
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel2 = this.h;
                        if (adOverlayInfoParcel2.p != 1) {
                            fd1 fd1Var = adOverlayInfoParcel2.g;
                            if (fd1Var != null) {
                                fd1Var.C();
                            }
                            xp2 xp2Var = this.h.z;
                            if (xp2Var != null) {
                                xp2Var.s0();
                            }
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.h;
                    if (adOverlayInfoParcel3 != null && (ye4Var = adOverlayInfoParcel3.h) != null) {
                        ye4Var.f3();
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel4 = this.h;
                    m74 m74Var = new m74(activity, adOverlayInfoParcel4.s, adOverlayInfoParcel4.r.f, adOverlayInfoParcel4.x);
                    this.q = m74Var;
                    m74Var.setId(1000);
                    hg4.C.f.V(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel5 = this.h;
                    int i = adOverlayInfoParcel5.p;
                    if (i == 1) {
                        J3(false);
                        return;
                    }
                    if (i == 2) {
                        this.j = new r2(adOverlayInfoParcel5.i);
                        J3(false);
                        return;
                    } else if (i == 3) {
                        J3(true);
                        return;
                    } else {
                        if (i != 5) {
                            throw new ht3("Could not determine ad overlay type.");
                        }
                        J3(false);
                        return;
                    }
                } catch (ht3 e) {
                    gi2.i0(e.getMessage());
                    this.B = 4;
                    this.g.finish();
                    return;
                }
        }
    }

    @Override // defpackage.c92
    public final void b() {
        this.B = 1;
    }

    @Override // defpackage.c92
    public final void c() {
        ye4 ye4Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel == null || (ye4Var = adOverlayInfoParcel.h) == null) {
            return;
        }
        ye4Var.R2();
    }

    @Override // defpackage.c92
    public final void c0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.o);
    }

    @Override // defpackage.c92
    public final boolean e() {
        this.B = 1;
        if (this.i == null) {
            return true;
        }
        if (((Boolean) tw1.e.c.a(mz1.I9)).booleanValue() && this.i.canGoBack()) {
            this.i.goBack();
            return false;
        }
        boolean zR0 = this.i.R0();
        if (!zR0) {
            this.i.a("onbackblocked", Collections.EMPTY_MAP);
        }
        return zR0;
    }

    @Override // defpackage.c92
    public final void g() {
        ye4 ye4Var;
        if (((Boolean) tw1.e.c.a(mz1.w5)).booleanValue()) {
            ag2 ag2Var = this.i;
            if (ag2Var == null || ag2Var.o0()) {
                gi2.i0("The webview does not exist. Ignoring action.");
            } else {
                this.i.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel == null || (ye4Var = adOverlayInfoParcel.h) == null) {
            return;
        }
        ye4Var.Y();
    }

    @Override // defpackage.c92
    public final void i() {
        ye4 ye4Var;
        r();
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel != null && (ye4Var = adOverlayInfoParcel.h) != null) {
            ye4Var.U();
        }
        if (!((Boolean) tw1.e.c.a(mz1.w5)).booleanValue() && this.i != null && (!this.g.isFinishing() || this.j == null)) {
            this.i.onPause();
        }
        B3();
    }

    @Override // defpackage.c92
    public final void j() {
        ye4 ye4Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel == null || (ye4Var = adOverlayInfoParcel.h) == null) {
            return;
        }
        ye4Var.E1();
    }

    @Override // defpackage.c92
    public final void k() {
        ye4 ye4Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel != null && (ye4Var = adOverlayInfoParcel.h) != null) {
            ye4Var.B1();
        }
        D3(this.g.getResources().getConfiguration());
        if (((Boolean) tw1.e.c.a(mz1.w5)).booleanValue()) {
            return;
        }
        ag2 ag2Var = this.i;
        if (ag2Var == null || ag2Var.o0()) {
            gi2.i0("The webview does not exist. Ignoring action.");
        } else {
            this.i.onResume();
        }
    }

    public final void r() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel != null && this.l) {
            I3(adOverlayInfoParcel.o);
        }
        if (this.m != null) {
            this.g.setContentView(this.q);
            this.w = true;
            this.m.removeAllViews();
            this.m = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.n;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.n = null;
        }
        this.l = false;
    }

    @Override // defpackage.c92
    public final void u() {
        this.w = true;
    }

    @Override // defpackage.c92
    public final void x() {
        ye4 ye4Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel != null && (ye4Var = adOverlayInfoParcel.h) != null) {
            ye4Var.h3();
        }
        ag2 ag2Var = this.i;
        if (ag2Var != null) {
            try {
                this.q.removeView(ag2Var.p0());
            } catch (NullPointerException unused) {
            }
        }
        B3();
    }

    public final void y() {
        this.B = 3;
        Activity activity = this.g;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.h;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.p != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        ag2 ag2Var = this.i;
        if (ag2Var != null) {
            ag2Var.q0(null);
        }
    }
}
