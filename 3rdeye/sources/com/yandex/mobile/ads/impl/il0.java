package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.u92;

/* loaded from: classes3.dex */
public final class il0 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f28732a;

    /* renamed from: b, reason: collision with root package name */
    private final sb2 f28733b;

    public il0(vu1 sdkEnvironmentModule, sb2 videoAdLoader) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(videoAdLoader, "videoAdLoader");
        this.f28732a = sdkEnvironmentModule;
        this.f28733b = videoAdLoader;
    }

    public final void a(Context context, C4078b2 adBreak, xp1 requestListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        vu1 vu1Var = this.f28732a;
        r92 r92Var = new r92(context, vu1Var, adBreak, requestListener, new un0(context, vu1Var));
        u92 u92Var = new u92(new u92.a(adBreak).c(), 0);
        this.f28733b.a(u92Var, new sn0(u92Var), r92Var);
    }
}
