package fe;

import fe.u;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.y;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface u {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C1764a Companion;
        private final int maxPoolSize;
        private final long threadKeepAliveTimeMillis;
        public static final a HEAVY_PARALLEL = new a("HEAVY_PARALLEL", 0, 50, 2000);
        public static final a DISCOVERY_HOSTNAME = new a("DISCOVERY_HOSTNAME", 1, 5, 5000);
        public static final a DISCOVERY_UBNT_SPEEDTEST = new a("DISCOVERY_UBNT_SPEEDTEST", 2, 10, 5000);
        public static final a DISCOVERY_NETBIOS = new a("DISCOVERY_NETBIOS", 3, 10, 5000);

        /* renamed from: fe.u$a$a, reason: collision with other inner class name */
        public static final class C1764a {
            public /* synthetic */ C1764a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final ThreadPoolExecutor c(int i10, long j10, final String str) {
                final AtomicInteger atomicInteger = new AtomicInteger(0);
                final ThreadGroup threadGroup = new ThreadGroup(str);
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, j10, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: fe.t
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        return u.a.C1764a.d(str, threadGroup, atomicInteger, runnable);
                    }
                });
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                return threadPoolExecutor;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Thread d(String str, ThreadGroup threadGroup, AtomicInteger atomicInteger, Runnable runnable) {
                Z7.b.h("Creating thread " + str + "[" + threadGroup.activeCount() + "-" + atomicInteger.get() + "]", null, 2, null);
                return new Thread(threadGroup, runnable, str + "[" + threadGroup.activeCount() + "](" + atomicInteger.getAndIncrement() + ")");
            }

            private C1764a() {
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{HEAVY_PARALLEL, DISCOVERY_HOSTNAME, DISCOVERY_UBNT_SPEEDTEST, DISCOVERY_NETBIOS};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
            Companion = new C1764a(null);
        }

        private a(String str, int i10, int i11, long j10) {
            this.maxPoolSize = i11;
            this.threadKeepAliveTimeMillis = j10;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int getMaxPoolSize() {
            return this.maxPoolSize;
        }

        public final long getThreadKeepAliveTimeMillis() {
            return this.threadKeepAliveTimeMillis;
        }

        public final y newScheduler() {
            Z7.b.h("Intantiating Scheduler " + name(), null, 2, null);
            y yVarB = Gg.a.b(Companion.c(this.maxPoolSize, this.threadKeepAliveTimeMillis, "Pool-" + name()));
            AbstractC6492s.h(yVarB, "from(...)");
            return yVarB;
        }
    }

    y a();

    y b();
}
