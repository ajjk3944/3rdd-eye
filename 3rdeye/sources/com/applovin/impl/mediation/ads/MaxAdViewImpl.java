package com.applovin.impl.mediation.ads;

import B4.i;
import C.T;
import C.V;
import N7.B8;
import N7.C1094a9;
import N7.C1154e9;
import N7.G8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.work.s;
import com.applovin.impl.AbstractC2128k0;
import com.applovin.impl.C2123i;
import com.applovin.impl.EnumC2121h;
import com.applovin.impl.a7;
import com.applovin.impl.f6;
import com.applovin.impl.g3;
import com.applovin.impl.l2;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.q2;
import com.applovin.impl.r;
import com.applovin.impl.r5;
import com.applovin.impl.r7;
import com.applovin.impl.s2;
import com.applovin.impl.s7;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t7;
import com.applovin.impl.w4;
import com.applovin.impl.y1;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements f.a, t7.a, C2123i.b {

    /* renamed from: A, reason: collision with root package name */
    private boolean f20220A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f20221B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f20222C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f20223D;

    /* renamed from: a, reason: collision with root package name */
    private final Context f20224a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdView f20225b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20226c;

    /* renamed from: d, reason: collision with root package name */
    private final View f20227d;

    /* renamed from: e, reason: collision with root package name */
    private long f20228e;

    /* renamed from: f, reason: collision with root package name */
    private s2 f20229f;

    /* renamed from: g, reason: collision with root package name */
    private String f20230g;

    /* renamed from: h, reason: collision with root package name */
    private String f20231h;
    private final MaxAdViewConfiguration i;

    /* renamed from: j, reason: collision with root package name */
    private final b f20232j;

    /* renamed from: k, reason: collision with root package name */
    private final d f20233k;

    /* renamed from: l, reason: collision with root package name */
    private final com.applovin.impl.sdk.f f20234l;

    /* renamed from: m, reason: collision with root package name */
    private final s7 f20235m;

    /* renamed from: n, reason: collision with root package name */
    private final t7 f20236n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f20237o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f20238p;

    /* renamed from: q, reason: collision with root package name */
    private s2 f20239q;

    /* renamed from: r, reason: collision with root package name */
    private MaxAd f20240r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f20241s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20242t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f20243u;

    /* renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f20244v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f20245w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f20246x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f20247y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f20248z;

    public class b extends c {
        private b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            o oVar = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                o oVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb.append(str);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                C1094a9.l(sb, MaxAdViewImpl.this.adListener, oVar2, str2);
            }
            l2.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.a()) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.X().destroyAd(maxAd);
                return;
            }
            s2 s2Var = (s2) maxAd;
            s2Var.g(MaxAdViewImpl.this.f20230g);
            s2Var.f(MaxAdViewImpl.this.f20231h);
            if (s2Var.y() == null) {
                MaxAdViewImpl.this.sdk.X().destroyAd(s2Var);
                onAdLoadFailed(s2Var.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (s2Var.p0()) {
                long jK0 = s2Var.k0();
                MaxAdViewImpl.this.sdk.O();
                if (o.a()) {
                    o oVarO = MaxAdViewImpl.this.sdk.O();
                    String str = MaxAdViewImpl.this.tag;
                    StringBuilder sbJ = s.j("Scheduling banner ad refresh ", " milliseconds from now for '", jK0);
                    sbJ.append(MaxAdViewImpl.this.adUnitId);
                    sbJ.append("'...");
                    oVarO.a(str, sbJ.toString());
                }
                MaxAdViewImpl.this.f20234l.a(jK0);
                if (MaxAdViewImpl.this.f20234l.g() || MaxAdViewImpl.this.f20243u) {
                    o oVar2 = MaxAdViewImpl.this.logger;
                    if (o.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.f20234l.j();
                }
            }
            o oVar3 = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                o oVar4 = maxAdViewImpl3.logger;
                String str2 = maxAdViewImpl3.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb.append(maxAd);
                sb.append("), listener=");
                C1094a9.l(sb, MaxAdViewImpl.this.adListener, oVar4, str2);
            }
            l2.f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.this.d(s2Var);
        }
    }

    public abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0312a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f20239q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    C1094a9.l(sb, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                l2.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(((Boolean) MaxAdViewImpl.this.sdk.a(g3.f19423y7)).booleanValue() ? MaxAdViewImpl.this.f20240r : MaxAdViewImpl.this.f20239q)) {
                MaxAdViewImpl.this.f20240r = null;
                if ((MaxAdViewImpl.this.f20239q.q0() || MaxAdViewImpl.this.f20221B) && MaxAdViewImpl.this.f20241s) {
                    MaxAdViewImpl.this.f20241s = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdViewAdListener.onAdCollapsed(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    C1094a9.l(sb, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                l2.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f20239q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                    sb.append(maxAd);
                    sb.append(", error=");
                    sb.append(maxError);
                    sb.append("), listener=");
                    C1094a9.l(sb, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                l2.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f20239q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    C1094a9.l(sb, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                l2.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f20239q)) {
                if (((Boolean) MaxAdViewImpl.this.sdk.a(g3.f19423y7)).booleanValue()) {
                    MaxAdViewImpl.this.f20240r = maxAd;
                }
                if ((MaxAdViewImpl.this.f20239q.q0() || MaxAdViewImpl.this.f20221B) && !MaxAdViewImpl.this.f20234l.g()) {
                    MaxAdViewImpl.this.f20241s = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdViewAdListener.onAdExpanded(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    C1094a9.l(sb, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                l2.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f20239q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                    sb.append(maxAd);
                    sb.append("), listener=");
                    C1094a9.l(sb, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                l2.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            o oVar = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                o oVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sbK = B8.k("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                sbK.append(MaxAdViewImpl.this.requestListener);
                oVar2.a(str2, sbK.toString());
            }
            l2.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            o oVar = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            l2.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    public class d extends c {
        private d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            o oVar = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.f20246x) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Successfully precached ad for refresh");
                }
                if (((Boolean) MaxAdViewImpl.this.sdk.a(g3.f19403e7)).booleanValue()) {
                    MaxAdViewImpl.this.b(maxAd);
                    return;
                } else {
                    MaxAdViewImpl.this.a(maxAd);
                    return;
                }
            }
            o oVar2 = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.X().destroyAd(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, MaxAdView maxAdView, View view, Context context) {
        super(str, maxAdFormat, "MaxAdView", AppLovinSdk.getInstance(context).a());
        this.f20226c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f20228e = Long.MAX_VALUE;
        this.f20237o = new Object();
        this.f20238p = new Object();
        this.f20239q = null;
        this.f20240r = null;
        this.f20244v = new AtomicBoolean();
        this.f20246x = false;
        this.f20224a = context.getApplicationContext();
        this.f20225b = maxAdView;
        this.f20227d = view;
        this.f20232j = new b();
        this.f20233k = new d();
        this.f20234l = new com.applovin.impl.sdk.f(this.sdk, this);
        this.f20235m = new s7(maxAdView, this.sdk);
        this.f20236n = new t7(maxAdView, this.sdk, this);
        this.i = maxAdViewConfiguration;
        this.sdk.j().a(this);
        if (maxAdViewConfiguration != null && maxAdViewConfiguration.getAdaptiveType() != MaxAdViewConfiguration.AdaptiveType.NONE) {
            setExtraParameter("adaptive_banner", Boolean.toString(true));
            setLocalExtraParameter("adaptive_banner_type", maxAdViewConfiguration.getAdaptiveType().toString());
            int adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth();
            if (adaptiveWidth > 0) {
                setLocalExtraParameter("adaptive_banner_width", Integer.valueOf(adaptiveWidth));
            }
            int inlineMaximumHeight = maxAdViewConfiguration.getInlineMaximumHeight();
            if (inlineMaximumHeight > 0) {
                setLocalExtraParameter("inline_adaptive_banner_max_height", Integer.valueOf(inlineMaximumHeight));
            }
        }
        if (o.a()) {
            this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        if (((Boolean) this.sdk.a(g3.f19404f7)).booleanValue()) {
            AppLovinSdkUtils.runOnUiThread(new C8.a(this, 6));
        } else {
            g();
        }
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f20230g;
    }

    public void loadAd() {
        loadAd(EnumC2121h.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onAdRefresh() {
        if (((Boolean) this.sdk.a(g3.f19403e7)).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.C2123i.b
    public void onCreativeIdGenerated(String str, String str2) {
        s2 s2Var = this.f20239q;
        if (s2Var != null && s2Var.O().equalsIgnoreCase(str)) {
            this.f20239q.h(str2);
            l2.b(this.adReviewListener, str2, this.f20239q);
            return;
        }
        s2 s2Var2 = this.f20229f;
        if (s2Var2 == null || !s2Var2.O().equalsIgnoreCase(str)) {
            return;
        }
        this.f20229f.h(str2);
    }

    @Override // com.applovin.impl.t7.a
    public void onLogVisibilityImpression() {
        a(this.f20239q, this.f20235m.a(this.f20239q));
    }

    public void onWindowVisibilityChanged(int i) {
        if (((Boolean) this.sdk.a(g3.f19400b7)).booleanValue() && this.f20234l.h()) {
            if (r7.b(i)) {
                if (o.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.f20234l.d();
            } else {
                if (o.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.f20234l.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f20239q != null && o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sbK = B8.k("Setting custom data (", str, ") for Ad Unit ID (");
            sbK.append(this.adUnitId);
            sbK.append(") after an ad has been loaded already.");
            oVar.k(str2, sbK.toString());
        }
        a7.b(str, this.tag);
        this.f20231h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f20239q != null && o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sbK = B8.k("Setting placement (", str, ") for Ad Unit ID (");
            sbK.append(this.adUnitId);
            sbK.append(") after an ad has been loaded already.");
            oVar.k(str2, sbK.toString());
        }
        this.f20230g = str;
    }

    public void setPublisherBackgroundColor(int i) {
        this.f20228e = i;
    }

    public void startAutoRefresh() {
        this.f20243u = false;
        if (!this.f20234l.g()) {
            if (o.a()) {
                this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
                return;
            }
            return;
        }
        this.f20234l.m();
        if (o.a()) {
            this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.f20234l.b() + "ms");
        }
    }

    public void stopAutoRefresh() {
        if (this.f20239q == null) {
            if (this.f20247y || ((Boolean) this.sdk.a(g3.f19402d7)).booleanValue()) {
                this.f20243u = true;
                return;
            } else {
                o.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (o.a()) {
            this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.f20234l.b() + "ms");
        }
        this.f20234l.j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f20225b) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", isDestroyed=");
        return C1154e9.k(sb, a(), '}');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(s2 s2Var) {
        AppLovinSdkUtils.runOnUiThread(new T(22, this, s2Var));
    }

    private void e() {
        this.f20244v.set(false);
        if (this.f20229f != null) {
            i();
            return;
        }
        if (!b()) {
            if (o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(EnumC2121h.REFRESH);
        } else if (this.f20242t) {
            if (o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(EnumC2121h.REFRESH);
        } else {
            if (o.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f20244v.set(true);
        }
    }

    private void f() {
        boolean z10;
        boolean z11;
        synchronized (this.f20238p) {
            try {
                z10 = false;
                this.f20244v.set(false);
                z11 = this.f20229f != null;
                if (!z11) {
                    if (b()) {
                        if (!this.f20242t) {
                            if (o.a()) {
                                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                            }
                            this.f20244v.set(true);
                        } else if (o.a()) {
                            this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                        }
                    } else if (o.a()) {
                        this.logger.a(this.tag, "Refreshing ad from network...");
                    }
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z11) {
            i();
        } else if (z10) {
            loadAd(EnumC2121h.REFRESH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        h();
        if (this.f20229f != null) {
            this.sdk.X().destroyAd(this.f20229f);
        }
        synchronized (this.f20237o) {
            this.f20246x = true;
        }
        this.f20234l.a();
        this.sdk.j().b(this);
        if (this.sdk.R() != null) {
            this.sdk.R().c(this.adUnitId, this.f20226c);
        } else {
            this.sdk.Q().c(this.adUnitId, this.f20226c);
        }
        super.destroy();
    }

    private void h() {
        s2 s2Var;
        MaxAdView maxAdView = this.f20225b;
        if (maxAdView != null) {
            r.a(maxAdView, this.f20227d);
        }
        this.f20236n.b();
        synchronized (this.f20237o) {
            s2Var = this.f20239q;
        }
        MaxAd maxAd = this.f20240r;
        if (maxAd != null && maxAd.equals(s2Var)) {
            if (o.a()) {
                this.logger.a(this.tag, "Collapsing ad manually for removed ad.");
            }
            l2.b(this.f20232j, maxAd);
        }
        if (s2Var != null) {
            this.sdk.X().destroyAd(s2Var);
        }
    }

    private void i() {
        if (o.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f20229f + "...");
        }
        this.f20232j.onAdLoaded(this.f20229f);
        this.f20229f = null;
    }

    public void loadAd(EnumC2121h enumC2121h) {
        if (o.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z10 = this.f20247y || ((Boolean) this.sdk.a(g3.f19402d7)).booleanValue();
        if (z10 && !this.f20234l.g() && this.f20234l.h()) {
            o.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f20234l.b()) + " seconds.");
            return;
        }
        if (!z10) {
            if (o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(enumC2121h, this.f20232j);
        } else if (this.f20229f != null) {
            if (o.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            i();
        } else if (this.f20245w) {
            if (o.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.f20244v.set(true);
        } else {
            if (o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(enumC2121h, this.f20232j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(s2 s2Var) {
        View viewY = s2Var.y();
        String str = viewY == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f20225b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (o.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb.append(s2Var);
                sb.append(", error=");
                sb.append(maxErrorImpl);
                sb.append("), listener=");
                C1094a9.l(sb, this.adListener, oVar, str2);
            }
            l2.a(this.adListener, (MaxAd) s2Var, (MaxError) maxErrorImpl, true);
            this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, s2Var);
            return;
        }
        h();
        a((q2) s2Var);
        if (s2Var.j0()) {
            this.f20236n.a(s2Var);
        }
        maxAdView.setDescendantFocusability(393216);
        if (s2Var.l0() != Long.MAX_VALUE) {
            this.f20227d.setBackgroundColor((int) s2Var.l0());
        } else {
            long j4 = this.f20228e;
            if (j4 != Long.MAX_VALUE) {
                this.f20227d.setBackgroundColor((int) j4);
            } else {
                this.f20227d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(viewY);
        a(viewY, s2Var);
        this.sdk.z().d(s2Var);
        c(s2Var);
        synchronized (this.f20237o) {
            this.f20239q = s2Var;
        }
        if (o.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.X().processRawAdImpression(s2Var, this.f20232j);
        if (StringUtils.isValidString(this.f20239q.getAdReviewCreativeId())) {
            l2.a(this.adReviewListener, this.f20239q.getAdReviewCreativeId(), (MaxAd) this.f20239q, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new f(1, this, s2Var), s2Var.n0());
    }

    private void d() {
        if (b()) {
            if (o.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.f20245w = true;
            this.sdk.q0().a((w4) new f6(this.sdk, "loadMaxAdForPrecacheRequest", new V(this, 12)), r5.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (o.a()) {
            this.logger.a(this.tag, "Loading ad for precache request...");
        }
        a(EnumC2121h.SEQUENTIAL_OR_PRECACHE, this.f20233k);
    }

    private void a(EnumC2121h enumC2121h, a.InterfaceC0312a interfaceC0312a) {
        if (a()) {
            boolean zC = a7.c(this.sdk);
            this.sdk.E().a(y1.f21826w0, "attemptingToLoadDestroyedAdView", CollectionUtils.hashMap("details", "debug=" + zC));
            if (!zC) {
                o.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            } else {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        AppLovinSdkUtils.runOnUiThread(true, new N.d(this, interfaceC0312a, enumC2121h, 5));
    }

    private void c(s2 s2Var) {
        int height = this.f20225b.getHeight();
        int width = this.f20225b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = AppLovinSdkUtils.pxToDp(this.f20224a, height);
            int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f20224a, width);
            MaxAdFormat format = s2Var.getFormat();
            int height2 = (this.f20223D ? format.getAdaptiveSize(iPxToDp2, this.f20225b.getContext()) : format.getSize()).getHeight();
            int iMin = Math.min(format.getSize().getWidth(), AbstractC2128k0.b(this.f20224a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                StringBuilder sbI = s.i("\n**************************************************\n`MaxAdView` size ", iPxToDp2, "x", iPxToDp, " dp smaller than required ");
                sbI.append(this.f20223D ? "adaptive " : "");
                sbI.append("size: ");
                sbI.append(iMin);
                sbI.append("x");
                String strJ = i.j(sbI, height2, " dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                if (o.a()) {
                    this.logger.b("AppLovinSdk", strJ);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a.InterfaceC0312a interfaceC0312a, EnumC2121h enumC2121h) {
        int adaptiveWidth;
        s2 s2Var = this.f20239q;
        if (s2Var != null) {
            long jA = this.f20235m.a(s2Var);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f20239q.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(jA));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f20225b.getContext(), this.f20225b.getWidth());
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f20225b.getContext(), this.f20225b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(iPxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(iPxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f20234l.g() || this.f20243u));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f20248z));
        MaxAdViewConfiguration maxAdViewConfiguration = this.i;
        if (maxAdViewConfiguration != null && (adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth()) > 0 && iPxToDp != adaptiveWidth) {
            o.j(this.tag, G8.r("The requested adaptive ad view width (", adaptiveWidth, " dp) is different from the MaxAdView width (", iPxToDp, " dp)."));
        }
        if (o.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0312a + "...");
        }
        this.sdk.X().loadAd(this.adUnitId, this.f20226c, this.adFormat, enumC2121h, this.localExtraParameters, this.extraParameters, this.f20224a, interfaceC0312a);
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (o.a()) {
                C1154e9.m("Updated allow immediate auto-refresh pause and ad load to: ", str2, this.logger, this.tag);
            }
            this.f20247y = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (o.a()) {
                C1154e9.m("Updated disable auto-retries to: ", str2, this.logger, this.tag);
            }
            this.f20248z = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (o.a()) {
                C1154e9.m("Updated precached disabled to: ", str2, this.logger, this.tag);
            }
            this.f20220A = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (o.a()) {
                C1154e9.m("Updated should stop auto-refresh on ad expand to: ", str2, this.logger, this.tag);
            }
            this.f20221B = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (o.a()) {
                C1154e9.m("Updated force precache to: ", str2, this.logger, this.tag);
            }
            this.f20222C = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (o.a()) {
                C1154e9.m("Updated is adaptive banner to: ", str2, this.logger, this.tag);
            }
            if (this.i == null) {
                o.h(this.tag, "You configured adaptive banners incorrectly by setting extra parameters to the MaxAdView! Please configure adaptive banners via MaxAdViewConfiguration instead. Learn more: https://developers.applovin.com/en/max/android/ad-formats/banner-and-mrec-ads#adaptive-banners");
            }
            this.f20223D = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MaxAd maxAd) {
        boolean zCompareAndSet;
        this.f20245w = false;
        synchronized (this.f20238p) {
            try {
                zCompareAndSet = this.f20244v.compareAndSet(true, false);
                if (!zCompareAndSet) {
                    if (o.a()) {
                        this.logger.a(this.tag, "Saving precache ad...");
                    }
                    s2 s2Var = (s2) maxAd;
                    this.f20229f = s2Var;
                    s2Var.g(this.f20230g);
                    this.f20229f.f(this.f20231h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zCompareAndSet) {
            if (o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f20232j.onAdLoaded(maxAd);
        }
    }

    private boolean b() {
        if (this.f20220A) {
            return false;
        }
        return ((Boolean) this.sdk.a(g3.f19409k7)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(s2 s2Var) {
        long jA = this.f20235m.a(s2Var);
        if (!s2Var.j0()) {
            a(s2Var, jA);
        }
        a(jA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (a()) {
            if (o.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(g3.f19396X6).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.O();
            if (o.a()) {
                this.sdk.O().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f20243u && !this.f20234l.g()) {
            this.f20242t = true;
            this.f20245w = false;
            long jLongValue = ((Long) this.sdk.a(g3.f19395W6)).longValue();
            if (jLongValue >= 0) {
                this.sdk.O();
                if (o.a()) {
                    o oVarO = this.sdk.O();
                    String str = this.tag;
                    StringBuilder sbJ = s.j("Scheduling failed banner ad refresh ", " milliseconds from now for '", jLongValue);
                    sbJ.append(this.adUnitId);
                    sbJ.append("'...");
                    oVarO.a(str, sbJ.toString());
                }
                this.f20234l.a(jLongValue);
                return;
            }
            return;
        }
        if (this.f20245w) {
            if (o.a()) {
                this.logger.a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.f20245w = false;
        }
        if (this.f20244v.get()) {
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb = new StringBuilder("Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=");
                sb.append(this.adUnitId);
                sb.append(", error=");
                sb.append(maxError);
                sb.append("), listener=");
                C1094a9.l(sb, this.adListener, oVar, str2);
            }
            l2.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(View view, s2 s2Var) {
        int iO0 = s2Var.o0();
        int iM0 = s2Var.m0();
        int iDpToPx = iO0 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), iO0);
        int iDpToPx2 = iM0 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), iM0) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (o.a()) {
                this.logger.a(this.tag, G8.r("Pinning ad view to MAX ad view with width: ", iDpToPx, " and height: ", iDpToPx2, "."));
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i : r7.a(this.f20225b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void a(s2 s2Var, long j4) {
        if (o.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.X().processViewabilityAdImpressionPostback(s2Var, j4, this.f20232j);
    }

    private void a(long j4) {
        if (a7.a(j4, ((Long) this.sdk.a(g3.f19408j7)).longValue()) && !this.f20222C) {
            if (o.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j4) + ", undesired: " + Long.toBinaryString(j4));
            }
            if (o.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f20242t = true;
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.f20242t = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f20245w = false;
        if (this.f20244v.compareAndSet(true, false)) {
            if (o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f20232j.onAdLoaded(maxAd);
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "Saving precache ad...");
        }
        s2 s2Var = (s2) maxAd;
        this.f20229f = s2Var;
        s2Var.g(this.f20230g);
        this.f20229f.f(this.f20231h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        boolean z10;
        synchronized (this.f20237o) {
            z10 = this.f20246x;
        }
        return z10;
    }
}
