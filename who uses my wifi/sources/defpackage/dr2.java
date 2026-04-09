package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dr2 implements wr2 {
    public boolean A;
    public oo2 H;
    public final ao2 I;
    public final fs2 J;
    public final su1 K;
    public final gm2 L;
    public final Context f;
    public final yr2 g;
    public final JSONObject h;
    public final au2 i;
    public final tr2 j;
    public final vs1 k;
    public final cn2 l;
    public final sm2 m;
    public final wp2 n;
    public final a83 o;
    public final e51 p;
    public final l83 q;
    public final xj2 r;
    public final hs2 s;
    public final ym t;
    public final vp2 u;
    public final eb3 v;
    public final tu2 w;
    public final da3 x;
    public final pz2 y;
    public boolean z = false;
    public boolean B = false;
    public boolean C = false;
    public Point D = new Point();
    public Point E = new Point();
    public long F = 0;
    public long G = 0;

    public dr2(Context context, yr2 yr2Var, JSONObject jSONObject, au2 au2Var, tr2 tr2Var, vs1 vs1Var, cn2 cn2Var, sm2 sm2Var, wp2 wp2Var, a83 a83Var, e51 e51Var, l83 l83Var, xj2 xj2Var, hs2 hs2Var, ym ymVar, vp2 vp2Var, eb3 eb3Var, da3 da3Var, pz2 pz2Var, tu2 tu2Var, fs2 fs2Var, ao2 ao2Var, su1 su1Var, gm2 gm2Var) {
        this.f = context;
        this.g = yr2Var;
        this.h = jSONObject;
        this.i = au2Var;
        this.j = tr2Var;
        this.k = vs1Var;
        this.l = cn2Var;
        this.m = sm2Var;
        this.n = wp2Var;
        this.o = a83Var;
        this.p = e51Var;
        this.q = l83Var;
        this.r = xj2Var;
        this.s = hs2Var;
        this.t = ymVar;
        this.u = vp2Var;
        this.v = eb3Var;
        this.x = da3Var;
        this.y = pz2Var;
        this.w = tu2Var;
        this.J = fs2Var;
        this.I = ao2Var;
        this.K = su1Var;
        this.L = gm2Var;
    }

    public final String A(View view) {
        if (!((Boolean) tw1.e.c.a(mz1.S3)).booleanValue()) {
            return null;
        }
        try {
            return this.k.b.i(this.f, view, null);
        } catch (Exception unused) {
            gi2.Z("Exception getting data.");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(android.view.View r13, org.json.JSONObject r14, org.json.JSONObject r15, org.json.JSONObject r16, org.json.JSONObject r17, java.lang.String r18, org.json.JSONObject r19, org.json.JSONObject r20, boolean r21, boolean r22) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr2.B(android.view.View, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject, java.lang.String, org.json.JSONObject, org.json.JSONObject, boolean, boolean):void");
    }

    public final void C() {
        try {
            oo2 oo2Var = this.H;
            if (oo2Var != null) {
                oo2Var.M0(oo2Var.U(), 1);
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.wr2
    public final void J(String str) throws JSONException {
        B(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // defpackage.wr2
    public final void L() {
        au2 au2Var = this.i;
        synchronized (au2Var) {
            rp3 rp3Var = au2Var.m;
            if (rp3Var == null) {
                return;
            }
            sd2 sd2Var = new sd2(29);
            rp3Var.c(new jq3(rp3Var, sd2Var, 0), au2Var.e);
            au2Var.m = null;
        }
    }

    @Override // defpackage.wr2
    public final void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.D = new Point();
        this.E = new Point();
        if (!this.A) {
            this.u.U1(view);
            this.A = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        xj2 xj2Var = this.r;
        xj2Var.getClass();
        xj2Var.o = new WeakReference(this);
        boolean zM = uk2.M(this.p.h);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zM) {
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
                    if (zM) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // defpackage.wr2
    public final void b(oo2 oo2Var) {
        this.H = oo2Var;
    }

    @Override // defpackage.wr2
    public final void c(View view) {
        this.D = new Point();
        this.E = new Point();
        if (view != null) {
            vp2 vp2Var = this.u;
            synchronized (vp2Var) {
                WeakHashMap weakHashMap = vp2Var.i;
                if (weakHashMap.containsKey(view)) {
                    ((pv1) weakHashMap.get(view)).q.remove(vp2Var);
                    weakHashMap.remove(view);
                }
            }
        }
        this.A = false;
    }

    @Override // defpackage.wr2
    public final void d() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.h);
            um.F(this.i.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            gi2.c0("", e);
        }
    }

    @Override // defpackage.wr2
    public final void e() {
        this.C = true;
    }

    @Override // defpackage.wr2
    public final boolean f() {
        return this.h.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // defpackage.wr2
    public final void g(View view) {
        if (!this.h.optBoolean("custom_one_point_five_click_enabled", false)) {
            gi2.i0("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            hs2 hs2Var = this.s;
            view.setOnClickListener(hs2Var);
            view.setClickable(true);
            hs2Var.l = new WeakReference(view);
        }
    }

    @Override // defpackage.wr2
    public final JSONObject h(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectM = m(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.C && this.h.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectM != null) {
                jSONObject.put("nas", jSONObjectM);
            }
            return jSONObject;
        } catch (JSONException e) {
            gi2.c0("Unable to create native click meta data JSON.", e);
            return jSONObject;
        }
    }

    @Override // defpackage.wr2
    public final void i(a32 a32Var) {
        if (!this.h.optBoolean("custom_one_point_five_click_enabled", false)) {
            gi2.i0("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        hs2 hs2Var = this.s;
        au2 au2Var = hs2Var.f;
        hs2Var.h = a32Var;
        v32 v32Var = hs2Var.i;
        if (v32Var != null) {
            au2Var.c("/unconfirmedClick", v32Var);
        }
        v32 v32Var2 = new v32(hs2Var, a32Var, 4);
        hs2Var.i = v32Var2;
        au2Var.b("/unconfirmedClick", v32Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // defpackage.wr2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.view.View r17, android.view.View r18, java.util.Map r19, java.util.Map r20, boolean r21, android.widget.ImageView.ScaleType r22, int r23) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr2.j(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean, android.widget.ImageView$ScaleType, int):void");
    }

    @Override // defpackage.wr2
    public final void j0() throws JSONException {
        z(null, null, null, null, null, null, false, null);
    }

    @Override // defpackage.wr2
    public final void k(Bundle bundle) {
        if (bundle == null) {
            gi2.U("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!p("touch_reporting")) {
            gi2.Z("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.k.b.a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        y();
    }

    @Override // defpackage.wr2
    public final void l(nq2 nq2Var) {
        c63 c63Var;
        c63 c63Var2;
        da3 da3Var = this.x;
        a83 a83Var = this.o;
        eb3 eb3Var = this.v;
        try {
            if (this.B) {
                return;
            }
            if (nq2Var == null) {
                tr2 tr2Var = this.j;
                synchronized (tr2Var) {
                    c63Var = tr2Var.g;
                }
                if (c63Var != null) {
                    this.B = true;
                    synchronized (tr2Var) {
                        c63Var2 = tr2Var.g;
                    }
                    eb3Var.b(c63Var2.g, a83Var.x0, da3Var, null);
                    C();
                    return;
                }
            }
            this.B = true;
            eb3Var.b(nq2Var.c(), a83Var.x0, da3Var, null);
            C();
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.wr2
    public final JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f;
        JSONObject jSONObjectZ = uk2.Z(context, map, map2, view, scaleType);
        JSONObject jSONObjectN = uk2.N(context, view);
        JSONObject jSONObjectS = uk2.S(view);
        JSONObject jSONObjectV = uk2.V(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZ);
            jSONObject.put("ad_view_signal", jSONObjectN);
            jSONObject.put("scroll_view_signal", jSONObjectS);
            jSONObject.put("lock_screen_signal", jSONObjectV);
            return jSONObject;
        } catch (JSONException e) {
            gi2.c0("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // defpackage.wr2
    public final void n(Bundle bundle) throws JSONException {
        if (bundle == null) {
            gi2.U("Click data is null. No click is reported.");
            return;
        }
        if (!p("click_reporting")) {
            gi2.Z("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        JSONObject jSONObjectJ = null;
        String string = bundle2 != null ? bundle2.getString("asset_id") : null;
        j63 j63Var = sv1.f.a;
        j63Var.getClass();
        try {
            jSONObjectJ = j63Var.j(bundle);
        } catch (JSONException e) {
            gi2.c0("Error converting Bundle to JSON", e);
        }
        B(null, null, null, null, null, string, null, jSONObjectJ, false, false);
    }

    @Override // defpackage.wr2
    public final void o(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f;
        JSONObject jSONObjectZ = uk2.Z(context, map, map2, view, scaleType);
        JSONObject jSONObjectN = uk2.N(context, view);
        JSONObject jSONObjectS = uk2.S(view);
        JSONObject jSONObjectV = uk2.V(context, view);
        boolean zE0 = uk2.e0(context, this.o);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.h);
            jSONObject.put("asset_view_signal", jSONObjectZ);
            jSONObject.put("ad_view_signal", jSONObjectN);
            jSONObject.put("scroll_view_signal", jSONObjectS);
            jSONObject.put("lock_screen_signal", jSONObjectV);
            if (((Boolean) tw1.e.c.a(mz1.S3)).booleanValue()) {
                jSONObject.put("view_signals", A(view));
            }
            jSONObject.put("policy_validator_enabled", zE0);
            jSONObject.put("screen", uk2.f0(context));
            um.F(this.i.a("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e) {
            gi2.c0("Unable to create native ad signals logging JSON.", e);
        }
    }

    public final boolean p(String str) {
        JSONObject jSONObjectOptJSONObject = this.h.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    @Override // defpackage.wr2
    public final void q(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f;
        JSONObject jSONObjectZ = uk2.Z(context, map, map2, view2, scaleType);
        JSONObject jSONObjectN = uk2.N(context, view2);
        JSONObject jSONObjectS = uk2.S(view2);
        JSONObject jSONObjectV = uk2.V(context, view2);
        String strW = w(view, map);
        B(true == ((Boolean) tw1.e.c.a(mz1.Z3)).booleanValue() ? view2 : view, jSONObjectN, jSONObjectZ, jSONObjectS, jSONObjectV, strW, uk2.b0(strW, context, this.E, this.D), null, z, false);
    }

    @Override // defpackage.wr2
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.f;
        z(uk2.N(context, view), uk2.Z(context, map, map2, view, scaleType), uk2.S(view), uk2.V(context, view), A(view), null, uk2.e0(context, this.o), view);
    }

    @Override // defpackage.wr2
    public final boolean s() {
        if (v() == 0) {
            return true;
        }
        if (((Boolean) tw1.e.c.a(mz1.oc)).booleanValue()) {
            return this.q.j.o;
        }
        return true;
    }

    @Override // defpackage.wr2
    public final boolean t(Bundle bundle) throws JSONException {
        JSONObject jSONObjectJ;
        if (!p("impression_reporting")) {
            gi2.Z("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        j63 j63Var = sv1.f.a;
        j63Var.getClass();
        if (bundle != null) {
            try {
                jSONObjectJ = j63Var.j(bundle);
            } catch (JSONException e) {
                gi2.c0("Error converting Bundle to JSON", e);
            }
        } else {
            jSONObjectJ = null;
        }
        return z(null, null, null, null, ((Boolean) tw1.e.c.a(mz1.kc)).booleanValue() ? A(null) : null, jSONObjectJ, false, null);
    }

    @Override // defpackage.wr2
    public final void u(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.D = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.G = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.w.a = motionEvent;
            this.F = jCurrentTimeMillis;
            this.E = this.D;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.D;
        motionEventObtain.setLocation(point.x, point.y);
        this.k.b.f(motionEventObtain);
        motionEventObtain.recycle();
        y();
    }

    @Override // defpackage.wr2
    public final int v() {
        r12 r12Var = this.q.j;
        if (r12Var == null) {
            return 0;
        }
        if (((Boolean) tw1.e.c.a(mz1.oc)).booleanValue()) {
            return r12Var.n;
        }
        return 0;
    }

    public final String w(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iQ = this.j.q();
        if (iQ == 1) {
            return "1099";
        }
        if (iQ == 2) {
            return "2099";
        }
        if (iQ != 6) {
            return null;
        }
        return "3099";
    }

    @Override // defpackage.wr2
    public final void x() {
        View view;
        if (this.h.optBoolean("custom_one_point_five_click_enabled", false)) {
            hs2 hs2Var = this.s;
            if (hs2Var.h == null || hs2Var.k == null) {
                return;
            }
            hs2Var.j = null;
            hs2Var.k = null;
            WeakReference weakReference = hs2Var.l;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                hs2Var.l = null;
            }
            try {
                a32 a32Var = hs2Var.h;
                a32Var.M0(a32Var.U(), 2);
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            }
        }
    }

    public final void y() {
        su1 su1Var;
        if (!((Boolean) tw1.e.c.a(mz1.pe)).booleanValue() || (su1Var = this.K) == null) {
            return;
        }
        su1Var.b = true;
    }

    public final boolean z(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z, View view) throws JSONException {
        gm2 gm2Var;
        a83 a83Var = this.o;
        Context context = this.f;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.h);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            iz1 iz1Var = mz1.S3;
            tw1 tw1Var = tw1.e;
            kz1 kz1Var = tw1Var.c;
            kz1 kz1Var2 = tw1Var.c;
            if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", uk2.f0(context));
            if (((Boolean) kz1Var2.a(mz1.re)).booleanValue() && (gm2Var = this.L) != null) {
                AtomicLong atomicLong = gm2Var.a;
                if (atomicLong.get() > 0) {
                    jSONObject6.put("placement_id", atomicLong.get());
                }
            }
            boolean zBooleanValue = ((Boolean) kz1Var2.a(mz1.m9)).booleanValue();
            au2 au2Var = this.i;
            if (zBooleanValue) {
                au2Var.b("/clickRecorded", new br2(this, 1));
            } else {
                au2Var.b("/logScionEvent", new br2(this, 0));
            }
            au2Var.b("/nativeImpression", new v32(this, view));
            au2Var.b("/nativeImpressionFlowControl", new cr2(this, this.v, a83Var.x0, this.x));
            um.F(au2Var.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.z) {
                return true;
            }
            this.z = hg4.C.o.d(context, this.p.f, a83Var.C.toString(), this.q.g);
            return true;
        } catch (JSONException e) {
            gi2.c0("Unable to create impression JSON.", e);
            return false;
        }
    }
}
