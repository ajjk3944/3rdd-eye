package Q2;

import android.os.StrictMode;

/* loaded from: classes.dex */
public abstract class d {
    public static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
