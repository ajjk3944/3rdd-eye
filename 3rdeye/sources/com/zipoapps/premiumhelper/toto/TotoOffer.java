package com.zipoapps.premiumhelper.toto;

import com.google.gson.internal.c;
import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TotoOffer.kt */
/* loaded from: classes3.dex */
public final class TotoOffer {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ TotoOffer[] $VALUES;
    private final String value;
    public static final TotoOffer Onboarding = new TotoOffer("Onboarding", 0, "onboarding");
    public static final TotoOffer Fallback = new TotoOffer("Fallback", 1, "fallback");
    public static final TotoOffer Relaunch = new TotoOffer("Relaunch", 2, "relaunch");

    private static final /* synthetic */ TotoOffer[] $values() {
        return new TotoOffer[]{Onboarding, Fallback, Relaunch};
    }

    static {
        TotoOffer[] totoOfferArr$values = $values();
        $VALUES = totoOfferArr$values;
        $ENTRIES = c.l(totoOfferArr$values);
    }

    private TotoOffer(String str, int i, String str2) {
        this.value = str2;
    }

    public static InterfaceC4463a<TotoOffer> getEntries() {
        return $ENTRIES;
    }

    public static TotoOffer valueOf(String str) {
        return (TotoOffer) Enum.valueOf(TotoOffer.class, str);
    }

    public static TotoOffer[] values() {
        return (TotoOffer[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
