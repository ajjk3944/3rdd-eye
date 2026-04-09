package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public final class r92 implements xp1<List<? extends za2>> {

    /* renamed from: a, reason: collision with root package name */
    private final C4078b2 f32566a;

    /* renamed from: b, reason: collision with root package name */
    private final xp1<zs> f32567b;

    /* renamed from: c, reason: collision with root package name */
    private final un0 f32568c;

    public r92(Context context, vu1 sdkEnvironmentModule, C4078b2 adBreak, xp1<zs> instreamAdBreakRequestListener, un0 instreamVideoAdBreakCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(instreamAdBreakRequestListener, "instreamAdBreakRequestListener");
        kotlin.jvm.internal.l.f(instreamVideoAdBreakCreator, "instreamVideoAdBreakCreator");
        this.f32566a = adBreak;
        this.f32567b = instreamAdBreakRequestListener;
        this.f32568c = instreamVideoAdBreakCreator;
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(fb2 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f32567b.a(error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(List<? extends za2> list) {
        List<? extends za2> result = list;
        kotlin.jvm.internal.l.f(result, "result");
        zs zsVarA = this.f32568c.a(this.f32566a, result);
        if (zsVarA != null) {
            this.f32567b.a((xp1<zs>) zsVarA);
        } else {
            this.f32567b.a(new fb2(1, "Failed to parse ad break"));
        }
    }
}
