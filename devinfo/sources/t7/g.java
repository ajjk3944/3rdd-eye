package t7;

import android.text.TextUtils;
import java.util.ArrayList;
import je.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f34450a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f34451b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34452c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34453d;

    /* renamed from: e, reason: collision with root package name */
    public final String f34454e;

    /* renamed from: f, reason: collision with root package name */
    public final String f34455f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final String f34456h;

    /* renamed from: i, reason: collision with root package name */
    public final String f34457i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f34458k;

    public g(String str) {
        this.f34450a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f34451b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f34452c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f34453d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f34454e = jSONObject.optString("title");
        this.f34455f = jSONObject.optString("name");
        this.g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f34456h = jSONObject.optString("skuDetailsToken");
        this.f34457i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                arrayList.add(new f(jSONArrayOptJSONArray.getJSONObject(i4)));
            }
            this.j = arrayList;
        } else {
            this.j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f34451b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f34451b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                arrayList2.add(new d(jSONArrayOptJSONArray2.getJSONObject(i10)));
            }
            this.f34458k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f34458k = null;
        } else {
            arrayList2.add(new d(jSONObjectOptJSONObject));
            this.f34458k = arrayList2;
        }
    }

    public final d a() {
        ArrayList arrayList = this.f34458k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (d) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return TextUtils.equals(this.f34450a, ((g) obj).f34450a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34450a.hashCode();
    }

    public final String toString() {
        String string = this.f34451b.toString();
        String strValueOf = String.valueOf(this.j);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        u.B(sb2, this.f34450a, "', parsedJson=", string, ", productId='");
        sb2.append(this.f34452c);
        sb2.append("', productType='");
        sb2.append(this.f34453d);
        sb2.append("', title='");
        sb2.append(this.f34454e);
        sb2.append("', productDetailsToken='");
        return a0.g.p(sb2, this.f34456h, "', subscriptionOfferDetails=", strValueOf, "}");
    }
}
