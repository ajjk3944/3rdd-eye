package I2;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: SharePref.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f2429a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2430b;

    public m(Context context) {
        this.f2430b = context;
        this.f2429a = context.getSharedPreferences("PRIVATE", 0);
    }

    public final int a() {
        return this.f2429a.getInt("COLOR_PROGRESS", 12);
    }

    public final String b() {
        return this.f2429a.getString("LOCALE", "en");
    }

    public final void c(int i) {
        this.f2429a.edit().putInt("CAMERA_SIZE", i).apply();
    }

    public final void d(String str) {
        this.f2429a.edit().putString("CAMERA_COLOR", str).apply();
    }

    public final void e(int i) {
        this.f2429a.edit().putInt("DURATION", i).apply();
    }

    public final void f(String str) {
        this.f2429a.edit().putString("LOCALE", str).apply();
    }

    public final void g(int i) {
        this.f2429a.edit().putInt("RESOLUTION", i).apply();
    }
}
