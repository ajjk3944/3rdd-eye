package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2074wb implements InterfaceC0466Db {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f17448a = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f17449b = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    public final void e(Object obj, Map map) throws NumberFormatException {
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
        String str = (String) map.get("action");
        boolean zEquals = "tick".equals(str);
        Pattern pattern = f17448a;
        if (!zEquals) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    u2.k.h("No value given for CSI experiment.");
                    return;
                }
                if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8856x2)).booleanValue() || f17449b.matcher(str2).matches()) {
                    ((L9) interfaceC0828Yg.l().f13151c).c("e", str2);
                    return;
                } else {
                    u2.k.c("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                    return;
                }
            }
            if ("extra".equals(str)) {
                String str3 = (String) map.get("name");
                String str4 = (String) map.get("value");
                if (TextUtils.isEmpty(str4)) {
                    u2.k.h("No value given for CSI extra.");
                    return;
                }
                if (TextUtils.isEmpty(str3)) {
                    u2.k.h("No name given for CSI extra.");
                    return;
                }
                if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8856x2)).booleanValue() || pattern.matcher(str3).matches()) {
                    ((L9) interfaceC0828Yg.l().f13151c).c(str3, str4);
                    return;
                } else {
                    u2.k.c("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str5)) {
            u2.k.h("No label given for CSI tick.");
            return;
        }
        E9 e9 = H9.f8856x2;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && !pattern.matcher(str5).matches()) {
            u2.k.c("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            u2.k.h("No timestamp given for CSI tick.");
            return;
        }
        try {
            long j6 = Long.parseLong(str7);
            p2.j jVar = p2.j.f22785C;
            jVar.f22797k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            jVar.f22797k.getClass();
            long jElapsedRealtime = (j6 - jCurrentTimeMillis) + SystemClock.elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && !pattern.matcher(str6).matches()) {
                u2.k.c("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            C0889ae c0889aeL = interfaceC0828Yg.l();
            HashMap map2 = (HashMap) c0889aeL.f13150b;
            J9 j9 = (J9) map2.get(str6);
            String[] strArr = {str5};
            if (j9 != null) {
                ((L9) c0889aeL.f13151c).a(j9, jElapsedRealtime, strArr);
            }
            map2.put(str5, new J9(jElapsedRealtime, null, null));
        } catch (NumberFormatException e6) {
            u2.k.i("Malformed timestamp for CSI tick.", e6);
        }
    }
}
