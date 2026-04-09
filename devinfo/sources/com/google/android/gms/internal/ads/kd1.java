package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kd1 {

    /* renamed from: b, reason: collision with root package name */
    public static final kd1 f13140b = new kd1();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13141a = new HashMap();

    public final synchronized void a(String str, s91 s91Var) {
        try {
            HashMap map = this.f13141a;
            if (!map.containsKey(str)) {
                map.put(str, s91Var);
                return;
            }
            if (((s91) map.get(str)).equals(s91Var)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(s91Var);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb2.append("Parameters object with name ");
            sb2.append(str);
            sb2.append(" already exists (");
            sb2.append(strValueOf);
            sb2.append("), cannot insert ");
            sb2.append(strValueOf2);
            throw new GeneralSecurityException(sb2.toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (s91) entry.getValue());
        }
    }
}
