package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2386f implements Comparator {
    public static final EnumC2386f INSTANCE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC2386f[] f20783a;

    public static EnumC2386f valueOf(String str) {
        return (EnumC2386f) Enum.valueOf(EnumC2386f.class, str);
    }

    public static EnumC2386f[] values() {
        return (EnumC2386f[]) f20783a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    static {
        EnumC2386f enumC2386f = new EnumC2386f("INSTANCE", 0);
        INSTANCE = enumC2386f;
        f20783a = new EnumC2386f[]{enumC2386f};
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return new C2385e(this, comparator);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function, Comparator comparator) {
        Objects.requireNonNull(function);
        Objects.requireNonNull(comparator);
        return AbstractC2383c.r(this, new C2385e(function, comparator));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function) {
        Objects.requireNonNull(function);
        return AbstractC2383c.r(this, new C2384d(function, 2));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return AbstractC2383c.r(this, new C2384d(toIntFunction, 0));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return AbstractC2383c.r(this, new C2384d(toLongFunction, 3));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return AbstractC2383c.r(this, new C2384d(toDoubleFunction, 1));
    }
}
