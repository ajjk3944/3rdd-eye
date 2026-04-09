package com.applovin.impl.mediation.ads;

import J4.h;
import N.i;
import N7.B8;
import N7.C1094a9;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1781n;
import com.applovin.impl.C2123i;
import com.applovin.impl.EnumC2121h;
import com.applovin.impl.a7;
import com.applovin.impl.f6;
import com.applovin.impl.g3;
import com.applovin.impl.l2;
import com.applovin.impl.m3;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.o1;
import com.applovin.impl.q2;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.t2;
import com.applovin.impl.y1;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0316a, C2123i.b {

    /* renamed from: a, reason: collision with root package name */
    private final a f20252a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f20253b;

    /* renamed from: c, reason: collision with root package name */
    private final b f20254c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.mediation.b f20255d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f20256e;

    /* renamed from: f, reason: collision with root package name */
    private t2 f20257f;

    /* renamed from: g, reason: collision with root package name */
    private c f20258g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f20259h;
    private final AtomicBoolean i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f20260j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20261k;

    /* renamed from: l, reason: collision with root package name */
    private String f20262l;

    /* renamed from: m, reason: collision with root package name */
    private String f20263m;

    /* renamed from: n, reason: collision with root package name */
    private WeakReference f20264n;

    /* renamed from: o, reason: collision with root package name */
    private WeakReference f20265o;

    /* renamed from: p, reason: collision with root package name */
    private WeakReference f20266p;

    public interface a {
        Activity getActivity();
    }

    public class b implements MaxAdListener, MaxAdRevenueListener, a.InterfaceC0312a {
        public b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                C1094a9.l(sb, MaxFullscreenAdImpl.this.adListener, oVar2, str);
            }
            l2.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final boolean z10 = MaxFullscreenAdImpl.this.f20261k;
            MaxFullscreenAdImpl.this.f20261k = false;
            final t2 t2Var = (t2) maxAd;
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20307b.a(maxAd, z10, t2Var, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            t2 t2Var = (t2) maxAd;
            MaxFullscreenAdImpl.this.f20261k = false;
            MaxFullscreenAdImpl.this.sdk.f().a(t2Var);
            if (((Integer) MaxFullscreenAdImpl.this.sdk.a(g3.f19377M7)).intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.q0().b(new f6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new B.c(18, this, t2Var)), r5.b.TIMEOUT, TimeUnit.SECONDS.toMillis(r1.intValue()));
            }
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                C1094a9.l(sb, MaxFullscreenAdImpl.this.adListener, oVar2, str);
            }
            l2.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f20261k = false;
            MaxFullscreenAdImpl.this.a(c.IDLE, new B.c(17, this, maxAd));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxFullscreenAdImpl.this.c();
            MaxFullscreenAdImpl.this.a(c.IDLE, new h(this, str, maxError, 9));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            t2 t2Var;
            synchronized (MaxFullscreenAdImpl.this.f20256e) {
                t2Var = MaxFullscreenAdImpl.this.f20257f;
            }
            MaxFullscreenAdImpl.this.sdk.I().a(MaxFullscreenAdImpl.this.adUnitId);
            MaxFullscreenAdImpl.this.a((t2) maxAd);
            if (!MaxFullscreenAdImpl.this.f20259h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(c.READY, new f(3, this, maxAd));
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.d();
            }
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + t2Var + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            l2.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) t2Var, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sbK = B8.k("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                sbK.append(MaxFullscreenAdImpl.this.requestListener);
                oVar2.a(str2, sbK.toString());
            }
            l2.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            l2.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, MaxError maxError) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb.append(str);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                C1094a9.l(sb, MaxFullscreenAdImpl.this.adListener, oVar2, str2);
            }
            l2.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f20261k) {
                MaxFullscreenAdImpl.this.d();
                return;
            }
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                C1094a9.l(sb, MaxFullscreenAdImpl.this.adListener, oVar2, str);
            }
            l2.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(t2 t2Var) {
            if (t2Var.w().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.P().a(y1.f21791e0, t2Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                C1094a9.l(sb, MaxFullscreenAdImpl.this.adListener, oVar2, str);
            }
            l2.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd, boolean z10, t2 t2Var, MaxError maxError) {
            boolean zD;
            MaxFullscreenAdImpl.this.a(maxAd);
            if (MaxFullscreenAdImpl.this.sdk.R() != null) {
                zD = MaxFullscreenAdImpl.this.sdk.R().e(MaxFullscreenAdImpl.this.adUnitId);
            } else {
                zD = MaxFullscreenAdImpl.this.sdk.Q().d(MaxFullscreenAdImpl.this.adUnitId);
            }
            if (!z10 && t2Var.q0() && zD) {
                AppLovinSdkUtils.runOnUiThread(true, new B.b(this, 19));
                return;
            }
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(maxAd);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                C1094a9.l(sb, MaxFullscreenAdImpl.this.adListener, oVar2, str);
            }
            l2.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            MaxFullscreenAdImpl.this.f20261k = true;
            MaxFullscreenAdImpl.this.loadAd();
        }
    }

    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, k kVar, Context context) {
        super(str, maxAdFormat, str2, kVar);
        this.f20256e = new Object();
        this.f20257f = null;
        this.f20258g = c.IDLE;
        this.f20259h = new AtomicBoolean();
        this.i = new AtomicBoolean();
        this.f20264n = new WeakReference(null);
        this.f20265o = new WeakReference(null);
        this.f20266p = new WeakReference(null);
        this.f20252a = aVar;
        this.f20254c = createAdListenerWrapper();
        this.f20255d = new com.applovin.impl.mediation.b(kVar);
        this.f20253b = new WeakReference(context);
        kVar.j().a(this);
        o.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    public b createAdListenerWrapper() {
        return new b();
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new C8.a(this, 7));
    }

    public boolean isReady() {
        boolean z10;
        synchronized (this.f20256e) {
            try {
                t2 t2Var = this.f20257f;
                z10 = t2Var != null && t2Var.U() && this.f20258g == c.READY;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10) {
            this.sdk.I().c(this.adUnitId);
        }
        return z10;
    }

    public void loadAd() {
        loadAd(EnumC2121h.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0316a
    public void onAdExpired(o1 o1Var) {
        if (o.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f20259h.set(true);
        a aVar = this.f20252a;
        Activity activity = aVar != null ? aVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            c();
            this.f20254c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, EnumC2121h.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.f20254c);
        }
    }

    @Override // com.applovin.impl.C2123i.b
    public void onCreativeIdGenerated(String str, String str2) {
        t2 t2Var = this.f20257f;
        if (t2Var == null || !t2Var.O().equalsIgnoreCase(str)) {
            return;
        }
        this.f20257f.h(str2);
        l2.b(this.adReviewListener, str2, this.f20257f);
    }

    public void showAd(String str, String str2, Activity activity) {
        t2 t2Var;
        List listB = this.sdk.s0().b();
        if (!this.sdk.s0().d() || listB == null || (t2Var = this.f20257f) == null || listB.contains(t2Var.c())) {
            if (activity == null) {
                activity = this.sdk.u0();
            }
            Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new D3.a(this, str, str2, activity2, 2));
                return;
            }
            return;
        }
        String str3 = "Attempting to show ad from <" + this.f20257f.c() + "> which is not in the list of selected ad networks " + listB;
        o.h(this.tag, str3);
        a(c.IDLE, new com.applovin.impl.mediation.ads.c(this, str3, 1));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f20252a) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", requestListener");
        sb.append(this.requestListener);
        sb.append(", adReviewListener");
        sb.append(this.adReviewListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        synchronized (this.f20256e) {
            try {
                if (this.f20257f != null) {
                    if (o.a()) {
                        this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f20257f + "...");
                    }
                    this.sdk.X().destroyAd(this.f20257f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.sdk.j().b(this);
        this.f20255d.a();
        super.destroy();
    }

    public void loadAd(EnumC2121h enumC2121h) {
        if (o.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f20258g == c.DESTROYED) {
            boolean zC = a7.c(this.sdk);
            this.sdk.E().a(y1.f21826w0, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            a aVar = this.f20252a;
            a(c.LOADING, new i(this, aVar != null ? aVar.getActivity() : null, (Context) this.f20253b.get(), enumC2121h, 1));
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (o.a()) {
            o oVar = this.logger;
            String str = this.tag;
            StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
            sb.append(this.f20257f);
            sb.append("), listener=");
            C1094a9.l(sb, this.adListener, oVar, str);
        }
        l2.f(this.adListener, (MaxAd) this.f20257f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        t2 t2Var = this.f20257f;
        a((MaxAd) t2Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb.append(t2Var);
            sb.append(", error=");
            sb.append(maxErrorImpl);
            sb.append("), listener=");
            C1094a9.l(sb, this.adListener, oVar, str2);
        }
        l2.a(this.adListener, (MaxAd) t2Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, t2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Activity activityU0 = (Activity) this.f20264n.get();
        if (activityU0 == null) {
            activityU0 = this.sdk.u0();
        }
        Activity activity = activityU0;
        if (this.f20260j) {
            showAd(this.f20262l, this.f20263m, (ViewGroup) this.f20265o.get(), (AbstractC1781n) this.f20266p.get(), activity);
        } else {
            showAd(this.f20262l, this.f20263m, activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, Context context, EnumC2121h enumC2121h) {
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
        this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, enumC2121h, this.localExtraParameters, this.extraParameters, context2, this.f20254c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.f20260j = false;
        this.f20264n = new WeakReference(activity);
        this.sdk.X().showFullscreenAd(this.f20257f, activity, this.f20254c);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, AbstractC1781n abstractC1781n, Activity activity) {
        t2 t2Var;
        if (viewGroup != null && abstractC1781n != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(g3.f19369H7)).booleanValue()) {
                o.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                l2.a(this.adListener, (MaxAd) this.f20257f, (MaxError) maxErrorImpl, true);
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f20257f);
                return;
            }
            List listB = this.sdk.s0().b();
            if (this.sdk.s0().d() && listB != null && (t2Var = this.f20257f) != null && !listB.contains(t2Var.c())) {
                String str3 = "Attempting to show ad from <" + this.f20257f.c() + "> which is not in the list of selected ad networks " + listB;
                o.h(this.tag, str3);
                a(c.IDLE, new com.applovin.impl.mediation.ads.c(this, str3, 0));
                return;
            }
            if (activity == null) {
                activity = this.sdk.u0();
            }
            Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new d(this, str, str2, activity2, viewGroup, abstractC1781n, 0));
                return;
            }
            return;
        }
        o.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (o.a()) {
            o oVar = this.logger;
            String str4 = this.tag;
            StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb.append(this.f20257f);
            sb.append(", error=");
            sb.append(maxErrorImpl2);
            sb.append("), listener=");
            C1094a9.l(sb, this.adListener, oVar, str4);
        }
        l2.a(this.adListener, (MaxAd) this.f20257f, (MaxError) maxErrorImpl2, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f20257f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        t2 t2Var = this.f20257f;
        a((MaxAd) t2Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb.append(t2Var);
            sb.append(", error=");
            sb.append(maxErrorImpl);
            sb.append("), listener=");
            C1094a9.l(sb, this.adListener, oVar, str2);
        }
        l2.a(this.adListener, (MaxAd) t2Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, t2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        t2 t2Var;
        if (this.f20259h.compareAndSet(true, false)) {
            synchronized (this.f20256e) {
                t2Var = this.f20257f;
                this.f20257f = null;
            }
            this.sdk.X().destroyAd(t2Var);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, AbstractC1781n abstractC1781n) {
        a(str, str2);
        this.f20260j = true;
        this.f20264n = new WeakReference(activity);
        this.f20265o = new WeakReference(viewGroup);
        this.f20266p = new WeakReference(abstractC1781n);
        this.sdk.X().showFullscreenAd(this.f20257f, viewGroup, abstractC1781n, activity, this.f20254c);
    }

    private boolean a(Activity activity, String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.f20258g == c.DESTROYED) {
            boolean zC = a7.c(this.sdk);
            this.sdk.E().a(y1.f21826w0, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String strC = B4.f.c(new StringBuilder("Attempting to show ad before it is ready - please check ad readiness using "), this.tag, "#isReady()");
            o.h(this.tag, strC);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, strC);
            m3 m3Var = new m3(this.adUnitId, this.adFormat, str);
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(m3Var);
                sb.append(", error=");
                sb.append(maxErrorImpl);
                sb.append("), listener=");
                C1094a9.l(sb, this.adListener, oVar, str2);
            }
            l2.a(this.adListener, (MaxAd) m3Var, (MaxError) maxErrorImpl, true);
            if (this.f20257f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f20257f);
            }
            return false;
        }
        Long l5 = (Long) this.sdk.a(g3.f19417s7);
        Long l10 = (Long) this.sdk.a(g3.f19410l7);
        if (l5.longValue() > 0 && (this.f20257f.getTimeToLiveMillis() < l10.longValue() || this.f20259h.get())) {
            this.i.set(true);
            this.sdk.q0().a(new f6(this.sdk, "handleShowOnLoadTimeoutError", new f(2, this, str)), r5.b.TIMEOUT, l5.longValue());
            return false;
        }
        if (a7.a(k.o()) != 0 && this.sdk.n0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!a7.c(this.sdk)) {
                if (((Boolean) this.sdk.a(g3.G7)).booleanValue()) {
                    o.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (o.a()) {
                        o oVar2 = this.logger;
                        String str3 = this.tag;
                        StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                        sb2.append(this.f20257f);
                        sb2.append(", error=");
                        sb2.append(maxErrorImpl2);
                        sb2.append("), listener=");
                        C1094a9.l(sb2, this.adListener, oVar2, str3);
                    }
                    l2.a(this.adListener, (MaxAd) this.f20257f, (MaxError) maxErrorImpl2, true);
                    this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f20257f);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.I().d() && !this.sdk.I().c()) {
            return true;
        }
        o.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (o.a()) {
            o oVar3 = this.logger;
            String str4 = this.tag;
            StringBuilder sb3 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb3.append(this.f20257f);
            sb3.append(", error=");
            sb3.append(maxErrorImpl3);
            sb3.append("), listener=");
            C1094a9.l(sb3, this.adListener, oVar3, str4);
        }
        l2.a(this.adListener, (MaxAd) this.f20257f, (MaxError) maxErrorImpl3, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f20257f);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (this.i.compareAndSet(true, false)) {
            o.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.I().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            m3 m3Var = new m3(this.adUnitId, this.adFormat, str);
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(m3Var);
                sb.append(", error=");
                sb.append(maxErrorImpl);
                sb.append("), listener=");
                C1094a9.l(sb, this.adListener, oVar, str2);
            }
            l2.a(this.adListener, (MaxAd) m3Var, (MaxError) maxErrorImpl, true);
            if (this.f20257f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f20257f);
            }
        }
    }

    private void a(String str, String str2) {
        this.f20255d.e(this.f20257f);
        this.f20257f.g(str);
        this.f20257f.f(str2);
        this.f20262l = str;
        this.f20263m = str2;
        this.sdk.z().d(this.f20257f);
        if (o.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f20257f + "...");
        }
        a((q2) this.f20257f);
    }

    private void a() {
        t2 t2Var;
        synchronized (this.f20256e) {
            t2Var = this.f20257f;
            this.f20257f = null;
        }
        this.sdk.X().destroyAd(t2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(t2 t2Var) {
        if (this.sdk.f().a(t2Var, this)) {
            if (o.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + t2Var);
            }
            this.f20257f = t2Var;
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(t2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z10;
        c cVar2 = this.f20258g;
        synchronized (this.f20256e) {
            try {
                c cVar3 = c.IDLE;
                if (cVar2 == cVar3) {
                    if (cVar == c.LOADING || cVar == c.DESTROYED) {
                        z10 = true;
                    } else {
                        if (cVar == c.SHOWING) {
                            o.h(this.tag, "No ad is loading or loaded");
                        } else if (o.a()) {
                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                        }
                        z10 = false;
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
                            z10 = false;
                        }
                        z10 = true;
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
                                z10 = false;
                            }
                            z10 = true;
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
                                z10 = true;
                            } else if (cVar2 == c.DESTROYED) {
                                o.h(this.tag, "No operations are allowed on a destroyed instance");
                            } else if (o.a()) {
                                this.logger.b(this.tag, "Unknown state: " + this.f20258g);
                            }
                            z10 = false;
                        }
                    }
                }
                if (z10) {
                    if (o.a()) {
                        this.logger.a(this.tag, "Transitioning from " + this.f20258g + " to " + cVar + "...");
                    }
                    this.f20258g = cVar;
                } else if (o.a()) {
                    this.logger.k(this.tag, "Not allowed to transition from " + this.f20258g + " to " + cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.f().a((t2) maxAd);
        this.f20255d.a();
        a();
        this.sdk.a0().a((q2) maxAd);
    }
}
