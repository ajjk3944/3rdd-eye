package b9;

import java.util.Comparator;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4636a = new b();

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a10, Comparable b10) {
        p.e(a10, "a");
        p.e(b10, "b");
        return a10.compareTo(b10);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return c.f4637a;
    }
}
