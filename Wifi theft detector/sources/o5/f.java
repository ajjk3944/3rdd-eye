package o5;

import java.net.URL;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f23663a;

    /* renamed from: b, reason: collision with root package name */
    public final URL f23664b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23665c;

    public f(String str, URL url, String str2) {
        this.f23663a = str;
        this.f23664b = url;
        this.f23665c = str2;
    }

    public static f a(String str, URL url, String str2) {
        t5.g.e(str, "VendorKey is null or empty");
        t5.g.c(url, "ResourceURL is null");
        t5.g.e(str2, "VerificationParameters is null or empty");
        return new f(str, url, str2);
    }

    public static f b(URL url) {
        t5.g.c(url, "ResourceURL is null");
        return new f(null, url, null);
    }

    public URL c() {
        return this.f23664b;
    }

    public String d() {
        return this.f23663a;
    }

    public String e() {
        return this.f23665c;
    }

    public JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        t5.c.h(jSONObject, "vendorKey", this.f23663a);
        t5.c.h(jSONObject, "resourceUrl", this.f23664b.toString());
        t5.c.h(jSONObject, "verificationParameters", this.f23665c);
        return jSONObject;
    }
}
