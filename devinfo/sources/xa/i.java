package xa;

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
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.h80;
import com.google.android.gms.internal.ads.jh0;
import com.google.android.gms.internal.ads.m60;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.pl0;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.qz;
import com.google.android.gms.internal.ads.rk;
import com.google.android.gms.internal.ads.rt;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.t80;
import com.google.android.gms.internal.ads.th0;
import com.google.android.gms.internal.ads.uh0;
import com.google.android.gms.internal.ads.ut0;
import com.google.android.gms.internal.ads.vt0;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.ads.xh0;
import com.google.android.gms.internal.ads.xw;
import com.google.android.gms.internal.ads.zt0;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;
import p.o1;
import va.s;
import ya.a0;
import ya.b0;
import ya.f0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class i extends et {

    /* renamed from: x, reason: collision with root package name */
    public static final int f37043x = Color.argb(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final Activity f37044b;

    /* renamed from: c, reason: collision with root package name */
    public AdOverlayInfoParcel f37045c;

    /* renamed from: d, reason: collision with root package name */
    public qz f37046d;

    /* renamed from: e, reason: collision with root package name */
    public l7.d f37047e;

    /* renamed from: f, reason: collision with root package name */
    public m f37048f;

    /* renamed from: h, reason: collision with root package name */
    public FrameLayout f37049h;

    /* renamed from: i, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f37050i;

    /* renamed from: l, reason: collision with root package name */
    public h f37052l;

    /* renamed from: p, reason: collision with root package name */
    public o1 f37056p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f37057q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f37058r;

    /* renamed from: v, reason: collision with root package name */
    public Toolbar f37062v;
    public boolean g = false;
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f37051k = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f37053m = false;

    /* renamed from: w, reason: collision with root package name */
    public int f37063w = 1;

    /* renamed from: n, reason: collision with root package name */
    public final Object f37054n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final aa.j f37055o = new aa.j(15, this);

    /* renamed from: s, reason: collision with root package name */
    public boolean f37059s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f37060t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f37061u = true;

    public i(Activity activity) {
        this.f37044b = activity;
    }

    public static final void m4(View view, xh0 xh0Var) {
        if (xh0Var == null || view == null) {
            return;
        }
        if (((Boolean) s.f36163e.f36166c.a(sk.f16074c6)).booleanValue() && ((ut0) xh0Var.f18391b.g) == ut0.HTML) {
            return;
        }
        h80 h80Var = ua.j.C.f35280x;
        vt0 vt0Var = xh0Var.f18390a;
        h80Var.getClass();
        h80.l(vt0Var, view);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void A1() {
        l lVar;
        if (((Boolean) s.f36163e.f36166c.a(sk.Q5)).booleanValue()) {
            qz qzVar = this.f37046d;
            if (qzVar == null || qzVar.g0()) {
                za.i.h("The webview does not exist. Ignoring action.");
            } else {
                this.f37046d.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f37045c;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f9021c) == null) {
            return;
        }
        lVar.a2();
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void B1() {
        l lVar;
        h();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f37045c;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f9021c) != null) {
            lVar.u1();
        }
        if (!((Boolean) s.f36163e.f36166c.a(sk.Q5)).booleanValue() && this.f37046d != null && (!this.f37044b.isFinishing() || this.f37047e == null)) {
            this.f37046d.onPause();
        }
        h4();
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void C1() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f37045c;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f9021c) == null) {
            return;
        }
        lVar.T();
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void D(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.j);
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void D1() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f37045c;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f9021c) != null) {
            lVar.k2();
        }
        k4(this.f37044b.getResources().getConfiguration());
        if (((Boolean) s.f36163e.f36166c.a(sk.Q5)).booleanValue()) {
            return;
        }
        qz qzVar = this.f37046d;
        if (qzVar == null || qzVar.g0()) {
            za.i.h("The webview does not exist. Ignoring action.");
        } else {
            this.f37046d.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void J1() {
        this.f37058r = true;
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void P0(int i4, String[] strArr, int[] iArr) {
        if (i4 == 12345) {
            Activity activity = this.f37044b;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f37045c;
            try {
                adOverlayInfoParcel.f9038v.v1(strArr, iArr, new vb.b(new jh0(activity, adOverlayInfoParcel.f9027k == 5 ? this : null, null, null)));
            } catch (RemoteException unused) {
            }
        }
    }

    public void P3(Bundle bundle) throws JSONException, g {
        l lVar;
        if (!this.f37058r) {
            this.f37044b.requestWindowFeature(1);
        }
        this.j = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            Activity activity = this.f37044b;
            AdOverlayInfoParcel adOverlayInfoParcelA = AdOverlayInfoParcel.a(activity.getIntent());
            this.f37045c = adOverlayInfoParcelA;
            if (adOverlayInfoParcelA == null) {
                throw new g("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelA.f9039w) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.f37045c.f9029m.f38131c > 7500000) {
                this.f37063w = 4;
            }
            if (activity.getIntent() != null) {
                this.f37061u = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f37045c;
            ua.f fVar = adOverlayInfoParcel.f9031o;
            if (fVar != null) {
                boolean z3 = fVar.f35244a;
                this.f37051k = z3;
                if (z3) {
                    if (adOverlayInfoParcel.f9027k != 5 && fVar.f35249f != -1) {
                        new xw(this).A();
                    }
                }
            } else if (adOverlayInfoParcel.f9027k == 5) {
                this.f37051k = true;
                if (adOverlayInfoParcel.f9027k != 5) {
                    new xw(this).A();
                }
            } else {
                this.f37051k = false;
            }
            if (bundle == null) {
                if (this.f37061u) {
                    m60 m60Var = this.f37045c.f9036t;
                    if (m60Var != null) {
                        synchronized (m60Var) {
                            ScheduledFuture scheduledFuture = m60Var.f13775d;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(true);
                            }
                        }
                    }
                    l lVar2 = this.f37045c.f9021c;
                    if (lVar2 != null) {
                        lVar2.z1();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f37045c;
                if (adOverlayInfoParcel2.f9027k != 1) {
                    va.a aVar = adOverlayInfoParcel2.f9020b;
                    if (aVar != null) {
                        aVar.onAdClicked();
                    }
                    t80 t80Var = this.f37045c.f9037u;
                    if (t80Var != null) {
                        t80Var.x();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f37045c;
            if (adOverlayInfoParcel3 != null && (lVar = adOverlayInfoParcel3.f9021c) != null) {
                lVar.g1();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f37045c;
            h hVar = new h(activity, adOverlayInfoParcel4.f9030n, adOverlayInfoParcel4.f9029m.f38129a, adOverlayInfoParcel4.f9035s);
            this.f37052l = hVar;
            hVar.setId(1000);
            ua.j.C.f35264f.N(activity);
            AdOverlayInfoParcel adOverlayInfoParcel5 = this.f37045c;
            int i4 = adOverlayInfoParcel5.f9027k;
            if (i4 == 1) {
                q4(false);
                return;
            }
            if (i4 == 2) {
                this.f37047e = new l7.d(adOverlayInfoParcel5.f9022d);
                q4(false);
            } else if (i4 == 3) {
                q4(true);
            } else {
                if (i4 != 5) {
                    throw new g("Could not determine ad overlay type.");
                }
                q4(false);
            }
        } catch (g e2) {
            za.i.h(e2.getMessage());
            this.f37063w = 4;
            this.f37044b.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void R() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f37045c;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f9021c) != null) {
            lVar.r0();
        }
        if (((Boolean) s.f36163e.f36166c.a(sk.Q5)).booleanValue() && this.f37046d != null && (!this.f37044b.isFinishing() || this.f37047e == null)) {
            this.f37046d.onPause();
        }
        h4();
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void Z0(int i4, int i10, Intent intent) {
        qd0 qd0Var;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i4 == 236) {
            pk pkVar = sk.f16344te;
            s sVar = s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 66);
                sb2.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb2.append(i10);
                a0.m(sb2.toString());
                qz qzVar = this.f37046d;
                if (qzVar == null || qzVar.X() == null || (qd0Var = qzVar.X().f12104z) == null || (adOverlayInfoParcel = this.f37045c) == null || !((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                    return;
                }
                rt rtVarA = qd0Var.a();
                rtVarA.u("action", "hilca");
                String str = adOverlayInfoParcel.f9033q;
                if (str == null) {
                    str = "";
                }
                rtVarA.u("gqi", str);
                StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length());
                sb3.append(i10);
                rtVarA.u("hilr", sb3.toString());
                if (i10 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        rtVarA.u("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        rtVarA.u("hills", stringExtra2);
                    }
                }
                rtVarA.x();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void c() {
        this.f37063w = 1;
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void d() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f37045c;
        if (adOverlayInfoParcel == null || (lVar = adOverlayInfoParcel.f9021c) == null) {
            return;
        }
        lVar.h3();
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final boolean e() {
        this.f37063w = 1;
        if (this.f37046d == null) {
            return true;
        }
        if (((Boolean) s.f36163e.f36166c.a(sk.f16155ha)).booleanValue() && this.f37046d.canGoBack()) {
            this.f37046d.goBack();
            return false;
        }
        boolean zV0 = this.f37046d.V0();
        if (!zV0) {
            this.f37046d.a("onbackblocked", Collections.EMPTY_MAP);
        }
        return zV0;
    }

    public final void h() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f37045c;
        if (adOverlayInfoParcel != null && this.g) {
            p4(adOverlayInfoParcel.j);
        }
        if (this.f37049h != null) {
            this.f37044b.setContentView(this.f37052l);
            this.f37058r = true;
            this.f37049h.removeAllViews();
            this.f37049h = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f37050i;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f37050i = null;
        }
        this.g = false;
    }

    public final void h4() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        l lVar;
        if (!this.f37044b.isFinishing() || this.f37059s) {
            return;
        }
        this.f37059s = true;
        qz qzVar = this.f37046d;
        if (qzVar != null) {
            qzVar.J0(this.f37063w - 1);
            synchronized (this.f37054n) {
                try {
                    if (!this.f37057q && this.f37046d.O0()) {
                        pk pkVar = sk.O5;
                        s sVar = s.f36163e;
                        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && !this.f37060t && (adOverlayInfoParcel = this.f37045c) != null && (lVar = adOverlayInfoParcel.f9021c) != null) {
                            lVar.D2();
                        }
                        o1 o1Var = new o1(19, this);
                        this.f37056p = o1Var;
                        f0.f37440l.postDelayed(o1Var, ((Long) sVar.f36166c.a(sk.f16362v1)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        i4();
    }

    public final void i4() {
        qz qzVar;
        l lVar;
        if (this.f37060t) {
            return;
        }
        this.f37060t = true;
        qz qzVar2 = this.f37046d;
        if (qzVar2 != null) {
            this.f37052l.removeView(qzVar2.N());
            l7.d dVar = this.f37047e;
            if (dVar != null) {
                this.f37046d.s0((Context) dVar.f28606d);
                this.f37046d.T0(false);
                if (((Boolean) s.f36163e.f36166c.a(sk.Vd)).booleanValue() && this.f37046d.getParent() != null) {
                    ((ViewGroup) this.f37046d.getParent()).removeView(this.f37046d.N());
                }
                ViewGroup viewGroup = (ViewGroup) this.f37047e.f28605c;
                View viewN = this.f37046d.N();
                l7.d dVar2 = this.f37047e;
                viewGroup.addView(viewN, dVar2.f28603a, (ViewGroup.LayoutParams) dVar2.f28604b);
                this.f37047e = null;
            } else {
                Activity activity = this.f37044b;
                if (activity.getApplicationContext() != null) {
                    this.f37046d.s0(activity.getApplicationContext());
                }
            }
            this.f37046d = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f37045c;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f9021c) != null) {
            lVar.e0(this.f37063w);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f37045c;
        if (adOverlayInfoParcel2 == null || (qzVar = adOverlayInfoParcel2.f9022d) == null) {
            return;
        }
        m4(this.f37045c.f9022d.N(), qzVar.M());
    }

    public final void j4() {
        synchronized (this.f37054n) {
            try {
                this.f37057q = true;
                o1 o1Var = this.f37056p;
                if (o1Var != null) {
                    b0 b0Var = f0.f37440l;
                    b0Var.removeCallbacks(o1Var);
                    b0Var.post(this.f37056p);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k4(android.content.res.Configuration r8) {
        /*
            r7 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r7.f37045c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            ua.f r0 = r0.f9031o
            if (r0 == 0) goto L10
            boolean r0 = r0.f35245b
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            ua.j r3 = ua.j.C
            ja.c r3 = r3.f35264f
            android.app.Activity r4 = r7.f37044b
            boolean r8 = r3.I(r4, r8)
            boolean r3 = r7.f37051k
            if (r3 == 0) goto L37
            if (r0 != 0) goto L37
            com.google.android.gms.internal.ads.pk r0 = com.google.android.gms.internal.ads.sk.f16085d1
            va.s r3 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r3 = r3.f36166c
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            goto L37
        L34:
            r8 = r2
        L35:
            r0 = r8
            goto L5b
        L37:
            if (r8 == 0) goto L4b
            com.google.android.gms.internal.ads.pk r8 = com.google.android.gms.internal.ads.sk.f16069c1
            va.s r0 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r0 = r0.f36166c
            java.lang.Object r8 = r0.a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L34
        L4b:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r8 = r7.f37045c
            if (r8 == 0) goto L59
            ua.f r8 = r8.f9031o
            if (r8 == 0) goto L59
            boolean r8 = r8.g
            if (r8 == 0) goto L59
            r8 = r1
            goto L35
        L59:
            r8 = r1
            r0 = r2
        L5b:
            android.view.Window r3 = r4.getWindow()
            com.google.android.gms.internal.ads.pk r4 = com.google.android.gms.internal.ads.sk.C1
            va.s r5 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r6 = r5.f36166c
            java.lang.Object r4 = r6.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L87
            android.view.View r4 = r3.getDecorView()
            if (r8 == 0) goto L80
            if (r0 == 0) goto L7d
            r8 = 5894(0x1706, float:8.259E-42)
        L7b:
            r0 = r1
            goto L83
        L7d:
            r8 = 5380(0x1504, float:7.539E-42)
            goto L7b
        L80:
            r8 = 256(0x100, float:3.59E-43)
            r0 = r2
        L83:
            r4.setSystemUiVisibility(r8)
            goto La7
        L87:
            r4 = 2048(0x800, float:2.87E-42)
            r6 = 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto La0
            r3.addFlags(r6)
            r3.clearFlags(r4)
            if (r0 == 0) goto L9e
            android.view.View r8 = r3.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r8.setSystemUiVisibility(r0)
        L9e:
            r0 = r1
            goto La7
        La0:
            r3.addFlags(r4)
            r3.clearFlags(r6)
            r0 = r2
        La7:
            com.google.android.gms.internal.ads.pk r8 = com.google.android.gms.internal.ads.sk.Ie
            com.google.android.gms.internal.ads.rk r4 = r5.f36166c
            java.lang.Object r8 = r4.a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lcd
            int r8 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r8 > r4) goto Lcd
            r4 = 28
            if (r8 < r4) goto Lcd
            if (r0 == 0) goto Lcd
            android.view.WindowManager$LayoutParams r8 = r3.getAttributes()
            com.google.gson.internal.b.f(r8, r1)
            com.bumptech.glide.f.A(r3, r2)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.i.k4(android.content.res.Configuration):void");
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void l() {
        l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f37045c;
        if (adOverlayInfoParcel != null && (lVar = adOverlayInfoParcel.f9021c) != null) {
            lVar.U0();
        }
        qz qzVar = this.f37046d;
        if (qzVar != null) {
            try {
                this.f37052l.removeView(qzVar.N());
            } catch (NullPointerException unused) {
            }
        }
        h4();
    }

    public final void l4(View view) {
        xh0 xh0VarM;
        wh0 wh0VarU0;
        qz qzVar = this.f37046d;
        if (qzVar == null) {
            return;
        }
        pk pkVar = sk.f16090d6;
        s sVar = s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && (wh0VarU0 = qzVar.u0()) != null) {
            synchronized (wh0VarU0) {
                zt0 zt0Var = wh0VarU0.f18027f;
                if (zt0Var != null) {
                    ua.j.C.f35280x.getClass();
                    h80.s(new uh0(0, zt0Var, view));
                    return;
                }
                return;
            }
        }
        if (((Boolean) sVar.f36166c.a(sk.f16074c6)).booleanValue() && (xh0VarM = qzVar.M()) != null && ((ut0) xh0VarM.f18391b.g) == ut0.HTML) {
            h80 h80Var = ua.j.C.f35280x;
            vt0 vt0Var = xh0VarM.f18390a;
            h80Var.getClass();
            h80.s(new th0(vt0Var, view, 0));
        }
    }

    public final void m() {
        this.f37063w = 3;
        Activity activity = this.f37044b;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f37045c;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f9027k != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        qz qzVar = this.f37046d;
        if (qzVar != null) {
            qzVar.l0(null);
        }
    }

    public final void n4(boolean z3) throws JSONException {
        if (this.f37045c.f9039w) {
            return;
        }
        pk pkVar = sk.T5;
        s sVar = s.f36163e;
        int iIntValue = ((Integer) sVar.f36166c.a(pkVar)).intValue();
        boolean z10 = ((Boolean) sVar.f36166c.a(sk.f16412y1)).booleanValue() || z3;
        pl0 pl0Var = new pl0();
        pl0Var.f15037a = 0;
        pl0Var.f15038b = 0;
        pl0Var.f15039c = 0;
        pl0Var.f15040d = 50;
        pl0Var.f15037a = true != z10 ? 0 : iIntValue;
        pl0Var.f15038b = true != z10 ? iIntValue : 0;
        pl0Var.f15039c = iIntValue;
        this.f37048f = new m(this.f37044b, pl0Var, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z10 ? 9 : 11);
        o4(z3, this.f37045c.g);
        this.f37052l.addView(this.f37048f, layoutParams);
        l4(this.f37048f);
    }

    public final void o4(boolean z3, boolean z10) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        ua.f fVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        ua.f fVar2;
        pk pkVar = sk.f16378w1;
        s sVar = s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        boolean zBooleanValue = ((Boolean) rkVar.a(pkVar)).booleanValue();
        boolean z11 = true;
        boolean z12 = zBooleanValue && (adOverlayInfoParcel2 = this.f37045c) != null && (fVar2 = adOverlayInfoParcel2.f9031o) != null && fVar2.f35250h;
        boolean z13 = ((Boolean) rkVar2.a(sk.f16395x1)).booleanValue() && (adOverlayInfoParcel = this.f37045c) != null && (fVar = adOverlayInfoParcel.f9031o) != null && fVar.f35251i;
        if (z3 && z10 && z12 && !z13) {
            qz qzVar = this.f37046d;
            try {
                JSONObject jSONObjectPut = new JSONObject().put(PglCryptUtils.KEY_MESSAGE, "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                if (qzVar != null) {
                    qzVar.h("onError", jSONObjectPut);
                }
            } catch (JSONException e2) {
                za.i.f("Error occurred while dispatching error event.", e2);
            }
        }
        m mVar = this.f37048f;
        if (mVar != null) {
            if (!z13 && (!z10 || z12)) {
                z11 = false;
            }
            ImageButton imageButton = mVar.f37073a;
            if (!z11) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) rkVar2.a(sk.A1)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    public final void p4(int i4) {
        int i10;
        Activity activity = this.f37044b;
        int i11 = activity.getApplicationInfo().targetSdkVersion;
        pk pkVar = sk.L6;
        s sVar = s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (i11 < ((Integer) rkVar.a(pkVar)).intValue() || activity.getApplicationInfo().targetSdkVersion > ((Integer) rkVar2.a(sk.M6)).intValue() || (i10 = Build.VERSION.SDK_INT) < ((Integer) rkVar2.a(sk.N6)).intValue() || i10 > ((Integer) rkVar2.a(sk.O6)).intValue()) {
            try {
                activity.setRequestedOrientation(i4);
            } catch (Throwable th2) {
                ua.j.C.f35265h.g("AdOverlay.setRequestedOrientation", th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q4(boolean r44) throws org.json.JSONException, xa.g {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.i.q4(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.ft
    public final void v(vb.a aVar) {
        k4((Configuration) vb.b.U0(aVar));
    }
}
