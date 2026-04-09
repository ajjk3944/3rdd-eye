package nb;

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
import b5.u0;
import com.google.android.gms.common.api.GoogleApiActivity;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f29896c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f29897d = new e();

    public static AlertDialog e(Activity activity, int i4, pb.q qVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i4 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(pb.p.b(i4, activity));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i4 != 1 ? i4 != 2 ? i4 != 3 ? resources.getString(R.string.ok) : resources.getString(com.liuzh.deviceinfo.R.string.common_google_play_services_enable_button) : resources.getString(com.liuzh.deviceinfo.R.string.common_google_play_services_update_button) : resources.getString(com.liuzh.deviceinfo.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, qVar);
        }
        String strC = pb.p.c(i4, activity);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", je.u.r(i4, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof i.g) {
                u0 u0VarS = ((i.g) activity).s();
                k kVar = new k();
                y.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                kVar.f29908p0 = alertDialog;
                if (onCancelListener != null) {
                    kVar.f29909q0 = onCancelListener;
                }
                kVar.h0(u0VarS, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        y.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f29889a = alertDialog;
        if (onCancelListener != null) {
            cVar.f29890b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i4, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i4, new pb.q(super.b(googleApiActivity, i4, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        f(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i4, PendingIntent pendingIntent) {
        int i10;
        Log.w("GoogleApiAvailability", r5.c.h(i4, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i4 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i4 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i4 == 6 ? pb.p.e(context, "common_google_play_services_resolution_required_title") : pb.p.c(i4, context);
        if (strE == null) {
            strE = context.getResources().getString(com.liuzh.deviceinfo.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i4 == 6 || i4 == 19) ? pb.p.d(context, "common_google_play_services_resolution_required_text", pb.p.a(context)) : pb.p.b(i4, context);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        y.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        r3.o oVar = new r3.o(context, null);
        oVar.f32766m = true;
        oVar.d(16, true);
        oVar.f32760e = r3.o.b(strE);
        r3.m mVar = new r3.m(8);
        mVar.f32755c = r3.o.b(strD);
        oVar.g(mVar);
        PackageManager packageManager = context.getPackageManager();
        if (tb.b.f34531c == null) {
            tb.b.f34531c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (tb.b.f34531c.booleanValue()) {
            oVar.f32773t.icon = context.getApplicationInfo().icon;
            oVar.f32763i = 2;
            if (tb.b.k(context)) {
                oVar.f32757b.add(new r3.i(resources.getString(com.liuzh.deviceinfo.R.string.common_open_on_phone), pendingIntent));
            } else {
                oVar.g = pendingIntent;
            }
        } else {
            oVar.f32773t.icon = R.drawable.stat_sys_warning;
            oVar.f32773t.tickerText = r3.o.b(resources.getString(com.liuzh.deviceinfo.R.string.common_google_play_services_notification_ticker));
            oVar.f32773t.when = System.currentTimeMillis();
            oVar.g = pendingIntent;
            oVar.f32761f = r3.o.b(strD);
        }
        if (tb.b.g()) {
            y.k(tb.b.g());
            synchronized (f29896c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.liuzh.deviceinfo.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            oVar.f32771r = "com.google.android.gms.availability";
        }
        Notification notificationA = oVar.a();
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            i.f29900a.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, notificationA);
    }

    public final void h(Activity activity, com.google.android.gms.common.api.internal.g gVar, int i4, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i4, new pb.q(super.b(activity, i4, "d"), gVar, 1), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
