package i2;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import w2.InterfaceC2973e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2973e f20549a;

    /* renamed from: b, reason: collision with root package name */
    public final h2.f f20550b;

    /* renamed from: c, reason: collision with root package name */
    public final h2.a f20551c;

    /* renamed from: d, reason: collision with root package name */
    public w2.h f20552d;

    /* renamed from: e, reason: collision with root package name */
    public PAGAppOpenAd f20553e;

    public c(InterfaceC2973e interfaceC2973e, h2.c cVar, h2.f fVar, h2.a aVar) {
        this.f20549a = interfaceC2973e;
        this.f20550b = fVar;
        this.f20551c = aVar;
    }

    public final void a(Context context) {
        this.f20553e.setAdInteractionListener(new d4.h(4, this));
        if (context instanceof Activity) {
            this.f20553e.show((Activity) context);
        } else {
            this.f20553e.show(null);
        }
    }
}
