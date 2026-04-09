package j$.util;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public final class Spliterators {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f26279a = new n1();

    /* renamed from: b, reason: collision with root package name */
    public static final l1 f26280b = new l1();

    /* renamed from: c, reason: collision with root package name */
    public static final m1 f26281c = new m1();

    /* renamed from: d, reason: collision with root package name */
    public static final k1 f26282d = new k1();

    public static Spliterator.OfInt spliterator(int[] iArr, int i4, int i10, int i11) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i4, i10);
        return new o1(iArr, i4, i10, i11);
    }

    public static void a(int i4, int i10, int i11) {
        if (i10 <= i11) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(i10);
            }
            if (i11 > i4) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i10 + ") > fence(" + i11 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i4) {
        return new p1((java.util.Collection) Objects.requireNonNull(collection), i4);
    }
}
