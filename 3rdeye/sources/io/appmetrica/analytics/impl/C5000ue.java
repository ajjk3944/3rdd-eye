package io.appmetrica.analytics.impl;

import java.lang.reflect.Field;
import org.json.JSONObject;
import y9.C5819a;

/* renamed from: io.appmetrica.analytics.impl.ue, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5000ue {
    public static final T9 a(C5000ue c5000ue, EnumC4532ca enumC4532ca, Object obj) throws SecurityException {
        int i;
        c5000ue.getClass();
        T9 t92 = new T9();
        switch (enumC4532ca) {
            case UNKNOWN:
                i = 0;
                break;
            case APPSFLYER:
                i = 1;
                break;
            case ADJUST:
                i = 2;
                break;
            case KOCHAVA:
                i = 3;
                break;
            case TENJIN:
                i = 4;
                break;
            case AIRBRIDGE:
                i = 5;
                break;
            case SINGULAR:
                i = 6;
                break;
            default:
                throw new b9.j();
        }
        t92.f40168a = i;
        C5025ve.f41856b.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Field field : obj.getClass().getFields()) {
            try {
                jSONObject.put(field.getName(), field.get(obj));
            } catch (Throwable unused) {
            }
        }
        t92.f40169b = jSONObject.toString().getBytes(C5819a.f48359b);
        return t92;
    }
}
