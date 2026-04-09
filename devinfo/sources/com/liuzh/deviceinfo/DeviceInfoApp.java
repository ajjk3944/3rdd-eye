package com.liuzh.deviceinfo;

import a4.a;
import ag.c;
import ah.o;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.a0;
import androidx.lifecycle.f1;
import androidx.lifecycle.r0;
import androidx.lifecycle.y;
import com.liuzh.deviceinfo.monitor.CustomMonitorConfig;
import com.liuzh.deviceinfo.monitor.MonitorManager;
import com.liuzh.deviceinfo.notification.NotificationService;
import com.liuzh.deviceinfo.splash.SplashLoadingActivity;
import com.liuzh.deviceinfo.widget.CommonWidget;
import com.liuzh.deviceinfo.widget.CommonWidget4x2;
import com.liuzh.deviceinfo.widget.OverViewWidget4x2;
import com.liuzh.deviceinfo.widget.RamWidget;
import ec.x;
import ec.z;
import i.l;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import mg.f;
import oi.d;
import oi.e;
import org.xmlpull.v1.XmlPullParserException;
import p6.i;
import sh.r;
import x.n0;
import z2.k;
import zf.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class DeviceInfoApp extends Application implements y {

    /* renamed from: f, reason: collision with root package name */
    public static DeviceInfoApp f21145f;
    public static int g;

    /* renamed from: h, reason: collision with root package name */
    public static int f21146h;

    /* renamed from: i, reason: collision with root package name */
    public static WeakReference f21147i;

    /* renamed from: a, reason: collision with root package name */
    public PackageManager f21148a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f21149b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final c f21150c = c.f364f;

    /* renamed from: d, reason: collision with root package name */
    public final r f21151d = new r(2, this);

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f21152e = true;

    public final PackageManager a() {
        if (this.f21148a == null) {
            this.f21148a = getPackageManager();
        }
        return this.f21148a;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0108 A[Catch: IOException -> 0x009e, XmlPullParserException -> 0x00a1, TryCatch #6 {IOException -> 0x009e, XmlPullParserException -> 0x00a1, blocks: (B:27:0x0091, B:29:0x0097, B:34:0x00a4, B:37:0x00b6, B:62:0x010d, B:39:0x00bd, B:43:0x00cd, B:44:0x00d1, B:50:0x00df, B:61:0x0108, B:55:0x00ee, B:57:0x00f6, B:58:0x00fb, B:60:0x0103), top: B:95:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liuzh.deviceinfo.DeviceInfoApp.b():void");
    }

    public final void d() {
        new Timer().schedule(new b(), 0L, 30000L);
        zf.c cVar = new zf.c();
        ArrayList arrayList = f.f29376a;
        synchronized (arrayList) {
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        Boolean bool = OverViewWidget4x2.f21394a;
        IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        d dVar = new d();
        dVar.f30562a = -1;
        dVar.f30563b = -1;
        dVar.f30564c = null;
        registerReceiver(dVar, intentFilter);
        e eVar = new e();
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
        if (telephonyManager != null) {
            try {
                telephonyManager.listen(eVar, 128);
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.lifecycle.y
    public final void g(a0 a0Var, androidx.lifecycle.r rVar) {
        WeakReference weakReference;
        Activity activity;
        if (rVar != androidx.lifecycle.r.ON_START || (weakReference = f21147i) == null || (activity = (Activity) weakReference.get()) == null || !this.f21150c.a(activity, true)) {
            return;
        }
        activity.startActivity(new Intent(activity, (Class<?>) SplashLoadingActivity.class));
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i4 = g;
        int i10 = configuration.orientation;
        if (i4 != i10) {
            g = i10;
            MonitorManager monitorManager = MonitorManager.f21223f;
            monitorManager.getClass();
            int iL = a.l(f21145f);
            int iM = a.m(f21145f);
            synchronized (monitorManager.f21227d) {
                try {
                    Iterator it = monitorManager.f21227d.entrySet().iterator();
                    while (it.hasNext()) {
                        View viewB = ((wg.a) ((Map.Entry) it.next()).getValue()).b();
                        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) viewB.getLayoutParams();
                        if (a.v(Resources.getSystem())) {
                            Point point = (Point) viewB.getTag();
                            if (point != null) {
                                layoutParams.x = point.x;
                                layoutParams.y = point.y;
                            }
                        } else {
                            viewB.setTag(new Point(layoutParams.x, layoutParams.y));
                        }
                        layoutParams.y = Math.min(layoutParams.y, iL - viewB.getHeight());
                        layoutParams.x = Math.min(layoutParams.x, iM - viewB.getWidth());
                        try {
                            monitorManager.f21225b.updateViewLayout(viewB, layoutParams);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ag.a.d();
        }
        int i11 = configuration.uiMode & 48;
        if (f21146h != i11) {
            f21146h = i11;
            if (!com.liuzh.deviceinfo.utilities.y.d()) {
                NotificationService.e(this);
                NotificationService.d(this);
            }
        }
        int i12 = RamWidget.f21395a;
        com.liuzh.deviceinfo.utilities.d.s(RamWidget.class);
        int i13 = CommonWidget.f21392a;
        com.liuzh.deviceinfo.utilities.d.s(CommonWidget.class);
        com.liuzh.deviceinfo.utilities.d.s(CommonWidget4x2.class);
        OverViewWidget4x2.c();
    }

    @Override // android.app.Application
    public final void onCreate() throws XmlPullParserException, Resources.NotFoundException, IOException {
        super.onCreate();
        f21145f = this;
        pk.a.f32022a = getApplicationContext();
        Configuration configuration = getResources().getConfiguration();
        g = configuration.orientation;
        f21146h = configuration.uiMode & 48;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        SharedPreferences sharedPreferences = com.liuzh.deviceinfo.utilities.f.f21257c;
        boolean z3 = false;
        int i4 = sharedPreferences.getInt("dark_mode", 0);
        l.l(i4 != 1 ? i4 != 2 ? 1 : -1 : 2);
        wd.b.f36607a = new i7.b();
        cg.a.f2847a.add(new mg.e());
        kh.a.f28295b = new ja.c();
        o oVar = o.f400d;
        oVar.f401a = new f1(this);
        oVar.f402b.edit().putString("key_huawei_order_token", null).apply();
        List list = mg.c.f29370b;
        if (!ci.b.u()) {
            a.a.q();
        }
        ai.a.f404b.f405a = new je.y(10);
        cg.a.f2848b.c(this);
        com.liuzh.deviceinfo.utilities.f.f();
        b();
        ii.a.f26002b = new o7.d(17);
        a4.d dVar = new a4.d(8);
        a.a.f2b = getApplicationContext();
        a.a.f3c = dVar;
        f1 f1Var = new f1(5, z3);
        f1Var.f1134b = this;
        i iVar = new i();
        iVar.f31385a = new k();
        f1Var.f1137e = iVar;
        int i10 = 22;
        f1Var.f1138f = new z(i10);
        f1Var.f1135c = new ec.y(i10);
        f1Var.f1136d = new x(23);
        jm.a.f27720a = f1Var;
        f1Var.f1134b = new n.c(this, jm.a.y());
        r0.f1172i.f1178f.a(this);
        registerActivityLifecycleCallbacks(new zf.a(this));
        com.liuzh.deviceinfo.utilities.f.n(this.f21151d);
        MonitorManager monitorManager = MonitorManager.f21223f;
        monitorManager.getClass();
        if (com.liuzh.deviceinfo.utilities.f.f()) {
            DeviceInfoApp deviceInfoApp = f21145f;
            n0 n0Var = wi.i.f36764a;
            if (Settings.canDrawOverlays(deviceInfoApp)) {
                if (sharedPreferences.getBoolean("monitor_record_status", false)) {
                    Iterator<String> it = sharedPreferences.getStringSet("monitor_opened", Collections.EMPTY_SET).iterator();
                    while (it.hasNext()) {
                        monitorManager.h(it.next());
                    }
                }
                for (CustomMonitorConfig customMonitorConfig : fVar.b()) {
                    if (customMonitorConfig.isShowing()) {
                        monitorManager.g(customMonitorConfig);
                    }
                }
            }
        }
        com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
        SharedPreferences sharedPreferences2 = com.liuzh.deviceinfo.utilities.f.f21257c;
        String string = sharedPreferences2.getString("cached_device", "");
        String string2 = sharedPreferences2.getString("cached_model", "");
        String string3 = sharedPreferences2.getString("cached_product", "");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            sharedPreferences2.edit().putString("cached_device", Build.DEVICE).putString("cached_model", Build.MODEL).putString("cached_product", Build.PRODUCT).apply();
        } else {
            if (Build.DEVICE.equals(string) && Build.MODEL.equals(string2) && Build.PRODUCT.equals(string3)) {
                return;
            }
            com.liuzh.deviceinfo.utilities.f.m("cached_soc_json", null);
            com.liuzh.deviceinfo.utilities.f.m("cached_device_name_json", null);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        com.bumptech.glide.b.a(this).onLowMemory();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        com.bumptech.glide.b.a(this).onTrimMemory(i4);
    }
}
