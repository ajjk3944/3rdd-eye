package com.yandex.mobile.ads.impl;

import android.location.Location;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.impl.h7;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class yk2 {

    /* renamed from: a, reason: collision with root package name */
    private final iq1 f35852a;

    public /* synthetic */ yk2() {
        this(new iq1());
    }

    public final h7 a(AdRequestConfiguration adRequestConfiguration) {
        kotlin.jvm.internal.l.f(adRequestConfiguration, "adRequestConfiguration");
        String age = adRequestConfiguration.getAge();
        String gender = adRequestConfiguration.getGender();
        String contextQuery = adRequestConfiguration.getContextQuery();
        List<String> contextTags = adRequestConfiguration.getContextTags();
        Location location = adRequestConfiguration.getLocation();
        Map<String, String> parameters = adRequestConfiguration.getParameters();
        String biddingData = adRequestConfiguration.getBiddingData();
        AdTheme preferredTheme = adRequestConfiguration.getPreferredTheme();
        h7.a aVar = new h7.a(adRequestConfiguration.getAdUnitId());
        if (age != null) {
            if (y9.q.i0(age)) {
                age = null;
            }
            if (age != null) {
                aVar.a(age);
            }
        }
        if (gender != null) {
            if (y9.q.i0(gender)) {
                gender = null;
            }
            if (gender != null) {
                aVar.c(gender);
            }
        }
        if (contextQuery != null) {
            aVar = aVar.b(contextQuery);
        }
        if (contextTags != null) {
            aVar = aVar.a(contextTags);
        }
        if (location != null) {
            aVar = aVar.a(location);
        }
        if (parameters != null) {
            aVar = aVar.a(parameters);
        }
        if (biddingData != null) {
            aVar = aVar.d(biddingData);
        }
        if (preferredTheme != null) {
            this.f35852a.getClass();
            aVar = aVar.a(iq1.a(preferredTheme));
        }
        return aVar.a();
    }

    public yk2(iq1 requestedAdThemeFactory) {
        kotlin.jvm.internal.l.f(requestedAdThemeFactory, "requestedAdThemeFactory");
        this.f35852a = requestedAdThemeFactory;
    }
}
