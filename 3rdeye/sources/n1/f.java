package n1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* compiled from: PreferenceManager.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f44215a;

    /* renamed from: b, reason: collision with root package name */
    public long f44216b = 0;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f44217c = null;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences.Editor f44218d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f44219e;

    /* renamed from: f, reason: collision with root package name */
    public final String f44220f;

    /* renamed from: g, reason: collision with root package name */
    public PreferenceScreen f44221g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.preference.b f44222h;
    public androidx.preference.b i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.preference.b f44223j;

    public f(Context context) {
        this.f44215a = context;
        this.f44220f = context.getPackageName() + "_preferences";
    }

    public final SharedPreferences.Editor a() {
        if (!this.f44219e) {
            return c().edit();
        }
        if (this.f44218d == null) {
            this.f44218d = c().edit();
        }
        return this.f44218d;
    }

    public final long b() {
        long j4;
        synchronized (this) {
            j4 = this.f44216b;
            this.f44216b = 1 + j4;
        }
        return j4;
    }

    public final SharedPreferences c() {
        if (this.f44217c == null) {
            this.f44217c = this.f44215a.getSharedPreferences(this.f44220f, 0);
        }
        return this.f44217c;
    }
}
