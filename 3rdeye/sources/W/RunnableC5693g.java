package w;

import android.hardware.camera2.CameraCaptureSession;
import w.C5688b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: w.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5693g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5688b.c f47135c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f47136d;

    public /* synthetic */ RunnableC5693g(C5688b.c cVar, CameraCaptureSession cameraCaptureSession, int i) {
        this.f47134b = i;
        this.f47135c = cVar;
        this.f47136d = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47134b) {
            case 0:
                this.f47135c.f47115a.onClosed(this.f47136d);
                break;
            default:
                this.f47135c.f47115a.onConfigureFailed(this.f47136d);
                break;
        }
    }
}
