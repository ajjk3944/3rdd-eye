package c;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.f0;
import com.google.android.gms.internal.measurement.h4;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: d, reason: collision with root package name */
    public Runnable f3025d;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f3027r;

    /* renamed from: a, reason: collision with root package name */
    public final long f3024a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3026g = false;

    public k(l lVar) {
        this.f3027r = lVar;
    }

    public final void a(View view) {
        if (this.f3026g) {
            return;
        }
        this.f3026g = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3025d = runnable;
        View decorView = this.f3027r.getWindow().getDecorView();
        if (!this.f3026g) {
            decorView.postOnAnimation(new f0(3, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z10;
        Runnable runnable = this.f3025d;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f3024a) {
                this.f3026g = false;
                this.f3027r.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f3025d = null;
        h4 h4Var = this.f3027r.E;
        synchronized (h4Var.f5056d) {
            z10 = h4Var.f5055a;
        }
        if (z10) {
            this.f3026g = false;
            this.f3027r.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3027r.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
