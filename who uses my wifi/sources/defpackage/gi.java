package defpackage;

import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gi implements Runnable {
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;

    public /* synthetic */ gi(int i) {
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller;
        lo1 lo1Var;
        JSONObject jSONObject;
        Object objCall = null;
        int i = 2;
        boolean zBooleanValue = true;
        zAcceptThirdPartyCookies = false;
        boolean zAcceptThirdPartyCookies = false;
        switch (this.f) {
            case 0:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.i;
                Context context = (Context) this.h;
                Intent intent = (Intent) this.g;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    h80 h80VarD = h80.d();
                    int i2 = ConstraintProxyUpdateReceiver.a;
                    h80VarD.a(new Throwable[0]);
                    yj0.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    yj0.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    yj0.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    yj0.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g;
                m00 m00Var = (m00) this.i;
                View view = (View) this.h;
                if (view == null || (overScroller = m00Var.d) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    m00Var.A(coordinatorLayout, view, m00Var.d.getCurrY());
                    view.postOnAnimation(this);
                    return;
                }
                AppBarLayout appBarLayout = (AppBarLayout) view;
                ((AppBarLayout.BaseBehavior) m00Var).G(coordinatorLayout, appBarLayout);
                if (appBarLayout.p) {
                    appBarLayout.e(appBarLayout.f(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
                    return;
                }
                return;
            case 2:
                try {
                    zBooleanValue = ((Boolean) ((ou0) this.i).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                ((om0) this.g).a((String) this.h, zBooleanValue);
                return;
            case 3:
                try {
                    objCall = ((nv) this.g).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.i).post(new jq3((ov) this.h, objCall, 14));
                return;
            case 4:
                ((ha1) this.g).u.g((String) this.h, (t83) this.i);
                return;
            case 5:
                oa1 oa1VarH = ((WorkDatabase) this.g).n().h((String) this.h);
                if (oa1VarH == null || !oa1VarH.b()) {
                    return;
                }
                synchronized (((rz0) this.i).h) {
                    ((rz0) this.i).k.put((String) this.h, oa1VarH);
                    ((rz0) this.i).l.add(oa1VarH);
                    rz0 rz0Var = (rz0) this.i;
                    rz0Var.m.b(rz0Var.l);
                }
                return;
            case 6:
                w81.h((View) this.g, (vq2) this.h);
                ((ValueAnimator) this.i).start();
                return;
            case 7:
                ou0 ou0Var = (ou0) this.h;
                wa1 wa1Var = (wa1) this.i;
                try {
                    ((n70) this.g).get();
                    h80 h80VarD2 = h80.d();
                    String str = wa1.y;
                    String str2 = wa1Var.j.c;
                    h80VarD2.a(new Throwable[0]);
                    n70 n70VarStartWork = wa1Var.k.startWork();
                    wa1Var.w = n70VarStartWork;
                    ou0Var.k(n70VarStartWork);
                    return;
                } catch (Throwable th) {
                    ou0Var.j(th);
                    return;
                }
            case 8:
                String str3 = (String) this.h;
                wa1 wa1Var2 = (wa1) this.i;
                try {
                    try {
                        r70 r70Var = (r70) ((ou0) this.g).get();
                        if (r70Var == null) {
                            h80.d().b(wa1.y, wa1Var2.j.c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                        } else {
                            h80 h80VarD3 = h80.d();
                            String str4 = wa1.y;
                            String.format("%s returned a %s result.", wa1Var2.j.c, r70Var);
                            h80VarD3.a(new Throwable[0]);
                            wa1Var2.m = r70Var;
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        h80.d().b(wa1.y, str3 + " failed because it threw an exception/error", e);
                    } catch (CancellationException e2) {
                        h80 h80VarD4 = h80.d();
                        String str5 = wa1.y;
                        h80VarD4.e(e2);
                    } catch (ExecutionException e3) {
                        e = e3;
                        h80.d().b(wa1.y, str3 + " failed because it threw an exception/error", e);
                    }
                    wa1Var2.b();
                    return;
                } catch (Throwable th2) {
                    wa1Var2.b();
                    throw th2;
                }
            case 9:
                new l92((Context) this.h, ((b3) this.g).a).L((wm0) this.i);
                return;
            case 10:
                gw3 gw3Var = (gw3) this.g;
                ph4 ph4Var = (ph4) this.h;
                w34 w34Var = (w34) this.i;
                gw3Var.getClass();
                String str6 = v23.a;
                md4 md4Var = ((oa4) gw3Var.h).f.y;
                ad4 ad4VarY = md4Var.y();
                md4Var.s(ad4VarY, 1017, new it3(ad4VarY, ph4Var, w34Var));
                return;
            case 11:
                jo1 jo1Var = (jo1) this.g;
                synchronized (jo1Var.j) {
                }
                rl rlVar = (rl) this.h;
                oo1 oo1Var = (oo1) rlVar.i;
                if (oo1Var == null) {
                    jo1Var.i(rlVar.g);
                } else {
                    synchronized (jo1Var.j) {
                        lo1Var = jo1Var.k;
                    }
                    lo1Var.d(oo1Var);
                }
                if (rlVar.f) {
                    jo1Var.a("intermediate-response");
                } else {
                    jo1Var.b("done");
                }
                Runnable runnable = (Runnable) this.i;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 12:
                xv1 xv1Var = (xv1) this.g;
                WebView webView = (WebView) this.h;
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", xv1Var);
                        return;
                    } catch (Throwable unused3) {
                        xv1Var.onReceiveValue("");
                        return;
                    }
                }
                return;
            case 13:
                i01 i01Var = (i01) this.g;
                Bundle bundle = (Bundle) this.h;
                a02 a02Var = (a02) this.i;
                nh4 nh4Var = hg4.C.f;
                Context context2 = i01Var.a;
                nh4Var.getClass();
                CookieManager cookieManagerD = bd2.D();
                bundle.putBoolean("accept_3p_cookie", cookieManagerD != null ? cookieManagerD.acceptThirdPartyCookies(i01Var.b) : false);
                ug0.r(context2, new b3((a3) new a3(1).i1(bundle)), a02Var);
                return;
            case 14:
                String str7 = (String) this.g;
                if (TextUtils.isEmpty(str7)) {
                    return;
                }
                String str8 = (String) this.h;
                String lowerCase = str7.toLowerCase();
                if (TextUtils.isEmpty(str8)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str8);
                    } catch (JSONException unused4) {
                        return;
                    }
                }
                ln2[] ln2VarArr = (ln2[]) this.i;
                jSONObject.toString();
                for (ln2 ln2Var : ln2VarArr) {
                    FutureTask futureTask = new FutureTask(new yi1(ln2Var, lowerCase, jSONObject, i));
                    ln2Var.a().execute(futureTask);
                    try {
                    } catch (InterruptedException unused5) {
                    } catch (ExecutionException e4) {
                        e4.getCause();
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                }
                return;
            case 15:
                ee2 ee2Var = ((yd2) this.i).v;
                if (ee2Var != null) {
                    ee2Var.c("error", "what", (String) this.g, "extra", (String) this.h);
                    return;
                }
                return;
            case 16:
                ((og2) this.g).R((String) this.h, (ValueCallback) this.i);
                return;
            case 17:
                ah2 ah2Var = (ah2) this.g;
                Context context3 = (Context) this.h;
                e51 e51Var = (e51) this.i;
                hg4 hg4Var = hg4.C;
                hg4Var.k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                hg4Var.c.D(context3, e51Var.f);
                iz1 iz1Var = mz1.xe;
                tw1 tw1Var = tw1.e;
                if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                    hg4Var.k.getClass();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    lv2 lv2VarA = ah2Var.b.a();
                    lv2VarA.k("action", "webview_startup_l");
                    StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
                    sb.append(jElapsedRealtime2);
                    lv2VarA.k("webview_startup_l", sb.toString());
                    lv2VarA.m();
                }
                if (((Boolean) tw1Var.c.a(mz1.De)).booleanValue()) {
                    md2.f.execute(new fu1(19, ah2Var));
                    return;
                }
                return;
            case 18:
                ((eb3) this.g).b((String) this.h, (x34) this.i, null, null);
                return;
            case 19:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.g;
                String str9 = (String) this.h;
                ug4 ug4Var = (ug4) this.i;
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str9});
                jz2.f(sQLiteDatabase, ug4Var);
                return;
            case 20:
                t13.c((h83) this.g, (a83) this.h, (c03) this.i);
                return;
            case zy1.zzm /* 21 */:
                lj3 lj3Var = (lj3) this.g;
                g4 g4Var = (g4) this.h;
                jh3 jh3Var = (jh3) this.i;
                if (!lj3Var.a.a(g4Var)) {
                    throw new rg(2);
                }
                lj3Var.g.set("2.".concat(String.valueOf(jh3Var.A().A())));
                return;
            case 22:
                mj3 mj3Var = (mj3) this.g;
                HashMap map = (HashMap) this.i;
                Context context4 = (Context) this.h;
                map.putAll(mj3Var.d.a());
                mj3Var.g(map);
                map.put("f", "q");
                map.put("ctx", context4);
                return;
            case 23:
                rk3 rk3Var = (rk3) this.g;
                lk3 lk3Var = (lk3) this.h;
                it3 it3Var = (it3) this.i;
                String str10 = rk3Var.b;
                try {
                    x03 x03Var = rk3Var.a;
                    if (x03Var == null) {
                        throw null;
                    }
                    kk3 kk3Var = (kk3) x03Var.o;
                    if (kk3Var == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("callerPackage", str10);
                    String str11 = lk3Var.a;
                    if (!rk3.b(str11)) {
                        str11.getClass();
                        bundle2.putString("sessionToken", str11.trim());
                    }
                    String str12 = lk3Var.b;
                    if (!rk3.b(str12)) {
                        str12.getClass();
                        bundle2.putString("appId", str12.trim());
                    }
                    qk3 qk3Var = new qk3(rk3Var, it3Var);
                    ik3 ik3Var = (ik3) kk3Var;
                    Parcel parcelU = ik3Var.U();
                    iv1.c(parcelU, bundle2);
                    iv1.e(parcelU, qk3Var);
                    ik3Var.X0(parcelU, 2);
                    return;
                } catch (RemoteException e5) {
                    rk3.c.f(e5, "dismiss overlay display from: %s", str10);
                    return;
                }
            case 24:
                rk3 rk3Var2 = (rk3) this.g;
                nk3 nk3Var = (nk3) this.h;
                it3 it3Var2 = (it3) this.i;
                String str13 = rk3Var2.b;
                try {
                    x03 x03Var2 = rk3Var2.a;
                    if (x03Var2 == null) {
                        throw null;
                    }
                    kk3 kk3Var2 = (kk3) x03Var2.o;
                    if (kk3Var2 == null) {
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("callerPackage", str13);
                    bundle3.putBinder("windowToken", nk3Var.a);
                    String str14 = nk3Var.f;
                    if (!rk3.b(str14)) {
                        str14.getClass();
                        bundle3.putString("adFieldEnifd", str14.trim());
                    }
                    bundle3.putInt("layoutGravity", nk3Var.c);
                    bundle3.putFloat("layoutVerticalMargin", nk3Var.d);
                    bundle3.putInt("displayMode", 0);
                    bundle3.putInt("triggerMode", 0);
                    bundle3.putInt("windowWidthPx", nk3Var.e);
                    if (!rk3.b(null) || !rk3.b(null)) {
                        throw null;
                    }
                    String str15 = nk3Var.b;
                    if (!rk3.b(str15)) {
                        str15.getClass();
                        bundle3.putString("appId", str15.trim());
                    }
                    if (!rk3.b(null)) {
                        throw null;
                    }
                    bundle3.putBoolean("stableSessionToken", true);
                    qk3 qk3Var2 = new qk3(rk3Var2, it3Var2);
                    ik3 ik3Var2 = (ik3) kk3Var2;
                    Parcel parcelU2 = ik3Var2.U();
                    parcelU2.writeString(str13);
                    iv1.c(parcelU2, bundle3);
                    iv1.e(parcelU2, qk3Var2);
                    ik3Var2.X0(parcelU2, 1);
                    return;
                } catch (RemoteException e6) {
                    rk3.c.f(e6, "show overlay display from: %s", str13);
                    return;
                }
            case 25:
                rb4 rb4Var = (rb4) this.g;
                um3 um3Var = (um3) this.h;
                kh4 kh4Var = (kh4) this.i;
                md4 md4Var2 = rb4Var.c;
                sn3 sn3VarF = um3Var.f();
                f74 f74Var = md4Var2.l;
                f74Var.getClass();
                bu1 bu1Var = md4Var2.i;
                bu1Var.getClass();
                bu1Var.h = xm3.m(sn3VarF);
                if (!sn3VarF.isEmpty()) {
                    bu1Var.k = (kh4) sn3VarF.get(0);
                    kh4Var.getClass();
                    bu1Var.l = kh4Var;
                }
                if (((kh4) bu1Var.j) == null) {
                    bu1Var.j = bu1.D(f74Var, (xm3) bu1Var.h, (kh4) bu1Var.k, (sw1) bu1Var.g);
                }
                bu1Var.B(f74Var.K1());
                return;
            case 26:
                Pair pair = (Pair) this.h;
                ((md4) ((vb4) this.g).g.n).p(((Integer) pair.first).intValue(), (kh4) pair.second, (hh4) this.i);
                return;
            case 27:
                jd4 jd4Var = (jd4) this.g;
                Object obj = this.h;
                Pair pair2 = (Pair) this.i;
                if (obj instanceof WebView) {
                    Context context5 = jd4Var.c;
                    hg4.C.f.getClass();
                    CookieManager cookieManagerD2 = bd2.D();
                    if (cookieManagerD2 != null) {
                        zAcceptThirdPartyCookies = cookieManagerD2.acceptThirdPartyCookies((WebView) obj);
                    }
                }
                HashMap map2 = jd4Var.a;
                Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
                ge4 ge4Var = (ge4) map2.get(boolValueOf);
                if (ge4Var != null) {
                    hg4.C.k.getClass();
                    if (ge4Var.c > System.currentTimeMillis()) {
                        jd4Var.e(ge4Var, pair2, true);
                        return;
                    }
                }
                HashMap map3 = jd4Var.b;
                List arrayList = (List) map3.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map3.put(boolValueOf, arrayList);
                }
                arrayList.add(pair2);
                return;
            case 28:
                wt2 wt2Var = (wt2) this.g;
                ph4 ph4Var2 = (ph4) this.h;
                w34 w34Var2 = (w34) this.i;
                wt2Var.getClass();
                String str16 = v23.a;
                md4 md4Var3 = ((oa4) wt2Var.h).f.y;
                ad4 ad4VarY2 = md4Var3.y();
                md4Var3.s(ad4VarY2, 1009, new ld4(ad4VarY2, ph4Var2, w34Var2));
                return;
            default:
                gi1 gi1Var = (gi1) this.g;
                uh uhVar = (uh) this.h;
                pi1 pi1Var = (pi1) this.i;
                ((Handler) gi1Var.g).post(new bh3(15, uhVar));
                if (pi1Var.g != 2) {
                    ((z42) gi1Var.j).a();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ gi(Context context, b3 b3Var, wm0 wm0Var) {
        this.f = 9;
        this.h = context;
        this.g = b3Var;
        this.i = wm0Var;
    }

    public /* synthetic */ gi(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    public /* synthetic */ gi(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.f = i;
        this.i = obj;
        this.g = obj2;
        this.h = obj3;
    }

    public /* synthetic */ gi(mj3 mj3Var, HashMap map, Context context) {
        this.f = 22;
        this.g = mj3Var;
        this.i = map;
        this.h = context;
    }

    public gi(yv1 yv1Var, uv1 uv1Var, WebView webView, boolean z) {
        this.f = 12;
        this.h = webView;
        this.i = yv1Var;
        this.g = new xv1(this, uv1Var, webView, z);
    }

    public gi(View view, a91 a91Var, vq2 vq2Var, ValueAnimator valueAnimator) {
        this.f = 6;
        this.g = view;
        this.h = vq2Var;
        this.i = valueAnimator;
    }
}
