package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Camera2CaptureCallbacks.java */
/* renamed from: v.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5667w extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f46939a = new ArrayList();

    public C5667w(List<CameraCaptureSession.CaptureCallback> list) {
        for (CameraCaptureSession.CaptureCallback captureCallback : list) {
            if (!(captureCallback instanceof C5668x)) {
                this.f46939a.add(captureCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j4) {
        Iterator it = this.f46939a.iterator();
        while (it.hasNext()) {
            CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
            CaptureRequest captureRequest2 = captureRequest;
            Surface surface2 = surface;
            long j10 = j4;
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession2, captureRequest2, surface2, j10);
            cameraCaptureSession = cameraCaptureSession2;
            captureRequest = captureRequest2;
            surface = surface2;
            j4 = j10;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Iterator it = this.f46939a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Iterator it = this.f46939a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Iterator it = this.f46939a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        Iterator it = this.f46939a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j4) {
        Iterator it = this.f46939a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j4);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j4, long j10) {
        Iterator it = this.f46939a.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j4, j10);
        }
    }
}
