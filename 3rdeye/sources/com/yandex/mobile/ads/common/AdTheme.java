package com.yandex.mobile.ads.common;

import com.google.gson.internal.c;
import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AdTheme {
    public static final AdTheme DARK;
    public static final AdTheme LIGHT;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AdTheme[] f23991c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4463a f23992d;

    /* renamed from: b, reason: collision with root package name */
    private final String f23993b;

    static {
        AdTheme adTheme = new AdTheme(0, "LIGHT", "light");
        LIGHT = adTheme;
        AdTheme adTheme2 = new AdTheme(1, "DARK", "dark");
        DARK = adTheme2;
        AdTheme[] adThemeArr = {adTheme, adTheme2};
        f23991c = adThemeArr;
        f23992d = c.l(adThemeArr);
    }

    private AdTheme(int i, String str, String str2) {
        this.f23993b = str2;
    }

    public static InterfaceC4463a<AdTheme> getEntries() {
        return f23992d;
    }

    public static AdTheme valueOf(String str) {
        return (AdTheme) Enum.valueOf(AdTheme.class, str);
    }

    public static AdTheme[] values() {
        return (AdTheme[]) f23991c.clone();
    }

    public final String getValue() {
        return this.f23993b;
    }
}
