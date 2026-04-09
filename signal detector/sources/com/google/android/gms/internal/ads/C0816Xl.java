package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C2771a;
import q2.C2827k0;
import q2.C2841s;
import q2.InterfaceC2831m0;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Xl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0816Xl implements InterfaceC1654om {

    /* renamed from: C, reason: collision with root package name */
    public final Q2.a f12454C;

    /* renamed from: D, reason: collision with root package name */
    public final C1976ul f12455D;

    /* renamed from: E, reason: collision with root package name */
    public final C2202yv f12456E;

    /* renamed from: F, reason: collision with root package name */
    public final C0478Dn f12457F;

    /* renamed from: G, reason: collision with root package name */
    public final Xu f12458G;

    /* renamed from: H, reason: collision with root package name */
    public final BinderC0718Rp f12459H;

    /* renamed from: J, reason: collision with root package name */
    public boolean f12461J;

    /* renamed from: Q, reason: collision with root package name */
    public C2827k0 f12467Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0560Ik f12468R;

    /* renamed from: S, reason: collision with root package name */
    public final C2085wm f12469S;

    /* renamed from: T, reason: collision with root package name */
    public final C2771a f12470T;

    /* renamed from: U, reason: collision with root package name */
    public final C0712Rj f12471U;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12472a;

    /* renamed from: b, reason: collision with root package name */
    public final C1708pm f12473b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f12474c;

    /* renamed from: d, reason: collision with root package name */
    public final C1547mn f12475d;

    /* renamed from: e, reason: collision with root package name */
    public final C1492lm f12476e;

    /* renamed from: f, reason: collision with root package name */
    public final H6 f12477f;

    /* renamed from: g, reason: collision with root package name */
    public final C1867sk f12478g;

    /* renamed from: h, reason: collision with root package name */
    public final C1276hk f12479h;
    public final C2030vl i;

    /* renamed from: j, reason: collision with root package name */
    public final Qt f12480j;

    /* renamed from: k, reason: collision with root package name */
    public final C2951a f12481k;

    /* renamed from: l, reason: collision with root package name */
    public final C0960bu f12482l;

    /* renamed from: m, reason: collision with root package name */
    public final C0643Ni f12483m;

    /* renamed from: n, reason: collision with root package name */
    public final ViewOnClickListenerC2193ym f12484n;

    /* renamed from: I, reason: collision with root package name */
    public boolean f12460I = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f12462K = false;

    /* renamed from: L, reason: collision with root package name */
    public boolean f12463L = false;
    public Point M = new Point();

    /* renamed from: N, reason: collision with root package name */
    public Point f12464N = new Point();

    /* renamed from: O, reason: collision with root package name */
    public long f12465O = 0;

    /* renamed from: P, reason: collision with root package name */
    public long f12466P = 0;

    public C0816Xl(Context context, C1708pm c1708pm, JSONObject jSONObject, C1547mn c1547mn, C1492lm c1492lm, H6 h6, C1867sk c1867sk, C1276hk c1276hk, C2030vl c2030vl, Qt qt, C2951a c2951a, C0960bu c0960bu, C0643Ni c0643Ni, ViewOnClickListenerC2193ym viewOnClickListenerC2193ym, Q2.a aVar, C1976ul c1976ul, C2202yv c2202yv, Xu xu, BinderC0718Rp binderC0718Rp, C0478Dn c0478Dn, C2085wm c2085wm, C0560Ik c0560Ik, C2771a c2771a, C0712Rj c0712Rj) {
        this.f12472a = context;
        this.f12473b = c1708pm;
        this.f12474c = jSONObject;
        this.f12475d = c1547mn;
        this.f12476e = c1492lm;
        this.f12477f = h6;
        this.f12478g = c1867sk;
        this.f12479h = c1276hk;
        this.i = c2030vl;
        this.f12480j = qt;
        this.f12481k = c2951a;
        this.f12482l = c0960bu;
        this.f12483m = c0643Ni;
        this.f12484n = viewOnClickListenerC2193ym;
        this.f12454C = aVar;
        this.f12455D = c1976ul;
        this.f12456E = c2202yv;
        this.f12458G = xu;
        this.f12459H = binderC0718Rp;
        this.f12457F = c0478Dn;
        this.f12469S = c2085wm;
        this.f12468R = c0560Ik;
        this.f12470T = c2771a;
        this.f12471U = c0712Rj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final int A() {
        C0499Fa c0499Fa = this.f12482l.f13487j;
        if (c0499Fa == null) {
            return 0;
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Lc)).booleanValue()) {
            return c0499Fa.i;
        }
        return 0;
    }

    public final void B(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z6, boolean z7) throws JSONException {
        List list;
        String strD;
        Q2.a aVar = this.f12454C;
        C1492lm c1492lm = this.f12476e;
        JSONObject jSONObject7 = this.f12474c;
        try {
            w();
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            C1708pm c1708pm = this.f12473b;
            jSONObject8.put("has_custom_click_handler", ((InterfaceC1050db) c1708pm.f16222g.get(c1492lm.q())) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", c1492lm.W());
            jSONObject9.put("view_aware_api_used", z6);
            C0499Fa c0499Fa = this.f12482l.f13487j;
            jSONObject9.put("custom_mute_requested", c0499Fa != null && c0499Fa.f8133g);
            synchronized (c1492lm) {
                list = c1492lm.f15440f;
            }
            jSONObject9.put("custom_mute_enabled", (list.isEmpty() || c1492lm.f() == null) ? false : true);
            if (this.f12484n.f17756c != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            aVar.getClass();
            jSONObject9.put("timestamp", System.currentTimeMillis());
            if (this.f12463L && this.f12474c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z7) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", ((InterfaceC1050db) c1708pm.f16222g.get(c1492lm.q())) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strD = this.f12477f.f8555b.d(this.f12472a, view, jSONObjectOptJSONObject.optString("click_string"));
            } catch (Exception e6) {
                u2.k.f("Exception obtaining click signals", e6);
                strD = null;
            }
            jSONObject9.put("click_signals", strD);
            jSONObject9.put("open_chrome_custom_tab", true);
            E9 e9 = H9.N9;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && Q2.b.f()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) c2841s.f23270c.a(H9.O9)).booleanValue() && Q2.b.f()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            aVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", jCurrentTimeMillis - this.f12465O);
            jSONObject10.put("time_from_last_touch", jCurrentTimeMillis - this.f12466P);
            jSONObject8.put("touch_signal", jSONObject10);
            if (this.f12480j.b()) {
                JSONObject jSONObject11 = (JSONObject) jSONObject7.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.f12459H.K3(string, c1492lm);
                }
            }
            AbstractC2022vd.g(this.f12475d.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick");
        } catch (JSONException e7) {
            u2.k.f("Unable to create click JSON.", e7);
        }
    }

    public final void C() {
        try {
            C2827k0 c2827k0 = this.f12467Q;
            if (c2827k0 != null) {
                c2827k0.I0(c2827k0.h0(), 1);
            }
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void F(String str) throws JSONException {
        B(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void M() {
        C1547mn c1547mn = this.f12475d;
        synchronized (c1547mn) {
            C1358jD c1358jD = c1547mn.f15669m;
            if (c1358jD == null) {
                return;
            }
            C1437kl c1437kl = new C1437kl(17);
            c1358jD.a(new CD(c1358jD, 0, c1437kl), c1547mn.f15662e);
            c1547mn.f15669m = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void Z() throws JSONException {
        x(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.M = new Point();
        this.f12464N = new Point();
        if (!this.f12461J) {
            this.f12455D.H1(view);
            this.f12461J = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        C0643Ni c0643Ni = this.f12483m;
        c0643Ni.getClass();
        c0643Ni.f10042j = new WeakReference(this);
        boolean zX = a4.t.x(this.f12481k.f23786c);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zX) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zX) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void b(View view) {
        if (!this.f12474c.optBoolean("custom_one_point_five_click_enabled", false)) {
            u2.k.h("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            ViewOnClickListenerC2193ym viewOnClickListenerC2193ym = this.f12484n;
            view.setOnClickListener(viewOnClickListenerC2193ym);
            view.setClickable(true);
            viewOnClickListenerC2193ym.f17760g = new WeakReference(view);
        }
    }

    public final boolean c(String str) {
        JSONObject jSONObjectOptJSONObject = this.f12474c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final JSONObject d(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f12472a;
        JSONObject jSONObjectC = a4.t.C(context, map, map2, view, scaleType);
        JSONObject jSONObjectZ = a4.t.z(context, view);
        JSONObject jSONObjectA = a4.t.A(view);
        JSONObject jSONObjectB = a4.t.B(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectC);
            jSONObject.put("ad_view_signal", jSONObjectZ);
            jSONObject.put("scroll_view_signal", jSONObjectA);
            jSONObject.put("lock_screen_signal", jSONObjectB);
            return jSONObject;
        } catch (JSONException e6) {
            u2.k.f("Unable to create native ad view signals JSON.", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void e() {
        this.f12463L = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void f(Bundle bundle) throws JSONException {
        if (bundle == null) {
            u2.k.c("Click data is null. No click is reported.");
            return;
        }
        if (!c("click_reporting")) {
            u2.k.e("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        JSONObject jSONObjectK = null;
        String string = bundle2 != null ? bundle2.getString("asset_id") : null;
        u2.f fVar = q2.r.f23260g.f23261a;
        fVar.getClass();
        try {
            jSONObjectK = fVar.k(bundle);
        } catch (JSONException e6) {
            u2.k.f("Error converting Bundle to JSON", e6);
        }
        B(null, null, null, null, null, string, null, jSONObjectK, false, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final boolean g() {
        return this.f12474c.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void h(View view, View view2, Map map, Map map2, boolean z6, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f12472a;
        JSONObject jSONObjectC = a4.t.C(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZ = a4.t.z(context, view2);
        JSONObject jSONObjectA = a4.t.A(view2);
        JSONObject jSONObjectB = a4.t.B(context, view2);
        String strS = s(view, map);
        B(true == ((Boolean) C2841s.f23267e.f23270c.a(H9.f8813q4)).booleanValue() ? view2 : view, jSONObjectZ, jSONObjectC, jSONObjectA, jSONObjectB, strS, a4.t.D(strS, context, this.f12464N, this.M), null, z6, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void i(C2827k0 c2827k0) {
        this.f12467Q = c2827k0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void j(View view) {
        this.M = new Point();
        this.f12464N = new Point();
        if (view != null) {
            C1976ul c1976ul = this.f12455D;
            synchronized (c1976ul) {
                WeakHashMap weakHashMap = c1976ul.f17153c;
                if (weakHashMap.containsKey(view)) {
                    ((N7) weakHashMap.get(view)).f9970l.remove(c1976ul);
                    weakHashMap.remove(view);
                }
            }
        }
        this.f12461J = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void k(C1481lb c1481lb) {
        if (!this.f12474c.optBoolean("custom_one_point_five_click_enabled", false)) {
            u2.k.h("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ViewOnClickListenerC2193ym viewOnClickListenerC2193ym = this.f12484n;
        C1547mn c1547mn = viewOnClickListenerC2193ym.f17754a;
        viewOnClickListenerC2193ym.f17756c = c1481lb;
        C0415Ab c0415Ab = viewOnClickListenerC2193ym.f17757d;
        if (c0415Ab != null) {
            c1547mn.c("/unconfirmedClick", c0415Ab);
        }
        C0415Ab c0415Ab2 = new C0415Ab(viewOnClickListenerC2193ym, 4, c1481lb);
        viewOnClickListenerC2193ym.f17757d = c0415Ab2;
        c1547mn.b("/unconfirmedClick", c0415Ab2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final JSONObject l(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectD = d(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f12463L && this.f12474c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectD != null) {
                jSONObject.put("nas", jSONObjectD);
            }
            return jSONObject;
        } catch (JSONException e6) {
            u2.k.f("Unable to create native click meta data JSON.", e6);
            return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void m() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f12474c);
            AbstractC2022vd.g(this.f12475d.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e6) {
            u2.k.f("", e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(android.view.View r17, android.view.View r18, java.util.Map r19, java.util.Map r20, boolean r21, android.widget.ImageView.ScaleType r22, int r23) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0816Xl.n(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean, android.widget.ImageView$ScaleType, int):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void o(Bundle bundle) {
        if (bundle == null) {
            u2.k.c("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!c("touch_reporting")) {
            u2.k.e("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f12477f.f8555b.a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void p(InterfaceC2831m0 interfaceC2831m0) {
        q2.K0 k02;
        Xu xu = this.f12458G;
        Qt qt = this.f12480j;
        C2202yv c2202yv = this.f12456E;
        try {
            if (this.f12462K) {
                return;
            }
            if (interfaceC2831m0 == null) {
                C1492lm c1492lm = this.f12476e;
                synchronized (c1492lm) {
                    k02 = c1492lm.f15441g;
                }
                if (k02 != null) {
                    this.f12462K = true;
                    c2202yv.b(c1492lm.f().f23128b, qt.f10801x0, xu, null);
                    C();
                    return;
                }
            }
            this.f12462K = true;
            c2202yv.b(interfaceC2831m0.d(), qt.f10801x0, xu, null);
            C();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void q(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f12472a;
        JSONObject jSONObjectC = a4.t.C(context, map, map2, view, scaleType);
        JSONObject jSONObjectZ = a4.t.z(context, view);
        JSONObject jSONObjectA = a4.t.A(view);
        JSONObject jSONObjectB = a4.t.B(context, view);
        boolean zE = a4.t.E(context, this.f12480j);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f12474c);
            jSONObject.put("asset_view_signal", jSONObjectC);
            jSONObject.put("ad_view_signal", jSONObjectZ);
            jSONObject.put("scroll_view_signal", jSONObjectA);
            jSONObject.put("lock_screen_signal", jSONObjectB);
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8767j4)).booleanValue()) {
                jSONObject.put("view_signals", z(view));
            }
            jSONObject.put("policy_validator_enabled", zE);
            jSONObject.put("screen", a4.t.F(context));
            AbstractC2022vd.g(this.f12475d.a("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e6) {
            u2.k.f("Unable to create native ad signals logging JSON.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f12472a;
        x(a4.t.z(context, view), a4.t.C(context, map, map2, view, scaleType), a4.t.A(view), a4.t.B(context, view), z(view), null, a4.t.E(context, this.f12480j), view);
    }

    public final String s(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iW = this.f12476e.W();
        if (iW == 1) {
            return "1099";
        }
        if (iW == 2) {
            return "2099";
        }
        if (iW != 6) {
            return null;
        }
        return "3099";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final boolean t(Bundle bundle) throws JSONException {
        JSONObject jSONObjectK;
        if (!c("impression_reporting")) {
            u2.k.e("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        u2.f fVar = q2.r.f23260g.f23261a;
        fVar.getClass();
        if (bundle != null) {
            try {
                jSONObjectK = fVar.k(bundle);
            } catch (JSONException e6) {
                u2.k.f("Error converting Bundle to JSON", e6);
            }
        } else {
            jSONObjectK = null;
        }
        return x(null, null, null, null, ((Boolean) C2841s.f23267e.f23270c.a(H9.Hc)).booleanValue() ? z(null) : null, jSONObjectK, false, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final boolean u() {
        if (A() == 0) {
            return true;
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Lc)).booleanValue()) {
            return this.f12482l.f13487j.f8135j;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void v(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.M = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.f12454C.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f12466P = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f12457F.f7838a = motionEvent;
            this.f12465O = jCurrentTimeMillis;
            this.f12464N = this.M;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.M;
        motionEventObtain.setLocation(point.x, point.y);
        this.f12477f.f8555b.b(motionEventObtain);
        motionEventObtain.recycle();
        w();
    }

    public final void w() {
        C2771a c2771a;
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.Te)).booleanValue() || (c2771a = this.f12470T) == null) {
            return;
        }
        c2771a.f22747b = true;
    }

    public final boolean x(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z6, View view) throws JSONException {
        C0712Rj c0712Rj;
        Qt qt = this.f12480j;
        Context context = this.f12472a;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f12474c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            E9 e9 = H9.f8767j4;
            C2841s c2841s = C2841s.f23267e;
            G9 g9 = c2841s.f23270c;
            G9 g92 = c2841s.f23270c;
            if (((Boolean) g9.a(e9)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z6);
            jSONObject6.put("screen", a4.t.F(context));
            if (((Boolean) g92.a(H9.Ve)).booleanValue() && (c0712Rj = this.f12471U) != null) {
                AtomicLong atomicLong = c0712Rj.f11035a;
                if (atomicLong.get() > 0) {
                    jSONObject6.put("placement_id", atomicLong.get());
                }
            }
            boolean zBooleanValue = ((Boolean) g92.a(H9.J9)).booleanValue();
            C1547mn c1547mn = this.f12475d;
            if (zBooleanValue) {
                c1547mn.b("/clickRecorded", new C0782Vl(this, 1));
            } else {
                c1547mn.b("/logScionEvent", new C0782Vl(this, 0));
            }
            c1547mn.b("/nativeImpression", new C0415Ab(this, view));
            c1547mn.b("/nativeImpressionFlowControl", new C0799Wl(this, this.f12456E, qt.f10801x0, this.f12458G));
            AbstractC2022vd.g(c1547mn.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f12460I) {
                return true;
            }
            this.f12460I = p2.j.f22785C.f22801o.d(context, this.f12481k.f23784a, qt.f10728C.toString(), this.f12482l.f13485g);
            return true;
        } catch (JSONException e6) {
            u2.k.f("Unable to create impression JSON.", e6);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1654om
    public final void y() {
        View view;
        if (this.f12474c.optBoolean("custom_one_point_five_click_enabled", false)) {
            ViewOnClickListenerC2193ym viewOnClickListenerC2193ym = this.f12484n;
            if (viewOnClickListenerC2193ym.f17756c == null || viewOnClickListenerC2193ym.f17759f == null) {
                return;
            }
            viewOnClickListenerC2193ym.f17758e = null;
            viewOnClickListenerC2193ym.f17759f = null;
            WeakReference weakReference = viewOnClickListenerC2193ym.f17760g;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                viewOnClickListenerC2193ym.f17760g = null;
            }
            try {
                C1481lb c1481lb = viewOnClickListenerC2193ym.f17756c;
                c1481lb.I0(c1481lb.h0(), 2);
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            }
        }
    }

    public final String z(View view) {
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8767j4)).booleanValue()) {
            return null;
        }
        try {
            return this.f12477f.f8555b.i(this.f12472a, view, null);
        } catch (Exception unused) {
            u2.k.e("Exception getting data.");
            return null;
        }
    }
}
