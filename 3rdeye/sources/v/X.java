package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.H0;
import java.util.Collections;
import z.C5846p;

/* compiled from: CaptureSession.java */
/* loaded from: classes.dex */
public final class X extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f46641a;

    public X(Y y10) {
        this.f46641a = y10;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        synchronized (this.f46641a.f46642a) {
            try {
                H0 h02 = this.f46641a.f46647f;
                if (h02 == null) {
                    return;
                }
                androidx.camera.core.impl.S s10 = h02.f14884g;
                C.S.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                Y y10 = this.f46641a;
                y10.f46654n.getClass();
                y10.e(Collections.singletonList(C5846p.a(s10)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
