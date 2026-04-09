package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.w1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC4223w1 {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumC4223w1[] f34769b;

    static {
        EnumC4223w1[] enumC4223w1Arr = {new EnumC4223w1(0, "TCP"), new EnumC4223w1(1, "HTTP")};
        f34769b = enumC4223w1Arr;
        com.google.gson.internal.c.l(enumC4223w1Arr);
    }

    private EnumC4223w1(int i, String str) {
    }

    public static EnumC4223w1 valueOf(String str) {
        return (EnumC4223w1) Enum.valueOf(EnumC4223w1.class, str);
    }

    public static EnumC4223w1[] values() {
        return (EnumC4223w1[]) f34769b.clone();
    }
}
