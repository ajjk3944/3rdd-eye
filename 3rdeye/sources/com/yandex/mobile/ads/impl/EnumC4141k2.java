package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.k2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC4141k2 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4141k2 f29470b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC4141k2 f29471c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC4141k2 f29472d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC4141k2 f29473e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC4141k2 f29474f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC4141k2 f29475g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC4141k2 f29476h;
    public static final EnumC4141k2 i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC4141k2[] f29477j;

    static {
        EnumC4141k2 enumC4141k2 = new EnumC4141k2(0, "INITIAL");
        f29470b = enumC4141k2;
        EnumC4141k2 enumC4141k22 = new EnumC4141k2(1, "PREPARING");
        f29471c = enumC4141k22;
        EnumC4141k2 enumC4141k23 = new EnumC4141k2(2, "PREPARED");
        f29472d = enumC4141k23;
        EnumC4141k2 enumC4141k24 = new EnumC4141k2(3, "FINISHED");
        f29473e = enumC4141k24;
        EnumC4141k2 enumC4141k25 = new EnumC4141k2(4, "UNKNOWN");
        f29474f = enumC4141k25;
        EnumC4141k2 enumC4141k26 = new EnumC4141k2(5, "ERROR");
        f29475g = enumC4141k26;
        EnumC4141k2 enumC4141k27 = new EnumC4141k2(6, "PAUSED");
        f29476h = enumC4141k27;
        EnumC4141k2 enumC4141k28 = new EnumC4141k2(7, "PLAYING");
        i = enumC4141k28;
        EnumC4141k2[] enumC4141k2Arr = {enumC4141k2, enumC4141k22, enumC4141k23, enumC4141k24, enumC4141k25, enumC4141k26, enumC4141k27, enumC4141k28};
        f29477j = enumC4141k2Arr;
        com.google.gson.internal.c.l(enumC4141k2Arr);
    }

    private EnumC4141k2(int i10, String str) {
    }

    public static EnumC4141k2 valueOf(String str) {
        return (EnumC4141k2) Enum.valueOf(EnumC4141k2.class, str);
    }

    public static EnumC4141k2[] values() {
        return (EnumC4141k2[]) f29477j.clone();
    }
}
