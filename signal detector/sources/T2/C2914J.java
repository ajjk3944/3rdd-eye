package t2;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.A8;
import com.google.android.gms.internal.ads.AbstractC0776Vf;
import com.google.android.gms.internal.ads.BinderC0718Rp;
import com.google.android.gms.internal.ads.C1273hh;
import com.google.android.gms.internal.ads.C1649oh;
import com.google.android.gms.internal.ads.C1757qh;
import com.google.android.gms.internal.ads.H9;
import q2.C2841s;

/* renamed from: t2.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2914J extends C2912H {
    @Override // p1.e
    public final C1649oh k(C1273hh c1273hh, A8 a8, boolean z6, BinderC0718Rp binderC0718Rp) {
        return new C1757qh(c1273hh, a8, z6, binderC0718Rp);
    }

    @Override // p1.e
    public final int p(Context context, TelephonyManager telephonyManager) {
        C2911G c2911g = p2.j.f22785C.f22790c;
        return (C2911G.d(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? 2 : 1;
    }

    @Override // p1.e
    public final void q(Context context) {
        AbstractC2913I.c();
        NotificationChannel notificationChannelD = AbstractC0776Vf.d(((Integer) C2841s.f23267e.f23270c.a(H9.D9)).intValue());
        notificationChannelD.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelD);
    }

    @Override // p1.e
    public final boolean r(Context context) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // p1.e
    public final Intent s(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
