package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.k;
import d2.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m2.n;
import m2.r;

/* loaded from: classes.dex */
public class d implements d2.b {

    /* renamed from: k, reason: collision with root package name */
    public static final String f4429k = k.f("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f4430a;

    /* renamed from: b, reason: collision with root package name */
    public final o2.a f4431b;

    /* renamed from: c, reason: collision with root package name */
    public final r f4432c;

    /* renamed from: d, reason: collision with root package name */
    public final d2.d f4433d;

    /* renamed from: e, reason: collision with root package name */
    public final j f4434e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.a f4435f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f4436g;

    /* renamed from: h, reason: collision with root package name */
    public final List f4437h;

    /* renamed from: i, reason: collision with root package name */
    public Intent f4438i;

    /* renamed from: j, reason: collision with root package name */
    public c f4439j;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            RunnableC0053d runnableC0053d;
            synchronized (d.this.f4437h) {
                d dVar2 = d.this;
                dVar2.f4438i = (Intent) dVar2.f4437h.get(0);
            }
            Intent intent = d.this.f4438i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.f4438i.getIntExtra("KEY_START_ID", 0);
                k kVarC = k.c();
                String str = d.f4429k;
                kVarC.a(str, String.format("Processing command %s, %s", d.this.f4438i, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockB = n.b(d.this.f4430a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    k.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                    wakeLockB.acquire();
                    d dVar3 = d.this;
                    dVar3.f4435f.o(dVar3.f4438i, intExtra, dVar3);
                    k.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                    wakeLockB.release();
                    dVar = d.this;
                    runnableC0053d = new RunnableC0053d(dVar);
                } catch (Throwable th) {
                    try {
                        k kVarC2 = k.c();
                        String str2 = d.f4429k;
                        kVarC2.b(str2, "Unexpected error in onHandleIntent", th);
                        k.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                        wakeLockB.release();
                        dVar = d.this;
                        runnableC0053d = new RunnableC0053d(dVar);
                    } catch (Throwable th2) {
                        k.c().a(d.f4429k, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                        wakeLockB.release();
                        d dVar4 = d.this;
                        dVar4.k(new RunnableC0053d(dVar4));
                        throw th2;
                    }
                }
                dVar.k(runnableC0053d);
            }
        }
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final d f4441a;

        /* renamed from: b, reason: collision with root package name */
        public final Intent f4442b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4443c;

        public b(d dVar, Intent intent, int i10) {
            this.f4441a = dVar;
            this.f4442b = intent;
            this.f4443c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4441a.a(this.f4442b, this.f4443c);
        }
    }

    public interface c {
        void b();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d, reason: collision with other inner class name */
    public static class RunnableC0053d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final d f4444a;

        public RunnableC0053d(d dVar) {
            this.f4444a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4444a.c();
        }
    }

    public d(Context context) {
        this(context, null, null);
    }

    public boolean a(Intent intent, int i10) {
        k kVarC = k.c();
        String str = f4429k;
        kVarC.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            k.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f4437h) {
            try {
                boolean zIsEmpty = this.f4437h.isEmpty();
                this.f4437h.add(intent);
                if (zIsEmpty) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final void b() {
        if (this.f4436g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public void c() {
        k kVarC = k.c();
        String str = f4429k;
        kVarC.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f4437h) {
            try {
                if (this.f4438i != null) {
                    k.c().a(str, String.format("Removing command %s", this.f4438i), new Throwable[0]);
                    if (!((Intent) this.f4437h.remove(0)).equals(this.f4438i)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f4438i = null;
                }
                m2.k backgroundExecutor = this.f4431b.getBackgroundExecutor();
                if (!this.f4435f.n() && this.f4437h.isEmpty() && !backgroundExecutor.a()) {
                    k.c().a(str, "No more commands & intents.", new Throwable[0]);
                    c cVar = this.f4439j;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.f4437h.isEmpty()) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public d2.d d() {
        return this.f4433d;
    }

    @Override // d2.b
    public void e(String str, boolean z10) {
        k(new b(this, androidx.work.impl.background.systemalarm.a.c(this.f4430a, str, z10), 0));
    }

    public o2.a f() {
        return this.f4431b;
    }

    public j g() {
        return this.f4434e;
    }

    public r h() {
        return this.f4432c;
    }

    public final boolean i(String str) {
        b();
        synchronized (this.f4437h) {
            try {
                Iterator it = this.f4437h.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        k.c().a(f4429k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f4433d.i(this);
        this.f4432c.a();
        this.f4439j = null;
    }

    public void k(Runnable runnable) {
        this.f4436g.post(runnable);
    }

    public final void l() {
        b();
        PowerManager.WakeLock wakeLockB = n.b(this.f4430a, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.f4434e.p().b(new a());
        } finally {
            wakeLockB.release();
        }
    }

    public void m(c cVar) {
        if (this.f4439j != null) {
            k.c().b(f4429k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f4439j = cVar;
        }
    }

    public d(Context context, d2.d dVar, j jVar) {
        Context applicationContext = context.getApplicationContext();
        this.f4430a = applicationContext;
        this.f4435f = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.f4432c = new r();
        jVar = jVar == null ? j.k(context) : jVar;
        this.f4434e = jVar;
        dVar = dVar == null ? jVar.m() : dVar;
        this.f4433d = dVar;
        this.f4431b = jVar.p();
        dVar.c(this);
        this.f4437h = new ArrayList();
        this.f4438i = null;
        this.f4436g = new Handler(Looper.getMainLooper());
    }
}
