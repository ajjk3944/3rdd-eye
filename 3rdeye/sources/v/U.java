package v;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.AbstractC1707p;

/* compiled from: CaptureCallbackContainer.java */
/* loaded from: classes.dex */
public final class U extends AbstractC1707p {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f46639a;

    public U(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f46639a = captureCallback;
    }
}
