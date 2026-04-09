package d5;

import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.a1;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f7078a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f7079b;

    /* renamed from: c, reason: collision with root package name */
    public final a5.b f7080c;

    /* renamed from: d, reason: collision with root package name */
    public int f7081d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7082e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f7083f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7084g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7085h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7086i;

    public s0(q0 q0Var, r0 r0Var, a1 a1Var, int i10, a5.x xVar, Looper looper) {
        this.f7079b = q0Var;
        this.f7078a = r0Var;
        this.f7083f = looper;
        this.f7080c = xVar;
    }

    public final synchronized void a(long j) {
        boolean z10;
        a5.a.i(this.f7084g);
        a5.a.i(this.f7083f.getThread() != Thread.currentThread());
        ((a5.x) this.f7080c).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z10 = this.f7086i;
            if (z10 || j <= 0) {
                break;
            }
            this.f7080c.getClass();
            wait(j);
            ((a5.x) this.f7080c).getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z10) {
        this.f7085h = z10 | this.f7085h;
        this.f7086i = true;
        notifyAll();
    }

    public final void c() {
        a5.a.i(!this.f7084g);
        this.f7084g = true;
        e0 e0Var = (e0) this.f7079b;
        synchronized (e0Var) {
            if (!e0Var.U && e0Var.F.getThread().isAlive()) {
                e0Var.D.b(14, this).b();
                return;
            }
            a5.a.B("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }

    public final void d(Object obj) {
        a5.a.i(!this.f7084g);
        this.f7082e = obj;
    }

    public final void e(int i10) {
        a5.a.i(!this.f7084g);
        this.f7081d = i10;
    }
}
