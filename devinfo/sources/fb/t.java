package fb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f23974a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences.Editor f23975b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f23976c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23977d = new Object();

    public t(Context context) {
        this.f23976c = context;
    }

    public final String a(String str) {
        String string;
        h();
        synchronized (this.f23977d) {
            string = this.f23974a.getString(str, null);
            this.f23975b.remove(str).commit();
        }
        return string;
    }

    public final void b(int i4, int i10, String str) {
        String str2 = Build.MODEL;
        h();
        synchronized (this.f23977d) {
            this.f23975b.putString("pn", str).putInt("vc", i4).putString("dm", str2).putInt("aav", i10).commit();
        }
    }

    public final int c() {
        int i4;
        h();
        synchronized (this.f23977d) {
            i4 = this.f23974a.getInt("vc", -1);
        }
        return i4;
    }

    public final String d() {
        String string;
        h();
        synchronized (this.f23977d) {
            string = this.f23974a.getString("dm", null);
        }
        return string;
    }

    public final int e() {
        int i4;
        h();
        synchronized (this.f23977d) {
            i4 = this.f23974a.getInt("aav", -1);
        }
        return i4;
    }

    public final void f() {
        h();
        synchronized (this.f23977d) {
            this.f23975b.clear().commit();
        }
    }

    public final HashMap g() {
        HashMap map;
        h();
        synchronized (this.f23977d) {
            try {
                Map<String, ?> all = this.f23974a.getAll();
                map = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    public final void h() {
        synchronized (this.f23977d) {
            try {
                if (this.f23974a != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f23976c.getSharedPreferences("query_info_shared_prefs", 0);
                this.f23974a = sharedPreferences;
                this.f23975b = sharedPreferences.edit();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
