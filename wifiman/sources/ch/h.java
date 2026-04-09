package ch;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
final class h implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final h f34023a = new h();

    private h() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a10, Comparable b10) {
        AbstractC6492s.i(a10, "a");
        AbstractC6492s.i(b10, "b");
        return b10.compareTo(a10);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return g.f34022a;
    }
}
