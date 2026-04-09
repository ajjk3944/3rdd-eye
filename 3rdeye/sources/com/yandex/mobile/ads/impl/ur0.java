package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class ur0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b f34190d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f34191e;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f34192a;

    /* renamed from: b, reason: collision with root package name */
    private c<? extends d> f34193b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f34194c;

    public interface a<T extends d> {
        b a(T t10, long j4, long j10, IOException iOException, int i);

        void a(T t10, long j4, long j10);

        void a(T t10, long j4, long j10, boolean z10);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f34195a;

        /* renamed from: b, reason: collision with root package name */
        private final long f34196b;

        public /* synthetic */ b(int i, long j4, int i10) {
            this(i, j4);
        }

        private b(int i, long j4) {
            this.f34195a = i;
            this.f34196b = j4;
        }

        public final boolean a() {
            int i = this.f34195a;
            return i == 0 || i == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class c<T extends d> extends Handler implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final int f34197b;

        /* renamed from: c, reason: collision with root package name */
        private final T f34198c;

        /* renamed from: d, reason: collision with root package name */
        private final long f34199d;

        /* renamed from: e, reason: collision with root package name */
        private a<T> f34200e;

        /* renamed from: f, reason: collision with root package name */
        private IOException f34201f;

        /* renamed from: g, reason: collision with root package name */
        private int f34202g;

        /* renamed from: h, reason: collision with root package name */
        private Thread f34203h;
        private boolean i;

        /* renamed from: j, reason: collision with root package name */
        private volatile boolean f34204j;

        public c(Looper looper, T t10, a<T> aVar, int i, long j4) {
            super(looper);
            this.f34198c = t10;
            this.f34200e = aVar;
            this.f34197b = i;
            this.f34199d = j4;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f34204j) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                this.f34201f = null;
                ur0 ur0Var = ur0.this;
                ExecutorService executorService = ur0Var.f34192a;
                c cVar = ur0Var.f34193b;
                cVar.getClass();
                executorService.execute(cVar);
                return;
            }
            if (i == 3) {
                throw ((Error) message.obj);
            }
            ur0.this.f34193b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = jElapsedRealtime - this.f34199d;
            a<T> aVar = this.f34200e;
            aVar.getClass();
            if (this.i) {
                aVar.a(this.f34198c, jElapsedRealtime, j4, false);
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                try {
                    aVar.a(this.f34198c, jElapsedRealtime, j4);
                    return;
                } catch (RuntimeException e4) {
                    rs0.a("LoadTask", "Unexpected exception handling load completed", e4);
                    ur0.this.f34194c = new g(e4);
                    return;
                }
            }
            if (i10 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f34201f = iOException;
            int i11 = this.f34202g + 1;
            this.f34202g = i11;
            b bVarA = aVar.a(this.f34198c, jElapsedRealtime, j4, iOException, i11);
            int i12 = bVarA.f34195a;
            if (i12 == 3) {
                ur0.this.f34194c = this.f34201f;
                return;
            }
            if (i12 != 2) {
                if (i12 == 1) {
                    this.f34202g = 1;
                }
                long jMin = bVarA.f34196b;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.f34202g - 1) * 1000, 5000);
                }
                ur0 ur0Var2 = ur0.this;
                if (ur0Var2.f34193b != null) {
                    throw new IllegalStateException();
                }
                ur0Var2.f34193b = this;
                if (jMin > 0) {
                    sendEmptyMessageDelayed(0, jMin);
                } else {
                    this.f34201f = null;
                    ur0Var2.f34192a.execute(this);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.i;
                    this.f34203h = Thread.currentThread();
                }
                if (!z10) {
                    h52.a("load:".concat(this.f34198c.getClass().getSimpleName()));
                    try {
                        this.f34198c.a();
                        h52.a();
                    } catch (Throwable th) {
                        h52.a();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f34203h = null;
                    Thread.interrupted();
                }
                if (this.f34204j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e4) {
                if (this.f34204j) {
                    return;
                }
                obtainMessage(2, e4).sendToTarget();
            } catch (Exception e10) {
                if (this.f34204j) {
                    return;
                }
                rs0.a("LoadTask", "Unexpected exception loading stream", e10);
                obtainMessage(2, new g(e10)).sendToTarget();
            } catch (OutOfMemoryError e11) {
                if (this.f34204j) {
                    return;
                }
                rs0.a("LoadTask", "OutOfMemory error loading stream", e11);
                obtainMessage(2, new g(e11)).sendToTarget();
            } catch (Error e12) {
                if (!this.f34204j) {
                    rs0.a("LoadTask", "Unexpected error loading stream", e12);
                    obtainMessage(3, e12).sendToTarget();
                }
                throw e12;
            }
        }

        public final void a(boolean z10) {
            this.f34204j = z10;
            this.f34201f = null;
            if (hasMessages(0)) {
                this.i = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.i = true;
                        this.f34198c.b();
                        Thread thread = this.f34203h;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z10) {
                ur0.this.f34193b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                a<T> aVar = this.f34200e;
                aVar.getClass();
                aVar.a(this.f34198c, jElapsedRealtime, jElapsedRealtime - this.f34199d, true);
                this.f34200e = null;
            }
        }
    }

    public interface d {
        void a() throws IOException;

        void b();
    }

    public interface e {
        void b();
    }

    public static final class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final e f34206b;

        public f(e eVar) {
            this.f34206b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f34206b.b();
        }
    }

    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    static {
        long j4 = -9223372036854775807L;
        int i = 0;
        f34190d = new b(2, j4, i);
        f34191e = new b(3, j4, i);
    }

    public ur0(String str) {
        this.f34192a = s82.d("ExoPlayer:Loader:".concat(str));
    }

    public final void a() {
        c<? extends d> cVar = this.f34193b;
        if (cVar == null) {
            throw new IllegalStateException();
        }
        cVar.a(false);
    }

    public final void b() {
        this.f34194c = null;
    }

    public final boolean c() {
        return this.f34194c != null;
    }

    public final boolean d() {
        return this.f34193b != null;
    }

    public final void a(int i) throws IOException {
        IOException iOException = this.f34194c;
        if (iOException == null) {
            c<? extends d> cVar = this.f34193b;
            if (cVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = cVar.f34197b;
                }
                IOException iOException2 = ((c) cVar).f34201f;
                if (iOException2 != null && ((c) cVar).f34202g > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void a(e eVar) {
        c<? extends d> cVar = this.f34193b;
        if (cVar != null) {
            cVar.a(true);
        }
        if (eVar != null) {
            this.f34192a.execute(new f(eVar));
        }
        this.f34192a.shutdown();
    }

    public static b a(long j4, boolean z10) {
        return new b(z10 ? 1 : 0, j4, 0);
    }

    public final <T extends d> long a(T t10, a<T> aVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.f34194c = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c<? extends d> cVar = new c<>(looperMyLooper, t10, aVar, i, jElapsedRealtime);
            if (this.f34193b == null) {
                this.f34193b = cVar;
                ((c) cVar).f34201f = null;
                this.f34192a.execute(cVar);
                return jElapsedRealtime;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
