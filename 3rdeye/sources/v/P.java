package v;

import C.C0634v;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import w.C5687a;
import w.C5704r;

/* compiled from: CameraIdUtil.java */
/* loaded from: classes.dex */
public final class P {
    public static boolean a(String str, C5704r c5704r) throws C.P {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) c5704r.b(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C5687a e4) {
            throw new C.P(new C0634v(e4));
        }
    }
}
