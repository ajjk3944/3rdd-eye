package com.applovin.impl;

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
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class u7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f5829a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Set f5830b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private Uri f5831c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f5832d;

    /* renamed from: e, reason: collision with root package name */
    private int f5833e;

    /* renamed from: f, reason: collision with root package name */
    private int f5834f;

    public static u7 a(p8 p8Var, com.applovin.impl.sdk.k kVar) throws NumberFormatException {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        p8 p8VarC = p8Var.c("StaticResource");
        if (p8VarC == null || !URLUtil.isValidUrl(p8VarC.d())) {
            kVar.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            kVar.O().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        u7 u7Var = new u7();
        u7Var.f5831c = Uri.parse(p8VarC.d());
        p8 p8VarB = p8Var.b("IconClickThrough");
        if (p8VarB != null && URLUtil.isValidUrl(p8VarB.d())) {
            u7Var.f5832d = Uri.parse(p8VarB.d());
        }
        String str = (String) p8Var.a().get("width");
        int i4 = 0;
        int i10 = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = (String) p8Var.a().get("height");
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i4 = Integer.parseInt(str2);
        }
        int iIntValue = ((Integer) kVar.a(x4.W4)).intValue();
        if (i10 <= 0 || i4 <= 0) {
            u7Var.f5834f = iIntValue;
            u7Var.f5833e = iIntValue;
            return u7Var;
        }
        double d10 = i10 / i4;
        int iMin = Math.min(Math.max(i10, i4), iIntValue);
        if (i10 >= i4) {
            u7Var.f5833e = iMin;
            u7Var.f5834f = (int) (iMin / d10);
            return u7Var;
        }
        u7Var.f5834f = iMin;
        u7Var.f5833e = (int) (iMin * d10);
        return u7Var;
    }

    public Set b() {
        return this.f5829a;
    }

    public Uri c() {
        return this.f5832d;
    }

    public int d() {
        return this.f5834f;
    }

    public Uri e() {
        return this.f5831c;
    }

    public Set f() {
        return this.f5830b;
    }

    public int g() {
        return this.f5833e;
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

    public static u7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        y7 y7VarA;
        y7 y7VarA2;
        if (jSONObject == null) {
            return null;
        }
        u7 u7Var = new u7();
        String string = JsonUtils.getString(jSONObject, "image_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        u7Var.f5831c = Uri.parse(string);
        JSONArray jSONArrayS = a0.g.s("click_trackers", jSONObject);
        for (int i4 = 0; i4 < jSONArrayS.length(); i4++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayS, i4, (JSONObject) null);
            if (jSONObject2 != null && (y7VarA2 = y7.a(jSONObject2, kVar)) != null) {
                u7Var.f5829a.add(y7VarA2);
            }
        }
        JSONArray jSONArrayS2 = a0.g.s("view_trackers", jSONObject);
        for (int i10 = 0; i10 < jSONArrayS2.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayS2, i10, (JSONObject) null);
            if (jSONObject3 != null && (y7VarA = y7.a(jSONObject3, kVar)) != null) {
                u7Var.f5830b.add(y7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "click_uri", null);
        u7Var.f5832d = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        u7Var.f5833e = JsonUtils.getInt(jSONObject, "width", 0);
        u7Var.f5834f = JsonUtils.getInt(jSONObject, "height", 0);
        return u7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f5829a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((y7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f5830b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((y7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        Uri uri = this.f5831c;
        JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        Uri uri2 = this.f5832d;
        JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        JsonUtils.putInt(jSONObject, "width", this.f5833e);
        JsonUtils.putInt(jSONObject, "height", this.f5834f);
        return jSONObject;
    }
}
