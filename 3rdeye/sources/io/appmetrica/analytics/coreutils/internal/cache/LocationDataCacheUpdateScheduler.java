package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* renamed from: a, reason: collision with root package name */
    private final ICommonExecutor f38942a;

    /* renamed from: b, reason: collision with root package name */
    private final ILastKnownUpdater f38943b;

    /* renamed from: c, reason: collision with root package name */
    private final UpdateConditionsChecker f38944c;

    /* renamed from: d, reason: collision with root package name */
    private final a f38945d = new a(this);

    /* renamed from: e, reason: collision with root package name */
    private final b f38946e = new b(this);

    public LocationDataCacheUpdateScheduler(ICommonExecutor iCommonExecutor, ILastKnownUpdater iLastKnownUpdater, UpdateConditionsChecker updateConditionsChecker, String str) {
        this.f38942a = iCommonExecutor;
        this.f38943b = iLastKnownUpdater;
        this.f38944c = updateConditionsChecker;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f38942a.remove(this.f38945d);
        this.f38942a.executeDelayed(this.f38945d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f38942a.execute(this.f38946e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f38942a.remove(this.f38945d);
        this.f38942a.remove(this.f38946e);
    }
}
