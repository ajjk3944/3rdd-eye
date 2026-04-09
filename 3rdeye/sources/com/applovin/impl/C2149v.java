package com.applovin.impl;

import android.content.Context;
import com.amazon.aps.ads.Aps;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2149v implements DTBAdCallback {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdFormat f21556a;

    /* renamed from: b, reason: collision with root package name */
    private final a f21557b;

    /* renamed from: c, reason: collision with root package name */
    private DTBAdRequest f21558c;

    /* renamed from: com.applovin.impl.v$a */
    public interface a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public C2149v(C2151w c2151w, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this(Arrays.asList(c2151w.a()), maxAdFormat, context, aVar);
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.f21558c;
        if (dTBAdRequest == null) {
            this.f21557b.onAdLoadFailed(null, this.f21556a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.f21557b.onAdLoadFailed(adError, this.f21556a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f21557b.onAdResponseLoaded(dTBAdResponse, this.f21556a);
    }

    public C2149v(List list, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this.f21556a = maxAdFormat;
        this.f21557b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i = 0; i < list.size(); i++) {
                Object obj = list.get(i);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i] = (DTBAdSize) obj;
                }
            }
            if (a7.a(Aps.getSdkVersion(), "10.0.0") >= 0) {
                Class<?> cls = Class.forName("com.amazon.aps.ads.model.ApsAdNetwork");
                Class<?> cls2 = Class.forName("com.amazon.device.ads.DTBAdNetworkInfo");
                this.f21558c = (DTBAdRequest) DTBAdRequest.class.getConstructor(Context.class, cls2).newInstance(context.getApplicationContext(), cls2.getConstructor(cls).newInstance(cls.getField("MAX").get(null)));
            } else {
                this.f21558c = (DTBAdRequest) DTBAdRequest.class.getConstructor(null).newInstance(null);
            }
            this.f21558c.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }
}
