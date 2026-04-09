package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
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
import com.liuzh.deviceinfo.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qh0 extends mg implements zs {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f15341h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15342a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15343b;

    /* renamed from: c, reason: collision with root package name */
    public final qd0 f15344c;

    /* renamed from: d, reason: collision with root package name */
    public final za.l f15345d;

    /* renamed from: e, reason: collision with root package name */
    public final lh0 f15346e;

    /* renamed from: f, reason: collision with root package name */
    public String f15347f;
    public String g;

    public qh0(Context context, lh0 lh0Var, za.l lVar, qd0 qd0Var) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f15342a = new HashMap();
        this.f15343b = context;
        this.f15344c = qd0Var;
        this.f15345d = lVar;
        this.f15346e = lh0Var;
    }

    public static void i4(Context context, qd0 qd0Var, lh0 lh0Var, String str, String str2, Map map) {
        String strA;
        ua.j jVar = ua.j.C;
        String str3 = true != jVar.f35265h.k(context) ? "offline" : u.a.ONLINE_EXTRAS_KEY;
        if (qd0Var != null) {
            rt rtVarA = qd0Var.a();
            rtVarA.u("gqi", str);
            rtVarA.u("action", str2);
            rtVarA.u("device_connectivity", str3);
            jVar.f35267k.getClass();
            rtVarA.u("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                rtVarA.u((String) entry.getKey(), (String) entry.getValue());
            }
            strA = ((qd0) rtVarA.f15754c).f15315a.f17179f.a((ConcurrentHashMap) rtVarA.f15753b);
        } else {
            strA = "";
        }
        String str4 = strA;
        ua.j.C.f35267k.getClass();
        sa saVar = new sa(str, str4, 2, System.currentTimeMillis());
        lh0Var.getClass();
        lh0Var.c(new ce1(lh0Var, false, saVar, 15));
    }

    public static final PendingIntent j4(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return PendingIntent.getService(context, 0, h21.a(intent, 1140850688), 1140850688);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return PendingIntent.getActivity(context, 0, h21.a(intent, 201326592), 201326592);
    }

    public static String o4(int i4, String str) {
        Resources resourcesE = ua.j.C.f35265h.e();
        if (resourcesE == null) {
            return str;
        }
        try {
            return resourcesE.getString(i4);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void E(vb.a aVar) throws Resources.NotFoundException {
        jh0 jh0Var = (jh0) vb.b.U0(aVar);
        Activity activity = jh0Var.f12746a;
        xa.i iVar = jh0Var.f12747b;
        this.f15347f = jh0Var.f12748c;
        this.g = jh0Var.f12749d;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.D9)).booleanValue()) {
            k4(activity, iVar);
            return;
        }
        n4(this.f15347f, "dialog_impression", z51.g);
        ya.f0 f0Var = ua.j.C.f35261c;
        AlertDialog.Builder builderL = ya.f0.l(activity);
        builderL.setTitle(o4(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(o4(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(o4(R.string.offline_opt_in_confirm, "OK"), new ph0(this, activity, iVar, 1)).setNegativeButton(o4(R.string.offline_opt_in_decline, "No thanks"), new nh0(0, this, iVar)).setOnCancelListener(new oh0(this, iVar, 0));
        builderL.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void d0(Intent intent) {
        lh0 lh0Var = this.f15346e;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                zw zwVar = ua.j.C.f35265h;
                Context context = this.f15343b;
                boolean zK = zwVar.k(context);
                HashMap map = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c = true == zK ? (char) 1 : (char) 2;
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
                n4(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = lh0Var.getWritableDatabase();
                    if (c == 1) {
                        lh0Var.f13493b.execute(new d1(writableDatabase, stringExtra2, this.f15345d, 7));
                    } else {
                        writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                    }
                } catch (SQLiteException e2) {
                    za.i.e("Failed to get writable offline buffering database: ".concat(e2.toString()));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void d4(vb.a aVar, wa.a aVar2) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) vb.b.U0(aVar);
        String str2 = aVar2.f36576a;
        String str3 = aVar2.f36577b;
        String str4 = aVar2.f36578c;
        ih0 ih0Var = (ih0) this.f15342a.get(this.f15347f);
        String str5 = ih0Var == null ? "" : ih0Var.f12334a;
        ua.j.C.f35264f.K(context);
        PendingIntent pendingIntentJ4 = j4(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentJ42 = j4(context, "offline_notification_dismissed", str3, str2);
        r3.o oVar = new r3.o(context, "offline_notification_channel");
        if (TextUtils.isEmpty(str5)) {
            oVar.f32760e = r3.o.b(o4(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            oVar.f32760e = r3.o.b(String.format(o4(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), str5));
        }
        oVar.d(16, true);
        Notification notification = oVar.f32773t;
        notification.deleteIntent = pendingIntentJ42;
        oVar.g = pendingIntentJ4;
        notification.icon = context.getApplicationInfo().icon;
        pk pkVar = sk.E9;
        va.s sVar = va.s.f36163e;
        oVar.f32763i = ((Integer) sVar.f36166c.a(pkVar)).intValue();
        if (!((Boolean) sVar.f36166c.a(sk.G9)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                oVar.e(bitmapDecodeStream);
                r3.l lVar = new r3.l(8);
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.f901b = bitmapDecodeStream;
                lVar.f32752c = iconCompat;
                lVar.f32753d = null;
                lVar.f32754e = true;
                oVar.g(lVar);
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, oVar.a());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e2) {
            map.put("notification_not_shown_reason", e2.getMessage());
            str = "offline_notification_failed";
        }
        n4(str3, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void e() {
        this.f15346e.c(new ne0(5, this.f15345d));
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) throws Resources.NotFoundException {
        switch (i4) {
            case 1:
                Intent intent = (Intent) ng.b(parcel, Intent.CREATOR);
                ng.f(parcel);
                d0(intent);
                break;
            case 2:
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                ng.f(parcel);
                d4(aVarR0, new wa.a(string, string2, ""));
                break;
            case 3:
                e();
                break;
            case 4:
                vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                E(aVarR02);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                vb.a aVarR03 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                v1(strArrCreateStringArray, iArrCreateIntArray, aVarR03);
                break;
            case 6:
                vb.a aVarR04 = vb.b.r0(parcel.readStrongBinder());
                wa.a aVar = (wa.a) ng.b(parcel, wa.a.CREATOR);
                ng.f(parcel);
                d4(aVarR04, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public final void h4(String str, ga0 ga0Var) {
        String strP = ga0Var.p();
        String strB = ga0Var.b();
        String string = "";
        if (TextUtils.isEmpty(strP)) {
            strP = strB != null ? strB : "";
        }
        xm xmVarD = ga0Var.d();
        if (xmVarD != null) {
            try {
                string = xmVarD.zzc().toString();
            } catch (RemoteException unused) {
            }
        }
        xm xmVarO = ga0Var.o();
        Drawable drawable = null;
        if (xmVarO != null) {
            try {
                vb.a aVarA = xmVarO.a();
                if (aVarA != null) {
                    drawable = (Drawable) vb.b.U0(aVarA);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f15342a.put(str, new ih0(strP, string, drawable));
    }

    public final void k4(Activity activity, xa.i iVar) throws Resources.NotFoundException {
        ya.f0 f0Var = ua.j.C.f35261c;
        if (new r3.y(activity).a()) {
            l4();
            m4(activity, iVar);
            return;
        }
        int i4 = Build.VERSION.SDK_INT;
        z51 z51Var = z51.g;
        if (i4 >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            n4(this.f15347f, "asnpdi", z51Var);
        } else {
            AlertDialog.Builder builderL = ya.f0.l(activity);
            builderL.setTitle(o4(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(o4(R.string.notifications_permission_confirm, "Allow"), new ph0(this, activity, iVar, 0)).setNegativeButton(o4(R.string.notifications_permission_decline, "Don't allow"), new nh0(1, this, iVar)).setOnCancelListener(new oh0(this, iVar, 1));
            builderL.create().show();
            n4(this.f15347f, "rtsdi", z51Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l4() {
        /*
            r7 = this;
            ua.j r0 = ua.j.C     // Catch: android.os.RemoteException -> L22
            ya.f0 r0 = r0.f35261c     // Catch: android.os.RemoteException -> L22
            android.content.Context r0 = r7.f15343b     // Catch: android.os.RemoteException -> L22
            ya.t r1 = ya.f0.c(r0)     // Catch: android.os.RemoteException -> L22
            vb.b r2 = new vb.b     // Catch: android.os.RemoteException -> L22
            r2.<init>(r0)     // Catch: android.os.RemoteException -> L22
            wa.a r3 = new wa.a     // Catch: android.os.RemoteException -> L22
            java.lang.String r4 = r7.g     // Catch: android.os.RemoteException -> L22
            java.lang.String r5 = r7.f15347f     // Catch: android.os.RemoteException -> L22
            java.util.HashMap r6 = r7.f15342a     // Catch: android.os.RemoteException -> L22
            java.lang.Object r6 = r6.get(r5)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.internal.ads.ih0 r6 = (com.google.android.gms.internal.ads.ih0) r6     // Catch: android.os.RemoteException -> L22
            if (r6 != 0) goto L24
            java.lang.String r6 = ""
            goto L26
        L22:
            r0 = move-exception
            goto L41
        L24:
            java.lang.String r6 = r6.f12335b     // Catch: android.os.RemoteException -> L22
        L26:
            r3.<init>(r4, r5, r6)     // Catch: android.os.RemoteException -> L22
            boolean r2 = r1.zzg(r2, r3)     // Catch: android.os.RemoteException -> L22
            if (r2 != 0) goto L3f
            vb.b r3 = new vb.b     // Catch: android.os.RemoteException -> L3d
            r3.<init>(r0)     // Catch: android.os.RemoteException -> L3d
            java.lang.String r0 = r7.g     // Catch: android.os.RemoteException -> L3d
            java.lang.String r4 = r7.f15347f     // Catch: android.os.RemoteException -> L3d
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
            za.i.f(r1, r0)
            r0 = r2
        L48:
            if (r0 != 0) goto L5a
            com.google.android.gms.internal.ads.lh0 r0 = r7.f15346e
            java.lang.String r1 = r7.f15347f
            r0.e(r1)
            java.lang.String r0 = r7.f15347f
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.z51 r2 = com.google.android.gms.internal.ads.z51.g
            r7.n4(r0, r1, r2)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qh0.l4():void");
    }

    public final void m4(Activity activity, xa.i iVar) throws Resources.NotFoundException {
        XmlResourceParser layout;
        AlertDialog alertDialogCreate;
        ua.j jVar = ua.j.C;
        ya.f0 f0Var = jVar.f35261c;
        AlertDialog.Builder onCancelListener = ya.f0.l(activity).setOnCancelListener(new mz(2, iVar));
        Resources resourcesE = jVar.f35265h.e();
        if (resourcesE == null) {
            layout = null;
        } else {
            try {
                layout = resourcesE.getLayout(R.layout.offline_ads_dialog);
            } catch (Resources.NotFoundException unused) {
            }
        }
        if (layout == null) {
            onCancelListener.setMessage(o4(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            alertDialogCreate = onCancelListener.create();
        } else {
            try {
                View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
                onCancelListener.setView(viewInflate);
                String str = this.f15347f;
                HashMap map = this.f15342a;
                ih0 ih0Var = (ih0) map.get(str);
                String str2 = ih0Var == null ? "" : ih0Var.f12334a;
                if (!TextUtils.isEmpty(str2)) {
                    TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                    textView.setVisibility(0);
                    textView.setText(str2);
                }
                ih0 ih0Var2 = (ih0) map.get(this.f15347f);
                Drawable drawable = ih0Var2 != null ? ih0Var2.f12336c : null;
                if (drawable != null) {
                    ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
                }
                alertDialogCreate = onCancelListener.create();
                alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            } catch (Resources.NotFoundException unused2) {
                onCancelListener.setMessage(o4(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                alertDialogCreate = onCancelListener.create();
            }
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new mh0(this, alertDialogCreate, timer, iVar), 3000L);
    }

    public final void n4(String str, String str2, Map map) {
        i4(this.f15343b, this.f15344c, this.f15346e, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void v1(String[] strArr, int[] iArr, vb.a aVar) throws Resources.NotFoundException {
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (strArr[i4].equals("android.permission.POST_NOTIFICATIONS")) {
                jh0 jh0Var = (jh0) vb.b.U0(aVar);
                Activity activity = jh0Var.f12746a;
                xa.i iVar = jh0Var.f12747b;
                HashMap map = new HashMap();
                if (iArr[i4] == 0) {
                    map.put("dialog_action", "confirm");
                    l4();
                    m4(activity, iVar);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (iVar != null) {
                        iVar.m();
                    }
                }
                n4(this.f15347f, "asnpdc", map);
                return;
            }
        }
    }
}
