package t7;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f34461a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34462b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34463c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34464d;

    public j(String str) {
        this.f34461a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f34462b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f34463c = strOptString;
        this.f34464d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return TextUtils.equals(this.f34461a, ((j) obj).f34461a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34461a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f34462b);
        sb2.append("', productType='");
        sb2.append(this.f34463c);
        sb2.append("', statusCode=");
        return r5.c.j(this.f34464d, "}", sb2);
    }
}
