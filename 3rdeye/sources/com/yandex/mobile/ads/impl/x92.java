package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public final class x92 implements xp1<m92> {

    /* renamed from: a, reason: collision with root package name */
    private final xp1<List<za2>> f35226a;

    /* renamed from: b, reason: collision with root package name */
    private final da2 f35227b;

    public x92(Context context, vu1 sdkEnvironmentModule, r92 adsRequestListener, da2 verificationResourcesLoader) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adsRequestListener, "adsRequestListener");
        kotlin.jvm.internal.l.f(verificationResourcesLoader, "verificationResourcesLoader");
        this.f35226a = adsRequestListener;
        this.f35227b = verificationResourcesLoader;
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(fb2 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f35226a.a(error);
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(m92 result) {
        kotlin.jvm.internal.l.f(result, "result");
        final List<za2> listB = result.b().b();
        this.f35227b.a(listB, new pa2() { // from class: com.yandex.mobile.ads.impl.X3
            @Override // com.yandex.mobile.ads.impl.pa2
            public final void a() {
                x92.a(this.f24313a, listB);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(x92 this$0, List videoAds) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(videoAds, "$videoAds");
        this$0.f35226a.a((xp1<List<za2>>) videoAds);
    }
}
