package y1;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n0 extends wt.q {
    public static final lq.q I = kc.f.F(f0.D);
    public static final com.squareup.picasso.c J = new com.squareup.picasso.c(11);
    public boolean E;
    public boolean F;
    public final n0.b1 H;

    /* renamed from: g, reason: collision with root package name */
    public final Choreographer f25750g;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f25751r;

    /* renamed from: x, reason: collision with root package name */
    public final Object f25752x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public final mq.k f25753y = new mq.k();
    public ArrayList B = new ArrayList();
    public ArrayList D = new ArrayList();
    public final m0 G = new m0(this);

    public n0(Choreographer choreographer, Handler handler) {
        this.f25750g = choreographer;
        this.f25751r = handler;
        this.H = new n0.b1(choreographer, this);
    }

    public static final void r0(n0 n0Var) {
        Runnable runnable;
        boolean z10;
        do {
            synchronized (n0Var.f25752x) {
                mq.k kVar = n0Var.f25753y;
                runnable = (Runnable) (kVar.isEmpty() ? null : kVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (n0Var.f25752x) {
                    mq.k kVar2 = n0Var.f25753y;
                    runnable = (Runnable) (kVar2.isEmpty() ? null : kVar2.removeFirst());
                }
            }
            synchronized (n0Var.f25752x) {
                if (n0Var.f25753y.isEmpty()) {
                    z10 = false;
                    n0Var.E = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // wt.q
    public final void n0(pq.h hVar, Runnable runnable) {
        synchronized (this.f25752x) {
            this.f25753y.addLast(runnable);
            if (!this.E) {
                this.E = true;
                this.f25751r.post(this.G);
                if (!this.F) {
                    this.F = true;
                    this.f25750g.postFrameCallback(this.G);
                }
            }
        }
    }
}
