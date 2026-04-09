package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService;

/* loaded from: classes3.dex */
public final class qf0 {

    /* renamed from: a, reason: collision with root package name */
    private final fc f32169a;

    public /* synthetic */ qf0() {
        this(new fc());
    }

    public final ec a(com.monetization.ads.core.identifiers.ad.huawei.a serviceConnection) {
        kotlin.jvm.internal.l.f(serviceConnection, "serviceConnection");
        try {
            OpenDeviceIdentifierService openDeviceIdentifierServiceA = serviceConnection.a();
            if (openDeviceIdentifierServiceA != null) {
                String oaid = openDeviceIdentifierServiceA.getOaid();
                boolean oaidTrackLimited = openDeviceIdentifierServiceA.getOaidTrackLimited();
                this.f32169a.getClass();
                if (oaid != null) {
                    return new ec(oaid, oaidTrackLimited);
                }
            }
            return null;
        } catch (Exception unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }

    public qf0(fc advertisingInfoCreator) {
        kotlin.jvm.internal.l.f(advertisingInfoCreator, "advertisingInfoCreator");
        this.f32169a = advertisingInfoCreator;
    }
}
