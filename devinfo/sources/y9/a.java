package y9;

import android.util.Log;
import android.widget.FrameLayout;
import bb.k;
import bb.l;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import j6.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements k, AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final bb.e f37364a;

    /* renamed from: b, reason: collision with root package name */
    public AdView f37365b;

    /* renamed from: c, reason: collision with root package name */
    public FrameLayout f37366c;

    /* renamed from: d, reason: collision with root package name */
    public l f37367d;

    public a(bb.e eVar, i iVar) {
        this.f37364a = eVar;
    }

    @Override // bb.k
    public final FrameLayout getView() {
        return this.f37366c;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        l lVar = this.f37367d;
        if (lVar != null) {
            lVar.h();
            this.f37367d.e();
            this.f37367d.a();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.f37367d = (l) this.f37364a.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        pa.a adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.f31512b);
        this.f37364a.i(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        l lVar = this.f37367d;
        if (lVar != null) {
            lVar.g();
        }
    }
}
