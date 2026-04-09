package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import u.C5616a;
import v.w0;
import w.C5698l;

/* compiled from: CropRegionZoomImpl.java */
/* loaded from: classes.dex */
public final class b0 implements w0.b {

    /* renamed from: a, reason: collision with root package name */
    public final C5698l f46676a;

    public b0(C5698l c5698l) {
        this.f46676a = c5698l;
    }

    @Override // v.w0.b
    public final float b() {
        Float f10 = (Float) this.f46676a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 != null && f10.floatValue() >= 1.0f) {
            return f10.floatValue();
        }
        return 1.0f;
    }

    @Override // v.w0.b
    public final float c() {
        return 1.0f;
    }

    @Override // v.w0.b
    public final void e() {
    }

    @Override // v.w0.b
    public final void a(TotalCaptureResult totalCaptureResult) {
    }

    @Override // v.w0.b
    public final void d(C5616a.C0536a c0536a) {
    }
}
