package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;

/* renamed from: com.google.ar.core.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5052o extends CameraCaptureSession.StateCallback {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f38308d = 0;

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f38309a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CameraCaptureSession.StateCallback f38310b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ SharedCamera f38311c;

    C5052o(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.f38309a = handler;
        this.f38310b = stateCallback;
        this.f38311c = sharedCamera;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f38309a.post(new RunnableC5050m(this.f38310b, cameraCaptureSession, 7));
        this.f38311c.g(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f38309a.post(new RunnableC5050m(this.f38310b, cameraCaptureSession, 8));
        this.f38311c.h(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f38309a.post(new RunnableC5050m(this.f38310b, cameraCaptureSession, 5));
        this.f38311c.i(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f38309a.post(new RunnableC5050m(this.f38310b, cameraCaptureSession, 4));
        this.f38311c.j(cameraCaptureSession);
        if (this.f38311c.n().a() != null) {
            this.f38311c.c();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f38309a.post(new RunnableC5050m(this.f38310b, cameraCaptureSession, 6));
        this.f38311c.k(cameraCaptureSession);
    }
}
