package c2;

import b2.C1834o;
import java.util.HashMap;

/* compiled from: WorkTimer.java */
/* renamed from: c2.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2050F {

    /* renamed from: e, reason: collision with root package name */
    public static final String f18400e = androidx.work.m.g("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final H7.e f18401a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18402b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18403c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f18404d = new Object();

    /* compiled from: WorkTimer.java */
    /* renamed from: c2.F$a */
    public interface a {
        void b(C1834o c1834o);
    }

    /* compiled from: WorkTimer.java */
    /* renamed from: c2.F$b */
    public static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final C2050F f18405b;

        /* renamed from: c, reason: collision with root package name */
        public final C1834o f18406c;

        public b(C2050F c2050f, C1834o c1834o) {
            this.f18405b = c2050f;
            this.f18406c = c1834o;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f18405b.f18404d) {
                try {
                    if (((b) this.f18405b.f18402b.remove(this.f18406c)) != null) {
                        a aVar = (a) this.f18405b.f18403c.remove(this.f18406c);
                        if (aVar != null) {
                            aVar.b(this.f18406c);
                        }
                    } else {
                        androidx.work.m.e().a("WrkTimerRunnable", "Timer with " + this.f18406c + " is already marked as complete.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C2050F(H7.e eVar) {
        this.f18401a = eVar;
    }

    public final void a(C1834o c1834o) {
        synchronized (this.f18404d) {
            try {
                if (((b) this.f18402b.remove(c1834o)) != null) {
                    androidx.work.m.e().a(f18400e, "Stopping timer for " + c1834o);
                    this.f18403c.remove(c1834o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
