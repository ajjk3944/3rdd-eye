package A2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f157a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences.Editor f158b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f159c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f160d = new Object();

    public E(Context context) {
        this.f159c = context;
    }

    public final String a(String str) {
        String string;
        h();
        synchronized (this.f160d) {
            string = this.f157a.getString(str, null);
            this.f158b.remove(str).commit();
        }
        return string;
    }

    public final void b(int i, int i3, String str) {
        String str2 = Build.MODEL;
        h();
        synchronized (this.f160d) {
            this.f158b.putString("pn", str).putInt("vc", i).putString("dm", str2).putInt("aav", i3).commit();
        }
    }

    public final int c() {
        int i;
        h();
        synchronized (this.f160d) {
            i = this.f157a.getInt("vc", -1);
        }
        return i;
    }

    public final String d() {
        String string;
        h();
        synchronized (this.f160d) {
            string = this.f157a.getString("dm", null);
        }
        return string;
    }

    public final int e() {
        int i;
        h();
        synchronized (this.f160d) {
            i = this.f157a.getInt("aav", -1);
        }
        return i;
    }

    public final void f() {
        h();
        synchronized (this.f160d) {
            this.f158b.clear().commit();
        }
    }

    public final HashMap g() {
        HashMap map;
        h();
        synchronized (this.f160d) {
            try {
                Map<String, ?> all = this.f157a.getAll();
                map = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public final void h() {
        synchronized (this.f160d) {
            try {
                if (this.f157a != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f159c.getSharedPreferences("query_info_shared_prefs", 0);
                this.f157a = sharedPreferences;
                this.f158b = sharedPreferences.edit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
