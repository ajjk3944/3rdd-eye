package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qz0 implements gt {
    public static final String p = h80.f("SystemAlarmDispatcher");
    public final Context f;
    public final l01 g;
    public final ta1 h;
    public final om0 i;
    public final ha1 j;
    public final kg k;
    public final Handler l;
    public final ArrayList m;
    public Intent n;
    public SystemAlarmService o;

    public qz0(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f = applicationContext;
        this.k = new kg(applicationContext);
        this.h = new ta1();
        ha1 ha1VarJ0 = ha1.j0(systemAlarmService);
        this.j = ha1VarJ0;
        om0 om0Var = ha1VarJ0.u;
        this.i = om0Var;
        this.g = ha1VarJ0.s;
        om0Var.b(this);
        this.m = new ArrayList();
        this.n = null;
        this.l = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.gt
    public final void a(String str, boolean z) {
        String str2 = kg.i;
        Intent intent = new Intent(this.f, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        e(new k7(this, intent, 0, 3));
    }

    public final void b(Intent intent, int i) {
        h80 h80VarD = h80.d();
        String.format("Adding command %s (%s)", intent, Integer.valueOf(i));
        int i2 = 0;
        h80VarD.a(new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            h80.d().g(new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.m) {
                try {
                    ArrayList arrayList = this.m;
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.m) {
            try {
                boolean zIsEmpty = this.m.isEmpty();
                this.m.add(intent);
                if (zIsEmpty) {
                    f();
                }
            } finally {
            }
        }
    }

    public final void c() {
        if (this.l.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void d() {
        h80.d().a(new Throwable[0]);
        this.i.e(this);
        ScheduledExecutorService scheduledExecutorService = this.h.a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.o = null;
    }

    public final void e(Runnable runnable) {
        this.l.post(runnable);
    }

    public final void f() {
        c();
        PowerManager.WakeLock wakeLockA = y71.a(this.f, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.j.s.j(new pz0(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
