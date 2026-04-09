package aa;

import android.app.Activity;
import android.content.Context;
import bb.w;
import bb.x;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n implements w {

    /* renamed from: a, reason: collision with root package name */
    public final bb.e f292a;

    /* renamed from: b, reason: collision with root package name */
    public final z9.e f293b;

    /* renamed from: c, reason: collision with root package name */
    public final z9.a f294c;

    /* renamed from: d, reason: collision with root package name */
    public x f295d;

    /* renamed from: e, reason: collision with root package name */
    public PAGRewardedAd f296e;

    public n(bb.e eVar, z9.c cVar, z9.e eVar2, z9.a aVar) {
        this.f292a = eVar;
        this.f293b = eVar2;
        this.f294c = aVar;
    }

    @Override // bb.w
    public final void showAd(Context context) {
        this.f296e.setAdInteractionListener(new p6.i(this));
        if (context instanceof Activity) {
            this.f296e.show((Activity) context);
        } else {
            this.f296e.show(null);
        }
    }
}
