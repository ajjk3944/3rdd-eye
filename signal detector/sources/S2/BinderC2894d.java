package s2;

import A3.o;
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
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC0655Od;
import com.google.android.gms.internal.ads.C0504Ff;
import com.google.android.gms.internal.ads.C0616Lp;
import com.google.android.gms.internal.ads.C0697Ql;
import com.google.android.gms.internal.ads.C0784Vn;
import com.google.android.gms.internal.ads.C0820Xp;
import com.google.android.gms.internal.ads.C0837Yp;
import com.google.android.gms.internal.ads.C1437kl;
import com.google.android.gms.internal.ads.C1760qk;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.G9;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC0828Yg;
import com.google.android.gms.internal.ads.InterfaceC2084wl;
import com.google.android.gms.internal.ads.Qv;
import com.google.android.gms.internal.ads.Rr;
import com.google.android.gms.internal.ads.RunnableC0769Up;
import com.google.android.gms.internal.ads.RunnableC0786Vp;
import com.google.android.gms.internal.ads.Rv;
import com.google.android.gms.internal.ads.Vv;
import j2.C2545a;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import n1.RunnableC2683a;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import q2.InterfaceC2806a;
import t2.AbstractC2907C;
import t2.C2911G;
import t2.HandlerC2908D;

/* renamed from: s2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2894d extends AbstractBinderC0655Od {
    public static final int M = Color.argb(0, 0, 0, 0);

    /* renamed from: D, reason: collision with root package name */
    public RunnableC2683a f23451D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f23452E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f23453F;

    /* renamed from: J, reason: collision with root package name */
    public Toolbar f23457J;

    /* renamed from: L, reason: collision with root package name */
    public final /* synthetic */ int f23459L;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f23460b;

    /* renamed from: c, reason: collision with root package name */
    public AdOverlayInfoParcel f23461c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0828Yg f23462d;

    /* renamed from: e, reason: collision with root package name */
    public C2545a f23463e;

    /* renamed from: f, reason: collision with root package name */
    public l f23464f;

    /* renamed from: h, reason: collision with root package name */
    public FrameLayout f23466h;
    public WebChromeClient.CustomViewCallback i;

    /* renamed from: l, reason: collision with root package name */
    public h f23469l;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23465g = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23467j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23468k = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23470m = false;

    /* renamed from: K, reason: collision with root package name */
    public int f23458K = 1;

    /* renamed from: n, reason: collision with root package name */
    public final Object f23471n = new Object();

    /* renamed from: C, reason: collision with root package name */
    public final o f23450C = new o(7, this);

    /* renamed from: G, reason: collision with root package name */
    public boolean f23454G = false;

    /* renamed from: H, reason: collision with root package name */
    public boolean f23455H = false;

    /* renamed from: I, reason: collision with root package name */
    public boolean f23456I = true;

    public BinderC2894d(Activity activity, int i) {
        this.f23459L = i;
        this.f23460b = activity;
    }

    public static final void P3(View view, C0837Yp c0837Yp) {
        if (c0837Yp == null || view == null) {
            return;
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.c6)).booleanValue() && ((Qv) c0837Yp.f12709b.f13526g) == Qv.HTML) {
            return;
        }
        C1437kl c1437kl = p2.j.f22785C.f22810x;
        Rv rv = c0837Yp.f12708a;
        c1437kl.getClass();
        C1437kl.k(rv, view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void I() {
        k kVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23461c;
        if (adOverlayInfoParcel != null && (kVar = adOverlayInfoParcel.f6865c) != null) {
            kVar.I0();
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Q5)).booleanValue() && this.f23462d != null && (!this.f23460b.isFinishing() || this.f23463e == null)) {
            this.f23462d.onPause();
        }
        K3();
    }

    public final void K3() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        k kVar;
        if (!this.f23460b.isFinishing() || this.f23454G) {
            return;
        }
        this.f23454G = true;
        InterfaceC0828Yg interfaceC0828Yg = this.f23462d;
        if (interfaceC0828Yg != null) {
            interfaceC0828Yg.T0(this.f23458K - 1);
            synchronized (this.f23471n) {
                try {
                    if (!this.f23452E && this.f23462d.a1()) {
                        E9 e9 = H9.O5;
                        C2841s c2841s = C2841s.f23267e;
                        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && !this.f23455H && (adOverlayInfoParcel = this.f23461c) != null && (kVar = adOverlayInfoParcel.f6865c) != null) {
                            kVar.j2();
                        }
                        RunnableC2683a runnableC2683a = new RunnableC2683a(8, this);
                        this.f23451D = runnableC2683a;
                        C2911G.f23576l.postDelayed(runnableC2683a, ((Long) c2841s.f23270c.a(H9.v1)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        L3();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void L(S2.a aVar) {
        N3((Configuration) S2.b.n1(aVar));
    }

    public final void L3() {
        InterfaceC0828Yg interfaceC0828Yg;
        k kVar;
        if (this.f23455H) {
            return;
        }
        this.f23455H = true;
        InterfaceC0828Yg interfaceC0828Yg2 = this.f23462d;
        if (interfaceC0828Yg2 != null) {
            this.f23469l.removeView(interfaceC0828Yg2.b0());
            C2545a c2545a = this.f23463e;
            if (c2545a != null) {
                this.f23462d.C0((Context) c2545a.f21324e);
                this.f23462d.h1(false);
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.Td)).booleanValue() && this.f23462d.getParent() != null) {
                    ((ViewGroup) this.f23462d.getParent()).removeView(this.f23462d.b0());
                }
                ViewGroup viewGroup = (ViewGroup) this.f23463e.f21323d;
                View viewB0 = this.f23462d.b0();
                C2545a c2545a2 = this.f23463e;
                viewGroup.addView(viewB0, c2545a2.f21321b, (ViewGroup.LayoutParams) c2545a2.f21322c);
                this.f23463e = null;
            } else {
                Activity activity = this.f23460b;
                if (activity.getApplicationContext() != null) {
                    this.f23462d.C0(activity.getApplicationContext());
                }
            }
            this.f23462d = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23461c;
        if (adOverlayInfoParcel != null && (kVar = adOverlayInfoParcel.f6865c) != null) {
            kVar.k0(this.f23458K);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f23461c;
        if (adOverlayInfoParcel2 == null || (interfaceC0828Yg = adOverlayInfoParcel2.f6866d) == null) {
            return;
        }
        P3(this.f23461c.f6866d.b0(), interfaceC0828Yg.a0());
    }

    public final void M3() {
        synchronized (this.f23471n) {
            try {
                this.f23452E = true;
                RunnableC2683a runnableC2683a = this.f23451D;
                if (runnableC2683a != null) {
                    HandlerC2908D handlerC2908D = C2911G.f23576l;
                    handlerC2908D.removeCallbacks(runnableC2683a);
                    handlerC2908D.post(this.f23451D);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N3(android.content.res.Configuration r8) {
        /*
            r7 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r7.f23461c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            p2.f r0 = r0.f6853C
            if (r0 == 0) goto L10
            boolean r0 = r0.f22770b
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            p2.j r3 = p2.j.f22785C
            p1.e r3 = r3.f22793f
            android.app.Activity r4 = r7.f23460b
            boolean r8 = r3.n(r4, r8)
            boolean r3 = r7.f23468k
            if (r3 == 0) goto L37
            if (r0 != 0) goto L37
            com.google.android.gms.internal.ads.E9 r0 = com.google.android.gms.internal.ads.H9.f8728d1
            q2.s r3 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r3 = r3.f23270c
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
            com.google.android.gms.internal.ads.E9 r8 = com.google.android.gms.internal.ads.H9.f8721c1
            q2.s r0 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r0 = r0.f23270c
            java.lang.Object r8 = r0.a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L34
        L4b:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r8 = r7.f23461c
            if (r8 == 0) goto L59
            p2.f r8 = r8.f6853C
            if (r8 == 0) goto L59
            boolean r8 = r8.f22775g
            if (r8 == 0) goto L59
            r8 = r1
            goto L35
        L59:
            r8 = r1
            r0 = r2
        L5b:
            android.view.Window r3 = r4.getWindow()
            com.google.android.gms.internal.ads.E9 r4 = com.google.android.gms.internal.ads.H9.f8571C1
            q2.s r5 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r6 = r5.f23270c
            java.lang.Object r4 = r6.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L86
            android.view.View r4 = r3.getDecorView()
            if (r8 == 0) goto L7f
            if (r0 == 0) goto L7c
            r8 = 5894(0x1706, float:8.259E-42)
            goto L82
        L7c:
            r8 = 5380(0x1504, float:7.539E-42)
            goto L82
        L7f:
            r8 = 256(0x100, float:3.59E-43)
            r1 = r2
        L82:
            r4.setSystemUiVisibility(r8)
            goto La5
        L86:
            r4 = 2048(0x800, float:2.87E-42)
            r6 = 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L9e
            r3.addFlags(r6)
            r3.clearFlags(r4)
            if (r0 == 0) goto La5
            android.view.View r8 = r3.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r8.setSystemUiVisibility(r0)
            goto La5
        L9e:
            r3.addFlags(r4)
            r3.clearFlags(r6)
            r1 = r2
        La5:
            com.google.android.gms.internal.ads.E9 r8 = com.google.android.gms.internal.ads.H9.Ge
            com.google.android.gms.internal.ads.G9 r0 = r5.f23270c
            java.lang.Object r8 = r0.a(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lcb
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r8 > r0) goto Lcb
            r0 = 28
            if (r8 < r0) goto Lcb
            if (r1 == 0) goto Lcb
            android.view.WindowManager$LayoutParams r8 = r3.getAttributes()
            U4.e.q(r8)
            com.bumptech.glide.e.x(r3, r2)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.BinderC2894d.N3(android.content.res.Configuration):void");
    }

    public final void O3(View view) {
        C0837Yp c0837YpA0;
        C0820Xp c0820XpE0;
        InterfaceC0828Yg interfaceC0828Yg = this.f23462d;
        if (interfaceC0828Yg == null) {
            return;
        }
        E9 e9 = H9.d6;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && (c0820XpE0 = interfaceC0828Yg.E0()) != null) {
            synchronized (c0820XpE0) {
                Vv vv = c0820XpE0.f12501f;
                if (vv != null) {
                    p2.j.f22785C.f22810x.getClass();
                    C1437kl.q(new RunnableC0786Vp(vv, 1, view));
                    return;
                }
                return;
            }
        }
        if (((Boolean) c2841s.f23270c.a(H9.c6)).booleanValue() && (c0837YpA0 = interfaceC0828Yg.a0()) != null && ((Qv) c0837YpA0.f12709b.f13526g) == Qv.HTML) {
            C1437kl c1437kl = p2.j.f22785C.f22810x;
            Rv rv = c0837YpA0.f12708a;
            c1437kl.getClass();
            C1437kl.q(new RunnableC0769Up(rv, view, 0));
        }
    }

    public final void Q3(boolean z6) throws JSONException {
        if (this.f23461c.f6861K) {
            return;
        }
        E9 e9 = H9.T5;
        C2841s c2841s = C2841s.f23267e;
        int iIntValue = ((Integer) c2841s.f23270c.a(e9)).intValue();
        boolean z7 = ((Boolean) c2841s.f23270c.a(H9.f8862y1)).booleanValue() || z6;
        Rr rr = new Rr();
        rr.f11054a = 0;
        rr.f11055b = 0;
        rr.f11056c = 0;
        rr.f11057d = 50;
        rr.f11054a = true != z7 ? 0 : iIntValue;
        rr.f11055b = true != z7 ? iIntValue : 0;
        rr.f11056c = iIntValue;
        this.f23464f = new l(this.f23460b, rr, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z7 ? 9 : 11);
        R3(z6, this.f23461c.f6869g);
        this.f23469l.addView(this.f23464f, layoutParams);
        O3(this.f23464f);
    }

    public final void R3(boolean z6, boolean z7) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        p2.f fVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        p2.f fVar2;
        E9 e9 = H9.f8849w1;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        boolean zBooleanValue = ((Boolean) g9.a(e9)).booleanValue();
        boolean z8 = true;
        boolean z9 = zBooleanValue && (adOverlayInfoParcel2 = this.f23461c) != null && (fVar2 = adOverlayInfoParcel2.f6853C) != null && fVar2.f22776h;
        boolean z10 = ((Boolean) g92.a(H9.x1)).booleanValue() && (adOverlayInfoParcel = this.f23461c) != null && (fVar = adOverlayInfoParcel.f6853C) != null && fVar.i;
        if (z6 && z7 && z9 && !z10) {
            InterfaceC0828Yg interfaceC0828Yg = this.f23462d;
            try {
                JSONObject jSONObjectPut = new JSONObject().put(PglCryptUtils.KEY_MESSAGE, "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                if (interfaceC0828Yg != null) {
                    interfaceC0828Yg.p("onError", jSONObjectPut);
                }
            } catch (JSONException e6) {
                u2.k.f("Error occurred while dispatching error event.", e6);
            }
        }
        l lVar = this.f23464f;
        if (lVar != null) {
            if (!z10 && (!z7 || z9)) {
                z8 = false;
            }
            ImageButton imageButton = lVar.f23495a;
            if (!z8) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) g92.a(H9.f8559A1)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    public final void S3(int i) {
        int i3;
        Activity activity = this.f23460b;
        int i6 = activity.getApplicationInfo().targetSdkVersion;
        E9 e9 = H9.L6;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (i6 < ((Integer) g9.a(e9)).intValue() || activity.getApplicationInfo().targetSdkVersion > ((Integer) g92.a(H9.M6)).intValue() || (i3 = Build.VERSION.SDK_INT) < ((Integer) g92.a(H9.N6)).intValue() || i3 > ((Integer) g92.a(H9.O6)).intValue()) {
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable th) {
                p2.j.f22785C.f22795h.g("AdOverlay.setRequestedOrientation", th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T3(boolean r44) throws org.json.JSONException, s2.g {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.BinderC2894d.T3(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void b() {
        this.f23458K = 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void b1(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.f23460b;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f23461c;
            try {
                adOverlayInfoParcel.f6860J.h1(strArr, iArr, new S2.b(new C0616Lp(activity, adOverlayInfoParcel.f6872k == 5 ? this : null, null, null)));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void d() {
        k kVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23461c;
        if (adOverlayInfoParcel == null || (kVar = adOverlayInfoParcel.f6865c) == null) {
            return;
        }
        kVar.N2();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final boolean e() {
        this.f23458K = 1;
        if (this.f23462d == null) {
            return true;
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.fa)).booleanValue() && this.f23462d.canGoBack()) {
            this.f23462d.goBack();
            return false;
        }
        boolean zI1 = this.f23462d.i1();
        if (!zI1) {
            this.f23462d.a("onbackblocked", Collections.EMPTY_MAP);
        }
        return zI1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void g1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f23467j);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void h() {
        k kVar;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Q5)).booleanValue()) {
            InterfaceC0828Yg interfaceC0828Yg = this.f23462d;
            if (interfaceC0828Yg == null || interfaceC0828Yg.t0()) {
                u2.k.h("The webview does not exist. Ignoring action.");
            } else {
                this.f23462d.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23461c;
        if (adOverlayInfoParcel == null || (kVar = adOverlayInfoParcel.f6865c) == null) {
            return;
        }
        kVar.K1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void i() {
        k kVar;
        s();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23461c;
        if (adOverlayInfoParcel != null && (kVar = adOverlayInfoParcel.f6865c) != null) {
            kVar.x1();
        }
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.Q5)).booleanValue() && this.f23462d != null && (!this.f23460b.isFinishing() || this.f23463e == null)) {
            this.f23462d.onPause();
        }
        K3();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void j() {
        k kVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23461c;
        if (adOverlayInfoParcel == null || (kVar = adOverlayInfoParcel.f6865c) == null) {
            return;
        }
        kVar.h0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void k() {
        k kVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23461c;
        if (adOverlayInfoParcel != null && (kVar = adOverlayInfoParcel.f6865c) != null) {
            kVar.R1();
        }
        N3(this.f23460b.getResources().getConfiguration());
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Q5)).booleanValue()) {
            return;
        }
        InterfaceC0828Yg interfaceC0828Yg = this.f23462d;
        if (interfaceC0828Yg == null || interfaceC0828Yg.t0()) {
            u2.k.h("The webview does not exist. Ignoring action.");
        } else {
            this.f23462d.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void l1(int i, int i3, Intent intent) {
        C0784Vn c0784Vn;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            E9 e9 = H9.re;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i3);
                AbstractC2907C.m(sb.toString());
                InterfaceC0828Yg interfaceC0828Yg = this.f23462d;
                if (interfaceC0828Yg == null || interfaceC0828Yg.l0() == null || (c0784Vn = interfaceC0828Yg.l0().f15999N) == null || (adOverlayInfoParcel = this.f23461c) == null || !((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                    return;
                }
                C0697Ql c0697QlA = c0784Vn.a();
                c0697QlA.r("action", "hilca");
                String str = adOverlayInfoParcel.f6855E;
                if (str == null) {
                    str = "";
                }
                c0697QlA.r("gqi", str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length());
                sb2.append(i3);
                c0697QlA.r("hilr", sb2.toString());
                if (i3 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        c0697QlA.r("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        c0697QlA.r("hills", stringExtra2);
                    }
                }
                c0697QlA.x();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void r() {
        this.f23453F = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public void r3(Bundle bundle) throws JSONException, g {
        k kVar;
        switch (this.f23459L) {
            case 4:
                AbstractC2907C.m("AdOverlayParcel is null or does not contain valid overlay type.");
                this.f23458K = 4;
                this.f23460b.finish();
                return;
            default:
                if (!this.f23453F) {
                    this.f23460b.requestWindowFeature(1);
                }
                this.f23467j = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
                try {
                    Activity activity = this.f23460b;
                    AdOverlayInfoParcel adOverlayInfoParcelA = AdOverlayInfoParcel.a(activity.getIntent());
                    this.f23461c = adOverlayInfoParcelA;
                    if (adOverlayInfoParcelA == null) {
                        throw new g("Could not get info for ad overlay.");
                    }
                    if (adOverlayInfoParcelA.f6861K) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            activity.setShowWhenLocked(true);
                        } else {
                            activity.getWindow().addFlags(524288);
                        }
                    }
                    if (this.f23461c.f6874m.f23786c > 7500000) {
                        this.f23458K = 4;
                    }
                    if (activity.getIntent() != null) {
                        this.f23456I = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = this.f23461c;
                    p2.f fVar = adOverlayInfoParcel.f6853C;
                    if (fVar != null) {
                        boolean z6 = fVar.f22769a;
                        this.f23468k = z6;
                        if (z6) {
                            if (adOverlayInfoParcel.f6872k != 5 && fVar.f22774f != -1) {
                                new C0504Ff(this).k();
                            }
                        }
                    } else if (adOverlayInfoParcel.f6872k == 5) {
                        this.f23468k = true;
                        if (adOverlayInfoParcel.f6872k != 5) {
                            new C0504Ff(this).k();
                        }
                    } else {
                        this.f23468k = false;
                    }
                    if (bundle == null) {
                        if (this.f23456I) {
                            C1760qk c1760qk = this.f23461c.f6858H;
                            if (c1760qk != null) {
                                synchronized (c1760qk) {
                                    ScheduledFuture scheduledFuture = c1760qk.f16394d;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(true);
                                    }
                                }
                            }
                            k kVar2 = this.f23461c.f6865c;
                            if (kVar2 != null) {
                                kVar2.g();
                            }
                        }
                        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f23461c;
                        if (adOverlayInfoParcel2.f6872k != 1) {
                            InterfaceC2806a interfaceC2806a = adOverlayInfoParcel2.f6864b;
                            if (interfaceC2806a != null) {
                                interfaceC2806a.onAdClicked();
                            }
                            InterfaceC2084wl interfaceC2084wl = this.f23461c.f6859I;
                            if (interfaceC2084wl != null) {
                                interfaceC2084wl.L();
                            }
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.f23461c;
                    if (adOverlayInfoParcel3 != null && (kVar = adOverlayInfoParcel3.f6865c) != null) {
                        kVar.n1();
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel4 = this.f23461c;
                    h hVar = new h(activity, adOverlayInfoParcel4.f6875n, adOverlayInfoParcel4.f6874m.f23784a, adOverlayInfoParcel4.f6857G);
                    this.f23469l = hVar;
                    hVar.setId(TTAdConstant.STYLE_SIZE_RADIO_1_1);
                    p2.j.f22785C.f22793f.t(activity);
                    AdOverlayInfoParcel adOverlayInfoParcel5 = this.f23461c;
                    int i = adOverlayInfoParcel5.f6872k;
                    if (i == 1) {
                        T3(false);
                        return;
                    }
                    if (i == 2) {
                        this.f23463e = new C2545a(adOverlayInfoParcel5.f6866d);
                        T3(false);
                        return;
                    } else if (i == 3) {
                        T3(true);
                        return;
                    } else {
                        if (i != 5) {
                            throw new g("Could not determine ad overlay type.");
                        }
                        T3(false);
                        return;
                    }
                } catch (g e6) {
                    u2.k.h(e6.getMessage());
                    this.f23458K = 4;
                    this.f23460b.finish();
                    return;
                }
        }
    }

    public final void s() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23461c;
        if (adOverlayInfoParcel != null && this.f23465g) {
            S3(adOverlayInfoParcel.f6871j);
        }
        if (this.f23466h != null) {
            this.f23460b.setContentView(this.f23469l);
            this.f23453F = true;
            this.f23466h.removeAllViews();
            this.f23466h = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.i;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.i = null;
        }
        this.f23465g = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0672Pd
    public final void y() {
        k kVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23461c;
        if (adOverlayInfoParcel != null && (kVar = adOverlayInfoParcel.f6865c) != null) {
            kVar.d1();
        }
        InterfaceC0828Yg interfaceC0828Yg = this.f23462d;
        if (interfaceC0828Yg != null) {
            try {
                this.f23469l.removeView(interfaceC0828Yg.b0());
            } catch (NullPointerException unused) {
            }
        }
        K3();
    }

    public final void z() {
        this.f23458K = 3;
        Activity activity = this.f23460b;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23461c;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f6872k != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        InterfaceC0828Yg interfaceC0828Yg = this.f23462d;
        if (interfaceC0828Yg != null) {
            interfaceC0828Yg.p0(null);
        }
    }
}
