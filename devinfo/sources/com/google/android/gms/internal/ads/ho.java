package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ho implements oo {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f11930a = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f11931b = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.oo
    public final void k(Object obj, Map map) throws NumberFormatException {
        qz qzVar = (qz) obj;
        String str = (String) map.get("action");
        boolean zEquals = "tick".equals(str);
        Pattern pattern = f11930a;
        if (!zEquals) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    za.i.h("No value given for CSI experiment.");
                    return;
                }
                if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16396x2)).booleanValue() || f11931b.matcher(str2).matches()) {
                    ((vk) qzVar.E1().f15754c).c("e", str2);
                    return;
                } else {
                    za.i.c("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                    return;
                }
            }
            if ("extra".equals(str)) {
                String str3 = (String) map.get("name");
                String str4 = (String) map.get("value");
                if (TextUtils.isEmpty(str4)) {
                    za.i.h("No value given for CSI extra.");
                    return;
                }
                if (TextUtils.isEmpty(str3)) {
                    za.i.h("No name given for CSI extra.");
                    return;
                }
                if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16396x2)).booleanValue() || pattern.matcher(str3).matches()) {
                    ((vk) qzVar.E1().f15754c).c(str3, str4);
                    return;
                } else {
                    za.i.c("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str5)) {
            za.i.h("No label given for CSI tick.");
            return;
        }
        pk pkVar = sk.f16396x2;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && !pattern.matcher(str5).matches()) {
            za.i.c("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            za.i.h("No timestamp given for CSI tick.");
            return;
        }
        try {
            long j = Long.parseLong(str7);
            ua.j jVar = ua.j.C;
            jVar.f35267k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            jVar.f35267k.getClass();
            long jElapsedRealtime = (j - jCurrentTimeMillis) + SystemClock.elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue() && !pattern.matcher(str6).matches()) {
                za.i.c("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            rt rtVarE1 = qzVar.E1();
            HashMap map2 = (HashMap) rtVarE1.f15753b;
            uk ukVar = (uk) map2.get(str6);
            String[] strArr = {str5};
            if (ukVar != null) {
                ((vk) rtVarE1.f15754c).a(ukVar, jElapsedRealtime, strArr);
            }
            map2.put(str5, new uk(jElapsedRealtime, null, null));
        } catch (NumberFormatException e2) {
            za.i.i("Malformed timestamp for CSI tick.", e2);
        }
    }
}
