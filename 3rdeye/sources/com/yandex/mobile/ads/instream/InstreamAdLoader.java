package com.yandex.mobile.ads.instream;

import android.content.Context;
import com.yandex.mobile.ads.impl.cl1;
import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.sl0;
import com.yandex.mobile.ads.impl.tl2;
import com.yandex.mobile.ads.impl.xl2;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class InstreamAdLoader extends cl1 {

    /* renamed from: a, reason: collision with root package name */
    private final sl0 f36806a;

    public InstreamAdLoader(Context context) {
        l.f(context, "context");
        this.f36806a = new sl0(context, new rm2(context));
    }

    public final void loadInstreamAd(Context context, InstreamAdRequestConfiguration configuration) {
        l.f(context, "context");
        l.f(configuration, "configuration");
        this.f36806a.a(new xl2(configuration));
    }

    public final void setInstreamAdLoadListener(InstreamAdLoadListener instreamAdLoadListener) {
        this.f36806a.a(instreamAdLoadListener != null ? new tl2(instreamAdLoadListener) : null);
    }
}
