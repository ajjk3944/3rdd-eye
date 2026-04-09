package f1;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import android.view.View;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.ads.AbstractC0994ca;
import com.google.android.gms.internal.ads.C0487Ef;
import com.google.android.gms.internal.ads.C0504Ff;
import com.google.android.gms.internal.ads.C0784Vn;
import com.google.android.gms.internal.ads.C1053de;
import f4.InterfaceFutureC2326a;
import j2.AbstractC2555k;
import j2.C2549e;
import j2.C2551g;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import q2.E0;
import q2.F0;
import q2.c1;
import r.BinderC2862e;
import s2.BinderC2894d;
import t2.AbstractC2907C;
import t2.C2909E;
import z5.C3030f;
import z5.M;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20047a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20048b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20049c;

    public /* synthetic */ i(Object obj, int i, Object obj2) {
        this.f20047a = i;
        this.f20048b = obj;
        this.f20049c = obj2;
    }

    private final void a() {
        C2909E c2909e = (C2909E) this.f20048b;
        SharedPreferences sharedPreferences = ((Context) this.f20049c).getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            synchronized (c2909e.f23548a) {
                try {
                    c2909e.f23553f = sharedPreferences;
                    c2909e.f23554g = editorEdit;
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    c2909e.f23555h = c2909e.f23553f.getBoolean("use_https", c2909e.f23555h);
                    c2909e.f23567u = c2909e.f23553f.getBoolean("content_url_opted_out", c2909e.f23567u);
                    c2909e.i = c2909e.f23553f.getString("content_url_hashes", c2909e.i);
                    c2909e.f23557k = c2909e.f23553f.getBoolean("gad_idless", c2909e.f23557k);
                    c2909e.f23568v = c2909e.f23553f.getBoolean("content_vertical_opted_out", c2909e.f23568v);
                    c2909e.f23556j = c2909e.f23553f.getString("content_vertical_hashes", c2909e.f23556j);
                    c2909e.f23564r = c2909e.f23553f.getInt("version_code", c2909e.f23564r);
                    if (((Boolean) AbstractC0994ca.f13573g.v()).booleanValue() && C2841s.f23267e.f23270c.f8326j) {
                        c2909e.f23560n = new C0487Ef("", 0L);
                    } else {
                        c2909e.f23560n = new C0487Ef(c2909e.f23553f.getString("app_settings_json", c2909e.f23560n.f7976e), c2909e.f23553f.getLong("app_settings_last_update_ms", c2909e.f23560n.f7977f));
                    }
                    c2909e.f23561o = c2909e.f23553f.getLong("app_last_background_time_ms", c2909e.f23561o);
                    c2909e.f23563q = c2909e.f23553f.getInt("request_in_session_count", c2909e.f23563q);
                    c2909e.f23562p = c2909e.f23553f.getLong("first_ad_req_time_ms", c2909e.f23562p);
                    c2909e.f23565s = c2909e.f23553f.getStringSet("never_pool_slots", c2909e.f23565s);
                    c2909e.f23569w = c2909e.f23553f.getString("display_cutout", c2909e.f23569w);
                    c2909e.f23544B = c2909e.f23553f.getInt("app_measurement_npa", c2909e.f23544B);
                    c2909e.f23545C = c2909e.f23553f.getInt("sd_app_measure_npa", c2909e.f23545C);
                    c2909e.f23546D = c2909e.f23553f.getLong("sd_app_measure_npa_ts", c2909e.f23546D);
                    c2909e.f23570x = c2909e.f23553f.getString("inspector_info", c2909e.f23570x);
                    c2909e.f23571y = c2909e.f23553f.getBoolean("linked_device", c2909e.f23571y);
                    c2909e.f23572z = c2909e.f23553f.getString("linked_ad_unit", c2909e.f23572z);
                    c2909e.f23543A = c2909e.f23553f.getString("inspector_ui_storage", c2909e.f23543A);
                    c2909e.f23558l = c2909e.f23553f.getString("IABTCF_TCString", c2909e.f23558l);
                    c2909e.f23559m = c2909e.f23553f.getInt("gad_has_consent_for_cookies", c2909e.f23559m);
                    c2909e.f23547E = c2909e.f23553f.getBoolean("is_install_referrer_reported", c2909e.f23547E);
                    try {
                        c2909e.f23566t = new JSONObject(c2909e.f23553f.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e6) {
                        u2.k.i("Could not convert native advanced settings to json object", e6);
                    }
                    c2909e.n();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            p2.j.f22785C.f22795h.f("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th2);
            AbstractC2907C.n("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20047a) {
            case 0:
                j jVar = (j) this.f20048b;
                try {
                    ((Runnable) this.f20049c).run();
                    return;
                } finally {
                    jVar.b();
                }
            case 1:
                synchronized (((ConstraintTrackingWorker) this.f20049c).f5701g) {
                    if (((ConstraintTrackingWorker) this.f20049c).f5702h) {
                        ((ConstraintTrackingWorker) this.f20049c).i.i(new V0.j());
                    } else {
                        ((ConstraintTrackingWorker) this.f20049c).i.k((InterfaceFutureC2326a) this.f20048b);
                    }
                }
                return;
            case 2:
                C2549e c2549e = (C2549e) this.f20048b;
                try {
                    c2549e.f21336b.f0(c1.a(c2549e.f21335a, (E0) this.f20049c));
                    return;
                } catch (RemoteException e6) {
                    u2.k.f("Failed to load ad.", e6);
                    return;
                }
            case 3:
                C2551g c2551g = (C2551g) this.f20049c;
                AbstractC2555k abstractC2555k = (AbstractC2555k) this.f20048b;
                try {
                    abstractC2555k.f21350a.b(c2551g.f21337a);
                    return;
                } catch (IllegalStateException e7) {
                    C1053de.a(abstractC2555k.getContext()).e("BaseAdView.loadAd", e7);
                    return;
                }
            case 4:
                C0784Vn c0784Vn = (C0784Vn) this.f20048b;
                Long l2 = (Long) this.f20049c;
                p2.j.f22785C.f22797k.getClass();
                U1.b.E(c0784Vn, "cld_r", SystemClock.elapsedRealtime() - l2.longValue());
                return;
            case 5:
                q1.b bVar = (q1.b) this.f20048b;
                if (bVar.f23083d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f20049c).run();
                    return;
                } catch (Throwable th) {
                    bVar.f23082c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 6:
                F0 f02 = (F0) this.f20048b;
                f02.f23112l.addView((View) S2.b.n1((S2.a) this.f20049c));
                return;
            case 7:
                ((BinderC2862e) this.f20049c).f23313b.d((Bundle) this.f20048b);
                return;
            case 8:
                ((BinderC2894d) ((C0504Ff) this.f20048b).f8145c).f23460b.getWindow().setBackgroundDrawable((BitmapDrawable) this.f20049c);
                return;
            case 9:
                a();
                return;
            default:
                ((C3030f) this.f20049c).D((M) this.f20048b);
                return;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i, boolean z6) {
        this.f20047a = i;
        this.f20049c = obj;
        this.f20048b = obj2;
    }
}
