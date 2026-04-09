package com.yandex.mobile.ads.instream.pauseroll;

import android.content.Context;
import com.yandex.mobile.ads.impl.et;
import com.yandex.mobile.ads.impl.jt0;
import com.yandex.mobile.ads.impl.kg1;
import com.yandex.mobile.ads.impl.rl2;
import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.xs;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class PauserollQueueProvider {

    /* renamed from: a, reason: collision with root package name */
    private final kg1 f36821a;

    /* renamed from: b, reason: collision with root package name */
    private final jt0<Pauseroll> f36822b;

    public PauserollQueueProvider(Context context, InstreamAd instreamAd) {
        l.f(context, "context");
        l.f(instreamAd, "instreamAd");
        rm2 rm2Var = new rm2(context);
        xs xsVarA = et.a(instreamAd);
        this.f36821a = new kg1();
        this.f36822b = new jt0<>(context, rm2Var, xsVarA);
    }

    public final InstreamAdBreakQueue<Pauseroll> getQueue() {
        return new rl2(this.f36822b.a(this.f36821a, InstreamAdBreakType.PAUSEROLL));
    }
}
