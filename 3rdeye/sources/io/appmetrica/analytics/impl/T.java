package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class T implements Ta {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40135a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f40136b;
    public FutureTask i;

    /* renamed from: j, reason: collision with root package name */
    public final I f40143j;

    /* renamed from: c, reason: collision with root package name */
    public final String f40137c = "advertising identifiers collecting is forbidden by client configuration";

    /* renamed from: d, reason: collision with root package name */
    public final String f40138d = "advertising identifiers collecting is forbidden by startup";

    /* renamed from: e, reason: collision with root package name */
    public final String f40139e = "advertising identifiers collecting is forbidden by unknown reason";

    /* renamed from: f, reason: collision with root package name */
    public final M f40140f = new M(new Kg("google"));

    /* renamed from: g, reason: collision with root package name */
    public final M f40141g = new M(new Kg("huawei"));

    /* renamed from: h, reason: collision with root package name */
    public final M f40142h = new M(new Kg("yandex"));

    /* renamed from: k, reason: collision with root package name */
    public volatile AdvertisingIdsHolder f40144k = new AdvertisingIdsHolder();

    /* renamed from: l, reason: collision with root package name */
    public F f40145l = new F(4, 4, 4);

    public T(Context context, ICommonExecutor iCommonExecutor, C4544cm c4544cm) {
        this.f40135a = context;
        this.f40136b = iCommonExecutor;
        this.f40143j = new I(c4544cm);
    }

    public static final Void e(T t10) {
        t10.f40144k = new AdvertisingIdsHolder(t10.a(t10.f40145l.f39391a, new P(t10)), t10.a(t10.f40145l.f39392b, new Q(t10)), t10.a(t10.f40145l.f39393c, new S(t10, new C4742ke())));
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    public final synchronized AdvertisingIdsHolder getIdentifiers(Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized void init() {
        if (this.i == null) {
            this.f40145l = this.f40143j.a();
            FutureTask futureTask = new FutureTask(new P4.n(this, 1));
            this.i = futureTask;
            this.f40136b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ta, io.appmetrica.analytics.impl.InterfaceC4673hm
    public final synchronized void a(C4544cm c4544cm) {
        this.f40143j.a(c4544cm);
        a((Qi) new C4742ke(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized void b(boolean z10) {
        this.f40143j.f39592b.update(z10);
        a((Qi) new C4742ke(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.i;
        if (futureTask == null) {
            kotlin.jvm.internal.l.l("refresh");
            throw null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f40144k;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized AdvertisingIdsHolder a() {
        return a(new C4742ke());
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized AdvertisingIdsHolder a(Qi qi) {
        try {
            a(qi, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f40144k;
    }

    public final FutureTask a(final Qi qi, final boolean z10) {
        final F fA = this.f40143j.a();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.Io
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return T.a(z10, fA, this, qi);
            }
        });
        this.i = futureTask;
        this.f40136b.execute(futureTask);
        FutureTask futureTask2 = this.i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        kotlin.jvm.internal.l.l("refresh");
        throw null;
    }

    public static final Void a(boolean z10, F f10, T t10, Qi qi) {
        if (!z10 && kotlin.jvm.internal.l.b(f10, t10.f40145l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = t10.f40144k;
        AdTrackingInfoResult adTrackingInfoResultA = t10.a(f10.f39391a, new P(t10));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = adTrackingInfoResultA.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            adTrackingInfoResultA = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, adTrackingInfoResultA.mErrorExplanation);
        }
        AdTrackingInfoResult adTrackingInfoResultA2 = t10.a(f10.f39392b, new Q(t10));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = adTrackingInfoResultA2.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            adTrackingInfoResultA2 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, adTrackingInfoResultA2.mErrorExplanation);
        }
        AdTrackingInfoResult adTrackingInfoResultA3 = t10.a(f10.f39393c, new S(t10, qi));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = adTrackingInfoResultA3.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            adTrackingInfoResultA3 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, adTrackingInfoResultA3.mErrorExplanation);
        }
        t10.f40144k = new AdvertisingIdsHolder(adTrackingInfoResultA, adTrackingInfoResultA2, adTrackingInfoResultA3);
        return null;
    }

    public final AdTrackingInfoResult a(int i, InterfaceC5480a interfaceC5480a) {
        if (i == 0) {
            throw null;
        }
        int i10 = i - 1;
        if (i10 == 0) {
            return (AdTrackingInfoResult) interfaceC5480a.invoke();
        }
        if (i10 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.f40137c);
        }
        if (i10 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.f40138d);
        }
        if (i10 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.f40139e);
        }
        throw new b9.j();
    }
}
