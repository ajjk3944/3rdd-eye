package com.yandex.mobile.ads.banner;

import com.yandex.mobile.ads.impl.ts;
import com.yandex.mobile.ads.impl.vy1;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class a {
    public static final ts a(BannerAdSize adSize) {
        l.f(adSize, "adSize");
        vy1 vy1VarA = adSize.a();
        l.e(vy1VarA, "getSizeInfo(...)");
        return new ts(vy1VarA);
    }
}
