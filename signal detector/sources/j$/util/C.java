package j$.util;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class C extends b0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SortedSet f20647f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f20647f = sortedSet;
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f20647f.comparator();
    }
}
