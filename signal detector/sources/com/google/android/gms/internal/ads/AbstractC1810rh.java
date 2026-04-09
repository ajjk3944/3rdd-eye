package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1810rh {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f16596a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f16597b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f16596a.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(iEnd));
        } else {
            if (!f16597b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String b(Qt qt) throws JSONException {
        E9 e9 = H9.d6;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && qt.f10750T) {
            C1014cu c1014cu = qt.f10752V;
            c1014cu.getClass();
            if (((JSONObject) c1014cu.f13695b).optBoolean((String) c2841s.f23270c.a(H9.f6), true) && qt.f10759b != 4) {
                int i = c1014cu.h() == 1 ? 3 : 1;
                String str = qt.f10778l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", AbstractC1135f5.e(i));
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e6) {
                    u2.k.i("Unable to build OMID ENV JSON", e6);
                }
            }
        }
        return null;
    }
}
