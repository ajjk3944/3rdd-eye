package com.yandex.mobile.ads.impl;

import c9.C2100u;
import com.yandex.mobile.ads.feed.FeedAdAppearance;
import com.yandex.mobile.ads.feed.FeedAdRequestConfiguration;
import com.yandex.mobile.ads.impl.h7;
import d9.C4285c;
import java.util.Map;

/* loaded from: classes3.dex */
public final class z80 {

    /* renamed from: a, reason: collision with root package name */
    private final t80 f36237a;

    public /* synthetic */ z80() {
        this(new t80());
    }

    public final h7 a(FeedAdRequestConfiguration feedAdRequestConfiguration, FeedAdAppearance feedAdAppearance) {
        Map mapC;
        if (feedAdAppearance != null) {
            this.f36237a.getClass();
            C4285c c4285c = new C4285c();
            if (feedAdAppearance.getCardCornerRadius() != null) {
                c4285c.put("card_corner_radius", feedAdAppearance.getCardCornerRadius().toString());
            }
            if (feedAdAppearance.getCardWidth() != null) {
                c4285c.put("card_width", feedAdAppearance.getCardWidth().toString());
            }
            mapC = c4285c.c();
        } else {
            mapC = C2100u.f18582b;
        }
        C4285c c4285c2 = new C4285c();
        if ((feedAdRequestConfiguration != null ? feedAdRequestConfiguration.getParameters() : null) != null) {
            c4285c2.putAll(feedAdRequestConfiguration.getParameters());
        }
        c4285c2.putAll(mapC);
        C4285c c4285cC = c4285c2.c();
        String adUnitId = feedAdRequestConfiguration != null ? feedAdRequestConfiguration.getAdUnitId() : null;
        if (adUnitId == null) {
            adUnitId = "";
        }
        return new h7.a(adUnitId).a(feedAdRequestConfiguration != null ? feedAdRequestConfiguration.getAge() : null).c(feedAdRequestConfiguration != null ? feedAdRequestConfiguration.getGender() : null).b(feedAdRequestConfiguration != null ? feedAdRequestConfiguration.getContextQuery() : null).a(feedAdRequestConfiguration != null ? feedAdRequestConfiguration.getContextTags() : null).a(feedAdRequestConfiguration != null ? feedAdRequestConfiguration.getLocation() : null).a(c4285cC).a();
    }

    public z80(t80 appearanceParametersProvider) {
        kotlin.jvm.internal.l.f(appearanceParametersProvider, "appearanceParametersProvider");
        this.f36237a = appearanceParametersProvider;
    }
}
