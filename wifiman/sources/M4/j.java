package M4;

import N4.F;
import org.conscrypt.PSKKeyManager;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Z4.a f12536a = new b5.d().j(a.f12487a).i();

    static j a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static j b(String str, String str2, String str3, String str4, long j10) {
        return new b(str, str2, i(str3), str4, j10);
    }

    private static String i(String str) {
        return str.length() > 256 ? str.substring(0, PSKKeyManager.MAX_KEY_LENGTH_BYTES) : str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public F.e.d.AbstractC0580e h() {
        return F.e.d.AbstractC0580e.a().d(F.e.d.AbstractC0580e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
