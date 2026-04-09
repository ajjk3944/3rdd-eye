package V1;

import T1.InterfaceC1591c;
import T1.l;
import T1.x;
import T1.z;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.m;
import b2.C1834o;
import c2.C2050F;
import c2.s;
import c2.y;
import e2.InterfaceC4306b;
import e2.c;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: SystemAlarmDispatcher.java */
/* loaded from: classes.dex */
public final class e implements InterfaceC1591c {

    /* renamed from: l, reason: collision with root package name */
    public static final String f12896l = m.g("SystemAlarmDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public final Context f12897b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4306b f12898c;

    /* renamed from: d, reason: collision with root package name */
    public final C2050F f12899d;

    /* renamed from: e, reason: collision with root package name */
    public final l f12900e;

    /* renamed from: f, reason: collision with root package name */
    public final z f12901f;

    /* renamed from: g, reason: collision with root package name */
    public final V1.b f12902g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f12903h;
    public Intent i;

    /* renamed from: j, reason: collision with root package name */
    public SystemAlarmService f12904j;

    /* renamed from: k, reason: collision with root package name */
    public final x f12905k;

    /* compiled from: SystemAlarmDispatcher.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (e.this.f12903h) {
                e eVar = e.this;
                eVar.i = (Intent) eVar.f12903h.get(0);
            }
            Intent intent = e.this.i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.i.getIntExtra("KEY_START_ID", 0);
                m mVarE = m.e();
                String str = e.f12896l;
                mVarE.a(str, "Processing command " + e.this.i + ", " + intExtra);
                PowerManager.WakeLock wakeLockA = y.a(e.this.f12897b, action + " (" + intExtra + ")");
                try {
                    m.e().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA);
                    wakeLockA.acquire();
                    e eVar2 = e.this;
                    eVar2.f12902g.b(intExtra, eVar2, eVar2.i);
                    m.e().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                    wakeLockA.release();
                    e.this.f12898c.b().execute(new c(e.this));
                } catch (Throwable th) {
                    try {
                        m mVarE2 = m.e();
                        String str2 = e.f12896l;
                        mVarE2.d(str2, "Unexpected error in onHandleIntent", th);
                        m.e().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                        wakeLockA.release();
                        e.this.f12898c.b().execute(new c(e.this));
                    } catch (Throwable th2) {
                        m.e().a(e.f12896l, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                        wakeLockA.release();
                        e.this.f12898c.b().execute(new c(e.this));
                        throw th2;
                    }
                }
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    public static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final e f12907b;

        /* renamed from: c, reason: collision with root package name */
        public final Intent f12908c;

        /* renamed from: d, reason: collision with root package name */
        public final int f12909d;

        public b(int i, e eVar, Intent intent) {
            this.f12907b = eVar;
            this.f12908c = intent;
            this.f12909d = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Intent intent = this.f12908c;
            this.f12907b.a(this.f12909d, intent);
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    public static class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final e f12910b;

        public c(e eVar) {
            this.f12910b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = this.f12910b;
            eVar.getClass();
            m mVarE = m.e();
            String str = e.f12896l;
            mVarE.a(str, "Checking if commands are complete.");
            e.b();
            synchronized (eVar.f12903h) {
                try {
                    if (eVar.i != null) {
                        m.e().a(str, "Removing command " + eVar.i);
                        if (!((Intent) eVar.f12903h.remove(0)).equals(eVar.i)) {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                        eVar.i = null;
                    }
                    s sVarC = eVar.f12898c.c();
                    if (!eVar.f12902g.a() && eVar.f12903h.isEmpty() && !sVarC.a()) {
                        m.e().a(str, "No more commands & intents.");
                        SystemAlarmService systemAlarmService = eVar.f12904j;
                        if (systemAlarmService != null) {
                            systemAlarmService.a();
                        }
                    } else if (!eVar.f12903h.isEmpty()) {
                        eVar.e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public e(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f12897b = applicationContext;
        E7.b bVar = new E7.b(6);
        z zVarC = z.c(systemAlarmService);
        this.f12901f = zVarC;
        this.f12902g = new V1.b(applicationContext, zVarC.f12231b.f16867c, bVar);
        this.f12899d = new C2050F(zVarC.f12231b.f16870f);
        l lVar = zVarC.f12235f;
        this.f12900e = lVar;
        InterfaceC4306b interfaceC4306b = zVarC.f12233d;
        this.f12898c = interfaceC4306b;
        this.f12905k = new T1.y(lVar, interfaceC4306b);
        lVar.a(this);
        this.f12903h = new ArrayList();
        this.i = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i, Intent intent) {
        m mVarE = m.e();
        String str = f12896l;
        mVarE.a(str, "Adding command " + intent + " (" + i + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            m.e().h(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f12903h) {
            try {
                boolean zIsEmpty = this.f12903h.isEmpty();
                this.f12903h.add(intent);
                if (zIsEmpty) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // T1.InterfaceC1591c
    public final void c(C1834o c1834o, boolean z10) {
        c.a aVarB = this.f12898c.b();
        String str = V1.b.f12871g;
        Intent intent = new Intent(this.f12897b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        V1.b.e(intent, c1834o);
        aVarB.execute(new b(0, this, intent));
    }

    public final boolean d() {
        b();
        synchronized (this.f12903h) {
            try {
                Iterator it = this.f12903h.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
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
        b();
        PowerManager.WakeLock wakeLockA = y.a(this.f12897b, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f12901f.f12233d.d(new a());
        } finally {
            wakeLockA.release();
        }
    }
}
