package i6;

import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f21618a;

    /* renamed from: b, reason: collision with root package name */
    public final URL f21619b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21620c;

    public g(String str, URL url, String str2) {
        this.f21618a = str;
        this.f21619b = url;
        this.f21620c = str2;
    }

    public static g a(String str, URL url, String str2) {
        n6.g.f(str, "VendorKey is null or empty");
        n6.g.d(url, "ResourceURL is null");
        n6.g.f(str2, "VerificationParameters is null or empty");
        return new g(str, url, str2);
    }

    public URL b() {
        return this.f21619b;
    }

    public String c() {
        return this.f21618a;
    }

    public String d() {
        return this.f21620c;
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        n6.c.h(jSONObject, "vendorKey", this.f21618a);
        n6.c.h(jSONObject, "resourceUrl", this.f21619b.toString());
        n6.c.h(jSONObject, "verificationParameters", this.f21620c);
        return jSONObject;
    }
}
