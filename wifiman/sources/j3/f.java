package j3;

import a3.EnumC3757e;
import android.app.job.JobInfo;
import j3.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m3.InterfaceC6756a;

/* loaded from: classes.dex */
public abstract class f {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC6756a f50061a;

        /* renamed from: b, reason: collision with root package name */
        private Map f50062b = new HashMap();

        public a a(EnumC3757e enumC3757e, b bVar) {
            this.f50062b.put(enumC3757e, bVar);
            return this;
        }

        public f b() {
            if (this.f50061a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f50062b.keySet().size() < EnumC3757e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f50062b;
            this.f50062b = new HashMap();
            return f.d(this.f50061a, map);
        }

        public a c(InterfaceC6756a interfaceC6756a) {
            this.f50061a = interfaceC6756a;
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
            return new c.b().c(Collections.emptySet());
        }

        abstract long b();

        abstract Set c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r7)));
    }

    public static a b() {
        return new a();
    }

    static f d(InterfaceC6756a interfaceC6756a, Map map) {
        return new j3.b(interfaceC6756a, map);
    }

    public static f f(InterfaceC6756a interfaceC6756a) {
        return b().a(EnumC3757e.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(EnumC3757e.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(EnumC3757e.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(interfaceC6756a).b();
    }

    private static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, EnumC3757e enumC3757e, long j10, int i10) {
        builder.setMinimumLatency(g(enumC3757e, j10, i10));
        j(builder, ((b) h().get(enumC3757e)).c());
        return builder;
    }

    abstract InterfaceC6756a e();

    public long g(EnumC3757e enumC3757e, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = (b) h().get(enumC3757e);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }

    abstract Map h();
}
