package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;

/* compiled from: CameraCaptureSessionCompatApi28Impl.java */
/* renamed from: w.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5694h extends C5695i {
    @Override // w.C5695i, w.C5688b.a
    public final int a(ArrayList arrayList, H.g gVar, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f47137a.captureBurstRequests(arrayList, gVar, captureCallback);
    }

    @Override // w.C5695i, w.C5688b.a
    public final int b(CaptureRequest captureRequest, H.g gVar, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f47137a.setSingleRepeatingRequest(captureRequest, gVar, captureCallback);
    }
}
