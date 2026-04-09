package d4;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class g implements z3.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f20756a;

    public g(Provider provider) {
        this.f20756a = provider;
    }

    public static SchedulerConfig a(h4.a aVar) {
        return (SchedulerConfig) z3.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(Provider provider) {
        return new g(provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SchedulerConfig get() {
        return a((h4.a) this.f20756a.get());
    }
}
