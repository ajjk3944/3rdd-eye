package o3;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends UnifiedNativeAdMapper {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f23614a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f23615b;

    /* renamed from: c, reason: collision with root package name */
    public final n3.c f23616c;

    /* renamed from: d, reason: collision with root package name */
    public final n3.a f23617d;

    /* renamed from: e, reason: collision with root package name */
    public MediationNativeAdCallback f23618e;

    /* renamed from: f, reason: collision with root package name */
    public PAGNativeAd f23619f;

    public class a implements a.InterfaceC0193a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f23620a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationNativeAdConfiguration f23621b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f23622c;

        /* renamed from: o3.d$a$a, reason: collision with other inner class name */
        public class C0445a implements PAGNativeAdLoadListener {
            public C0445a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGNativeAd pAGNativeAd) {
                d.this.h(pAGNativeAd);
                d dVar = d.this;
                dVar.f23618e = (MediationNativeAdCallback) dVar.f23614a.onSuccess(d.this);
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.uym
            public void onError(int i10, String str) {
                AdError adErrorC = PangleConstants.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                d.this.f23614a.onFailure(adErrorC);
            }
        }

        public a(String str, MediationNativeAdConfiguration mediationNativeAdConfiguration, String str2) {
            this.f23620a = str;
            this.f23621b = mediationNativeAdConfiguration;
            this.f23622c = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0193a
        public void a(AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            d.this.f23614a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0193a
        public void onInitializeSuccess() {
            PAGNativeRequest pAGNativeRequestE = d.this.f23617d.e();
            pAGNativeRequestE.setAdString(this.f23620a);
            n3.b.a(pAGNativeRequestE, this.f23620a, this.f23621b);
            d.this.f23616c.h(this.f23622c, pAGNativeRequestE, new C0445a());
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.f23619f.showPrivacyActivity();
        }
    }

    /* renamed from: o3.d$d, reason: collision with other inner class name */
    public class C0446d extends NativeAd.Image {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable f23627a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f23628b;

        /* renamed from: c, reason: collision with root package name */
        public final double f23629c;

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f23627a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.f23629c;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f23628b;
        }

        public C0446d(Drawable drawable, Uri uri, double d10) {
            this.f23627a = drawable;
            this.f23628b = uri;
            this.f23629c = d10;
        }
    }

    public d(MediationAdLoadCallback mediationAdLoadCallback, com.google.ads.mediation.pangle.a aVar, n3.c cVar, n3.a aVar2) {
        this.f23614a = mediationAdLoadCallback;
        this.f23615b = aVar;
        this.f23616c = cVar;
        this.f23617d = aVar2;
    }

    public final void h(PAGNativeAd pAGNativeAd) {
        this.f23619f = pAGNativeAd;
        PAGNativeAdData nativeAdData = pAGNativeAd.getNativeAdData();
        setHeadline(nativeAdData.getTitle());
        setBody(nativeAdData.getDescription());
        setCallToAction(nativeAdData.getButtonText());
        if (nativeAdData.getIcon() != null) {
            setIcon(new C0446d(null, Uri.parse(nativeAdData.getIcon().getImageUrl()), 1.0d));
        }
        setOverrideClickHandling(true);
        setMediaView(nativeAdData.getMediaView());
        setAdChoicesContent(nativeAdData.getAdLogoView());
    }

    public void i(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = PangleConstants.a(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f23614a.onFailure(adErrorA);
        } else {
            String bidResponse = mediationNativeAdConfiguration.getBidResponse();
            this.f23615b.b(mediationNativeAdConfiguration.getContext(), serverParameters.getString("appid"), new a(bidResponse, mediationNativeAdConfiguration, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map map, Map map2) {
        HashMap map3 = new HashMap(map);
        map3.remove("3011");
        map3.remove("3012");
        View view2 = (View) map3.get("3002");
        ArrayList arrayList = new ArrayList();
        if (view2 != null) {
            arrayList.add(view2);
        }
        this.f23619f.registerViewForInteraction((ViewGroup) view, new ArrayList(map3.values()), arrayList, (View) null, new b());
        getAdChoicesContent().setOnClickListener(new c());
    }

    public class b implements PAGNativeAdInteractionListener {
        public b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (d.this.f23618e != null) {
                d.this.f23618e.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (d.this.f23618e != null) {
                d.this.f23618e.reportAdImpression();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
        }
    }
}
