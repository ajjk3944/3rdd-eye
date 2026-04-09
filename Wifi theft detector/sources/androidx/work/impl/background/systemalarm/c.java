package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import androidx.work.k;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Collections;
import java.util.List;
import l2.p;
import m2.n;
import m2.r;

/* loaded from: classes.dex */
public class c implements h2.c, d2.b, r.b {

    /* renamed from: j, reason: collision with root package name */
    public static final String f4419j = k.f("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f4420a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4421b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4422c;

    /* renamed from: d, reason: collision with root package name */
    public final d f4423d;

    /* renamed from: e, reason: collision with root package name */
    public final h2.d f4424e;

    /* renamed from: h, reason: collision with root package name */
    public PowerManager.WakeLock f4427h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4428i = false;

    /* renamed from: g, reason: collision with root package name */
    public int f4426g = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4425f = new Object();

    public c(Context context, int i10, String str, d dVar) {
        this.f4420a = context;
        this.f4421b = i10;
        this.f4423d = dVar;
        this.f4422c = str;
        this.f4424e = new h2.d(context, dVar.f(), this);
    }

    @Override // m2.r.b
    public void a(String str) {
        k.c().a(f4419j, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // h2.c
    public void b(List list) {
        g();
    }

    public final void c() {
        synchronized (this.f4425f) {
            try {
                this.f4424e.e();
                this.f4423d.h().c(this.f4422c);
                PowerManager.WakeLock wakeLock = this.f4427h;
                if (wakeLock != null && wakeLock.isHeld()) {
                    k.c().a(f4419j, String.format("Releasing wakelock %s for WorkSpec %s", this.f4427h, this.f4422c), new Throwable[0]);
                    this.f4427h.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        this.f4427h = n.b(this.f4420a, String.format("%s (%s)", this.f4422c, Integer.valueOf(this.f4421b)));
        k kVarC = k.c();
        String str = f4419j;
        kVarC.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f4427h, this.f4422c), new Throwable[0]);
        this.f4427h.acquire();
        p pVarG = this.f4423d.g().o().B().g(this.f4422c);
        if (pVarG == null) {
            g();
            return;
        }
        boolean zB = pVarG.b();
        this.f4428i = zB;
        if (zB) {
            this.f4424e.d(Collections.singletonList(pVarG));
        } else {
            k.c().a(str, String.format("No constraints for %s", this.f4422c), new Throwable[0]);
            f(Collections.singletonList(this.f4422c));
        }
    }

    @Override // d2.b
    public void e(String str, boolean z10) {
        k.c().a(f4419j, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        c();
        if (z10) {
            Intent intentD = a.d(this.f4420a, this.f4422c);
            d dVar = this.f4423d;
            dVar.k(new d.b(dVar, intentD, this.f4421b));
        }
        if (this.f4428i) {
            Intent intentA = a.a(this.f4420a);
            d dVar2 = this.f4423d;
            dVar2.k(new d.b(dVar2, intentA, this.f4421b));
        }
    }

    @Override // h2.c
    public void f(List list) {
        if (list.contains(this.f4422c)) {
            synchronized (this.f4425f) {
                try {
                    if (this.f4426g == 0) {
                        this.f4426g = 1;
                        k.c().a(f4419j, String.format("onAllConstraintsMet for %s", this.f4422c), new Throwable[0]);
                        if (this.f4423d.d().j(this.f4422c)) {
                            this.f4423d.h().b(this.f4422c, TTAdConstant.AD_MAX_EVENT_TIME, this);
                        } else {
                            c();
                        }
                    } else {
                        k.c().a(f4419j, String.format("Already started work for %s", this.f4422c), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f4425f) {
            try {
                if (this.f4426g < 2) {
                    this.f4426g = 2;
                    k kVarC = k.c();
                    String str = f4419j;
                    kVarC.a(str, String.format("Stopping work for WorkSpec %s", this.f4422c), new Throwable[0]);
                    Intent intentF = a.f(this.f4420a, this.f4422c);
                    d dVar = this.f4423d;
                    dVar.k(new d.b(dVar, intentF, this.f4421b));
                    if (this.f4423d.d().g(this.f4422c)) {
                        k.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f4422c), new Throwable[0]);
                        Intent intentD = a.d(this.f4420a, this.f4422c);
                        d dVar2 = this.f4423d;
                        dVar2.k(new d.b(dVar2, intentD, this.f4421b));
                    } else {
                        k.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f4422c), new Throwable[0]);
                    }
                } else {
                    k.c().a(f4419j, String.format("Already stopped work for %s", this.f4422c), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
