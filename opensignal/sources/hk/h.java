package hk;

import ak.s;
import ak.u;
import android.content.ContentValues;
import android.os.SystemClock;
import as.x;
import ch.n;
import com.google.android.gms.internal.measurement.e5;
import h9.r2;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import lq.q;
import mq.o;
import mq.p;
import mq.w;
import p.l2;

/* loaded from: classes.dex */
public final class h {
    public final List A;
    public final int B;
    public u C;
    public final String D;
    public final xi.j E;
    public final cj.a F;
    public final fh.f G;
    public final df.c H;
    public final boolean I;
    public final io.sentry.hints.i J;
    public final zh.a K;
    public long L;
    public final ArrayList M;
    public m N;
    public bj.b O;
    public final Object P;
    public f Q;
    public String R;
    public String S;
    public final b T;
    public final q U;

    /* renamed from: a, reason: collision with root package name */
    public final long f10804a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10805b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10806c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10807d;

    /* renamed from: e, reason: collision with root package name */
    public final List f10808e;

    /* renamed from: f, reason: collision with root package name */
    public final gk.c f10809f;

    /* renamed from: g, reason: collision with root package name */
    public final List f10810g;

    /* renamed from: h, reason: collision with root package name */
    public final ek.c f10811h;

    /* renamed from: i, reason: collision with root package name */
    public final r2 f10812i;
    public final l2 j;
    public final bj.c k;

    /* renamed from: l, reason: collision with root package name */
    public final r2 f10813l;

    /* renamed from: m, reason: collision with root package name */
    public final ek.c f10814m;

    /* renamed from: n, reason: collision with root package name */
    public final q3.a f10815n;

    /* renamed from: o, reason: collision with root package name */
    public final xi.u f10816o;

    /* renamed from: p, reason: collision with root package name */
    public final m f10817p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f10818q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f10819r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f10820s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f10821t;

    /* renamed from: u, reason: collision with root package name */
    public final String f10822u;

    /* renamed from: v, reason: collision with root package name */
    public final String f10823v;

    /* renamed from: w, reason: collision with root package name */
    public final long f10824w;

    /* renamed from: x, reason: collision with root package name */
    public final long f10825x;

    /* renamed from: y, reason: collision with root package name */
    public final mj.b f10826y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f10827z;

    public h(long j, String str, String str2, List list, List list2, gk.c cVar, List list3, ek.c cVar2, r2 r2Var, l2 l2Var, bj.c cVar3, r2 r2Var2, ek.c cVar4, q3.a aVar, xi.u uVar, m mVar, boolean z10, boolean z11, boolean z12, boolean z13, String str3, String str4, long j7, long j10, mj.b bVar, boolean z14, List list4, int i10, u uVar2, String str5, xi.j jVar, cj.a aVar2, fh.f fVar, df.c cVar5, boolean z15, io.sentry.hints.i iVar, zh.a aVar3) {
        br.l.e(str, "name");
        br.l.e(str2, "dataEndpoint");
        br.l.e(cVar, "schedule");
        br.l.e(mVar, "initialState");
        br.l.e(str3, "rescheduleOnFailFromThisJobOnwards");
        br.l.e(str4, "rescheduleOnInterruptFromThisJobOnwards");
        br.l.e(bVar, "dataUsageLimitsAppStatusMode");
        br.l.e(list4, "crossTaskDelayGroups");
        br.l.e(uVar2, "lastLocation");
        this.f10804a = j;
        this.f10805b = str;
        this.f10806c = str2;
        this.f10807d = list;
        this.f10808e = list2;
        this.f10809f = cVar;
        this.f10810g = list3;
        this.f10811h = cVar2;
        this.f10812i = r2Var;
        this.j = l2Var;
        this.k = cVar3;
        this.f10813l = r2Var2;
        this.f10814m = cVar4;
        this.f10815n = aVar;
        this.f10816o = uVar;
        this.f10817p = mVar;
        this.f10818q = z10;
        this.f10819r = z11;
        this.f10820s = z12;
        this.f10821t = z13;
        this.f10822u = str3;
        this.f10823v = str4;
        this.f10824w = j7;
        this.f10825x = j10;
        this.f10826y = bVar;
        this.f10827z = z14;
        this.A = list4;
        this.B = i10;
        this.C = uVar2;
        this.D = str5;
        this.E = jVar;
        this.F = aVar2;
        this.G = fVar;
        this.H = cVar5;
        this.I = z15;
        this.J = iVar;
        this.K = aVar3;
        this.L = -1L;
        this.M = new ArrayList();
        this.N = m.READY;
        this.P = new Object();
        this.T = new b(j7, j10, bVar);
        this.U = kc.f.F(new x(29, this));
        this.N = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.List] */
    public static h b(h hVar, long j, String str, gk.c cVar, ArrayList arrayList, m mVar, boolean z10, u uVar, int i10) {
        long j7 = (i10 & 1) != 0 ? hVar.f10804a : j;
        String str2 = (i10 & 2) != 0 ? hVar.f10805b : str;
        String str3 = hVar.f10806c;
        int i11 = i10 & 8;
        List list = w.f16945a;
        List list2 = i11 != 0 ? hVar.f10807d : list;
        if ((i10 & 16) != 0) {
            list = hVar.f10808e;
        }
        List list3 = list;
        gk.c cVar2 = (i10 & 32) != 0 ? hVar.f10809f : cVar;
        ArrayList arrayList2 = (i10 & 64) != 0 ? hVar.f10810g : arrayList;
        ek.c cVar3 = hVar.f10811h;
        r2 r2Var = hVar.f10812i;
        l2 l2Var = hVar.j;
        bj.c cVar4 = hVar.k;
        r2 r2Var2 = hVar.f10813l;
        ek.c cVar5 = hVar.f10814m;
        q3.a aVar = hVar.f10815n;
        long j10 = j7;
        xi.u uVar2 = hVar.f10816o;
        m mVar2 = (i10 & 32768) != 0 ? hVar.f10817p : mVar;
        boolean z11 = hVar.f10818q;
        boolean z12 = (i10 & 131072) != 0 ? hVar.f10819r : z10;
        boolean z13 = (i10 & 262144) != 0 ? hVar.f10820s : false;
        boolean z14 = (i10 & 524288) != 0 ? hVar.f10821t : false;
        String str4 = hVar.f10822u;
        String str5 = hVar.f10823v;
        long j11 = hVar.f10824w;
        long j12 = hVar.f10825x;
        mj.b bVar = hVar.f10826y;
        boolean z15 = hVar.f10827z;
        List list4 = hVar.A;
        int i12 = hVar.B;
        u uVar3 = (i10 & 268435456) != 0 ? hVar.C : uVar;
        String str6 = hVar.D;
        xi.j jVar = hVar.E;
        cj.a aVar2 = hVar.F;
        fh.f fVar = hVar.G;
        df.c cVar6 = hVar.H;
        boolean z16 = hVar.I;
        io.sentry.hints.i iVar = hVar.J;
        zh.a aVar3 = hVar.K;
        hVar.getClass();
        br.l.e(str2, "name");
        br.l.e(str3, "dataEndpoint");
        br.l.e(list2, "executeTriggers");
        br.l.e(list3, "interruptionTriggers");
        br.l.e(cVar2, "schedule");
        br.l.e(arrayList2, "jobs");
        br.l.e(cVar3, "jobResultRepository");
        br.l.e(r2Var, "sharedJobDataRepository");
        br.l.e(l2Var, "privacyRepository");
        br.l.e(cVar4, "taskNetworkStatsCollectorFactory");
        br.l.e(r2Var2, "systemStatus");
        br.l.e(cVar5, "taskStatsRepository");
        br.l.e(aVar, "configRepository");
        br.l.e(uVar2, "locationRepository");
        br.l.e(mVar2, "initialState");
        br.l.e(str4, "rescheduleOnFailFromThisJobOnwards");
        br.l.e(str5, "rescheduleOnInterruptFromThisJobOnwards");
        br.l.e(bVar, "dataUsageLimitsAppStatusMode");
        br.l.e(list4, "crossTaskDelayGroups");
        br.l.e(uVar3, "lastLocation");
        br.l.e(jVar, "connectionRepository");
        br.l.e(aVar2, "qosResultsRepository");
        br.l.e(fVar, "eventRecorder");
        br.l.e(cVar6, "dateTimeRepository");
        br.l.e(iVar, "jobIdFactory");
        br.l.e(aVar3, "continuousNetworkDetector");
        return new h(j10, str2, str3, list2, list3, cVar2, arrayList2, cVar3, r2Var, l2Var, cVar4, r2Var2, cVar5, aVar, uVar2, mVar2, z11, z12, z13, z14, str4, str5, j11, j12, bVar, z15, list4, i12, uVar3, str6, jVar, aVar2, fVar, cVar6, z16, iVar, aVar3);
    }

    public final long a() {
        this.H.getClass();
        return TimeUnit.MILLISECONDS.convert(SystemClock.elapsedRealtimeNanos() - this.L, TimeUnit.NANOSECONDS);
    }

    public final String c() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f10805b);
        sb2.append(':');
        return w.g.h(sb2, this.f10804a, ']');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(String str, vj.c cVar) {
        vj.c cVar2;
        String str2;
        int i10;
        boolean z10;
        ek.c cVar3;
        h hVar = this;
        br.l.e(str, "jobName");
        hVar.c();
        Objects.toString(cVar);
        n.a();
        f fVar = hVar.Q;
        if (fVar != null) {
            cVar2 = cVar;
            fVar.d(hVar.f10804a, str, cVar2, hVar.f10809f.f9624l);
        } else {
            cVar2 = cVar;
        }
        if (hVar.I) {
            hVar.G.h(new fh.e("JOB_COMPLETED", new fh.d[]{new fh.d(str, "JOB_NAME")}, hVar.a(), 0));
        }
        if (cVar2 != null) {
            r2 r2Var = hVar.f10812i;
            long j = hVar.f10804a;
            r2Var.getClass();
            synchronized (((HashMap) r2Var.f10474x)) {
                try {
                    ArrayList arrayList = (ArrayList) ((HashMap) r2Var.f10474x).get(Long.valueOf(j));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cVar2);
                    ((HashMap) r2Var.f10474x).put(Long.valueOf(j), arrayList);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            synchronized (hVar.P) {
                hVar.M.add(cVar2);
            }
        }
        if (str.equals("SEND_RESULTS") || str.equals("SEND_MLVIS_LOGS")) {
            hVar.i();
            synchronized (hVar.P) {
                hVar.M.clear();
            }
        }
        List list = hVar.f10810g;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((vj.b) it.next()).f23923g != vj.e.FINISHED) {
                    return;
                }
            }
        }
        if (hVar.N != m.UNSCHEDULED) {
            if (cVar2 != null) {
                n.a();
                cVar2.toString();
                n.a();
                m mVar = m.COMPLETED;
                hVar.N = mVar;
                if (hVar.I) {
                    hVar.G.h(new fh.e("TASK_STATUS_CHANGED", new fh.d[]{new fh.d(mVar, "TASK_STATUS")}, hVar.a(), 0));
                }
                bj.b bVar = hVar.O;
                if (bVar != null) {
                    yi.e eVar = bVar.f2783b;
                    int i11 = bVar.f2788g;
                    long jG = eVar.g(i11);
                    long jE = eVar.e(i11);
                    long jA = eVar.a(i11);
                    long j7 = jG - bVar.j;
                    long j10 = jE - bVar.k;
                    long j11 = jA - bVar.f2791l;
                    nj.b bVarK = bVar.f2782a.k();
                    String str3 = bVar.f2786e;
                    if (br.l.a(str3, "manual_video")) {
                        z10 = 1;
                        i10 = 1;
                    } else {
                        i10 = 1;
                        z10 = bVar.f2787f;
                    }
                    int i12 = bVar.f2790i;
                    int iE = bVar.f2785d.e();
                    long j12 = bVar.f2792m;
                    boolean z11 = bVar.f2789h;
                    br.l.e(str3, "taskName");
                    br.l.e(bVarK, "networkGeneration");
                    long jN = ee.f.n(str3, z10, j7);
                    long jM = ee.f.m(str3, z10, j7);
                    long jN2 = ee.f.n(str3, z10, j11);
                    long jM2 = ee.f.m(str3, z10, j11);
                    long jN3 = ee.f.n(str3, z10, j10);
                    long jM3 = ee.f.m(str3, z10, j10);
                    int i13 = z10;
                    int i14 = i10;
                    bj.a aVar = new bj.a(str3, i12, iE, bVarK, j12, i13, !z10, jN, jM, jN2, jM2, jN3, jM3, z11);
                    n.b("TaskKlass", c() + " Data usage " + aVar);
                    hVar = this;
                    ek.c cVar4 = hVar.f10814m;
                    cVar4.getClass();
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.setTime(new Date(j12));
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                    gregorianCalendar2.clear();
                    gregorianCalendar2.set(i14, gregorianCalendar.get(i14));
                    gregorianCalendar2.set(2, gregorianCalendar.get(2));
                    gregorianCalendar2.set(5, gregorianCalendar.get(5));
                    long timeInMillis = gregorianCalendar2.getTimeInMillis();
                    qj.a aVar2 = cVar4.f8192a;
                    hi.a aVar3 = cVar4.f8193b;
                    rj.e eVar2 = (rj.e) o.t0(aVar2.j(aVar3, e5.I("task_name", "network_type", "network_connection_type", "network_generation", "consumption_date"), e5.I(str3, String.valueOf(i12), String.valueOf(iE), bVarK.toString(), String.valueOf(timeInMillis))));
                    if (eVar2 != null) {
                        int i15 = eVar2.f21584g;
                        int i16 = eVar2.f21585h;
                        long j13 = Long.parseLong(eVar2.f21586i) + jN;
                        long j14 = Long.parseLong(eVar2.j) + jM;
                        long j15 = Long.parseLong(eVar2.f21588m) + jN3;
                        int i17 = i15;
                        long j16 = Long.parseLong(eVar2.f21589n) + jM3;
                        long j17 = Long.parseLong(eVar2.k) + jN2;
                        long j18 = Long.parseLong(eVar2.f21587l) + jM2;
                        String strValueOf = String.valueOf(timeInMillis);
                        if (i13 > 0) {
                            i17++;
                        }
                        int i18 = i17;
                        if (i13 <= 0) {
                            i16++;
                        }
                        int i19 = i16;
                        String strValueOf2 = String.valueOf(j13);
                        String strValueOf3 = String.valueOf(j14);
                        String strValueOf4 = String.valueOf(j15);
                        String strValueOf5 = String.valueOf(j16);
                        String strValueOf6 = String.valueOf(j17);
                        String strValueOf7 = String.valueOf(j18);
                        long j19 = eVar2.f21578a;
                        String str4 = eVar2.f21579b;
                        int i20 = eVar2.f21580c;
                        int i21 = eVar2.f21581d;
                        String str5 = eVar2.f21582e;
                        boolean z12 = eVar2.f21590o;
                        br.l.e(str4, "taskName");
                        br.l.e(str5, "networkGeneration");
                        br.l.e(strValueOf, "consumptionForDay");
                        br.l.e(strValueOf2, "foregroundDataUsage");
                        br.l.e(strValueOf3, "backgroundDataUsage");
                        br.l.e(strValueOf6, "foregroundDownloadDataUsage");
                        br.l.e(strValueOf7, "backgroundDownloadDataUsage");
                        br.l.e(strValueOf4, "foregroundUploadDataUsage");
                        br.l.e(strValueOf5, "backgroundUploadDataUsage");
                        aVar2.g(aVar3, aVar3.k(new rj.e(j19, str4, i20, i21, str5, strValueOf, i18, i19, strValueOf2, strValueOf3, strValueOf6, strValueOf7, strValueOf4, strValueOf5, z12)), j19);
                        cVar3 = cVar4;
                    } else {
                        cVar3 = cVar4;
                        rj.e eVar3 = (rj.e) cVar3.f8194c.g(aVar);
                        n.b("DatabaseTaskStatsRepository", "addDataUsage: " + eVar3);
                        if (eVar3 != null) {
                            ContentValues contentValuesK = aVar3.k(eVar3);
                            contentValuesK.put("consumption_date", Long.valueOf(timeInMillis));
                            contentValuesK.remove("id");
                            aVar2.k(aVar3, contentValuesK);
                        } else {
                            n.c("DatabaseTaskStatsRepository", "Row to insert is null for " + aVar);
                        }
                    }
                    qj.a aVar4 = cVar3.f8192a;
                    hi.a aVar5 = cVar3.f8193b;
                    w wVar = w.f16945a;
                    ArrayList arrayListJ = aVar4.j(aVar5, wVar, wVar);
                    ArrayList arrayList2 = new ArrayList(p.a0(arrayListJ, 10));
                    Iterator it2 = arrayListJ.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Long.valueOf(((rj.e) it2.next()).f21578a));
                    }
                    int size = arrayList2.size() - 2000;
                    if (size > 0) {
                        n.b("DatabaseTaskStatsRepository", aVar2.h(aVar3, o.N0(size, arrayList2)) + " rows deleted");
                    }
                }
                hVar.i();
                hVar.h();
                xi.j jVar = hVar.E;
                long j20 = hVar.f10804a;
                long jF = cVar.f();
                ConcurrentHashMap concurrentHashMap = jVar.N;
                ConcurrentHashMap concurrentHashMap2 = jVar.O;
                StringBuilder sbK = w.g.k(j20, "recordTaskEnded called with: taskId = ", ", time = ");
                sbK.append(jF);
                n.b("DeviceConnectionRepository", sbK.toString());
                if (((ak.g) jVar.G.f20680g).f529f.f449a.f485p && (str2 = (String) concurrentHashMap2.get(Long.valueOf(j20))) != null) {
                    s sVar = (s) concurrentHashMap.get(str2);
                    if (sVar != null) {
                        concurrentHashMap.put(sVar.f656a, s.a(sVar, null, Long.valueOf(jF), 520191));
                        jVar.d();
                    }
                    concurrentHashMap2.remove(Long.valueOf(j20));
                }
                hVar.C = hVar.f10816o.G;
                f fVar2 = hVar.Q;
                if (fVar2 != null) {
                    fVar2.a(hVar, cVar);
                }
            }
            hVar.f10812i.U0(hVar.f10804a);
        }
    }

    public final void e(String str, String str2) {
        br.l.e(str, "jobName");
        br.l.e(str2, "error");
        n.c("TaskKlass", c() + " Error on job " + str);
        this.N = m.ERROR;
        this.R = str;
        if (this.I) {
            fh.e eVar = new fh.e("JOB_ERROR", new fh.d[]{new fh.d(str, "JOB_NAME"), new fh.d(str2, "JOB_ERROR")}, a(), 0);
            fh.f fVar = this.G;
            fVar.h(eVar);
            fVar.h(new fh.e("TASK_STATUS_CHANGED", new fh.d[]{new fh.d(this.N, "TASK_STATUS")}, a(), 0));
        }
        h();
        k(false);
        f fVar2 = this.Q;
        if (fVar2 != null) {
            fVar2.c(this.f10804a, str, this, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c5, code lost:
    
        r1 = r8.f10827z;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.h.equals(java.lang.Object):boolean");
    }

    public final void f(String str, vj.c cVar) {
        br.l.e(str, "jobName");
        br.l.e(cVar, "result");
        n.b("TaskKlass", c() + " onResult() for " + str);
        f fVar = this.Q;
        if (fVar != null) {
            fVar.f(this.f10804a, str, cVar, this.f10809f.f9624l);
        }
    }

    public final h g() {
        m mVar = m.READY;
        this.N = mVar;
        return b(this, 0L, null, null, null, mVar, false, null, -32769);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00da A[Catch: all -> 0x00c9, TryCatch #0 {, blocks: (B:18:0x0082, B:20:0x0086, B:22:0x008e, B:23:0x00b6, B:26:0x00be, B:32:0x00cd, B:33:0x00ce, B:34:0x00d4, B:36:0x00da, B:38:0x00ec, B:39:0x00f0, B:42:0x00fb, B:45:0x010a, B:48:0x010d, B:49:0x010e, B:24:0x00b7, B:25:0x00bd, B:40:0x00f1, B:44:0x00fd), top: B:54:0x0082, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.h.h():void");
    }

    public final int hashCode() {
        int iB = h0.b.b(h0.b.b(c7.a.g(this.f10823v, c7.a.g(this.f10822u, w.g.b((this.N.hashCode() + ((this.M.hashCode() + w.g.b(w.g.b(w.g.b((this.f10817p.hashCode() + h0.b.c((this.f10809f.hashCode() + h0.b.c(h0.b.c(c7.a.g(this.f10806c, c7.a.g(this.f10805b, Long.hashCode(this.f10804a) * 31, 31), 31), 31, this.f10807d), 31, this.f10808e)) * 31, 31, this.f10810g)) * 31, this.f10818q, 31), this.f10819r, 31), this.f10820s, 31)) * 31)) * 31, this.f10821t, 31), 31), 31), 31, this.f10825x), 31, this.f10824w);
        boolean z10 = this.f10827z;
        int iHashCode = (this.C.hashCode() + c7.a.C(this.B, h0.b.c(w.g.b((this.f10826y.hashCode() + w.g.b(iB, z10, 31)) * 31, z10, 31), 31, this.A), 31)) * 31;
        String str = this.D;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void i() {
        synchronized (this.P) {
            if (!this.M.isEmpty() && this.F.I(this.f10810g)) {
                this.F.n(this.M);
            }
        }
    }

    public final void j() {
        m mVar = this.N;
        m mVar2 = m.STARTED;
        if (mVar == mVar2) {
            n.b("TaskKlass", c7.a.o(this, new StringBuilder(), " Cannot start jobs that have already started"));
            return;
        }
        this.N = mVar2;
        this.H.getClass();
        this.L = SystemClock.elapsedRealtimeNanos();
        fh.f fVar = this.G;
        boolean z10 = this.I;
        if (z10) {
            fVar.h(new fh.e("TASK_STATUS_CHANGED", new fh.d[]{new fh.d(this.N, "TASK_STATUS"), new fh.d(Long.valueOf(System.currentTimeMillis()), "ABSOLUTE_TIME")}, a(), 0));
        }
        f fVar2 = this.Q;
        if (fVar2 != null) {
            fVar2.e(this);
        }
        Boolean boolM0 = this.f10813l.m0();
        boolean zBooleanValue = boolM0 == null ? false : boolM0.booleanValue();
        bj.c cVar = this.k;
        cVar.getClass();
        String str = this.f10805b;
        br.l.e(str, "taskName");
        fj.g gVar = (fj.g) cVar.f2795g;
        yi.e eVar = (yi.e) cVar.f2796r;
        df.c cVar2 = (df.c) cVar.f2797x;
        al.b bVar = (al.b) cVar.f2798y;
        int i10 = cVar.f2794d;
        bj.b bVar2 = new bj.b(gVar, eVar, cVar2, bVar, str, zBooleanValue, i10, this.f10827z);
        this.O = bVar2;
        bVar2.j = eVar.g(i10);
        bVar2.k = eVar.e(i10);
        bVar2.f2791l = eVar.a(i10);
        bVar2.f2792m = System.currentTimeMillis();
        List<vj.b> list = this.f10810g;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((vj.b) it.next()).E = this;
        }
        if (list.isEmpty()) {
            e("", "No job found for this task: ".concat(str));
            return;
        }
        q qVar = this.U;
        zh.a aVar = this.K;
        if (z10) {
            ak.d dVar = ((ak.g) qVar.getValue()).f529f.f449a;
            aVar.a();
            aVar.f27407f = dVar.f490u;
            aVar.f27408g = dVar.f491v;
            aVar.b(new g(this, fVar, 0));
            aVar.c();
        }
        for (vj.b bVar3 : list) {
            ak.g gVar2 = (ak.g) qVar.getValue();
            bVar3.getClass();
            br.l.e(gVar2, "config");
            bVar3.f23925x = gVar2;
            n.b("TaskKlass", c() + " Ready to start job = [" + bVar3.f() + "] with state = [" + this.N + ']');
            if (br.l.a(bVar3.f(), "SEND_RESULTS")) {
                h();
            }
            m mVar3 = this.N;
            if (mVar3 != m.ERROR && mVar3 != m.STOPPED) {
                n.b("TaskKlass", c() + " Start job " + bVar3.f());
                bVar3.k(this.f10806c, this.f10809f.f9624l, this.f10804a);
            }
        }
        if (z10) {
            aVar.a();
            aVar.b(null);
        }
    }

    public final void k(boolean z10) {
        f fVar;
        StringBuilder sb2 = new StringBuilder("Stopping jobs for ");
        String str = this.f10805b;
        sb2.append(str);
        sb2.append(" task (id: ");
        long j = this.f10804a;
        n.b("TaskKlass", w.g.h(sb2, j, ')'));
        if (this.N != m.STARTED) {
            n.b("TaskKlass", c() + " Task " + str + " not started. state=" + this.N + ". Not stopping its jobs");
            return;
        }
        m mVar = m.STOPPED;
        this.N = mVar;
        if (this.I) {
            this.G.h(new fh.e("TASK_STATUS_CHANGED", new fh.d[]{new fh.d(mVar, "TASK_STATUS")}, a(), 0));
        }
        boolean z11 = ((ak.g) this.U.getValue()).f529f.f449a.A;
        for (vj.b bVar : this.f10810g) {
            n.b("TaskKlass", c() + " stopJobs() for task: " + bVar.f23922d + " called with: job = " + bVar.f() + " in state: " + bVar.f23923g);
            vj.e eVar = bVar.f23923g;
            vj.e eVar2 = vj.e.STARTED;
            if (eVar == eVar2 && z11) {
                n.b("TaskKlass", c() + " Job " + bVar.f() + " is Running. Stopping it.");
                bVar.l(j);
                String strF = bVar.f();
                if (this.S == null) {
                    this.S = strF;
                }
            } else if (eVar == eVar2 && !z11) {
                n.b("TaskKlass", c() + " Job " + bVar.f() + " is Running. Do not stop, keep executing it.");
            } else if (eVar == vj.e.READY) {
                n.b("TaskKlass", c() + " Job " + bVar.f() + " stopping running job.");
                bVar.l(j);
                String strF2 = bVar.f();
                if (this.S == null) {
                    this.S = strF2;
                }
            }
        }
        this.f10812i.U0(j);
        if (!z10 || (fVar = this.Q) == null) {
            return;
        }
        fVar.b(this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task(id=");
        sb2.append(this.f10804a);
        sb2.append(", name='");
        sb2.append(this.f10805b);
        sb2.append("', dataEndpoint='");
        sb2.append(this.f10806c);
        sb2.append("', jobs=");
        List list = this.f10810g;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((vj.b) it.next()).f());
        }
        sb2.append(arrayList);
        sb2.append(", initialState=");
        sb2.append(this.f10817p);
        sb2.append(", savePartialJobsResults=");
        sb2.append(this.f10818q);
        sb2.append(", isScheduledInPipeline=");
        sb2.append(this.f10819r);
        sb2.append(", isNetworkIntensive=");
        sb2.append(this.f10820s);
        sb2.append(", useCrossTaskDelay=");
        sb2.append(this.f10821t);
        sb2.append(", excludedFromSdkDataUsageLimits=");
        sb2.append(this.f10827z);
        sb2.append(", crossTaskDelayGroups=");
        sb2.append(this.A);
        sb2.append(", priority=");
        sb2.append(this.B);
        sb2.append(", location=");
        sb2.append(this.C);
        sb2.append(", state=");
        sb2.append(this.N);
        sb2.append(", dataUsageLimits=");
        sb2.append(this.T);
        sb2.append(", loggingPrefix='");
        sb2.append(c());
        sb2.append("')");
        return sb2.toString();
    }

    public h(long j, String str, String str2, List list, List list2, gk.c cVar, List list3, ek.c cVar2, r2 r2Var, l2 l2Var, bj.c cVar3, r2 r2Var2, ek.c cVar4, q3.a aVar, xi.u uVar, boolean z10, boolean z11, boolean z12, String str3, String str4, long j7, long j10, mj.b bVar, boolean z13, List list4, int i10, String str5, xi.j jVar, cj.a aVar2, fh.f fVar, df.c cVar5, boolean z14, io.sentry.hints.i iVar, zh.a aVar3, int i11) {
        this(j, str, str2, list, list2, cVar, list3, cVar2, r2Var, l2Var, cVar3, r2Var2, cVar4, aVar, uVar, m.READY, z10, false, z11, z12, str3, str4, (i11 & 4194304) != 0 ? 0L : j7, (i11 & 8388608) != 0 ? 0L : j10, (i11 & 16777216) != 0 ? c.f10801a : bVar, z13, (i11 & 67108864) != 0 ? new ArrayList() : list4, (i11 & 134217728) != 0 ? 0 : i10, i.f10828a, (i11 & 536870912) != 0 ? null : str5, jVar, aVar2, fVar, cVar5, z14, iVar, aVar3);
    }
}
