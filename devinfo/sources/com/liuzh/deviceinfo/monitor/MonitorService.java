package com.liuzh.deviceinfo.monitor;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.IBinder;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import ii.a;
import r3.o;
import wi.h;
import zg.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class MonitorService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21229a = DeviceInfoApp.f21145f.getString(R.string.floating_monitor);

    /* renamed from: b, reason: collision with root package name */
    public static NotificationManager f21230b = (NotificationManager) DeviceInfoApp.f21145f.getSystemService("notification");

    public static void a() {
        if (h.f36757b) {
            NotificationChannel notificationChannel = new NotificationChannel("floating_monitor_channel", f21229a, 3);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            notificationChannel.setVibrationPattern(new long[]{0});
            notificationChannel.setSound(null, null);
            try {
                f21230b.createNotificationChannel(notificationChannel);
            } catch (Exception unused) {
            }
        }
    }

    public static Notification b(ContextWrapper contextWrapper) {
        PendingIntent activity = PendingIntent.getActivity(contextWrapper, 102713383, new Intent(contextWrapper, (Class<?>) MonitorActivity.class).addFlags(536870912), a.c(134217728));
        o oVar = new o(contextWrapper, "floating_monitor_channel");
        Notification notification = oVar.f32773t;
        notification.icon = R.drawable.ic_noti_small;
        oVar.d(16, false);
        notification.tickerText = o.b(contextWrapper.getString(R.string.floating_monitor));
        oVar.f32760e = o.b(contextWrapper.getString(R.string.floating_monitor));
        oVar.f32761f = o.b(contextWrapper.getString(R.string.floating_monitor_notification_summary));
        oVar.f();
        oVar.d(2, true);
        oVar.d(8, true);
        oVar.g = activity;
        oVar.c();
        oVar.f32765l = "floating_monitor";
        oVar.f32767n = "service";
        notification.vibrate = new long[]{0};
        return oVar.a();
    }

    public static void c() {
        if (!h.f36763i) {
            if (c.c()) {
                DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                Intent intent = new Intent(deviceInfoApp, (Class<?>) MonitorService.class);
                try {
                    if (h.f36757b) {
                        deviceInfoApp.startForegroundService(new Intent(deviceInfoApp, (Class<?>) MonitorService.class));
                        return;
                    } else {
                        deviceInfoApp.startService(intent);
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        if (f21230b == null) {
            f21230b = (NotificationManager) DeviceInfoApp.f21145f.getSystemService("notification");
        }
        a();
        if (c.c()) {
            Notification notificationB = b(DeviceInfoApp.f21145f);
            NotificationManager notificationManager = f21230b;
            if (notificationManager != null) {
                notificationManager.notify(2110271338, notificationB);
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (f21230b == null) {
            f21230b = (NotificationManager) DeviceInfoApp.f21145f.getSystemService("notification");
        }
        a();
        Notification notificationB = b(this);
        try {
            try {
                startForeground(2110271338, notificationB);
            } catch (Exception unused) {
                startForeground(2110271338, notificationB);
            }
        } catch (Exception unused2) {
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i10) {
        if (f21230b == null) {
            f21230b = (NotificationManager) DeviceInfoApp.f21145f.getSystemService("notification");
        }
        a();
        Notification notificationB = b(this);
        try {
            try {
                startForeground(2110271338, notificationB);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            startForeground(2110271338, notificationB);
        }
        return super.onStartCommand(intent, i4, i10);
    }
}
