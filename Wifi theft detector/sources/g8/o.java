package g8;

import android.content.Context;
import android.preference.PreferenceManager;
import com.unity3d.ads.BuildConfig;
import com.wifihacker.detector.common.util.SystemUtil;

/* loaded from: classes3.dex */
public class o {

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static o f21219a = new o();
    }

    public static o c() {
        return b.f21219a;
    }

    public boolean a(Context context, String str, String str2, boolean z10) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str + "_" + str2, z10);
    }

    public boolean b(Context context, String str, boolean z10) {
        return a(context, BuildConfig.FLAVOR, str, z10);
    }

    public int d(Context context, String str, int i10) {
        return e(context, BuildConfig.FLAVOR, str, i10);
    }

    public int e(Context context, String str, String str2, int i10) {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(str + "_" + str2, i10);
    }

    public String f(Context context, String str, String str2) {
        return g(context, BuildConfig.FLAVOR, str, str2);
    }

    public String g(Context context, String str, String str2, String str3) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(str + "_" + str2, str3);
    }

    public final boolean h() {
        return SystemUtil.a() < 9;
    }

    public void i(Context context, String str, String str2) {
        j(context, str, str2, false);
    }

    public void j(Context context, String str, String str2, boolean z10) {
        if (str == null || str2 == null) {
            return;
        }
        if (h()) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().remove(str + "_" + str2).commit();
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(context).edit().remove(str + "_" + str2).apply();
    }

    public void k(Context context, String str, String str2, boolean z10) {
        l(context, str, str2, z10, false);
    }

    public void l(Context context, String str, String str2, boolean z10, boolean z11) {
        if (str == null || str2 == null) {
            return;
        }
        if (z11 || h()) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(str + "_" + str2, z10).commit();
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(str + "_" + str2, z10).apply();
    }

    public void m(Context context, String str, boolean z10) {
        k(context, BuildConfig.FLAVOR, str, z10);
    }

    public void n(Context context, String str, int i10) {
        o(context, BuildConfig.FLAVOR, str, i10);
    }

    public void o(Context context, String str, String str2, int i10) {
        p(context, str, str2, i10, false);
    }

    public void p(Context context, String str, String str2, int i10, boolean z10) {
        if (str == null || str2 == null) {
            return;
        }
        if (z10 || h()) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putInt(str + "_" + str2, i10).commit();
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt(str + "_" + str2, i10).apply();
    }

    public String q(Context context, String str, String str2) {
        r(context, BuildConfig.FLAVOR, str, str2);
        return str;
    }

    public void r(Context context, String str, String str2, String str3) {
        s(context, str, str2, str3, false);
    }

    public void s(Context context, String str, String str2, String str3, boolean z10) {
        if (str == null || str2 == null) {
            return;
        }
        if (z10 || h()) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str + "_" + str2, str3).commit();
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str + "_" + str2, str3).apply();
    }

    public o() {
    }
}
