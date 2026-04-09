package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    n2.a mFuture;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.o(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.p(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final com.google.common.util.concurrent.a startWork() {
        this.mFuture = n2.a.s();
        getBackgroundExecutor().execute(new a());
        return this.mFuture;
    }
}
