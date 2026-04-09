package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import v.C5664t;

/* compiled from: CameraManagerCompatApi28Impl.java */
/* renamed from: w.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5705s extends C5708v {
    public static boolean f(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            if ((!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName())) {
                return true;
            }
        }
        return false;
    }

    @Override // w.C5708v, w.C5704r.b
    public final void a(H.g gVar, C5664t.b bVar) {
        this.f47157a.registerAvailabilityCallback(gVar, bVar);
    }

    @Override // w.C5708v, w.C5704r.b
    public final void b(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f47157a.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // w.C5708v, w.C5704r.b
    public CameraCharacteristics c(String str) throws C5687a {
        try {
            return super.c(str);
        } catch (RuntimeException e4) {
            if (f(e4)) {
                throw new C5687a(e4);
            }
            throw e4;
        }
    }

    @Override // w.C5708v, w.C5704r.b
    public void d(String str, H.g gVar, CameraDevice.StateCallback stateCallback) throws CameraAccessException, C5687a {
        try {
            this.f47157a.openCamera(str, gVar, stateCallback);
        } catch (CameraAccessException e4) {
            throw new C5687a(e4);
        } catch (IllegalArgumentException e10) {
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            if (!f(e12)) {
                throw e12;
            }
            throw new C5687a(e12);
        }
    }
}
