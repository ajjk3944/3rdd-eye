package d6;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.unity3d.adsession.DeviceCategory;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static UiModeManager f20790a;

    public static DeviceCategory a() {
        UiModeManager uiModeManager = f20790a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    public static void b(Context context) {
        if (context != null) {
            f20790a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
