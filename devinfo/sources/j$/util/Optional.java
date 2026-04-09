package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class Optional<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final Optional f26276b = new Optional();

    /* renamed from: a, reason: collision with root package name */
    public final Object f26277a;

    public Optional() {
        this.f26277a = null;
    }

    public static <T> Optional<T> empty() {
        return f26276b;
    }

    public Optional(Object obj) {
        this.f26277a = Objects.requireNonNull(obj);
    }

    public static <T> Optional<T> of(T t10) {
        return new Optional<>(t10);
    }

    public static <T> Optional<T> ofNullable(T t10) {
        return t10 == null ? empty() : of(t10);
    }

    public T get() {
        T t10 = (T) this.f26277a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isPresent() {
        return this.f26277a != null;
    }

    public T orElseGet(Supplier<? extends T> supplier) {
        T t10 = (T) this.f26277a;
        return t10 != null ? t10 : supplier.get();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) throws X {
        T t10 = (T) this.f26277a;
        if (t10 != null) {
            return t10;
        }
        throw supplier.get();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.f26277a, ((Optional) obj).f26277a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f26277a);
    }

    public final String toString() {
        Object obj = this.f26277a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
