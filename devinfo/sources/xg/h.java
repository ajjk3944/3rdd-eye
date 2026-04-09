package xg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import androidx.lifecycle.l0;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.monitor.CustomMonitorConfig;
import com.liuzh.deviceinfo.monitor.MonitorManager;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends hg.e {

    /* renamed from: b, reason: collision with root package name */
    public final l0 f37106b;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(android.os.Bundle r26) {
        /*
            r25 = this;
            r0 = r26
            r25.<init>()
            androidx.lifecycle.l0 r1 = new androidx.lifecycle.l0
            if (r0 == 0) goto L20
            boolean r2 = wi.h.f36763i
            java.lang.String r3 = "custom_monitor"
            if (r2 == 0) goto L18
            java.lang.Class<com.liuzh.deviceinfo.monitor.CustomMonitorConfig> r2 = com.liuzh.deviceinfo.monitor.CustomMonitorConfig.class
            java.lang.Object r0 = r0.getParcelable(r3, r2)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            goto L1c
        L18:
            android.os.Parcelable r0 = r0.getParcelable(r3)
        L1c:
            com.liuzh.deviceinfo.monitor.CustomMonitorConfig r0 = (com.liuzh.deviceinfo.monitor.CustomMonitorConfig) r0
            if (r0 != 0) goto L5c
        L20:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "toString(...)"
            nk.k.d(r3, r0)
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
            com.liuzh.deviceinfo.monitor.CustomMonitorConfig r2 = new com.liuzh.deviceinfo.monitor.CustomMonitorConfig
            r23 = 98304(0x18000, float:1.37753E-40)
            r24 = 0
            java.lang.String r4 = ""
            r5 = 0
            r6 = 1098907648(0x41800000, float:16.0)
            r7 = 1053609165(0x3ecccccd, float:0.4)
            r8 = 1
            r9 = 1084227584(0x40a00000, float:5.0)
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = -1
            r17 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r20, r21, r22, r23, r24)
            r0 = r2
        L5c:
            r1.<init>(r0)
            r0 = r25
            r0.f37106b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.h.<init>(android.os.Bundle):void");
    }

    public final void g(Context context) {
        Point pointB = MonitorManager.f21223f.b();
        if (pointB != null) {
            Resources resources = context.getResources();
            k.d(resources, "getResources(...)");
            boolean zV = a4.a.v(resources);
            l0 l0Var = this.f37106b;
            Object objD = l0Var.d();
            k.b(objD);
            CustomMonitorConfig customMonitorConfig = (CustomMonitorConfig) objD;
            l0Var.j(CustomMonitorConfig.copy$default(customMonitorConfig, null, null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, zV ? customMonitorConfig.getLandscapeX() : pointB.x, zV ? customMonitorConfig.getLandscapeY() : pointB.y, zV ? pointB.x : customMonitorConfig.getPortraitX(), zV ? pointB.y : customMonitorConfig.getPortraitY(), 0L, 0L, false, false, false, null, 258303, null));
        }
    }

    public final void h(CustomMonitorConfig customMonitorConfig) {
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        k.d(deviceInfoApp, "instance");
        g(deviceInfoApp);
        this.f37106b.j(customMonitorConfig);
        MonitorManager.f21223f.g(CustomMonitorConfig.copy$default(customMonitorConfig, "monitor_preview", null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, true, false, false, null, 245758, null));
    }

    public final void i(Context context, int i4, int i10) {
        g(context);
        Point pointB = MonitorManager.f21223f.b();
        if (pointB == null) {
            return;
        }
        Resources resources = context.getResources();
        k.d(resources, "getResources(...)");
        boolean zV = a4.a.v(resources);
        Object objD = this.f37106b.d();
        k.b(objD);
        CustomMonitorConfig customMonitorConfig = (CustomMonitorConfig) objD;
        Point point = new Point(pointB.x + i4, pointB.y + i10);
        h(CustomMonitorConfig.copy$default(customMonitorConfig, null, null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, zV ? customMonitorConfig.getLandscapeX() : point.x, zV ? customMonitorConfig.getLandscapeY() : point.y, zV ? point.x : customMonitorConfig.getPortraitX(), zV ? point.y : customMonitorConfig.getPortraitY(), 0L, 0L, false, false, false, null, 258303, null));
        g(context);
    }
}
