package z;

import C.S;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;
import y.C5787a;

/* compiled from: FlashAvailabilityChecker.java */
/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5834d {
    public static boolean a(InterfaceC5833c interfaceC5833c) {
        Boolean bool;
        try {
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            bool = (Boolean) interfaceC5833c.get();
        } catch (BufferUnderflowException e4) {
            if (C5787a.f47852a.e(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                S.a("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                S.c("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e4);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            S.g("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
