package Y0;

import V0.m;
import W0.k;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f1.l;
import f1.t;
import h1.InterfaceC2361a;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class h implements W0.a {

    /* renamed from: k, reason: collision with root package name */
    public static final String f4243k = m.h("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f4244a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2361a f4245b;

    /* renamed from: c, reason: collision with root package name */
    public final t f4246c;

    /* renamed from: d, reason: collision with root package name */
    public final W0.b f4247d;

    /* renamed from: e, reason: collision with root package name */
    public final k f4248e;

    /* renamed from: f, reason: collision with root package name */
    public final b f4249f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f4250g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4251h;
    public Intent i;

    /* renamed from: j, reason: collision with root package name */
    public SystemAlarmService f4252j;

    public h(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f4244a = applicationContext;
        this.f4249f = new b(applicationContext);
        this.f4246c = new t();
        k kVarG = k.G(systemAlarmService);
        this.f4248e = kVarG;
        W0.b bVar = kVarG.f3995n;
        this.f4247d = bVar;
        this.f4245b = kVarG.f3993l;
        bVar.a(this);
        this.f4251h = new ArrayList();
        this.i = null;
        this.f4250g = new Handler(Looper.getMainLooper());
    }

    public final void a(Intent intent, int i) {
        m mVarF = m.f();
        String str = f4243k;
        mVarF.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            m.f().i(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f4251h) {
            try {
                boolean zIsEmpty = this.f4251h.isEmpty();
                this.f4251h.add(intent);
                if (zIsEmpty) {
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (this.f4250g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // W0.a
    public final void c(String str, boolean z6) {
        String str2 = b.f4219d;
        Intent intent = new Intent(this.f4244a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z6);
        int i = 0;
        f(new g(i, i, this, intent));
    }

    public final boolean d() {
        b();
        synchronized (this.f4251h) {
            try {
                ArrayList arrayList = this.f4251h;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        m.f().a(f4243k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f4247d.f(this);
        ScheduledExecutorService scheduledExecutorService = this.f4246c.f20080a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f4252j = null;
    }

    public final void f(Runnable runnable) {
        this.f4250g.post(runnable);
    }

    public final void g() {
        b();
        PowerManager.WakeLock wakeLockA = l.a(this.f4244a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f4248e.f3993l.o(new f(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
