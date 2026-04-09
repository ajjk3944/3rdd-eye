package com.yandex.mobile.ads.instream.inroll;

import android.content.Context;
import com.yandex.mobile.ads.impl.et;
import com.yandex.mobile.ads.impl.jt0;
import com.yandex.mobile.ads.impl.rl2;
import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.vk0;
import com.yandex.mobile.ads.impl.xs;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class InrollQueueProvider {

    /* renamed from: a, reason: collision with root package name */
    private final vk0 f36816a;

    /* renamed from: b, reason: collision with root package name */
    private final jt0<Inroll> f36817b;

    public InrollQueueProvider(Context context, InstreamAd instreamAd) {
        l.f(context, "context");
        l.f(instreamAd, "instreamAd");
        rm2 rm2Var = new rm2(context);
        xs xsVarA = et.a(instreamAd);
        this.f36816a = new vk0();
        this.f36817b = new jt0<>(context, rm2Var, xsVarA);
    }

    public final InstreamAdBreakQueue<Inroll> getQueue() {
        return new rl2(this.f36817b.a(this.f36816a, InstreamAdBreakType.INROLL));
    }
}
