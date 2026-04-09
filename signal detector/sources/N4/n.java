package N4;

import android.app.sdksandbox.sdkprovider.SdkSandboxController;
import android.graphics.Bitmap;
import android.graphics.Gainmap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class n {
    public static /* bridge */ /* synthetic */ SdkSandboxController f(Object obj) {
        return (SdkSandboxController) obj;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return SdkSandboxController.class;
    }

    public static /* synthetic */ Gainmap t(Bitmap bitmap) {
        return new Gainmap(bitmap);
    }
}
