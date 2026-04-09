package j$.util;

import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class r0 extends p1 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SortedSet f26450f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f26450f = sortedSet;
    }

    @Override // j$.util.p1, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f26450f.comparator();
    }
}
