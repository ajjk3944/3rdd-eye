package com.google.android.gms.internal.ads;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import com.applovin.sdk.AppLovinEventTypes;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.MainActivity;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.notification.NotificationService;
import com.liuzh.deviceinfo.splash.SplashActivity;
import com.liuzh.deviceinfo.widget.CommonWidget;
import com.liuzh.deviceinfo.widget.CommonWidget4x2;
import com.liuzh.deviceinfo.widget.OverViewWidget4x2;
import com.liuzh.deviceinfo.widget.StorageWidget2x1;
import com.liuzho.lib.appinfo.NewInstalledAppAnalyzeActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vu0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17720a;

    public /* synthetic */ vu0(int i4) {
        this.f17720a = i4;
    }

    private final void a(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return;
        }
        ArrayList arrayList = mg.f.f29376a;
        synchronized (arrayList) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((zf.c) obj).getClass();
                int i10 = CommonWidget4x2.f21393a;
                com.liuzh.deviceinfo.utilities.d.s(CommonWidget4x2.class);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object value;
        ArrayList arrayList;
        DeviceInfoApp deviceInfoApp;
        PackageManager packageManager;
        String string;
        switch (this.f17720a) {
            case 0:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        yr1.f18841c = 1;
                        return;
                    } else {
                        if (intExtra == 1) {
                            yr1.f18841c = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                if (intent == null) {
                    return;
                }
                com.liuzh.deviceinfo.utilities.b.f21243a = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0);
                com.liuzh.deviceinfo.utilities.b.f21244b = intent.getIntExtra("status", -1);
                int intExtra2 = intent.getIntExtra("voltage", 0);
                com.liuzh.deviceinfo.utilities.b.f21246d = intExtra2;
                com.liuzh.deviceinfo.utilities.b.f21246d = com.liuzh.deviceinfo.utilities.b.b(intExtra2);
                com.liuzh.deviceinfo.utilities.b.f21247e = intent.getIntExtra("temperature", 0) / 10.0f;
                int i4 = CommonWidget.f21392a;
                com.liuzh.deviceinfo.utilities.d.s(CommonWidget.class);
                com.liuzh.deviceinfo.utilities.d.s(CommonWidget4x2.class);
                OverViewWidget4x2.c();
                com.liuzh.deviceinfo.utilities.d.s(StorageWidget2x1.class);
                NotificationService.d(DeviceInfoApp.f21145f);
                return;
            case 2:
                if (context == null || intent == null) {
                    return;
                }
                String dataString = intent.getDataString();
                if (TextUtils.isEmpty(dataString)) {
                    return;
                }
                String strSubstring = dataString.substring(8);
                int i10 = 18;
                ck.c cVar = null;
                if (!"android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
                    if (!"android.intent.action.PACKAGE_FULLY_REMOVED".equals(intent.getAction())) {
                        if ("android.intent.action.PACKAGE_REPLACED".equals(intent.getAction())) {
                            yj.n nVar = gg.b.g;
                            gg.b bVarM = com.bumptech.glide.c.m();
                            bVarM.getClass();
                            nk.k.e(strSubstring, "pkg");
                            xk.x.v(bVarM.f24723f, null, null, new al.p(bVarM, strSubstring, cVar, i10), 3);
                            DeviceInfoApp deviceInfoApp2 = DeviceInfoApp.f21145f;
                            return;
                        }
                        return;
                    }
                    yj.n nVar2 = gg.b.g;
                    gg.b bVarM2 = com.bumptech.glide.c.m();
                    bVarM2.getClass();
                    nk.k.e(strSubstring, "pkg");
                    al.i1 i1Var = bVarM2.f24718a;
                    do {
                        value = i1Var.getValue();
                        arrayList = new ArrayList();
                        for (Object obj : (List) value) {
                            if (!((gg.a) obj).f24701a.equals(strSubstring)) {
                                arrayList.add(obj);
                            }
                        }
                    } while (!i1Var.i(value, arrayList));
                    DeviceInfoApp deviceInfoApp3 = DeviceInfoApp.f21145f;
                    return;
                }
                if (intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                    return;
                }
                yg.a aVar = yg.a.f37613c;
                if (com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("new_app_detect_notification", true) && !TextUtils.isEmpty(strSubstring) && (packageManager = (deviceInfoApp = DeviceInfoApp.f21145f).getPackageManager()) != null) {
                    try {
                        string = packageManager.getApplicationInfo(strSubstring, 0).loadLabel(packageManager).toString();
                    } catch (PackageManager.NameNotFoundException unused) {
                        string = null;
                    }
                    if (!TextUtils.isEmpty(string)) {
                        int i11 = NewInstalledAppAnalyzeActivity.F;
                        Intent intent2 = new Intent(deviceInfoApp, (Class<?>) NewInstalledAppAnalyzeActivity.class);
                        intent2.putExtra("args_pkg_name", strSubstring);
                        PendingIntent activities = PendingIntent.getActivities(deviceInfoApp, 1001, new Intent[]{new Intent(deviceInfoApp, (Class<?>) MainActivity.class).addFlags(67108864), intent2, new Intent(deviceInfoApp, (Class<?>) SplashActivity.class).addFlags(67108864).putExtra("delay_finish", true)}, ii.a.c(268435456));
                        String string2 = deviceInfoApp.getString(R.string.click_analyze_new_installed_app, string);
                        SpannableString spannableString = new SpannableString(string2);
                        int iIndexOf = string2.indexOf(string);
                        int length = string.length() + iIndexOf;
                        spannableString.setSpan(new RelativeSizeSpan(1.2f), iIndexOf, length, 34);
                        spannableString.setSpan(new StyleSpan(1), iIndexOf, length, 34);
                        r3.o oVar = new r3.o(deviceInfoApp, "func_recommend");
                        oVar.f32773t.icon = R.drawable.ic_noti_small;
                        oVar.f32773t.tickerText = r3.o.b(deviceInfoApp.getString(R.string.app_name));
                        oVar.d(16, true);
                        oVar.f32765l = "newAppInstalled";
                        oVar.f32760e = r3.o.b(deviceInfoApp.getString(R.string.new_installed_app_analyze));
                        oVar.f32761f = r3.o.b(spannableString);
                        r3.m mVar = new r3.m(8);
                        mVar.f32755c = r3.o.b(spannableString);
                        oVar.g(mVar);
                        oVar.g = activities;
                        oVar.f32773t.when = System.currentTimeMillis();
                        Notification notificationA = oVar.a();
                        yg.a aVar2 = yg.a.f37613c;
                        r3.y yVar = (r3.y) aVar2.f1325a;
                        if (wi.h.f36757b) {
                            com.facebook.ads.internal.dynamicloading.c.c();
                            NotificationChannel notificationChannelA = com.facebook.ads.internal.dynamicloading.c.a(DeviceInfoApp.f21145f.getString(R.string.func_suggest_notification));
                            try {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    r3.q.b(yVar.f32794b, notificationChannelA);
                                } else {
                                    yVar.getClass();
                                }
                            } catch (Exception unused2) {
                            }
                        }
                        yVar.b(((AtomicInteger) aVar2.f1326b).incrementAndGet(), notificationA);
                        cg.a.f2848b.f(null, "new_app_notify_show");
                    }
                }
                yj.n nVar3 = gg.b.g;
                gg.b bVarM3 = com.bumptech.glide.c.m();
                bVarM3.getClass();
                nk.k.e(strSubstring, "pkg");
                xk.x.v(bVarM3.f24723f, null, null, new al.p(bVarM3, strSubstring, cVar, i10), 3);
                DeviceInfoApp deviceInfoApp4 = DeviceInfoApp.f21145f;
                return;
            case 3:
                a(context, intent);
                return;
            default:
                synchronized (za.f.f38143b) {
                    za.f.f38144c = false;
                    za.f.f38145d = false;
                    za.i.h("Ad debug logging enablement is out of date.");
                }
                u6.t.t(context);
                return;
        }
    }
}
