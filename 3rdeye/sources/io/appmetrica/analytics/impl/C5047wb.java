package io.appmetrica.analytics.impl;

import org.json.JSONObject;
import y9.C5819a;

/* renamed from: io.appmetrica.analytics.impl.wb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5047wb {
    public static final T9 a(C5047wb c5047wb, EnumC4532ca enumC4532ca, JSONObject jSONObject) {
        int i;
        c5047wb.getClass();
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
        t92.f40169b = jSONObject.toString().getBytes(C5819a.f48359b);
        return t92;
    }
}
