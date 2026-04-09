package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC5046wa {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f41966a;

    EnumC5046wa(int i) {
        this.f41966a = i;
    }

    public static EnumC5046wa a(Integer num) {
        if (num != null) {
            for (EnumC5046wa enumC5046wa : values()) {
                if (enumC5046wa.f41966a == num.intValue()) {
                    return enumC5046wa;
                }
            }
        }
        return UNKNOWN;
    }
}
