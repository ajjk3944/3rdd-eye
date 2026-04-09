package com.wifihacker.detector.task;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import b8.f;
import com.wifihacker.detector.HackerApplication;
import com.wifihacker.detector.mvp.view.activity.SplashActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.k;
import g8.n;
import g8.o;
import g8.q;
import g8.u;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ScanNoticeService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f20550a;

    /* renamed from: b, reason: collision with root package name */
    public int f20551b;

    /* renamed from: c, reason: collision with root package name */
    public NotificationManager f20552c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Map mapD = w7.a.b().d(ScanNoticeService.this.getApplicationContext());
            if (mapD.size() < 255) {
                ScanNoticeService.this.l(mapD);
                if (ScanNoticeService.this.f20550a > 0 || ScanNoticeService.this.f20551b > 0) {
                    ScanNoticeService scanNoticeService = ScanNoticeService.this;
                    scanNoticeService.i(scanNoticeService.f20550a, ScanNoticeService.this.f20551b);
                }
                ScanNoticeService.this.f20550a = 0;
                ScanNoticeService.this.f20551b = 0;
            }
        }
    }

    public boolean g(String str) {
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            return false;
        }
        return TextUtils.equals(f.j((long) wifiManager.getDhcpInfo().gateway), str) || TextUtils.equals(f.j((long) wifiManager.getConnectionInfo().getIpAddress()), str);
    }

    public final void h(RemoteViews remoteViews) {
        try {
            Intent intent = new Intent(this, (Class<?>) SplashActivity.class);
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            Notification notificationB = new NotificationCompat.l(this).g(remoteViews).p(R.mipmap.ic_launcher).h(Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(this, iUptimeMillis, intent, 67108864) : PendingIntent.getActivity(this, iUptimeMillis, intent, 134217728)).e(true).b();
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            this.f20552c = notificationManager;
            notificationManager.notify(0, notificationB);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void i(int i10, int i11) {
        RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.view_notification_layout);
        remoteViews.setTextViewText(R.id.tv_title_notification, getString(R.string.app_name));
        remoteViews.setImageViewResource(R.id.iv_notification, R.mipmap.ic_launcher);
        if (i10 > 0) {
            k(remoteViews);
        } else if (i11 > 0) {
            j(remoteViews);
        }
        h(remoteViews);
    }

    public final void j(RemoteViews remoteViews) {
        SpannableString spannableString = new SpannableString(this.f20551b + "");
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R.color.colorPrimary)), 0, (this.f20551b + "").length(), 33);
        remoteViews.setTextViewText(R.id.tv_notification_new_count, spannableString);
        if (this.f20551b != 1) {
            remoteViews.setTextViewText(R.id.tv_notification_new_content, " " + q.b(R.string.notify_stranger_devices));
            return;
        }
        remoteViews.setTextViewText(R.id.tv_notification_new_content, " " + q.b(R.string.notify_stranger_device));
    }

    public final void k(RemoteViews remoteViews) {
        SpannableString spannableString = new SpannableString(this.f20550a + "");
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary)), 0, (this.f20550a + "").length(), 33);
        remoteViews.setTextViewText(R.id.tv_notification_new_count, spannableString);
        if (this.f20550a != 1) {
            remoteViews.setTextViewText(R.id.tv_notification_new_content, " " + q.b(R.string.notify_new_devices));
            return;
        }
        remoteViews.setTextViewText(R.id.tv_notification_new_content, " " + q.b(R.string.notify_new_device));
    }

    public final void l(Map map) {
        HashMap map2;
        try {
            map2 = (HashMap) n.a(getApplicationContext(), "router_mac_address");
        } catch (Exception e10) {
            k.c("ScanNoticeService onStartCommand exception", e10);
            e10.printStackTrace();
            map2 = null;
        }
        if (map.size() > 0) {
            for (Map.Entry entry : map.entrySet()) {
                if (map2 != null) {
                    if (!map2.containsKey(entry.getValue()) || !((String) map2.get(entry.getValue())).equals(u.a(getApplicationContext()))) {
                        this.f20550a++;
                    }
                }
                if (!g((String) entry.getKey()) && o.c().e(this, HackerApplication.f20282j, (String) entry.getValue(), 0) != 1) {
                    this.f20551b++;
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (!u.g(getApplicationContext())) {
            return 2;
        }
        new Handler().postDelayed(new a(), 2000L);
        return 2;
    }
}
