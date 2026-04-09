package dd;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o f7312d = new o(2);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ o f7313g = new o(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7314a;

    public /* synthetic */ o(int i10) {
        this.f7314a = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7314a) {
            case 0:
                runnable.run();
                break;
            case 1:
                new Thread(runnable).start();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            default:
                try {
                    runnable.run();
                    break;
                } catch (NullPointerException unused) {
                    return;
                }
        }
    }
}
