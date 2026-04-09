package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import y9.C5819a;

/* renamed from: io.appmetrica.analytics.impl.d8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4556d8 {

    /* renamed from: a, reason: collision with root package name */
    public final T f40720a;

    /* renamed from: b, reason: collision with root package name */
    public final C4627g2 f40721b;

    public C4556d8(T t10, C4627g2 c4627g2) {
        this.f40720a = t10;
        this.f40721b = c4627g2;
    }

    public final String a() {
        AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArrDigest;
        T t10 = this.f40720a;
        Dn dn = new Dn(5, 500);
        synchronized (t10) {
            try {
                t10.a((Qi) dn, true).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            advertisingIdsHolder = t10.f40144k;
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (!yandex.isValid()) {
            String id = this.f40721b.getAppSetId().getId();
            if (id != null && id.length() != 0) {
                try {
                    UUID.fromString(id);
                    if (!id.equals("00000000-0000-0000-0000-000000000000")) {
                        return y9.n.X(id, "-", "");
                    }
                } catch (Throwable unused2) {
                }
            }
            return y9.n.X(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        kotlin.jvm.internal.l.c(adTrackingInfo);
        String str = adTrackingInfo.advId;
        kotlin.jvm.internal.l.c(str);
        try {
            bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(C5819a.f48359b));
        } catch (NoSuchAlgorithmException unused3) {
            bArrDigest = new byte[0];
        }
        return StringUtils.toHexString(bArrDigest);
    }

    public C4556d8() {
        this(Ga.j().b(), Ga.j().c());
    }
}
