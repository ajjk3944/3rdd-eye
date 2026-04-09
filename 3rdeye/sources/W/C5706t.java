package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;

/* compiled from: CameraManagerCompatApi29Impl.java */
/* renamed from: w.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5706t extends C5705s {
    @Override // w.C5705s, w.C5708v, w.C5704r.b
    public final CameraCharacteristics c(String str) throws C5687a {
        try {
            return this.f47157a.getCameraCharacteristics(str);
        } catch (CameraAccessException e4) {
            throw new C5687a(e4);
        }
    }

    @Override // w.C5705s, w.C5708v, w.C5704r.b
    public final void d(String str, H.g gVar, CameraDevice.StateCallback stateCallback) throws CameraAccessException, C5687a {
        try {
            this.f47157a.openCamera(str, gVar, stateCallback);
        } catch (CameraAccessException e4) {
            throw new C5687a(e4);
        }
    }
}
