package i2;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import w2.InterfaceC2973e;
import w2.t;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2973e f20580a;

    /* renamed from: b, reason: collision with root package name */
    public final h2.f f20581b;

    /* renamed from: c, reason: collision with root package name */
    public final h2.a f20582c;

    /* renamed from: d, reason: collision with root package name */
    public t f20583d;

    /* renamed from: e, reason: collision with root package name */
    public PAGRewardedAd f20584e;

    public m(InterfaceC2973e interfaceC2973e, h2.c cVar, h2.f fVar, h2.a aVar) {
        this.f20580a = interfaceC2973e;
        this.f20581b = fVar;
        this.f20582c = aVar;
    }

    public final void a(Context context) {
        this.f20584e.setAdInteractionListener(new d4.h(5, this));
        if (context instanceof Activity) {
            this.f20584e.show((Activity) context);
        } else {
            this.f20584e.show(null);
        }
    }
}
