package Y0;

import V0.m;
import a1.C0264c;
import a1.InterfaceC0263b;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f1.l;
import f1.r;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements InterfaceC0263b, W0.a, r {

    /* renamed from: j, reason: collision with root package name */
    public static final String f4228j = m.h("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f4229a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4230b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4231c;

    /* renamed from: d, reason: collision with root package name */
    public final h f4232d;

    /* renamed from: e, reason: collision with root package name */
    public final C0264c f4233e;

    /* renamed from: h, reason: collision with root package name */
    public PowerManager.WakeLock f4236h;
    public boolean i = false;

    /* renamed from: g, reason: collision with root package name */
    public int f4235g = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4234f = new Object();

    public e(Context context, int i, String str, h hVar) {
        this.f4229a = context;
        this.f4230b = i;
        this.f4232d = hVar;
        this.f4231c = str;
        this.f4233e = new C0264c(context, hVar.f4245b, this);
    }

    @Override // a1.InterfaceC0263b
    public final void a(List list) {
        e();
    }

    public final void b() {
        synchronized (this.f4234f) {
            try {
                this.f4233e.d();
                this.f4232d.f4246c.b(this.f4231c);
                PowerManager.WakeLock wakeLock = this.f4236h;
                if (wakeLock != null && wakeLock.isHeld()) {
                    m.f().a(f4228j, "Releasing wakelock " + this.f4236h + " for WorkSpec " + this.f4231c, new Throwable[0]);
                    this.f4236h.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W0.a
    public final void c(String str, boolean z6) {
        m.f().a(f4228j, "onExecuted " + str + ", " + z6, new Throwable[0]);
        b();
        int i = this.f4230b;
        h hVar = this.f4232d;
        Context context = this.f4229a;
        if (z6) {
            hVar.f(new g(i, 0, hVar, b.b(context, this.f4231c)));
        }
        if (this.i) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            hVar.f(new g(i, 0, hVar, intent));
        }
    }

    public final void d() {
        StringBuilder sb = new StringBuilder();
        String str = this.f4231c;
        sb.append(str);
        sb.append(" (");
        sb.append(this.f4230b);
        sb.append(")");
        this.f4236h = l.a(this.f4229a, sb.toString());
        m mVarF = m.f();
        PowerManager.WakeLock wakeLock = this.f4236h;
        String str2 = f4228j;
        mVarF.a(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f4236h.acquire();
        e1.h hVarH = this.f4232d.f4248e.f3992k.t().h(str);
        if (hVarH == null) {
            e();
            return;
        }
        boolean zB = hVarH.b();
        this.i = zB;
        if (zB) {
            this.f4233e.c(Collections.singletonList(hVarH));
        } else {
            m.f().a(str2, A.f.l("No constraints for ", str), new Throwable[0]);
            f(Collections.singletonList(str));
        }
    }

    public final void e() {
        synchronized (this.f4234f) {
            try {
                if (this.f4235g < 2) {
                    this.f4235g = 2;
                    m mVarF = m.f();
                    String str = f4228j;
                    mVarF.a(str, "Stopping work for WorkSpec " + this.f4231c, new Throwable[0]);
                    Context context = this.f4229a;
                    String str2 = this.f4231c;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    h hVar = this.f4232d;
                    hVar.f(new g(this.f4230b, 0, hVar, intent));
                    if (this.f4232d.f4247d.e(this.f4231c)) {
                        m.f().a(str, "WorkSpec " + this.f4231c + " needs to be rescheduled", new Throwable[0]);
                        Intent intentB = b.b(this.f4229a, this.f4231c);
                        h hVar2 = this.f4232d;
                        hVar2.f(new g(this.f4230b, 0, hVar2, intentB));
                    } else {
                        m.f().a(str, "Processor does not have WorkSpec " + this.f4231c + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    m.f().a(f4228j, "Already stopped work for " + this.f4231c, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a1.InterfaceC0263b
    public final void f(List list) {
        if (list.contains(this.f4231c)) {
            synchronized (this.f4234f) {
                try {
                    if (this.f4235g == 0) {
                        this.f4235g = 1;
                        m.f().a(f4228j, "onAllConstraintsMet for " + this.f4231c, new Throwable[0]);
                        if (this.f4232d.f4247d.h(this.f4231c, null)) {
                            this.f4232d.f4246c.a(this.f4231c, this);
                        } else {
                            b();
                        }
                    } else {
                        m.f().a(f4228j, "Already started work for " + this.f4231c, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
