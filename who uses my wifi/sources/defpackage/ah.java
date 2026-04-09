package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ah implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long f = SystemClock.uptimeMillis() + 10000;
    public Runnable g;
    public boolean h;
    public final /* synthetic */ i5 i;

    public ah(i5 i5Var) {
        this.i = i5Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i30.m(runnable, "runnable");
        this.g = runnable;
        View decorView = this.i.getWindow().getDecorView();
        i30.l(decorView, "getDecorView(...)");
        if (!this.h) {
            decorView.postOnAnimation(new e2(4, this));
        } else if (i30.c(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.g;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f) {
                this.h = false;
                this.i.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.g = null;
        qx qxVar = (qx) this.i.l.a();
        synchronized (qxVar.b) {
            z = qxVar.c;
        }
        if (z) {
            this.h = false;
            this.i.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
