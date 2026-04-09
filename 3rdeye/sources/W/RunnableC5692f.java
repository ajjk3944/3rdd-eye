package w;

import android.hardware.camera2.CameraCaptureSession;
import w.C5688b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: w.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5692f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5688b.c f47132c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f47133d;

    public /* synthetic */ RunnableC5692f(C5688b.c cVar, CameraCaptureSession cameraCaptureSession, int i) {
        this.f47131b = i;
        this.f47132c = cVar;
        this.f47133d = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47131b) {
            case 0:
                this.f47132c.f47115a.onActive(this.f47133d);
                break;
            default:
                this.f47132c.f47115a.onReady(this.f47133d);
                break;
        }
    }
}
