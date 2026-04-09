package f1;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f20054d = V0.m.h("StopWorkRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final W0.k f20055a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20056b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20057c;

    public k(W0.k kVar, String str, boolean z6) {
        this.f20055a = kVar;
        this.f20056b = str;
        this.f20057c = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zK;
        W0.k kVar = this.f20055a;
        WorkDatabase workDatabase = kVar.f3992k;
        W0.b bVar = kVar.f3995n;
        K4.c cVarT = workDatabase.t();
        workDatabase.c();
        try {
            String str = this.f20056b;
            synchronized (bVar.f3965k) {
                zContainsKey = bVar.f3961f.containsKey(str);
            }
            if (this.f20057c) {
                zK = this.f20055a.f3995n.j(this.f20056b);
            } else {
                if (!zContainsKey && cVarT.e(this.f20056b) == 2) {
                    cVarT.l(1, this.f20056b);
                }
                zK = this.f20055a.f3995n.k(this.f20056b);
            }
            V0.m.f().a(f20054d, "StopWorkRunnable for " + this.f20056b + "; Processor.stopWork = " + zK, new Throwable[0]);
            workDatabase.m();
            workDatabase.j();
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
