package i2;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import w2.InterfaceC2973e;

/* loaded from: classes.dex */
public final class f implements PAGBannerAdInteractionListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2973e f20560a;

    /* renamed from: b, reason: collision with root package name */
    public final h2.f f20561b;

    /* renamed from: c, reason: collision with root package name */
    public final h2.a f20562c;

    /* renamed from: d, reason: collision with root package name */
    public w2.j f20563d;

    /* renamed from: e, reason: collision with root package name */
    public FrameLayout f20564e;

    public f(InterfaceC2973e interfaceC2973e, h2.c cVar, h2.f fVar, h2.a aVar) {
        this.f20560a = interfaceC2973e;
        this.f20561b = fVar;
        this.f20562c = aVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        w2.j jVar = this.f20563d;
        if (jVar != null) {
            jVar.e();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        w2.j jVar = this.f20563d;
        if (jVar != null) {
            jVar.d();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
    }
}
