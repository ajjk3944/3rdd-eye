package v;

import android.hardware.camera2.CameraCharacteristics;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import w.C5687a;
import w.C5704r;

/* compiled from: CameraSelectionOptimizer.java */
/* loaded from: classes.dex */
public final class Q {
    public static String a(C5704r c5704r, Integer num, List<String> list) throws C5687a {
        if (num != null && list.contains(CommonUrlParts.Values.FALSE_INTEGER) && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) c5704r.b(CommonUrlParts.Values.FALSE_INTEGER).a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) c5704r.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return CommonUrlParts.Values.FALSE_INTEGER;
            }
        }
        return null;
    }
}
