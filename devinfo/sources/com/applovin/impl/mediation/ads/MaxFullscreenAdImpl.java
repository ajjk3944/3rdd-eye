package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.o0;
import androidx.lifecycle.t;
import com.applovin.impl.c3;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.g0;
import com.applovin.impl.i;
import com.applovin.impl.j;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t1;
import com.applovin.impl.t2;
import com.applovin.impl.w3;
import com.applovin.impl.x3;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import d.h;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0018a, j.b {

    /* renamed from: a, reason: collision with root package name */
    private final a f4591a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f4592b;

    /* renamed from: c, reason: collision with root package name */
    private final b f4593c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.mediation.b f4594d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f4595e;

    /* renamed from: f, reason: collision with root package name */
    private c3 f4596f;
    private c g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f4597h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f4598i;
    private g0 j;

    /* renamed from: k, reason: collision with root package name */
    private long f4599k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4600l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4601m;

    /* renamed from: n, reason: collision with root package name */
    private String f4602n;

    /* renamed from: o, reason: collision with root package name */
    private String f4603o;

    /* renamed from: p, reason: collision with root package name */
    private String f4604p;

    /* renamed from: q, reason: collision with root package name */
    private WeakReference f4605q;

    /* renamed from: r, reason: collision with root package name */
    private WeakReference f4606r;

    /* renamed from: s, reason: collision with root package name */
    private WeakReference f4607s;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface a {
        Activity getActivity();
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b implements MaxAdListener, MaxAdRevenueListener, a.InterfaceC0014a {
        public b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                a0.g.y(sb2, MaxFullscreenAdImpl.this.adListener, oVar2, str);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final c3 c3Var = (c3) maxAd;
            MaxFullscreenAdImpl.this.d();
            final boolean z3 = MaxFullscreenAdImpl.this.f4601m;
            if (z3) {
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Ad failover failed");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.B0, c3Var, CollectionUtils.hashMap("details", c3Var.u0()));
                MaxFullscreenAdImpl.this.f4601m = false;
            }
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4645a.a(maxAd, z3, c3Var, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            c3 c3Var = (c3) maxAd;
            if (MaxFullscreenAdImpl.this.f4601m) {
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Ad failover succeeded");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.A0, c3Var, CollectionUtils.hashMap("details", c3Var.u0()));
                MaxFullscreenAdImpl.this.f4601m = false;
            }
            MaxFullscreenAdImpl.this.sdk.f().a(c3Var);
            MaxFullscreenAdImpl.this.b(c3Var);
            MaxFullscreenAdImpl.this.f();
            if (((Integer) MaxFullscreenAdImpl.this.sdk.a(r3.f5233p8)).intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.q0().b(new r6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new g(3, this, c3Var)), d6.b.TIMEOUT, TimeUnit.SECONDS.toMillis(r1.intValue()));
            }
            o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                o oVar3 = maxFullscreenAdImpl2.logger;
                String str = maxFullscreenAdImpl2.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                a0.g.y(sb2, MaxFullscreenAdImpl.this.adListener, oVar3, str);
            }
            t2.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f4601m = false;
            MaxFullscreenAdImpl.this.d();
            MaxFullscreenAdImpl.this.a(c.IDLE, new g(2, this, maxAd));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxFullscreenAdImpl.this.e();
            MaxFullscreenAdImpl.this.a(c.IDLE, new b5.e(this, str, maxError, 12));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            c3 c3Var;
            synchronized (MaxFullscreenAdImpl.this.f4595e) {
                c3Var = MaxFullscreenAdImpl.this.f4596f;
            }
            MaxFullscreenAdImpl.this.sdk.H().a(MaxFullscreenAdImpl.this.adUnitId);
            c3 c3Var2 = (c3) maxAd;
            MaxFullscreenAdImpl.this.a(c3Var2);
            if (!MaxFullscreenAdImpl.this.f4597h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(c.READY, new b5.e(this, c3Var2, maxAd, 11));
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.f4598i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.g();
            }
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + c3Var + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            t2.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) c3Var, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sbA = h.A("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                sbA.append(MaxFullscreenAdImpl.this.requestListener);
                oVar2.a(str2, sbA.toString());
            }
            t2.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            t2.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var, MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f4601m) {
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Attempting ad failover");
                }
                c3Var.j(MaxFullscreenAdImpl.this.f4604p);
                MaxFullscreenAdImpl.this.sdk.P().a(d2.f3920z0, c3Var, CollectionUtils.hashMap("details", MaxFullscreenAdImpl.this.f4604p));
                MaxFullscreenAdImpl.this.g();
                return;
            }
            o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                o oVar3 = maxFullscreenAdImpl2.logger;
                String str = maxFullscreenAdImpl2.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                a0.g.y(sb2, MaxFullscreenAdImpl.this.adListener, oVar3, str);
            }
            t2.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, MaxError maxError) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(str);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                a0.g.y(sb2, MaxFullscreenAdImpl.this.adListener, oVar2, str2);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var) {
            if (c3Var.w().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.P().a(d2.f3908t0, c3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                a0.g.y(sb2, MaxFullscreenAdImpl.this.adListener, oVar2, str);
            }
            t2.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd, boolean z3, c3 c3Var, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z3 && c3Var.z0()) {
                if (MaxFullscreenAdImpl.this.b()) {
                    AppLovinSdkUtils.runOnUiThread(true, new o0(10, this));
                    return;
                }
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Unable to attempt ad failover due to missing cached ad");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.f3918y0, c3Var);
            }
            o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                o oVar3 = maxFullscreenAdImpl2.logger;
                String str = maxFullscreenAdImpl2.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(maxAd);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                a0.g.y(sb2, MaxFullscreenAdImpl.this.adListener, oVar3, str);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            MaxFullscreenAdImpl.this.f4601m = true;
            MaxFullscreenAdImpl.this.loadAd();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, k kVar, Context context) {
        super(str, maxAdFormat, str2, kVar);
        this.f4595e = new Object();
        this.f4596f = null;
        this.g = c.IDLE;
        this.f4597h = new AtomicBoolean();
        this.f4598i = new AtomicBoolean();
        this.f4605q = new WeakReference(null);
        this.f4606r = new WeakReference(null);
        this.f4607s = new WeakReference(null);
        this.f4591a = aVar;
        this.f4593c = createAdListenerWrapper();
        this.f4594d = new com.applovin.impl.mediation.b(kVar);
        this.f4592b = new WeakReference(context);
        kVar.j().a(this);
        o.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    public b createAdListenerWrapper() {
        return new b();
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new o0(9, this));
    }

    public boolean isReady() {
        boolean z3;
        synchronized (this.f4595e) {
            try {
                c3 c3Var = this.f4596f;
                z3 = c3Var != null && c3Var.X() && this.g == c.READY;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z3) {
            this.sdk.H().c(this.adUnitId);
        }
        return z3;
    }

    public void loadAd() {
        loadAd(i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0018a
    public void onAdExpired(t1 t1Var) {
        if (o.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f4597h.set(true);
        a aVar = this.f4591a;
        Activity activity = aVar != null ? aVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            e();
            this.f4593c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, i.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.f4593c);
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        c3 c3Var = this.f4596f;
        if (c3Var == null || !c3Var.Q().equalsIgnoreCase(str)) {
            return;
        }
        this.f4596f.h(str2);
        t2.b(this.adReviewListener, str2, this.f4596f);
    }

    public void showAd(String str, String str2, Activity activity) {
        c3 c3Var;
        List listB = this.sdk.s0().b();
        if (!this.sdk.s0().d() || listB == null || (c3Var = this.f4596f) == null || listB.contains(c3Var.c())) {
            if (activity == null) {
                activity = this.sdk.u0();
            }
            Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new ci.a((Object) this, str, str2, (Object) activity2, 6));
                return;
            }
            return;
        }
        String str3 = "Attempting to show ad from <" + this.f4596f.c() + "> which is not in the list of selected ad networks " + listB;
        o.h(this.tag, str3);
        a(c.IDLE, new e(this, str3, 2));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tag);
        sb2.append("{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f4591a) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", revenueListener=");
        sb2.append(this.revenueListener);
        sb2.append(", requestListener");
        sb2.append(this.requestListener);
        sb2.append(", adReviewListener");
        sb2.append(this.adReviewListener);
        sb2.append(", isReady=");
        sb2.append(isReady());
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        c3 c3Var = this.f4596f;
        a((MaxAd) c3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(c3Var);
            sb2.append(", error=");
            sb2.append(maxErrorImpl);
            sb2.append("), listener=");
            a0.g.y(sb2, this.adListener, oVar, str2);
        }
        t2.a(this.adListener, (MaxAd) c3Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        c3 c3Var;
        if (this.f4597h.compareAndSet(true, false)) {
            synchronized (this.f4595e) {
                c3Var = this.f4596f;
                this.f4596f = null;
            }
            this.sdk.X().destroyAd(c3Var);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Long l10 = (Long) this.sdk.a(x4.D2);
        if (l10.longValue() <= 0) {
            return;
        }
        this.j = g0.a(l10.longValue(), true, this.sdk, new g(1, this, l10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Activity activityU0 = (Activity) this.f4605q.get();
        if (activityU0 == null) {
            activityU0 = this.sdk.u0();
        }
        Activity activity = activityU0;
        if (this.f4600l) {
            showAd(this.f4602n, this.f4603o, (ViewGroup) this.f4606r.get(), (t) this.f4607s.get(), activity);
        } else {
            showAd(this.f4602n, this.f4603o, activity);
        }
    }

    public void loadAd(i iVar) {
        if (o.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.g == c.DESTROYED) {
            boolean zC = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            a aVar = this.f4591a;
            a(c.LOADING, new ci.a(this, aVar != null ? aVar.getActivity() : null, (Context) this.f4592b.get(), iVar, 5));
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (o.a()) {
            o oVar = this.logger;
            String str = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
            sb2.append(this.f4596f);
            sb2.append("), listener=");
            a0.g.y(sb2, this.adListener, oVar, str);
        }
        t2.f(this.adListener, (MaxAd) this.f4596f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f4595e) {
            try {
                if (this.f4596f != null) {
                    if (o.a()) {
                        this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f4596f + "...");
                    }
                    this.sdk.X().destroyAd(this.f4596f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.sdk.j().b(this);
        this.f4594d.a();
        g0 g0Var = this.j;
        if (g0Var != null) {
            g0Var.a();
            this.j = null;
        }
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (((Boolean) this.sdk.a(x4.C2)).booleanValue()) {
            this.sdk.p0().b(z4.R);
        }
        if (this.j != null) {
            this.sdk.p0().b(z4.S);
            this.j.a();
            this.j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, Context context, i iVar) {
        Context context2;
        Context contextO = activity;
        if (activity != null) {
            context2 = contextO;
        } else if (context != null) {
            context2 = context;
        } else {
            if (this.sdk.u0() != null) {
                contextO = this.sdk.u0();
            } else {
                contextO = k.o();
            }
            context2 = contextO;
        }
        this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, context2, this.f4593c);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, t tVar, Activity activity) {
        c3 c3Var;
        if (viewGroup != null && tVar != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(r3.f5225k8)).booleanValue()) {
                o.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                t2.a(this.adListener, (MaxAd) this.f4596f, (MaxError) maxErrorImpl, true);
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f4596f);
                return;
            }
            List listB = this.sdk.s0().b();
            if (this.sdk.s0().d() && listB != null && (c3Var = this.f4596f) != null && !listB.contains(c3Var.c())) {
                String str3 = "Attempting to show ad from <" + this.f4596f.c() + "> which is not in the list of selected ad networks " + listB;
                o.h(this.tag, str3);
                a(c.IDLE, new e(this, str3, 0));
                return;
            }
            if (activity == null) {
                activity = this.sdk.u0();
            }
            Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new com.applovin.impl.mediation.j(this, str, str2, activity2, viewGroup, tVar));
                return;
            }
            return;
        }
        o.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (o.a()) {
            o oVar = this.logger;
            String str4 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(this.f4596f);
            sb2.append(", error=");
            sb2.append(maxErrorImpl2);
            sb2.append("), listener=");
            a0.g.y(sb2, this.adListener, oVar, str4);
        }
        t2.a(this.adListener, (MaxAd) this.f4596f, (MaxError) maxErrorImpl2, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f4596f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.f4600l = false;
        this.f4605q = new WeakReference(activity);
        this.sdk.X().showFullscreenAd(this.f4596f, activity, this.localExtraParameters, this.extraParameters, this.f4593c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        if (((Boolean) this.sdk.a(x4.C2)).booleanValue()) {
            List listB = y2Var.b("mappk_urls");
            if (CollectionUtils.isEmpty(listB)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putLong(jSONObject, "timestamp_ms", System.currentTimeMillis());
            JsonUtils.putJsonArray(jSONObject, "app_killed_urls", new JSONArray((Collection) listB));
            JsonUtils.putJSONObject(jSONObject, "ad_info", new JSONObject(f2.a(y2Var)));
            JsonUtils.putJSONObject(jSONObject, "user_info", new JSONObject(w3.a(y2Var, this.sdk)));
            this.sdk.p0().b(z4.R, jSONObject.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, t tVar) {
        a(str, str2);
        this.f4600l = true;
        this.f4605q = new WeakReference(activity);
        this.f4606r = new WeakReference(viewGroup);
        this.f4607s = new WeakReference(tVar);
        this.sdk.X().showFullscreenAd(this.f4596f, viewGroup, tVar, activity, this.localExtraParameters, this.extraParameters, this.f4593c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        c3 c3Var = this.f4596f;
        a((MaxAd) c3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(c3Var);
            sb2.append(", error=");
            sb2.append(maxErrorImpl);
            sb2.append("), listener=");
            a0.g.y(sb2, this.adListener, oVar, str2);
        }
        t2.a(this.adListener, (MaxAd) c3Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c3Var);
    }

    private boolean a(Activity activity, String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.g == c.DESTROYED) {
            boolean zC = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String strW = h.w(new StringBuilder("Attempting to show ad before it is ready - please check ad readiness using "), this.tag, "#isReady()");
            o.h(this.tag, strW);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, strW);
            x3 x3Var = new x3(this.adUnitId, this.adFormat, str);
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(x3Var);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                a0.g.y(sb2, this.adListener, oVar, str2);
            }
            t2.a(this.adListener, (MaxAd) x3Var, (MaxError) maxErrorImpl, true);
            if (this.f4596f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f4596f);
            }
            return false;
        }
        Long l10 = (Long) this.sdk.a(r3.V7);
        Long l11 = (Long) this.sdk.a(r3.O7);
        if (l10.longValue() > 0 && (this.f4596f.getTimeToLiveMillis() < l11.longValue() || this.f4597h.get())) {
            this.f4598i.set(true);
            this.sdk.q0().a(new r6(this.sdk, "handleShowOnLoadTimeoutError", new e(this, str, 1)), d6.b.TIMEOUT, l10.longValue());
            return false;
        }
        if (n7.a(k.o()) != 0 && this.sdk.n0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!n7.c(this.sdk)) {
                if (((Boolean) this.sdk.a(r3.j8)).booleanValue()) {
                    o.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (o.a()) {
                        o oVar2 = this.logger;
                        String str3 = this.tag;
                        StringBuilder sb3 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                        sb3.append(this.f4596f);
                        sb3.append(", error=");
                        sb3.append(maxErrorImpl2);
                        sb3.append("), listener=");
                        a0.g.y(sb3, this.adListener, oVar2, str3);
                    }
                    t2.a(this.adListener, (MaxAd) this.f4596f, (MaxError) maxErrorImpl2, true);
                    this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f4596f);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.H().e() && !this.sdk.H().d()) {
            return true;
        }
        o.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (o.a()) {
            o oVar3 = this.logger;
            String str4 = this.tag;
            StringBuilder sb4 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb4.append(this.f4596f);
            sb4.append(", error=");
            sb4.append(maxErrorImpl3);
            sb4.append("), listener=");
            a0.g.y(sb4, this.adListener, oVar3, str4);
        }
        t2.a(this.adListener, (MaxAd) this.f4596f, (MaxError) maxErrorImpl3, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f4596f);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        if (this.sdk.R() != null) {
            return this.sdk.R().e(this.adUnitId);
        }
        return this.sdk.Q().d(this.adUnitId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (this.f4598i.compareAndSet(true, false)) {
            o.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.H().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            x3 x3Var = new x3(this.adUnitId, this.adFormat, str);
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(x3Var);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                a0.g.y(sb2, this.adListener, oVar, str2);
            }
            t2.a(this.adListener, (MaxAd) x3Var, (MaxError) maxErrorImpl, true);
            if (this.f4596f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f4596f);
            }
        }
    }

    private void a(String str, String str2) {
        this.f4594d.e(this.f4596f);
        this.f4596f.g(str);
        this.f4596f.f(str2);
        this.f4602n = str;
        this.f4603o = str2;
        this.f4604p = this.f4596f.getNetworkName();
        this.sdk.y().d(this.f4596f);
        if (o.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f4596f + "...");
        }
        a((y2) this.f4596f);
    }

    private void a() {
        c3 c3Var;
        synchronized (this.f4595e) {
            c3Var = this.f4596f;
            this.f4596f = null;
        }
        this.sdk.X().destroyAd(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        this.f4599k = l10.longValue() + this.f4599k;
        this.sdk.p0().b(z4.S, Long.valueOf(this.f4599k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c3 c3Var) {
        if (this.sdk.f().a(c3Var, this)) {
            if (o.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + c3Var);
            }
            this.f4596f = c3Var;
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z3;
        c cVar2 = this.g;
        synchronized (this.f4595e) {
            try {
                c cVar3 = c.IDLE;
                if (cVar2 == cVar3) {
                    if (cVar == c.LOADING || cVar == c.DESTROYED) {
                        z3 = true;
                    } else {
                        if (cVar == c.SHOWING) {
                            o.h(this.tag, "No ad is loading or loaded");
                        } else if (o.a()) {
                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                        }
                        z3 = false;
                    }
                } else {
                    c cVar4 = c.LOADING;
                    if (cVar2 == cVar4) {
                        if (cVar != cVar3) {
                            if (cVar == cVar4) {
                                o.h(this.tag, "An ad is already loading");
                            } else if (cVar != c.READY) {
                                if (cVar == c.SHOWING) {
                                    o.h(this.tag, "An ad is not ready to be shown yet");
                                } else if (cVar != c.DESTROYED) {
                                    if (o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                            }
                            z3 = false;
                        }
                        z3 = true;
                    } else {
                        c cVar5 = c.READY;
                        if (cVar2 == cVar5) {
                            if (cVar != cVar3) {
                                if (cVar == cVar4) {
                                    o.h(this.tag, "An ad is already loaded");
                                } else if (cVar == cVar5) {
                                    if (o.a()) {
                                        this.logger.b(this.tag, "An ad is already marked as ready");
                                    }
                                } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                                    if (o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                                z3 = false;
                            }
                            z3 = true;
                        } else {
                            c cVar6 = c.SHOWING;
                            if (cVar2 == cVar6) {
                                if (cVar != cVar3) {
                                    if (cVar == cVar4) {
                                        o.h(this.tag, "Can not load another ad while the ad is showing");
                                    } else if (cVar == cVar5) {
                                        if (o.a()) {
                                            this.logger.b(this.tag, "An ad is already showing, ignoring");
                                        }
                                    } else if (cVar == cVar6) {
                                        o.h(this.tag, "The ad is already showing, not showing another one");
                                    } else if (cVar != c.DESTROYED) {
                                        if (o.a()) {
                                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                        }
                                    }
                                }
                                z3 = true;
                            } else if (cVar2 == c.DESTROYED) {
                                o.h(this.tag, "No operations are allowed on a destroyed instance");
                            } else if (o.a()) {
                                this.logger.b(this.tag, "Unknown state: " + this.g);
                            }
                            z3 = false;
                        }
                    }
                }
                if (z3) {
                    if (o.a()) {
                        this.logger.a(this.tag, "Transitioning from " + this.g + " to " + cVar + "...");
                    }
                    this.g = cVar;
                } else if (o.a()) {
                    this.logger.k(this.tag, "Not allowed to transition from " + this.g + " to " + cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z3) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.f().a((c3) maxAd);
        this.f4594d.a();
        a();
        this.sdk.a0().a((y2) maxAd);
    }
}
