package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static final String f15193c = "e";

    /* renamed from: d, reason: collision with root package name */
    public static String f15194d = "h";

    /* renamed from: e, reason: collision with root package name */
    public static String f15195e = "i";

    /* renamed from: f, reason: collision with root package name */
    public static String f15196f = "coppa";

    /* renamed from: g, reason: collision with root package name */
    public static String f15197g = "d";

    /* renamed from: h, reason: collision with root package name */
    public static String f15198h = "e";

    /* renamed from: i, reason: collision with root package name */
    public static String f15199i = "a";

    /* renamed from: j, reason: collision with root package name */
    public static String f15200j = "f";

    /* renamed from: k, reason: collision with root package name */
    public static String f15201k = "g";

    /* renamed from: a, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.foundation.same.net.model.a> f15202a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f15203b = new LinkedHashMap();

    public void a(String str, String str2) {
        if (str2 == null) {
            q0.b(f15193c, "add() value is null!");
        }
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.f15203b.put(str, str2);
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : this.f15203b.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), C.UTF8_NAME));
                sb.append("=");
                sb.append(URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return sb.toString();
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f15203b.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry.getKey(), C.UTF8_NAME), URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.model.a> entry2 : this.f15202a.entrySet()) {
                jSONObject.put(URLEncoder.encode(entry2.getKey(), C.UTF8_NAME), URLEncoder.encode("FILE_NAME_" + entry2.getValue().d().getName(), C.UTF8_NAME));
            }
        } catch (UnsupportedEncodingException unused) {
        } catch (JSONException e10) {
            q0.b(f15193c, e10.getMessage());
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(28);
        try {
            for (Map.Entry<String, String> entry : this.f15203b.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), C.UTF8_NAME));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            }
            for (Map.Entry<String, com.mbridge.msdk.foundation.same.net.model.a> entry2 : this.f15202a.entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry2.getKey(), C.UTF8_NAME));
                sb.append('=');
                sb.append(URLEncoder.encode("FILE_NAME_" + entry2.getValue().d().getName(), C.UTF8_NAME));
            }
        } catch (UnsupportedEncodingException e10) {
            q0.b(f15193c, e10.getMessage());
        }
        return sb.toString();
    }

    public Map<String, String> a() {
        return this.f15203b;
    }

    public void a(String str) {
        this.f15203b.remove(str);
        this.f15202a.remove(str);
    }
}
