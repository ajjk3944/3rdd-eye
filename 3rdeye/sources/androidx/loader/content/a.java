package androidx.loader.content;

import K0.g;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: AsyncTaskLoader.java */
/* loaded from: classes.dex */
public abstract class a<D> extends b<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile a<D>.RunnableC0248a mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile a<D>.RunnableC0248a mTask;
    long mUpdateThrottle;

    /* compiled from: AsyncTaskLoader.java */
    /* renamed from: androidx.loader.content.a$a, reason: collision with other inner class name */
    public final class RunnableC0248a extends c<Void, Void, D> implements Runnable {

        /* renamed from: j, reason: collision with root package name */
        public final CountDownLatch f16193j = new CountDownLatch(1);

        /* renamed from: k, reason: collision with root package name */
        public boolean f16194k;

        public RunnableC0248a() {
        }

        @Override // androidx.loader.content.c
        public final Object a() {
            return a.this.onLoadInBackground();
        }

        @Override // androidx.loader.content.c
        public final void b(D d10) {
            CountDownLatch countDownLatch = this.f16193j;
            try {
                a.this.dispatchOnCancelled(this, d10);
            } finally {
                countDownLatch.countDown();
            }
        }

        @Override // androidx.loader.content.c
        public final void c(D d10) {
            CountDownLatch countDownLatch = this.f16193j;
            try {
                a.this.dispatchOnLoadComplete(this, d10);
            } finally {
                countDownLatch.countDown();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f16194k = false;
            a.this.executePendingTask();
        }
    }

    public a(Context context) {
        this(context, c.f16196g);
    }

    public void dispatchOnCancelled(a<D>.RunnableC0248a runnableC0248a, D d10) {
        onCanceled(d10);
        if (this.mCancellingTask == runnableC0248a) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(a<D>.RunnableC0248a runnableC0248a, D d10) {
        if (this.mTask != runnableC0248a) {
            dispatchOnCancelled(runnableC0248a, d10);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d10);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d10);
    }

    @Override // androidx.loader.content.b
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f16194k);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f16194k);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            g.a(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            long j4 = this.mLastLoadCompleteTime;
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (j4 == 0) {
                printWriter.print("--");
            } else {
                g.a(j4 - jUptimeMillis, printWriter);
            }
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f16194k) {
            this.mTask.f16194k = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.f16194k = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        a<D>.RunnableC0248a runnableC0248a = this.mTask;
        Executor executor = this.mExecutor;
        if (runnableC0248a.f16200d == c.g.PENDING) {
            runnableC0248a.f16200d = c.g.RUNNING;
            runnableC0248a.f16198b.getClass();
            executor.execute(runnableC0248a.f16199c);
        } else {
            int i = c.d.f16206a[runnableC0248a.f16200d.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract D loadInBackground();

    @Override // androidx.loader.content.b
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f16194k) {
                this.mTask.f16194k = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.f16194k) {
            this.mTask.f16194k = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        a<D>.RunnableC0248a runnableC0248a = this.mTask;
        runnableC0248a.f16201e.set(true);
        boolean zCancel = runnableC0248a.f16199c.cancel(false);
        if (zCancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zCancel;
    }

    @Override // androidx.loader.content.b
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new RunnableC0248a();
        executePendingTask();
    }

    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j4) {
        this.mUpdateThrottle = j4;
        if (j4 != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() throws InterruptedException {
        a<D>.RunnableC0248a runnableC0248a = this.mTask;
        if (runnableC0248a != null) {
            try {
                runnableC0248a.f16193j.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    private a(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }

    public void cancelLoadInBackground() {
    }

    public void onCanceled(D d10) {
    }
}
