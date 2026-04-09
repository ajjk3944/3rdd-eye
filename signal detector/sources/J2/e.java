package J2;

import M2.u;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import h.AbstractActivityC2349g;
import k0.K;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2056c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f2057d = new e();

    public static AlertDialog e(Activity activity, int i, M2.p pVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(M2.o.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.apm.insight.R.string.common_google_play_services_enable_button) : resources.getString(com.apm.insight.R.string.common_google_play_services_update_button) : resources.getString(com.apm.insight.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, pVar);
        }
        String strC = M2.o.c(activity, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", AbstractC1135f5.l(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC2349g) {
                K kS = ((AbstractActivityC2349g) activity).s();
                j jVar = new j();
                u.f(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.f2066A0 = alertDialog;
                if (onCancelListener != null) {
                    jVar.f2067B0 = onCancelListener;
                }
                jVar.e0(kS, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        u.f(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f2049a = alertDialog;
        if (onCancelListener != null) {
            cVar.f2050b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i, new M2.p(super.b(googleApiActivity, i, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        f(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i3;
        Log.w("GoogleApiAvailability", A.f.h(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? M2.o.e(context, "common_google_play_services_resolution_required_title") : M2.o.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(com.apm.insight.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? M2.o.d(context, "common_google_play_services_resolution_required_text", M2.o.a(context)) : M2.o.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        u.e(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        G.l lVar = new G.l(context, null);
        lVar.f1499l = true;
        lVar.f1503p.flags |= 16;
        lVar.f1493e = G.l.b(strE);
        G.k kVar = new G.k();
        kVar.f1488b = G.l.b(strD);
        lVar.d(kVar);
        PackageManager packageManager = context.getPackageManager();
        if (Q2.b.f3171b == null) {
            Q2.b.f3171b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (Q2.b.f3171b.booleanValue()) {
            lVar.f1503p.icon = context.getApplicationInfo().icon;
            lVar.i = 2;
            if (Q2.b.h(context)) {
                lVar.f1490b.add(new G.g(resources.getString(com.apm.insight.R.string.common_open_on_phone), pendingIntent));
            } else {
                lVar.f1495g = pendingIntent;
            }
        } else {
            lVar.f1503p.icon = R.drawable.stat_sys_warning;
            lVar.f1503p.tickerText = G.l.b(resources.getString(com.apm.insight.R.string.common_google_play_services_notification_ticker));
            lVar.f1503p.when = System.currentTimeMillis();
            lVar.f1495g = pendingIntent;
            lVar.f1494f = G.l.b(strD);
        }
        if (Q2.b.e()) {
            if (!Q2.b.e()) {
                throw new IllegalStateException();
            }
            synchronized (f2056c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.apm.insight.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(A3.f.e(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            lVar.f1501n = "com.google.android.gms.availability";
        }
        Notification notificationA = lVar.a();
        if (i == 1 || i == 2 || i == 3) {
            h.f2060a.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, notificationA);
    }

    public final void h(Activity activity, L2.d dVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i, new M2.p(super.b(activity, i, "d"), dVar, 1), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
