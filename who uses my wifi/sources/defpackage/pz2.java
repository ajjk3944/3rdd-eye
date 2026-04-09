package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pz2 extends hv1 implements w82 {
    public static final /* synthetic */ int m = 0;
    public final HashMap f;
    public final Context g;
    public final mv2 h;
    public final ug4 i;
    public final jz2 j;
    public String k;
    public String l;

    public pz2(Context context, jz2 jz2Var, ug4 ug4Var, mv2 mv2Var) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f = new HashMap();
        this.g = context;
        this.h = mv2Var;
        this.i = ug4Var;
        this.j = jz2Var;
    }

    public static void C3(Context context, mv2 mv2Var, jz2 jz2Var, String str, String str2, Map map) {
        String strA;
        hg4 hg4Var = hg4.C;
        String str3 = true != hg4Var.h.i(context) ? "offline" : "online";
        if (mv2Var != null) {
            lv2 lv2VarA = mv2Var.a();
            lv2VarA.k("gqi", str);
            lv2VarA.k("action", str2);
            lv2VarA.k("device_connectivity", str3);
            hg4Var.k.getClass();
            lv2VarA.k("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                lv2VarA.k((String) entry.getKey(), (String) entry.getValue());
            }
            strA = ((mv2) lv2VarA.h).a.f.a((ConcurrentHashMap) lv2VarA.g);
        } else {
            strA = "";
        }
        String str4 = strA;
        hg4.C.k.getClass();
        wo1 wo1Var = new wo1(System.currentTimeMillis(), str, str4, 2);
        jz2Var.getClass();
        jz2Var.a(new mr2(jz2Var, wo1Var, 4, false));
    }

    public static final PendingIntent D3(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return PendingIntent.getService(context, 0, hk3.a(intent, 1140850688), 1140850688);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return PendingIntent.getActivity(context, 0, hk3.a(intent, 201326592), 201326592);
    }

    public static String I3(String str, int i) {
        Resources resourcesC = hg4.C.h.c();
        if (resourcesC == null) {
            return str;
        }
        try {
            return resourcesC.getString(i);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) throws IllegalAccessException, Resources.NotFoundException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        switch (i) {
            case 1:
                Intent intent = (Intent) iv1.b(parcel, Intent.CREATOR);
                iv1.f(parcel);
                s0(intent);
                break;
            case 2:
                u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                iv1.f(parcel);
                D2(u10VarX0, new gd1(string, string2, ""));
                break;
            case 3:
                e();
                break;
            case 4:
                u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                R(u10VarX02);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                u10 u10VarX03 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                U2(strArrCreateStringArray, iArrCreateIntArray, u10VarX03);
                break;
            case 6:
                u10 u10VarX04 = oi0.X0(parcel.readStrongBinder());
                gd1 gd1Var = (gd1) iv1.b(parcel, gd1.CREATOR);
                iv1.f(parcel);
                D2(u10VarX04, gd1Var);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public final void B3(String str, tr2 tr2Var) {
        b22 b22Var;
        String string = "";
        String strF = tr2Var.f();
        String strA = tr2Var.a();
        if (TextUtils.isEmpty(strF)) {
            strF = strA != null ? strA : "";
        }
        b22 b22VarB = tr2Var.b();
        if (b22VarB != null) {
            try {
                string = b22VarB.h().toString();
            } catch (RemoteException unused) {
            }
        }
        synchronized (tr2Var) {
            b22Var = tr2Var.s;
        }
        Drawable drawable = null;
        if (b22Var != null) {
            try {
                u10 u10VarD = b22Var.d();
                if (u10VarD != null) {
                    drawable = (Drawable) oi0.l1(u10VarD);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f.put(str, new hz2(strF, string, drawable));
    }

    @Override // defpackage.w82
    public final void D2(u10 u10Var, gd1 gd1Var) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) oi0.l1(u10Var);
        String str2 = gd1Var.f;
        String str3 = gd1Var.g;
        String str4 = gd1Var.h;
        hz2 hz2Var = (hz2) this.f.get(this.k);
        String str5 = hz2Var == null ? "" : hz2Var.a;
        hg4.C.f.getClass();
        iz1 iz1Var = mz1.g9;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", ((Integer) kz1Var.a(iz1Var)).intValue());
        notificationChannel.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        PendingIntent pendingIntentD3 = D3(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentD32 = D3(context, "offline_notification_dismissed", str3, str2);
        xh0 xh0Var = new xh0(context, "offline_notification_channel");
        if (TextUtils.isEmpty(str5)) {
            xh0Var.e = xh0.b(I3("You are back online! Let's pick up where we left off", R.string.offline_notification_title));
        } else {
            xh0Var.e = xh0.b(String.format(I3("You are back online! Continue learning about %s", R.string.offline_notification_title_with_advertiser), str5));
        }
        Notification notification = xh0Var.p;
        notification.flags |= 16;
        notification.deleteIntent = pendingIntentD32;
        xh0Var.g = pendingIntentD3;
        xh0Var.p.icon = context.getApplicationInfo().icon;
        xh0Var.i = ((Integer) kz1Var2.a(mz1.f9)).intValue();
        if (!((Boolean) kz1Var2.a(mz1.h9)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                xh0Var.c(bitmapDecodeStream);
                vh0 vh0Var = new vh0(3);
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.b = bitmapDecodeStream;
                vh0Var.i = iconCompat;
                vh0Var.j = null;
                vh0Var.k = true;
                xh0Var.d(vh0Var);
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, xh0Var.a());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str = "offline_notification_failed";
        }
        H3(str3, str, map);
    }

    public final void E3(Activity activity, jh1 jh1Var) throws IllegalAccessException, Resources.NotFoundException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        lf4 lf4Var = hg4.C.c;
        if (gi0.a(new hi0(activity).a)) {
            F3();
            G3(activity, jh1Var);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        xn3 xn3Var = xn3.l;
        if (i >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            H3(this.k, "asnpdi", xn3Var);
        } else {
            AlertDialog.Builder builderK = lf4.k(activity);
            builderK.setTitle(I3("Allow app to send you notifications?", R.string.notifications_permission_title)).setPositiveButton(I3("Allow", R.string.notifications_permission_confirm), new oz2(this, activity, jh1Var, 0)).setNegativeButton(I3("Don't allow", R.string.notifications_permission_decline), new mz2(this, jh1Var, 1)).setOnCancelListener(new nz2(this, jh1Var, 1));
            builderK.create().show();
            H3(this.k, "rtsdi", xn3Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F3() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r7 = this;
            hg4 r0 = defpackage.hg4.C     // Catch: android.os.RemoteException -> L22
            lf4 r0 = r0.c     // Catch: android.os.RemoteException -> L22
            android.content.Context r0 = r7.g     // Catch: android.os.RemoteException -> L22
            y42 r1 = defpackage.lf4.b(r0)     // Catch: android.os.RemoteException -> L22
            oi0 r2 = new oi0     // Catch: android.os.RemoteException -> L22
            r2.<init>(r0)     // Catch: android.os.RemoteException -> L22
            gd1 r3 = new gd1     // Catch: android.os.RemoteException -> L22
            java.lang.String r4 = r7.l     // Catch: android.os.RemoteException -> L22
            java.lang.String r5 = r7.k     // Catch: android.os.RemoteException -> L22
            java.util.HashMap r6 = r7.f     // Catch: android.os.RemoteException -> L22
            java.lang.Object r6 = r6.get(r5)     // Catch: android.os.RemoteException -> L22
            hz2 r6 = (defpackage.hz2) r6     // Catch: android.os.RemoteException -> L22
            if (r6 != 0) goto L24
            java.lang.String r6 = ""
            goto L26
        L22:
            r0 = move-exception
            goto L41
        L24:
            java.lang.String r6 = r6.b     // Catch: android.os.RemoteException -> L22
        L26:
            r3.<init>(r4, r5, r6)     // Catch: android.os.RemoteException -> L22
            boolean r2 = r1.zzg(r2, r3)     // Catch: android.os.RemoteException -> L22
            if (r2 != 0) goto L3f
            oi0 r3 = new oi0     // Catch: android.os.RemoteException -> L3d
            r3.<init>(r0)     // Catch: android.os.RemoteException -> L3d
            java.lang.String r0 = r7.l     // Catch: android.os.RemoteException -> L3d
            java.lang.String r4 = r7.k     // Catch: android.os.RemoteException -> L3d
            boolean r0 = r1.zze(r3, r0, r4)     // Catch: android.os.RemoteException -> L3d
            goto L48
        L3d:
            r0 = move-exception
            goto L42
        L3f:
            r0 = 1
            goto L48
        L41:
            r2 = 0
        L42:
            java.lang.String r1 = "Failed to schedule offline notification poster."
            defpackage.gi2.c0(r1, r0)
            r0 = r2
        L48:
            if (r0 != 0) goto L5a
            jz2 r0 = r7.j
            java.lang.String r1 = r7.k
            r0.c(r1)
            java.lang.String r0 = r7.k
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            xn3 r2 = defpackage.xn3.l
            r7.H3(r0, r1, r2)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz2.F3():void");
    }

    public final void G3(Activity activity, jh1 jh1Var) throws Resources.NotFoundException {
        XmlResourceParser layout;
        AlertDialog alertDialogCreate;
        hg4 hg4Var = hg4.C;
        lf4 lf4Var = hg4Var.c;
        AlertDialog.Builder onCancelListener = lf4.k(activity).setOnCancelListener(new uo(4, jh1Var));
        Resources resourcesC = hg4Var.h.c();
        if (resourcesC == null) {
            layout = null;
        } else {
            try {
                layout = resourcesC.getLayout(R.layout.offline_ads_dialog);
            } catch (Resources.NotFoundException unused) {
            }
        }
        if (layout == null) {
            onCancelListener.setMessage(I3("Thanks for your interest.\nWe will share more once you're back online.", R.string.offline_dialog_text));
            alertDialogCreate = onCancelListener.create();
        } else {
            try {
                View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
                onCancelListener.setView(viewInflate);
                String str = this.k;
                HashMap map = this.f;
                hz2 hz2Var = (hz2) map.get(str);
                String str2 = hz2Var == null ? "" : hz2Var.a;
                if (!TextUtils.isEmpty(str2)) {
                    TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                    textView.setVisibility(0);
                    textView.setText(str2);
                }
                hz2 hz2Var2 = (hz2) map.get(this.k);
                Drawable drawable = hz2Var2 != null ? hz2Var2.c : null;
                if (drawable != null) {
                    ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
                }
                alertDialogCreate = onCancelListener.create();
                alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            } catch (Resources.NotFoundException unused2) {
                onCancelListener.setMessage(I3("Thanks for your interest.\nWe will share more once you're back online.", R.string.offline_dialog_text));
                alertDialogCreate = onCancelListener.create();
            }
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new lz2(this, alertDialogCreate, timer, jh1Var), 3000L);
    }

    public final void H3(String str, String str2, Map map) {
        C3(this.g, this.h, this.j, str, str2, map);
    }

    @Override // defpackage.w82
    public final void R(u10 u10Var) throws IllegalAccessException, Resources.NotFoundException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        iz2 iz2Var = (iz2) oi0.l1(u10Var);
        Activity activity = iz2Var.a;
        jh1 jh1Var = iz2Var.b;
        this.k = iz2Var.c;
        this.l = iz2Var.d;
        if (((Boolean) tw1.e.c.a(mz1.e9)).booleanValue()) {
            E3(activity, jh1Var);
            return;
        }
        H3(this.k, "dialog_impression", xn3.l);
        lf4 lf4Var = hg4.C.c;
        AlertDialog.Builder builderK = lf4.k(activity);
        builderK.setTitle(I3("Open ad when you're back online.", R.string.offline_opt_in_title)).setMessage(I3("We'll send you a notification with a link to the advertiser site.", R.string.offline_opt_in_message)).setPositiveButton(I3("OK", R.string.offline_opt_in_confirm), new oz2(this, activity, jh1Var, 1)).setNegativeButton(I3("No thanks", R.string.offline_opt_in_decline), new mz2(this, jh1Var, 0)).setOnCancelListener(new nz2(this, jh1Var, 0));
        builderK.create().show();
    }

    @Override // defpackage.w82
    public final void U2(String[] strArr, int[] iArr, u10 u10Var) throws IllegalAccessException, Resources.NotFoundException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                iz2 iz2Var = (iz2) oi0.l1(u10Var);
                Activity activity = iz2Var.a;
                jh1 jh1Var = iz2Var.b;
                HashMap map = new HashMap();
                if (iArr[i] == 0) {
                    map.put("dialog_action", "confirm");
                    F3();
                    G3(activity, jh1Var);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (jh1Var != null) {
                        jh1Var.y();
                    }
                }
                H3(this.k, "asnpdc", map);
                return;
            }
        }
    }

    @Override // defpackage.w82
    public final void e() {
        this.j.a(new sq0(17, this.i));
    }

    @Override // defpackage.w82
    public final void s0(Intent intent) {
        jz2 jz2Var = this.j;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                gd2 gd2Var = hg4.C.h;
                Context context = this.g;
                boolean zI = gd2Var.i(context);
                HashMap map = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c = true == zI ? (char) 1 : (char) 2;
                    map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        map.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        map.put("olaa", "olaf");
                    }
                } else {
                    map.put("offline_notification_action", "offline_notification_dismissed");
                }
                H3(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = jz2Var.getWritableDatabase();
                    if (c == 1) {
                        jz2Var.g.execute(new gi(writableDatabase, stringExtra2, this.i, 19));
                    } else {
                        writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                    }
                } catch (SQLiteException e) {
                    gi2.Z("Failed to get writable offline buffering database: ".concat(e.toString()));
                }
            }
        }
    }
}
