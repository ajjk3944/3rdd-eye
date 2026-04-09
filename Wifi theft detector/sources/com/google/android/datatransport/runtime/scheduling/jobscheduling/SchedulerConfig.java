package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.b;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class SchedulerConfig {

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public h4.a f9761a;

        /* renamed from: b, reason: collision with root package name */
        public Map f9762b = new HashMap();

        public a a(Priority priority, b bVar) {
            this.f9762b.put(priority, bVar);
            return this;
        }

        public SchedulerConfig b() {
            if (this.f9761a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f9762b.keySet().size() < Priority.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f9762b;
            this.f9762b = new HashMap();
            return SchedulerConfig.d(this.f9761a, map);
        }

        public a c(h4.a aVar) {
            this.f9761a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new b.C0197b().c(Collections.EMPTY_SET);
        }

        public abstract long b();

        public abstract Set c();

        public abstract long d();
    }

    public static a b() {
        return new a();
    }

    public static SchedulerConfig d(h4.a aVar, Map map) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(aVar, map);
    }

    public static SchedulerConfig f(h4.a aVar) {
        return b().a(Priority.DEFAULT, b.a().b(30000L).d(SignalManager.TWENTY_FOUR_HOURS_MILLIS).a()).a(Priority.HIGHEST, b.a().b(1000L).d(SignalManager.TWENTY_FOUR_HOURS_MILLIS).a()).a(Priority.VERY_LOW, b.a().b(SignalManager.TWENTY_FOUR_HOURS_MILLIS).d(SignalManager.TWENTY_FOUR_HOURS_MILLIS).c(i(Flag.DEVICE_IDLE)).a()).c(aVar).b();
    }

    public static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public final long a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r7)));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, Priority priority, long j10, int i10) {
        builder.setMinimumLatency(g(priority, j10, i10));
        j(builder, ((b) h().get(priority)).c());
        return builder;
    }

    public abstract h4.a e();

    public long g(Priority priority, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = (b) h().get(priority);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }

    public abstract Map h();

    public final void j(JobInfo.Builder builder, Set set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
