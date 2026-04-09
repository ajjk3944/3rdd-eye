package defpackage;

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
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fz extends gz {
    public static final Object c = new Object();
    public static final fz d = new fz();

    public static AlertDialog e(Activity activity, int i, mc1 mc1Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(dc1.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.phuongpn.whousemywifi.networkscanner.R.string.common_google_play_services_enable_button) : resources.getString(com.phuongpn.whousemywifi.networkscanner.R.string.common_google_play_services_update_button) : resources.getString(com.phuongpn.whousemywifi.networkscanner.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, mc1Var);
        }
        String strC = dc1.c(activity, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof i5) {
                xw xwVarO = ((i5) activity).o();
                ez0 ez0Var = new ez0();
                ou1.k(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                ez0Var.p0 = alertDialog;
                if (onCancelListener != null) {
                    ez0Var.q0 = onCancelListener;
                }
                ez0Var.Q(xwVarO, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        at atVar = new at();
        ou1.k(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        atVar.f = alertDialog;
        if (onCancelListener != null) {
            atVar.g = onCancelListener;
        }
        atVar.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i, new mc1(super.b(i, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        f(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i2;
        new IllegalArgumentException();
        if (i == 18) {
            new gc1(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strE = i == 6 ? dc1.e(context, "common_google_play_services_resolution_required_title") : dc1.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(com.phuongpn.whousemywifi.networkscanner.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? dc1.d(context, "common_google_play_services_resolution_required_text", dc1.a(context)) : dc1.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        ou1.j(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        xh0 xh0Var = new xh0(context, null);
        xh0Var.l = true;
        xh0Var.p.flags |= 16;
        xh0Var.e = xh0.b(strE);
        wh0 wh0Var = new wh0(3);
        wh0Var.i = xh0.b(strD);
        xh0Var.d(wh0Var);
        PackageManager packageManager = context.getPackageManager();
        if (i30.q == null) {
            i30.q = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (i30.q.booleanValue()) {
            xh0Var.p.icon = context.getApplicationInfo().icon;
            xh0Var.i = 2;
            if (i30.I(context)) {
                xh0Var.b.add(new sh0(resources.getString(com.phuongpn.whousemywifi.networkscanner.R.string.common_open_on_phone), pendingIntent));
            } else {
                xh0Var.g = pendingIntent;
            }
        } else {
            xh0Var.p.icon = R.drawable.stat_sys_warning;
            xh0Var.p.tickerText = xh0.b(resources.getString(com.phuongpn.whousemywifi.networkscanner.R.string.common_google_play_services_notification_ticker));
            xh0Var.p.when = System.currentTimeMillis();
            xh0Var.g = pendingIntent;
            xh0Var.f = xh0.b(strD);
        }
        synchronized (c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.phuongpn.whousemywifi.networkscanner.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        xh0Var.n = "com.google.android.gms.availability";
        Notification notificationA = xh0Var.a();
        if (i == 1 || i == 2 || i == 3) {
            oz.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationA);
    }

    public final void h(Activity activity, z50 z50Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i, new mc1(super.b(i, activity, "d"), z50Var, 1), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
