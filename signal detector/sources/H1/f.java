package H1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1762a;

    public /* synthetic */ f(int i) {
        this.f1762a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1762a) {
            case 0:
                p.f().post(runnable);
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            default:
                new Thread(runnable).start();
                break;
        }
    }
}
