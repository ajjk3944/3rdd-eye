package H;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SequentialExecutor.java */
/* loaded from: classes.dex */
public final class g implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f1964c;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f1963b = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final b f1965d = new b();

    /* renamed from: e, reason: collision with root package name */
    public c f1966e = c.IDLE;

    /* renamed from: f, reason: collision with root package name */
    public long f1967f = 0;

    /* compiled from: SequentialExecutor.java */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f1968b;

        public a(Runnable runnable) {
            this.f1968b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f1968b.run();
        }
    }

    /* compiled from: SequentialExecutor.java */
    public final class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        
            C.S.c("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0034 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                H.g r2 = H.g.this     // Catch: java.lang.Throwable -> L49
                java.util.ArrayDeque r2 = r2.f1963b     // Catch: java.lang.Throwable -> L49
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L49
                if (r0 != 0) goto L28
                H.g r0 = H.g.this     // Catch: java.lang.Throwable -> L1c
                H.g$c r3 = r0.f1966e     // Catch: java.lang.Throwable -> L1c
                H.g$c r4 = H.g.c.RUNNING     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L3e
            L14:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L3e
            L1c:
                r0 = move-exception
                goto L63
            L1e:
                long r5 = r0.f1967f     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.f1967f = r5     // Catch: java.lang.Throwable -> L1c
                r0.f1966e = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                H.g r3 = H.g.this     // Catch: java.lang.Throwable -> L1c
                java.util.ArrayDeque r3 = r3.f1963b     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L3f
                H.g r0 = H.g.this     // Catch: java.lang.Throwable -> L1c
                H.g$c r3 = H.g.c.IDLE     // Catch: java.lang.Throwable -> L1c
                r0.f1966e = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L3e
                goto L14
            L3e:
                return
            L3f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L49
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.Throwable -> L49 java.lang.RuntimeException -> L4b
                goto L2
            L49:
                r0 = move-exception
                goto L65
            L4b:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
                r5.<init>()     // Catch: java.lang.Throwable -> L49
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L49
                r5.append(r3)     // Catch: java.lang.Throwable -> L49
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L49
                C.S.c(r4, r3, r2)     // Catch: java.lang.Throwable -> L49
                goto L2
            L63:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L49
            L65:
                if (r1 == 0) goto L6e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L6e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: H.g.b.a():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e4) {
                synchronized (g.this.f1963b) {
                    g.this.f1966e = c.IDLE;
                    throw e4;
                }
            }
        }
    }

    /* compiled from: SequentialExecutor.java */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public g(Executor executor) {
        executor.getClass();
        this.f1964c = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            r8.getClass()
            java.util.ArrayDeque r0 = r7.f1963b
            monitor-enter(r0)
            H.g$c r1 = r7.f1966e     // Catch: java.lang.Throwable -> L6d
            H.g$c r2 = H.g.c.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            H.g$c r2 = H.g.c.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f1967f     // Catch: java.lang.Throwable -> L6d
            H.g$a r1 = new H.g$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque r8 = r7.f1963b     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            H.g$c r8 = H.g.c.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.f1966e = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f1964c     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            H.g$b r5 = r7.f1965d     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            H.g$c r0 = r7.f1966e
            if (r0 == r8) goto L2e
            goto L69
        L2e:
            java.util.ArrayDeque r0 = r7.f1963b
            monitor-enter(r0)
            long r5 = r7.f1967f     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            H.g$c r1 = r7.f1966e     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f1966e = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.ArrayDeque r2 = r7.f1963b
            monitor-enter(r2)
            H.g$c r0 = r7.f1966e     // Catch: java.lang.Throwable -> L55
            H.g$c r3 = H.g.c.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            H.g$c r3 = H.g.c.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.ArrayDeque r0 = r7.f1963b     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
        L69:
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.ArrayDeque r1 = r7.f1963b     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: H.g.execute(java.lang.Runnable):void");
    }
}
