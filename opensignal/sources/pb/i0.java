package pb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class i0 extends Handler implements Runnable {
    public boolean B;
    public volatile boolean D;
    public final Object E;
    public Object F;
    public final /* synthetic */ Object G;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20378a;

    /* renamed from: d, reason: collision with root package name */
    public final int f20379d;

    /* renamed from: g, reason: collision with root package name */
    public final long f20380g;

    /* renamed from: r, reason: collision with root package name */
    public IOException f20381r;

    /* renamed from: x, reason: collision with root package name */
    public int f20382x;

    /* renamed from: y, reason: collision with root package name */
    public Thread f20383y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, Looper looper, Object obj2, Object obj3, int i10, long j, int i11) {
        super(looper);
        this.f20378a = i11;
        this.G = obj;
        this.E = obj2;
        this.F = obj3;
        this.f20379d = i10;
        this.f20380g = j;
    }

    public final void a(boolean z10) {
        switch (this.f20378a) {
            case 0:
                this.D = z10;
                this.f20381r = null;
                if (hasMessages(0)) {
                    this.B = true;
                    removeMessages(0);
                    if (!z10) {
                        sendEmptyMessage(1);
                    }
                } else {
                    synchronized (this) {
                        try {
                            this.B = true;
                            ((j0) this.E).d();
                            Thread thread = this.f20383y;
                            if (thread != null) {
                                thread.interrupt();
                            }
                        } finally {
                        }
                    }
                }
                if (z10) {
                    ((n0) this.G).f20394d = null;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    g0 g0Var = (g0) this.F;
                    g0Var.getClass();
                    g0Var.x((j0) this.E, jElapsedRealtime, jElapsedRealtime - this.f20380g, true);
                    this.F = null;
                    return;
                }
                return;
            default:
                this.D = z10;
                this.f20381r = null;
                if (hasMessages(0)) {
                    this.B = true;
                    removeMessages(0);
                    if (!z10) {
                        sendEmptyMessage(1);
                    }
                } else {
                    synchronized (this) {
                        try {
                            this.B = true;
                            ((r5.k) this.E).d();
                            Thread thread2 = this.f20383y;
                            if (thread2 != null) {
                                thread2.interrupt();
                            }
                        } finally {
                        }
                    }
                }
                if (z10) {
                    ((r5.n) this.G).f21251d = null;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    r5.i iVar = (r5.i) this.F;
                    iVar.getClass();
                    iVar.s((r5.k) this.E, jElapsedRealtime2, jElapsedRealtime2 - this.f20380g, true);
                    this.F = null;
                    return;
                }
                return;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f20378a) {
            case 0:
                if (this.D) {
                    return;
                }
                int i10 = message.what;
                if (i10 == 0) {
                    this.f20381r = null;
                    n0 n0Var = (n0) this.G;
                    ExecutorService executorService = n0Var.f20393a;
                    i0 i0Var = n0Var.f20394d;
                    i0Var.getClass();
                    executorService.execute(i0Var);
                    return;
                }
                if (i10 == 3) {
                    throw ((Error) message.obj);
                }
                ((n0) this.G).f20394d = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.f20380g;
                g0 g0Var = (g0) this.F;
                g0Var.getClass();
                if (this.B) {
                    g0Var.x((j0) this.E, jElapsedRealtime, j, false);
                    return;
                }
                int i11 = message.what;
                if (i11 == 1) {
                    try {
                        g0Var.K((j0) this.E, jElapsedRealtime, j);
                        return;
                    } catch (RuntimeException e4) {
                        qb.b.q("LoadTask", "Unexpected exception handling load completed", e4);
                        ((n0) this.G).f20395g = new m0(e4);
                        return;
                    }
                }
                if (i11 != 2) {
                    return;
                }
                IOException iOException = (IOException) message.obj;
                this.f20381r = iOException;
                int i12 = this.f20382x + 1;
                this.f20382x = i12;
                h0 h0VarQ = g0Var.q((j0) this.E, jElapsedRealtime, j, iOException, i12);
                int i13 = h0VarQ.f20376a;
                if (i13 == 3) {
                    ((n0) this.G).f20395g = this.f20381r;
                    return;
                }
                if (i13 != 2) {
                    if (i13 == 1) {
                        this.f20382x = 1;
                    }
                    long jMin = h0VarQ.f20377b;
                    if (jMin == -9223372036854775807L) {
                        jMin = Math.min((this.f20382x - 1) * 1000, 5000);
                    }
                    n0 n0Var2 = (n0) this.G;
                    qb.b.j(n0Var2.f20394d == null);
                    n0Var2.f20394d = this;
                    if (jMin > 0) {
                        sendEmptyMessageDelayed(0, jMin);
                        return;
                    } else {
                        this.f20381r = null;
                        n0Var2.f20393a.execute(this);
                        return;
                    }
                }
                return;
            default:
                if (this.D) {
                    return;
                }
                int i14 = message.what;
                if (i14 == 0) {
                    this.f20381r = null;
                    r5.n nVar = (r5.n) this.G;
                    ExecutorService executorService2 = nVar.f21250a;
                    i0 i0Var2 = nVar.f21251d;
                    i0Var2.getClass();
                    executorService2.execute(i0Var2);
                    return;
                }
                if (i14 == 3) {
                    throw ((Error) message.obj);
                }
                ((r5.n) this.G).f21251d = null;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long j7 = jElapsedRealtime2 - this.f20380g;
                r5.i iVar = (r5.i) this.F;
                iVar.getClass();
                if (this.B) {
                    iVar.s((r5.k) this.E, jElapsedRealtime2, j7, false);
                    return;
                }
                int i15 = message.what;
                if (i15 == 1) {
                    try {
                        iVar.r((r5.k) this.E, jElapsedRealtime2, j7);
                        return;
                    } catch (RuntimeException e10) {
                        a5.a.n("LoadTask", "Unexpected exception handling load completed", e10);
                        ((r5.n) this.G).f21252g = new r5.m(e10);
                        return;
                    }
                }
                if (i15 != 2) {
                    return;
                }
                IOException iOException2 = (IOException) message.obj;
                this.f20381r = iOException2;
                int i16 = this.f20382x + 1;
                this.f20382x = i16;
                r5.j jVarQ = iVar.q((r5.k) this.E, jElapsedRealtime2, j7, iOException2, i16);
                int i17 = jVarQ.f21245a;
                if (i17 == 3) {
                    ((r5.n) this.G).f21252g = this.f20381r;
                    return;
                }
                if (i17 != 2) {
                    if (i17 == 1) {
                        this.f20382x = 1;
                    }
                    long jMin2 = jVarQ.f21246b;
                    if (jMin2 == -9223372036854775807L) {
                        jMin2 = Math.min((this.f20382x - 1) * 1000, 5000);
                    }
                    r5.n nVar2 = (r5.n) this.G;
                    a5.a.i(nVar2.f21251d == null);
                    nVar2.f21251d = this;
                    if (jMin2 > 0) {
                        sendEmptyMessageDelayed(0, jMin2);
                        return;
                    } else {
                        this.f20381r = null;
                        nVar2.f21250a.execute(this);
                        return;
                    }
                }
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f20378a) {
            case 0:
                try {
                    synchronized (this) {
                        z10 = this.B;
                        this.f20383y = Thread.currentThread();
                    }
                    if (!z10) {
                        String simpleName = ((j0) this.E).getClass().getSimpleName();
                        qb.b.d(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                        try {
                            ((j0) this.E).c();
                            qb.b.r();
                        } catch (Throwable th2) {
                            qb.b.r();
                            throw th2;
                        }
                    }
                    synchronized (this) {
                        this.f20383y = null;
                        Thread.interrupted();
                    }
                    if (this.D) {
                        return;
                    }
                    sendEmptyMessage(1);
                    return;
                } catch (IOException e4) {
                    if (this.D) {
                        return;
                    }
                    obtainMessage(2, e4).sendToTarget();
                    return;
                } catch (Error e10) {
                    if (!this.D) {
                        qb.b.q("LoadTask", "Unexpected error loading stream", e10);
                        obtainMessage(3, e10).sendToTarget();
                    }
                    throw e10;
                } catch (Exception e11) {
                    if (this.D) {
                        return;
                    }
                    qb.b.q("LoadTask", "Unexpected exception loading stream", e11);
                    obtainMessage(2, new m0(e11)).sendToTarget();
                    return;
                } catch (OutOfMemoryError e12) {
                    if (this.D) {
                        return;
                    }
                    qb.b.q("LoadTask", "OutOfMemory error loading stream", e12);
                    obtainMessage(2, new m0(e12)).sendToTarget();
                    return;
                }
            default:
                try {
                    synchronized (this) {
                        z11 = this.B;
                        this.f20383y = Thread.currentThread();
                    }
                    if (!z11) {
                        a5.a.b("load:".concat(((r5.k) this.E).getClass().getSimpleName()));
                        try {
                            ((r5.k) this.E).c();
                            a5.a.o();
                        } catch (Throwable th3) {
                            a5.a.o();
                            throw th3;
                        }
                    }
                    synchronized (this) {
                        this.f20383y = null;
                        Thread.interrupted();
                    }
                    if (this.D) {
                        return;
                    }
                    sendEmptyMessage(1);
                    return;
                } catch (IOException e13) {
                    if (this.D) {
                        return;
                    }
                    obtainMessage(2, e13).sendToTarget();
                    return;
                } catch (Exception e14) {
                    if (this.D) {
                        return;
                    }
                    a5.a.n("LoadTask", "Unexpected exception loading stream", e14);
                    obtainMessage(2, new r5.m(e14)).sendToTarget();
                    return;
                } catch (OutOfMemoryError e15) {
                    if (this.D) {
                        return;
                    }
                    a5.a.n("LoadTask", "OutOfMemory error loading stream", e15);
                    obtainMessage(2, new r5.m(e15)).sendToTarget();
                    return;
                } catch (Error e16) {
                    if (!this.D) {
                        a5.a.n("LoadTask", "Unexpected error loading stream", e16);
                        obtainMessage(3, e16).sendToTarget();
                    }
                    throw e16;
                }
        }
    }
}
