package e2;

import E1.j;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5413a extends AbstractC5414b {

    /* renamed from: i, reason: collision with root package name */
    private final Executor f46135i;

    /* renamed from: j, reason: collision with root package name */
    volatile RunnableC1726a f46136j;

    /* renamed from: k, reason: collision with root package name */
    volatile RunnableC1726a f46137k;

    /* renamed from: l, reason: collision with root package name */
    long f46138l;

    /* renamed from: m, reason: collision with root package name */
    long f46139m;

    /* renamed from: n, reason: collision with root package name */
    Handler f46140n;

    /* renamed from: e2.a$a, reason: collision with other inner class name */
    final class RunnableC1726a extends AbstractC5415c implements Runnable {

        /* renamed from: k, reason: collision with root package name */
        private final CountDownLatch f46141k = new CountDownLatch(1);

        /* renamed from: l, reason: collision with root package name */
        boolean f46142l;

        RunnableC1726a() {
        }

        @Override // e2.AbstractC5415c
        protected void g(Object obj) {
            try {
                AbstractC5413a.this.y(this, obj);
            } finally {
                this.f46141k.countDown();
            }
        }

        @Override // e2.AbstractC5415c
        protected void h(Object obj) {
            try {
                AbstractC5413a.this.z(this, obj);
            } finally {
                this.f46141k.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e2.AbstractC5415c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Object b(Void... voidArr) {
            try {
                return AbstractC5413a.this.D();
            } catch (OperationCanceledException e10) {
                if (f()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f46142l = false;
            AbstractC5413a.this.A();
        }
    }

    public AbstractC5413a(Context context) {
        this(context, AbstractC5415c.f46154h);
    }

    void A() {
        if (this.f46137k != null || this.f46136j == null) {
            return;
        }
        if (this.f46136j.f46142l) {
            this.f46136j.f46142l = false;
            this.f46140n.removeCallbacks(this.f46136j);
        }
        if (this.f46138l <= 0 || SystemClock.uptimeMillis() >= this.f46139m + this.f46138l) {
            this.f46136j.c(this.f46135i, null);
        } else {
            this.f46136j.f46142l = true;
            this.f46140n.postAtTime(this.f46136j, this.f46139m + this.f46138l);
        }
    }

    public abstract Object B();

    public void C(Object obj) {
    }

    protected Object D() {
        return B();
    }

    @Override // e2.AbstractC5414b
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f46136j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f46136j);
            printWriter.print(" waiting=");
            printWriter.println(this.f46136j.f46142l);
        }
        if (this.f46137k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f46137k);
            printWriter.print(" waiting=");
            printWriter.println(this.f46137k.f46142l);
        }
        if (this.f46138l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            j.c(this.f46138l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            j.b(this.f46139m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // e2.AbstractC5414b
    protected boolean l() {
        if (this.f46136j == null) {
            return false;
        }
        if (!this.f46147d) {
            this.f46150g = true;
        }
        if (this.f46137k != null) {
            if (this.f46136j.f46142l) {
                this.f46136j.f46142l = false;
                this.f46140n.removeCallbacks(this.f46136j);
            }
            this.f46136j = null;
            return false;
        }
        if (this.f46136j.f46142l) {
            this.f46136j.f46142l = false;
            this.f46140n.removeCallbacks(this.f46136j);
            this.f46136j = null;
            return false;
        }
        boolean zA = this.f46136j.a(false);
        if (zA) {
            this.f46137k = this.f46136j;
            x();
        }
        this.f46136j = null;
        return zA;
    }

    @Override // e2.AbstractC5414b
    protected void n() {
        super.n();
        b();
        this.f46136j = new RunnableC1726a();
        A();
    }

    public void x() {
    }

    void y(RunnableC1726a runnableC1726a, Object obj) {
        C(obj);
        if (this.f46137k == runnableC1726a) {
            t();
            this.f46139m = SystemClock.uptimeMillis();
            this.f46137k = null;
            e();
            A();
        }
    }

    void z(RunnableC1726a runnableC1726a, Object obj) {
        if (this.f46136j != runnableC1726a) {
            y(runnableC1726a, obj);
            return;
        }
        if (j()) {
            C(obj);
            return;
        }
        c();
        this.f46139m = SystemClock.uptimeMillis();
        this.f46136j = null;
        f(obj);
    }

    private AbstractC5413a(Context context, Executor executor) {
        super(context);
        this.f46139m = -10000L;
        this.f46135i = executor;
    }
}
