package r5;

import a5.c0;
import a5.d0;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import pb.i0;
import pb.l0;

/* loaded from: classes.dex */
public final class n implements o {

    /* renamed from: r, reason: collision with root package name */
    public static final j f21247r = new j(0, -9223372036854775807L);

    /* renamed from: x, reason: collision with root package name */
    public static final j f21248x = new j(2, -9223372036854775807L);

    /* renamed from: y, reason: collision with root package name */
    public static final j f21249y = new j(3, -9223372036854775807L);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f21250a;

    /* renamed from: d, reason: collision with root package name */
    public i0 f21251d;

    /* renamed from: g, reason: collision with root package name */
    public IOException f21252g;

    public n(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i10 = d0.f105a;
        this.f21250a = Executors.newSingleThreadExecutor(new c0(strConcat, 0));
    }

    @Override // r5.o
    public final void a() {
        IOException iOException = this.f21252g;
        if (iOException != null) {
            throw iOException;
        }
        i0 i0Var = this.f21251d;
        if (i0Var != null) {
            int i10 = i0Var.f20379d;
            IOException iOException2 = i0Var.f20381r;
            if (iOException2 != null && i0Var.f20382x > i10) {
                throw iOException2;
            }
        }
    }

    public final void b() {
        i0 i0Var = this.f21251d;
        a5.a.j(i0Var);
        i0Var.a(false);
    }

    public final boolean c() {
        return this.f21252g != null;
    }

    public final boolean d() {
        return this.f21251d != null;
    }

    public final void e(l lVar) {
        i0 i0Var = this.f21251d;
        if (i0Var != null) {
            i0Var.a(true);
        }
        ExecutorService executorService = this.f21250a;
        if (lVar != null) {
            executorService.execute(new l0(2, lVar));
        }
        executorService.shutdown();
    }

    public final long f(k kVar, i iVar, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        a5.a.j(looperMyLooper);
        this.f21252g = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        i0 i0Var = new i0(this, looperMyLooper, kVar, iVar, i10, jElapsedRealtime, 1);
        a5.a.i(this.f21251d == null);
        this.f21251d = i0Var;
        i0Var.f20381r = null;
        this.f21250a.execute(i0Var);
        return jElapsedRealtime;
    }
}
