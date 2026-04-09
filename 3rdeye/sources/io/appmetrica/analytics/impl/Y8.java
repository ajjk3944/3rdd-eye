package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public enum Y8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f40413a;

    Y8(int i) {
        this.f40413a = i;
    }

    public static Y8 a(Integer num) {
        if (num != null) {
            for (Y8 y82 : values()) {
                if (y82.f40413a == num.intValue()) {
                    return y82;
                }
            }
        }
        return NONE;
    }
}
