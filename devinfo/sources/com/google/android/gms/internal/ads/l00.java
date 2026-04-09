package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class l00 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f13313a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f13314b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        Matcher matcher = f13313a.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb2.append(str.substring(0, iEnd));
            String str3 = strArr[0];
            if (str3 != null) {
                sb2.append(str3);
            }
            sb2.append(str.substring(iEnd));
        } else {
            if (!f13314b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb2.append(str2);
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static String b(wp0 wp0Var) throws JSONException {
        pk pkVar = sk.f16090d6;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && wp0Var.T) {
            iq0 iq0Var = wp0Var.V;
            iq0Var.getClass();
            if (iq0Var.f12420a.optBoolean((String) sVar.f36166c.a(sk.f16122f6), true) && wp0Var.f18074b != 4) {
                int i4 = iq0Var.a() == 1 ? 3 : 1;
                String str = wp0Var.f18093l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", d7.h(i4));
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e2) {
                    za.i.i("Unable to build OMID ENV JSON", e2);
                }
            }
        }
        return null;
    }
}
