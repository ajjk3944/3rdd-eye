package ch;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class g implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final g f34022a = new g();

    private g() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a10, Comparable b10) {
        AbstractC6492s.i(a10, "a");
        AbstractC6492s.i(b10, "b");
        return a10.compareTo(b10);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return h.f34023a;
    }
}
