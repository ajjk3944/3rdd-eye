package C2;

import android.app.Activity;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* compiled from: CameraConnectionFragment.java */
/* loaded from: classes.dex */
public final class g extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f899a;

    public g(e eVar) {
        this.f899a = eVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Activity activity = this.f899a.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new f(activity, 0));
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        synchronized (this.f899a.f876d) {
            e eVar = this.f899a;
            if (eVar.f884m == null || eVar.f874b || eVar.f875c) {
                e.f873w.c("Camera is closed or fragment destroyed, aborting session setup", new Object[0]);
                return;
            }
            try {
                try {
                    eVar.f883l = cameraCaptureSession;
                    eVar.f890s.set(CaptureRequest.CONTROL_AF_MODE, 4);
                    this.f899a.f890s.set(CaptureRequest.CONTROL_AE_MODE, 2);
                    e eVar2 = this.f899a;
                    eVar2.f891t = eVar2.f890s.build();
                    e eVar3 = this.f899a;
                    CameraCaptureSession cameraCaptureSession2 = eVar3.f883l;
                    if (cameraCaptureSession2 != null && !eVar3.f874b && !eVar3.f875c) {
                        try {
                            cameraCaptureSession2.setRepeatingRequest(eVar3.f891t, eVar3.i, eVar3.f888q);
                        } catch (IllegalStateException e4) {
                            e.f873w.b(e4, "Camera already closed, ignoring", new Object[0]);
                        }
                    }
                } catch (CameraAccessException e10) {
                    e.f873w.b(e10, "Exception setting up preview!", new Object[0]);
                }
            } catch (Exception e11) {
                e.f873w.b(e11, "Unexpected exception during preview setup!", new Object[0]);
            }
        }
    }
}
