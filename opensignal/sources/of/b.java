package of;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import bk.c;
import br.l;
import ch.n;
import com.google.android.gms.internal.measurement.e5;
import ek.h;
import h9.r2;
import io.sentry.android.core.e0;
import io.sentry.android.core.u0;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import jj.y;
import js.e;
import js.o;
import js.p;
import kg.r;
import lf.z0;
import p.l2;
import qs.g;
import rr.o0;
import t9.d;
import vs.f;
import vs.i;
import vs.s;
import vs.u;
import wt.w;
import wt.z;
import xi.q;

/* loaded from: classes.dex */
public final class b implements o, o9.b, c {
    public Object B;

    /* renamed from: a, reason: collision with root package name */
    public final Object f19421a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19422d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f19423g;

    /* renamed from: r, reason: collision with root package name */
    public Object f19424r;

    /* renamed from: x, reason: collision with root package name */
    public Object f19425x;

    /* renamed from: y, reason: collision with root package name */
    public Object f19426y;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f19421a = obj;
        this.f19422d = obj2;
        this.f19423g = obj3;
        this.f19424r = obj4;
        this.f19425x = obj5;
        this.f19426y = obj6;
        this.B = obj7;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v8, types: [ar.a, br.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0082 -> B:20:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(of.b r9, java.util.LinkedHashSet r10, rq.c r11) {
        /*
            boolean r0 = r11 instanceof cq.e
            if (r0 == 0) goto L13
            r0 = r11
            cq.e r0 = (cq.e) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            cq.e r0 = new cq.e
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.D
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            long r9 = r0.B
            long r4 = r0.f6618y
            java.util.Iterator r2 = r0.f6617x
            of.b r6 = r0.f6616r
            lf.t1.G(r11)
            r10 = r9
            r9 = r6
            goto L85
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            lf.t1.G(r11)
            java.util.List r10 = mq.o.L0(r10)
            java.util.Iterator r10 = r10.iterator()
            r4 = 0
            r2 = r10
        L47:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L97
            java.lang.Object r10 = r2.next()
            java.lang.Number r10 = (java.lang.Number) r10
            long r10 = r10.longValue()
            long r10 = r10 - r4
            java.lang.Object r6 = r9.f19422d
            no.b r6 = (no.b) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Scheduling event delay: "
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r8 = " ms"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            sm.f r6 = (sm.f) r6
            r6.M(r7)
            r0.f6616r = r9
            r0.f6617x = r2
            r0.f6618y = r4
            r0.B = r10
            r0.F = r3
            java.lang.Object r6 = wt.w.h(r10, r0)
            if (r6 != r1) goto L85
            return r1
        L85:
            java.lang.Object r6 = r9.f19422d
            no.b r6 = (no.b) r6
            sm.f r6 = (sm.f) r6
            r6.getClass()
            java.lang.Object r6 = r9.B
            br.n r6 = (br.n) r6
            r6.c()
            long r4 = r4 + r10
            goto L47
        L97:
            lq.b0 r9 = lq.b0.f15562a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: of.b.a(of.b, java.util.LinkedHashSet, rq.c):java.lang.Object");
    }

    public static synchronized void g(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                file.toString();
                Log.isLoggable("FirebaseCrashlytics", 3);
                file.delete();
            }
            if (!file.mkdirs()) {
                e0.c("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean h(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                h(file2);
            }
        }
        return file.delete();
    }

    public static List m(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    @Override // js.o
    public o K(qs.b bVar, g gVar) {
        ArrayList arrayList = new ArrayList();
        return new cj.a(((r2) this.f19421a).D0(bVar, o0.f21696s, arrayList), this, gVar, arrayList);
    }

    @Override // js.o
    public void M(g gVar, f fVar) {
        ((HashMap) this.f19422d).put(gVar, new u(new s(fVar)));
    }

    @Override // js.o
    public p P(g gVar) {
        return new e((r2) this.f19421a, gVar, this);
    }

    @Override // js.o
    public void b() {
        r2 r2Var = (r2) this.f19423g;
        qs.b bVar = (qs.b) this.f19425x;
        HashMap map = (HashMap) this.f19422d;
        l.e(map, "arguments");
        boolean zA0 = false;
        if (bVar.equals(nr.a.f18518b)) {
            Object obj = map.get(g.e("value"));
            u uVar = obj instanceof u ? (u) obj : null;
            if (uVar != null) {
                Object obj2 = uVar.f23957a;
                s sVar = obj2 instanceof s ? (s) obj2 : null;
                if (sVar != null) {
                    zA0 = r2Var.A0(sVar.f23966a.f23955a);
                }
            }
        }
        if (zA0 || r2Var.A0(bVar)) {
            return;
        }
        ((List) this.f19426y).add(new sr.c(((rr.f) this.f19424r).q(), map, (o0) this.B));
    }

    public void c(String str) {
        File file = new File((File) this.f19422d, str);
        if (file.exists() && h(file)) {
            file.getPath();
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f19423g
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            java.lang.Object r1 = r4.f19423g     // Catch: java.lang.Throwable -> L58
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L58
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L58
            monitor-exit(r0)
            java.lang.Object r0 = r4.f19424r
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L26
            java.lang.Object r1 = r4.f19424r     // Catch: java.lang.Throwable -> L23
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L23
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L26
            r1 = r3
            goto L27
        L23:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L26:
            r1 = r2
        L27:
            monitor-exit(r0)
            java.lang.Object r0 = r4.f19425x
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r4.f19425x     // Catch: java.lang.Throwable -> L3b
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3e
            r1 = r3
            goto L3f
        L3b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L3e:
            r1 = r2
        L3f:
            monitor-exit(r0)
            java.lang.Object r0 = r4.f19426y
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            if (r1 == 0) goto L56
            java.lang.Object r1 = r4.f19426y     // Catch: java.lang.Throwable -> L53
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L53
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L56
            r2 = r3
            goto L56
        L53:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L56:
            monitor-exit(r0)
            return r2
        L58:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: of.b.d():boolean");
    }

    public File e(String str, String str2) {
        File file = new File((File) this.f19424r, str);
        file.mkdirs();
        return new File(file, str2);
    }

    @Override // bk.c
    public void f(y yVar) {
        synchronized (((ArrayList) this.f19426y)) {
            try {
                if (!((ArrayList) this.f19426y).contains(yVar)) {
                    if (d()) {
                        i();
                    }
                    ((ArrayList) this.f19426y).add(yVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kq.a
    public Object get() {
        return new al.b((Context) ((kq.a) this.f19421a).get(), (n9.e) ((kq.a) this.f19422d).get(), (d) ((kq.a) this.f19423g).get(), (qm.c) ((qm.c) this.f19424r).get(), (Executor) ((kq.a) this.f19425x).get(), (u9.c) ((kq.a) this.f19426y).get(), new et.d(), new ee.f(27), (t9.c) ((kq.a) this.B).get());
    }

    public void i() {
        if (((ag.b) this.f19422d).i("android.permission.ACCESS_NETWORK_STATE")) {
            try {
                ((ConnectivityManager) this.f19421a).registerDefaultNetworkCallback((ti.a) this.B);
            } catch (Exception e4) {
                n.e("PostApi24NetworkCallbackMonitor", e4);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void j() {
        ((u0) ((iq.f) this.f19421a)).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ?? r22 = this.f19425x;
        ArrayList arrayList = new ArrayList();
        for (Object obj : r22) {
            cq.c cVar = (cq.c) obj;
            if (cVar.f6614c - (jCurrentTimeMillis - cVar.f6612a.f6608c) > 0) {
                arrayList.add(obj);
            }
        }
        this.f19425x = arrayList;
    }

    @Override // bk.c
    public void k(y yVar) {
        synchronized (((ArrayList) this.f19426y)) {
            boolean zD = d();
            ((ArrayList) this.f19426y).remove(yVar);
            boolean z10 = d() != zD;
            if (d() && z10) {
                w();
            }
        }
    }

    @Override // js.o
    public void l(g gVar, Object obj) {
        ((HashMap) this.f19422d).put(gVar, r2.u((r2) this.f19421a, gVar, obj));
    }

    @Override // bk.c
    public void n(ek.g gVar) {
        synchronized (((ArrayList) this.f19423g)) {
            boolean zD = d();
            ((ArrayList) this.f19423g).remove(gVar);
            boolean z10 = d() != zD;
            if (d() && z10) {
                w();
            }
        }
    }

    @Override // bk.c
    public void o(h hVar) {
        synchronized (((ArrayList) this.f19424r)) {
            try {
                if (!((ArrayList) this.f19424r).contains(hVar)) {
                    if (d()) {
                        i();
                    }
                    ((ArrayList) this.f19424r).add(hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // bk.c
    public void p(ek.g gVar) {
        synchronized (((ArrayList) this.f19423g)) {
            try {
                if (!((ArrayList) this.f19423g).contains(gVar)) {
                    if (d()) {
                        i();
                    }
                    ((ArrayList) this.f19423g).add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // js.o
    public void q(g gVar, qs.b bVar, g gVar2) {
        ((HashMap) this.f19422d).put(gVar, new i(bVar, gVar2));
    }

    @Override // bk.c
    public void r(h hVar) {
        synchronized (((ArrayList) this.f19424r)) {
            boolean zD = d();
            ((ArrayList) this.f19424r).remove(hVar);
            boolean z10 = d() != zD;
            if (d() && z10) {
                w();
            }
        }
    }

    @Override // bk.c
    public void s(q qVar) {
        synchronized (((ArrayList) this.f19425x)) {
            try {
                if (!((ArrayList) this.f19425x).contains(qVar)) {
                    if (d()) {
                        i();
                    }
                    ((ArrayList) this.f19425x).add(qVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object] */
    public void t(cq.a aVar) {
        String str = aVar.f6606a;
        z zVar = (z) this.f19426y;
        pq.c cVar = null;
        if (zVar != null) {
            zVar.h(null);
        }
        ?? r12 = this.f19425x;
        ArrayList arrayList = new ArrayList(mq.p.a0(r12, 10));
        for (cq.c cVar2 : r12) {
            if (cVar2.f6612a.f6606a.equals(str)) {
                cq.a aVar2 = cVar2.f6612a;
                cq.a aVar3 = new cq.a(aVar2.f6606a, aVar2.f6607b, aVar2.f6608c, aVar.f6609d);
                String str2 = cVar2.f6613b;
                long j = cVar2.f6614c;
                l.e(str2, "surveyId");
                cVar2 = new cq.c(aVar3, str2, j);
            }
            arrayList.add(cVar2);
        }
        List list = (List) this.f19424r;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (l.a(((cq.f) obj).f6619a, str)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(mq.p.a0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            cq.f fVar = (cq.f) it.next();
            arrayList3.add(new cq.c(aVar, fVar.f6620b, fVar.f6621c));
        }
        ArrayList arrayListE0 = mq.o.E0(arrayList, arrayList3);
        this.f19425x = arrayListE0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayListE0.iterator();
        while (it2.hasNext()) {
            cq.c cVar3 = (cq.c) it2.next();
            ((u0) ((iq.f) this.f19421a)).getClass();
            long jCurrentTimeMillis = cVar3.f6614c - (System.currentTimeMillis() - cVar3.f6612a.f6608c);
            if (jCurrentTimeMillis > 0) {
                linkedHashSet.add(Long.valueOf(jCurrentTimeMillis));
            }
        }
        this.f19426y = w.s((bu.c) this.f19423g, null, null, new a8.h(this, linkedHashSet, cVar, 4), 3);
    }

    public void u(hk.h hVar) {
        if (hVar.f10820s) {
            n.b("TaskExecutor", c7.a.o(hVar, new StringBuilder(), " Start intensive work"));
            ((AtomicBoolean) ((l2) this.f19426y).f20100d).set(true);
        }
    }

    public void v(hk.h hVar) {
        r2 r2Var = (r2) this.f19425x;
        l.e(hVar, "task");
        n.b("TaskExecutor", hVar.c() + " Stop task " + hVar.f10805b);
        ((hk.d) this.f19421a).c(hVar);
        ((hk.d) this.f19422d).c(hVar);
        int i10 = 0;
        if (hVar.f10820s) {
            n.b("TaskExecutor", c7.a.o(hVar, new StringBuilder(), " Stop intensive work"));
            ((AtomicBoolean) ((l2) this.f19426y).f20100d).set(false);
        }
        if (!((ak.g) ((q3.a) this.B).f20680g).f529f.f449a.f492w) {
            ((hk.d) this.f19424r).c(hVar);
        } else if (hVar.f10809f.b()) {
            List listC = ((h9.p) r2Var.f10472g).c();
            if (!listC.isEmpty()) {
                Iterator it = listC.iterator();
                while (it.hasNext()) {
                    if (((hk.h) it.next()).f10809f.b() && (i10 = i10 + 1) < 0) {
                        e5.P();
                        throw null;
                    }
                }
            }
            n.b("TaskExecutor", hVar.c() + " totalLongRunningTasks: " + i10);
            if (i10 == 1) {
                n.b("TaskExecutor", c7.a.o(hVar, new StringBuilder(), " Is last long running task. Stop service."));
                ((hk.d) this.f19423g).c(hVar);
            }
        } else {
            n.b("TaskExecutor", c7.a.o(hVar, new StringBuilder(), " is NOT long running. Ignore long running service."));
        }
        r2Var.T0(hVar);
    }

    public void w() {
        if (((ag.b) this.f19422d).i("android.permission.ACCESS_NETWORK_STATE")) {
            try {
                ((ConnectivityManager) this.f19421a).unregisterNetworkCallback((ti.a) this.B);
            } catch (Exception e4) {
                n.e("PostApi24NetworkCallbackMonitor", e4);
            }
        }
    }

    @Override // bk.c
    public void x(q qVar) {
        synchronized (((ArrayList) this.f19425x)) {
            boolean zD = d();
            ((ArrayList) this.f19425x).remove(qVar);
            boolean z10 = d() != zD;
            if (d() && z10) {
                w();
            }
        }
    }

    public hk.h y(hk.h hVar) {
        n.b("TaskExecutor", hVar.c() + " Unschedule task " + hVar.f10805b);
        r2 r2Var = (r2) this.f19425x;
        hk.h hVarR0 = r2Var.r0(hVar);
        hk.h hVarG = hVarR0 != null ? hk.h.b(hVarR0, 0L, null, null, null, null, false, hVar.C, -268566529).g() : hk.h.b(hVar, 0L, null, null, null, null, false, null, -131073).g();
        r2Var.s1(hVarG, false);
        ((hk.d) this.f19421a).i(hVarG);
        ((hk.d) this.f19422d).i(hVarG);
        return hVarG;
    }

    public b(bm.d dVar, cj.a aVar, r rVar, bm.d dVar2, al.g gVar, r2 r2Var, l2 l2Var, q3.a aVar2) {
        l.e(dVar, "shortPipeline");
        l.e(aVar, "longPipeline");
        l.e(rVar, "longRunningPipeline");
        l.e(dVar2, "keepAlivePipeline");
        this.f19421a = dVar;
        this.f19422d = aVar;
        this.f19423g = rVar;
        this.f19424r = dVar2;
        this.f19425x = r2Var;
        this.f19426y = l2Var;
        this.B = aVar2;
        n.b("TaskExecutor", "Using " + cj.a.class.getSimpleName() + " for the long pipeline");
    }

    public b(ConnectivityManager connectivityManager, ag.b bVar) {
        this.f19421a = connectivityManager;
        this.f19422d = bVar;
        this.f19423g = new ArrayList();
        this.f19424r = new ArrayList();
        this.f19425x = new ArrayList();
        this.f19426y = new ArrayList();
        this.B = new ti.a(this);
    }

    public b(iq.f fVar, no.b bVar, xt.c cVar) {
        l.e(fVar, "timestampProvider");
        l.e(bVar, "logger");
        l.e(cVar, "mainDispatcher");
        this.f19421a = fVar;
        this.f19422d = bVar;
        this.f19423g = w.b(cVar);
        mq.w wVar = mq.w.f16945a;
        this.f19424r = wVar;
        this.f19425x = wVar;
        this.B = cq.d.f6615d;
    }

    public b(Context context) throws NoSuchAlgorithmException {
        String string;
        String strReplaceAll;
        String str = ((z0) ef.d.f8190a.b(context)).f15482a;
        this.f19421a = str;
        File filesDir = context.getFilesDir();
        this.f19422d = filesDir;
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
            sb2.append(File.separator);
            if (str.length() > 40) {
                strReplaceAll = hf.f.h(str);
            } else {
                strReplaceAll = str.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb2.append(strReplaceAll);
            string = sb2.toString();
        } else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, string);
        g(file);
        this.f19423g = file;
        File file2 = new File(file, "open-sessions");
        g(file2);
        this.f19424r = file2;
        File file3 = new File(file, "reports");
        g(file3);
        this.f19425x = file3;
        File file4 = new File(file, "priority-reports");
        g(file4);
        this.f19426y = file4;
        File file5 = new File(file, "native-reports");
        g(file5);
        this.B = file5;
    }

    public b(r2 r2Var, rr.f fVar, qs.b bVar, List list, o0 o0Var) {
        this.f19423g = r2Var;
        this.f19424r = fVar;
        this.f19425x = bVar;
        this.f19426y = list;
        this.B = o0Var;
        this.f19421a = r2Var;
        this.f19422d = new HashMap();
    }
}
