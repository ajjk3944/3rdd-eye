package com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.services;

import B.b;
import I2.f;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import va.a;
import z2.C5858b;

/* loaded from: classes.dex */
public class CameraService extends Service {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f22233d = 0;

    /* renamed from: b, reason: collision with root package name */
    public NotificationManager f22234b;

    /* renamed from: c, reason: collision with root package name */
    public CameraService f22235c;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f22235c = this;
        this.f22234b = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f22234b.cancel(1);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 26) {
                String string = getString(R.string.intruder_detected);
                String string2 = getString(R.string.taking_picture_of_intruder);
                f fVar = new f(this.f22235c);
                if (i11 >= 34) {
                    startForeground(1, fVar.a(string, string2), 64);
                } else {
                    startForeground(1, fVar.a(string, string2));
                }
            }
            new Handler().postDelayed(new b(new C5858b(this.f22235c, this), 3), getSharedPreferences("PRIVATE", 0).getInt("DELAY", 2000));
            return 2;
        } catch (Exception e4) {
            a.a(e4);
            return 2;
        }
    }
}
