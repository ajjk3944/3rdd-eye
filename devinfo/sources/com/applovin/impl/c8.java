package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class c8 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private Uri f3825a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f3826b;

    /* renamed from: c, reason: collision with root package name */
    private a f3827c;

    /* renamed from: d, reason: collision with root package name */
    private String f3828d;

    /* renamed from: e, reason: collision with root package name */
    private int f3829e;

    /* renamed from: f, reason: collision with root package name */
    private int f3830f;
    private long g;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum a {
        Progressive,
        Streaming
    }

    private c8() {
    }

    public static c8 a(p8 p8Var, com.applovin.impl.sdk.k kVar) {
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = p8Var.d();
            if (!URLUtil.isValidUrl(strD)) {
                kVar.O();
                if (!com.applovin.impl.sdk.o.a()) {
                    return null;
                }
                kVar.O().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri uri = Uri.parse(strD);
            c8 c8Var = new c8();
            c8Var.f3825a = uri;
            c8Var.f3826b = uri;
            c8Var.g = a(p8Var);
            c8Var.f3827c = a((String) p8Var.a().get("delivery"));
            c8Var.f3830f = StringUtils.parseInt((String) p8Var.a().get("height"));
            c8Var.f3829e = StringUtils.parseInt((String) p8Var.a().get("width"));
            c8Var.f3828d = ((String) p8Var.a().get("type")).toLowerCase(Locale.ENGLISH);
            return c8Var;
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastVideoFile", "Error occurred while initializing", th2);
            }
            kVar.D().a("VastVideoFile", th2);
            return null;
        }
    }

    public long b() {
        return this.g;
    }

    public String c() {
        return this.f3828d;
    }

    public Uri d() {
        return this.f3825a;
    }

    public Uri e() {
        return this.f3826b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        if (this.f3829e != c8Var.f3829e || this.f3830f != c8Var.f3830f || this.g != c8Var.g) {
            return false;
        }
        Uri uri = this.f3825a;
        if (uri == null ? c8Var.f3825a != null : !uri.equals(c8Var.f3825a)) {
            return false;
        }
        Uri uri2 = this.f3826b;
        if (uri2 == null ? c8Var.f3826b != null : !uri2.equals(c8Var.f3826b)) {
            return false;
        }
        if (this.f3827c != c8Var.f3827c) {
            return false;
        }
        String str = this.f3828d;
        String str2 = c8Var.f3828d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f3825a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f3826b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f3827c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f3828d;
        return Long.valueOf(this.g).hashCode() + ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f3829e) * 31) + this.f3830f) * 31);
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f3825a + ", videoUri=" + this.f3826b + ", deliveryType=" + this.f3827c + ", fileType='" + this.f3828d + "', width=" + this.f3829e + ", height=" + this.f3830f + ", bitrate=" + this.g + '}';
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    private static long a(p8 p8Var) {
        Map mapA = p8Var.a();
        long j = StringUtils.parseLong((String) mapA.get("bitrate"), 0L);
        if (j != 0) {
            return j;
        }
        return (StringUtils.parseLong((String) mapA.get("maxBitrate"), 0L) + StringUtils.parseLong((String) mapA.get("minBitrate"), 0L)) / 2;
    }

    public void a(Uri uri) {
        this.f3826b = uri;
    }

    public static c8 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri uri = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        Uri uri2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a aVarValueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i4 = JsonUtils.getInt(jSONObject, "width", 0);
        int i10 = JsonUtils.getInt(jSONObject, "height", 0);
        int i11 = JsonUtils.getInt(jSONObject, "bitrate", 0);
        c8 c8Var = new c8();
        c8Var.f3825a = uri;
        c8Var.f3826b = uri2;
        c8Var.f3827c = aVarValueOf;
        c8Var.f3828d = string2;
        c8Var.f3829e = i4;
        c8Var.f3830f = i10;
        c8Var.g = i11;
        return c8Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f3825a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.f3826b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.f3827c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.f3828d);
        JsonUtils.putInt(jSONObject, "width", this.f3829e);
        JsonUtils.putInt(jSONObject, "height", this.f3830f);
        JsonUtils.putLong(jSONObject, "bitrate", this.g);
        return jSONObject;
    }
}
