package f1;

import androidx.work.impl.WorkDatabase;
import e1.C2299b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f20044a;

    public /* synthetic */ f(WorkDatabase workDatabase) {
        this.f20044a = workDatabase;
    }

    public int a(int i) {
        WorkDatabase workDatabase;
        int i3;
        synchronized (f.class) {
            try {
                workDatabase = this.f20044a;
                workDatabase.c();
                Long lN = workDatabase.p().n("next_job_scheduler_id");
                i3 = 0;
                int iIntValue = lN != null ? lN.intValue() : 0;
                workDatabase.p().r(new C2299b("next_job_scheduler_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.m();
                workDatabase.j();
                if (iIntValue < 0 || iIntValue > i) {
                    this.f20044a.p().r(new C2299b("next_job_scheduler_id", 1));
                } else {
                    i3 = iIntValue;
                }
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            } finally {
            }
        }
        return i3;
    }
}
