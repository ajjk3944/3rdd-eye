package d;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.o0;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f21593a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f21594b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21595c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f21596d;

    public g(j jVar) {
        this.f21596d = jVar;
    }

    public final void a(View view) {
        if (this.f21595c) {
            return;
        }
        this.f21595c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        nk.k.e(runnable, "runnable");
        this.f21594b = runnable;
        View decorView = this.f21596d.getWindow().getDecorView();
        nk.k.d(decorView, "getDecorView(...)");
        if (!this.f21595c) {
            decorView.postOnAnimation(new o0(18, this));
        } else if (nk.k.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f21594b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f21593a) {
                this.f21595c = false;
                this.f21596d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f21594b = null;
        t tVar = (t) this.f21596d.g.getValue();
        synchronized (tVar.f21631b) {
            z3 = tVar.f21632c;
        }
        if (z3) {
            this.f21595c = false;
            this.f21596d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21596d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
