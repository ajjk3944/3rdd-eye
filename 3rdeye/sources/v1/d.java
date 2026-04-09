package V1;

import A9.A;
import A9.C0599r0;
import C.V;
import N7.G8;
import T1.r;
import V1.e;
import X1.b;
import X1.h;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.m;
import b2.C1834o;
import b2.C1842w;
import c2.C2050F;
import c2.s;
import c2.y;
import e2.InterfaceC4306b;
import e2.InterfaceExecutorC4305a;
import java.util.concurrent.Executor;

/* compiled from: DelayMetCommandHandler.java */
/* loaded from: classes.dex */
public final class d implements X1.d, C2050F.a {

    /* renamed from: p, reason: collision with root package name */
    public static final String f12882p = m.g("DelayMetCommandHandler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f12883b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12884c;

    /* renamed from: d, reason: collision with root package name */
    public final C1834o f12885d;

    /* renamed from: e, reason: collision with root package name */
    public final e f12886e;

    /* renamed from: f, reason: collision with root package name */
    public final X1.e f12887f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12888g;

    /* renamed from: h, reason: collision with root package name */
    public int f12889h;
    public final InterfaceExecutorC4305a i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f12890j;

    /* renamed from: k, reason: collision with root package name */
    public PowerManager.WakeLock f12891k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12892l;

    /* renamed from: m, reason: collision with root package name */
    public final r f12893m;

    /* renamed from: n, reason: collision with root package name */
    public final A f12894n;

    /* renamed from: o, reason: collision with root package name */
    public volatile C0599r0 f12895o;

    public d(Context context, int i, e eVar, r rVar) {
        this.f12883b = context;
        this.f12884c = i;
        this.f12886e = eVar;
        this.f12885d = rVar.f12210a;
        this.f12893m = rVar;
        G5.c cVar = eVar.f12901f.f12239k;
        InterfaceC4306b interfaceC4306b = eVar.f12898c;
        this.i = interfaceC4306b.c();
        this.f12890j = interfaceC4306b.b();
        this.f12894n = interfaceC4306b.a();
        this.f12887f = new X1.e(cVar);
        this.f12892l = false;
        this.f12889h = 0;
        this.f12888g = new Object();
    }

    public static void c(d dVar) {
        C1834o c1834o = dVar.f12885d;
        int i = dVar.f12889h;
        String str = c1834o.f17128a;
        String str2 = f12882p;
        if (i >= 2) {
            m.e().a(str2, "Already stopped work for " + str);
            return;
        }
        dVar.f12889h = 2;
        m.e().a(str2, "Stopping work for WorkSpec " + str);
        String str3 = b.f12871g;
        Context context = dVar.f12883b;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        b.e(intent, c1834o);
        e eVar = dVar.f12886e;
        int i10 = dVar.f12884c;
        e.b bVar = new e.b(i10, eVar, intent);
        Executor executor = dVar.f12890j;
        executor.execute(bVar);
        if (!eVar.f12900e.g(str)) {
            m.e().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        m.e().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        b.e(intent2, c1834o);
        executor.execute(new e.b(i10, eVar, intent2));
    }

    public static void d(d dVar) {
        if (dVar.f12889h != 0) {
            m.e().a(f12882p, "Already started work for " + dVar.f12885d);
            return;
        }
        dVar.f12889h = 1;
        m.e().a(f12882p, "onAllConstraintsMet for " + dVar.f12885d);
        if (!dVar.f12886e.f12900e.j(dVar.f12893m, null)) {
            dVar.e();
            return;
        }
        C2050F c2050f = dVar.f12886e.f12899d;
        C1834o c1834o = dVar.f12885d;
        synchronized (c2050f.f18404d) {
            m.e().a(C2050F.f18400e, "Starting timer for " + c1834o);
            c2050f.a(c1834o);
            C2050F.b bVar = new C2050F.b(c2050f, c1834o);
            c2050f.f18402b.put(c1834o, bVar);
            c2050f.f18403c.put(c1834o, dVar);
            c2050f.f18401a.g(bVar, 600000L);
        }
    }

    @Override // X1.d
    public final void a(C1842w c1842w, X1.b bVar) {
        boolean z10 = bVar instanceof b.a;
        InterfaceExecutorC4305a interfaceExecutorC4305a = this.i;
        if (z10) {
            ((s) interfaceExecutorC4305a).execute(new V(this, 5));
        } else {
            ((s) interfaceExecutorC4305a).execute(new B.b(this, 8));
        }
    }

    @Override // c2.C2050F.a
    public final void b(C1834o c1834o) {
        m.e().a(f12882p, "Exceeded time limits on execution for " + c1834o);
        ((s) this.i).execute(new B.b(this, 8));
    }

    public final void e() {
        synchronized (this.f12888g) {
            try {
                if (this.f12895o != null) {
                    this.f12895o.c(null);
                }
                this.f12886e.f12899d.a(this.f12885d);
                PowerManager.WakeLock wakeLock = this.f12891k;
                if (wakeLock != null && wakeLock.isHeld()) {
                    m.e().a(f12882p, "Releasing wakelock " + this.f12891k + "for WorkSpec " + this.f12885d);
                    this.f12891k.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        String str = this.f12885d.f17128a;
        Context context = this.f12883b;
        StringBuilder sbV = G8.v(str, " (");
        sbV.append(this.f12884c);
        sbV.append(")");
        this.f12891k = y.a(context, sbV.toString());
        m mVarE = m.e();
        String str2 = f12882p;
        mVarE.a(str2, "Acquiring wakelock " + this.f12891k + "for WorkSpec " + str);
        this.f12891k.acquire();
        C1842w c1842wU = this.f12886e.f12901f.f12232c.y().u(str);
        if (c1842wU == null) {
            ((s) this.i).execute(new B.b(this, 8));
            return;
        }
        boolean zC = c1842wU.c();
        this.f12892l = zC;
        if (zC) {
            this.f12895o = h.a(this.f12887f, c1842wU, this.f12894n, this);
            return;
        }
        m.e().a(str2, "No constraints for " + str);
        ((s) this.i).execute(new V(this, 5));
    }

    public final void g(boolean z10) {
        m mVarE = m.e();
        StringBuilder sb = new StringBuilder("onExecuted ");
        C1834o c1834o = this.f12885d;
        sb.append(c1834o);
        sb.append(", ");
        sb.append(z10);
        mVarE.a(f12882p, sb.toString());
        e();
        int i = this.f12884c;
        e eVar = this.f12886e;
        Executor executor = this.f12890j;
        Context context = this.f12883b;
        if (z10) {
            String str = b.f12871g;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            b.e(intent, c1834o);
            executor.execute(new e.b(i, eVar, intent));
        }
        if (this.f12892l) {
            String str2 = b.f12871g;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executor.execute(new e.b(i, eVar, intent2));
        }
    }
}
