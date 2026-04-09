package com.liuzh.deviceinfo.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.widget.RemoteViews;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.splash.SplashActivity;
import com.liuzh.deviceinfo.utilities.f;
import com.liuzh.deviceinfo.utilities.y;
import com.liuzh.deviceinfo.widget.CommonWidget;
import ii.a;
import java.util.Timer;
import r3.o;
import wi.h;
import yg.d;
import yg.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class NotificationService extends Service {

    /* renamed from: d, reason: collision with root package name */
    public static Timer f21233d;

    /* renamed from: a, reason: collision with root package name */
    public Timer f21236a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f21231b = DeviceInfoApp.f21145f.getString(R.string.device_overview);

    /* renamed from: c, reason: collision with root package name */
    public static NotificationManager f21232c = (NotificationManager) DeviceInfoApp.f21145f.getSystemService("notification");

    /* renamed from: e, reason: collision with root package name */
    public static final d f21234e = new d(0);

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f21235f = false;

    public static void a() {
        if (f21232c == null) {
            f21232c = (NotificationManager) DeviceInfoApp.f21145f.getSystemService("notification");
        }
    }

    public static void b() {
        if (h.f36757b) {
            NotificationChannel notificationChannel = new NotificationChannel("notification_service", f21231b, 3);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            notificationChannel.setVibrationPattern(new long[]{0});
            notificationChannel.setSound(null, null);
            try {
                f21232c.createNotificationChannel(notificationChannel);
            } catch (Exception unused) {
            }
        }
    }

    public static Notification c(ContextWrapper contextWrapper) {
        PendingIntent activity = PendingIntent.getActivity(contextWrapper, 1, new Intent(contextWrapper, (Class<?>) SplashActivity.class).putExtra("from", "notification"), a.c(134217728));
        String string = contextWrapper.getString(R.string.app_name);
        int iC = a4.a.c(contextWrapper.getResources(), 56);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iC, Bitmap.Config.ARGB_8888);
        boolean z3 = h.g;
        RemoteViews remoteViewsA = CommonWidget.a(contextWrapper, z3 ? R.layout.notification_overview_v31 : R.layout.notification_overview, 56, z3 ? 9 : 8, false, bitmapCreateBitmap, true);
        o oVar = new o(contextWrapper, "notification_service");
        Notification notification = oVar.f32773t;
        notification.icon = R.drawable.ic_noti_small;
        oVar.d(16, false);
        notification.tickerText = o.b(string);
        oVar.f32760e = o.b(string);
        oVar.f();
        oVar.d(2, true);
        oVar.d(8, true);
        oVar.g = activity;
        oVar.c();
        oVar.f32769p = remoteViewsA;
        oVar.f32767n = "service";
        notification.vibrate = new long[]{0};
        if (z3) {
            RemoteViews remoteViewsA2 = CommonWidget.a(contextWrapper, R.layout.notification_overview, 56, 8, false, bitmapCreateBitmap, false);
            if (!y.d()) {
                remoteViewsA2.setViewVisibility(R.id.logo_layout, 8);
            }
            oVar.f32770q = remoteViewsA2;
        }
        return oVar.a();
    }

    public static void d(ContextWrapper contextWrapper) {
        f fVar = f.f21256b;
        if (f.f21257c.getBoolean("show_overview_notification", true) && !f21235f) {
            if (!h.f36763i) {
                Intent intent = new Intent(contextWrapper, (Class<?>) NotificationService.class);
                try {
                    if (h.f36757b) {
                        contextWrapper.startForegroundService(new Intent(contextWrapper, (Class<?>) NotificationService.class));
                        return;
                    } else {
                        contextWrapper.startService(intent);
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            f21235f = true;
            a();
            b();
            bg.a aVar = new bg.a(7);
            aVar.run();
            if (f21233d == null) {
                Timer timer = new Timer();
                f21233d = timer;
                timer.schedule(new e(0, aVar), 15000L, 15000L);
            }
        }
    }

    public static void e(DeviceInfoApp deviceInfoApp) {
        if (!h.f36763i) {
            deviceInfoApp.stopService(new Intent(deviceInfoApp, (Class<?>) NotificationService.class));
            return;
        }
        f21235f = false;
        a();
        NotificationManager notificationManager = f21232c;
        if (notificationManager != null) {
            notificationManager.cancel(19960101);
        }
        Timer timer = f21233d;
        if (timer != null) {
            timer.cancel();
            f21233d = null;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        f21235f = true;
        a();
        b();
        PendingIntent activity = PendingIntent.getActivity(this, 1, new Intent(this, (Class<?>) SplashActivity.class).putExtra("from", "notification"), a.c(134217728));
        String string = getString(R.string.app_name);
        o oVar = new o(this, "notification_service");
        oVar.f32773t.icon = R.drawable.ic_noti_small;
        oVar.d(16, false);
        oVar.f32773t.tickerText = o.b(string);
        oVar.f32760e = o.b(string);
        oVar.f();
        oVar.d(2, true);
        oVar.d(8, true);
        oVar.g = activity;
        oVar.c();
        oVar.f32760e = o.b(string);
        oVar.f32761f = o.b(getString(R.string.loading));
        oVar.f32767n = "service";
        oVar.f32773t.vibrate = new long[]{0};
        try {
            Notification notificationA = oVar.a();
            try {
                startForeground(19960101, notificationA);
            } catch (Exception unused) {
                startForeground(19960101, notificationA);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f21235f = false;
        stopForeground(true);
        Timer timer = this.f21236a;
        if (timer != null) {
            timer.cancel();
            this.f21236a = null;
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i10) {
        a();
        b();
        try {
            try {
                startForeground(19960101, c(this));
            } catch (Exception unused) {
                startForeground(19960101, c(this));
            }
        } catch (Exception unused2) {
        }
        if (this.f21236a == null) {
            this.f21236a = new Timer();
            this.f21236a.schedule(new e(1, this), 15000L, 15000L);
        }
        return super.onStartCommand(intent, i4, i10);
    }
}
