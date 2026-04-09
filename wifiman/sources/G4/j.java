package G4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import s3.AbstractC7901p;

/* loaded from: classes3.dex */
final class j implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f6864f = Logger.getLogger(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Executor f6865a;

    /* renamed from: b, reason: collision with root package name */
    private final Deque f6866b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private c f6867c = c.IDLE;

    /* renamed from: d, reason: collision with root package name */
    private long f6868d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final b f6869e = new b(this, null);

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f6870a;

        a(Runnable runnable) {
            this.f6870a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6870a.run();
        }

        public String toString() {
            return this.f6870a.toString();
        }
    }

    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        Runnable f6872a;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        
            r8.f6872a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
        
            G4.j.f6864f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f6872a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
        
            r8.f6872a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                G4.j r2 = G4.j.this     // Catch: java.lang.Throwable -> L5e
                java.util.Deque r2 = G4.j.a(r2)     // Catch: java.lang.Throwable -> L5e
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
                if (r0 != 0) goto L2d
                G4.j r0 = G4.j.this     // Catch: java.lang.Throwable -> L20
                G4.j$c r0 = G4.j.b(r0)     // Catch: java.lang.Throwable -> L20
                G4.j$c r3 = G4.j.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                r0 = move-exception
                goto L84
            L22:
                G4.j r0 = G4.j.this     // Catch: java.lang.Throwable -> L20
                G4.j.d(r0)     // Catch: java.lang.Throwable -> L20
                G4.j r0 = G4.j.this     // Catch: java.lang.Throwable -> L20
                G4.j.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                G4.j r3 = G4.j.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = G4.j.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f6872a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L4f
                G4.j r0 = G4.j.this     // Catch: java.lang.Throwable -> L20
                G4.j$c r3 = G4.j.c.IDLE     // Catch: java.lang.Throwable -> L20
                G4.j.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L4e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4e:
                return
            L4f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f6872a     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
                r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            L5b:
                r8.f6872a = r2     // Catch: java.lang.Throwable -> L5e
                goto L2
            L5e:
                r0 = move-exception
                goto L86
            L60:
                r0 = move-exception
                goto L81
            L62:
                r3 = move-exception
                java.util.logging.Logger r4 = G4.j.e()     // Catch: java.lang.Throwable -> L60
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
                r6.<init>()     // Catch: java.lang.Throwable -> L60
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.Runnable r7 = r8.f6872a     // Catch: java.lang.Throwable -> L60
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
                goto L5b
            L81:
                r8.f6872a = r2     // Catch: java.lang.Throwable -> L5e
                throw r0     // Catch: java.lang.Throwable -> L5e
            L84:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L5e
            L86:
                if (r1 == 0) goto L8f
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8f:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: G4.j.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (j.this.f6866b) {
                    j.this.f6867c = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f6872a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + j.this.f6867c + "}";
        }

        /* synthetic */ b(j jVar, a aVar) {
            this();
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    j(Executor executor) {
        this.f6865a = (Executor) AbstractC7901p.l(executor);
    }

    static /* synthetic */ long d(j jVar) {
        long j10 = jVar.f6868d;
        jVar.f6868d = 1 + j10;
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            s3.AbstractC7901p.l(r8)
            java.util.Deque r0 = r7.f6866b
            monitor-enter(r0)
            G4.j$c r1 = r7.f6867c     // Catch: java.lang.Throwable -> L6d
            G4.j$c r2 = G4.j.c.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            G4.j$c r2 = G4.j.c.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f6868d     // Catch: java.lang.Throwable -> L6d
            G4.j$a r1 = new G4.j$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque r8 = r7.f6866b     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            G4.j$c r8 = G4.j.c.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.f6867c = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f6865a     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            G4.j$b r5 = r7.f6869e     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            G4.j$c r0 = r7.f6867c
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque r0 = r7.f6866b
            monitor-enter(r0)
            long r5 = r7.f6868d     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            G4.j$c r1 = r7.f6867c     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f6867c = r2     // Catch: java.lang.Throwable -> L3e
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
            java.util.Deque r2 = r7.f6866b
            monitor-enter(r2)
            G4.j$c r0 = r7.f6867c     // Catch: java.lang.Throwable -> L55
            G4.j$c r3 = G4.j.c.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            G4.j$c r3 = G4.j.c.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque r0 = r7.f6866b     // Catch: java.lang.Throwable -> L55
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
            java.util.Deque r1 = r7.f6866b     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: G4.j.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f6865a + "}";
    }
}
