package rb;

import a5.d0;
import android.hardware.display.DisplayManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class o implements m, DisplayManager.DisplayListener, s5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21494a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayManager f21495b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21496c;

    public /* synthetic */ o(DisplayManager displayManager, int i10) {
        this.f21494a = i10;
        this.f21495b = displayManager;
    }

    @Override // rb.m, s5.f
    public final void a() {
        switch (this.f21494a) {
            case 0:
                this.f21495b.unregisterDisplayListener(this);
                this.f21496c = null;
                break;
            default:
                this.f21495b.unregisterDisplayListener(this);
                this.f21496c = null;
                break;
        }
    }

    @Override // s5.f
    public void b(io.sentry.android.replay.capture.e eVar) {
        this.f21496c = eVar;
        Handler handlerK = d0.k(null);
        DisplayManager displayManager = this.f21495b;
        displayManager.registerDisplayListener(this, handlerK);
        eVar.c(displayManager.getDisplay(0));
    }

    @Override // rb.m
    public void c(io.sentry.android.replay.capture.e eVar) {
        this.f21496c = eVar;
        Handler handlerL = qb.v.l(null);
        DisplayManager displayManager = this.f21495b;
        displayManager.registerDisplayListener(this, handlerL);
        eVar.c(displayManager.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
        int i11 = this.f21494a;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        switch (this.f21494a) {
            case 0:
                io.sentry.android.replay.capture.e eVar = (io.sentry.android.replay.capture.e) this.f21496c;
                if (eVar != null && i10 == 0) {
                    eVar.c(this.f21495b.getDisplay(0));
                    break;
                }
                break;
            default:
                io.sentry.android.replay.capture.e eVar2 = (io.sentry.android.replay.capture.e) this.f21496c;
                if (eVar2 != null && i10 == 0) {
                    eVar2.c(this.f21495b.getDisplay(0));
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
        int i11 = this.f21494a;
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(int i10) {
    }

    private final void g(int i10) {
    }
}
