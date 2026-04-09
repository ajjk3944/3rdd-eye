package j2;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f27184a;

    public i0(j0 j0Var) {
        this.f27184a = j0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f27184a.f27192d.removeCallbacks(this);
        j0.X(this.f27184a);
        j0 j0Var = this.f27184a;
        synchronized (j0Var.f27193e) {
            if (j0Var.j) {
                j0Var.j = false;
                ArrayList arrayList = j0Var.g;
                j0Var.g = j0Var.f27195h;
                j0Var.f27195h = arrayList;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((Choreographer.FrameCallback) arrayList.get(i4)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0.X(this.f27184a);
        j0 j0Var = this.f27184a;
        synchronized (j0Var.f27193e) {
            if (j0Var.g.isEmpty()) {
                j0Var.f27191c.removeFrameCallback(this);
                j0Var.j = false;
            }
        }
    }
}
