package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p7 implements d4 {

    /* renamed from: a, reason: collision with root package name */
    private Uri f20680a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f20681b;

    /* renamed from: c, reason: collision with root package name */
    private a f20682c;

    /* renamed from: d, reason: collision with root package name */
    private String f20683d;

    /* renamed from: e, reason: collision with root package name */
    private int f20684e;

    /* renamed from: f, reason: collision with root package name */
    private int f20685f;

    /* renamed from: g, reason: collision with root package name */
    private long f20686g;

    public enum a {
        Progressive,
        Streaming
    }

    private p7() {
    }

    public static p7 a(c8 c8Var, com.applovin.impl.sdk.k kVar) {
        if (c8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = c8Var.d();
            if (!URLUtil.isValidUrl(strD)) {
                kVar.O();
                if (!com.applovin.impl.sdk.o.a()) {
                    return null;
                }
                kVar.O().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri uri = Uri.parse(strD);
            p7 p7Var = new p7();
            p7Var.f20680a = uri;
            p7Var.f20681b = uri;
            p7Var.f20686g = a(c8Var);
            p7Var.f20682c = a((String) c8Var.a().get("delivery"));
            p7Var.f20685f = StringUtils.parseInt((String) c8Var.a().get("height"));
            p7Var.f20684e = StringUtils.parseInt((String) c8Var.a().get("width"));
            p7Var.f20683d = ((String) c8Var.a().get("type")).toLowerCase(Locale.ENGLISH);
            return p7Var;
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastVideoFile", "Error occurred while initializing", th);
            }
            kVar.E().a("VastVideoFile", th);
            return null;
        }
    }

    public long b() {
        return this.f20686g;
    }

    public String c() {
        return this.f20683d;
    }

    public Uri d() {
        return this.f20680a;
    }

    public Uri e() {
        return this.f20681b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj;
        if (this.f20684e != p7Var.f20684e || this.f20685f != p7Var.f20685f || this.f20686g != p7Var.f20686g) {
            return false;
        }
        Uri uri = this.f20680a;
        if (uri == null ? p7Var.f20680a != null : !uri.equals(p7Var.f20680a)) {
            return false;
        }
        Uri uri2 = this.f20681b;
        if (uri2 == null ? p7Var.f20681b != null : !uri2.equals(p7Var.f20681b)) {
            return false;
        }
        if (this.f20682c != p7Var.f20682c) {
            return false;
        }
        String str = this.f20683d;
        String str2 = p7Var.f20683d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f20680a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f20681b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f20682c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f20683d;
        return Long.valueOf(this.f20686g).hashCode() + ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f20684e) * 31) + this.f20685f) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastVideoFile{sourceVideoUri=");
        sb.append(this.f20680a);
        sb.append(", videoUri=");
        sb.append(this.f20681b);
        sb.append(", deliveryType=");
        sb.append(this.f20682c);
        sb.append(", fileType='");
        sb.append(this.f20683d);
        sb.append("', width=");
        sb.append(this.f20684e);
        sb.append(", height=");
        sb.append(this.f20685f);
        sb.append(", bitrate=");
        return androidx.work.s.f(sb, this.f20686g, '}');
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

    private static long a(c8 c8Var) {
        Map mapA = c8Var.a();
        long j4 = StringUtils.parseLong((String) mapA.get("bitrate"), 0L);
        if (j4 != 0) {
            return j4;
        }
        return (StringUtils.parseLong((String) mapA.get("maxBitrate"), 0L) + StringUtils.parseLong((String) mapA.get("minBitrate"), 0L)) / 2;
    }

    public void a(Uri uri) {
        this.f20681b = uri;
    }

    public static p7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
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
        int i = JsonUtils.getInt(jSONObject, "width", 0);
        int i10 = JsonUtils.getInt(jSONObject, "height", 0);
        int i11 = JsonUtils.getInt(jSONObject, "bitrate", 0);
        p7 p7Var = new p7();
        p7Var.f20680a = uri;
        p7Var.f20681b = uri2;
        p7Var.f20682c = aVarValueOf;
        p7Var.f20683d = string2;
        p7Var.f20684e = i;
        p7Var.f20685f = i10;
        p7Var.f20686g = i11;
        return p7Var;
    }

    @Override // com.applovin.impl.d4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f20680a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.f20681b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.f20682c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.f20683d);
        JsonUtils.putInt(jSONObject, "width", this.f20684e);
        JsonUtils.putInt(jSONObject, "height", this.f20685f);
        JsonUtils.putLong(jSONObject, "bitrate", this.f20686g);
        return jSONObject;
    }
}
