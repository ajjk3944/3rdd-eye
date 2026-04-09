package androidx.camera.video.internal.compat.quirk;

import W.C1635x;
import android.os.Build;
import androidx.camera.core.impl.I;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk, SurfaceProcessingQuirk {
    public static boolean d() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean e() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean f() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean g() {
        return "OPPO".equalsIgnoreCase(Build.BRAND) && "PHT110".equalsIgnoreCase(Build.MODEL);
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final boolean a() {
        return d() || e() || f() || g();
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean b(I i, C1635x c1635x) {
        if (d() || e()) {
            if (c1635x != C1635x.f13310d) {
                return false;
            }
        } else if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            if (c1635x != C1635x.f13308b && c1635x != C1635x.f13309c) {
                return false;
            }
        } else if (f()) {
            if (i.g() != 0) {
                return false;
            }
            if (c1635x != C1635x.f13309c && c1635x != C1635x.f13308b) {
                return false;
            }
        } else if (!g() || i.g() != 1 || c1635x != C1635x.f13310d) {
            return false;
        }
        return true;
    }
}
