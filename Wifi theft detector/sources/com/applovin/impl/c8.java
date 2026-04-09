package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c8 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private Uri f5661a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f5662b;

    /* renamed from: c, reason: collision with root package name */
    private a f5663c;

    /* renamed from: d, reason: collision with root package name */
    private String f5664d;

    /* renamed from: e, reason: collision with root package name */
    private int f5665e;

    /* renamed from: f, reason: collision with root package name */
    private int f5666f;

    /* renamed from: g, reason: collision with root package name */
    private long f5667g;

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
            c8Var.f5661a = uri;
            c8Var.f5662b = uri;
            c8Var.f5667g = a(p8Var);
            c8Var.f5663c = a((String) p8Var.a().get("delivery"));
            c8Var.f5666f = StringUtils.parseInt((String) p8Var.a().get("height"));
            c8Var.f5665e = StringUtils.parseInt((String) p8Var.a().get("width"));
            c8Var.f5664d = ((String) p8Var.a().get(HandleInvocationsFromAdViewer.KEY_AD_TYPE)).toLowerCase(Locale.ENGLISH);
            return c8Var;
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastVideoFile", "Error occurred while initializing", th);
            }
            kVar.D().a("VastVideoFile", th);
            return null;
        }
    }

    public long b() {
        return this.f5667g;
    }

    public String c() {
        return this.f5664d;
    }

    public Uri d() {
        return this.f5661a;
    }

    public Uri e() {
        return this.f5662b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        if (this.f5665e != c8Var.f5665e || this.f5666f != c8Var.f5666f || this.f5667g != c8Var.f5667g) {
            return false;
        }
        Uri uri = this.f5661a;
        if (uri == null ? c8Var.f5661a != null : !uri.equals(c8Var.f5661a)) {
            return false;
        }
        Uri uri2 = this.f5662b;
        if (uri2 == null ? c8Var.f5662b != null : !uri2.equals(c8Var.f5662b)) {
            return false;
        }
        if (this.f5663c != c8Var.f5663c) {
            return false;
        }
        String str = this.f5664d;
        String str2 = c8Var.f5664d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f5661a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f5662b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f5663c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f5664d;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f5665e) * 31) + this.f5666f) * 31) + Long.valueOf(this.f5667g).hashCode();
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f5661a + ", videoUri=" + this.f5662b + ", deliveryType=" + this.f5663c + ", fileType='" + this.f5664d + "', width=" + this.f5665e + ", height=" + this.f5666f + ", bitrate=" + this.f5667g + '}';
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
        long j10 = StringUtils.parseLong((String) mapA.get("bitrate"), 0L);
        return j10 != 0 ? j10 : (StringUtils.parseLong((String) mapA.get("minBitrate"), 0L) + StringUtils.parseLong((String) mapA.get("maxBitrate"), 0L)) / 2;
    }

    public void a(Uri uri) {
        this.f5662b = uri;
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
        int i10 = JsonUtils.getInt(jSONObject, "width", 0);
        int i11 = JsonUtils.getInt(jSONObject, "height", 0);
        int i12 = JsonUtils.getInt(jSONObject, "bitrate", 0);
        c8 c8Var = new c8();
        c8Var.f5661a = uri;
        c8Var.f5662b = uri2;
        c8Var.f5663c = aVarValueOf;
        c8Var.f5664d = string2;
        c8Var.f5665e = i10;
        c8Var.f5666f = i11;
        c8Var.f5667g = i12;
        return c8Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f5661a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.f5662b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.f5663c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.f5664d);
        JsonUtils.putInt(jSONObject, "width", this.f5665e);
        JsonUtils.putInt(jSONObject, "height", this.f5666f);
        JsonUtils.putLong(jSONObject, "bitrate", this.f5667g);
        return jSONObject;
    }
}
