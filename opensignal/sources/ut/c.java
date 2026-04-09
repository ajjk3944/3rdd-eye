package ut;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    private final TimeUnit timeUnit;
    public static final c NANOSECONDS = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final c MICROSECONDS = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final c MILLISECONDS = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final c SECONDS = new c("SECONDS", 3, TimeUnit.SECONDS);
    public static final c MINUTES = new c("MINUTES", 4, TimeUnit.MINUTES);
    public static final c HOURS = new c("HOURS", 5, TimeUnit.HOURS);
    public static final c DAYS = new c("DAYS", 6, TimeUnit.DAYS);

    private static final /* synthetic */ c[] $values() {
        return new c[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    static {
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = a.a.j(cVarArr$values);
    }

    private c(String str, int i10, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
