package D3;

import a9.InterfaceC1676a;
import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import b2.C1817D;
import b2.C1825f;
import b2.C1844y;
import b2.InterfaceC1818E;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.l;
import w1.o;

/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* loaded from: classes.dex */
public final class f implements A3.b, InterfaceC1818E {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1056b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1057c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1058d;

    public /* synthetic */ f(Object obj, InterfaceC1676a interfaceC1676a, InterfaceC1676a interfaceC1676a2) {
        this.f1056b = obj;
        this.f1057c = interfaceC1676a;
        this.f1058d = interfaceC1676a2;
    }

    @Override // b2.InterfaceC1818E
    public ArrayList a(String str) throws IOException {
        o oVarD = o.d(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            oVarD.f(1);
        } else {
            oVarD.h(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1056b;
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

    @Override // b2.InterfaceC1818E
    public void b(String id, Set tags) {
        l.f(id, "id");
        l.f(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            C1817D c1817d = new C1817D((String) it.next(), id);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1056b;
            workDatabase_Impl.b();
            workDatabase_Impl.c();
            try {
                ((C1825f) this.f1057c).j(c1817d);
                workDatabase_Impl.r();
            } finally {
                workDatabase_Impl.n();
            }
        }
    }

    @Override // b2.InterfaceC1818E
    public void c(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1056b;
        workDatabase_Impl.b();
        C1844y c1844y = (C1844y) this.f1058d;
        F1.f fVarC = c1844y.c();
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
            c1844y.h(fVarC);
        }
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        return new E3.d((Context) ((A3.c) this.f1056b).f36c, (F3.d) ((InterfaceC1676a) this.f1057c).get(), (E3.e) ((A2.l) this.f1058d).get());
    }

    public f(WorkDatabase_Impl workDatabase_Impl) {
        this.f1056b = workDatabase_Impl;
        this.f1057c = new C1825f(workDatabase_Impl, 1);
        this.f1058d = new C1844y(workDatabase_Impl, 3);
    }
}
