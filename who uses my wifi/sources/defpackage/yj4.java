package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yj4 extends Handler implements Runnable {
    public final xh4 f;
    public bi4 g;
    public IOException h;
    public int i;
    public Thread j;
    public boolean k;
    public volatile boolean l;
    public final /* synthetic */ t83 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj4(t83 t83Var, Looper looper, xh4 xh4Var, bi4 bi4Var, long j) {
        super(looper);
        Objects.requireNonNull(t83Var);
        this.m = t83Var;
        this.f = xh4Var;
        this.g = bi4Var;
    }

    public final void a(boolean z) {
        this.l = z;
        this.h = null;
        if (hasMessages(1)) {
            this.k = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.k = true;
                    this.f.g = true;
                    Thread thread = this.j;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.m.h = null;
            SystemClock.elapsedRealtime();
            bi4 bi4Var = this.g;
            bi4Var.getClass();
            bi4Var.c(this.f, true);
            this.g = null;
        }
    }

    public final void b() {
        ch4 ch4Var;
        SystemClock.elapsedRealtime();
        bi4 bi4Var = this.g;
        bi4Var.getClass();
        int i = this.i;
        xh4 xh4Var = this.f;
        js3 js3Var = xh4Var.b;
        if (i == 0) {
            Uri uri = xh4Var.j.a;
            ch4Var = new ch4();
        } else {
            Uri uri2 = js3Var.g;
            ch4Var = new ch4();
        }
        wt2 wt2Var = bi4Var.i;
        wt2Var.n(new r2(wt2Var, ch4Var, new hh4(-1, null, v23.q(xh4Var.i), v23.q(bi4Var.E)), i, 7));
        this.h = null;
        t83 t83Var = this.m;
        yj4 yj4Var = (yj4) t83Var.h;
        yj4Var.getClass();
        ((ia1) t83Var.g).execute(yj4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        on1 on1Var;
        cg1 cg1Var;
        if (this.l) {
            return;
        }
        int i = message.what;
        int i2 = 1;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        t83 t83Var = this.m;
        t83Var.h = null;
        SystemClock.elapsedRealtime();
        bi4 bi4Var = this.g;
        bi4Var.getClass();
        if (this.k) {
            bi4Var.c(this.f, false);
            return;
        }
        int i3 = message.what;
        if (i3 == 2) {
            try {
                bi4Var.g(this.f);
                return;
            } catch (RuntimeException e) {
                a30.C("LoadTask", "Unexpected exception handling load completed", e);
                this.m.i = new ak4(e);
                return;
            }
        }
        if (i3 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.h = iOException;
        int i4 = this.i;
        this.i = i4 + 1;
        xh4 xh4Var = this.f;
        Uri uri = xh4Var.b.g;
        ch4 ch4Var = new ch4();
        String str = v23.a;
        if ((iOException instanceof lq1) || (iOException instanceof FileNotFoundException) || (iOException instanceof sm3) || (iOException instanceof ak4)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof di3) && ((di3) cause).f == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min(i4 * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            on1Var = t83.n;
        } else {
            int iX = bi4Var.x();
            int i5 = iX > bi4Var.P ? 1 : 0;
            if (bi4Var.L || !((cg1Var = bi4Var.D) == null || cg1Var.a() == -9223372036854775807L)) {
                bi4Var.P = iX;
            } else {
                boolean z = bi4Var.z;
                if (!z || bi4Var.q()) {
                    bi4Var.I = z;
                    bi4Var.M = 0L;
                    bi4Var.P = 0;
                    for (ki4 ki4Var : bi4Var.w) {
                        ki4Var.i(false);
                    }
                    xh4Var.f.a = 0L;
                    xh4Var.i = 0L;
                    i2 = 1;
                    xh4Var.h = true;
                    xh4Var.l = false;
                } else {
                    bi4Var.O = true;
                    on1Var = t83.m;
                }
            }
            on1Var = new on1(i5, jMin);
        }
        int i6 = on1Var.a;
        int i7 = (i6 == 0 || i6 == i2) ? i2 : 0;
        wt2 wt2Var = bi4Var.i;
        wt2Var.n(new de3(wt2Var, ch4Var, new hh4(-1, null, v23.q(xh4Var.i), v23.q(bi4Var.E)), iOException, i7 ^ 1));
        int i8 = on1Var.a;
        if (i8 == 3) {
            t83Var.i = this.h;
            return;
        }
        if (i8 != 2) {
            if (i8 == 1) {
                this.i = 1;
            }
            long jMin2 = on1Var.b;
            if (jMin2 == -9223372036854775807L) {
                jMin2 = Math.min((this.i - 1) * 1000, 5000);
            }
            t83 t83Var2 = this.m;
            zt0.b0(((yj4) t83Var2.h) == null);
            t83Var2.h = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(1, jMin2);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.k;
                this.j = Thread.currentThread();
            }
            if (!z) {
                xh4 xh4Var = this.f;
                String simpleName = xh4Var.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    xh4Var.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.j = null;
                Thread.interrupted();
            }
            if (this.l) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.l) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.l) {
                return;
            }
            a30.C("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new ak4(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.l) {
                return;
            }
            a30.C("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new ak4(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.l) {
                a30.C("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
