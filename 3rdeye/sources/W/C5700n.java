package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.ArrayList;
import w.C5688b;
import w.C5703q;
import x.l;

/* compiled from: CameraDeviceCompatApi23Impl.java */
/* renamed from: w.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5700n extends C5703q {
    @Override // w.C5699m.a
    public void a(x.l lVar) throws CameraAccessException, C5687a {
        CameraDevice cameraDevice = this.f47148a;
        C5703q.b(cameraDevice, lVar);
        l.c cVar = lVar.f47623a;
        C5688b.c cVar2 = new C5688b.c(cVar.d(), cVar.b());
        ArrayList arrayListC = C5703q.c(cVar.f());
        C5703q.a aVar = this.f47149b;
        aVar.getClass();
        x.e eVarA = cVar.a();
        Handler handler = aVar.f47150a;
        try {
            if (eVarA != null) {
                InputConfiguration inputConfiguration = eVarA.f47603a.f47604a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayListC, cVar2, handler);
            } else {
                if (cVar.e() == 1) {
                    cameraDevice.createConstrainedHighSpeedCaptureSession(arrayListC, cVar2, handler);
                    return;
                }
                try {
                    cameraDevice.createCaptureSession(arrayListC, cVar2, handler);
                } catch (CameraAccessException e4) {
                    throw new C5687a(e4);
                }
            }
        } catch (CameraAccessException e10) {
            throw new C5687a(e10);
        }
    }
}
