package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.p4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4862p4 {

    /* renamed from: a, reason: collision with root package name */
    public final C5108ym f41411a;

    /* renamed from: b, reason: collision with root package name */
    public final T f41412b;

    public C4862p4(C5108ym c5108ym, T t10) {
        this.f41411a = c5108ym;
        this.f41412b = t10;
    }

    public final C4836o4 a(HashMap map) {
        AdvertisingIdsHolder advertisingIdsHolderA;
        C4544cm c4544cmE = this.f41411a.e();
        T t10 = this.f41412b;
        synchronized (t10) {
            advertisingIdsHolderA = t10.a(new C4742ke());
        }
        return new C4836o4(C4836o4.a(c4544cmE.f40643d), C4836o4.a(c4544cmE.f40640a), C4836o4.a(c4544cmE.f40641b), C4836o4.a(c4544cmE.f40648j), C4836o4.a(c4544cmE.i), C4836o4.a(AbstractC5122zb.a(Dm.a(c4544cmE.f40649k))), C4836o4.a(AbstractC5122zb.a(map)), new IdentifiersResult(advertisingIdsHolderA.getGoogle().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getGoogle().mAdTrackingInfo.advId, advertisingIdsHolderA.getGoogle().mStatus, advertisingIdsHolderA.getGoogle().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderA.getHuawei().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getHuawei().mAdTrackingInfo.advId, advertisingIdsHolderA.getHuawei().mStatus, advertisingIdsHolderA.getHuawei().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderA.getYandex().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getYandex().mAdTrackingInfo.advId, advertisingIdsHolderA.getYandex().mStatus, advertisingIdsHolderA.getYandex().mErrorExplanation), C4836o4.a(AbstractC5122zb.a(c4544cmE.f40647h)), Cn.a(), c4544cmE.f40653o + c4544cmE.f40637A.f39125a, C4836o4.a(c4544cmE.f40652n.f39480f), new Bundle());
    }
}
