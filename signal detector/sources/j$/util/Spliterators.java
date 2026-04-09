package j$.util;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class Spliterators {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f20674a = new Z();

    /* renamed from: b, reason: collision with root package name */
    public static final X f20675b = new X();

    /* renamed from: c, reason: collision with root package name */
    public static final Y f20676c = new Y();

    /* renamed from: d, reason: collision with root package name */
    public static final W f20677d = new W();

    public static Spliterator.OfInt spliterator(int[] iArr, int i, int i3, int i6) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i, i3);
        return new a0(iArr, i, i3, i6);
    }

    public static void a(int i, int i3, int i6) {
        if (i3 <= i6) {
            if (i3 < 0) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            if (i6 > i) {
                throw new ArrayIndexOutOfBoundsException(i6);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i3 + ") > fence(" + i6 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        return new b0((java.util.Collection) Objects.requireNonNull(collection), i);
    }
}
