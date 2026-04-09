package e2;

import androidx.work.k;
import androidx.work.p;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f20878d = k.f("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    public final b f20879a;

    /* renamed from: b, reason: collision with root package name */
    public final p f20880b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f20881c = new HashMap();

    /* renamed from: e2.a$a, reason: collision with other inner class name */
    public class RunnableC0388a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l2.p f20882a;

        public RunnableC0388a(l2.p pVar) {
            this.f20882a = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.c().a(a.f20878d, String.format("Scheduling work %s", this.f20882a.f23092a), new Throwable[0]);
            a.this.f20879a.c(this.f20882a);
        }
    }

    public a(b bVar, p pVar) {
        this.f20879a = bVar;
        this.f20880b = pVar;
    }

    public void a(l2.p pVar) {
        Runnable runnable = (Runnable) this.f20881c.remove(pVar.f23092a);
        if (runnable != null) {
            this.f20880b.a(runnable);
        }
        RunnableC0388a runnableC0388a = new RunnableC0388a(pVar);
        this.f20881c.put(pVar.f23092a, runnableC0388a);
        this.f20880b.b(pVar.a() - System.currentTimeMillis(), runnableC0388a);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f20881c.remove(str);
        if (runnable != null) {
            this.f20880b.a(runnable);
        }
    }
}
