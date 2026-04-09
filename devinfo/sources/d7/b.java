package d7;

import a0.x0;
import android.os.Handler;
import ea.o;
import ec.l1;
import ec.o1;
import ec.q2;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21983a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21984b;

    public /* synthetic */ b(int i4, Object obj) {
        this.f21983a = i4;
        this.f21984b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f21983a) {
            case 0:
                ((Handler) ((x0) this.f21984b).f146c).post(runnable);
                break;
            case 1:
                ((Executor) this.f21984b).execute(new o(0, runnable));
                break;
            default:
                l1 l1Var = ((o1) ((q2) this.f21984b).f218b).g;
                o1.m(l1Var);
                l1Var.K(runnable);
                break;
        }
    }
}
