package z9;

import i9.InterfaceC4463a;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DurationUnitJvm.kt */
/* renamed from: z9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5872c {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ EnumC5872c[] $VALUES;
    private final TimeUnit timeUnit;
    public static final EnumC5872c NANOSECONDS = new EnumC5872c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final EnumC5872c MICROSECONDS = new EnumC5872c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final EnumC5872c MILLISECONDS = new EnumC5872c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final EnumC5872c SECONDS = new EnumC5872c("SECONDS", 3, TimeUnit.SECONDS);
    public static final EnumC5872c MINUTES = new EnumC5872c("MINUTES", 4, TimeUnit.MINUTES);
    public static final EnumC5872c HOURS = new EnumC5872c("HOURS", 5, TimeUnit.HOURS);
    public static final EnumC5872c DAYS = new EnumC5872c("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ EnumC5872c[] $values() {
        return new EnumC5872c[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    static {
        EnumC5872c[] enumC5872cArr$values = $values();
        $VALUES = enumC5872cArr$values;
        $ENTRIES = com.google.gson.internal.c.l(enumC5872cArr$values);
    }

    private EnumC5872c(String str, int i, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static InterfaceC4463a<EnumC5872c> getEntries() {
        return $ENTRIES;
    }

    public static EnumC5872c valueOf(String str) {
        return (EnumC5872c) Enum.valueOf(EnumC5872c.class, str);
    }

    public static EnumC5872c[] values() {
        return (EnumC5872c[]) $VALUES.clone();
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
