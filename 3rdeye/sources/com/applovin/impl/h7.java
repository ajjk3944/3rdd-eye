package com.applovin.impl;

import N7.H7;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h7 implements d4 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f19506a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Set f19507b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private Uri f19508c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f19509d;

    /* renamed from: e, reason: collision with root package name */
    private int f19510e;

    /* renamed from: f, reason: collision with root package name */
    private int f19511f;

    public static h7 a(c8 c8Var, com.applovin.impl.sdk.k kVar) throws NumberFormatException {
        if (c8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        c8 c8VarC = c8Var.c("StaticResource");
        if (c8VarC == null || !URLUtil.isValidUrl(c8VarC.d())) {
            kVar.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            kVar.O().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        h7 h7Var = new h7();
        h7Var.f19508c = Uri.parse(c8VarC.d());
        c8 c8VarB = c8Var.b("IconClickThrough");
        if (c8VarB != null && URLUtil.isValidUrl(c8VarB.d())) {
            h7Var.f19509d = Uri.parse(c8VarB.d());
        }
        String str = (String) c8Var.a().get("width");
        int i = 0;
        int i10 = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = (String) c8Var.a().get("height");
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i = Integer.parseInt(str2);
        }
        int iIntValue = ((Integer) kVar.a(l4.f20063x4)).intValue();
        if (i10 <= 0 || i <= 0) {
            h7Var.f19511f = iIntValue;
            h7Var.f19510e = iIntValue;
            return h7Var;
        }
        double d10 = i10 / i;
        int iMin = Math.min(Math.max(i10, i), iIntValue);
        if (i10 >= i) {
            h7Var.f19510e = iMin;
            h7Var.f19511f = (int) (iMin / d10);
            return h7Var;
        }
        h7Var.f19511f = iMin;
        h7Var.f19510e = (int) (iMin * d10);
        return h7Var;
    }

    public Set b() {
        return this.f19506a;
    }

    public Uri c() {
        return this.f19509d;
    }

    public int d() {
        return this.f19511f;
    }

    public Uri e() {
        return this.f19508c;
    }

    public Set f() {
        return this.f19507b;
    }

    public int g() {
        return this.f19510e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + e() + "', clickUri='" + c() + "', width=" + g() + ", height=" + d() + "}";
    }

    public static ImageView a(Uri uri, Context context, com.applovin.impl.sdk.k kVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, kVar);
        return imageView;
    }

    public static h7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        l7 l7VarA;
        l7 l7VarA2;
        if (jSONObject == null) {
            return null;
        }
        h7 h7Var = new h7();
        String string = JsonUtils.getString(jSONObject, "image_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        h7Var.f19508c = Uri.parse(string);
        JSONArray jSONArrayQ = H7.q("click_trackers", jSONObject);
        for (int i = 0; i < jSONArrayQ.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayQ, i, (JSONObject) null);
            if (jSONObject2 != null && (l7VarA2 = l7.a(jSONObject2, kVar)) != null) {
                h7Var.f19506a.add(l7VarA2);
            }
        }
        JSONArray jSONArrayQ2 = H7.q("view_trackers", jSONObject);
        for (int i10 = 0; i10 < jSONArrayQ2.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayQ2, i10, (JSONObject) null);
            if (jSONObject3 != null && (l7VarA = l7.a(jSONObject3, kVar)) != null) {
                h7Var.f19507b.add(l7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "click_uri", null);
        h7Var.f19509d = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        h7Var.f19510e = JsonUtils.getInt(jSONObject, "width", 0);
        h7Var.f19511f = JsonUtils.getInt(jSONObject, "height", 0);
        return h7Var;
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f19506a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((l7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f19507b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((l7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        Uri uri = this.f19508c;
        JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        Uri uri2 = this.f19509d;
        JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        JsonUtils.putInt(jSONObject, "width", this.f19510e);
        JsonUtils.putInt(jSONObject, "height", this.f19511f);
        return jSONObject;
    }
}
