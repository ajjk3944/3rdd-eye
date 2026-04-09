package cf;

import cc.s;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class m implements Executor {

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f3735y = Logger.getLogger(m.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3736a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f3737d = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public l f3738g = l.IDLE;

    /* renamed from: r, reason: collision with root package name */
    public long f3739r = 0;

    /* renamed from: x, reason: collision with root package name */
    public final re.a f3740x = new re.a(this);

    public m(Executor executor) {
        s.h(executor);
        this.f3736a = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0062  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            cc.s.h(r8)
            java.util.ArrayDeque r0 = r7.f3737d
            monitor-enter(r0)
            cf.l r1 = r7.f3738g     // Catch: java.lang.Throwable -> L6e
            cf.l r2 = cf.l.RUNNING     // Catch: java.lang.Throwable -> L6e
            if (r1 == r2) goto L70
            cf.l r2 = cf.l.QUEUED     // Catch: java.lang.Throwable -> L6e
            if (r1 != r2) goto L11
            goto L70
        L11:
            long r3 = r7.f3739r     // Catch: java.lang.Throwable -> L6e
            cf.k r1 = new cf.k     // Catch: java.lang.Throwable -> L6e
            r5 = 0
            r1.<init>(r8, r5)     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayDeque r8 = r7.f3737d     // Catch: java.lang.Throwable -> L6e
            r8.add(r1)     // Catch: java.lang.Throwable -> L6e
            cf.l r8 = cf.l.QUEUING     // Catch: java.lang.Throwable -> L6e
            r7.f3738g = r8     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            java.util.concurrent.Executor r0 = r7.f3736a     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            re.a r5 = r7.f3740x     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            r0.execute(r5)     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            cf.l r0 = r7.f3738g
            if (r0 == r8) goto L2f
            goto L6a
        L2f:
            java.util.ArrayDeque r0 = r7.f3737d
            monitor-enter(r0)
            long r5 = r7.f3739r     // Catch: java.lang.Throwable -> L3f
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L41
            cf.l r1 = r7.f3738g     // Catch: java.lang.Throwable -> L3f
            if (r1 != r8) goto L41
            r7.f3738g = r2     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r8 = move-exception
            goto L43
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r8
        L45:
            r8 = move-exception
            goto L48
        L47:
            r8 = move-exception
        L48:
            java.util.ArrayDeque r2 = r7.f3737d
            monitor-enter(r2)
            cf.l r0 = r7.f3738g     // Catch: java.lang.Throwable -> L56
            cf.l r3 = cf.l.IDLE     // Catch: java.lang.Throwable -> L56
            if (r0 == r3) goto L58
            cf.l r3 = cf.l.QUEUING     // Catch: java.lang.Throwable -> L56
            if (r0 != r3) goto L62
            goto L58
        L56:
            r8 = move-exception
            goto L6c
        L58:
            java.util.ArrayDeque r0 = r7.f3737d     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L62
            r0 = 1
            goto L63
        L62:
            r0 = 0
        L63:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L6b
            if (r0 != 0) goto L6b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
        L6a:
            return
        L6b:
            throw r8     // Catch: java.lang.Throwable -> L56
        L6c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
            throw r8
        L6e:
            r8 = move-exception
            goto L77
        L70:
            java.util.ArrayDeque r1 = r7.f3737d     // Catch: java.lang.Throwable -> L6e
            r1.add(r8)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            return
        L77:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.m.execute(java.lang.Runnable):void");
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f3736a + "}";
    }
}
