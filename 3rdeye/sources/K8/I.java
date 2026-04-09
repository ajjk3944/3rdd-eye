package k8;

import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Billing.kt */
/* loaded from: classes3.dex */
public final class I {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ I[] $VALUES;
    private final String value;
    public static final I UNKNOWN = new I("UNKNOWN", 0, "");
    public static final I TRIAL = new I("TRIAL", 1, "trial");
    public static final I TRIAL_CANCELLED = new I("TRIAL_CANCELLED", 2, "trial_cancelled");
    public static final I SUBSCRIPTION_CANCELLED = new I("SUBSCRIPTION_CANCELLED", 3, "subscription_cancelled");
    public static final I PAID = new I("PAID", 4, "paid");

    private static final /* synthetic */ I[] $values() {
        return new I[]{UNKNOWN, TRIAL, TRIAL_CANCELLED, SUBSCRIPTION_CANCELLED, PAID};
    }

    static {
        I[] iArr$values = $values();
        $VALUES = iArr$values;
        $ENTRIES = com.google.gson.internal.c.l(iArr$values);
    }

    private I(String str, int i, String str2) {
        this.value = str2;
    }

    public static InterfaceC4463a<I> getEntries() {
        return $ENTRIES;
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
