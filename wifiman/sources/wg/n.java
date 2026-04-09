package wg;

import ig.AbstractC6152a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes4.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f64982a = b(true, "rx3.purge-enabled", true, true, new a());

    static final class a implements kg.n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(String str) {
            return System.getProperty(str);
        }
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(f64982a);
        return scheduledThreadPoolExecutor;
    }

    static boolean b(boolean z10, String str, boolean z11, boolean z12, kg.n nVar) {
        if (!z10) {
            return z12;
        }
        try {
            String str2 = (String) nVar.apply(str);
            return str2 == null ? z11 : "true".equals(str2);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            return z11;
        }
    }
}
