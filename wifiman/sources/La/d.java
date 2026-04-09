package La;

import android.os.Build;
import kotlin.jvm.internal.AbstractC6492s;
import speedtest.SpeedtestApplicationInfo;

/* loaded from: classes3.dex */
public abstract class d {
    public static final SpeedtestApplicationInfo a(c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        SpeedtestApplicationInfo speedtestApplicationInfo = new SpeedtestApplicationInfo();
        speedtestApplicationInfo.setAppName(cVar.a());
        speedtestApplicationInfo.setAppVersion(cVar.b());
        speedtestApplicationInfo.setOs("android");
        speedtestApplicationInfo.setOsVersion(Build.VERSION.RELEASE);
        return speedtestApplicationInfo;
    }
}
