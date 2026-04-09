package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.c;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f15427a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f15428b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f15429c = false;

    /* renamed from: d, reason: collision with root package name */
    public static int f15430d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static String f15431e = "";

    /* renamed from: f, reason: collision with root package name */
    private static boolean f15432f = false;

    /* renamed from: g, reason: collision with root package name */
    private static String f15433g = "";

    /* renamed from: h, reason: collision with root package name */
    private static boolean f15434h = false;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f15435i = false;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f15436a;

        public a(Context context) {
            this.f15436a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f15436a);
                    g.a(advertisingIdInfo.getId());
                    g.f15430d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    g.b(this.f15436a, advertisingIdInfo.getId(), g.f15430d);
                } catch (Exception unused) {
                    q0.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                    try {
                        c.b bVarA = new c().a(this.f15436a);
                        g.a(bVarA.a());
                        g.f15430d = bVarA.b() ? 1 : 0;
                        g.b(this.f15436a, bVarA.a(), g.f15430d);
                    } catch (Exception unused2) {
                        q0.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                    }
                } catch (Throwable th) {
                    q0.b("DomainSameDiTool", th.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i10) {
        try {
            if (a1.b(str)) {
                y0.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            y0.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i10));
        } catch (Exception e10) {
            q0.b("DomainSameDiTool", e10.getMessage());
        }
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f15428b) ? "" : f15428b;
        }
        if (!TextUtils.isEmpty(f15428b)) {
            return !com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? f15430d == 0 ? f15428b : "" : f15428b;
        }
        if (!f15429c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f15429c = true;
        }
        return "";
    }

    public static String d() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f15427a) ? "" : f15427a;
        }
        if (!TextUtils.isEmpty(f15427a)) {
            return !com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? f15430d == 0 ? f15427a : "" : f15427a;
        }
        m0.k();
        if (!f15429c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f15429c = true;
        }
        return TextUtils.isEmpty(f15427a) ? "" : f15427a;
    }

    public static String e() {
        if (TextUtils.isEmpty(f15433g) && !f15432f) {
            b();
        }
        return f15433g;
    }

    public static int a() {
        return f15430d;
    }

    public static void a(int i10) {
        f15430d = i10;
    }

    public static void a(Context context) {
        new Thread(new a(context)).start();
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f15432f) {
            return f15431e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, i10);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    f15433g = string2;
                    f15431e = k0.b(string2);
                }
            } catch (Settings.SettingNotFoundException e10) {
                q0.b("DomainSameDiTool", e10.getMessage());
            }
        } catch (Throwable th) {
            q0.b("DomainSameDiTool", th.getMessage());
        }
        f15432f = true;
        return f15431e;
    }

    public static void a(String str) {
        f15428b = k0.b(str);
        f15427a = str;
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean b(Context context) {
        try {
        } catch (Exception unused) {
            f15434h = false;
        }
        if (f15435i) {
            return f15434h;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            f15434h = context.getPackageManager().checkPermission(k0.a("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
        } else {
            f15434h = true;
        }
        f15435i = true;
        return f15434h;
    }
}
