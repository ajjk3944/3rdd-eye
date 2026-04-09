package aa;

import android.app.Activity;
import android.content.Context;
import bb.p;
import bb.q;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements p {

    /* renamed from: a, reason: collision with root package name */
    public final bb.e f276a;

    /* renamed from: b, reason: collision with root package name */
    public final z9.e f277b;

    /* renamed from: c, reason: collision with root package name */
    public final z9.a f278c;

    /* renamed from: d, reason: collision with root package name */
    public q f279d;

    /* renamed from: e, reason: collision with root package name */
    public PAGInterstitialAd f280e;

    public h(bb.e eVar, z9.c cVar, z9.e eVar2, z9.a aVar) {
        this.f276a = eVar;
        this.f277b = eVar2;
        this.f278c = aVar;
    }

    @Override // bb.p
    public final void showAd(Context context) {
        this.f280e.setAdInteractionListener(new o7.c(2, this));
        if (context instanceof Activity) {
            this.f280e.show((Activity) context);
        } else {
            this.f280e.show(null);
        }
    }
}
