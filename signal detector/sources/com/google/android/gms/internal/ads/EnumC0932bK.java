package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.android.gms.internal.ads.bK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0932bK {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0932bK f13344a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0932bK f13345b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0932bK f13346c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0932bK[] f13347d;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0932bK EF0;

    static {
        EnumC0932bK enumC0932bK = new EnumC0932bK("SHA1", 0);
        EnumC0932bK enumC0932bK2 = new EnumC0932bK("SHA224", 1);
        EnumC0932bK enumC0932bK3 = new EnumC0932bK("SHA256", 2);
        f13344a = enumC0932bK3;
        EnumC0932bK enumC0932bK4 = new EnumC0932bK("SHA384", 3);
        f13345b = enumC0932bK4;
        EnumC0932bK enumC0932bK5 = new EnumC0932bK("SHA512", 4);
        f13346c = enumC0932bK5;
        f13347d = new EnumC0932bK[]{enumC0932bK, enumC0932bK2, enumC0932bK3, enumC0932bK4, enumC0932bK5};
    }

    public static EnumC0932bK[] values() {
        return (EnumC0932bK[]) f13347d.clone();
    }
}
