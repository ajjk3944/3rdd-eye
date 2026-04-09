package o2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import m2.k;

/* loaded from: classes.dex */
public class b implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final k f23574a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f23575b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final Executor f23576c = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.c(runnable);
        }
    }

    public b(Executor executor) {
        this.f23574a = new k(executor);
    }

    @Override // o2.a
    public Executor a() {
        return this.f23576c;
    }

    @Override // o2.a
    public void b(Runnable runnable) {
        this.f23574a.execute(runnable);
    }

    public void c(Runnable runnable) {
        this.f23575b.post(runnable);
    }

    @Override // o2.a
    public k getBackgroundExecutor() {
        return this.f23574a;
    }
}
