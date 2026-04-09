package androidx.work;

import android.content.Context;
import androidx.work.l;
import d2.C4268c;

/* loaded from: classes.dex */
public abstract class Worker extends l {
    C4268c<l.a> mFuture;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Worker worker = Worker.this;
            try {
                worker.mFuture.i(worker.doWork());
            } catch (Throwable th) {
                worker.mFuture.j(th);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4268c f16850b;

        public b(C4268c c4268c) {
            this.f16850b = c4268c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C4268c c4268c = this.f16850b;
            try {
                c4268c.i(Worker.this.getForegroundInfo());
            } catch (Throwable th) {
                c4268c.j(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract l.a doWork();

    public h getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // androidx.work.l
    public A4.a<h> getForegroundInfoAsync() {
        C4268c c4268c = new C4268c();
        getBackgroundExecutor().execute(new b(c4268c));
        return c4268c;
    }

    @Override // androidx.work.l
    public final A4.a<l.a> startWork() {
        this.mFuture = new C4268c<>();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
