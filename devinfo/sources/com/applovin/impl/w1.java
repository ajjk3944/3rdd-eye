package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.impl.adview.a;
import com.applovin.impl.adview.e;
import com.applovin.impl.d6;
import com.applovin.impl.h0;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class w1 implements AppLovinBroadcastManager.Receiver, a.b {
    protected int A;
    protected boolean B;
    private ContentObserver C;
    private Float D;
    protected AppLovinAdClickListener E;
    protected AppLovinAdDisplayListener F;
    protected AppLovinAdVideoPlaybackListener G;
    protected g7 H;
    protected g7 I;
    protected boolean J;
    private final h0 K;
    private boolean L;

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f5892a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f5893b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f5894c;

    /* renamed from: d, reason: collision with root package name */
    protected Activity f5895d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5896e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f5897f;
    private final com.applovin.impl.b g;

    /* renamed from: h, reason: collision with root package name */
    private final i.a f5898h;

    /* renamed from: i, reason: collision with root package name */
    private AppLovinAdView f5899i;
    protected com.applovin.impl.adview.k j;

    /* renamed from: k, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f5900k;

    /* renamed from: l, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f5901l;

    /* renamed from: m, reason: collision with root package name */
    protected final long f5902m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f5903n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f5904o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5905p;

    /* renamed from: q, reason: collision with root package name */
    protected long f5906q;

    /* renamed from: r, reason: collision with root package name */
    protected long f5907r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f5908s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f5909t;

    /* renamed from: u, reason: collision with root package name */
    protected int f5910u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f5911v;

    /* renamed from: w, reason: collision with root package name */
    private int f5912w;

    /* renamed from: x, reason: collision with root package name */
    private final ArrayList f5913x;

    /* renamed from: y, reason: collision with root package name */
    protected int f5914y;

    /* renamed from: z, reason: collision with root package name */
    protected int f5915z;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements AppLovinAdDisplayListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.f5894c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f5894c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.f5894c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f5894c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            w1.this.a("web_view");
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b implements i.a {
        public b() {
        }

        @Override // com.applovin.impl.sdk.i.a
        public void a(int i4) {
            w1 w1Var = w1.this;
            if (w1Var.A != com.applovin.impl.sdk.i.f5510h) {
                w1Var.B = true;
            }
            com.applovin.impl.adview.b bVarF = w1Var.f5899i.getController().f();
            if (bVarF == null) {
                com.applovin.impl.sdk.o oVar = w1.this.f5894c;
                if (com.applovin.impl.sdk.o.a()) {
                    w1.this.f5894c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.i.a(i4) && !com.applovin.impl.sdk.i.a(w1.this.A)) {
                bVarF.a("javascript:al_muteSwitchOn();");
            } else if (i4 == 2) {
                bVarF.a("javascript:al_muteSwitchOff();");
            }
            w1.this.A = i4;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class c extends com.applovin.impl.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f5918a;

        public c(com.applovin.impl.sdk.k kVar) {
            this.f5918a = kVar;
        }

        private boolean a(Activity activity) {
            return activity.getClass().getName().equals(n7.a(activity.getApplicationContext(), "AppLovinFullscreenActivity", this.f5918a));
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!w1.this.z() && a(activity)) {
                w1.this.d();
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (w1.this.z() && a(activity)) {
                w1.this.d();
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class d extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f5920a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Handler handler, com.applovin.impl.sdk.k kVar) {
            super(handler);
            this.f5920a = kVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3) {
            Float fB = this.f5920a.p().b();
            if (fB == null || w1.this.D == null || fB.equals(w1.this.D)) {
                return;
            }
            String str = fB.floatValue() > w1.this.D.floatValue() ? "volume_up" : "volume_down";
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putDouble(jSONObject, "volume", fB.floatValue());
            w1.this.e("javascript:al_onVolumeChangedEvent('" + str + "'," + jSONObject + ");");
            w1.this.D = fB;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class e extends com.applovin.impl.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s4 f5922a;

        public e(s4 s4Var) {
            this.f5922a = s4Var;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof AppLovinFullscreenActivity) {
                this.f5922a.b(null);
                w1.this.f5893b.e().b(this);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface g {
        void a(w1 w1Var);

        void a(String str, Throwable th2);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class h implements AppLovinAdClickListener, View.OnClickListener {
        private h() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.f5894c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f5894c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            t2.a(w1.this.E, appLovinAd);
            w1.this.f5915z++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w1 w1Var = w1.this;
            if (view != w1Var.f5900k || !((Boolean) w1Var.f5893b.a(x4.X1)).booleanValue()) {
                com.applovin.impl.sdk.o oVar = w1.this.f5894c;
                if (com.applovin.impl.sdk.o.a()) {
                    w1.this.f5894c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            w1.f(w1.this);
            if (w1.this.f5892a.O0()) {
                w1.this.e("javascript:al_onCloseButtonTapped(" + w1.this.f5912w + "," + w1.this.f5914y + "," + w1.this.f5915z + ");");
            }
            List listF = w1.this.f5892a.F();
            com.applovin.impl.sdk.o oVar2 = w1.this.f5894c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f5894c.a("AppLovinFullscreenActivity", "Handling close button tap " + w1.this.f5912w + " with multi close delay: " + listF);
            }
            if (listF == null || listF.size() <= w1.this.f5912w) {
                w1.this.a("native_close_button");
                return;
            }
            w1.this.f5913x.add(Long.valueOf(SystemClock.elapsedRealtime() - w1.this.f5906q));
            List listD = w1.this.f5892a.D();
            if (listD != null && listD.size() > w1.this.f5912w) {
                w1 w1Var2 = w1.this;
                w1Var2.f5900k.a((e.a) listD.get(w1Var2.f5912w));
            }
            com.applovin.impl.sdk.o oVar3 = w1.this.f5894c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f5894c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + listF.get(w1.this.f5912w));
            }
            w1.this.f5900k.setVisibility(8);
            w1 w1Var3 = w1.this;
            w1Var3.a(w1Var3.f5900k, ((Integer) listF.get(w1Var3.f5912w)).intValue(), new v9(3, this));
        }

        public /* synthetic */ h(w1 w1Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            w1.this.f5906q = SystemClock.elapsedRealtime();
        }
    }

    public w1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f5897f = handler;
        this.f5902m = SystemClock.elapsedRealtime();
        this.f5903n = new AtomicBoolean();
        this.f5904o = new AtomicBoolean();
        this.f5906q = -1L;
        this.f5912w = 0;
        this.f5913x = new ArrayList();
        this.f5914y = 0;
        this.f5915z = 0;
        this.A = com.applovin.impl.sdk.i.f5510h;
        this.L = false;
        this.f5892a = bVar;
        this.f5893b = kVar;
        this.f5894c = kVar.O();
        this.f5895d = activity;
        this.f5896e = bVar.R();
        this.E = appLovinAdClickListener;
        this.F = appLovinAdDisplayListener;
        this.G = appLovinAdVideoPlaybackListener;
        this.K = new h0(kVar);
        h hVar = new h(this, null);
        if (((Boolean) kVar.a(x4.f6095n2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) kVar.a(x4.f6141t2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
        u1 u1Var = new u1(kVar.y0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f5899i = u1Var;
        u1Var.setAdClickListener(hVar);
        this.f5899i.setAdDisplayListener(new a());
        bVar.h().putString("ad_view_address", e8.a(this.f5899i));
        this.f5899i.getController().a(this);
        c2 c2Var = new c2(map, kVar);
        if (c2Var.c()) {
            this.j = new com.applovin.impl.adview.k(c2Var, activity);
        }
        kVar.k().trackImpression(bVar);
        List listF = bVar.F();
        if (bVar.r() >= 0 || listF != null) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.p(), activity);
            this.f5900k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(hVar);
        } else {
            this.f5900k = null;
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.f5901l = gVar2;
        gVar2.setOnClickListener(new e9(2, this));
        if (bVar.V0()) {
            this.f5898h = new b();
        } else {
            this.f5898h = null;
        }
        this.g = new c(kVar);
        if (bVar.R0()) {
            this.D = kVar.p().b();
            this.C = new d(handler, kVar);
            activity.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build(), false, this.C);
        }
    }

    private void B() {
        if (this.f5898h != null) {
            this.f5893b.p().a(this.f5898h);
        }
        if (this.g != null) {
            this.f5893b.e().a(this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z() {
        return a() >= 0;
    }

    public abstract void A();

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(long j);

    public void l() {
        if (!this.f5905p && this.f5904o.compareAndSet(false, true)) {
            t2.b(this.F, this.f5892a);
            this.f5893b.H().b(this.f5892a);
            HashMap map = new HashMap();
            com.applovin.impl.sdk.ad.b bVar = this.f5892a;
            if (bVar != null) {
                CollectionUtils.putStringIfValid("source", bVar.v(), map);
                CollectionUtils.putStringIfValid("details", f2.b(this.f5892a), map);
            }
            this.f5893b.g().a(d2.G, this.f5892a, map);
        }
    }

    public abstract void m();

    public void n() {
        g7 g7Var = this.H;
        if (g7Var != null) {
            g7Var.d();
        }
    }

    public void o() {
        g7 g7Var = this.H;
        if (g7Var != null) {
            g7Var.e();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action) {
            case "com.applovin.al_onPoststitialShow_evaluation_error":
                e();
                break;
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.render_process_gone":
                if (!this.f5909t) {
                    f();
                    break;
                }
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void p() {
        com.applovin.impl.adview.b bVarF;
        if (this.f5899i == null || !this.f5892a.t0() || (bVarF = this.f5899i.getController().f()) == null) {
            return;
        }
        this.K.a(bVarF, new f());
    }

    public void q() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.L) {
            a("back_button");
        }
        if (this.f5892a.O0()) {
            e("javascript:onBackPressed();");
        }
    }

    public void r() {
        AppLovinAdView appLovinAdView = this.f5899i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f5899i.destroy();
            this.f5899i = null;
            if ((parent instanceof ViewGroup) && i()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        m();
        l();
        this.E = null;
        this.F = null;
        this.G = null;
        this.f5895d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void s() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.d("AppLovinFullscreenActivity", "onPause()");
        }
        d("javascript:al_onAppPaused();");
        n();
    }

    public void t() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.d("AppLovinFullscreenActivity", "onResume()");
        }
        d("javascript:al_onAppResumed();");
        o();
    }

    public void u() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void v();

    public abstract void w();

    public void x() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.d("AppLovinFullscreenActivity", "Setting ad fully watched");
        }
        this.J = true;
    }

    public boolean y() {
        return this.f5905p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        com.applovin.impl.sdk.o.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to " + str);
        try {
            a(str);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th2);
            try {
                l();
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ int f(w1 w1Var) {
        int i4 = w1Var.f5912w;
        w1Var.f5912w = i4 + 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        if (this.f5892a.R() <= this.f5896e && !com.applovin.impl.d.d(this.f5895d)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5894c.d("AppLovinFullscreenActivity", "Ad reshow timed out. Will attempt to bring existing ad activity to front.");
            }
            this.f5905p = false;
            long jC = this.f5892a.c();
            if (jC > 0) {
                a(jC).a(s4.f5297i, new x8(6, this));
            } else {
                f("app_relaunch_reshow_timed_out");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        if (this.f5892a.z0().getAndSet(true)) {
            return;
        }
        this.f5893b.q0().a((i5) new m6(this.f5892a, this.f5893b), d6.b.OTHER);
    }

    public boolean h() {
        return AppLovinAdType.INCENTIVIZED == this.f5892a.getType();
    }

    public boolean i() {
        return this.f5895d instanceof AppLovinFullscreenActivity;
    }

    private void f(String str) {
        if (this.f5904o.get()) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new na(this, str, 1));
    }

    public AppLovinAdView b() {
        return this.f5899i;
    }

    public void d(boolean z3) {
        this.f5905p = z3;
    }

    public void e(String str) {
        a(str, 0L);
    }

    public boolean g() {
        return this.f5908s;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class f implements h0.c {
        public f() {
        }

        @Override // com.applovin.impl.h0.c
        public void a(int i4, int i10) {
            Map mapA = f2.a((AppLovinAdImpl) w1.this.f5892a);
            mapA.putAll(f2.a(w1.this.f5892a));
            mapA.put("details", "detection_count=" + i4 + ",total_checks=" + i10);
            w1.this.f5893b.D().d(d2.K0, mapA);
        }

        @Override // com.applovin.impl.h0.c
        public void a(int i4, int i10, int i11) {
            Map mapA = f2.a((AppLovinAdImpl) w1.this.f5892a);
            mapA.putAll(f2.a(w1.this.f5892a));
            mapA.put("details", "detections_to_report=" + i4 + ",detection_count=" + i10 + ",total_checks=" + i11);
            w1.this.f5893b.D().d(d2.L0, mapA);
            if (((Boolean) w1.this.f5893b.a(x4.f6129r6)).booleanValue()) {
                w1.this.x();
            }
            if (((Boolean) w1.this.f5893b.a(x4.P0)).booleanValue()) {
                w1.this.f5893b.G().c(w1.this.f5892a, com.applovin.impl.sdk.k.o());
            }
            if (((Boolean) w1.this.f5893b.a(x4.f6099n6)).booleanValue()) {
                w1.this.a("black_view_auto_dismiss");
                return;
            }
            w1 w1Var = w1.this;
            w1Var.L = ((Boolean) w1Var.f5893b.a(x4.f6106o6)).booleanValue();
            if (((Boolean) w1.this.f5893b.a(x4.f6114p6)).booleanValue()) {
                w1.this.A();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (z()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5894c.d("AppLovinFullscreenActivity", "App relaunch detected with launcher activity. Will attempt to re-show the ad");
            }
            this.f5905p = true;
            long jF = this.f5892a.f();
            if (jF < 0) {
                return;
            }
            a(new pa(this, 1), jF);
            return;
        }
        f("app_relaunch");
    }

    public void b(boolean z3) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z3);
        }
        d("javascript:al_onWindowFocusChanged( " + z3 + " );");
        g7 g7Var = this.I;
        if (g7Var != null) {
            if (z3) {
                g7Var.e();
            } else {
                g7Var.d();
            }
        }
    }

    public void e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.k kVar, Activity activity, g gVar) {
        w1 z1Var;
        if (bVar instanceof o7) {
            try {
                z1Var = new z1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                gVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + kVar + " and throwable: " + th2.getMessage(), th2);
                return;
            }
        } else if (bVar.hasVideoUrl()) {
            try {
                z1Var = new a2(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th3) {
                gVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + kVar + " and throwable: " + th3.getMessage(), th3);
                return;
            }
        } else {
            try {
                z1Var = new x1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th4) {
                gVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + kVar + " and throwable: " + th4.getMessage(), th4);
                return;
            }
        }
        z1Var.B();
        gVar.a(z1Var);
    }

    public void f() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f5909t = true;
    }

    public void c(boolean z3) {
        a(z3, ((Long) this.f5893b.a(x4.f6089m2)).longValue());
        if (!this.f5892a.s0()) {
            t2.a(this.F, this.f5892a);
        }
        this.f5893b.H().a(this.f5892a);
        if (!this.f5892a.s0() && (this.f5892a.hasVideoUrl() || h())) {
            t2.a(this.G, this.f5892a);
        }
        new n4(this.f5895d).a(this.f5892a);
        this.f5892a.setHasShown(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        com.applovin.impl.adview.b bVarF;
        AppLovinAdView appLovinAdView = this.f5899i;
        if (appLovinAdView == null || (bVarF = appLovinAdView.getController().f()) == null) {
            return;
        }
        bVarF.a(str);
    }

    public void d(String str) {
        if (this.f5892a.v0()) {
            a(str, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.impl.adview.g gVar, Runnable runnable) {
        e8.a(gVar, 400L, new oa(gVar, runnable, 1));
    }

    private void d(String str, Map map) {
        e(o8.d(str, map));
    }

    private void b(String str, Map map) {
        e(o8.b(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a("backup_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.applovin.impl.adview.g gVar, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new oa(gVar, runnable, 0));
    }

    public long a() {
        com.applovin.impl.sdk.ad.b bVar = this.f5892a;
        if (bVar == null) {
            return -1L;
        }
        return bVar.g();
    }

    public int c() {
        int iT = this.f5892a.t();
        return (iT <= 0 && ((Boolean) this.f5893b.a(x4.f6080l2)).booleanValue()) ? this.f5910u + 1 : iT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z3, Void r22, Void r32) {
        if (z3) {
            return;
        }
        f("app_relaunch_bring_to_front_failed");
    }

    private s4 a(long j) {
        s4 s4Var = new s4("bringAdActivityToFront");
        e eVar = new e(s4Var);
        this.f5893b.e().a(eVar);
        Intent intent = new Intent(this.f5895d, (Class<?>) (this.f5892a.L0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.setFlags(131072);
        this.f5895d.startActivity(intent);
        a(new b5.e(this, eVar, s4Var, 19), j);
        return s4Var;
    }

    public void c(long j) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
        }
        this.H = g7.a(j, this.f5893b, new pa(this, 0));
    }

    private void c(String str, Map map) {
        e(o8.c(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.b bVar, s4 s4Var) {
        this.f5893b.e().b(bVar);
        if (s4Var.d()) {
            return;
        }
        s4Var.a((Object) null);
    }

    public boolean a(boolean z3) {
        List listA = n7.a(z3, this.f5892a, this.f5893b, this.f5895d);
        if (listA.isEmpty()) {
            return false;
        }
        if (((Boolean) this.f5893b.a(x4.W0)).booleanValue() && !n7.a(listA, this.f5892a)) {
            a(listA, (com.applovin.impl.sdk.ad.a) this.f5892a);
            return false;
        }
        String str = "Missing ad resources: " + listA;
        Map mapA = f2.a((AppLovinAdImpl) this.f5892a);
        if (((Boolean) this.f5893b.a(x4.T5)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f5894c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listA);
            }
            if (((Boolean) this.f5893b.a(x4.W5)).booleanValue()) {
                AppLovinAdDisplayListener appLovinAdDisplayListener = this.F;
                if (appLovinAdDisplayListener instanceof l2) {
                    t2.a(appLovinAdDisplayListener, "Missing ad resources");
                }
            } else {
                n2.a(this.f5892a, this.F, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
            }
            a("missing_ad_resources");
            a(str, "Failing ad display", mapA);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "missingCachedAdResources");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f5893b.g().a(d2.F, this.f5892a, mapHashMap);
            return ((Boolean) this.f5893b.a(x4.V5)).booleanValue();
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listA);
        }
        this.f5892a.E0();
        a(str, "Streaming ad", mapA);
        return false;
    }

    private void a(List list, com.applovin.impl.sdk.ad.a aVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.a("AppLovinFullscreenActivity", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        aVar.a(list);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), mapHashMap);
        this.f5893b.g().a(d2.K, aVar, mapHashMap);
    }

    public void a(o0.a aVar, o0.a aVar2, o0.a aVar3) {
        if (((Boolean) this.f5893b.a(x4.E4)).booleanValue()) {
            HashMap map = new HashMap();
            map.put("orientation", n7.b(this.f5895d));
            if (aVar != null) {
                map.put("display_cutout_insets", aVar.e());
            }
            if (aVar2 != null) {
                map.put("status_bar_insets", aVar2.e());
            }
            if (aVar3 != null) {
                map.put("nav_bar_insets", aVar3.e());
            }
            e(o8.a(map));
        }
    }

    public void a(String str) {
        this.f5908s = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f5902m;
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.d("AppLovinFullscreenActivity", "Dismissing ad after " + TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime) + " seconds from source: " + str);
        }
        com.applovin.impl.sdk.ad.b bVar = this.f5892a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f5897f.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.f5892a != null ? r0.w() : 0L);
        if (((Boolean) this.f5893b.a(x4.P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar2 = this.f5892a;
            if (bVar2 != null) {
                bVar2.a(str);
            }
            m();
        }
        l();
        this.K.b();
        if (this.f5898h != null) {
            this.f5893b.p().b(this.f5898h);
        }
        if (this.g != null) {
            this.f5893b.e().b(this.g);
        }
        if (this.C != null) {
            this.f5895d.getContentResolver().unregisterContentObserver(this.C);
            this.C = null;
        }
        if (i()) {
            this.f5895d.finish();
            return;
        }
        this.f5893b.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f5893b.O().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        r();
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public void a(int i4, KeyEvent keyEvent) {
        if (this.f5894c == null || !com.applovin.impl.sdk.o.a()) {
            return;
        }
        this.f5894c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i4 + ", " + keyEvent);
    }

    public void a(String str, long j) {
        if (j < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new na(this, str, 0), j);
    }

    public void a(com.applovin.impl.adview.g gVar, long j, Runnable runnable) {
        if (j >= ((Long) this.f5893b.a(x4.W1)).longValue()) {
            return;
        }
        this.I = g7.a(TimeUnit.SECONDS.toMillis(j), this.f5893b, new oa(gVar, runnable, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    public void a(int i4, boolean z3, boolean z10, long j) {
        if (!this.f5905p && this.f5903n.compareAndSet(false, true)) {
            if (this.f5892a.hasVideoUrl() || h()) {
                t2.a(this.G, this.f5892a, i4, z10);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f5902m;
            this.f5893b.k().trackVideoEnd(this.f5892a, TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i4, z3);
            long jElapsedRealtime2 = this.f5906q != -1 ? SystemClock.elapsedRealtime() - this.f5906q : -1L;
            this.f5893b.k().trackFullScreenAdClosed(this.f5892a, jElapsedRealtime2, this.f5913x, j, this.B, this.A);
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f5894c;
                StringBuilder sb2 = new StringBuilder("Video ad ended at percent: ");
                sb2.append(i4);
                sb2.append("%, elapsedTime: ");
                sb2.append(jElapsedRealtime);
                a0.g.A(sb2, "ms, skipTimeMillis: ", j, "ms, closeTimeMillis: ");
                oVar.a("AppLovinFullscreenActivity", je.u.s(jElapsedRealtime2, "ms", sb2));
            }
        }
    }

    private void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("error_message", str, map2);
        CollectionUtils.putStringIfValid("details", str2, map2);
        this.f5893b.D().a(d2.M0, "missingCachedAdResources", map2);
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f5894c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.J = true;
    }

    public void a(boolean z3, long j) {
        if (this.f5892a.H0()) {
            a(z3 ? "javascript:al_mute();" : "javascript:al_unmute();", j);
        }
    }

    private void a(String str, Map map) {
        e(o8.a(str, map));
    }

    public void a(Runnable runnable, long j) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j, this.f5897f);
    }
}
