package h7;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* loaded from: classes3.dex */
public class d extends b {

    /* renamed from: b, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.f f21426b;

    /* renamed from: c, reason: collision with root package name */
    public final c f21427c;

    /* renamed from: d, reason: collision with root package name */
    public final AdListener f21428d = new a();

    public class a extends AdListener {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
        public void onAdClicked() {
            super.onAdClicked();
            d.this.f21426b.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            d.this.f21426b.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            d.this.f21427c.d();
            d.this.f21426b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
            d.this.f21426b.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            d.this.f21426b.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            d.this.f21426b.onAdOpened();
        }
    }

    public d(com.unity3d.scar.adapter.common.f fVar, c cVar) {
        this.f21426b = fVar;
        this.f21427c = cVar;
    }

    public AdListener d() {
        return this.f21428d;
    }
}
