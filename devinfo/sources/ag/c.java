package ag;

import android.app.Activity;
import android.content.Context;
import com.liuzh.deviceinfo.MainActivity;
import com.liuzh.deviceinfo.analyzer.StorageAnalyzeActivity;
import com.liuzh.deviceinfo.location.RealtimeSatelliteActivity;
import com.liuzh.deviceinfo.monitor.MonitorActivity;
import com.liuzh.deviceinfo.sensors.SensorDetailActivity;
import com.liuzh.deviceinfo.settings.SettingsActivity;
import com.liuzh.deviceinfo.tests.TestesActivity;
import com.liuzh.deviceinfo.widget.WidgetsActivity;
import java.util.concurrent.TimeUnit;
import je.u;
import km.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final c f364f;

    /* renamed from: a, reason: collision with root package name */
    public o f365a;

    /* renamed from: b, reason: collision with root package name */
    public long f366b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f367c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f368d;

    /* renamed from: e, reason: collision with root package name */
    public long f369e;

    static {
        c cVar = new c();
        cVar.f365a = null;
        cVar.f366b = 0L;
        cVar.f367c = false;
        cVar.f368d = false;
        cVar.f369e = 0L;
        f364f = cVar;
    }

    public final boolean a(Activity activity, boolean z3) {
        Class<?> cls;
        if (ah.o.f400d.c() || System.currentTimeMillis() - this.f369e < TimeUnit.MINUTES.toMillis(5L) || ((z3 && MainActivity.class != (cls = activity.getClass()) && SettingsActivity.class != cls && MonitorActivity.class != cls && WidgetsActivity.class != cls && StorageAnalyzeActivity.class != cls && TestesActivity.class != cls && RealtimeSatelliteActivity.class != cls && SensorDetailActivity.class != cls) || this.f368d)) {
            return false;
        }
        if (b()) {
            return true;
        }
        c(activity);
        return false;
    }

    public final boolean b() {
        o oVar;
        if (ah.o.f400d.c() || (oVar = this.f365a) == null) {
            return false;
        }
        oVar.getClass();
        return System.currentTimeMillis() - this.f366b < TimeUnit.HOURS.toMillis(4L);
    }

    public final void c(Context context) {
        if (ah.o.f400d.c() || this.f367c || b()) {
            return;
        }
        this.f367c = true;
        pi.a aVar = a.f358a;
        pi.a aVar2 = new pi.a();
        aVar2.f32004b = 1;
        aVar2.f32005c = 5;
        aVar2.f32003a = "ca-app-pub-3724073793374078/8963066858";
        u.k(context, new b(0, this), aVar2);
    }
}
