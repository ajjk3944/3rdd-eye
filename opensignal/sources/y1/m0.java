package y1;

import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f25743a;

    public m0(n0 n0Var) {
        this.f25743a = n0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f25743a.f25751r.removeCallbacks(this);
        n0.r0(this.f25743a);
        n0 n0Var = this.f25743a;
        synchronized (n0Var.f25752x) {
            if (n0Var.F) {
                n0Var.F = false;
                ArrayList arrayList = n0Var.B;
                n0Var.B = n0Var.D;
                n0Var.D = arrayList;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) arrayList.get(i10)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        n0.r0(this.f25743a);
        n0 n0Var = this.f25743a;
        synchronized (n0Var.f25752x) {
            if (n0Var.B.isEmpty()) {
                n0Var.f25750g.removeFrameCallback(this);
                n0Var.F = false;
            }
        }
    }
}
