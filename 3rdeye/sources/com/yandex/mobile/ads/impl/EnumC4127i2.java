package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.i2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC4127i2 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4127i2 f28439b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC4127i2 f28440c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC4127i2 f28441d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC4127i2 f28442e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC4127i2[] f28443f;

    static {
        EnumC4127i2 enumC4127i2 = new EnumC4127i2(0, "PREROLL");
        f28439b = enumC4127i2;
        EnumC4127i2 enumC4127i22 = new EnumC4127i2(1, "MIDROLL");
        f28440c = enumC4127i22;
        EnumC4127i2 enumC4127i23 = new EnumC4127i2(2, "POSTROLL");
        f28441d = enumC4127i23;
        EnumC4127i2 enumC4127i24 = new EnumC4127i2(3, "STANDALONE");
        f28442e = enumC4127i24;
        EnumC4127i2[] enumC4127i2Arr = {enumC4127i2, enumC4127i22, enumC4127i23, enumC4127i24};
        f28443f = enumC4127i2Arr;
        com.google.gson.internal.c.l(enumC4127i2Arr);
    }

    private EnumC4127i2(int i, String str) {
    }

    public static EnumC4127i2 valueOf(String str) {
        return (EnumC4127i2) Enum.valueOf(EnumC4127i2.class, str);
    }

    public static EnumC4127i2[] values() {
        return (EnumC4127i2[]) f28443f.clone();
    }
}
