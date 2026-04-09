package E3;

import java.util.Map;
import java.util.Set;

/* compiled from: SchedulerConfig.java */
/* loaded from: classes.dex */
public abstract class e {

    /* compiled from: SchedulerConfig.java */
    public static abstract class a {
        public abstract long a();

        public abstract Set<b> b();

        public abstract long c();
    }

    /* compiled from: SchedulerConfig.java */
    public enum b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public abstract H3.a a();

    public final long b(v3.e eVar, long j4, int i) {
        long jB = j4 - a().b();
        a aVar = c().get(eVar);
        long jA = aVar.a();
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * jA * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA > 1 ? jA : 2L) * r12))), jB), aVar.c());
    }

    public abstract Map<v3.e, a> c();
}
