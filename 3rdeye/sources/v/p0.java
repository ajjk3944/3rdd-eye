package v;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import o0.b;

/* compiled from: SynchronizedCaptureSessionBaseImpl.java */
/* loaded from: classes.dex */
public final class p0 extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f46826a;

    public p0(r0 r0Var) {
        this.f46826a = r0Var;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        r0 r0Var = this.f46826a;
        r0Var.o(cameraCaptureSession);
        r0Var.a(r0Var);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        r0 r0Var = this.f46826a;
        r0Var.o(cameraCaptureSession);
        r0Var.g(r0Var);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        r0 r0Var = this.f46826a;
        r0Var.o(cameraCaptureSession);
        r0Var.h(r0Var);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        b.a<Void> aVar;
        try {
            this.f46826a.o(cameraCaptureSession);
            r0 r0Var = this.f46826a;
            r0Var.i(r0Var);
            synchronized (this.f46826a.f46834a) {
                A2.l.p(this.f46826a.i, "OpenCaptureSession completer should not null");
                r0 r0Var2 = this.f46826a;
                aVar = r0Var2.i;
                r0Var2.i = null;
            }
            aVar.d(new IllegalStateException("onConfigureFailed"));
        } catch (Throwable th) {
            synchronized (this.f46826a.f46834a) {
                A2.l.p(this.f46826a.i, "OpenCaptureSession completer should not null");
                r0 r0Var3 = this.f46826a;
                b.a<Void> aVar2 = r0Var3.i;
                r0Var3.i = null;
                aVar2.d(new IllegalStateException("onConfigureFailed"));
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        b.a<Void> aVar;
        try {
            this.f46826a.o(cameraCaptureSession);
            r0 r0Var = this.f46826a;
            r0Var.j(r0Var);
            synchronized (this.f46826a.f46834a) {
                A2.l.p(this.f46826a.i, "OpenCaptureSession completer should not null");
                r0 r0Var2 = this.f46826a;
                aVar = r0Var2.i;
                r0Var2.i = null;
            }
            aVar.b(null);
        } catch (Throwable th) {
            synchronized (this.f46826a.f46834a) {
                A2.l.p(this.f46826a.i, "OpenCaptureSession completer should not null");
                r0 r0Var3 = this.f46826a;
                b.a<Void> aVar2 = r0Var3.i;
                r0Var3.i = null;
                aVar2.b(null);
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        r0 r0Var = this.f46826a;
        r0Var.o(cameraCaptureSession);
        r0Var.k(r0Var);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        r0 r0Var = this.f46826a;
        r0Var.o(cameraCaptureSession);
        r0Var.m(r0Var, surface);
    }
}
