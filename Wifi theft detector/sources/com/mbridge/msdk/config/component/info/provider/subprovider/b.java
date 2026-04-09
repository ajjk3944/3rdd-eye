package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static int f13333c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static String f13334d = "";

    /* renamed from: e, reason: collision with root package name */
    public static int f13335e;

    /* renamed from: a, reason: collision with root package name */
    private Context f13336a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f13337b = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public void run() {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) b.this.f13336a.getSystemService("connectivity");
                if (connectivityManager != null && b.this.a()) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(17);
                    int i10 = (networkInfo == null || !networkInfo.isConnected()) ? 0 : 1;
                    b.f13335e = i10;
                    if (i10 == 0) {
                        b.f13335e = b.this.f() ? 2 : 0;
                    }
                    if (activeNetworkInfo == null) {
                        b.f13333c = 0;
                        return;
                    }
                    if (activeNetworkInfo.getType() == 1) {
                        b.f13333c = 9;
                        return;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) b.this.f13336a.getSystemService("phone");
                    if (telephonyManager == null) {
                        b.f13333c = 0;
                        return;
                    }
                    int dataNetworkType = Build.VERSION.SDK_INT >= 24 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
                    b.f13333c = b.this.a(dataNetworkType);
                    b.f13334d = String.valueOf(dataNetworkType);
                }
            } catch (Throwable th) {
                q0.b("NetworkStatusProvider", th.getMessage());
                b.f13333c = 0;
                b.f13334d = "";
                b.f13335e = 0;
            }
        }
    }

    public b(Context context) {
        if (context != null) {
            this.f13336a = context;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    public void b() {
        try {
            if (com.mbridge.msdk.foundation.same.threadpool.a.d().getActiveCount() < 1) {
                com.mbridge.msdk.foundation.same.threadpool.a.d().execute(this.f13337b);
            }
        } catch (Throwable th) {
            q0.b("NetworkStatusProvider", th.getMessage());
        }
    }

    public int c() {
        return f13333c;
    }

    public String d() {
        return f13334d;
    }

    public int e() {
        return f13335e;
    }

    public boolean f() {
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                return false;
            }
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (TextUtils.isEmpty(property2)) {
                property2 = "-1";
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
        } catch (Throwable th) {
            q0.b("NetworkStatusProvider", th.getMessage());
            return false;
        }
    }

    public boolean a() {
        try {
            return this.f13336a.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f13336a.getPackageName()) == 0;
        } catch (Exception e10) {
            q0.b("NetworkStatusProvider", e10.getMessage());
            return false;
        }
    }
}
