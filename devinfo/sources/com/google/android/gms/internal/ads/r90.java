package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r90 implements ja0 {
    public va.j1 C;
    public final d70 D;
    public final ra0 E;
    public final ua.a F;
    public final o50 G;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15579a;

    /* renamed from: b, reason: collision with root package name */
    public final ka0 f15580b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f15581c;

    /* renamed from: d, reason: collision with root package name */
    public final hc0 f15582d;

    /* renamed from: e, reason: collision with root package name */
    public final ga0 f15583e;

    /* renamed from: f, reason: collision with root package name */
    public final oe f15584f;
    public final o60 g;

    /* renamed from: h, reason: collision with root package name */
    public final e60 f15585h;

    /* renamed from: i, reason: collision with root package name */
    public final s80 f15586i;
    public final wp0 j;

    /* renamed from: k, reason: collision with root package name */
    public final za.a f15587k;

    /* renamed from: l, reason: collision with root package name */
    public final hq0 f15588l;

    /* renamed from: m, reason: collision with root package name */
    public final j30 f15589m;

    /* renamed from: n, reason: collision with root package name */
    public final ta0 f15590n;

    /* renamed from: o, reason: collision with root package name */
    public final tb.a f15591o;

    /* renamed from: p, reason: collision with root package name */
    public final r80 f15592p;

    /* renamed from: q, reason: collision with root package name */
    public final ct0 f15593q;

    /* renamed from: r, reason: collision with root package name */
    public final zc0 f15594r;

    /* renamed from: s, reason: collision with root package name */
    public final bs0 f15595s;

    /* renamed from: t, reason: collision with root package name */
    public final qh0 f15596t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f15598v;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15597u = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f15599w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15600x = false;

    /* renamed from: y, reason: collision with root package name */
    public Point f15601y = new Point();

    /* renamed from: z, reason: collision with root package name */
    public Point f15602z = new Point();
    public long A = 0;
    public long B = 0;

    public r90(Context context, ka0 ka0Var, JSONObject jSONObject, hc0 hc0Var, ga0 ga0Var, oe oeVar, o60 o60Var, e60 e60Var, s80 s80Var, wp0 wp0Var, za.a aVar, hq0 hq0Var, j30 j30Var, ta0 ta0Var, tb.a aVar2, r80 r80Var, ct0 ct0Var, bs0 bs0Var, qh0 qh0Var, zc0 zc0Var, ra0 ra0Var, d70 d70Var, ua.a aVar3, o50 o50Var) {
        this.f15579a = context;
        this.f15580b = ka0Var;
        this.f15581c = jSONObject;
        this.f15582d = hc0Var;
        this.f15583e = ga0Var;
        this.f15584f = oeVar;
        this.g = o60Var;
        this.f15585h = e60Var;
        this.f15586i = s80Var;
        this.j = wp0Var;
        this.f15587k = aVar;
        this.f15588l = hq0Var;
        this.f15589m = j30Var;
        this.f15590n = ta0Var;
        this.f15591o = aVar2;
        this.f15592p = r80Var;
        this.f15593q = ct0Var;
        this.f15595s = bs0Var;
        this.f15596t = qh0Var;
        this.f15594r = zc0Var;
        this.E = ra0Var;
        this.D = d70Var;
        this.F = aVar3;
        this.G = o50Var;
    }

    public final String A(View view) {
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16179j4)).booleanValue()) {
            return null;
        }
        try {
            return this.f15584f.f14684b.i(this.f15579a, view, null);
        } catch (Exception unused) {
            za.i.e("Exception getting data.");
            return null;
        }
    }

    public final void B(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z3, boolean z10) throws JSONException {
        List list;
        String strH;
        tb.a aVar = this.f15591o;
        ga0 ga0Var = this.f15583e;
        JSONObject jSONObject7 = this.f15581c;
        try {
            x();
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            ka0 ka0Var = this.f15580b;
            jSONObject8.put("has_custom_click_handler", ((nn) ka0Var.g.get(ga0Var.q())) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", ga0Var.W());
            jSONObject9.put("view_aware_api_used", z3);
            qm qmVar = this.f15588l.j;
            jSONObject9.put("custom_mute_requested", qmVar != null && qmVar.g);
            synchronized (ga0Var) {
                list = ga0Var.f11418f;
            }
            jSONObject9.put("custom_mute_enabled", (list.isEmpty() || ga0Var.f() == null) ? false : true);
            if (this.f15590n.f16762c != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            aVar.getClass();
            jSONObject9.put("timestamp", System.currentTimeMillis());
            if (this.f15600x && this.f15581c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z10) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", ((nn) ka0Var.g.get(ga0Var.q())) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strH = this.f15584f.f14684b.h(this.f15579a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e2) {
                za.i.f("Exception obtaining click signals", e2);
                strH = null;
            }
            jSONObject9.put("click_signals", strH);
            jSONObject9.put("open_chrome_custom_tab", true);
            pk pkVar = sk.P9;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && tb.b.h()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) sVar.f36166c.a(sk.Q9)).booleanValue() && tb.b.h()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            aVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", jCurrentTimeMillis - this.A);
            jSONObject10.put("time_from_last_touch", jCurrentTimeMillis - this.B);
            jSONObject8.put("touch_signal", jSONObject10);
            if (this.j.b()) {
                JSONObject jSONObject11 = (JSONObject) jSONObject7.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.f15596t.h4(string, ga0Var);
                }
            }
            nn1.e(this.f15582d.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick");
        } catch (JSONException e10) {
            za.i.f("Unable to create click JSON.", e10);
        }
    }

    public final void C() {
        try {
            va.j1 j1Var = this.C;
            if (j1Var != null) {
                j1Var.g1(j1Var.T(), 1);
            }
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void K() throws JSONException {
        y(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final int M1() {
        qm qmVar = this.f15588l.j;
        if (qmVar == null) {
            return 0;
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Nc)).booleanValue()) {
            return qmVar.f15372i;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f15601y = new Point();
        this.f15602z = new Point();
        if (!this.f15598v) {
            this.f15592p.v1(view);
            this.f15598v = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        j30 j30Var = this.f15589m;
        j30Var.getClass();
        j30Var.j = new WeakReference(this);
        boolean zC = pk.a.C(this.f15587k.f38131c);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zC) {
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
                    if (zC) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void b(View view) {
        if (!this.f15581c.optBoolean("custom_one_point_five_click_enabled", false)) {
            za.i.h("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            ta0 ta0Var = this.f15590n;
            view.setOnClickListener(ta0Var);
            view.setClickable(true);
            ta0Var.g = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f15579a;
        JSONObject jSONObjectJ = pk.a.J(context, map, map2, view, scaleType);
        JSONObject jSONObjectE = pk.a.E(context, view);
        JSONObject jSONObjectF = pk.a.F(view);
        JSONObject jSONObjectH = pk.a.H(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectJ);
            jSONObject.put("ad_view_signal", jSONObjectE);
            jSONObject.put("scroll_view_signal", jSONObjectF);
            jSONObject.put("lock_screen_signal", jSONObjectH);
            return jSONObject;
        } catch (JSONException e2) {
            za.i.f("Unable to create native ad view signals JSON.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void d(Bundle bundle) throws JSONException {
        if (bundle == null) {
            za.i.c("Click data is null. No click is reported.");
            return;
        }
        if (!f("click_reporting")) {
            za.i.e("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        JSONObject jSONObjectK = null;
        String string = bundle2 != null ? bundle2.getString("asset_id") : null;
        za.d dVar = va.r.g.f36157a;
        dVar.getClass();
        try {
            jSONObjectK = dVar.k(bundle);
        } catch (JSONException e2) {
            za.i.f("Error converting Bundle to JSON", e2);
        }
        B(null, null, null, null, null, string, null, jSONObjectK, false, false);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void e() {
        this.f15600x = true;
    }

    public final boolean f(String str) {
        JSONObject jSONObjectOptJSONObject = this.f15581c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void g(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f15579a;
        JSONObject jSONObjectJ = pk.a.J(context, map, map2, view2, scaleType);
        JSONObject jSONObjectE = pk.a.E(context, view2);
        JSONObject jSONObjectF = pk.a.F(view2);
        JSONObject jSONObjectH = pk.a.H(context, view2);
        String strR = r(view, map);
        B(true == ((Boolean) va.s.f36163e.f36166c.a(sk.q4)).booleanValue() ? view2 : view, jSONObjectE, jSONObjectJ, jSONObjectF, jSONObjectH, strR, pk.a.L(strR, context, this.f15602z, this.f15601y), null, z3, false);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void h(va.j1 j1Var) {
        this.C = j1Var;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final boolean i() {
        if (M1() == 0) {
            return true;
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Nc)).booleanValue()) {
            return this.f15588l.j.j;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void j(View view) {
        this.f15601y = new Point();
        this.f15602z = new Point();
        if (view != null) {
            r80 r80Var = this.f15592p;
            synchronized (r80Var) {
                WeakHashMap weakHashMap = r80Var.f15573c;
                if (weakHashMap.containsKey(view)) {
                    ((yg) weakHashMap.get(view)).f18745l.remove(r80Var);
                    weakHashMap.remove(view);
                }
            }
        }
        this.f15598v = false;
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void k(vn vnVar) {
        if (!this.f15581c.optBoolean("custom_one_point_five_click_enabled", false)) {
            za.i.h("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ta0 ta0Var = this.f15590n;
        hc0 hc0Var = ta0Var.f16760a;
        ta0Var.f16762c = vnVar;
        lo loVar = ta0Var.f16763d;
        if (loVar != null) {
            hc0Var.c("/unconfirmedClick", loVar);
        }
        lo loVar2 = new lo(4, ta0Var, vnVar);
        ta0Var.f16763d = loVar2;
        hc0Var.b("/unconfirmedClick", loVar2);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void l() {
        View view;
        if (this.f15581c.optBoolean("custom_one_point_five_click_enabled", false)) {
            ta0 ta0Var = this.f15590n;
            if (ta0Var.f16762c == null || ta0Var.f16765f == null) {
                return;
            }
            ta0Var.f16764e = null;
            ta0Var.f16765f = null;
            WeakReference weakReference = ta0Var.g;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                ta0Var.g = null;
            }
            try {
                vn vnVar = ta0Var.f16762c;
                vnVar.g1(vnVar.T(), 2);
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectC = c(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f15600x && this.f15581c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectC != null) {
                jSONObject.put("nas", jSONObjectC);
            }
            return jSONObject;
        } catch (JSONException e2) {
            za.i.f("Unable to create native click meta data JSON.", e2);
            return jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // com.google.android.gms.internal.ads.ja0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(android.view.View r17, android.view.View r18, java.util.Map r19, java.util.Map r20, boolean r21, android.widget.ImageView.ScaleType r22, int r23) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r90.n(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean, android.widget.ImageView$ScaleType, int):void");
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void o(Bundle bundle) {
        if (bundle == null) {
            za.i.c("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!f("touch_reporting")) {
            za.i.e("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f15584f.f14684b.a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        x();
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void p(va.l1 l1Var) {
        va.j2 j2Var;
        bs0 bs0Var = this.f15595s;
        wp0 wp0Var = this.j;
        ct0 ct0Var = this.f15593q;
        try {
            if (this.f15599w) {
                return;
            }
            if (l1Var == null) {
                ga0 ga0Var = this.f15583e;
                synchronized (ga0Var) {
                    j2Var = ga0Var.g;
                }
                if (j2Var != null) {
                    this.f15599w = true;
                    ct0Var.b(ga0Var.f().f36125b, wp0Var.f18117x0, bs0Var, null);
                    C();
                    return;
                }
            }
            this.f15599w = true;
            ct0Var.b(l1Var.d(), wp0Var.f18117x0, bs0Var, null);
            C();
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void q(String str) throws JSONException {
        B(null, null, null, null, null, str, null, null, false, false);
    }

    public final String r(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iW = this.f15583e.W();
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

    @Override // com.google.android.gms.internal.ads.ja0
    public final void s(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f15579a;
        JSONObject jSONObjectJ = pk.a.J(context, map, map2, view, scaleType);
        JSONObject jSONObjectE = pk.a.E(context, view);
        JSONObject jSONObjectF = pk.a.F(view);
        JSONObject jSONObjectH = pk.a.H(context, view);
        boolean zO = pk.a.O(context, this.j);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f15581c);
            jSONObject.put("asset_view_signal", jSONObjectJ);
            jSONObject.put("ad_view_signal", jSONObjectE);
            jSONObject.put("scroll_view_signal", jSONObjectF);
            jSONObject.put("lock_screen_signal", jSONObjectH);
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16179j4)).booleanValue()) {
                jSONObject.put("view_signals", A(view));
            }
            jSONObject.put("policy_validator_enabled", zO);
            jSONObject.put("screen", pk.a.P(context));
            nn1.e(this.f15582d.a("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e2) {
            za.i.f("Unable to create native ad signals logging JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void t(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f15579a;
        y(pk.a.E(context, view), pk.a.J(context, map, map2, view, scaleType), pk.a.F(view), pk.a.H(context, view), A(view), null, pk.a.O(context, this.j), view);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void u() {
        hc0 hc0Var = this.f15582d;
        synchronized (hc0Var) {
            x71 x71Var = hc0Var.f11837m;
            if (x71Var == null) {
                return;
            }
            h80 h80Var = new h80(16);
            x71Var.a(new q81(0, x71Var, h80Var), hc0Var.f11831e);
            hc0Var.f11837m = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final boolean v(Bundle bundle) throws JSONException {
        JSONObject jSONObjectK;
        if (!f("impression_reporting")) {
            za.i.e("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        za.d dVar = va.r.g.f36157a;
        dVar.getClass();
        if (bundle != null) {
            try {
                jSONObjectK = dVar.k(bundle);
            } catch (JSONException e2) {
                za.i.f("Error converting Bundle to JSON", e2);
            }
        } else {
            jSONObjectK = null;
        }
        return y(null, null, null, null, ((Boolean) va.s.f36163e.f36166c.a(sk.Jc)).booleanValue() ? A(null) : null, jSONObjectK, false, null);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void w(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.f15601y = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.f15591o.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.B = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f15594r.f19057a = motionEvent;
            this.A = jCurrentTimeMillis;
            this.f15602z = this.f15601y;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f15601y;
        motionEventObtain.setLocation(point.x, point.y);
        this.f15584f.f14684b.b(motionEventObtain);
        motionEventObtain.recycle();
        x();
    }

    public final void x() {
        ua.a aVar;
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.Ve)).booleanValue() || (aVar = this.F) == null) {
            return;
        }
        aVar.f35223b = true;
    }

    public final boolean y(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z3, View view) throws JSONException {
        o50 o50Var;
        wp0 wp0Var = this.j;
        Context context = this.f15579a;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f15581c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            pk pkVar = sk.f16179j4;
            va.s sVar = va.s.f36163e;
            rk rkVar = sVar.f36166c;
            rk rkVar2 = sVar.f36166c;
            if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z3);
            jSONObject6.put("screen", pk.a.P(context));
            if (((Boolean) rkVar2.a(sk.Xe)).booleanValue() && (o50Var = this.G) != null) {
                AtomicLong atomicLong = o50Var.f14565a;
                if (atomicLong.get() > 0) {
                    jSONObject6.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, atomicLong.get());
                }
            }
            boolean zBooleanValue = ((Boolean) rkVar2.a(sk.L9)).booleanValue();
            hc0 hc0Var = this.f15582d;
            if (zBooleanValue) {
                hc0Var.b("/clickRecorded", new p90(this, 1));
            } else {
                hc0Var.b("/logScionEvent", new p90(this, 0));
            }
            hc0Var.b("/nativeImpression", new lo(this, view));
            hc0Var.b("/nativeImpressionFlowControl", new q90(this, this.f15593q, wp0Var.f18117x0, this.f15595s));
            nn1.e(hc0Var.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f15597u) {
                return true;
            }
            this.f15597u = ua.j.C.f35271o.k(context, this.f15587k.f38129a, wp0Var.C.toString(), this.f15588l.g);
            return true;
        } catch (JSONException e2) {
            za.i.f("Unable to create impression JSON.", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void z() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f15581c);
            nn1.e(this.f15582d.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e2) {
            za.i.f("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final boolean z1() {
        return this.f15581c.optBoolean("allow_custom_click_gesture", false);
    }
}
