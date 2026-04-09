package defpackage;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wa1 implements Runnable {
    public static final String y = h80.f("WorkerWrapper");
    public Context f;
    public String g;
    public List h;
    public t83 i;
    public oa1 j;
    public ListenableWorker k;
    public xb4 l;
    public r70 m;
    public ru0 n;
    public om0 o;
    public WorkDatabase p;
    public h2 q;
    public l92 r;
    public l92 s;
    public ArrayList t;
    public String u;
    public ou0 v;
    public n70 w;
    public volatile boolean x;

    public final void a(r70 r70Var) {
        if (!(r70Var instanceof q70)) {
            if (r70Var instanceof p70) {
                h80.d().e(new Throwable[0]);
                c();
                return;
            }
            h80.d().e(new Throwable[0]);
            if (this.j.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        h80.d().e(new Throwable[0]);
        if (this.j.c()) {
            d();
            return;
        }
        l92 l92Var = this.r;
        String str = this.g;
        h2 h2Var = this.q;
        WorkDatabase workDatabase = this.p;
        workDatabase.c();
        try {
            h2Var.n(3, str);
            h2Var.l(str, ((q70) this.m).a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayListX = l92Var.x(str);
            int size = arrayListX.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListX.get(i);
                i++;
                String str2 = (String) obj;
                if (h2Var.e(str2) == 5) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) l92Var.f;
                    rq0 rq0VarF = rq0.f("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                    if (str2 == null) {
                        rq0VarF.h(1);
                    } else {
                        rq0VarF.i(str2, 1);
                    }
                    workDatabase_Impl.b();
                    Cursor cursorG = workDatabase_Impl.g(rq0VarF);
                    try {
                        if (cursorG.moveToFirst() && cursorG.getInt(0) != 0) {
                            h80.d().e(new Throwable[0]);
                            h2Var.n(1, str2);
                            h2Var.m(str2, jCurrentTimeMillis);
                        }
                    } finally {
                        cursorG.close();
                        rq0VarF.k();
                    }
                }
            }
            workDatabase.h();
            workDatabase.f();
            e(false);
        } catch (Throwable th) {
            workDatabase.f();
            e(false);
            throw th;
        }
    }

    public final void b() {
        List list = this.h;
        String str = this.g;
        WorkDatabase workDatabase = this.p;
        if (!h()) {
            workDatabase.c();
            try {
                int iE = this.q.e(str);
                mc2 mc2VarM = workDatabase.m();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) mc2VarM.g;
                workDatabase_Impl.b();
                tz0 tz0Var = (tz0) mc2VarM.i;
                px pxVarA = tz0Var.a();
                if (str == null) {
                    pxVarA.g(1);
                } else {
                    pxVarA.h(str, 1);
                }
                workDatabase_Impl.c();
                try {
                    pxVarA.t();
                    workDatabase_Impl.h();
                    if (iE == 0) {
                        e(false);
                    } else if (iE == 2) {
                        a(this.m);
                    } else if (!ga1.a(iE)) {
                        c();
                    }
                    workDatabase.h();
                    workDatabase.f();
                } finally {
                    workDatabase_Impl.f();
                    tz0Var.c(pxVarA);
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((et0) it.next()).b(str);
            }
            gt0.a(this.n, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.g;
        h2 h2Var = this.q;
        WorkDatabase workDatabase = this.p;
        workDatabase.c();
        try {
            h2Var.n(1, str);
            h2Var.m(str, System.currentTimeMillis());
            h2Var.j(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(true);
        }
    }

    public final void d() {
        String str = this.g;
        h2 h2Var = this.q;
        WorkDatabase workDatabase = this.p;
        workDatabase.c();
        try {
            h2Var.m(str, System.currentTimeMillis());
            h2Var.n(1, str);
            h2Var.k(str);
            h2Var.j(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
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
            androidx.work.impl.WorkDatabase r0 = r5.p
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.p     // Catch: java.lang.Throwable -> L42
            h2 r0 = r0.n()     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            rq0 r1 = defpackage.rq0.f(r1, r2)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.a     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0     // Catch: java.lang.Throwable -> L42
            r0.b()     // Catch: java.lang.Throwable -> L42
            android.database.Cursor r0 = r0.g(r1)     // Catch: java.lang.Throwable -> L42
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
            r1.k()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Context r0 = r5.f     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            defpackage.yj0.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L97
        L44:
            if (r6 == 0) goto L5a
            h2 r0 = r5.q     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.g     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L42
            r0.n(r4, r1)     // Catch: java.lang.Throwable -> L42
            h2 r0 = r5.q     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.g     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.j(r1, r2)     // Catch: java.lang.Throwable -> L42
        L5a:
            oa1 r0 = r5.j     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            androidx.work.ListenableWorker r0 = r5.k     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            boolean r0 = r0.isRunInForeground()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            om0 r0 = r5.o     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.g     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.p     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r3 = r0.k     // Catch: java.lang.Throwable -> L79
            r3.remove(r1)     // Catch: java.lang.Throwable -> L79
            r0.h()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            goto L7c
        L79:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r6     // Catch: java.lang.Throwable -> L42
        L7c:
            androidx.work.impl.WorkDatabase r0 = r5.p     // Catch: java.lang.Throwable -> L42
            r0.h()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r5.p
            r0.f()
            ou0 r0 = r5.v
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.i(r6)
            return
        L90:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.k()     // Catch: java.lang.Throwable -> L42
            throw r6     // Catch: java.lang.Throwable -> L42
        L97:
            androidx.work.impl.WorkDatabase r0 = r5.p
            r0.f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa1.e(boolean):void");
    }

    public final void f() {
        if (this.q.e(this.g) == 2) {
            h80.d().a(new Throwable[0]);
            e(true);
        } else {
            h80.d().a(new Throwable[0]);
            e(false);
        }
    }

    public final void g() {
        h2 h2Var = this.q;
        String str = this.g;
        WorkDatabase workDatabase = this.p;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (h2Var.e(str2) != 6) {
                    h2Var.n(4, str2);
                }
                linkedList.addAll(this.r.x(str2));
            }
            h2Var.l(str, ((o70) this.m).a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.x) {
            return false;
        }
        h80.d().a(new Throwable[0]);
        if (this.q.e(this.g) == 0) {
            e(false);
            return true;
        }
        e(!ga1.a(r0));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6 A[Catch: all -> 0x0083, TryCatch #2 {all -> 0x0083, blocks: (B:13:0x005a, B:16:0x0064, B:21:0x0086, B:23:0x008a, B:26:0x00a1, B:28:0x00a7, B:30:0x00ad, B:43:0x00e4, B:35:0x00b6, B:38:0x00c5, B:40:0x00cd), top: B:101:0x005a }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa1.run():void");
    }
}
