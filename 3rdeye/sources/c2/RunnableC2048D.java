package c2;

import androidx.work.impl.WorkDatabase;
import androidx.work.t;
import b2.C1838s;
import b2.C1842w;
import d2.C4268c;
import java.util.UUID;

/* compiled from: WorkProgressUpdater.java */
/* renamed from: c2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2048D implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f18393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.work.e f18394c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4268c f18395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2049E f18396e;

    public RunnableC2048D(C2049E c2049e, UUID uuid, androidx.work.e eVar, C4268c c4268c) {
        this.f18396e = c2049e;
        this.f18393b = uuid;
        this.f18394c = eVar;
        this.f18395d = c4268c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4268c c4268c = this.f18395d;
        UUID uuid = this.f18393b;
        String string = uuid.toString();
        androidx.work.m mVarE = androidx.work.m.e();
        String str = C2049E.f18397c;
        StringBuilder sb = new StringBuilder("Updating progress for ");
        sb.append(uuid);
        sb.append(" (");
        androidx.work.e eVar = this.f18394c;
        sb.append(eVar);
        sb.append(")");
        mVarE.a(str, sb.toString());
        C2049E c2049e = this.f18396e;
        WorkDatabase workDatabase = c2049e.f18398a;
        WorkDatabase workDatabase2 = c2049e.f18398a;
        workDatabase.c();
        try {
            C1842w c1842wU = workDatabase2.y().u(string);
            if (c1842wU == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (c1842wU.f17139b == t.b.RUNNING) {
                workDatabase2.x().e(new C1838s(string, eVar));
            } else {
                androidx.work.m.e().h(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
            }
            c4268c.i(null);
            workDatabase2.r();
        } catch (Throwable th) {
            try {
                androidx.work.m.e().d(C2049E.f18397c, "Error updating Worker progress", th);
                c4268c.j(th);
            } finally {
                workDatabase2.n();
            }
        }
    }
}
