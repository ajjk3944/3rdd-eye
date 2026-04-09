package io.sentry.android.core;

import android.content.res.Configuration;
import com.google.android.gms.internal.measurement.e5;
import io.sentry.b5;
import io.sentry.x5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11800a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f11801d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11802g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f11803r;

    public /* synthetic */ z(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, Configuration configuration) {
        this.f11800a = 0;
        this.f11802g = appComponentsBreadcrumbsIntegration;
        this.f11801d = j;
        this.f11803r = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i10 = this.f11800a;
        io.sentry.protocol.e eVar = null;
        int i11 = 0;
        long j = this.f11801d;
        Object obj = this.f11803r;
        Object obj2 = this.f11802g;
        switch (i10) {
            case 0:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj2;
                Configuration configuration = (Configuration) obj;
                if (appComponentsBreadcrumbsIntegration.f11489d != null) {
                    int i12 = appComponentsBreadcrumbsIntegration.f11488a.getResources().getConfiguration().orientation;
                    if (i12 == 1) {
                        eVar = io.sentry.protocol.e.PORTRAIT;
                    } else if (i12 == 2) {
                        eVar = io.sentry.protocol.e.LANDSCAPE;
                    }
                    String lowerCase = eVar != null ? eVar.name().toLowerCase(Locale.ROOT) : "undefined";
                    io.sentry.e eVar2 = new io.sentry.e(j);
                    eVar2.f12204x = "navigation";
                    eVar2.B = "device.orientation";
                    eVar2.b(lowerCase, "position");
                    eVar2.E = b5.INFO;
                    io.sentry.h0 h0Var = new io.sentry.h0();
                    h0Var.c(configuration, "android:configuration");
                    appComponentsBreadcrumbsIntegration.f11489d.g(eVar2, h0Var);
                    return;
                }
                return;
            case 1:
                io.sentry.android.replay.capture.g gVar = (io.sentry.android.replay.capture.g) obj2;
                b1.d dVar = (b1.d) obj;
                io.sentry.android.replay.j jVar = gVar.f11868h;
                if (jVar != null) {
                    dVar.w(jVar, Long.valueOf(j));
                }
                long jD = gVar.f11887t.d() - gVar.f11885r.getSessionReplay().f12080g;
                io.sentry.android.replay.j jVar2 = gVar.f11868h;
                String strQ = jVar2 != null ? jVar2.q(jD) : null;
                io.sentry.android.replay.capture.b bVar = gVar.f11870l;
                ir.v vVar = io.sentry.android.replay.capture.c.f11860q[2];
                bVar.getClass();
                br.l.e(vVar, "property");
                Object andSet = bVar.f11857b.getAndSet(strQ);
                if (!br.l.a(andSet, strQ)) {
                    io.sentry.android.replay.capture.a aVar = new io.sentry.android.replay.capture.a(andSet, strQ, bVar.f11859d, 3);
                    io.sentry.android.replay.capture.c cVar = bVar.f11858c;
                    x5 x5Var = cVar.f11861a;
                    if (x5Var.getThreadChecker().c()) {
                        ((ScheduledExecutorService) cVar.f11865e.getValue()).submit(new io.sentry.android.replay.util.c(new b4.e(17, aVar), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            aVar.c();
                        } catch (Throwable th2) {
                            x5Var.getLogger().g(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                        }
                    }
                }
                ArrayList arrayList = gVar.f11889v;
                br.t tVar = new br.t();
                mq.t.e0(arrayList, new io.sentry.android.replay.i(gVar, jD, tVar, 1));
                if (tVar.f2914a) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i13 = i11 + 1;
                        if (i11 < 0) {
                            e5.Q();
                            throw null;
                        }
                        io.sentry.android.replay.capture.j jVar3 = (io.sentry.android.replay.capture.j) next;
                        jVar3.f11890a.P = i11;
                        List<io.sentry.rrweb.b> list = jVar3.f11891b.f12423d;
                        if (list != null) {
                            for (io.sentry.rrweb.b bVar2 : list) {
                                if (bVar2 instanceof io.sentry.rrweb.m) {
                                    ((io.sentry.rrweb.m) bVar2).f12724r = i11;
                                }
                            }
                        }
                        i11 = i13;
                    }
                    return;
                }
                return;
            case 2:
                rb.u uVar = (rb.u) ((q3.a) obj2).f20680g;
                int i14 = qb.v.f20828a;
                uVar.onRenderedFirstFrame(obj, j);
                return;
            default:
                d5.w wVar = (d5.w) ((q3.a) obj2).f20680g;
                int i15 = a5.d0.f105a;
                d5.z zVar = wVar.f7095a;
                zVar.O.onRenderedFirstFrame(obj, j);
                if (zVar.f7131s0 == obj) {
                    zVar.I.f(26, new d5.v(0));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ z(Object obj, Object obj2, long j, int i10) {
        this.f11800a = i10;
        this.f11802g = obj;
        this.f11803r = obj2;
        this.f11801d = j;
    }
}
