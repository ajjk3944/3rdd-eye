package sh;

import android.app.Activity;
import android.content.SharedPreferences;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.monitor.MonitorManager;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33755b;

    public /* synthetic */ r(int i4, Object obj) {
        this.f33754a = i4;
        this.f33755b = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        j1.q qVar;
        Location location;
        switch (this.f33754a) {
            case 0:
                a0 a0Var = (a0) this.f33755b;
                a0Var.getClass();
                if (!"distance_unit".equals(str) || (qVar = a0Var.f33628k0) == null || (location = a0Var.f33629l0) == null) {
                    return;
                }
                qVar.a(location);
                return;
            case 1:
                MonitorManager monitorManager = (MonitorManager) this.f33755b;
                MonitorManager monitorManager2 = MonitorManager.f21223f;
                if (TextUtils.equals(str, "monitor_bg_transparency") || TextUtils.equals(str, "monitor_text_size") || TextUtils.equals(str, "monitor_text_style") || TextUtils.equals(str, "monitor_fixed_position") || TextUtils.equals(str, "monitor_spacing")) {
                    com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                    SharedPreferences sharedPreferences2 = com.liuzh.deviceinfo.utilities.f.f21257c;
                    int i4 = (int) ((sharedPreferences2.getInt("monitor_bg_transparency", 40) / 100.0f) * 255.0f);
                    int iC = a4.a.c(monitorManager.f21224a.getResources(), sharedPreferences2.getInt("monitor_spacing", 10));
                    synchronized (monitorManager.f21227d) {
                        Iterator it = monitorManager.f21227d.entrySet().iterator();
                        while (it.hasNext()) {
                            wg.a aVar = (wg.a) ((Map.Entry) it.next()).getValue();
                            View viewB = aVar.b();
                            viewB.getBackground().setAlpha(i4);
                            viewB.setPadding(iC, iC, iC, iC);
                            aVar.c();
                            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) viewB.getLayoutParams();
                            monitorManager.i(layoutParams, null);
                            try {
                                monitorManager.f21225b.updateViewLayout(viewB, layoutParams);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                DeviceInfoApp deviceInfoApp = (DeviceInfoApp) this.f33755b;
                DeviceInfoApp deviceInfoApp2 = DeviceInfoApp.f21145f;
                if ("dark_mode".equals(str)) {
                    com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                    int i10 = com.liuzh.deviceinfo.utilities.f.f21257c.getInt("dark_mode", 0);
                    i.l.l(i10 != 1 ? i10 != 2 ? 1 : -1 : 2);
                    return;
                } else {
                    if ("observer_recreate_notifier".equals(str)) {
                        Iterator it2 = deviceInfoApp.f21149b.iterator();
                        while (it2.hasNext()) {
                            ((Activity) it2.next()).recreate();
                        }
                        return;
                    }
                    return;
                }
        }
    }
}
