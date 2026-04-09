package com.applovin.impl;

import N7.C1094a9;
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
import com.applovin.impl.adview.a;
import com.applovin.impl.adview.e;
import com.applovin.impl.c2;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class r1 implements c2.a, AppLovinBroadcastManager.Receiver, a.b {

    /* renamed from: A, reason: collision with root package name */
    protected int f20823A;

    /* renamed from: B, reason: collision with root package name */
    protected boolean f20824B;

    /* renamed from: C, reason: collision with root package name */
    private ContentObserver f20825C;

    /* renamed from: D, reason: collision with root package name */
    private Float f20826D;

    /* renamed from: E, reason: collision with root package name */
    protected AppLovinAdClickListener f20827E;

    /* renamed from: F, reason: collision with root package name */
    protected AppLovinAdDisplayListener f20828F;

    /* renamed from: G, reason: collision with root package name */
    protected AppLovinAdVideoPlaybackListener f20829G;

    /* renamed from: H, reason: collision with root package name */
    protected final c2 f20830H;

    /* renamed from: I, reason: collision with root package name */
    protected t6 f20831I;

    /* renamed from: J, reason: collision with root package name */
    protected t6 f20832J;

    /* renamed from: K, reason: collision with root package name */
    protected boolean f20833K;

    /* renamed from: L, reason: collision with root package name */
    private final C2114d0 f20834L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f20835M;

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f20836a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f20837b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f20838c;

    /* renamed from: d, reason: collision with root package name */
    protected Activity f20839d;

    /* renamed from: e, reason: collision with root package name */
    private final int f20840e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f20841f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC2108b f20842g;

    /* renamed from: h, reason: collision with root package name */
    private final i.a f20843h;
    protected AppLovinAdView i;

    /* renamed from: j, reason: collision with root package name */
    protected com.applovin.impl.adview.k f20844j;

    /* renamed from: k, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f20845k;

    /* renamed from: l, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f20846l;

    /* renamed from: m, reason: collision with root package name */
    protected final long f20847m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f20848n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f20849o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20850p;

    /* renamed from: q, reason: collision with root package name */
    protected long f20851q;

    /* renamed from: r, reason: collision with root package name */
    protected long f20852r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f20853s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f20854t;

    /* renamed from: u, reason: collision with root package name */
    protected int f20855u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f20856v;

    /* renamed from: w, reason: collision with root package name */
    private int f20857w;

    /* renamed from: x, reason: collision with root package name */
    private final ArrayList f20858x;

    /* renamed from: y, reason: collision with root package name */
    protected int f20859y;

    /* renamed from: z, reason: collision with root package name */
    protected int f20860z;

    public class a implements AppLovinAdDisplayListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = r1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                r1.this.f20838c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = r1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                r1.this.f20838c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            r1.this.a("web_view");
        }
    }

    public class b implements i.a {
        public b() {
        }

        @Override // com.applovin.impl.sdk.i.a
        public void a(int i) {
            r1 r1Var = r1.this;
            if (r1Var.f20823A != com.applovin.impl.sdk.i.f21151h) {
                r1Var.f20824B = true;
            }
            com.applovin.impl.adview.b bVarF = r1Var.i.getController().f();
            if (bVarF == null) {
                com.applovin.impl.sdk.o oVar = r1.this.f20838c;
                if (com.applovin.impl.sdk.o.a()) {
                    r1.this.f20838c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.i.a(i) && !com.applovin.impl.sdk.i.a(r1.this.f20823A)) {
                bVarF.a("javascript:al_muteSwitchOn();");
            } else if (i == 2) {
                bVarF.a("javascript:al_muteSwitchOff();");
            }
            r1.this.f20823A = i;
        }
    }

    public class c extends AbstractC2108b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f20863a;

        public c(com.applovin.impl.sdk.k kVar) {
            this.f20863a = kVar;
        }

        private boolean a(Activity activity) {
            return activity.getClass().getName().equals(a7.a(activity.getApplicationContext(), "AppLovinFullscreenActivity", this.f20863a));
        }

        @Override // com.applovin.impl.AbstractC2108b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!r1.this.A() && a(activity)) {
                r1.this.e();
            }
        }

        @Override // com.applovin.impl.AbstractC2108b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (r1.this.A() && a(activity)) {
                r1.this.e();
            }
        }
    }

    public class d extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f20865a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Handler handler, com.applovin.impl.sdk.k kVar) {
            super(handler);
            this.f20865a = kVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            Float fB = this.f20865a.q().b();
            if (fB == null || r1.this.f20826D == null || fB.equals(r1.this.f20826D)) {
                return;
            }
            String str = fB.floatValue() > r1.this.f20826D.floatValue() ? "volume_up" : "volume_down";
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putDouble(jSONObject, "volume", fB.floatValue());
            r1.this.e("javascript:al_onVolumeChangedEvent('" + str + "'," + jSONObject + ");");
            r1.this.f20826D = fB;
        }
    }

    public class e extends AbstractC2108b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g4 f20867a;

        public e(g4 g4Var) {
            this.f20867a = g4Var;
        }

        @Override // com.applovin.impl.AbstractC2108b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof AppLovinFullscreenActivity) {
                this.f20867a.b(null);
                r1.this.f20837b.e().b(this);
            }
        }
    }

    public interface f {
        void a(r1 r1Var);

        void a(String str, Throwable th);
    }

    public class g implements AppLovinAdClickListener, View.OnClickListener {
        private g() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = r1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                r1.this.f20838c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            l2.a(r1.this.f20827E, appLovinAd);
            r1.this.f20860z++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            r1 r1Var = r1.this;
            if (view != r1Var.f20845k || !((Boolean) r1Var.f20837b.a(l4.f19848V1)).booleanValue()) {
                com.applovin.impl.sdk.o oVar = r1.this.f20838c;
                if (com.applovin.impl.sdk.o.a()) {
                    r1.this.f20838c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            r1.e(r1.this);
            if (r1.this.f20836a.a1()) {
                r1.this.e("javascript:al_onCloseButtonTapped(" + r1.this.f20857w + StringUtils.COMMA + r1.this.f20859y + StringUtils.COMMA + r1.this.f20860z + ");");
            }
            List listP = r1.this.f20836a.P();
            com.applovin.impl.sdk.o oVar2 = r1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                r1.this.f20838c.a("AppLovinFullscreenActivity", "Handling close button tap " + r1.this.f20857w + " with multi close delay: " + listP);
            }
            if (listP == null || listP.size() <= r1.this.f20857w) {
                r1.this.a("native_close_button");
                return;
            }
            r1.this.f20858x.add(Long.valueOf(SystemClock.elapsedRealtime() - r1.this.f20851q));
            List listN = r1.this.f20836a.N();
            if (listN != null && listN.size() > r1.this.f20857w) {
                r1 r1Var2 = r1.this;
                r1Var2.f20845k.a((e.a) listN.get(r1Var2.f20857w));
            }
            com.applovin.impl.sdk.o oVar3 = r1.this.f20838c;
            if (com.applovin.impl.sdk.o.a()) {
                r1.this.f20838c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + listP.get(r1.this.f20857w));
            }
            r1.this.f20845k.setVisibility(8);
            r1 r1Var3 = r1.this;
            r1Var3.a(r1Var3.f20845k, ((Integer) listP.get(r1Var3.f20857w)).intValue(), new L0(this, 0));
        }

        public /* synthetic */ g(r1 r1Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            r1.this.f20851q = SystemClock.elapsedRealtime();
        }
    }

    public r1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f20841f = handler;
        this.f20847m = SystemClock.elapsedRealtime();
        this.f20848n = new AtomicBoolean();
        this.f20849o = new AtomicBoolean();
        this.f20851q = -1L;
        this.f20857w = 0;
        this.f20858x = new ArrayList();
        this.f20859y = 0;
        this.f20860z = 0;
        this.f20823A = com.applovin.impl.sdk.i.f21151h;
        this.f20835M = false;
        this.f20836a = bVar;
        this.f20837b = kVar;
        this.f20838c = kVar.O();
        this.f20839d = activity;
        this.f20840e = bVar.b0();
        this.f20827E = appLovinAdClickListener;
        this.f20828F = appLovinAdDisplayListener;
        this.f20829G = appLovinAdVideoPlaybackListener;
        c2 c2Var = new c2(activity, kVar);
        this.f20830H = c2Var;
        c2Var.a(this);
        this.f20834L = new C2114d0(kVar);
        g gVar = new g(this, null);
        if (((Boolean) kVar.a(l4.f20013r2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) kVar.a(l4.f20061x2)).booleanValue()) {
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
        p1 p1Var = new p1(kVar.y0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.i = p1Var;
        p1Var.setAdClickListener(gVar);
        this.i.setAdDisplayListener(new a());
        bVar.h().putString("ad_view_address", r7.a(this.i));
        this.i.getController().a(this);
        x1 x1Var = new x1(map, kVar);
        if (x1Var.c()) {
            this.f20844j = new com.applovin.impl.adview.k(x1Var, activity);
        }
        kVar.k().trackImpression(bVar);
        List listP = bVar.P();
        if (bVar.s() >= 0 || listP != null) {
            com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(bVar.q(), activity);
            this.f20845k = gVar2;
            gVar2.setVisibility(8);
            gVar2.setOnClickListener(gVar);
        } else {
            this.f20845k = null;
        }
        com.applovin.impl.adview.g gVar3 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.f20846l = gVar3;
        gVar3.setOnClickListener(new D8.f(this, 4));
        if (bVar.e1()) {
            this.f20843h = new b();
        } else {
            this.f20843h = null;
        }
        this.f20842g = new c(kVar);
        if (bVar.d1()) {
            this.f20826D = kVar.q().b();
            this.f20825C = new d(handler, kVar);
            activity.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build(), false, this.f20825C);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A() {
        return c() >= 0;
    }

    private void C() {
        if (this.f20843h != null) {
            this.f20837b.q().a(this.f20843h);
        }
        if (this.f20842g != null) {
            this.f20837b.e().a(this.f20842g);
        }
    }

    public abstract void B();

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(long j4);

    public abstract void n();

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action) {
            case "com.applovin.al_onPoststitialShow_evaluation_error":
                f();
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
                if (!this.f20854t) {
                    g();
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
        t6 t6Var = this.f20831I;
        if (t6Var != null) {
            t6Var.e();
        }
    }

    public void q() {
        com.applovin.impl.adview.b bVarF;
        if (this.i == null || !this.f20836a.F0() || (bVarF = this.i.getController().f()) == null) {
            return;
        }
        this.f20834L.a(bVarF, new K0(this));
    }

    public void r() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.f20835M) {
            a("back_button");
        }
        if (this.f20836a.a1()) {
            e("javascript:onBackPressed();");
        }
    }

    public void s() {
        AppLovinAdView appLovinAdView = this.i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.i.destroy();
            this.i = null;
            if ((parent instanceof ViewGroup) && j()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        n();
        m();
        this.f20827E = null;
        this.f20828F = null;
        this.f20829G = null;
        this.f20839d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void t() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.d("AppLovinFullscreenActivity", "onPause()");
        }
        d("javascript:al_onAppPaused();");
        if (this.f20830H.b()) {
            this.f20830H.a();
        }
        o();
    }

    public void u() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.d("AppLovinFullscreenActivity", "onResume()");
        }
        d("javascript:al_onAppResumed();");
        p();
        if (this.f20830H.b()) {
            this.f20830H.a();
        }
    }

    public void v() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void w();

    public abstract void x();

    public void y() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.d("AppLovinFullscreenActivity", "Setting ad fully watched");
        }
        this.f20833K = true;
    }

    public boolean z() {
        return this.f20850p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        a("backup_close_button");
    }

    public static /* synthetic */ int e(r1 r1Var) {
        int i = r1Var.f20857w;
        r1Var.f20857w = i + 1;
        return i;
    }

    private void f(String str) {
        if (this.f20849o.get()) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new J0(this, str, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        if (this.f20836a.b0() <= this.f20840e && !AbstractC2113d.a(this.f20839d)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20838c.d("AppLovinFullscreenActivity", "Ad reshow timed out. Will attempt to bring existing ad activity to front.");
            }
            this.f20850p = false;
            long jC = this.f20836a.c();
            if (jC > 0) {
                a(jC).a(g4.f19425h, new K0(this));
            } else {
                f("app_relaunch_reshow_timed_out");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        if (this.f20836a.N0().getAndSet(true)) {
            return;
        }
        this.f20837b.q0().a((w4) new a6(this.f20836a, this.f20837b), r5.b.OTHER);
    }

    public long c() {
        com.applovin.impl.sdk.ad.b bVar = this.f20836a;
        if (bVar == null) {
            return -1L;
        }
        return bVar.g();
    }

    public void g() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f20854t = true;
    }

    public boolean h() {
        return this.f20853s;
    }

    public boolean i() {
        return AppLovinAdType.INCENTIVIZED == this.f20836a.getType();
    }

    public boolean j() {
        return this.f20839d instanceof AppLovinFullscreenActivity;
    }

    public void m() {
        if (!this.f20850p && this.f20849o.compareAndSet(false, true)) {
            l2.b(this.f20828F, this.f20836a);
            this.f20837b.I().b(this.f20836a);
            HashMap map = new HashMap();
            com.applovin.impl.sdk.ad.b bVar = this.f20836a;
            if (bVar != null) {
                CollectionUtils.putStringIfValid(AdRevenueConstants.SOURCE_KEY, bVar.F(), map);
                CollectionUtils.putStringIfValid("details", a2.b(this.f20836a), map);
            }
            this.f20837b.g().a(y1.f21819t, this.f20836a, map);
        }
    }

    public void o() {
        t6 t6Var = this.f20831I;
        if (t6Var != null) {
            t6Var.d();
        }
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.k kVar, Activity activity, f fVar) {
        r1 u1Var;
        if (bVar instanceof b7) {
            try {
                u1Var = new u1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th) {
                fVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + kVar + " and throwable: " + th.getMessage(), th);
                return;
            }
        } else if (bVar.hasVideoUrl()) {
            try {
                u1Var = new v1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                fVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + kVar + " and throwable: " + th2.getMessage(), th2);
                return;
            }
        } else {
            try {
                u1Var = new s1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th3) {
                fVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + kVar + " and throwable: " + th3.getMessage(), th3);
                return;
            }
        }
        u1Var.C();
        fVar.a(u1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (A()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20838c.d("AppLovinFullscreenActivity", "App relaunch detected with launcher activity. Will attempt to re-show the ad");
            }
            this.f20850p = true;
            long jF = this.f20836a.f();
            if (jF < 0) {
                return;
            }
            a(new B.b(this, 21), jF);
            return;
        }
        f("app_relaunch");
    }

    public void b(boolean z10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z10);
        }
        d("javascript:al_onWindowFocusChanged( " + z10 + " );");
        t6 t6Var = this.f20832J;
        if (t6Var != null) {
            if (z10) {
                t6Var.e();
            } else {
                t6Var.d();
            }
        }
    }

    public void d(boolean z10) {
        this.f20850p = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        com.applovin.impl.sdk.o.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to " + str);
        try {
            a(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
            try {
                m();
            } catch (Throwable unused) {
            }
        }
    }

    public void d(String str) {
        if (this.f20836a.J0()) {
            a(str, 0L);
        }
    }

    public void f() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    public int d() {
        int iU = this.f20836a.u();
        return (iU <= 0 && ((Boolean) this.f20837b.a(l4.f19989o2)).booleanValue()) ? this.f20855u + 1 : iU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        com.applovin.impl.adview.b bVarF;
        AppLovinAdView appLovinAdView = this.i;
        if (appLovinAdView == null || (bVarF = appLovinAdView.getController().f()) == null) {
            return;
        }
        bVarF.a(str);
    }

    public void c(boolean z10) {
        a(z10, ((Long) this.f20837b.a(l4.f19997p2)).longValue());
        if (!this.f20836a.E0()) {
            l2.a(this.f20828F, this.f20836a);
        }
        this.f20837b.I().a(this.f20836a);
        if (!this.f20836a.E0() && (this.f20836a.hasVideoUrl() || i())) {
            l2.a(this.f20829G, this.f20836a);
        }
        new a4(this.f20839d).a(this.f20836a);
        this.f20836a.setHasShown(true);
    }

    private void d(String str, Map map) {
        e(b8.d(str, map));
    }

    public void e(String str) {
        a(str, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.impl.adview.g gVar, Runnable runnable) {
        r7.a(gVar, 400L, new B.c(19, gVar, runnable));
    }

    private void b(String str, Map map) {
        e(b8.b(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Void r22, Void r32) {
        if (z10) {
            return;
        }
        f("app_relaunch_bring_to_front_failed");
    }

    private g4 a(long j4) {
        g4 g4Var = new g4("bringAdActivityToFront");
        e eVar = new e(g4Var);
        this.f20837b.e().a(eVar);
        Intent intent = new Intent(this.f20839d, (Class<?>) AppLovinFullscreenActivity.class);
        intent.setFlags(131072);
        this.f20839d.startActivity(intent);
        a(new J4.f(this, eVar, g4Var, 4), j4);
        return g4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.applovin.impl.adview.g gVar, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new I0(gVar, runnable, 1));
    }

    public void c(long j4) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j4) + " seconds...");
        }
        this.f20831I = t6.a(j4, this.f20837b, new C2.h(this, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AbstractC2108b abstractC2108b, g4 g4Var) {
        this.f20837b.e().b(abstractC2108b);
        if (g4Var.c()) {
            return;
        }
        g4Var.a((Object) null);
    }

    private void c(String str, Map map) {
        e(b8.c(str, map));
    }

    public boolean a(boolean z10) {
        List listA = a7.a(z10, this.f20836a, this.f20837b, this.f20839d);
        if (listA.isEmpty()) {
            return false;
        }
        if (((Boolean) this.f20837b.a(l4.f20024s5)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f20838c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listA);
            }
            if (((Boolean) this.f20837b.a(l4.f20048v5)).booleanValue()) {
                AppLovinAdDisplayListener appLovinAdDisplayListener = this.f20828F;
                if (appLovinAdDisplayListener instanceof f2) {
                    l2.a(appLovinAdDisplayListener, "Missing ad resources");
                }
            } else {
                h2.a(this.f20836a, this.f20828F, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
            }
            a("missing_ad_resources");
            String str = "Missing ad resources: " + listA;
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
            CollectionUtils.putStringIfValid("details", "Failing ad display", mapHashMap);
            this.f20837b.E().a(y1.f21816r0, "missingCachedAdResources", mapHashMap);
            HashMap<String, String> mapHashMap2 = CollectionUtils.hashMap(AdRevenueConstants.SOURCE_KEY, "missingCachedAdResources");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap2);
            this.f20837b.g().a(y1.f21817s, this.f20836a, mapHashMap2);
            return ((Boolean) this.f20837b.a(l4.f20040u5)).booleanValue();
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listA);
        }
        this.f20836a.S0();
        HashMap map = new HashMap();
        CollectionUtils.putStringIfValid("error_message", "Missing ad resources: " + listA, map);
        CollectionUtils.putStringIfValid("details", "Streaming ad", map);
        this.f20837b.E().a(y1.f21816r0, "missingCachedAdResources", map);
        return false;
    }

    public void a(String str) {
        this.f20853s = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f20847m;
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.d("AppLovinFullscreenActivity", "Dismissing ad after " + TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime) + " seconds from source: " + str);
        }
        com.applovin.impl.sdk.ad.b bVar = this.f20836a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f20841f.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.f20836a != null ? r0.G() : 0L);
        if (((Boolean) this.f20837b.a(l4.f19969l6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar2 = this.f20836a;
            if (bVar2 != null) {
                bVar2.a(str);
            }
            n();
        }
        m();
        this.f20834L.b();
        if (this.f20843h != null) {
            this.f20837b.q().b(this.f20843h);
        }
        if (this.f20842g != null) {
            this.f20837b.e().b(this.f20842g);
        }
        if (this.f20825C != null) {
            this.f20839d.getContentResolver().unregisterContentObserver(this.f20825C);
            this.f20825C = null;
        }
        if (j()) {
            this.f20839d.finish();
            return;
        }
        this.f20837b.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f20837b.O().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        s();
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public void a(int i, KeyEvent keyEvent) {
        if (this.f20838c == null || !com.applovin.impl.sdk.o.a()) {
            return;
        }
        this.f20838c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i + ", " + keyEvent);
    }

    public void a(String str, long j4) {
        if (j4 < 0 || !com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return;
        }
        a(new J0(this, str, 1), j4);
    }

    public void a(com.applovin.impl.adview.g gVar, long j4, Runnable runnable) {
        if (j4 >= ((Long) this.f20837b.a(l4.f19841U1)).longValue()) {
            return;
        }
        this.f20832J = t6.a(TimeUnit.SECONDS.toMillis(j4), this.f20837b, new I0(gVar, runnable, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    public void a(int i, boolean z10, boolean z11, long j4) {
        if (!this.f20850p && this.f20848n.compareAndSet(false, true)) {
            if (this.f20836a.hasVideoUrl() || i()) {
                l2.a(this.f20829G, this.f20836a, i, z11);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f20847m;
            this.f20837b.k().trackVideoEnd(this.f20836a, TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i, z10);
            long jElapsedRealtime2 = this.f20851q != -1 ? SystemClock.elapsedRealtime() - this.f20851q : -1L;
            this.f20837b.k().trackFullScreenAdClosed(this.f20836a, jElapsedRealtime2, this.f20858x, j4, this.f20824B, this.f20823A);
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f20838c;
                StringBuilder sb = new StringBuilder("Video ad ended at percent: ");
                sb.append(i);
                sb.append("%, elapsedTime: ");
                sb.append(jElapsedRealtime);
                sb.append("ms, skipTimeMillis: ");
                sb.append(j4);
                sb.append("ms, closeTimeMillis: ");
                oVar.a("AppLovinFullscreenActivity", C1094a9.f(sb, jElapsedRealtime2, "ms"));
            }
        }
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f20838c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.f20833K = true;
    }

    public void a(boolean z10, long j4) {
        if (this.f20836a.T0()) {
            a(z10 ? "javascript:al_mute();" : "javascript:al_unmute();", j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        if (((Boolean) this.f20837b.a(l4.f19786M0)).booleanValue()) {
            this.f20837b.H().c(this.f20836a, com.applovin.impl.sdk.k.o());
        }
        Map mapA = a2.a((AppLovinAdImpl) this.f20836a);
        mapA.putAll(a2.a(this.f20836a));
        this.f20837b.E().d(y1.f21814q0, mapA);
        if (((Boolean) this.f20837b.a(l4.f19811P5)).booleanValue()) {
            y();
        }
        if (((Boolean) this.f20837b.a(l4.f19784L5)).booleanValue()) {
            a("black_view_auto_dismiss");
            return;
        }
        this.f20835M = ((Boolean) this.f20837b.a(l4.f19791M5)).booleanValue();
        if (((Boolean) this.f20837b.a(l4.f19797N5)).booleanValue()) {
            B();
        }
    }

    private void a(String str, Map map) {
        e(b8.a(str, map));
    }

    public void a(Runnable runnable, long j4) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j4, this.f20841f);
    }
}
