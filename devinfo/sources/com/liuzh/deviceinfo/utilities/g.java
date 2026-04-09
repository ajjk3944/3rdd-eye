package com.liuzh.deviceinfo.utilities;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.Display;
import android.view.WindowManager;
import b5.o0;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.shadow.okio.internal.Buffer;
import com.google.android.gms.internal.ads.d7;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.settings.SettingsActivity;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f.h f21259a;

    /* renamed from: b, reason: collision with root package name */
    public String f21260b;

    public g(SettingsActivity settingsActivity) {
        this.f21259a = (f.h) settingsActivity.h(new o0(2), new com.applovin.impl.sdk.ad.f(2, this, settingsActivity));
    }

    public static void a(BufferedWriter bufferedWriter) throws IOException {
        int i4;
        int i10 = 0;
        try {
            Iterator<PackageInfo> it = DeviceInfoApp.f21145f.getPackageManager().getInstalledPackages(Buffer.SEGMENTING_THRESHOLD).iterator();
            i4 = 0;
            while (it.hasNext()) {
                try {
                    if ((it.next().applicationInfo.flags & 1) == 1) {
                        i10++;
                    } else {
                        i4++;
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            i4 = 0;
        }
        bufferedWriter.newLine();
        bufferedWriter.write("---------" + DeviceInfoApp.f21145f.getString(R.string.apps) + "---------");
        bufferedWriter.newLine();
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.system_apps) + ": " + i10);
        bufferedWriter.newLine();
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.user_apps) + ": " + i4);
        bufferedWriter.newLine();
    }

    public static void b(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.write("---------" + DeviceInfoApp.f21145f.getString(R.string.battery) + "---------");
        bufferedWriter.newLine();
        Intent intentRegisterReceiver = DeviceInfoApp.f21145f.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0);
            int iB = b.b(intentRegisterReceiver.getIntExtra("voltage", 0));
            float intExtra2 = intentRegisterReceiver.getIntExtra("temperature", 0) / 10.0f;
            int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
            int intExtra4 = intentRegisterReceiver.getIntExtra("plugged", -1);
            int intExtra5 = intentRegisterReceiver.getIntExtra("health", -1);
            String stringExtra = intentRegisterReceiver.getStringExtra("technology");
            String strF = d.f(intExtra2);
            String strD = b.d(iB);
            bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.battery_capacity) + ": " + l.i() + DeviceInfoApp.f21145f.getString(R.string.mah));
            bufferedWriter.newLine();
            StringBuilder sb2 = new StringBuilder();
            d7.p(DeviceInfoApp.f21145f, R.string.health, sb2, ": ");
            sb2.append(l.k(intExtra5, DeviceInfoApp.f21145f));
            bufferedWriter.write(sb2.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.battery_level) + ": " + intExtra + "%");
            bufferedWriter.newLine();
            StringBuilder sb3 = new StringBuilder();
            d7.p(DeviceInfoApp.f21145f, R.string.status, sb3, ": ");
            sb3.append(l.m(intExtra3, DeviceInfoApp.f21145f));
            bufferedWriter.write(sb3.toString());
            bufferedWriter.newLine();
            StringBuilder sb4 = new StringBuilder();
            d7.p(DeviceInfoApp.f21145f, R.string.power_source, sb4, ": ");
            sb4.append(l.l(intExtra4, DeviceInfoApp.f21145f));
            bufferedWriter.write(sb4.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.technology) + ": " + stringExtra);
            bufferedWriter.newLine();
            bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.temperature) + ": " + strF);
            bufferedWriter.newLine();
            bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.voltage) + ": " + strD);
        }
        bufferedWriter.newLine();
    }

    public static void c(BufferedWriter bufferedWriter) throws CameraAccessException, IOException {
        String[] cameraIdList;
        String string;
        CameraManager cameraManager = (CameraManager) DeviceInfoApp.f21145f.getSystemService("camera");
        if (cameraManager != null) {
            bufferedWriter.newLine();
            bufferedWriter.write("---------" + DeviceInfoApp.f21145f.getString(R.string.camera) + "---------");
            bufferedWriter.newLine();
            try {
                cameraIdList = cameraManager.getCameraIdList();
            } catch (Exception unused) {
                cameraIdList = null;
            }
            if (cameraIdList != null) {
                for (String str : cameraIdList) {
                    try {
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        if (streamConfigurationMap != null) {
                            Size[] outputSizes = streamConfigurationMap.getOutputSizes(256);
                            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                            if (num != null) {
                                int iIntValue = num.intValue();
                                string = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? DeviceInfoApp.f21145f.getString(R.string.unknown) : DeviceInfoApp.f21145f.getString(R.string.external) : DeviceInfoApp.f21145f.getString(R.string.camera_back) : DeviceInfoApp.f21145f.getString(R.string.camera_front);
                            } else {
                                string = DeviceInfoApp.f21145f.getString(R.string.unknown);
                            }
                            if (outputSizes != null) {
                                float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                                bufferedWriter.newLine();
                                bufferedWriter.write("--" + (l.r(outputSizes) + " - " + string) + "--");
                                bufferedWriter.newLine();
                                bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.resolution) + ": " + l.s(outputSizes));
                                bufferedWriter.newLine();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(DeviceInfoApp.f21145f.getString(R.string.camera_focal_lengths));
                                sb2.append(": ");
                                sb2.append((fArr == null || fArr.length == 0) ? "-" : Float.valueOf(fArr[0]));
                                sb2.append(" mm");
                                bufferedWriter.write(sb2.toString());
                                bufferedWriter.newLine();
                                CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(str);
                                for (CameraCharacteristics.Key<?> key : cameraCharacteristics2.getKeys()) {
                                    String strQ = l.q(key, cameraCharacteristics2);
                                    if (!TextUtils.isEmpty(strQ)) {
                                        bufferedWriter.write(l.E(DeviceInfoApp.f21145f, key.getName()) + ": " + strQ);
                                        bufferedWriter.newLine();
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    public static void d(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.newLine();
        bufferedWriter.write("---------" + DeviceInfoApp.f21145f.getString(R.string.cpu) + "---------");
        bufferedWriter.newLine();
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.hardware) + ": " + l.v());
        bufferedWriter.newLine();
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.cores) + ": " + Runtime.getRuntime().availableProcessors());
        bufferedWriter.newLine();
        float[] fArrT = l.t();
        StringBuilder sb2 = new StringBuilder();
        Locale locale = Locale.US;
        sb2.append(String.format(locale, "%.0f", Float.valueOf(fArrT[0])));
        sb2.append("MHz - ");
        sb2.append(String.format(locale, "%.0f", Float.valueOf(fArrT[1])));
        sb2.append("MHz");
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.cpu_frequency) + ": " + sb2.toString());
        bufferedWriter.newLine();
        ArrayList arrayListC0 = l.c0();
        for (int i4 = 0; i4 < arrayListC0.size(); i4++) {
            vg.b bVar = (vg.b) arrayListC0.get(i4);
            bufferedWriter.write(bVar.f36219a + ": " + bVar.f36220b);
            bufferedWriter.newLine();
        }
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        String strL = l.L();
        p6.i iVarQ = ii.a.q();
        if (iVarQ != null) {
            bufferedWriter.write("SOC: " + (iVarQ.K() + " " + iVarQ.F()));
            bufferedWriter.newLine();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(DeviceInfoApp.f21145f.getString(R.string.processor));
        sb3.append(": ");
        if (TextUtils.isEmpty(strL)) {
            strL = DeviceInfoApp.f21145f.getString(R.string.unknown);
        }
        sb3.append(strL);
        bufferedWriter.write(sb3.toString());
        bufferedWriter.newLine();
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.supported_abis) + ": " + l.U());
        bufferedWriter.newLine();
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.cpu_hardware) + ": " + l.v());
        bufferedWriter.newLine();
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.cpu_governor) + ": " + l.p());
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        StringBuilder sb4 = new StringBuilder();
        d7.p(DeviceInfoApp.f21145f, R.string.gpu_renderer, sb4, ": ");
        SharedPreferences sharedPreferences = f.f21257c;
        sb4.append(sharedPreferences.getString("gpu_render", ""));
        bufferedWriter.write(sb4.toString());
        bufferedWriter.newLine();
        StringBuilder sb5 = new StringBuilder();
        d7.p(DeviceInfoApp.f21145f, R.string.gpu_vendor, sb5, ": ");
        sb5.append(sharedPreferences.getString("gpu_vendor", ""));
        bufferedWriter.write(sb5.toString());
        bufferedWriter.newLine();
        StringBuilder sb6 = new StringBuilder();
        d7.p(DeviceInfoApp.f21145f, R.string.gpu_version, sb6, ": ");
        sb6.append(sharedPreferences.getString("gpu_version", ""));
        bufferedWriter.write(sb6.toString());
        bufferedWriter.newLine();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.io.BufferedWriter r5) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.io.IOException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liuzh.deviceinfo.utilities.g.e(java.io.BufferedWriter):void");
    }

    public static void f(BufferedWriter bufferedWriter) throws IOException {
        TelephonyManager telephonyManager;
        bufferedWriter.newLine();
        bufferedWriter.write("---------" + DeviceInfoApp.f21145f.getString(R.string.network) + "---------");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("--" + DeviceInfoApp.f21145f.getString(R.string.wifi) + "--");
        bufferedWriter.newLine();
        WifiP2pManager wifiP2pManager = (WifiP2pManager) DeviceInfoApp.f21145f.getSystemService("wifip2p");
        StringBuilder sb2 = new StringBuilder();
        d7.p(DeviceInfoApp.f21145f, R.string.wifi_direct, sb2, ": ");
        int i4 = R.string.supported;
        sb2.append(DeviceInfoApp.f21145f.getString(wifiP2pManager == null ? R.string.not_supported : R.string.supported));
        bufferedWriter.write(sb2.toString());
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("--" + DeviceInfoApp.f21145f.getString(R.string.mobile_data) + "--");
        bufferedWriter.newLine();
        StringBuilder sb3 = new StringBuilder();
        d7.p(DeviceInfoApp.f21145f, R.string.multi_sim, sb3, ": ");
        TelephonyManager telephonyManager2 = (TelephonyManager) DeviceInfoApp.f21145f.getSystemService("phone");
        if (telephonyManager2 == null || telephonyManager2.getPhoneCount() <= 1) {
            i4 = R.string.not_supported;
        }
        sb3.append(DeviceInfoApp.f21145f.getString(i4));
        bufferedWriter.write(sb3.toString());
        bufferedWriter.newLine();
        if (wi.i.a(DeviceInfoApp.f21145f, "android.permission.READ_PHONE_STATE") && (telephonyManager = (TelephonyManager) DeviceInfoApp.f21145f.getSystemService("phone")) != null) {
            bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.device_type) + ": " + l.b(telephonyManager.getPhoneType()));
            bufferedWriter.newLine();
        }
        if (wd.b.c(DeviceInfoApp.f21145f, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.cell_id) + ": " + a4.a.e());
            bufferedWriter.newLine();
            bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.tracking_area_code) + ": " + a4.a.i());
            bufferedWriter.newLine();
        }
    }

    public static void g(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.newLine();
        bufferedWriter.write("---------" + DeviceInfoApp.f21145f.getString(R.string.display) + "---------");
        bufferedWriter.newLine();
        String strF = l.F();
        if (!DeviceInfoApp.f21145f.getString(R.string.unknown).equals(strF)) {
            bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.panel_id) + ": " + strF);
            bufferedWriter.newLine();
        }
        WindowManager windowManager = (WindowManager) DeviceInfoApp.f21145f.getSystemService("window");
        if (windowManager != null) {
            bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.name) + ": " + windowManager.getDefaultDisplay().getName());
            bufferedWriter.newLine();
            Point point = new Point();
            Display defaultDisplay = windowManager.getDefaultDisplay();
            defaultDisplay.getRealSize(point);
            StringBuilder sb2 = new StringBuilder();
            d7.p(DeviceInfoApp.f21145f, R.string.screen_total_height, sb2, ": ");
            sb2.append(point.y);
            sb2.append(DeviceInfoApp.f21145f.getString(R.string.px));
            bufferedWriter.write(sb2.toString());
            bufferedWriter.newLine();
            StringBuilder sb3 = new StringBuilder();
            d7.p(DeviceInfoApp.f21145f, R.string.screen_total_width, sb3, ": ");
            sb3.append(point.x);
            sb3.append(DeviceInfoApp.f21145f.getString(R.string.px));
            bufferedWriter.write(sb3.toString());
            bufferedWriter.newLine();
            StringBuilder sb4 = new StringBuilder();
            d7.p(DeviceInfoApp.f21145f, R.string.refresh_rate, sb4, ": ");
            sb4.append(String.format(Locale.US, "%.2f", Float.valueOf(defaultDisplay.getRefreshRate())));
            sb4.append(DeviceInfoApp.f21145f.getString(R.string.fps));
            bufferedWriter.write(sb4.toString());
            bufferedWriter.newLine();
        }
        Configuration configuration = DeviceInfoApp.f21145f.getResources().getConfiguration();
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.screen_size) + ": " + l.Q(configuration));
        bufferedWriter.newLine();
        StringBuilder sb5 = new StringBuilder();
        d7.p(DeviceInfoApp.f21145f, R.string.screen_physical_size, sb5, ": ");
        Locale locale = Locale.US;
        sb5.append(String.format(locale, "%.2f", Float.valueOf(d.i())));
        sb5.append(" ");
        sb5.append(DeviceInfoApp.f21145f.getString(R.string.inches));
        bufferedWriter.write(sb5.toString());
        bufferedWriter.newLine();
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.orientation) + ": " + l.P(configuration));
        bufferedWriter.newLine();
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.brightness_mode) + ": " + l.o());
        bufferedWriter.newLine();
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.screen_timeout) + ": " + l.R());
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.screen_display_bucket) + ": " + d.h());
        bufferedWriter.newLine();
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        StringBuilder sb6 = new StringBuilder();
        d7.p(DeviceInfoApp.f21145f, R.string.screen_dpi, sb6, ": ");
        sb6.append(displayMetrics.densityDpi);
        sb6.append(" dpi");
        bufferedWriter.write(sb6.toString());
        bufferedWriter.newLine();
        StringBuilder sb7 = new StringBuilder();
        d7.p(DeviceInfoApp.f21145f, R.string.xdpi, sb7, ": ");
        sb7.append(displayMetrics.xdpi);
        sb7.append(" dpi");
        bufferedWriter.write(sb7.toString());
        bufferedWriter.newLine();
        StringBuilder sb8 = new StringBuilder();
        d7.p(DeviceInfoApp.f21145f, R.string.ydpi, sb8, ": ");
        sb8.append(displayMetrics.ydpi);
        sb8.append(" dpi");
        bufferedWriter.write(sb8.toString());
        bufferedWriter.newLine();
        StringBuilder sb9 = new StringBuilder();
        d7.p(DeviceInfoApp.f21145f, R.string.screen_logical_density, sb9, ": ");
        sb9.append(String.format(locale, "%.2f", Float.valueOf(displayMetrics.density)));
        bufferedWriter.write(sb9.toString());
        bufferedWriter.newLine();
        StringBuilder sb10 = new StringBuilder();
        d7.p(DeviceInfoApp.f21145f, R.string.screen_scaled_density, sb10, ": ");
        sb10.append(String.format(locale, "%.2f", Float.valueOf(displayMetrics.scaledDensity)));
        bufferedWriter.write(sb10.toString());
        bufferedWriter.newLine();
        StringBuilder sb11 = new StringBuilder();
        d7.p(DeviceInfoApp.f21145f, R.string.font_scale, sb11, ": ");
        sb11.append(String.format(locale, "%.2f", Float.valueOf(DeviceInfoApp.f21145f.getResources().getConfiguration().fontScale)));
        bufferedWriter.write(sb11.toString());
        bufferedWriter.newLine();
    }

    public static void h(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.newLine();
        bufferedWriter.write("---------" + DeviceInfoApp.f21145f.getString(R.string.sensors) + "---------");
        bufferedWriter.newLine();
        for (vg.d dVar : l.h()) {
            bufferedWriter.newLine();
            String string = DeviceInfoApp.f21145f.getString(R.string.unknown);
            String str = dVar.f36229c;
            String str2 = dVar.f36227a;
            bufferedWriter.write("--" + (string.equals(str) ? str2 : dVar.f36229c) + "--");
            bufferedWriter.newLine();
            bufferedWriter.write(dVar.f36228b);
            bufferedWriter.newLine();
            bufferedWriter.write(str2);
            bufferedWriter.newLine();
            bufferedWriter.write(dVar.f36230d);
            bufferedWriter.newLine();
            bufferedWriter.write(dVar.f36231e);
            bufferedWriter.newLine();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(java.io.BufferedWriter r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liuzh.deviceinfo.utilities.g.i(java.io.BufferedWriter):void");
    }

    public static void j(BufferedWriter bufferedWriter, vg.c cVar) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        d7.p(DeviceInfoApp.f21145f, R.string.string_path, sb2, ": ");
        sb2.append(cVar.f36226f);
        bufferedWriter.write(sb2.toString());
        bufferedWriter.newLine();
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.used) + ": " + String.format(Locale.getDefault(), "%.1f", Double.valueOf(cVar.f36224d)) + " GB");
        bufferedWriter.newLine();
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.total) + ": " + String.format(Locale.getDefault(), "%.1f", Double.valueOf(cVar.f36222b)) + " GB");
        bufferedWriter.newLine();
        String strX = l.x(cVar.f36226f);
        if (TextUtils.isEmpty(strX) && TextUtils.equals(cVar.f36226f, Environment.getRootDirectory().getAbsolutePath())) {
            strX = l.x("/");
        }
        bufferedWriter.write(DeviceInfoApp.f21145f.getString(R.string.file_system) + ": " + strX);
        bufferedWriter.newLine();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x021d A[Catch: Exception -> 0x0228, TRY_ENTER, TryCatch #2 {Exception -> 0x0228, blocks: (B:21:0x0204, B:23:0x020a, B:25:0x0212, B:30:0x021f, B:29:0x021d), top: B:62:0x0204 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(java.io.BufferedWriter r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liuzh.deviceinfo.utilities.g.k(java.io.BufferedWriter):void");
    }

    public static void l(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.newLine();
        bufferedWriter.write("---------" + DeviceInfoApp.f21145f.getString(R.string.temperature) + "---------");
        bufferedWriter.newLine();
        ArrayList arrayListD0 = l.d0();
        int size = arrayListD0.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListD0.get(i4);
            i4++;
            vg.e eVar = (vg.e) obj;
            bufferedWriter.write(eVar.f36233a + ": " + eVar.f36234b);
            bufferedWriter.newLine();
        }
    }

    public static void m(BufferedWriter bufferedWriter, String str) throws IOException {
        bufferedWriter.write("------Device Info------");
        bufferedWriter.newLine();
        bufferedWriter.write("date: " + str);
        bufferedWriter.newLine();
        bufferedWriter.write("author: com.liuzh.deviceinfo");
        bufferedWriter.newLine();
        bufferedWriter.write("version: v3.0.1.0(327)");
        bufferedWriter.newLine();
    }
}
