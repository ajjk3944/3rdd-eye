package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.v4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC4219v4 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC4219v4 f34335b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC4219v4 f34336c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC4219v4 f34337d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC4219v4 f34338e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC4219v4 f34339f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC4219v4[] f34340g;

    static {
        EnumC4219v4 enumC4219v4 = new EnumC4219v4(0, "CANCELLED");
        f34335b = enumC4219v4;
        EnumC4219v4 enumC4219v42 = new EnumC4219v4(1, "NOT_STARTED");
        f34336c = enumC4219v42;
        EnumC4219v4 enumC4219v43 = new EnumC4219v4(2, "LOADING");
        f34337d = enumC4219v43;
        EnumC4219v4 enumC4219v44 = new EnumC4219v4(3, "SUCCESSFULLY_LOADED");
        f34338e = enumC4219v44;
        EnumC4219v4 enumC4219v45 = new EnumC4219v4(4, "ERRONEOUSLY_LOADED");
        f34339f = enumC4219v45;
        EnumC4219v4[] enumC4219v4Arr = {enumC4219v4, enumC4219v42, enumC4219v43, enumC4219v44, enumC4219v45};
        f34340g = enumC4219v4Arr;
        com.google.gson.internal.c.l(enumC4219v4Arr);
    }

    private EnumC4219v4(int i, String str) {
    }

    public static EnumC4219v4 valueOf(String str) {
        return (EnumC4219v4) Enum.valueOf(EnumC4219v4.class, str);
    }

    public static EnumC4219v4[] values() {
        return (EnumC4219v4[]) f34340g.clone();
    }
}
