package v;

import androidx.camera.core.impl.H0;
import java.util.Objects;
import o0.b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: v.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5660o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46815c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46816d;

    public /* synthetic */ RunnableC5660o(int i, Object obj, Object obj2) {
        this.f46814b = i;
        this.f46815c = obj;
        this.f46816d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46814b) {
            case 0:
                ((H0.d) this.f46815c).a((H0) this.f46816d, H0.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
                return;
            case 1:
                ((i0) this.f46815c).c((b.a) this.f46816d);
                return;
            default:
                q0 q0Var = (q0) this.f46815c;
                o0 o0Var = (o0) this.f46816d;
                a0 a0Var = q0Var.f46835b;
                synchronized (a0Var.f46663b) {
                    a0Var.f46664c.remove(q0Var);
                    a0Var.f46665d.remove(q0Var);
                }
                q0Var.l(o0Var);
                if (q0Var.f46840g != null) {
                    Objects.requireNonNull(q0Var.f46839f);
                    q0Var.f46839f.h(o0Var);
                    return;
                } else {
                    C.S.g("SyncCaptureSessionBase", "[" + q0Var + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
                    return;
                }
        }
    }
}
