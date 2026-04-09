package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class XF {

    /* renamed from: b, reason: collision with root package name */
    public static final XF f12406b = new XF();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12407a = new HashMap();

    public final synchronized void a(String str, AbstractC1089eE abstractC1089eE) {
        try {
            HashMap map = this.f12407a;
            if (!map.containsKey(str)) {
                map.put(str, abstractC1089eE);
                return;
            }
            if (((AbstractC1089eE) map.get(str)).equals(abstractC1089eE)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(abstractC1089eE);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb.append("Parameters object with name ");
            sb.append(str);
            sb.append(" already exists (");
            sb.append(strValueOf);
            sb.append("), cannot insert ");
            sb.append(strValueOf2);
            throw new GeneralSecurityException(sb.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (AbstractC1089eE) entry.getValue());
        }
    }
}
