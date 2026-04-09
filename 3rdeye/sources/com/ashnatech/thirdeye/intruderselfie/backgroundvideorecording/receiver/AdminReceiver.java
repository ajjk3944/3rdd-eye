package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.receiver;

import A2.p;
import I2.f;
import I2.m;
import android.app.NotificationManager;
import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.database.Model;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.services.CameraService;
import io.appmetrica.analytics.impl.Oo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public class AdminReceiver extends DeviceAdminReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static int f22205b = 1;

    /* renamed from: a, reason: collision with root package name */
    public m f22206a;

    @Override // android.app.admin.DeviceAdminReceiver
    public final void onDisabled(Context context, Intent intent) {
        Intent intent2 = new Intent("android.intent.action.DELETE", Uri.parse("package:" + context.getPackageName()));
        intent2.addFlags(268435456);
        context.startActivity(intent2);
    }

    @Override // android.app.admin.DeviceAdminReceiver
    public final void onEnabled(Context context, Intent intent) {
        Log.i("AdminReceiver", "Device Admin: enabled");
    }

    @Override // android.app.admin.DeviceAdminReceiver
    public final void onPasswordFailed(Context context, Intent intent) {
        this.f22206a = new m(context);
        Log.i("TAG", "on password failed");
        p pVar = p.INSTANCE;
        pVar.init(context);
        Model model = new Model();
        model.setName(new SimpleDateFormat("hh:mm aa dd/MM/yyyy", Locale.getDefault()).format(new Date()));
        model.setPack("wrong");
        pVar.saveTrack(model);
        if (f22205b != this.f22206a.f2429a.getInt("ATTEMPTS", 1)) {
            f22205b++;
            return;
        }
        if (this.f22206a.f2429a.getBoolean("INTRUDER", true)) {
            Log.i("TAG", "camera start");
            int i = CameraService.f22233d;
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(new Intent(context, (Class<?>) CameraService.class));
            } else {
                context.startService(new Intent(context, (Class<?>) CameraService.class));
            }
            f22205b = 1;
            Oo.j(this.f22206a.f2429a, "CAPTURED", true);
        }
    }

    @Override // android.app.admin.DeviceAdminReceiver
    public final void onPasswordSucceeded(Context context, Intent intent) {
        Log.i("TAG", "unlocked");
        this.f22206a = new m(context);
        p pVar = p.INSTANCE;
        pVar.init(context);
        Model model = new Model();
        String str = new SimpleDateFormat("hh:mm aa dd/MM/yyyy", Locale.getDefault()).format(new Date());
        model.setName(str);
        model.setPack("unlock");
        pVar.saveTrack(model);
        this.f22206a.f2429a.edit().putString("LAST_SEEN", str).apply();
        if (this.f22206a.f2429a.getBoolean("NOTIFICATION", true) && this.f22206a.f2429a.getBoolean("CAPTURED", false)) {
            this.f22206a.f2429a.edit().putBoolean("CAPTURED", false).apply();
            ((NotificationManager) context.getSystemService("notification")).notify(0, new f(context).a(context.getString(R.string.intruder_alert), context.getString(R.string.intruder_selfie_detected)));
        }
        f22205b = 1;
    }
}
