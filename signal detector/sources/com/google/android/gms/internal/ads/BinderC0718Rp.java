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
import com.apm.insight.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import q2.C2841s;
import r2.C2876a;
import s2.BinderC2894d;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Rp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0718Rp extends B7 implements InterfaceC0570Jd {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f11046h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11047a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11048b;

    /* renamed from: c, reason: collision with root package name */
    public final C0784Vn f11049c;

    /* renamed from: d, reason: collision with root package name */
    public final u2.n f11050d;

    /* renamed from: e, reason: collision with root package name */
    public final C0633Mp f11051e;

    /* renamed from: f, reason: collision with root package name */
    public String f11052f;

    /* renamed from: g, reason: collision with root package name */
    public String f11053g;

    public BinderC0718Rp(Context context, C0633Mp c0633Mp, u2.n nVar, C0784Vn c0784Vn) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f11047a = new HashMap();
        this.f11048b = context;
        this.f11049c = c0784Vn;
        this.f11050d = nVar;
        this.f11051e = c0633Mp;
    }

    public static void L3(Context context, C0784Vn c0784Vn, C0633Mp c0633Mp, String str, String str2, Map map) {
        String strA;
        p2.j jVar = p2.j.f22785C;
        String str3 = true != jVar.f22795h.k(context) ? "offline" : "online";
        if (c0784Vn != null) {
            C0697Ql c0697QlA = c0784Vn.a();
            c0697QlA.r("gqi", str);
            c0697QlA.r("action", str2);
            c0697QlA.r("device_connectivity", str3);
            jVar.f22797k.getClass();
            c0697QlA.r("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                c0697QlA.r((String) entry.getKey(), (String) entry.getValue());
            }
            strA = ((C0784Vn) c0697QlA.f10692c).f12083a.f12963f.a((ConcurrentHashMap) c0697QlA.f10691b);
        } else {
            strA = "";
        }
        String str4 = strA;
        p2.j.f22785C.f22797k.getClass();
        N4 n42 = new N4(System.currentTimeMillis(), str, str4, 2);
        c0633Mp.getClass();
        c0633Mp.a(new C0889ae(c0633Mp, 25, n42));
    }

    public static final PendingIntent M3(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return PendingIntent.getService(context, 0, AbstractC2002vA.a(intent, 1140850688), 1140850688);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return PendingIntent.getActivity(context, 0, AbstractC2002vA.a(intent, 201326592), 201326592);
    }

    public static String R3(int i, String str) {
        Resources resourcesE = p2.j.f22785C.f22795h.e();
        if (resourcesE == null) {
            return str;
        }
        try {
            return resourcesE.getString(i);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) throws Resources.NotFoundException {
        switch (i) {
            case 1:
                Intent intent = (Intent) C7.b(parcel, Intent.CREATOR);
                C7.f(parcel);
                u0(intent);
                break;
            case 2:
                S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                C7.f(parcel);
                t3(aVarD1, new C2876a(string, string2, ""));
                break;
            case 3:
                e();
                break;
            case 4:
                S2.a aVarD12 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                Q(aVarD12);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                S2.a aVarD13 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                h1(strArrCreateStringArray, iArrCreateIntArray, aVarD13);
                break;
            case 6:
                S2.a aVarD14 = S2.b.d1(parcel.readStrongBinder());
                C2876a c2876a = (C2876a) C7.b(parcel, C2876a.CREATOR);
                C7.f(parcel);
                t3(aVarD14, c2876a);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public final void K3(String str, C1492lm c1492lm) {
        String strP = c1492lm.p();
        String strB = c1492lm.b();
        String string = "";
        if (TextUtils.isEmpty(strP)) {
            strP = strB != null ? strB : "";
        }
        InterfaceC0635Na interfaceC0635NaD = c1492lm.d();
        if (interfaceC0635NaD != null) {
            try {
                string = interfaceC0635NaD.f().toString();
            } catch (RemoteException unused) {
            }
        }
        InterfaceC0635Na interfaceC0635NaO = c1492lm.o();
        Drawable drawable = null;
        if (interfaceC0635NaO != null) {
            try {
                S2.a aVarC = interfaceC0635NaO.c();
                if (aVarC != null) {
                    drawable = (Drawable) S2.b.n1(aVarC);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f11047a.put(str, new C0599Kp(strP, string, drawable));
    }

    public final void N3(Activity activity, BinderC2894d binderC2894d) throws Resources.NotFoundException {
        C2911G c2911g = p2.j.f22785C.f22790c;
        if (new G.r(activity).a()) {
            O3();
            P3(activity, binderC2894d);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        C1465lC c1465lC = C1465lC.f15361g;
        if (i >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            Q3(this.f11052f, c1465lC, "asnpdi");
        } else {
            AlertDialog.Builder builderL = C2911G.l(activity);
            builderL.setTitle(R3(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(R3(R.string.notifications_permission_confirm, "Allow"), new DialogInterfaceOnClickListenerC0701Qp(this, activity, binderC2894d, 0)).setNegativeButton(R3(R.string.notifications_permission_decline, "Don't allow"), new DialogInterfaceOnClickListenerC0667Op(this, 1, binderC2894d)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0684Pp(this, binderC2894d, 1));
            builderL.create().show();
            Q3(this.f11052f, c1465lC, "rtsdi");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O3() {
        /*
            r7 = this;
            p2.j r0 = p2.j.f22785C     // Catch: android.os.RemoteException -> L22
            t2.G r0 = r0.f22790c     // Catch: android.os.RemoteException -> L22
            android.content.Context r0 = r7.f11048b     // Catch: android.os.RemoteException -> L22
            t2.w r1 = t2.C2911G.c(r0)     // Catch: android.os.RemoteException -> L22
            S2.b r2 = new S2.b     // Catch: android.os.RemoteException -> L22
            r2.<init>(r0)     // Catch: android.os.RemoteException -> L22
            r2.a r3 = new r2.a     // Catch: android.os.RemoteException -> L22
            java.lang.String r4 = r7.f11053g     // Catch: android.os.RemoteException -> L22
            java.lang.String r5 = r7.f11052f     // Catch: android.os.RemoteException -> L22
            java.util.HashMap r6 = r7.f11047a     // Catch: android.os.RemoteException -> L22
            java.lang.Object r6 = r6.get(r5)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.internal.ads.Kp r6 = (com.google.android.gms.internal.ads.C0599Kp) r6     // Catch: android.os.RemoteException -> L22
            if (r6 != 0) goto L24
            java.lang.String r6 = ""
            goto L26
        L22:
            r0 = move-exception
            goto L41
        L24:
            java.lang.String r6 = r6.f9541b     // Catch: android.os.RemoteException -> L22
        L26:
            r3.<init>(r4, r5, r6)     // Catch: android.os.RemoteException -> L22
            boolean r2 = r1.zzg(r2, r3)     // Catch: android.os.RemoteException -> L22
            if (r2 != 0) goto L3f
            S2.b r3 = new S2.b     // Catch: android.os.RemoteException -> L3d
            r3.<init>(r0)     // Catch: android.os.RemoteException -> L3d
            java.lang.String r0 = r7.f11053g     // Catch: android.os.RemoteException -> L3d
            java.lang.String r4 = r7.f11052f     // Catch: android.os.RemoteException -> L3d
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
            u2.k.f(r1, r0)
            r0 = r2
        L48:
            if (r0 != 0) goto L5a
            com.google.android.gms.internal.ads.Mp r0 = r7.f11051e
            java.lang.String r1 = r7.f11052f
            r0.b(r1)
            java.lang.String r0 = r7.f11052f
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.lC r2 = com.google.android.gms.internal.ads.C1465lC.f15361g
            r7.Q3(r0, r2, r1)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC0718Rp.O3():void");
    }

    public final void P3(Activity activity, BinderC2894d binderC2894d) throws Resources.NotFoundException {
        XmlResourceParser layout;
        AlertDialog alertDialogCreate;
        p2.j jVar = p2.j.f22785C;
        C2911G c2911g = jVar.f22790c;
        AlertDialog.Builder onCancelListener = C2911G.l(activity).setOnCancelListener(new DialogInterfaceOnCancelListenerC0760Ug(2, binderC2894d));
        Resources resourcesE = jVar.f22795h.e();
        if (resourcesE == null) {
            layout = null;
        } else {
            try {
                layout = resourcesE.getLayout(R.layout.offline_ads_dialog);
            } catch (Resources.NotFoundException unused) {
            }
        }
        if (layout == null) {
            onCancelListener.setMessage(R3(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            alertDialogCreate = onCancelListener.create();
        } else {
            try {
                View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
                onCancelListener.setView(viewInflate);
                String str = this.f11052f;
                HashMap map = this.f11047a;
                C0599Kp c0599Kp = (C0599Kp) map.get(str);
                String str2 = c0599Kp == null ? "" : c0599Kp.f9540a;
                if (!TextUtils.isEmpty(str2)) {
                    TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                    textView.setVisibility(0);
                    textView.setText(str2);
                }
                C0599Kp c0599Kp2 = (C0599Kp) map.get(this.f11052f);
                Drawable drawable = c0599Kp2 != null ? c0599Kp2.f9542c : null;
                if (drawable != null) {
                    ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
                }
                alertDialogCreate = onCancelListener.create();
                alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            } catch (Resources.NotFoundException unused2) {
                onCancelListener.setMessage(R3(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                alertDialogCreate = onCancelListener.create();
            }
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new C0650Np(this, alertDialogCreate, timer, binderC2894d), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570Jd
    public final void Q(S2.a aVar) throws Resources.NotFoundException {
        C0616Lp c0616Lp = (C0616Lp) S2.b.n1(aVar);
        Activity activity = c0616Lp.f9766a;
        BinderC2894d binderC2894d = c0616Lp.f9767b;
        this.f11052f = c0616Lp.f9768c;
        this.f11053g = c0616Lp.f9769d;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.B9)).booleanValue()) {
            N3(activity, binderC2894d);
            return;
        }
        Q3(this.f11052f, C1465lC.f15361g, "dialog_impression");
        C2911G c2911g = p2.j.f22785C.f22790c;
        AlertDialog.Builder builderL = C2911G.l(activity);
        builderL.setTitle(R3(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(R3(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(R3(R.string.offline_opt_in_confirm, "OK"), new DialogInterfaceOnClickListenerC0701Qp(this, activity, binderC2894d, 1)).setNegativeButton(R3(R.string.offline_opt_in_decline, "No thanks"), new DialogInterfaceOnClickListenerC0667Op(this, 0, binderC2894d)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0684Pp(this, binderC2894d, 0));
        builderL.create().show();
    }

    public final void Q3(String str, Map map, String str2) {
        L3(this.f11048b, this.f11049c, this.f11051e, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570Jd
    public final void e() {
        this.f11051e.a(new L6(24, this.f11050d));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570Jd
    public final void h1(String[] strArr, int[] iArr, S2.a aVar) throws Resources.NotFoundException {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                C0616Lp c0616Lp = (C0616Lp) S2.b.n1(aVar);
                Activity activity = c0616Lp.f9766a;
                BinderC2894d binderC2894d = c0616Lp.f9767b;
                HashMap map = new HashMap();
                if (iArr[i] == 0) {
                    map.put("dialog_action", "confirm");
                    O3();
                    P3(activity, binderC2894d);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (binderC2894d != null) {
                        binderC2894d.z();
                    }
                }
                Q3(this.f11052f, map, "asnpdc");
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570Jd
    public final void t3(S2.a aVar, C2876a c2876a) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) S2.b.n1(aVar);
        String str2 = c2876a.f23393a;
        String str3 = c2876a.f23394b;
        String str4 = c2876a.f23395c;
        C0599Kp c0599Kp = (C0599Kp) this.f11047a.get(this.f11052f);
        String str5 = c0599Kp == null ? "" : c0599Kp.f9540a;
        p2.j.f22785C.f22793f.q(context);
        PendingIntent pendingIntentM3 = M3(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentM32 = M3(context, "offline_notification_dismissed", str3, str2);
        G.l lVar = new G.l(context, "offline_notification_channel");
        if (TextUtils.isEmpty(str5)) {
            lVar.f1493e = G.l.b(R3(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            lVar.f1493e = G.l.b(String.format(R3(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), str5));
        }
        Notification notification = lVar.f1503p;
        notification.flags |= 16;
        notification.deleteIntent = pendingIntentM32;
        lVar.f1495g = pendingIntentM3;
        notification.icon = context.getApplicationInfo().icon;
        E9 e9 = H9.C9;
        C2841s c2841s = C2841s.f23267e;
        lVar.i = ((Integer) c2841s.f23270c.a(e9)).intValue();
        if (!((Boolean) c2841s.f23270c.a(H9.E9)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                lVar.c(bitmapDecodeStream);
                G.j jVar = new G.j();
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.f5093b = bitmapDecodeStream;
                jVar.f1485b = iconCompat;
                jVar.f1486c = null;
                jVar.f1487d = true;
                lVar.d(jVar);
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, lVar.a());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e6) {
            map.put("notification_not_shown_reason", e6.getMessage());
            str = "offline_notification_failed";
        }
        Q3(str3, map, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570Jd
    public final void u0(Intent intent) {
        C0633Mp c0633Mp = this.f11051e;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                C0538Hf c0538Hf = p2.j.f22785C.f22795h;
                Context context = this.f11048b;
                boolean zK = c0538Hf.k(context);
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
                Q3(stringExtra2, map, "offline_notification_action");
                try {
                    SQLiteDatabase writableDatabase = c0633Mp.getWritableDatabase();
                    if (c == 1) {
                        c0633Mp.f9910b.execute(new RunnableC0912b0(writableDatabase, stringExtra2, this.f11050d, 7));
                    } else {
                        writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                    }
                } catch (SQLiteException e6) {
                    u2.k.e("Failed to get writable offline buffering database: ".concat(e6.toString()));
                }
            }
        }
    }
}
