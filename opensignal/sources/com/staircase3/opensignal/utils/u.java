package com.staircase3.opensignal.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import c0.a0;
import com.google.android.gms.common.ConnectionResult;
import com.staircase3.opensignal.library.cells.Cell;
import com.staircase3.opensignal.viewcontrollers.Tab_Overview;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final lq.q f6195a = kc.f.F(new a0(1));

    /* renamed from: b, reason: collision with root package name */
    public static final Paint f6196b;

    /* renamed from: c, reason: collision with root package name */
    public static final Random f6197c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f6198d;

    static {
        Paint paint = new Paint();
        f6196b = paint;
        f6197c = new Random();
        f6198d = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.READ_PHONE_STATE"};
        paint.setAlpha(120);
    }

    public static final String a(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char cCharAt = str.charAt(0);
            Locale locale = Locale.getDefault();
            br.l.d(locale, "getDefault(...)");
            String strValueOf = String.valueOf(cCharAt);
            br.l.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(locale);
            br.l.d(upperCase, "toUpperCase(...)");
            sb2.append((Object) upperCase);
            String strSubstring = str.substring(1);
            br.l.d(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            str = sb2.toString();
        }
        return str == null ? "" : str;
    }

    public static final int b(Context context, int i10) {
        br.l.e(context, "context");
        try {
            return context.getResources().getColor(i10, null);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final String c(Context context, qm.f fVar, r rVar, o oVar, boolean z10) {
        double latitude;
        br.l.e(context, "context");
        br.l.e(fVar, "permissionsManager");
        br.l.e(rVar, "telephonyManagerUtils");
        br.l.e(oVar, "networkTypeUtils");
        StringBuilder sb2 = new StringBuilder("Comments:\n\n\nPlease attach screenshots if you want!\n\n*Bug Information*\n");
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        Cell cell = Tab_Overview.f6222n1;
        if (z10) {
            sb2.append("Approximate location: ");
            double longitude = 0.0d;
            try {
                latitude = cell.D.getLatitude();
            } catch (Exception unused) {
                latitude = 0.0d;
            }
            sb2.append(decimalFormat.format(latitude));
            sb2.append(", ");
            try {
                longitude = cell.D.getLongitude();
            } catch (Exception unused2) {
            }
            sb2.append(decimalFormat.format(longitude));
            sb2.append("\n");
        }
        sb2.append("Android version: ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append("\nApp version: v.8.3.2-1 (8003020)\n");
        if (z10) {
            sb2.append("Device Brand: ");
            sb2.append(Build.BRAND);
            sb2.append("\nDevice Manufacturer: ");
            sb2.append(Build.MANUFACTURER);
            sb2.append("\nDevice Model: ");
            sb2.append(Build.MODEL);
            sb2.append("\nGPS enabled: ");
            Object systemService = context.getApplicationContext().getSystemService("location");
            br.l.c(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            LocationManager locationManager = (LocationManager) systemService;
            boolean zIsProviderEnabled = locationManager.isProviderEnabled("gps");
            boolean zIsProviderEnabled2 = locationManager.isProviderEnabled("network");
            sb2.append(zIsProviderEnabled);
            sb2.append("\nOther location services enabled: ");
            sb2.append(zIsProviderEnabled2);
            sb2.append("\nWiFi connected: ");
            Object systemService2 = context.getApplicationContext().getSystemService("wifi");
            br.l.c(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            WifiManager wifiManager = (WifiManager) systemService2;
            sb2.append(wifiManager.isWifiEnabled() && wifiManager.getConnectionInfo().getNetworkId() != -1);
            sb2.append("\nPhone type: ");
            TelephonyManager telephonyManagerA = rVar.a(context);
            String str = "unknown";
            if (telephonyManagerA != null) {
                int phoneType = telephonyManagerA.getPhoneType();
                if (phoneType == 0) {
                    str = "None";
                } else if (phoneType == 1) {
                    str = "GSM";
                } else if (phoneType == 2) {
                    str = "CDMA";
                } else if (phoneType == 3) {
                    str = "SIP";
                }
            }
            sb2.append(str);
            sb2.append("\nCurrent mobile network type: ");
            sb2.append(oVar.d(context));
            sb2.append("\n");
            TelephonyManager telephonyManagerA2 = rVar.a(context);
            if (telephonyManagerA2 != null) {
                sb2.append("Current network provider: ");
                sb2.append(telephonyManagerA2.getNetworkOperatorName());
                sb2.append(" -|- ");
                sb2.append(telephonyManagerA2.getNetworkOperator());
                sb2.append("\nHome network provider: ");
                sb2.append(telephonyManagerA2.getSimOperatorName());
                sb2.append(" -|- ");
                sb2.append(telephonyManagerA2.getSimOperator());
                sb2.append("\n");
            }
            StringBuilder sb3 = new StringBuilder();
            for (String str2 : f6198d) {
                sb3.append(tt.s.l0(str2, "android.permission.", ""));
                sb3.append(": ");
                sb3.append(qm.f.c(context, str2));
                sb3.append("\n");
            }
            String string = sb3.toString();
            br.l.d(string, "toString(...)");
            sb2.append(string);
            int iB = zb.c.f26814e.b(context, zb.d.f26816a);
            AtomicBoolean atomicBoolean = zb.f.f26819a;
            ConnectionResult.d(iB);
            try {
                int i10 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused3) {
            }
            sb2.append("");
        }
        String string2 = sb2.toString();
        br.l.d(string2, "toString(...)");
        return string2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(android.content.Context r3, android.telephony.TelephonyManager r4) {
        /*
            java.lang.String r0 = "context"
            br.l.e(r3, r0)
            java.lang.String r0 = ""
            if (r4 == 0) goto Lf
            java.lang.String r4 = r4.getNetworkOperator()     // Catch: java.lang.Exception -> L22
            if (r4 != 0) goto L10
        Lf:
            r4 = r0
        L10:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L22
            if (r1 != 0) goto L22
            r1 = 0
            r2 = 3
            java.lang.String r4 = r4.substring(r1, r2)     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = "substring(...)"
            br.l.d(r4, r1)     // Catch: java.lang.Exception -> L22
            goto L23
        L22:
            r4 = r0
        L23:
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Exception -> L3b
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Exception -> L3b
            int r3 = r3.mcc     // Catch: java.lang.Exception -> L3b
            if (r3 == 0) goto L3b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3b
            r1.<init>(r0)     // Catch: java.lang.Exception -> L3b
            r1.append(r3)     // Catch: java.lang.Exception -> L3b
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L3b
        L3b:
            int r3 = r4.length()
            if (r3 != 0) goto L42
            r4 = r0
        L42:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.staircase3.opensignal.utils.u.d(android.content.Context, android.telephony.TelephonyManager):java.lang.String");
    }

    public static final boolean e(Context context) {
        br.l.e(context, "context");
        return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
    }

    public static final byte[] f(InputStream inputStream) {
        byte[] bArr = new byte[0];
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new BufferedInputStream(inputStream, 1024));
            if (bitmapDecodeStream == null) {
                return bArr;
            }
            int width = bitmapDecodeStream.getWidth();
            int height = bitmapDecodeStream.getHeight();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            canvas.drawBitmap(bitmapDecodeStream, 0.0f, 0.0f, f6196b);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            bitmapCreateBitmap.setHasAlpha(true);
            bitmapDecodeStream.recycle();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            br.l.d(byteArray, "toByteArray(...)");
            return byteArray;
        } catch (Exception unused) {
            return bArr;
        }
    }
}
