package aa;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements bb.h {

    /* renamed from: a, reason: collision with root package name */
    public final bb.e f259a;

    /* renamed from: b, reason: collision with root package name */
    public final z9.e f260b;

    /* renamed from: c, reason: collision with root package name */
    public final z9.a f261c;

    /* renamed from: d, reason: collision with root package name */
    public bb.i f262d;

    /* renamed from: e, reason: collision with root package name */
    public PAGAppOpenAd f263e;

    public c(bb.e eVar, z9.c cVar, z9.e eVar2, z9.a aVar) {
        this.f259a = eVar;
        this.f260b = eVar2;
        this.f261c = aVar;
    }

    @Override // bb.h
    public final void showAd(Context context) {
        this.f263e.setAdInteractionListener(new jf.c(2, this));
        if (context instanceof Activity) {
            this.f263e.show((Activity) context);
        } else {
            this.f263e.show(null);
        }
    }
}
