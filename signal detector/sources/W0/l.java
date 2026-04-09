package W0;

import C0.t;
import V0.m;
import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import e1.C2301d;
import f4.InterfaceFutureC2326a;
import h0.C2351a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: H, reason: collision with root package name */
    public static final String f3996H = m.h("WorkerWrapper");

    /* renamed from: C, reason: collision with root package name */
    public ArrayList f3997C;

    /* renamed from: D, reason: collision with root package name */
    public String f3998D;

    /* renamed from: E, reason: collision with root package name */
    public g1.k f3999E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceFutureC2326a f4000F;

    /* renamed from: G, reason: collision with root package name */
    public volatile boolean f4001G;

    /* renamed from: a, reason: collision with root package name */
    public Context f4002a;

    /* renamed from: b, reason: collision with root package name */
    public String f4003b;

    /* renamed from: c, reason: collision with root package name */
    public List f4004c;

    /* renamed from: d, reason: collision with root package name */
    public V2.e f4005d;

    /* renamed from: e, reason: collision with root package name */
    public e1.h f4006e;

    /* renamed from: f, reason: collision with root package name */
    public ListenableWorker f4007f;

    /* renamed from: g, reason: collision with root package name */
    public V2.e f4008g;

    /* renamed from: h, reason: collision with root package name */
    public V0.l f4009h;
    public V0.b i;

    /* renamed from: j, reason: collision with root package name */
    public b f4010j;

    /* renamed from: k, reason: collision with root package name */
    public WorkDatabase f4011k;

    /* renamed from: l, reason: collision with root package name */
    public K4.c f4012l;

    /* renamed from: m, reason: collision with root package name */
    public C2351a f4013m;

    /* renamed from: n, reason: collision with root package name */
    public V2.h f4014n;

    public final void a(V0.l lVar) {
        boolean z6 = lVar instanceof V0.k;
        String str = f3996H;
        if (!z6) {
            if (lVar instanceof V0.j) {
                m.f().g(str, A.f.l("Worker result RETRY for ", this.f3998D), new Throwable[0]);
                c();
                return;
            }
            m.f().g(str, A.f.l("Worker result FAILURE for ", this.f3998D), new Throwable[0]);
            if (this.f4006e.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        m.f().g(str, A.f.l("Worker result SUCCESS for ", this.f3998D), new Throwable[0]);
        if (this.f4006e.c()) {
            d();
            return;
        }
        C2351a c2351a = this.f4013m;
        String str2 = this.f4003b;
        K4.c cVar = this.f4012l;
        WorkDatabase workDatabase = this.f4011k;
        workDatabase.c();
        try {
            cVar.l(3, str2);
            cVar.j(str2, ((V0.k) this.f4009h).f3827a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayListC = c2351a.C(str2);
            int size = arrayListC.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListC.get(i);
                i++;
                String str3 = (String) obj;
                if (cVar.e(str3) == 5) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c2351a.f20441b;
                    t tVarA = t.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        tVarA.l(1);
                    } else {
                        tVarA.c(1, str3);
                    }
                    workDatabase_Impl.b();
                    Cursor cursorL = workDatabase_Impl.l(tVarA);
                    try {
                        if (cursorL.moveToFirst() && cursorL.getInt(0) != 0) {
                            m.f().g(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            cVar.l(1, str3);
                            cVar.k(jCurrentTimeMillis, str3);
                        }
                    } finally {
                        cursorL.close();
                        tVarA.b();
                    }
                }
            }
            workDatabase.m();
            workDatabase.j();
            e(false);
        } catch (Throwable th) {
            workDatabase.j();
            e(false);
            throw th;
        }
    }

    public final void b() {
        List list = this.f4004c;
        String str = this.f4003b;
        WorkDatabase workDatabase = this.f4011k;
        if (!h()) {
            workDatabase.c();
            try {
                int iE = this.f4012l.e(str);
                c1.g gVarS = workDatabase.s();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) gVarS.f5896b;
                workDatabase_Impl.b();
                C2301d c2301d = (C2301d) gVarS.f5898d;
                H0.j jVarA = c2301d.a();
                if (str == null) {
                    jVarA.l(1);
                } else {
                    jVarA.c(1, str);
                }
                workDatabase_Impl.c();
                try {
                    jVarA.b();
                    workDatabase_Impl.m();
                    if (iE == 0) {
                        e(false);
                    } else if (iE == 2) {
                        a(this.f4009h);
                    } else if (!A.f.b(iE)) {
                        c();
                    }
                    workDatabase.m();
                    workDatabase.j();
                } finally {
                    workDatabase_Impl.j();
                    c2301d.c(jVarA);
                }
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).d(str);
            }
            d.a(this.i, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f4003b;
        K4.c cVar = this.f4012l;
        WorkDatabase workDatabase = this.f4011k;
        workDatabase.c();
        try {
            cVar.l(1, str);
            cVar.k(System.currentTimeMillis(), str);
            cVar.i(-1L, str);
            workDatabase.m();
        } finally {
            workDatabase.j();
            e(true);
        }
    }

    public final void d() {
        String str = this.f4003b;
        K4.c cVar = this.f4012l;
        WorkDatabase workDatabase = this.f4011k;
        workDatabase.c();
        try {
            cVar.k(System.currentTimeMillis(), str);
            cVar.l(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f2209b;
            workDatabase_Impl.b();
            C2301d c2301d = (C2301d) cVar.i;
            H0.j jVarA = c2301d.a();
            if (str == null) {
                jVarA.l(1);
            } else {
                jVarA.c(1, str);
            }
            workDatabase_Impl.c();
            try {
                jVarA.b();
                workDatabase_Impl.m();
                workDatabase_Impl.j();
                c2301d.c(jVarA);
                cVar.i(-1L, str);
                workDatabase.m();
            } catch (Throwable th) {
                workDatabase_Impl.j();
                c2301d.c(jVarA);
                throw th;
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.f4011k
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.f4011k     // Catch: java.lang.Throwable -> L42
            K4.c r0 = r0.t()     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            C0.t r1 = C0.t.a(r2, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.f2209b     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0     // Catch: java.lang.Throwable -> L42
            r0.b()     // Catch: java.lang.Throwable -> L42
            android.database.Cursor r0 = r0.l(r1)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            r4 = 1
            if (r3 == 0) goto L31
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            r3 = r4
            goto L32
        L2f:
            r6 = move-exception
            goto L90
        L31:
            r3 = r2
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.b()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Context r0 = r5.f4002a     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            f1.g.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L97
        L44:
            if (r6 == 0) goto L5a
            K4.c r0 = r5.f4012l     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f4003b     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L42
            r0.l(r4, r1)     // Catch: java.lang.Throwable -> L42
            K4.c r0 = r5.f4012l     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f4003b     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.i(r2, r1)     // Catch: java.lang.Throwable -> L42
        L5a:
            e1.h r0 = r5.f4006e     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            androidx.work.ListenableWorker r0 = r5.f4007f     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            boolean r0 = r0.isRunInForeground()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            W0.b r0 = r5.f4010j     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f4003b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.f3965k     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r3 = r0.f3961f     // Catch: java.lang.Throwable -> L79
            r3.remove(r1)     // Catch: java.lang.Throwable -> L79
            r0.i()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            goto L7c
        L79:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r6     // Catch: java.lang.Throwable -> L42
        L7c:
            androidx.work.impl.WorkDatabase r0 = r5.f4011k     // Catch: java.lang.Throwable -> L42
            r0.m()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r5.f4011k
            r0.j()
            g1.k r0 = r5.f3999E
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.i(r6)
            return
        L90:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.b()     // Catch: java.lang.Throwable -> L42
            throw r6     // Catch: java.lang.Throwable -> L42
        L97:
            androidx.work.impl.WorkDatabase r0 = r5.f4011k
            r0.j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.l.e(boolean):void");
    }

    public final void f() {
        K4.c cVar = this.f4012l;
        String str = this.f4003b;
        int iE = cVar.e(str);
        String str2 = f3996H;
        if (iE == 2) {
            m.f().a(str2, A.f.m("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            e(true);
            return;
        }
        m mVarF = m.f();
        StringBuilder sbQ = AbstractC1135f5.q("Status for ", str, " is ");
        sbQ.append(A.f.A(iE));
        sbQ.append("; not doing any work");
        mVarF.a(str2, sbQ.toString(), new Throwable[0]);
        e(false);
    }

    public final void g() {
        String str = this.f4003b;
        WorkDatabase workDatabase = this.f4011k;
        workDatabase.c();
        try {
            K4.c cVar = this.f4012l;
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (cVar.e(str2) != 6) {
                    cVar.l(4, str2);
                }
                linkedList.addAll(this.f4013m.C(str2));
            }
            this.f4012l.j(str, ((V0.i) this.f4009h).f3826a);
            workDatabase.m();
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f4001G) {
            return false;
        }
        m.f().a(f3996H, A.f.l("Work interrupted for ", this.f3998D), new Throwable[0]);
        if (this.f4012l.e(this.f4003b) == 0) {
            e(false);
            return true;
        }
        e(!A.f.b(r0));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2 A[Catch: all -> 0x007e, TryCatch #4 {all -> 0x007e, blocks: (B:13:0x0055, B:16:0x005f, B:21:0x0081, B:23:0x0085, B:26:0x00ad, B:28:0x00b3, B:30:0x00b9, B:43:0x0101, B:35:0x00c2, B:38:0x00d1, B:40:0x00d9), top: B:113:0x0055 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.l.run():void");
    }
}
