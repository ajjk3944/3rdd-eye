package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public final class dk2 implements xp1<List<? extends za2>> {

    /* renamed from: a, reason: collision with root package name */
    private final xp1<List<za2>> f26218a;

    /* renamed from: b, reason: collision with root package name */
    private final ek2 f26219b;

    public dk2(Context context, za2 wrapperAd, xp1<List<za2>> requestListener, ek2 wrapperAdResponseConfigurator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(wrapperAd, "wrapperAd");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        kotlin.jvm.internal.l.f(wrapperAdResponseConfigurator, "wrapperAdResponseConfigurator");
        this.f26218a = requestListener;
        this.f26219b = wrapperAdResponseConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(fb2 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f26218a.a(error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(List<? extends za2> list) {
        List<? extends za2> response = list;
        kotlin.jvm.internal.l.f(response, "response");
        this.f26218a.a((xp1<List<za2>>) this.f26219b.a(response));
    }
}
