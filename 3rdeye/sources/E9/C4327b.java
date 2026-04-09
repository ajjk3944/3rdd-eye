package e9;

import java.util.Comparator;
import kotlin.jvm.internal.l;

/* compiled from: Comparisons.kt */
/* renamed from: e9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4327b implements Comparator<Comparable<? super Object>> {

    /* renamed from: b, reason: collision with root package name */
    public static final C4327b f37776b = new C4327b();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> a10 = comparable;
        Comparable<? super Object> b10 = comparable2;
        l.f(a10, "a");
        l.f(b10, "b");
        return b10.compareTo(a10);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return C4326a.f37775b;
    }
}
