package v;

import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.H0;
import java.util.HashMap;
import java.util.List;

/* compiled from: CaptureSessionInterface.java */
/* loaded from: classes.dex */
public interface Z {
    void a();

    A4.a b(H0 h02, CameraDevice cameraDevice, r0 r0Var);

    void c(HashMap map);

    void close();

    List<androidx.camera.core.impl.S> d();

    void e(List<androidx.camera.core.impl.S> list);

    H0 f();

    void g(H0 h02);

    boolean h();

    A4.a release();
}
