package fb;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.NetworkSecurityPolicy;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.ww;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.liuzh.deviceinfo.R;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23966a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23967b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23968c;

    public /* synthetic */ r(int i4, Object obj, Object obj2) {
        this.f23966a = i4;
        this.f23967b = obj;
        this.f23968c = obj2;
    }

    private final void b() {
        ya.c0 c0Var = (ya.c0) this.f23967b;
        SharedPreferences sharedPreferences = ((Context) this.f23968c).getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            synchronized (c0Var.f37402a) {
                try {
                    c0Var.f37407f = sharedPreferences;
                    c0Var.g = editorEdit;
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    c0Var.f37408h = c0Var.f37407f.getBoolean("use_https", c0Var.f37408h);
                    c0Var.f37420u = c0Var.f37407f.getBoolean("content_url_opted_out", c0Var.f37420u);
                    c0Var.f37409i = c0Var.f37407f.getString("content_url_hashes", c0Var.f37409i);
                    c0Var.f37410k = c0Var.f37407f.getBoolean("gad_idless", c0Var.f37410k);
                    c0Var.f37421v = c0Var.f37407f.getBoolean("content_vertical_opted_out", c0Var.f37421v);
                    c0Var.j = c0Var.f37407f.getString("content_vertical_hashes", c0Var.j);
                    c0Var.f37417r = c0Var.f37407f.getInt("version_code", c0Var.f37417r);
                    if (((Boolean) nl.g.u()).booleanValue() && va.s.f36163e.f36166c.j) {
                        c0Var.f37413n = new ww("", 0L);
                    } else {
                        c0Var.f37413n = new ww(c0Var.f37407f.getString("app_settings_json", c0Var.f37413n.f18213e), c0Var.f37407f.getLong("app_settings_last_update_ms", c0Var.f37413n.f18214f));
                    }
                    c0Var.f37414o = c0Var.f37407f.getLong("app_last_background_time_ms", c0Var.f37414o);
                    c0Var.f37416q = c0Var.f37407f.getInt("request_in_session_count", c0Var.f37416q);
                    c0Var.f37415p = c0Var.f37407f.getLong("first_ad_req_time_ms", c0Var.f37415p);
                    c0Var.f37418s = c0Var.f37407f.getStringSet("never_pool_slots", c0Var.f37418s);
                    c0Var.f37422w = c0Var.f37407f.getString("display_cutout", c0Var.f37422w);
                    c0Var.B = c0Var.f37407f.getInt("app_measurement_npa", c0Var.B);
                    c0Var.C = c0Var.f37407f.getInt("sd_app_measure_npa", c0Var.C);
                    c0Var.D = c0Var.f37407f.getLong("sd_app_measure_npa_ts", c0Var.D);
                    c0Var.f37423x = c0Var.f37407f.getString("inspector_info", c0Var.f37423x);
                    c0Var.f37424y = c0Var.f37407f.getBoolean("linked_device", c0Var.f37424y);
                    c0Var.f37425z = c0Var.f37407f.getString("linked_ad_unit", c0Var.f37425z);
                    c0Var.A = c0Var.f37407f.getString("inspector_ui_storage", c0Var.A);
                    c0Var.f37411l = c0Var.f37407f.getString("IABTCF_TCString", c0Var.f37411l);
                    c0Var.f37412m = c0Var.f37407f.getInt("gad_has_consent_for_cookies", c0Var.f37412m);
                    c0Var.E = c0Var.f37407f.getBoolean("is_install_referrer_reported", c0Var.E);
                    try {
                        c0Var.f37419t = new JSONObject(c0Var.f37407f.getString("native_advanced_settings", JsonUtils.EMPTY_JSON));
                    } catch (JSONException e2) {
                        za.i.i("Could not convert native advanced settings to json object", e2);
                    }
                    c0Var.n();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            ua.j.C.f35265h.f("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th3);
            ya.a0.n("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th3);
        }
    }

    public sh.z a(int i4) {
        LayoutInflater layoutInflater = (LayoutInflater) this.f23967b;
        sh.a0 a0Var = (sh.a0) this.f23968c;
        return new sh.z(a0Var, i4, layoutInflater.inflate(R.layout.item_satellite_system, (ViewGroup) a0Var.f33625h0, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:233:0x04aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x043f A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws yb.d, java.security.NoSuchAlgorithmException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.r.run():void");
    }

    public /* synthetic */ r(Object obj, boolean z3, Object obj2, int i4) {
        this.f23966a = i4;
        this.f23968c = obj;
        this.f23967b = obj2;
    }

    public /* synthetic */ r(t7.a aVar, lf.e eVar, cl.u uVar) {
        this.f23966a = 16;
        this.f23967b = aVar;
        this.f23968c = eVar;
    }

    public r(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z3) {
        this.f23966a = 5;
        this.f23968c = swipeDismissBehavior;
        this.f23967b = view;
    }
}
