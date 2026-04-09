package wg;

import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final s f36694b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f36695c;

    /* renamed from: d, reason: collision with root package name */
    public static final s f36696d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f36697e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f36698f;
    public static final s g;

    /* renamed from: h, reason: collision with root package name */
    public static final s f36699h;

    /* renamed from: i, reason: collision with root package name */
    public static final s f36700i;
    public static final s j;

    /* renamed from: k, reason: collision with root package name */
    public static final s f36701k;

    /* renamed from: l, reason: collision with root package name */
    public static final s f36702l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ s[] f36703m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ fk.b f36704n;

    /* renamed from: a, reason: collision with root package name */
    public final String f36705a;

    static {
        String string = DeviceInfoApp.f21145f.getString(R.string.battery_level_short);
        nk.k.d(string, "getString(...)");
        s sVar = new s("BatteryLevel", 0, string);
        f36694b = sVar;
        String string2 = DeviceInfoApp.f21145f.getString(R.string.battery_current_short);
        nk.k.d(string2, "getString(...)");
        s sVar2 = new s("BatteryCurrent", 1, string2);
        f36695c = sVar2;
        String string3 = DeviceInfoApp.f21145f.getString(R.string.battery_voltage);
        nk.k.d(string3, "getString(...)");
        s sVar3 = new s("BatteryVoltage", 2, string3);
        f36696d = sVar3;
        String string4 = DeviceInfoApp.f21145f.getString(R.string.battery_temperature_short);
        nk.k.d(string4, "getString(...)");
        s sVar4 = new s("BatteryTemperature", 3, string4);
        f36697e = sVar4;
        String string5 = DeviceInfoApp.f21145f.getString(R.string.battery_power);
        nk.k.d(string5, "getString(...)");
        s sVar5 = new s("BatteryPower", 4, string5);
        f36698f = sVar5;
        String string6 = DeviceInfoApp.f21145f.getString(R.string.ram_usage_percent);
        nk.k.d(string6, "getString(...)");
        s sVar6 = new s("RamPercent", 5, string6);
        g = sVar6;
        String string7 = DeviceInfoApp.f21145f.getString(R.string.ram_usage);
        nk.k.d(string7, "getString(...)");
        s sVar7 = new s("RamDetail", 6, string7);
        f36699h = sVar7;
        s sVar8 = new s("Fps", 7, "fps");
        f36700i = sVar8;
        String string8 = DeviceInfoApp.f21145f.getString(R.string.net_speed_up);
        nk.k.d(string8, "getString(...)");
        s sVar9 = new s("NetSpeedUp", 8, string8);
        j = sVar9;
        String string9 = DeviceInfoApp.f21145f.getString(R.string.net_speed_down);
        nk.k.d(string9, "getString(...)");
        s sVar10 = new s("NetSpeedDown", 9, string9);
        f36701k = sVar10;
        String string10 = DeviceInfoApp.f21145f.getString(R.string.current_time);
        nk.k.d(string10, "getString(...)");
        s sVar11 = new s("Time", 10, string10);
        f36702l = sVar11;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10, sVar11};
        f36703m = sVarArr;
        f36704n = new fk.b(sVarArr);
    }

    public s(String str, int i4, String str2) {
        this.f36705a = str2;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f36703m.clone();
    }
}
