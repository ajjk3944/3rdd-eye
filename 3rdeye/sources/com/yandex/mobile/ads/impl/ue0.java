package com.yandex.mobile.ads.impl;

import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.ad.gms.service.GmsServiceAdvertisingInfoReader;

/* loaded from: classes3.dex */
public final class ue0 {

    /* renamed from: a, reason: collision with root package name */
    private final fc f34044a;

    /* renamed from: b, reason: collision with root package name */
    private final pe0 f34045b;

    public /* synthetic */ ue0() {
        this(new fc(), new pe0());
    }

    public final ec a(qe0 connection) {
        kotlin.jvm.internal.l.f(connection, "connection");
        try {
            IBinder iBinderA = connection.a();
            if (iBinderA == null) {
                return null;
            }
            this.f34045b.getClass();
            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            kc gmsServiceAdvertisingInfoReader = iInterfaceQueryLocalInterface instanceof kc ? (kc) iInterfaceQueryLocalInterface : null;
            if (gmsServiceAdvertisingInfoReader == null) {
                gmsServiceAdvertisingInfoReader = new GmsServiceAdvertisingInfoReader(iBinderA);
            }
            String advertisingId = gmsServiceAdvertisingInfoReader.readAdvertisingId();
            Boolean adTrackingLimited = gmsServiceAdvertisingInfoReader.readAdTrackingLimited();
            this.f34044a.getClass();
            ec ecVar = (adTrackingLimited == null || advertisingId == null) ? null : new ec(advertisingId, adTrackingLimited.booleanValue());
            fp0.a(new Object[0]);
            return ecVar;
        } catch (InterruptedException unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }

    public ue0(fc advertisingInfoCreator, pe0 gmsAdvertisingInfoReaderProvider) {
        kotlin.jvm.internal.l.f(advertisingInfoCreator, "advertisingInfoCreator");
        kotlin.jvm.internal.l.f(gmsAdvertisingInfoReaderProvider, "gmsAdvertisingInfoReaderProvider");
        this.f34044a = advertisingInfoCreator;
        this.f34045b = gmsAdvertisingInfoReaderProvider;
    }
}
