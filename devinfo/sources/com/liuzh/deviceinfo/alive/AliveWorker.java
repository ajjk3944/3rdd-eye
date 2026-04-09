package com.liuzh.deviceinfo.alive;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import b7.r;
import cg.a;
import ci.b;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.utilities.d;
import com.liuzh.deviceinfo.widget.CommonWidget;
import com.liuzh.deviceinfo.widget.CommonWidget4x2;
import com.liuzh.deviceinfo.widget.RamWidget;
import com.liuzh.deviceinfo.widget.StorageWidget2x1;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import nk.k;
import t6.s;
import t6.t;
import t6.v;
import t6.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class AliveWorker extends Worker {
    public AliveWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static void a(DeviceInfoApp deviceInfoApp) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        k.e(timeUnit, "repeatIntervalTimeUnit");
        y yVar = new y(1, AliveWorker.class);
        r rVar = (r) yVar.f25040b;
        long millis = timeUnit.toMillis(30L);
        rVar.getClass();
        String str = r.f2029z;
        if (millis < 900000) {
            v.e().h(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j = millis < 900000 ? 900000L : millis;
        long j8 = millis < 900000 ? 900000L : millis;
        if (j < 900000) {
            v.e().h(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        rVar.f2036h = j >= 900000 ? j : 900000L;
        if (j8 < 300000) {
            v.e().h(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j8 > rVar.f2036h) {
            v.e().h(str, "Flex duration greater than interval duration; Changed to " + j);
        }
        rVar.f2037i = b.f(j8, 300000L, rVar.f2036h);
        ((LinkedHashSet) yVar.f25041c).add("AliveWorker");
        u6.r.D(deviceInfoApp).f(yVar.a());
    }

    @Override // androidx.work.Worker
    public final t doWork() {
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        a.f2848b.g();
        int i4 = RamWidget.f21395a;
        d.s(RamWidget.class);
        int i10 = CommonWidget.f21392a;
        d.s(CommonWidget.class);
        d.s(CommonWidget4x2.class);
        d.s(StorageWidget2x1.class);
        kh.a.a();
        CoreService.a(deviceInfoApp);
        return new s();
    }
}
