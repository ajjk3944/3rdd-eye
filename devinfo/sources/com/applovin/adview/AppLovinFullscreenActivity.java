package com.applovin.adview;

import aj.d;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.d2;
import com.applovin.impl.e;
import com.applovin.impl.e8;
import com.applovin.impl.f2;
import com.applovin.impl.g;
import com.applovin.impl.g0;
import com.applovin.impl.n1;
import com.applovin.impl.n2;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w1;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okio.Segment;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements n1 {

    /* renamed from: h, reason: collision with root package name */
    private static final Set f3521h = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i, reason: collision with root package name */
    private static final Object f3522i = new Object();

    @SuppressLint({"StaticFieldLeak"})
    public static n2 parentInterstitialWrapper;

    /* renamed from: a, reason: collision with root package name */
    private k f3523a;

    /* renamed from: b, reason: collision with root package name */
    private w1 f3524b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f3525c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f3526d;

    /* renamed from: e, reason: collision with root package name */
    private c f3527e;

    /* renamed from: f, reason: collision with root package name */
    private g0 f3528f;
    private long g;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Boolean f3529a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3530b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f3531c;

        public a(Boolean bool, boolean z3, com.applovin.impl.sdk.ad.b bVar) {
            this.f3529a = bool;
            this.f3530b = z3;
            this.f3531c = bVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (this.f3529a.booleanValue()) {
                AppLovinFullscreenActivity.this.a(windowInsets);
            }
            if (!this.f3530b) {
                Insets insets = windowInsets.getInsets(((Integer) AppLovinFullscreenActivity.this.f3523a.a(x4.f6149u2)).intValue());
                view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
                return windowInsets;
            }
            int iIntValue = ((Integer) AppLovinFullscreenActivity.this.f3523a.a(x4.f6149u2)).intValue();
            Insets insets2 = windowInsets.getInsets(this.f3531c.F0() ? iIntValue & (~WindowInsets.Type.displayCutout()) : iIntValue | WindowInsets.Type.displayCutout());
            view.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
            return windowInsets;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class c implements OnBackInvokedCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f3534a;

        public c(Runnable runnable) {
            this.f3534a = runnable;
        }

        public void onBackInvoked() {
            this.f3534a.run();
        }
    }

    @Override // com.applovin.impl.n1
    public void dismiss(String str) {
        if (o0.j() && this.f3527e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f3527e);
            this.f3527e = null;
        }
        w1 w1Var = this.f3524b;
        if (w1Var != null) {
            w1Var.a(str);
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
        w1 w1Var = this.f3524b;
        if (w1Var != null) {
            w1Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            o.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss("activity_destroyed_while_in_background");
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th2) {
            o.c("AppLovinFullscreenActivity", "Failed to request window feature", th2);
        }
        getWindow().addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        getWindow().addFlags(128);
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setBackgroundColor(-16777216);
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"))) {
            n2 n2Var = parentInterstitialWrapper;
            if (n2Var != null && n2Var.f() != null) {
                n2.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", (Throwable) null, this);
            }
            finish();
            return;
        }
        this.f3523a = AppLovinSdk.getInstance(this).a();
        n2 n2Var2 = parentInterstitialWrapper;
        com.applovin.impl.sdk.ad.b bVarF = n2Var2 != null ? n2Var2.f() : null;
        Boolean bool = (Boolean) this.f3523a.a(x4.E4);
        boolean z3 = bVarF != null && bVarF.L0();
        if (o0.b() && (bool.booleanValue() || z3)) {
            getWindow().setDecorFitsSystemWindows(false);
            viewFindViewById.setOnApplyWindowInsetsListener(new a(bool, z3, bVarF));
            a(bVarF);
        } else {
            viewFindViewById.setFitsSystemWindows(true);
            if (o0.b()) {
                e8.a(viewFindViewById, this.f3523a);
            }
            a(bVarF);
        }
        if (bVarF != null && bVarF.r0()) {
            g.a(bVarF, this, this.f3523a);
        }
        if (o0.j() && ((Boolean) this.f3523a.a(x4.f6042g6)).booleanValue()) {
            this.f3527e = new c(new androidx.lifecycle.o0(7, this));
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f3527e);
        }
        a();
        b();
        Integer num = (Integer) this.f3523a.a(x4.H6);
        if (num.intValue() > 0) {
            synchronized (f3522i) {
                Set set = f3521h;
                set.add(this);
                n7.a("AppLovinFullscreenActivity", set.size(), num.intValue(), this.f3523a.D());
            }
        }
        n2 n2Var3 = parentInterstitialWrapper;
        if (n2Var3 != null) {
            w1.a(n2Var3.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.h(), this.f3523a, this, new b());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f3523a);
        this.f3526d = aVar;
        bindService(intent, aVar, 1);
        if (o0.h()) {
            String str = this.f3523a.n0().getExtraParameters().get("disable_set_data_dir_suffix");
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
        k kVar = this.f3523a;
        if (kVar != null && ((Boolean) kVar.a(x4.f6172x2)).booleanValue()) {
            this.f3523a.p0().b(z4.N);
            this.f3523a.p0().b(z4.P);
            this.f3523a.p0().b(z4.Q);
        }
        if (this.f3528f != null) {
            this.f3523a.p0().b(z4.O);
            this.f3528f.a();
            this.f3528f = null;
        }
        com.applovin.impl.adview.activity.a aVar = this.f3526d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        w1 w1Var = this.f3524b;
        if (w1Var != null) {
            if (w1Var.g()) {
                this.f3524b.r();
            } else {
                long jA = this.f3524b.a();
                if (jA >= 0) {
                    if (jA == 0) {
                        this.f3524b.d(true);
                    }
                    AppLovinSdkUtils.runOnUiThreadDelayed(new d(4, this, parentInterstitialWrapper), jA);
                } else {
                    a(this.f3524b, false, false);
                }
            }
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        w1 w1Var = this.f3524b;
        if (w1Var != null) {
            w1Var.a(i4, keyEvent);
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        w1 w1Var = this.f3524b;
        if (w1Var != null) {
            w1Var.s();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        w1 w1Var;
        try {
            super.onResume();
            if (this.f3525c.get() || (w1Var = this.f3524b) == null) {
                return;
            }
            w1Var.t();
        } catch (IllegalArgumentException e2) {
            this.f3523a.O();
            if (o.a()) {
                this.f3523a.O().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e2);
            }
            this.f3523a.D().a("AppLovinFullscreenActivity", "onResume", e2);
            dismiss("activity_on_resume_error");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        w1 w1Var = this.f3524b;
        if (w1Var != null) {
            w1Var.u();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z3) {
        if (this.f3524b != null) {
            if (!this.f3525c.getAndSet(false)) {
                this.f3524b.b(z3);
            }
            if (z3) {
                n2 n2Var = parentInterstitialWrapper;
                a(n2Var != null ? n2Var.f() : null);
            }
        }
        super.onWindowFocusChanged(z3);
    }

    public void setPresenter(w1 w1Var) {
        this.f3524b = w1Var;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b implements w1.g {
        public b() {
        }

        @Override // com.applovin.impl.w1.g
        public void a(w1 w1Var) {
            AppLovinFullscreenActivity.this.f3524b = w1Var;
            w1Var.w();
        }

        @Override // com.applovin.impl.w1.g
        public void a(String str, Throwable th2) {
            com.applovin.impl.sdk.ad.b bVarF = AppLovinFullscreenActivity.parentInterstitialWrapper.f();
            n2.a(bVarF, AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th2, AppLovinFullscreenActivity.this);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "createAppLovinFullscreenActivity");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th2.toString(), mapHashMap);
            AppLovinFullscreenActivity.this.f3523a.g().a(d2.F, bVarF, mapHashMap);
        }
    }

    private void b() {
        k kVar = this.f3523a;
        if (kVar == null || !((Boolean) kVar.a(x4.f6180y2)).booleanValue()) {
            return;
        }
        Long l10 = (Long) this.f3523a.a(x4.f6188z2);
        this.f3528f = g0.a(l10.longValue(), true, this.f3523a, new d(3, this, l10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        w1 w1Var = this.f3524b;
        if (w1Var != null) {
            w1Var.q();
        }
        if (n7.g(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WindowInsets windowInsets) {
        o0.a aVarA = o0.a(windowInsets, this.f3523a);
        o0.a aVarC = o0.c(windowInsets, this.f3523a);
        o0.a aVarB = o0.b(windowInsets, this.f3523a);
        String strB = n7.b(this);
        o0.a(aVarA, strB);
        o0.c(aVarC, strB);
        o0.b(aVarB, strB);
        w1 w1Var = this.f3524b;
        if (w1Var != null) {
            w1Var.a(aVarA, aVarC, aVarB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(n2 n2Var) {
        boolean zY = this.f3524b.y();
        boolean zI = (n2Var == null || !zY) ? false : n2Var.i();
        if (!zI) {
            this.f3524b.d(false);
        }
        a(this.f3524b, zY, zI);
    }

    private void a(w1 w1Var, boolean z3, boolean z10) {
        w1Var.a("activity_destroyed_by_app_relaunch");
        if (this.f3523a != null) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "onDestroyAppLovinFullScreenActivity");
            n2 n2Var = parentInterstitialWrapper;
            com.applovin.impl.sdk.ad.b bVarF = n2Var != null ? n2Var.f() : null;
            mapHashMap.putAll(f2.a((AppLovinAdImpl) bVarF));
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putBoolean(jSONObject, "reshow_attempted", z3);
            JsonUtils.putBoolean(jSONObject, "reshow_success", z10);
            if (bVarF != null) {
                JsonUtils.putInt(jSONObject, "reshow_count", bVarF.R());
            }
            mapHashMap.put("details", jSONObject.toString());
            this.f3523a.D().d(d2.C0, mapHashMap);
        }
        w1Var.r();
    }

    private void a() {
        n2 n2Var;
        k kVar = this.f3523a;
        if (kVar == null || !((Boolean) kVar.a(x4.f6172x2)).booleanValue() || (n2Var = parentInterstitialWrapper) == null || n2Var.f() == null) {
            return;
        }
        com.applovin.impl.sdk.ad.b bVarF = parentInterstitialWrapper.f();
        List listJ = bVarF.j();
        if (CollectionUtils.isEmpty(listJ)) {
            return;
        }
        e eVar = (e) listJ.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", eVar.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", eVar.a());
        this.f3523a.p0().b(z4.P, jSONObject.toString());
        this.f3523a.p0().b(z4.N, Long.valueOf(System.currentTimeMillis()));
        this.f3523a.p0().b(z4.Q, CollectionUtils.toJsonString(f2.a((AppLovinAdImpl) bVarF), JsonUtils.EMPTY_JSON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        this.g = l10.longValue() + this.g;
        this.f3523a.p0().b(z4.O, Long.valueOf(this.g));
    }

    private void a(com.applovin.impl.sdk.ad.b bVar) {
        if (o0.b() && bVar != null && bVar.L0()) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
            if (bVar.U0() && bVar.S0()) {
                com.applovin.impl.d.c(this);
                return;
            } else if (bVar.U0()) {
                com.applovin.impl.d.b((Activity) this);
                return;
            } else {
                if (bVar.S0()) {
                    com.applovin.impl.d.a((Activity) this);
                    return;
                }
                return;
            }
        }
        getWindow().setFlags(Segment.SHARE_MINIMUM, Segment.SHARE_MINIMUM);
        com.applovin.impl.d.c(this);
    }
}
