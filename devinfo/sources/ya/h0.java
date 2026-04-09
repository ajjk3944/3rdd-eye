package ya;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.b00;
import com.google.android.gms.internal.ads.i00;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.li;
import com.google.android.gms.internal.ads.qh0;
import com.google.android.gms.internal.ads.sk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class h0 extends g0 {
    @Override // ja.c
    public final i00 G(b00 b00Var, li liVar, boolean z3, qh0 qh0Var) {
        return new k00(b00Var, liVar, z3, qh0Var);
    }

    @Override // ja.c
    public final int J(Context context, TelephonyManager telephonyManager) {
        f0 f0Var = ua.j.C.f35261c;
        return (f0.d(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? 2 : 1;
    }

    @Override // ja.c
    public final void K(Context context) {
        NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", ((Integer) va.s.f36163e.f36166c.a(sk.F9)).intValue());
        notificationChannel.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    @Override // ja.c
    public final boolean L(Context context) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // ja.c
    public final Intent M(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
