package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import com.google.ar.core.ArCoreApk;
import java.util.function.Consumer;

/* renamed from: com.google.ar.core.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final /* synthetic */ class RunnableC5050m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f38302a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Object f38303b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Object f38304c;

    /* synthetic */ RunnableC5050m(Object obj, Object obj2, int i10) {
        this.f38302a = i10;
        this.f38303b = obj;
        this.f38304c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.function.Consumer] */
    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f38302a) {
            case 0:
                int i10 = C5049l.f38298d;
                ((CameraDevice.StateCallback) this.f38303b).onOpened((CameraDevice) this.f38304c);
                break;
            case 1:
                this.f38304c.accept(this.f38303b);
                break;
            case 2:
                int i11 = C5049l.f38298d;
                ((CameraDevice.StateCallback) this.f38303b).onDisconnected((CameraDevice) this.f38304c);
                break;
            case 3:
                int i12 = C5049l.f38298d;
                ((CameraDevice.StateCallback) this.f38303b).onClosed((CameraDevice) this.f38304c);
                break;
            case 4:
                int i13 = C5052o.f38308d;
                ((CameraCaptureSession.StateCallback) this.f38303b).onConfigured((CameraCaptureSession) this.f38304c);
                break;
            case 5:
                int i14 = C5052o.f38308d;
                ((CameraCaptureSession.StateCallback) this.f38303b).onConfigureFailed((CameraCaptureSession) this.f38304c);
                break;
            case 6:
                int i15 = C5052o.f38308d;
                ((CameraCaptureSession.StateCallback) this.f38303b).onReady((CameraCaptureSession) this.f38304c);
                break;
            case 7:
                int i16 = C5052o.f38308d;
                ((CameraCaptureSession.StateCallback) this.f38303b).onActive((CameraCaptureSession) this.f38304c);
                break;
            default:
                int i17 = C5052o.f38308d;
                ((CameraCaptureSession.StateCallback) this.f38303b).onClosed((CameraCaptureSession) this.f38304c);
                break;
        }
    }

    /* synthetic */ RunnableC5050m(Consumer consumer, ArCoreApk.Availability availability, int i10) {
        this.f38302a = i10;
        this.f38304c = consumer;
        this.f38303b = availability;
    }
}
