package K;

import C.S;
import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.z0;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements K0.b {
    @Override // K0.b
    public final void accept(Object obj) {
        boolean z10;
        z0 z0Var = (z0) obj;
        ArrayList arrayList = new ArrayList();
        String str = Build.BRAND;
        boolean z11 = false;
        if (("HUAWEI".equalsIgnoreCase(str) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(str) && "STK-LX1".equalsIgnoreCase(Build.MODEL))) {
            z10 = true;
        } else {
            String str2 = Build.FINGERPRINT;
            if (!str2.startsWith("generic") && !str2.startsWith("unknown")) {
                String str3 = Build.MODEL;
                if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Cuttlefish") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!str.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk"))) {
                    Build.HARDWARE.contains("ranchu");
                }
            }
            z10 = false;
        }
        if (z0Var.a(ImageCaptureRotationOptionQuirk.class, z10)) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (z0Var.a(SurfaceOrderQuirk.class, true)) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        HashSet hashSet = CaptureFailedRetryQuirk.f15126a;
        Locale locale = Locale.US;
        String upperCase = str.toUpperCase(locale);
        String str4 = Build.MODEL;
        if (z0Var.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.f15126a.contains(Pair.create(upperCase, str4.toUpperCase(locale))))) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (z0Var.a(LowMemoryQuirk.class, LowMemoryQuirk.f15130a.contains(str4.toUpperCase(locale)))) {
            arrayList.add(new LowMemoryQuirk());
        }
        HashSet hashSet2 = LargeJpegImageQuirk.f15128a;
        if (z0Var.a(LargeJpegImageQuirk.class, "Samsung".equalsIgnoreCase(str) || LargeJpegImageQuirk.d())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        HashSet hashSet3 = IncorrectJpegMetadataQuirk.f15127a;
        if ("Samsung".equalsIgnoreCase(str) && IncorrectJpegMetadataQuirk.f15127a.contains(Build.DEVICE.toUpperCase(locale))) {
            z11 = true;
        }
        if (z0Var.a(IncorrectJpegMetadataQuirk.class, z11)) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        b.f2936a = new C0((List) arrayList);
        S.a("DeviceQuirks", "core DeviceQuirks = " + C0.g(b.f2936a));
    }
}
