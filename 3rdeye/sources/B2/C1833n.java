package b2;

import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;
import s5.C5576b;

/* compiled from: SystemIdInfoDao_Impl.java */
/* renamed from: b2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1833n implements InterfaceC1829j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17124a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17125b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17126c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17127d;

    public C1833n(WorkDatabase_Impl workDatabase_Impl) {
        this.f17124a = workDatabase_Impl;
        this.f17125b = new C1830k(workDatabase_Impl);
        this.f17126c = new C1831l(workDatabase_Impl, 0);
        this.f17127d = new C1832m(workDatabase_Impl, 0);
    }

    @Override // b2.InterfaceC1829j
    public ArrayList a() throws IOException {
        w1.o oVarD = w1.o.d(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f17124a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                arrayList.add(cursorY.isNull(0) ? null : cursorY.getString(0));
            }
            return arrayList;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    @Override // b2.InterfaceC1829j
    public C1828i b(C1834o c1834o) throws IOException {
        w1.o oVarD = w1.o.d(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        String str = c1834o.f17128a;
        if (str == null) {
            oVarD.f(1);
        } else {
            oVarD.h(1, str);
        }
        oVarD.b(2, c1834o.f17129b);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f17124a;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            int iB = C1.a.b(cursorY, "work_spec_id");
            int iB2 = C1.a.b(cursorY, "generation");
            int iB3 = C1.a.b(cursorY, "system_id");
            C1828i c1828i = null;
            String string = null;
            if (cursorY.moveToFirst()) {
                if (!cursorY.isNull(iB)) {
                    string = cursorY.getString(iB);
                }
                c1828i = new C1828i(string, cursorY.getInt(iB2), cursorY.getInt(iB3));
            }
            return c1828i;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    @Override // b2.InterfaceC1829j
    public void c(C1834o c1834o) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f17124a;
        workDatabase_Impl.b();
        C1831l c1831l = (C1831l) this.f17126c;
        F1.f fVarC = c1831l.c();
        String str = c1834o.f17128a;
        if (str == null) {
            fVarC.f(1);
        } else {
            fVarC.h(1, str);
        }
        fVarC.b(2, c1834o.f17129b);
        workDatabase_Impl.c();
        try {
            fVarC.G();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
            c1831l.h(fVarC);
        }
    }

    @Override // b2.InterfaceC1829j
    public void d(C1828i c1828i) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f17124a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((C1830k) this.f17125b).j(c1828i);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
        }
    }

    @Override // b2.InterfaceC1829j
    public void e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f17124a;
        workDatabase_Impl.b();
        C1832m c1832m = (C1832m) this.f17127d;
        F1.f fVarC = c1832m.c();
        if (str == null) {
            fVarC.f(1);
        } else {
            fVarC.h(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarC.G();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
            c1832m.h(fVarC);
        }
    }

    public synchronized void f() {
        if (!((LinkedHashSet) this.f17124a).isEmpty()) {
            ((com.google.firebase.remoteconfig.internal.e) this.f17125b).e(0L);
        }
    }

    public C1833n(B4.e eVar, h5.c cVar, com.google.firebase.remoteconfig.internal.c cVar2, C5576b c5576b, Context context, com.google.firebase.remoteconfig.internal.d dVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f17124a = linkedHashSet;
        this.f17125b = new com.google.firebase.remoteconfig.internal.e(eVar, cVar, cVar2, c5576b, context, linkedHashSet, dVar, scheduledExecutorService);
        this.f17126c = cVar;
        this.f17127d = scheduledExecutorService;
    }
}
