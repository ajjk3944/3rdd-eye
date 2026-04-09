package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.C1712s;
import androidx.camera.core.impl.P0;

/* compiled from: CaptureCallbackAdapter.java */
/* loaded from: classes.dex */
public final class T extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1707p f46638a;

    public T(AbstractC1707p abstractC1707p) {
        if (abstractC1707p == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f46638a = abstractC1707p;
    }

    public static int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof P0) && (num = (Integer) ((P0) captureRequest.getTag()).f14935a.get("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        P0 p02;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            A2.l.k("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof P0);
            p02 = (P0) tag;
        } else {
            p02 = P0.f14934b;
        }
        this.f46638a.b(a(captureRequest), new C5651f(p02, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f46638a.c(a(captureRequest), new C1712s(C1712s.a.ERROR));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j4, long j10) {
        super.onCaptureStarted(cameraCaptureSession, captureRequest, j4, j10);
        this.f46638a.d(a(captureRequest));
    }
}
