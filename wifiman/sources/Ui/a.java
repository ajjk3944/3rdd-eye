package Ui;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
final class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22933a = new a();

    private a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
