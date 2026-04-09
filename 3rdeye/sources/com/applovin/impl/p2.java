package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
public class p2 extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a, reason: collision with root package name */
    private final int f20655a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxNativeAdLoader f20656b;

    /* renamed from: c, reason: collision with root package name */
    private final Queue f20657c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f20658d = false;

    /* renamed from: e, reason: collision with root package name */
    private final Object f20659e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private a f20660f;

    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public p2(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f20655a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f20660f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f20656b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, EnumC2121h.NATIVE_AD_PLACER);
    }

    public void a(MaxAd maxAd) {
        this.f20656b.destroy(maxAd);
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f20659e) {
            maxAd = null;
            while (!this.f20657c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                try {
                    maxAd = (MaxAd) this.f20657c.remove();
                } catch (Throwable th) {
                    throw th;
                }
            }
            e();
        }
        return maxAd;
    }

    public void c() {
        this.f20660f = null;
        a();
        this.f20656b.destroy();
    }

    public boolean d() {
        boolean z10;
        synchronized (this.f20659e) {
            z10 = !this.f20657c.isEmpty();
        }
        return z10;
    }

    public void e() {
        synchronized (this.f20659e) {
            try {
                if (!this.f20658d && this.f20657c.size() < this.f20655a) {
                    this.f20658d = true;
                    this.f20656b.loadAd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f20660f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f20660f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f20660f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f20659e) {
            this.f20657c.add(maxAd);
            this.f20658d = false;
            e();
        }
        a aVar = this.f20660f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public void a() {
        synchronized (this.f20659e) {
            try {
                Iterator it = this.f20657c.iterator();
                while (it.hasNext()) {
                    a((MaxAd) it.next());
                }
                this.f20657c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f20656b.render(maxNativeAdView, maxAd);
    }
}
