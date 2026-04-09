package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class go2 extends f74 {
    public final ScheduledExecutorService i;
    public final ym j;
    public final mv2 k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public ScheduledFuture q;
    public ScheduledFuture r;

    public go2(ScheduledExecutorService scheduledExecutorService, ym ymVar, mv2 mv2Var) {
        super(Collections.EMPTY_SET);
        this.l = -1L;
        this.m = -1L;
        this.n = -1L;
        this.o = -1L;
        this.p = false;
        this.i = scheduledExecutorService;
        this.j = ymVar;
        this.k = mv2Var;
    }

    public final synchronized void U1(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i);
        gi2.G(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.p) {
                long j = this.n;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.n = millis;
                return;
            }
            this.j.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iz1 iz1Var = mz1.ae;
            tw1 tw1Var = tw1.e;
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                long j2 = this.l;
                if (jElapsedRealtime >= j2 || j2 - jElapsedRealtime > millis) {
                    W1(millis);
                    if (((Boolean) tw1Var.c.a(mz1.qe)).booleanValue()) {
                        lv2 lv2VarA = this.k.a();
                        lv2VarA.k("action", "rtnc");
                        lv2VarA.o();
                    }
                }
            } else {
                long j3 = this.l;
                if (jElapsedRealtime > j3 || j3 - jElapsedRealtime > millis) {
                    W1(millis);
                }
            }
        }
    }

    public final synchronized void V1(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i);
        gi2.G(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.p) {
                long j = this.o;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.o = millis;
                return;
            }
            this.j.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) tw1.e.c.a(mz1.ae)).booleanValue()) {
                if (jElapsedRealtime == this.m) {
                    gi2.G("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j2 = this.m;
                if (jElapsedRealtime >= j2 || j2 - jElapsedRealtime > millis) {
                    X1(millis);
                }
            } else {
                long j3 = this.m;
                if (jElapsedRealtime > j3 || j3 - jElapsedRealtime > millis) {
                    X1(millis);
                }
            }
        }
    }

    public final synchronized void W1(long j) {
        try {
            ScheduledFuture scheduledFuture = this.q;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.q.cancel(false);
            }
            this.j.getClass();
            this.l = SystemClock.elapsedRealtime() + j;
            this.q = this.i.schedule(new fo2(this, 0), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void X1(long j) {
        try {
            ScheduledFuture scheduledFuture = this.r;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.r.cancel(false);
            }
            this.j.getClass();
            this.m = SystemClock.elapsedRealtime() + j;
            this.r = this.i.schedule(new fo2(this, 1), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void r() {
        this.p = false;
        W1(0L);
    }
}
