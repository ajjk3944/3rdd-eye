package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import androidx.camera.core.impl.U;
import u.C5616a;
import v.w0;
import w.C5698l;

/* compiled from: AndroidRZoomImpl.java */
/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5646a implements w0.b {

    /* renamed from: a, reason: collision with root package name */
    public final Range<Float> f46660a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46661b;

    public C5646a(C5698l c5698l) {
        boolean z10 = false;
        this.f46661b = false;
        this.f46660a = (Range) c5698l.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) c5698l.f47142b.f47140a.get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (iArr[i] == 1) {
                        z10 = true;
                        break;
                    }
                    i++;
                }
            }
        }
        this.f46661b = z10;
    }

    @Override // v.w0.b
    public final float b() {
        return ((Float) this.f46660a.getUpper()).floatValue();
    }

    @Override // v.w0.b
    public final float c() {
        return ((Float) this.f46660a.getLower()).floatValue();
    }

    @Override // v.w0.b
    public final void d(C5616a.C0536a c0536a) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(1.0f);
        U.b priority = U.b.REQUIRED;
        c0536a.c(key, fValueOf, priority);
        if (this.f46661b) {
            kotlin.jvm.internal.l.f(priority, "priority");
            if (Build.VERSION.SDK_INT >= 34) {
                c0536a.c(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, priority);
            }
        }
    }

    @Override // v.w0.b
    public final void e() {
    }

    @Override // v.w0.b
    public final void a(TotalCaptureResult totalCaptureResult) {
    }
}
