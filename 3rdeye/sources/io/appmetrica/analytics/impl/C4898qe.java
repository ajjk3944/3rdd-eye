package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qe, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4898qe {
    public static final T9 a(C4898qe c4898qe, EnumC4532ca enumC4532ca) {
        int i;
        c4898qe.getClass();
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
        return t92;
    }
}
