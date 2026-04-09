package yb;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f f26218d = new f(0);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f f26219g = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26220a;

    public /* synthetic */ f(int i10) {
        this.f26220a = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f26220a) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
