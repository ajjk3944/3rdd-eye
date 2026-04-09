package zf;

import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.widget.BatteryWidget2x1;
import com.liuzh.deviceinfo.widget.CommonWidget;
import com.liuzh.deviceinfo.widget.CommonWidget4x2;
import com.liuzh.deviceinfo.widget.OverViewWidget4x2;
import com.liuzh.deviceinfo.widget.RamWidget;
import com.liuzh.deviceinfo.widget.StorageWidget2x1;
import java.util.TimerTask;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends TimerTask {
    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i4 = RamWidget.f21395a;
        com.liuzh.deviceinfo.utilities.d.s(RamWidget.class);
        int i10 = CommonWidget.f21392a;
        com.liuzh.deviceinfo.utilities.d.s(CommonWidget.class);
        com.liuzh.deviceinfo.utilities.d.s(CommonWidget4x2.class);
        if (OverViewWidget4x2.f21394a != null && a4.a.u(DeviceInfoApp.f21145f) != OverViewWidget4x2.f21394a.booleanValue()) {
            OverViewWidget4x2.c();
        }
        com.liuzh.deviceinfo.utilities.d.s(StorageWidget2x1.class);
        com.liuzh.deviceinfo.utilities.d.s(BatteryWidget2x1.class);
    }
}
