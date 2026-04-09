package j$.util;

import j$.util.stream.C2417d2;
import j$.util.stream.EnumC2413c3;
import j$.util.stream.Stream;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public interface Collection<E> {
    void forEach(Consumer<? super E> consumer);

    Stream<E> parallelStream();

    boolean removeIf(Predicate<? super E> predicate);

    Spliterator<E> spliterator();

    Stream<E> stream();

    <T> T[] toArray(IntFunction<T[]> intFunction);

    /* renamed from: j$.util.Collection$-EL, reason: invalid class name */
    public final /* synthetic */ class EL {
        public static /* synthetic */ boolean removeIf(java.util.Collection collection, Predicate predicate) {
            return collection instanceof Collection ? ((Collection) collection).removeIf(predicate) : CC.$default$removeIf(collection, predicate);
        }

        public static Spliterator b(java.util.Collection collection) {
            if (collection instanceof Collection) {
                return ((Collection) collection).spliterator();
            }
            if (collection instanceof LinkedHashSet) {
                return Spliterators.spliterator((LinkedHashSet) collection, 17);
            }
            if (collection instanceof SortedSet) {
                SortedSet sortedSet = (SortedSet) collection;
                return new C(sortedSet, sortedSet);
            }
            if (collection instanceof java.util.Set) {
                return Spliterators.spliterator((java.util.Set) collection, 1);
            }
            if (!(collection instanceof java.util.List)) {
                return Spliterators.spliterator(collection, 0);
            }
            java.util.List list = (java.util.List) collection;
            return list instanceof RandomAccess ? new C2381a(list) : Spliterators.spliterator(list, 16);
        }

        public static void a(java.util.Collection collection, Consumer consumer) {
            if (collection instanceof Collection) {
                ((Collection) collection).forEach(consumer);
                return;
            }
            Objects.requireNonNull(consumer);
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }
    }

    /* renamed from: j$.util.Collection$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$removeIf(java.util.Collection collection, Predicate predicate) throws IllegalAccessException, IllegalArgumentException {
            boolean zRemoveIf;
            if (DesugarCollections.f20649a.isInstance(collection)) {
                Field field = DesugarCollections.f20650b;
                if (field == null) {
                    try {
                        return EL.removeIf((java.util.Collection) DesugarCollections.f20651c.get(collection), predicate);
                    } catch (IllegalAccessException e6) {
                        throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e6);
                    }
                }
                try {
                    synchronized (field.get(collection)) {
                        zRemoveIf = EL.removeIf((java.util.Collection) DesugarCollections.f20651c.get(collection), predicate);
                    }
                    return zRemoveIf;
                } catch (IllegalAccessException e7) {
                    throw new Error("Runtime illegal access in synchronized collection removeIf.", e7);
                }
            }
            Objects.requireNonNull(predicate);
            Iterator<E> it = collection.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                if (predicate.test(it.next())) {
                    it.remove();
                    z6 = true;
                }
            }
            return z6;
        }

        public static Stream $default$stream(java.util.Collection collection) {
            Spliterator spliteratorB = EL.b(collection);
            Objects.requireNonNull(spliteratorB);
            return new C2417d2(spliteratorB, EnumC2413c3.c(spliteratorB), false);
        }

        public static Stream $default$parallelStream(java.util.Collection collection) {
            Spliterator spliteratorB = EL.b(collection);
            Objects.requireNonNull(spliteratorB);
            return new C2417d2(spliteratorB, EnumC2413c3.c(spliteratorB), true);
        }
    }
}
