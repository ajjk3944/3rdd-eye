package jh;

import android.content.Context;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import ch.f;
import ch.i;
import ch.n;
import ih.d;
import ih.e;
import ih.m;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c extends e {
    public i4.b D;
    public final Context E;
    public final TelephonyManager F;
    public final ag.b G;
    public final f H;
    public final io.sentry.internal.debugmeta.c I;
    public final i J;
    public final ThreadFactory K;
    public final AtomicBoolean L;
    public final AtomicBoolean M;

    public c(Context context, TelephonyManager telephonyManager, ag.b bVar, long j, int i10, dh.e eVar, f fVar, io.sentry.internal.debugmeta.c cVar, i iVar, ThreadFactory threadFactory) {
        super(j, i10, eVar);
        this.L = new AtomicBoolean(false);
        this.M = new AtomicBoolean(false);
        this.E = context;
        this.F = telephonyManager;
        this.G = bVar;
        this.H = fVar;
        this.I = cVar;
        this.K = threadFactory;
        this.f11384s = new fm.b(this, d.DOWNLOAD, 1);
        this.J = iVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ih.c, mi.f] */
    public static void m(c cVar, int i10) {
        boolean zIsEmpty;
        long j;
        synchronized (cVar) {
            zIsEmpty = cVar.f11389x.isEmpty();
        }
        if (zIsEmpty || cVar.f11371d) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!cVar.f11372e.getAndSet(true)) {
            long j7 = jElapsedRealtime - cVar.f11376i;
            m mVar = cVar.f11370c;
            mVar.f11430x = j7;
            cVar.k = jElapsedRealtime;
            ?? r02 = cVar.f11385t;
            if (r02 != 0) {
                r02.b(mVar);
            }
            cVar.g("DATA_TRANSFER_STARTED", null);
            cVar.n();
            return;
        }
        long j10 = i10;
        synchronized (cVar) {
            cVar.f11380o += j10;
        }
        if (cVar.f11371d) {
            return;
        }
        synchronized (cVar) {
            j = cVar.j;
        }
        if (jElapsedRealtime > j + cVar.A) {
            synchronized (cVar) {
                cVar.j = jElapsedRealtime;
            }
            cVar.f11370c.a(jElapsedRealtime - cVar.k);
            cVar.f11370c.b(cVar.f11380o);
            cVar.f();
        }
    }

    public final void n() {
        if (this.f11374g.getAndSet(true)) {
            return;
        }
        n.b("DownloadTest", "STARTING COUNTDOWN");
        this.f11382q.schedule(this.f11384s, this.f11378m);
    }
}
