package f1;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final t f20077a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20078b;

    public s(t tVar, String str) {
        this.f20077a = tVar;
        this.f20078b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20077a.f20083d) {
            try {
                if (((s) this.f20077a.f20081b.remove(this.f20078b)) != null) {
                    r rVar = (r) this.f20077a.f20082c.remove(this.f20078b);
                    if (rVar != null) {
                        String str = this.f20078b;
                        V0.m.f().a(Y0.e.f4228j, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((Y0.e) rVar).e();
                    }
                } else {
                    V0.m.f().a("WrkTimerRunnable", "Timer with " + this.f20078b + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
