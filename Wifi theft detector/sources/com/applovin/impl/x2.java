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
public class x2 extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a, reason: collision with root package name */
    private final int f8408a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxNativeAdLoader f8409b;

    /* renamed from: c, reason: collision with root package name */
    private final Queue f8410c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f8411d = false;

    /* renamed from: e, reason: collision with root package name */
    private final Object f8412e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private a f8413f;

    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public x2(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f8408a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f8413f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f8409b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, i.NATIVE_AD_PLACER);
    }

    public void a(MaxAd maxAd) {
        this.f8409b.destroy(maxAd);
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f8412e) {
            maxAd = null;
            while (!this.f8410c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                try {
                    maxAd = (MaxAd) this.f8410c.remove();
                } catch (Throwable th) {
                    throw th;
                }
            }
            e();
        }
        return maxAd;
    }

    public void c() {
        this.f8413f = null;
        a();
        this.f8409b.destroy();
    }

    public boolean d() {
        boolean z10;
        synchronized (this.f8412e) {
            z10 = !this.f8410c.isEmpty();
        }
        return z10;
    }

    public void e() {
        synchronized (this.f8412e) {
            try {
                if (!this.f8411d && this.f8410c.size() < this.f8408a) {
                    this.f8411d = true;
                    this.f8409b.loadAd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f8413f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f8413f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f8413f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f8412e) {
            this.f8410c.add(maxAd);
            this.f8411d = false;
            e();
        }
        a aVar = this.f8413f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public void a() {
        synchronized (this.f8412e) {
            try {
                Iterator it = this.f8410c.iterator();
                while (it.hasNext()) {
                    a((MaxAd) it.next());
                }
                this.f8410c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f8409b.render(maxNativeAdView, maxAd);
    }
}
