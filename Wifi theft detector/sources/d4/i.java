package d4;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import e4.u;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class i implements z3.b {

    /* renamed from: a, reason: collision with root package name */
    public final Provider f20757a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f20758b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f20759c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f20760d;

    public i(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f20757a = provider;
        this.f20758b = provider2;
        this.f20759c = provider3;
        this.f20760d = provider4;
    }

    public static i a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new i(provider, provider2, provider3, provider4);
    }

    public static u c(Context context, f4.d dVar, SchedulerConfig schedulerConfig, h4.a aVar) {
        return (u) z3.d.c(h.a(context, dVar, schedulerConfig, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((Context) this.f20757a.get(), (f4.d) this.f20758b.get(), (SchedulerConfig) this.f20759c.get(), (h4.a) this.f20760d.get());
    }
}
