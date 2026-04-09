package f5;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f8598a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f8598a.post(runnable);
    }
}
