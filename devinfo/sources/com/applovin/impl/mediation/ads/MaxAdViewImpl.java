package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.b3;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e8;
import com.applovin.impl.f8;
import com.applovin.impl.g8;
import com.applovin.impl.i;
import com.applovin.impl.i5;
import com.applovin.impl.j;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.s;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.y2;
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
import d.h;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements f.a, g8.a, j.b {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;

    /* renamed from: a, reason: collision with root package name */
    private final Context f4564a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdView f4565b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4566c;

    /* renamed from: d, reason: collision with root package name */
    private final View f4567d;

    /* renamed from: e, reason: collision with root package name */
    private long f4568e;

    /* renamed from: f, reason: collision with root package name */
    private b3 f4569f;
    private String g;

    /* renamed from: h, reason: collision with root package name */
    private String f4570h;

    /* renamed from: i, reason: collision with root package name */
    private final MaxAdViewConfiguration f4571i;
    private final b j;

    /* renamed from: k, reason: collision with root package name */
    private final d f4572k;

    /* renamed from: l, reason: collision with root package name */
    private final com.applovin.impl.sdk.f f4573l;

    /* renamed from: m, reason: collision with root package name */
    private final f8 f4574m;

    /* renamed from: n, reason: collision with root package name */
    private final g8 f4575n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f4576o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f4577p;

    /* renamed from: q, reason: collision with root package name */
    private b3 f4578q;

    /* renamed from: r, reason: collision with root package name */
    private MaxAd f4579r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f4580s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4581t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f4582u;

    /* renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f4583v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f4584w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f4585x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f4586y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f4587z;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
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
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(str);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                a0.g.y(sb2, MaxAdViewImpl.this.adListener, oVar2, str2);
            }
            t2.a(MaxAdViewImpl.this.adListener, str, maxError, true);
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
            b3 b3Var = (b3) maxAd;
            b3Var.g(MaxAdViewImpl.this.g);
            b3Var.f(MaxAdViewImpl.this.f4570h);
            if (b3Var.y() == null) {
                MaxAdViewImpl.this.sdk.X().destroyAd(b3Var);
                onAdLoadFailed(b3Var.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (b3Var.w0()) {
                long jR0 = b3Var.r0();
                MaxAdViewImpl.this.sdk.O();
                if (o.a()) {
                    o oVarO = MaxAdViewImpl.this.sdk.O();
                    String str = MaxAdViewImpl.this.tag;
                    StringBuilder sbY = h.y(jR0, "Scheduling banner ad refresh ", " milliseconds from now for '");
                    sbY.append(MaxAdViewImpl.this.adUnitId);
                    sbY.append("'...");
                    oVarO.a(str, sbY.toString());
                }
                MaxAdViewImpl.this.f4573l.a(jR0);
                if (MaxAdViewImpl.this.f4573l.g() || MaxAdViewImpl.this.f4582u) {
                    o oVar2 = MaxAdViewImpl.this.logger;
                    if (o.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.f4573l.j();
                }
            }
            o oVar3 = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                o oVar4 = maxAdViewImpl3.logger;
                String str2 = maxAdViewImpl3.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                a0.g.y(sb2, MaxAdViewImpl.this.adListener, oVar4, str2);
            }
            t2.f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.this.d(b3Var);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0014a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f4578q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    a0.g.y(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                t2.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f4579r)) {
                MaxAdViewImpl.this.f4579r = null;
                if ((MaxAdViewImpl.this.f4578q.x0() || MaxAdViewImpl.this.B) && MaxAdViewImpl.this.f4580s) {
                    MaxAdViewImpl.this.f4580s = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdViewAdListener.onAdCollapsed(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    a0.g.y(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                t2.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f4578q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                    sb2.append(maxAd);
                    sb2.append(", error=");
                    sb2.append(maxError);
                    sb2.append("), listener=");
                    a0.g.y(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                t2.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f4578q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    a0.g.y(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                t2.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f4578q)) {
                MaxAdViewImpl.this.f4579r = maxAd;
                if ((MaxAdViewImpl.this.f4578q.x0() || MaxAdViewImpl.this.B) && !MaxAdViewImpl.this.f4573l.g()) {
                    MaxAdViewImpl.this.f4580s = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdViewAdListener.onAdExpanded(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    a0.g.y(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                t2.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f4578q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    a0.g.y(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                t2.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            o oVar = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                o oVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sbA = h.A("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                sbA.append(MaxAdViewImpl.this.requestListener);
                oVar2.a(str2, sbA.toString());
            }
            t2.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            o oVar = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            t2.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
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
            if (!MaxAdViewImpl.this.f4585x) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Successfully precached ad for refresh");
                }
                if (((Boolean) MaxAdViewImpl.this.sdk.a(r3.H7)).booleanValue()) {
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
        this.f4566c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f4568e = Long.MAX_VALUE;
        this.f4576o = new Object();
        this.f4577p = new Object();
        this.f4578q = null;
        this.f4579r = null;
        this.f4583v = new AtomicBoolean();
        this.f4585x = false;
        this.f4564a = context.getApplicationContext();
        this.f4565b = maxAdView;
        this.f4567d = view;
        this.j = new b();
        this.f4572k = new d();
        this.f4573l = new com.applovin.impl.sdk.f(this.sdk, this);
        this.f4574m = new f8(maxAdView, this.sdk);
        this.f4575n = new g8(maxAdView, this.sdk, this);
        this.f4571i = maxAdViewConfiguration;
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
        if (((Boolean) this.sdk.a(r3.I7)).booleanValue()) {
            AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.c(this, 0));
        } else {
            g();
        }
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.g;
    }

    public void loadAd() {
        loadAd(i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onAdRefresh() {
        if (((Boolean) this.sdk.a(r3.H7)).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        b3 b3Var = this.f4578q;
        if (b3Var != null && b3Var.Q().equalsIgnoreCase(str)) {
            this.f4578q.h(str2);
            t2.b(this.adReviewListener, str2, this.f4578q);
            return;
        }
        b3 b3Var2 = this.f4569f;
        if (b3Var2 == null || !b3Var2.Q().equalsIgnoreCase(str)) {
            return;
        }
        this.f4569f.h(str2);
    }

    @Override // com.applovin.impl.g8.a
    public void onLogVisibilityImpression() {
        a(this.f4578q, this.f4574m.a(this.f4578q));
    }

    public void onWindowVisibilityChanged(int i4) {
        if (((Boolean) this.sdk.a(r3.E7)).booleanValue() && this.f4573l.h()) {
            if (e8.b(i4)) {
                if (o.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.f4573l.d();
            } else {
                if (o.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.f4573l.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f4578q != null && o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sbA = h.A("Setting custom data (", str, ") for Ad Unit ID (");
            sbA.append(this.adUnitId);
            sbA.append(") after an ad has been loaded already.");
            oVar.k(str2, sbA.toString());
        }
        n7.b(str, this.tag);
        this.f4570h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f4578q != null && o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sbA = h.A("Setting placement (", str, ") for Ad Unit ID (");
            sbA.append(this.adUnitId);
            sbA.append(") after an ad has been loaded already.");
            oVar.k(str2, sbA.toString());
        }
        this.g = str;
    }

    public void setPublisherBackgroundColor(int i4) {
        this.f4568e = i4;
    }

    public void startAutoRefresh() {
        this.f4582u = false;
        if (!this.f4573l.g()) {
            if (o.a()) {
                this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
                return;
            }
            return;
        }
        this.f4573l.m();
        if (o.a()) {
            this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.f4573l.b() + "ms");
        }
    }

    public void stopAutoRefresh() {
        if (this.f4578q == null) {
            if (this.f4586y || ((Boolean) this.sdk.a(r3.G7)).booleanValue()) {
                this.f4582u = true;
                return;
            } else {
                o.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (o.a()) {
            this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.f4573l.b() + "ms");
        }
        this.f4573l.j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdView{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f4565b) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", isDestroyed=");
        return h.x(sb2, a(), '}');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(b3 b3Var) {
        AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.d(this, b3Var, 1));
    }

    private void e() {
        this.f4583v.set(false);
        if (this.f4569f != null) {
            i();
            return;
        }
        if (!b()) {
            if (o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(i.REFRESH);
        } else if (this.f4581t) {
            if (o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(i.REFRESH);
        } else {
            if (o.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f4583v.set(true);
        }
    }

    private void f() {
        boolean z3;
        boolean z10;
        synchronized (this.f4577p) {
            try {
                z3 = false;
                this.f4583v.set(false);
                z10 = this.f4569f != null;
                if (!z10) {
                    if (b()) {
                        if (!this.f4581t) {
                            if (o.a()) {
                                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                            }
                            this.f4583v.set(true);
                        } else if (o.a()) {
                            this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                        }
                    } else if (o.a()) {
                        this.logger.a(this.tag, "Refreshing ad from network...");
                    }
                    z3 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            i();
        } else if (z3) {
            loadAd(i.REFRESH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        h();
        if (this.f4569f != null) {
            this.sdk.X().destroyAd(this.f4569f);
        }
        synchronized (this.f4576o) {
            this.f4585x = true;
        }
        this.f4573l.a();
        this.sdk.j().b(this);
        if (this.sdk.R() != null) {
            this.sdk.R().c(this.adUnitId, this.f4566c);
        } else {
            this.sdk.Q().c(this.adUnitId, this.f4566c);
        }
        super.destroy();
    }

    private void h() {
        b3 b3Var;
        MaxAdView maxAdView = this.f4565b;
        if (maxAdView != null) {
            s.a(maxAdView, this.f4567d);
        }
        this.f4575n.b();
        synchronized (this.f4576o) {
            b3Var = this.f4578q;
        }
        MaxAd maxAd = this.f4579r;
        if (maxAd != null && maxAd.equals(b3Var)) {
            if (o.a()) {
                this.logger.a(this.tag, "Collapsing ad manually for removed ad.");
            }
            t2.b(this.j, maxAd);
        }
        if (b3Var != null) {
            this.sdk.X().destroyAd(b3Var);
        }
    }

    private void i() {
        if (o.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f4569f + "...");
        }
        this.j.onAdLoaded(this.f4569f);
        this.f4569f = null;
    }

    public void loadAd(i iVar) {
        if (o.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z3 = this.f4586y || ((Boolean) this.sdk.a(r3.G7)).booleanValue();
        if (z3 && !this.f4573l.g() && this.f4573l.h()) {
            o.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f4573l.b()) + " seconds.");
            return;
        }
        if (!z3) {
            if (o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.j);
        } else if (this.f4569f != null) {
            if (o.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            i();
        } else if (this.f4584w) {
            if (o.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.f4583v.set(true);
        } else {
            if (o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(b3 b3Var) {
        View viewY = b3Var.y();
        String str = viewY == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f4565b;
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
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(b3Var);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                a0.g.y(sb2, this.adListener, oVar, str2);
            }
            t2.a(this.adListener, (MaxAd) b3Var, (MaxError) maxErrorImpl, true);
            this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, b3Var);
            return;
        }
        h();
        a((y2) b3Var);
        if (b3Var.q0()) {
            this.f4575n.a(b3Var);
        }
        maxAdView.setDescendantFocusability(393216);
        if (b3Var.s0() != Long.MAX_VALUE) {
            this.f4567d.setBackgroundColor((int) b3Var.s0());
        } else {
            long j = this.f4568e;
            if (j != Long.MAX_VALUE) {
                this.f4567d.setBackgroundColor((int) j);
            } else {
                this.f4567d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(viewY);
        a(viewY, b3Var);
        this.sdk.y().d(b3Var);
        c(b3Var);
        synchronized (this.f4576o) {
            this.f4578q = b3Var;
        }
        if (o.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.X().processRawAdImpression(b3Var, this.j);
        if (StringUtils.isValidString(this.f4578q.getAdReviewCreativeId())) {
            t2.a(this.adReviewListener, this.f4578q.getAdReviewCreativeId(), (MaxAd) this.f4578q, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new com.applovin.impl.mediation.ads.d(this, b3Var, 0), b3Var.u0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (o.a()) {
            this.logger.a(this.tag, "Loading ad for precache request...");
        }
        a(i.SEQUENTIAL_OR_PRECACHE, this.f4572k);
    }

    private void d() {
        if (b()) {
            if (o.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.f4584w = true;
            this.sdk.q0().a((i5) new r6(this.sdk, "loadMaxAdForPrecacheRequest", new com.applovin.impl.mediation.ads.c(this, 1)), d6.b.MEDIATION);
        }
    }

    private void c(b3 b3Var) {
        int height = this.f4565b.getHeight();
        int width = this.f4565b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = AppLovinSdkUtils.pxToDp(this.f4564a, height);
            int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f4564a, width);
            MaxAdFormat format = b3Var.getFormat();
            int height2 = (this.D ? format.getAdaptiveSize(iPxToDp2, this.f4565b.getContext()) : format.getSize()).getHeight();
            int iMin = Math.min(format.getSize().getWidth(), o0.b(this.f4564a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                StringBuilder sbN = r5.c.n(iPxToDp2, "\n**************************************************\n`MaxAdView` size ", "x", iPxToDp, " dp smaller than required ");
                sbN.append(this.D ? "adaptive " : "");
                sbN.append("size: ");
                sbN.append(iMin);
                sbN.append("x");
                String strJ = r5.c.j(height2, " dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n", sbN);
                if (o.a()) {
                    this.logger.b("AppLovinSdk", strJ);
                }
            }
        }
    }

    private void a(i iVar, a.InterfaceC0014a interfaceC0014a) {
        if (a()) {
            boolean zC = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToLoadDestroyedAdView", CollectionUtils.hashMap("details", "debug=" + zC));
            if (!zC) {
                o.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            } else {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        AppLovinSdkUtils.runOnUiThread(true, new b5.e(this, interfaceC0014a, iVar, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a.InterfaceC0014a interfaceC0014a, i iVar) {
        int adaptiveWidth;
        b3 b3Var = this.f4578q;
        if (b3Var != null) {
            long jA = this.f4574m.a(b3Var);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f4578q.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(jA));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f4565b.getContext(), this.f4565b.getWidth());
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f4565b.getContext(), this.f4565b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(iPxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(iPxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f4573l.g() || this.f4582u));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f4587z));
        MaxAdViewConfiguration maxAdViewConfiguration = this.f4571i;
        if (maxAdViewConfiguration != null && (adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth()) > 0 && iPxToDp != adaptiveWidth) {
            o.j(this.tag, r5.c.i(adaptiveWidth, "The requested adaptive ad view width (", " dp) is different from the MaxAdView width (", iPxToDp, " dp)."));
        }
        if (o.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0014a + "...");
        }
        this.sdk.X().loadAd(this.adUnitId, this.f4566c, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, this.f4564a, interfaceC0014a);
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (o.a()) {
                a0.g.x("Updated allow immediate auto-refresh pause and ad load to: ", str2, this.logger, this.tag);
            }
            this.f4586y = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (o.a()) {
                a0.g.x("Updated disable auto-retries to: ", str2, this.logger, this.tag);
            }
            this.f4587z = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (o.a()) {
                a0.g.x("Updated precached disabled to: ", str2, this.logger, this.tag);
            }
            this.A = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (o.a()) {
                a0.g.x("Updated should stop auto-refresh on ad expand to: ", str2, this.logger, this.tag);
            }
            this.B = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (o.a()) {
                a0.g.x("Updated force precache to: ", str2, this.logger, this.tag);
            }
            this.C = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (o.a()) {
                a0.g.x("Updated is adaptive banner to: ", str2, this.logger, this.tag);
            }
            if (this.f4571i == null) {
                o.h(this.tag, "You configured adaptive banners incorrectly by setting extra parameters to the MaxAdView! Please configure adaptive banners via MaxAdViewConfiguration instead. Learn more: https://support.axon.ai/en/max/android/ad-formats/banner-and-mrec-ads#adaptive-banners");
            }
            this.D = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MaxAd maxAd) {
        boolean zCompareAndSet;
        this.f4584w = false;
        synchronized (this.f4577p) {
            try {
                zCompareAndSet = this.f4583v.compareAndSet(true, false);
                if (!zCompareAndSet) {
                    if (o.a()) {
                        this.logger.a(this.tag, "Saving precache ad...");
                    }
                    b3 b3Var = (b3) maxAd;
                    this.f4569f = b3Var;
                    b3Var.g(this.g);
                    this.f4569f.f(this.f4570h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zCompareAndSet) {
            if (o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.j.onAdLoaded(maxAd);
        }
    }

    private boolean b() {
        if (this.A) {
            return false;
        }
        return ((Boolean) this.sdk.a(r3.N7)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b3 b3Var) {
        long jA = this.f4574m.a(b3Var);
        if (!b3Var.q0()) {
            a(b3Var, jA);
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
        if (this.sdk.c(r3.A7).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.O();
            if (o.a()) {
                this.sdk.O().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f4582u && !this.f4573l.g()) {
            this.f4581t = true;
            this.f4584w = false;
            long jLongValue = ((Long) this.sdk.a(r3.f5251z7)).longValue();
            if (jLongValue >= 0) {
                this.sdk.O();
                if (o.a()) {
                    o oVarO = this.sdk.O();
                    String str = this.tag;
                    StringBuilder sbY = h.y(jLongValue, "Scheduling failed banner ad refresh ", " milliseconds from now for '");
                    sbY.append(this.adUnitId);
                    sbY.append("'...");
                    oVarO.a(str, sbY.toString());
                }
                this.f4573l.a(jLongValue);
                return;
            }
            return;
        }
        if (this.f4584w) {
            if (o.a()) {
                this.logger.a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.f4584w = false;
        }
        if (this.f4583v.get()) {
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(this.adUnitId);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                a0.g.y(sb2, this.adListener, oVar, str2);
            }
            t2.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(View view, b3 b3Var) {
        int iV0 = b3Var.v0();
        int iT0 = b3Var.t0();
        int iDpToPx = iV0 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), iV0);
        int iDpToPx2 = iT0 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), iT0) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (o.a()) {
                this.logger.a(this.tag, r5.c.i(iDpToPx, "Pinning ad view to MAX ad view with width: ", " and height: ", iDpToPx2, "."));
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i4 : e8.a(this.f4565b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i4);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void a(b3 b3Var, long j) {
        if (o.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.X().processViewabilityAdImpressionPostback(b3Var, j, this.j);
    }

    private void a(long j) {
        if (n7.a(j, ((Long) this.sdk.a(r3.M7)).longValue()) && !this.C) {
            if (o.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j) + ", undesired: " + Long.toBinaryString(j));
            }
            if (o.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f4581t = true;
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.f4581t = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f4584w = false;
        if (this.f4583v.compareAndSet(true, false)) {
            if (o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.j.onAdLoaded(maxAd);
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "Saving precache ad...");
        }
        b3 b3Var = (b3) maxAd;
        this.f4569f = b3Var;
        b3Var.g(this.g);
        this.f4569f.f(this.f4570h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        boolean z3;
        synchronized (this.f4576o) {
            z3 = this.f4585x;
        }
        return z3;
    }
}
