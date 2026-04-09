package com.applovin.adview;

import B.c;
import C.T;
import C.g0;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import com.applovin.impl.AbstractC2113d;
import com.applovin.impl.AbstractC2119g;
import com.applovin.impl.AbstractC2128k0;
import com.applovin.impl.C2112c0;
import com.applovin.impl.C2115e;
import com.applovin.impl.a2;
import com.applovin.impl.a7;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.h2;
import com.applovin.impl.i1;
import com.applovin.impl.l4;
import com.applovin.impl.n4;
import com.applovin.impl.r1;
import com.applovin.impl.r7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y1;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements i1 {
    private static final Set i = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: j, reason: collision with root package name */
    private static final Object f18750j = new Object();

    @SuppressLint({"StaticFieldLeak"})
    public static h2 parentInterstitialWrapper;

    /* renamed from: a, reason: collision with root package name */
    private k f18751a;

    /* renamed from: b, reason: collision with root package name */
    private r1 f18752b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f18753c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f18754d;

    /* renamed from: e, reason: collision with root package name */
    private b f18755e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18756f;

    /* renamed from: g, reason: collision with root package name */
    private C2112c0 f18757g;

    /* renamed from: h, reason: collision with root package name */
    private long f18758h;

    public static class b implements OnBackInvokedCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f18760a;

        public b(Runnable runnable) {
            this.f18760a = runnable;
        }

        public void onBackInvoked() {
            this.f18760a.run();
        }
    }

    @Override // com.applovin.impl.i1
    public void dismiss(String str) {
        if (AbstractC2128k0.j() && this.f18755e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f18755e);
            this.f18755e = null;
        }
        r1 r1Var = this.f18752b;
        if (r1Var != null) {
            r1Var.a(str);
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r1 r1Var = this.f18752b;
        if (r1Var != null) {
            r1Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            o.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss("activity_destroyed_while_in_background");
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            o.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setBackgroundColor(-16777216);
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"))) {
            h2 h2Var = parentInterstitialWrapper;
            if (h2Var != null && h2Var.f() != null) {
                h2.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", (Throwable) null, this);
            }
            finish();
            return;
        }
        k kVarA = AppLovinSdk.getInstance(this).a();
        this.f18751a = kVarA;
        this.f18756f = ((Boolean) kVarA.a(l4.f20005q2)).booleanValue();
        viewFindViewById.setFitsSystemWindows(true);
        if (AbstractC2128k0.b()) {
            r7.a(viewFindViewById, this.f18751a);
        }
        h2 h2Var2 = parentInterstitialWrapper;
        if (h2Var2 != null && h2Var2.f() != null) {
            com.applovin.impl.sdk.ad.b bVarF = parentInterstitialWrapper.f();
            if (bVarF.C0()) {
                AbstractC2119g.a(bVarF, this, this.f18751a);
            }
        }
        AbstractC2113d.a(this.f18756f, this);
        if (AbstractC2128k0.j() && ((Boolean) this.f18751a.a(l4.f19731E5)).booleanValue()) {
            this.f18755e = new b(new g0(this, 15));
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f18755e);
        }
        a();
        b();
        Integer num = (Integer) this.f18751a.a(l4.f19909d6);
        if (num.intValue() > 0) {
            synchronized (f18750j) {
                Set set = i;
                set.add(this);
                a7.a("AppLovinFullscreenActivity", set.size(), num.intValue(), this.f18751a.E());
            }
        }
        h2 h2Var3 = parentInterstitialWrapper;
        if (h2Var3 != null) {
            r1.a(h2Var3.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.h(), this.f18751a, this, new a());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f18751a);
        this.f18754d = aVar;
        bindService(intent, aVar, 1);
        if (AbstractC2128k0.h()) {
            String str = this.f18751a.n0().getExtraParameters().get("disable_set_data_dir_suffix");
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        k kVar = this.f18751a;
        if (kVar != null && ((Boolean) kVar.a(l4.f19862X1)).booleanValue()) {
            this.f18751a.p0().b(n4.f20565J);
            this.f18751a.p0().b(n4.f20567L);
            this.f18751a.p0().b(n4.f20568M);
        }
        if (this.f18757g != null) {
            this.f18751a.p0().b(n4.f20566K);
            this.f18757g.a();
            this.f18757g = null;
        }
        com.applovin.impl.adview.activity.a aVar = this.f18754d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        r1 r1Var = this.f18752b;
        if (r1Var != null) {
            if (r1Var.h()) {
                this.f18752b.s();
            } else {
                long jC = this.f18752b.c();
                if (jC >= 0) {
                    if (jC == 0) {
                        this.f18752b.d(true);
                    }
                    AppLovinSdkUtils.runOnUiThreadDelayed(new c(10, this, parentInterstitialWrapper), jC);
                } else {
                    a(this.f18752b, false, false);
                }
            }
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        r1 r1Var = this.f18752b;
        if (r1Var != null) {
            r1Var.a(i10, keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        r1 r1Var = this.f18752b;
        if (r1Var != null) {
            r1Var.t();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        r1 r1Var;
        try {
            super.onResume();
            if (this.f18753c.get() || (r1Var = this.f18752b) == null) {
                return;
            }
            r1Var.u();
        } catch (IllegalArgumentException e4) {
            this.f18751a.O();
            if (o.a()) {
                this.f18751a.O().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e4);
            }
            this.f18751a.E().a("AppLovinFullscreenActivity", "onResume", e4);
            dismiss("activity_on_resume_error");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        r1 r1Var = this.f18752b;
        if (r1Var != null) {
            r1Var.v();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        if (this.f18752b != null) {
            if (!this.f18753c.getAndSet(false)) {
                this.f18752b.b(z10);
            }
            if (z10) {
                AbstractC2113d.a(this.f18756f, this);
            }
        }
        super.onWindowFocusChanged(z10);
    }

    public void setPresenter(r1 r1Var) {
        this.f18752b = r1Var;
    }

    public class a implements r1.f {
        public a() {
        }

        @Override // com.applovin.impl.r1.f
        public void a(r1 r1Var) {
            AppLovinFullscreenActivity.this.f18752b = r1Var;
            r1Var.x();
        }

        @Override // com.applovin.impl.r1.f
        public void a(String str, Throwable th) {
            com.applovin.impl.sdk.ad.b bVarF = AppLovinFullscreenActivity.parentInterstitialWrapper.f();
            h2.a(bVarF, AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th, AppLovinFullscreenActivity.this);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AdRevenueConstants.SOURCE_KEY, "createAppLovinFullscreenActivity");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap);
            AppLovinFullscreenActivity.this.f18751a.g().a(y1.f21817s, bVarF, mapHashMap);
        }
    }

    private void b() {
        k kVar = this.f18751a;
        if (kVar == null || !((Boolean) kVar.a(l4.f19868Y1)).booleanValue()) {
            return;
        }
        Long l5 = (Long) this.f18751a.a(l4.f19875Z1);
        this.f18757g = C2112c0.a(l5.longValue(), true, this.f18751a, new T(15, this, l5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        r1 r1Var = this.f18752b;
        if (r1Var != null) {
            r1Var.r();
        }
        if (a7.e(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        boolean z10 = this.f18752b.z();
        boolean z11 = false;
        if (z10) {
            boolean zI = h2Var.i();
            if (!zI) {
                this.f18752b.d(false);
            }
            z11 = zI;
        }
        a(this.f18752b, z10, z11);
    }

    private void a(r1 r1Var, boolean z10, boolean z11) {
        r1Var.a("activity_destroyed_by_app_relaunch");
        if (this.f18751a != null) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AdRevenueConstants.SOURCE_KEY, "onDestroyAppLovinFullScreenActivity");
            h2 h2Var = parentInterstitialWrapper;
            com.applovin.impl.sdk.ad.b bVarF = h2Var != null ? h2Var.f() : null;
            mapHashMap.putAll(a2.a((AppLovinAdImpl) bVarF));
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putBoolean(jSONObject, "reshow_attempted", z10);
            JsonUtils.putBoolean(jSONObject, "reshow_success", z11);
            if (bVarF != null) {
                JsonUtils.putInt(jSONObject, "reshow_count", bVarF.b0());
            }
            mapHashMap.put("details", jSONObject.toString());
            this.f18751a.E().d(y1.f21800j0, mapHashMap);
        }
        r1Var.s();
    }

    private void a() throws JSONException {
        h2 h2Var;
        k kVar = this.f18751a;
        if (kVar == null || !((Boolean) kVar.a(l4.f19862X1)).booleanValue() || (h2Var = parentInterstitialWrapper) == null || h2Var.f() == null) {
            return;
        }
        com.applovin.impl.sdk.ad.b bVarF = parentInterstitialWrapper.f();
        List listJ = bVarF.j();
        if (CollectionUtils.isEmpty(listJ)) {
            return;
        }
        C2115e c2115e = (C2115e) listJ.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", c2115e.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", c2115e.a());
        this.f18751a.p0().b(n4.f20567L, jSONObject.toString());
        this.f18751a.p0().b(n4.f20565J, Long.valueOf(System.currentTimeMillis()));
        this.f18751a.p0().b(n4.f20568M, CollectionUtils.toJsonString(a2.a((AppLovinAdImpl) bVarF), JsonUtils.EMPTY_JSON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l5) {
        this.f18758h = l5.longValue() + this.f18758h;
        this.f18751a.p0().b(n4.f20566K, Long.valueOf(this.f18758h));
    }
}
