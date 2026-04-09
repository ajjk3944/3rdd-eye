package com.google.ar.core;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;

/* renamed from: com.google.ar.core.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5049l extends CameraDevice.StateCallback {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f38298d = 0;

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f38299a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CameraDevice.StateCallback f38300b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ SharedCamera f38301c;

    C5049l(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.f38299a = handler;
        this.f38300b = stateCallback;
        this.f38301c = sharedCamera;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f38299a.post(new RunnableC5050m(this.f38300b, cameraDevice, 3));
        this.f38301c.e(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f38299a.post(new RunnableC5050m(this.f38300b, cameraDevice, 2));
        this.f38301c.f(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(final CameraDevice cameraDevice, final int i10) {
        final CameraDevice.StateCallback stateCallback = this.f38300b;
        this.f38299a.post(new Runnable() { // from class: com.google.ar.core.n
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                int i11 = C5049l.f38298d;
                stateCallback.onError(cameraDevice, i10);
            }
        });
        this.f38301c.b();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f38301c.n().b(cameraDevice);
        this.f38299a.post(new RunnableC5050m(this.f38300b, cameraDevice, 0));
        this.f38301c.d(cameraDevice);
        SharedCamera sharedCamera = this.f38301c;
        sharedCamera.n().e(sharedCamera.l());
        SharedCamera sharedCamera2 = this.f38301c;
        sharedCamera2.n().g(sharedCamera2.m());
    }
}
