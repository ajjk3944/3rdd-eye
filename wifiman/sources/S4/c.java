package S4;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.A;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class c implements l {

    /* renamed from: a, reason: collision with root package name */
    private final String f20247a;

    /* renamed from: b, reason: collision with root package name */
    private final P4.b f20248b;

    /* renamed from: c, reason: collision with root package name */
    private final I4.g f20249c;

    public c(String str, P4.b bVar) {
        this(str, bVar, I4.g.f());
    }

    private P4.a b(P4.a aVar, k kVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f20276a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", A.n());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f20277b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f20278c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f20279d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f20280e.a().c());
        return aVar;
    }

    private void c(P4.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f20249c.l("Failed to parse settings JSON from " + this.f20247a, e10);
            this.f20249c.k("Settings response " + str);
            return null;
        }
    }

    private Map f(k kVar) {
        HashMap map = new HashMap();
        map.put("build_version", kVar.f20283h);
        map.put("display_version", kVar.f20282g);
        map.put("source", Integer.toString(kVar.f20284i));
        String str = kVar.f20281f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // S4.l
    public JSONObject a(k kVar, boolean z10) {
        L4.f.d();
        if (!z10) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map mapF = f(kVar);
            P4.a aVarB = b(d(mapF), kVar);
            this.f20249c.b("Requesting settings from " + this.f20247a);
            this.f20249c.i("Settings query params were: " + mapF);
            return g(aVarB.c());
        } catch (IOException e10) {
            this.f20249c.e("Settings request failed.", e10);
            return null;
        }
    }

    protected P4.a d(Map map) {
        return this.f20248b.a(this.f20247a, map).d("User-Agent", "Crashlytics Android SDK/" + A.n()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(P4.c cVar) {
        int iB = cVar.b();
        this.f20249c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(cVar.a());
        }
        this.f20249c.d("Settings request failed; (status: " + iB + ") from " + this.f20247a);
        return null;
    }

    boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }

    c(String str, P4.b bVar, I4.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f20249c = gVar;
        this.f20248b = bVar;
        this.f20247a = str;
    }
}
