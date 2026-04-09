package pb;

import android.net.TrafficStats;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import lf.t1;
import zc.p3;

/* loaded from: classes.dex */
public final class l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20388a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20389d;

    public /* synthetic */ l0(int i10, Object obj) {
        this.f20388a = i10;
        this.f20389d = obj;
    }

    private final void a() {
        ru.a aVarC;
        long jNanoTime;
        while (true) {
            ru.c cVar = (ru.c) this.f20389d;
            synchronized (cVar) {
                aVarC = cVar.c();
            }
            if (aVarC == null) {
                return;
            }
            ru.b bVar = aVarC.f21802c;
            br.l.b(bVar);
            ru.c cVar2 = (ru.c) this.f20389d;
            boolean zIsLoggable = ru.c.f21811i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = System.nanoTime();
                t1.a(aVarC, bVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                ru.c.a(cVar2, aVarC);
                if (zIsLoggable) {
                    t1.a(aVarC, bVar, "finished run in ".concat(t1.n(System.nanoTime() - jNanoTime)));
                }
            } finally {
            }
        }
    }

    private final void b() throws InterruptedException {
        int i10 = ((ag.b) ((su.l) this.f20389d).f22358c).f345d;
        long uidRxBytes = TrafficStats.getUidRxBytes(i10);
        long uidTxBytes = TrafficStats.getUidTxBytes(i10);
        while (!Thread.currentThread().isInterrupted()) {
            int i11 = ((ag.b) ((su.l) this.f20389d).f22358c).f345d;
            long uidRxBytes2 = TrafficStats.getUidRxBytes(i11) - uidRxBytes;
            long uidTxBytes2 = TrafficStats.getUidTxBytes(i11) - uidTxBytes;
            dv.d dVar = new dv.d(uidRxBytes2, uidTxBytes2);
            ch.n.b("ContinuousTrafficStatsDetector", String.format(Locale.US, "[DOWNLOAD] %.02f MB - [UPLOAD] %.02f MB", Double.valueOf(uidRxBytes2 / 1048576.0d), Double.valueOf(uidTxBytes2 / 1048576.0d)));
            oh.t tVar = (oh.t) ((o2.g) ((su.l) this.f20389d).f22360e).f18754d;
            long jUptimeMillis = SystemClock.uptimeMillis() - tVar.N;
            synchronized (tVar.G) {
                ArrayList arrayList = tVar.G;
                wh.g gVar = new wh.g();
                gVar.f24529a = dVar;
                gVar.f24530b = jUptimeMillis;
                arrayList.add(gVar);
            }
            io.sentry.config.a.h0(((su.l) this.f20389d).f22357b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x04d6, code lost:
    
        if (r11 < 10) goto L190;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0563 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x035d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.l0.run():void");
    }

    public l0(zc.o0 o0Var, boolean z10) {
        this.f20388a = 12;
        this.f20389d = o0Var;
    }

    public l0(p3 p3Var, j4.k kVar) {
        this.f20388a = 16;
        this.f20389d = p3Var;
    }
}
