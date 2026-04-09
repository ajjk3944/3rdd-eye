package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class Optional<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final Optional f20662b = new Optional();

    /* renamed from: a, reason: collision with root package name */
    public final Object f20663a;

    public Optional() {
        this.f20663a = null;
    }

    public static <T> Optional<T> empty() {
        return f20662b;
    }

    public Optional(Object obj) {
        this.f20663a = Objects.requireNonNull(obj);
    }

    public static <T> Optional<T> of(T t6) {
        return new Optional<>(t6);
    }

    public static <T> Optional<T> ofNullable(T t6) {
        return t6 == null ? empty() : of(t6);
    }

    public T get() {
        T t6 = (T) this.f20663a;
        if (t6 != null) {
            return t6;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isPresent() {
        return this.f20663a != null;
    }

    public T orElseGet(Supplier<? extends T> supplier) {
        T t6 = (T) this.f20663a;
        return t6 != null ? t6 : supplier.get();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) throws X {
        T t6 = (T) this.f20663a;
        if (t6 != null) {
            return t6;
        }
        throw supplier.get();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.f20663a, ((Optional) obj).f20663a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f20663a);
    }

    public final String toString() {
        Object obj = this.f20663a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
