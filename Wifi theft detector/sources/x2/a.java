package x2;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import t2.b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f24874a = 10;

    /* renamed from: b, reason: collision with root package name */
    public static int f24875b = 10;

    /* renamed from: c, reason: collision with root package name */
    public static int f24876c = 10;

    /* renamed from: d, reason: collision with root package name */
    public static int f24877d = 10;

    /* renamed from: e, reason: collision with root package name */
    public static b f24878e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f24879f = false;

    /* renamed from: g, reason: collision with root package name */
    public static int f24880g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static int f24881h = 8192;

    public static int a() {
        return f24877d;
    }

    public static int b() {
        return f24876c;
    }

    public static void c() {
        b bVar = f24878e;
        if (bVar != null) {
            bVar.dg();
        }
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            f24879f = jSONObject.optInt("check_moov", 0) == 1;
            f24880g = jSONObject.optInt("new_media_source", 1);
            f24881h = jSONObject.optInt("read_buffer_size_k", 8) * 1024;
        } catch (JSONException unused) {
        }
    }

    public static void e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            f24874a = jSONObject.optInt("splash", 10);
            f24875b = jSONObject.optInt("reward", 10);
            f24876c = jSONObject.optInt("brand", 10);
            int iOptInt = jSONObject.optInt("other", 10);
            f24877d = iOptInt;
            if (f24874a < 0) {
                f24874a = 10;
            }
            if (f24875b < 0) {
                f24875b = 10;
            }
            if (f24876c < 0) {
                f24876c = 10;
            }
            if (iOptInt < 0) {
                f24877d = 10;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void f(b bVar) {
        f24878e = bVar;
    }

    public static int g() {
        return f24881h;
    }

    public static int h() {
        return f24875b;
    }

    public static int i() {
        return f24880g;
    }

    public static int j() {
        return f24874a;
    }

    public static boolean k(String str) {
        return f24879f && str != null && str.endsWith(".mp4");
    }
}
