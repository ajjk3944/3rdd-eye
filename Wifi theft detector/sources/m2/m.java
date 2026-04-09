package m2;

import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class m implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f23398d = androidx.work.k.f("StopWorkRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final d2.j f23399a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23400b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23401c;

    public m(d2.j jVar, String str, boolean z10) {
        this.f23399a = jVar;
        this.f23400b = str;
        this.f23401c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zO;
        WorkDatabase workDatabaseO = this.f23399a.o();
        d2.d dVarM = this.f23399a.m();
        l2.q qVarB = workDatabaseO.B();
        workDatabaseO.c();
        try {
            boolean zH = dVarM.h(this.f23400b);
            if (this.f23401c) {
                zO = this.f23399a.m().n(this.f23400b);
            } else {
                if (!zH && qVarB.f(this.f23400b) == WorkInfo$State.RUNNING) {
                    qVarB.b(WorkInfo$State.ENQUEUED, this.f23400b);
                }
                zO = this.f23399a.m().o(this.f23400b);
            }
            androidx.work.k.c().a(f23398d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f23400b, Boolean.valueOf(zO)), new Throwable[0]);
            workDatabaseO.r();
            workDatabaseO.g();
        } catch (Throwable th) {
            workDatabaseO.g();
            throw th;
        }
    }
}
