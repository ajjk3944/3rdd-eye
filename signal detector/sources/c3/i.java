package c3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5909a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5910b;

    public i() {
        W2.e eVar = new W2.e(Looper.getMainLooper(), 2, false);
        Looper.getMainLooper();
        this.f5910b = eVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5909a) {
            case 0:
                ((W2.e) this.f5910b).post(runnable);
                break;
            default:
                ((Handler) ((V2.e) this.f5910b).f3869c).post(runnable);
                break;
        }
    }

    public i(V2.e eVar) {
        this.f5910b = eVar;
    }
}
