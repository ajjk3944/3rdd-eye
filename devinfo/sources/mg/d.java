package mg;

import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.utilities.y;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f29372a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f29373b;

    static {
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        k.d(deviceInfoApp, "instance");
        if (a4.a.f186b <= 0.0d) {
            Point point = new Point();
            Object systemService = deviceInfoApp.getSystemService("window");
            k.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            defaultDisplay.getRealSize(point);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            double d10 = 2;
            a4.a.f186b = Math.sqrt(Math.pow(point.y / displayMetrics.ydpi, d10) + Math.pow(point.x / displayMetrics.xdpi, d10));
        }
        f29372a = a4.a.f186b >= 7.0d;
        f29373b = !y.e();
    }
}
