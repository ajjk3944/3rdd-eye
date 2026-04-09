package io.appmetrica.analytics.coreutils.internal.cache;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationDataCacheUpdateScheduler f38948a;

    public b(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.f38948a = locationDataCacheUpdateScheduler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f38948a.f38944c.shouldUpdate()) {
            this.f38948a.f38945d.f38947a.f38943b.updateLastKnown();
        }
    }
}
