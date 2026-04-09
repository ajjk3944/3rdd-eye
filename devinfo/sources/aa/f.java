package aa;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements bb.k, PAGBannerAdInteractionListener {

    /* renamed from: a, reason: collision with root package name */
    public final bb.e f270a;

    /* renamed from: b, reason: collision with root package name */
    public final z9.e f271b;

    /* renamed from: c, reason: collision with root package name */
    public final z9.a f272c;

    /* renamed from: d, reason: collision with root package name */
    public bb.l f273d;

    /* renamed from: e, reason: collision with root package name */
    public FrameLayout f274e;

    public f(bb.e eVar, z9.c cVar, z9.e eVar2, z9.a aVar) {
        this.f270a = eVar;
        this.f271b = eVar2;
        this.f272c = aVar;
    }

    @Override // bb.k
    public final FrameLayout getView() {
        return this.f274e;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        bb.l lVar = this.f273d;
        if (lVar != null) {
            lVar.h();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        bb.l lVar = this.f273d;
        if (lVar != null) {
            lVar.g();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
    }
}
