package com.liuzh.deviceinfo.utilities;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.monitor.CustomMonitorConfig;
import com.liuzh.deviceinfo.monitor.MonitorManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f21256b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final SharedPreferences f21257c = DeviceInfoApp.f21145f.getSharedPreferences("com.liuzh.deviceinfo_preferences", 0);

    /* renamed from: a, reason: collision with root package name */
    public com.google.gson.j f21258a;

    public static int a() {
        return f21257c.getInt("themes_accent_color", DeviceInfoApp.f21145f.getColor(R.color.colorAccent));
    }

    public static int c() {
        return f21257c.getInt("monitor_text_size", 14);
    }

    public static int d() {
        return f21257c.getInt("themes_primary_color", DeviceInfoApp.f21145f.getColor(R.color.colorPrimary));
    }

    public static int e() {
        if (!h()) {
            return d();
        }
        int iD = d();
        return dj.b.a(iD == -16777216 ? 0.5f : (iD == DeviceInfoApp.f21145f.getColor(R.color.md_purple_900) || iD == DeviceInfoApp.f21145f.getColor(R.color.md_deep_purple_900) || iD == DeviceInfoApp.f21145f.getColor(R.color.md_indigo_900) || iD == DeviceInfoApp.f21145f.getColor(R.color.md_brown_900) || iD == DeviceInfoApp.f21145f.getColor(R.color.md_blue_grey_900) || iD == DeviceInfoApp.f21145f.getColor(R.color.md_grey_900)) ? 0.59f : (iD == DeviceInfoApp.f21145f.getColor(R.color.md_purple_800) || iD == DeviceInfoApp.f21145f.getColor(R.color.md_deep_purple_800) || iD == DeviceInfoApp.f21145f.getColor(R.color.md_indigo_800) || iD == DeviceInfoApp.f21145f.getColor(R.color.md_brown_800)) ? 0.64f : (iD == DeviceInfoApp.f21145f.getColor(R.color.md_purple_700) || iD == DeviceInfoApp.f21145f.getColor(R.color.md_deep_purple_700)) ? 0.69f : 0.76f, iD, -1);
    }

    public static boolean f() {
        return f21257c.getBoolean("agree_privacy_policy", false);
    }

    public static boolean g() {
        return ah.o.f400d.c();
    }

    public static boolean h() {
        int i4 = f21257c.getInt("dark_mode", 0);
        if (i4 == 0) {
            return false;
        }
        if (i4 == 1) {
            return true;
        }
        return i0.n(DeviceInfoApp.f21145f);
    }

    public static boolean i() {
        return f21257c.getBoolean("monitor_text_style", true);
    }

    public static void j(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = f21257c;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong("last_show_dashboard_recommend_card_time_".concat(str), jCurrentTimeMillis);
        editorEdit.putLong("last_show_dashboard_recommend_card_time", jCurrentTimeMillis);
        editorEdit.putInt("dashboard_rec_card_sc_".concat(str), sharedPreferences.getInt("dashboard_rec_card_sc_".concat(str), 0) + 1);
        editorEdit.apply();
    }

    public static void k(String str, boolean z3) {
        f21257c.edit().putBoolean(str, z3).apply();
    }

    public static void l(int i4, String str) {
        je.u.z(f21257c, str, i4);
    }

    public static void m(String str, String str2) {
        f21257c.edit().putString(str, str2).apply();
    }

    public static void n(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        f21257c.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public static void p(int i4, int i10, String str) {
        m(je.u.t("monitor_position_", str), i4 + "," + i10);
    }

    public static void q(String str) {
        SharedPreferences sharedPreferences = f21257c;
        sharedPreferences.edit().putBoolean("can_show_rate_dialog", false).apply();
        sharedPreferences.edit().putBoolean("rate_scene_clicked_".concat(str), true).apply();
    }

    public static int r() {
        String string = f21257c.getString("today_ad_click_count", null);
        if (TextUtils.isEmpty(string)) {
            return 0;
        }
        String[] strArrSplit = string.split("_");
        if (strArrSplit.length != 2) {
            m("today_ad_click_count", "");
            return 0;
        }
        if (!TextUtils.equals(new SimpleDateFormat("yyyyMMdd", Locale.US).format(Long.valueOf(System.currentTimeMillis())), strArrSplit[0])) {
            m("today_ad_click_count", "");
            return 0;
        }
        try {
            return Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            m("today_ad_click_count", "");
            return 0;
        }
    }

    public final List b() {
        String string = f21257c.getString("custom_monitor_configs", null);
        if (TextUtils.isEmpty(string)) {
            return Collections.EMPTY_LIST;
        }
        e eVar = new e();
        if (this.f21258a == null) {
            this.f21258a = new com.google.gson.j();
        }
        com.google.gson.j jVar = this.f21258a;
        jVar.getClass();
        return (List) jVar.c(string, new xf.a(eVar.f37088b));
    }

    public final void o(ArrayList arrayList) {
        MonitorManager monitorManager = MonitorManager.f21223f;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            CustomMonitorConfig customMonitorConfig = (CustomMonitorConfig) obj;
            if (monitorManager.d(customMonitorConfig.getId())) {
                monitorManager.g(customMonitorConfig);
            }
        }
        if (this.f21258a == null) {
            this.f21258a = new com.google.gson.j();
        }
        m("custom_monitor_configs", this.f21258a.g(arrayList));
    }
}
