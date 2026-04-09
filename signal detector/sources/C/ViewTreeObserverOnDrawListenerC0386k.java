package c;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import h.AbstractActivityC2349g;
import java.util.concurrent.Executor;

/* renamed from: c.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0386k implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f5835a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f5836b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2349g f5838d;

    public ViewTreeObserverOnDrawListenerC0386k(AbstractActivityC2349g abstractActivityC2349g) {
        this.f5838d = abstractActivityC2349g;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        q5.i.e(runnable, "runnable");
        this.f5836b = runnable;
        View decorView = this.f5838d.getWindow().getDecorView();
        q5.i.d(decorView, "window.decorView");
        if (!this.f5837c) {
            decorView.postOnAnimation(new A3.z(10, this));
        } else if (q5.i.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z6;
        Runnable runnable = this.f5836b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f5835a) {
                this.f5837c = false;
                this.f5838d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f5836b = null;
        v vVar = (v) this.f5838d.f5860g.getValue();
        synchronized (vVar.f5873b) {
            z6 = vVar.f5874c;
        }
        if (z6) {
            this.f5837c = false;
            this.f5838d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5838d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
