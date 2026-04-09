package com.liuzh.deviceinfo.utilities;

import com.google.android.gms.internal.ads.vu0;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f21243a;

    /* renamed from: b, reason: collision with root package name */
    public static int f21244b;

    /* renamed from: c, reason: collision with root package name */
    public static final vu0 f21245c = new vu0(1);

    /* renamed from: d, reason: collision with root package name */
    public static int f21246d;

    /* renamed from: e, reason: collision with root package name */
    public static float f21247e;

    public static float a(int i4, int i10) {
        f fVar = f.f21256b;
        float f10 = (i4 / 1000.0f) * (i10 < 10 ? i10 : i10 / 1000.0f);
        int i11 = f21244b;
        if (i11 == 3 || i11 == 4) {
            boolean z3 = i4 > 0;
            if (f.f21257c.getBoolean("is_device_power_negate", false) != z3) {
                f.k("is_device_power_negate", z3);
            }
        }
        return f10 * (f.f21257c.getBoolean("is_device_power_negate", false) ? -1 : 1);
    }

    public static int b(int i4) {
        f fVar = f.f21256b;
        return (!f.f21257c.getBoolean("half_battery_voltage", false) || i4 < 7000) ? i4 : i4 / 2;
    }

    public static String c(int i4) {
        if (i4 > 1000) {
            return String.format(Locale.US, "%.2f", Float.valueOf(i4 / 1000.0f)) + DeviceInfoApp.f21145f.getString(R.string.battery_unit_A);
        }
        return i4 + DeviceInfoApp.f21145f.getString(R.string.ma);
    }

    public static String d(int i4) {
        if (i4 > 1000) {
            return String.format(Locale.US, "%.2f", Float.valueOf(i4 / 1000.0f)) + DeviceInfoApp.f21145f.getString(R.string.battery_unit_V);
        }
        if (i4 < 10) {
            return i4 + DeviceInfoApp.f21145f.getString(R.string.battery_unit_V);
        }
        return i4 + DeviceInfoApp.f21145f.getString(R.string.mV);
    }

    public static int e() {
        return Math.max(Math.min(f21243a, 100), 0);
    }
}
