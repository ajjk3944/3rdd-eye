package pb;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class n0 implements o0 {

    /* renamed from: r, reason: collision with root package name */
    public static final h0 f20390r = new h0(0, -9223372036854775807L);

    /* renamed from: x, reason: collision with root package name */
    public static final h0 f20391x = new h0(2, -9223372036854775807L);

    /* renamed from: y, reason: collision with root package name */
    public static final h0 f20392y = new h0(3, -9223372036854775807L);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f20393a;

    /* renamed from: d, reason: collision with root package name */
    public i0 f20394d;

    /* renamed from: g, reason: collision with root package name */
    public IOException f20395g;

    public n0(String str) {
        String strConcat = str.length() != 0 ? "ExoPlayer:Loader:".concat(str) : new String("ExoPlayer:Loader:");
        int i10 = qb.v.f20828a;
        this.f20393a = Executors.newSingleThreadExecutor(new a5.c0(strConcat, 2));
    }

    @Override // pb.o0
    public final void a() {
        IOException iOException = this.f20395g;
        if (iOException != null) {
            throw iOException;
        }
        i0 i0Var = this.f20394d;
        if (i0Var != null) {
            int i10 = i0Var.f20379d;
            IOException iOException2 = i0Var.f20381r;
            if (iOException2 != null && i0Var.f20382x > i10) {
                throw iOException2;
            }
        }
    }

    public final void b() {
        i0 i0Var = this.f20394d;
        qb.b.k(i0Var);
        i0Var.a(false);
    }

    public final boolean c() {
        return this.f20395g != null;
    }

    public final boolean d() {
        return this.f20394d != null;
    }

    public final void e(k0 k0Var) {
        i0 i0Var = this.f20394d;
        if (i0Var != null) {
            i0Var.a(true);
        }
        ExecutorService executorService = this.f20393a;
        if (k0Var != null) {
            executorService.execute(new l0(0, k0Var));
        }
        executorService.shutdown();
    }

    public final long f(j0 j0Var, g0 g0Var, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        qb.b.k(looperMyLooper);
        this.f20395g = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        i0 i0Var = new i0(this, looperMyLooper, j0Var, g0Var, i10, jElapsedRealtime, 0);
        qb.b.j(this.f20394d == null);
        this.f20394d = i0Var;
        i0Var.f20381r = null;
        this.f20393a.execute(i0Var);
        return jElapsedRealtime;
    }
}
