package zb;

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
import cc.s;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.zab;
import io.sentry.android.core.e0;
import o4.j0;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f26813d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final c f26814e = new c();

    /* renamed from: c, reason: collision with root package name */
    public ec.d f26815c;

    public static AlertDialog d(Activity activity, int i10, cc.m mVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(cc.j.b(activity, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strC = cc.j.c(activity, i10);
        if (strC != null) {
            builder.setPositiveButton(strC, mVar);
        }
        String strA = cc.j.a(activity, i10);
        if (strA != null) {
            builder.setTitle(strA);
        }
        e0.q("GoogleApiAvailability", h0.b.h(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof i.j) {
                j0 j0VarO = ((i.j) activity).o();
                i iVar = new i();
                s.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                iVar.M0 = alertDialog;
                if (onCancelListener != null) {
                    iVar.N0 = onCancelListener;
                }
                iVar.j0(j0VarO, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        s.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.f26810a = alertDialog;
        if (onCancelListener != null) {
            bVar.f26811d = onCancelListener;
        }
        bVar.show(fragmentManager, str);
    }

    public final AlertDialog c(Activity activity, int i10, int i11, GoogleApiActivity googleApiActivity) {
        return d(activity, i10, new cc.k(super.a(i10, activity, "d"), activity, i11), googleApiActivity);
    }

    public final void e(Activity activity, bc.f fVar, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i10, new cc.l(super.a(i10, activity, "d"), fVar), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        h(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void f(Context context, int i10, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i11;
        e0.q("GoogleApiAvailability", h0.b.m("GMS core API Availability. ConnectionResult=", i10, ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                e0.p("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strF = i10 == 6 ? cc.j.f(context, "common_google_play_services_resolution_required_title") : cc.j.a(context, i10);
        if (strF == null) {
            strF = context.getResources().getString(xb.b.common_google_play_services_notification_ticker);
        }
        String strE = (i10 == 6 || i10 == 19) ? cc.j.e(context, "common_google_play_services_resolution_required_text", cc.j.d(context)) : cc.j.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        s.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        g3.p pVar = new g3.p(context, null);
        pVar.f9315m = true;
        pVar.c(true);
        pVar.f9309e = g3.p.b(strF);
        g3.n nVar = new g3.n(8, false);
        nVar.f9304g = g3.p.b(strE);
        pVar.e(nVar);
        PackageManager packageManager = context.getPackageManager();
        if (gc.b.f9482c == null) {
            gc.b.f9482c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean zBooleanValue = gc.b.f9482c.booleanValue();
        int i12 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i13 = context.getApplicationInfo().icon;
            if (i13 != 0) {
                i12 = i13;
            }
            pVar.f9321s.icon = i12;
            pVar.j = 2;
            if (gc.b.g(context)) {
                pVar.f9306b.add(new g3.j(xb.a.common_full_open_on_phone, pendingIntent, resources.getString(xb.b.common_open_on_phone)));
            } else {
                pVar.f9311g = pendingIntent;
            }
        } else {
            pVar.f9321s.icon = R.drawable.stat_sys_warning;
            pVar.f9321s.tickerText = g3.p.b(resources.getString(xb.b.common_google_play_services_notification_ticker));
            pVar.f9321s.when = System.currentTimeMillis();
            pVar.f9311g = pendingIntent;
            pVar.f9310f = g3.p.b(strE);
        }
        if (gc.b.e()) {
            if (!gc.b.e()) {
                throw new IllegalStateException();
            }
            synchronized (f26813d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(xb.b.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(kg.e.c(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            pVar.f9319q = "com.google.android.gms.availability";
        }
        Notification notificationA = pVar.a();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            f.f26819a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationA);
    }

    public final void g(Context context, ConnectionResult connectionResult, boolean z10) {
        Integer num = connectionResult.f4810x;
        int iIntValue = num == null ? -1 : num.intValue();
        zab zabVar = new zab(iIntValue, connectionResult.f4807d, System.currentTimeMillis(), context.getPackageName(), z10);
        if (this.f26815c == null) {
            this.f26815c = new ec.d(context, null, ec.d.j, ac.b.f322a, ac.e.f324b);
        }
        ec.d dVar = this.f26815c;
        dVar.getClass();
        bc.j jVar = new bc.j(0);
        jVar.f2611c = 0;
        jVar.f2613e = new Feature[]{mc.c.f16674b};
        jVar.f2610b = false;
        jVar.f2612d = new b9.c(16, zabVar);
        dVar.c(2, jVar.d());
    }
}
