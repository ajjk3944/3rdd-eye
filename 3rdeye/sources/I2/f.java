package I2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.SelfieIntruderActivity;
import y0.o;

/* compiled from: NotificationHelper.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2417a;

    /* renamed from: b, reason: collision with root package name */
    public NotificationManager f2418b;

    /* renamed from: c, reason: collision with root package name */
    public o f2419c;

    /* renamed from: d, reason: collision with root package name */
    public int f2420d;

    public f(Context context) {
        this.f2417a = context;
        context.getResources();
    }

    public final Notification a(String str, String str2) {
        Context context = this.f2417a;
        Intent intent = new Intent(context, (Class<?>) SelfieIntruderActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("notification", true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            this.f2420d = 201326592;
        } else {
            this.f2420d = 134217728;
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, this.f2420d);
        o oVar = new o(context, "10001");
        this.f2419c = oVar;
        oVar.f47902s.icon = R.drawable.ic_intruder;
        oVar.f47889e = o.b(str);
        oVar.f47890f = o.b(str2);
        oVar.c(true);
        oVar.f47893j = -1;
        oVar.f47891g = activity;
        this.f2418b = (NotificationManager) context.getSystemService("notification");
        if (i >= 26) {
            NotificationChannel notificationChannelT = B2.j.t();
            notificationChannelT.enableLights(true);
            notificationChannelT.setLightColor(-65536);
            notificationChannelT.setSound(null, null);
            this.f2419c.f47900q = "10001";
            this.f2418b.createNotificationChannel(notificationChannelT);
        }
        return this.f2419c.a();
    }
}
