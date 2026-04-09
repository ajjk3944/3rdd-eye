package Y0;

import V0.m;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f1.j;
import f1.l;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4237a;

    /* renamed from: b, reason: collision with root package name */
    public final h f4238b;

    public /* synthetic */ f(h hVar, int i) {
        this.f4237a = i;
        this.f4238b = hVar;
    }

    private final void a() {
        h hVar;
        f fVar;
        synchronized (this.f4238b.f4251h) {
            h hVar2 = this.f4238b;
            hVar2.i = (Intent) hVar2.f4251h.get(0);
        }
        Intent intent = this.f4238b.i;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f4238b.i.getIntExtra("KEY_START_ID", 0);
            m mVarF = m.f();
            String str = h.f4243k;
            int i = 1;
            mVarF.a(str, String.format("Processing command %s, %s", this.f4238b.i, Integer.valueOf(intExtra)), new Throwable[0]);
            PowerManager.WakeLock wakeLockA = l.a(this.f4238b.f4244a, action + " (" + intExtra + ")");
            try {
                m.f().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                wakeLockA.acquire();
                h hVar3 = this.f4238b;
                hVar3.f4249f.e(hVar3.i, intExtra, hVar3);
                m.f().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                wakeLockA.release();
                hVar = this.f4238b;
                fVar = new f(hVar, i);
            } catch (Throwable th) {
                try {
                    m mVarF2 = m.f();
                    String str2 = h.f4243k;
                    mVarF2.e(str2, "Unexpected error in onHandleIntent", th);
                    m.f().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                    wakeLockA.release();
                    hVar = this.f4238b;
                    fVar = new f(hVar, i);
                } catch (Throwable th2) {
                    m.f().a(h.f4243k, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                    wakeLockA.release();
                    h hVar4 = this.f4238b;
                    hVar4.f(new f(hVar4, i));
                    throw th2;
                }
            }
            hVar.f(fVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4237a) {
            case 0:
                a();
                return;
            default:
                h hVar = this.f4238b;
                m mVarF = m.f();
                String str = h.f4243k;
                mVarF.a(str, "Checking if commands are complete.", new Throwable[0]);
                hVar.b();
                synchronized (hVar.f4251h) {
                    try {
                        if (hVar.i != null) {
                            m.f().a(str, String.format("Removing command %s", hVar.i), new Throwable[0]);
                            if (!((Intent) hVar.f4251h.remove(0)).equals(hVar.i)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            hVar.i = null;
                        }
                        j jVar = (j) ((V2.e) hVar.f4245b).f3868b;
                        if (!hVar.f4249f.d() && hVar.f4251h.isEmpty() && !jVar.a()) {
                            m.f().a(str, "No more commands & intents.", new Throwable[0]);
                            SystemAlarmService systemAlarmService = hVar.f4252j;
                            if (systemAlarmService != null) {
                                systemAlarmService.a();
                            }
                        } else if (!hVar.f4251h.isEmpty()) {
                            hVar.g();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
