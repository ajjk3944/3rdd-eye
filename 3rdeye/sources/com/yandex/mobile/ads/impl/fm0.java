package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ll0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class fm0 implements xp1<xh2>, ll0.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f27383a;

    /* renamed from: b, reason: collision with root package name */
    private final ll0 f27384b;

    /* renamed from: c, reason: collision with root package name */
    private final n40 f27385c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f27386d;

    public interface a {
        void a(xs xsVar);

        void a(String str);
    }

    public /* synthetic */ fm0(Context context, vu1 vu1Var, sb2 sb2Var, hm0 hm0Var) {
        this(context, vu1Var, sb2Var, hm0Var, new ll0(vu1Var, sb2Var), new n40());
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(fb2 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f27383a.a(error.a());
    }

    @Override // com.yandex.mobile.ads.impl.ll0.a
    public final void a(ArrayList adBreaks) {
        kotlin.jvm.internal.l.f(adBreaks, "adBreaks");
        this.f27385c.getClass();
        ArrayList arrayListA = n40.a(adBreaks);
        if (!arrayListA.isEmpty()) {
            this.f27383a.a(new xs(arrayListA));
        } else {
            this.f27383a.a("Received response with no ad breaks");
        }
    }

    public fm0(Context context, vu1 sdkEnvironmentModule, sb2 videoAdLoader, hm0 instreamAdLoadListener, ll0 adBreaksLoadingManager, n40 duplicatedInstreamAdBreaksFilter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(videoAdLoader, "videoAdLoader");
        kotlin.jvm.internal.l.f(instreamAdLoadListener, "instreamAdLoadListener");
        kotlin.jvm.internal.l.f(adBreaksLoadingManager, "adBreaksLoadingManager");
        kotlin.jvm.internal.l.f(duplicatedInstreamAdBreaksFilter, "duplicatedInstreamAdBreaksFilter");
        this.f27383a = instreamAdLoadListener;
        this.f27384b = adBreaksLoadingManager;
        this.f27385c = duplicatedInstreamAdBreaksFilter;
        this.f27386d = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(xh2 xh2Var) {
        xh2 vmap = xh2Var;
        kotlin.jvm.internal.l.f(vmap, "vmap");
        List<C4078b2> listA = vmap.a();
        ArrayList arrayList = new ArrayList();
        for (C4078b2 c4078b2 : listA) {
            if (c4078b2.d().contains("linear")) {
                arrayList.add(c4078b2);
            }
        }
        if (!arrayList.isEmpty()) {
            ll0 ll0Var = this.f27384b;
            Context context = this.f27386d;
            kotlin.jvm.internal.l.e(context, "context");
            ll0Var.a(context, arrayList, this);
            return;
        }
        this.f27383a.a("Received response with no ad breaks");
    }
}
