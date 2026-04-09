package j$.util;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2383c {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f20701a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f20702b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};

    public static /* synthetic */ Object q(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).putIfAbsent(obj, obj2) : Map.CC.$default$putIfAbsent(map, obj, obj2);
    }

    public static java.util.Optional m(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return java.util.Optional.of(optional.get());
        }
        return java.util.Optional.empty();
    }

    public static Optional i(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return Optional.of(optional.get());
        }
        return Optional.empty();
    }

    public static C2393m j(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (!optionalDouble.isPresent()) {
            return C2393m.f20807c;
        }
        return new C2393m(optionalDouble.getAsDouble());
    }

    public static C2395o l(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (!optionalLong.isPresent()) {
            return C2395o.f20813c;
        }
        return new C2395o(optionalLong.getAsLong());
    }

    public static C2394n k(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (!optionalInt.isPresent()) {
            return C2394n.f20810c;
        }
        return new C2394n(optionalInt.getAsInt());
    }

    public static OptionalDouble n(C2393m c2393m) {
        if (c2393m == null) {
            return null;
        }
        boolean z6 = c2393m.f20808a;
        if (!z6) {
            return OptionalDouble.empty();
        }
        if (z6) {
            return OptionalDouble.of(c2393m.f20809b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalInt o(C2394n c2394n) {
        if (c2394n == null) {
            return null;
        }
        boolean z6 = c2394n.f20811a;
        if (!z6) {
            return OptionalInt.empty();
        }
        if (z6) {
            return OptionalInt.of(c2394n.f20812b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalLong p(C2395o c2395o) {
        if (c2395o == null) {
            return null;
        }
        boolean z6 = c2395o.f20814a;
        if (!z6) {
            return OptionalLong.empty();
        }
        if (z6) {
            return OptionalLong.of(c2395o.f20815b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static C2385e r(EnumC2386f enumC2386f, Comparator comparator) {
        Objects.requireNonNull(comparator);
        return new C2385e(enumC2386f, comparator);
    }

    public static long d(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean e(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static boolean g(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return ofInt.tryAdvance((IntConsumer) consumer);
        }
        if (e0.f20782a) {
            e0.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return ofInt.tryAdvance((IntConsumer) new C2528t(consumer, 0));
    }

    public static void b(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            ofInt.forEachRemaining((IntConsumer) consumer);
        } else {
            if (e0.f20782a) {
                e0.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            ofInt.forEachRemaining((IntConsumer) new C2528t(consumer, 0));
        }
    }

    public static boolean h(K k6, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return k6.tryAdvance((LongConsumer) consumer);
        }
        if (e0.f20782a) {
            e0.a(k6.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return k6.tryAdvance((LongConsumer) new C2532x(consumer, 0));
    }

    public static void c(K k6, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            k6.forEachRemaining((LongConsumer) consumer);
        } else {
            if (e0.f20782a) {
                e0.a(k6.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            k6.forEachRemaining((LongConsumer) new C2532x(consumer, 0));
        }
    }

    public static boolean f(F f2, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return f2.tryAdvance((DoubleConsumer) consumer);
        }
        if (e0.f20782a) {
            e0.a(f2.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return f2.tryAdvance((DoubleConsumer) new C2396p(consumer, 0));
    }

    public static void a(F f2, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            f2.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (e0.f20782a) {
                e0.a(f2.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            f2.forEachRemaining((DoubleConsumer) new C2396p(consumer, 0));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
