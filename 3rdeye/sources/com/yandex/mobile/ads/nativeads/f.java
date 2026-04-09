package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.impl.h7;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.iq1;
import com.yandex.mobile.ads.impl.n61;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final iq1 f36865a;

    /* renamed from: b, reason: collision with root package name */
    private final n61 f36866b;

    public f(iq1 requestedAdThemeFactory, n61 adRequestReadyResponseProvider) {
        l.f(requestedAdThemeFactory, "requestedAdThemeFactory");
        l.f(adRequestReadyResponseProvider, "adRequestReadyResponseProvider");
        this.f36865a = requestedAdThemeFactory;
        this.f36866b = adRequestReadyResponseProvider;
    }

    public final h7 a(NativeAdRequestConfiguration nativeAdConfiguration) {
        hq1 hq1VarA;
        l.f(nativeAdConfiguration, "nativeAdConfiguration");
        AdTheme preferredTheme = nativeAdConfiguration.getPreferredTheme();
        if (preferredTheme != null) {
            this.f36865a.getClass();
            hq1VarA = iq1.a(preferredTheme);
        } else {
            hq1VarA = null;
        }
        this.f36866b.getClass();
        return new h7.a(nativeAdConfiguration.getAdUnitId()).a(nativeAdConfiguration.getAge()).d(nativeAdConfiguration.getBiddingData()).c(nativeAdConfiguration.getGender()).b(nativeAdConfiguration.getContextQuery()).a(nativeAdConfiguration.getContextTags()).a(nativeAdConfiguration.getLocation()).a(nativeAdConfiguration.getParameters()).a(hq1VarA).a(nativeAdConfiguration.getShouldLoadImagesAutomatically()).b().a();
    }

    public /* synthetic */ f() {
        this(new iq1(), new n61());
    }
}
