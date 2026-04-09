package dd;

import android.os.Looper;
import java.util.concurrent.Executor;
import zc.a1;
import zc.c1;
import zc.d2;

/* loaded from: classes.dex */
public final class p implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7315a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7316d;

    public /* synthetic */ p(int i10, Object obj) {
        this.f7315a = i10;
        this.f7316d = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7315a) {
            case 0:
                ((yh.a) this.f7316d).post(runnable);
                break;
            case 1:
                ((yh.a) this.f7316d).post(runnable);
                break;
            case 2:
                ((Executor) this.f7316d).execute(new cf.k(runnable, 2));
                break;
            default:
                a1 a1Var = ((c1) ((d2) this.f7316d).f1504d).B;
                c1.g(a1Var);
                a1Var.B1(runnable);
                break;
        }
    }

    public p() {
        this.f7315a = 0;
        yh.a aVar = new yh.a(Looper.getMainLooper(), 7, false);
        Looper.getMainLooper();
        this.f7316d = aVar;
    }

    public p(Looper looper) {
        this.f7315a = 1;
        this.f7316d = new yh.a(looper, 6);
    }
}
