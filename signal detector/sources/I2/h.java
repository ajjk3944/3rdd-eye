package i2;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import w2.InterfaceC2973e;
import w2.n;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2973e f20566a;

    /* renamed from: b, reason: collision with root package name */
    public final h2.f f20567b;

    /* renamed from: c, reason: collision with root package name */
    public final h2.a f20568c;

    /* renamed from: d, reason: collision with root package name */
    public n f20569d;

    /* renamed from: e, reason: collision with root package name */
    public PAGInterstitialAd f20570e;

    public h(InterfaceC2973e interfaceC2973e, h2.c cVar, h2.f fVar, h2.a aVar) {
        this.f20566a = interfaceC2973e;
        this.f20567b = fVar;
        this.f20568c = aVar;
    }

    public final void a(Context context) {
        this.f20570e.setAdInteractionListener(new h2.d(this));
        if (context instanceof Activity) {
            this.f20570e.show((Activity) context);
        } else {
            this.f20570e.show(null);
        }
    }
}
