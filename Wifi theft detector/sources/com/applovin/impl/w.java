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

/* loaded from: classes.dex */
public class w implements DTBAdCallback {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdFormat f8305a;

    /* renamed from: b, reason: collision with root package name */
    private final a f8306b;

    /* renamed from: c, reason: collision with root package name */
    private DTBAdRequest f8307c;

    public interface a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public w(x xVar, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this(Arrays.asList(xVar.a()), maxAdFormat, context, aVar);
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.f8307c;
        if (dTBAdRequest == null) {
            this.f8306b.onAdLoadFailed(null, this.f8305a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.f8306b.onAdLoadFailed(adError, this.f8305a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f8306b.onAdResponseLoaded(dTBAdResponse, this.f8305a);
    }

    public w(List list, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this.f8305a = maxAdFormat;
        this.f8306b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i10] = (DTBAdSize) obj;
                }
            }
            if (n7.a(Aps.getSdkVersion(), "10.0.0") >= 0) {
                Class<?> cls = Class.forName("com.amazon.aps.ads.model.ApsAdNetwork");
                Class<?> cls2 = Class.forName("com.amazon.device.ads.DTBAdNetworkInfo");
                this.f8307c = (DTBAdRequest) DTBAdRequest.class.getConstructor(Context.class, cls2).newInstance(context.getApplicationContext(), cls2.getConstructor(cls).newInstance(cls.getField("MAX").get(null)));
            } else {
                this.f8307c = (DTBAdRequest) DTBAdRequest.class.getConstructor(null).newInstance(null);
            }
            this.f8307c.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }
}
