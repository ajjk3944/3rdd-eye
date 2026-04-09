package j2;

import android.os.Handler;
import android.view.Choreographer;
import com.google.android.gms.internal.ads.wa;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j0 extends xk.r {

    /* renamed from: m, reason: collision with root package name */
    public static final yj.n f27189m = a.a.u(e0.g);

    /* renamed from: n, reason: collision with root package name */
    public static final wa f27190n = new wa(7);

    /* renamed from: c, reason: collision with root package name */
    public final Choreographer f27191c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f27192d;

    /* renamed from: i, reason: collision with root package name */
    public boolean f27196i;
    public boolean j;

    /* renamed from: l, reason: collision with root package name */
    public final l0 f27198l;

    /* renamed from: e, reason: collision with root package name */
    public final Object f27193e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final zj.l f27194f = new zj.l();
    public ArrayList g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f27195h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final i0 f27197k = new i0(this);

    public j0(Choreographer choreographer, Handler handler) {
        this.f27191c = choreographer;
        this.f27192d = handler;
        this.f27198l = new l0(choreographer, this);
    }

    public static final void X(j0 j0Var) {
        boolean z3;
        do {
            Runnable runnableY = j0Var.Y();
            while (runnableY != null) {
                runnableY.run();
                runnableY = j0Var.Y();
            }
            synchronized (j0Var.f27193e) {
                if (j0Var.f27194f.isEmpty()) {
                    z3 = false;
                    j0Var.f27196i = false;
                } else {
                    z3 = true;
                }
            }
        } while (z3);
    }

    @Override // xk.r
    public final void T(ck.h hVar, Runnable runnable) {
        synchronized (this.f27193e) {
            this.f27194f.addLast(runnable);
            if (!this.f27196i) {
                this.f27196i = true;
                this.f27192d.post(this.f27197k);
                if (!this.j) {
                    this.j = true;
                    this.f27191c.postFrameCallback(this.f27197k);
                }
            }
        }
    }

    public final Runnable Y() {
        Runnable runnable;
        synchronized (this.f27193e) {
            zj.l lVar = this.f27194f;
            runnable = (Runnable) (lVar.isEmpty() ? null : lVar.removeFirst());
        }
        return runnable;
    }
}
