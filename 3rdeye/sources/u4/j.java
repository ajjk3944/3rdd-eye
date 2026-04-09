package u4;

import N7.G8;
import android.os.Process;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f46571a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", PluginErrorDetails.Platform.UNITY));
        f46571a = new HashMap();
        G8.r("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PlayCoreVersion");
    }
}
